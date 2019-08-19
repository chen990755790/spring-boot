package com.example.procedure.loanmanagement;

import com.example.table.DataColumnCollection;
import com.example.table.DataRow;
import com.example.table.DataSet;
import com.example.table.DataTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.Map;

@Service
public class LoanManagementService {

    private final Logger logger = LoggerFactory.getLogger(LoanManagementService.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate1;

    public DataTable dataTable(String dataBaseName, String procName, Map<String, Object> params) {
        DataTable dt = (DataTable) jdbcTemplate.execute(new CallableStatementCreator() {
            @Override
            public CallableStatement createCallableStatement(Connection connection) throws SQLException {
                CallableStatement callableStatement = connection.prepareCall(getCallString(procName, params.size()));
                for (String key : params.keySet()) {
                    callableStatement.setObject(key, params.get(key));
                }
                return callableStatement;
            }
        }, new CallableStatementCallback<Object>() {
            @Override
            public DataTable doInCallableStatement(CallableStatement callableStatement) throws SQLException, DataAccessException {
                boolean hasResult = callableStatement.execute();
                DataTable dt = new DataTable();
                while (hasResult) {
                    ResultSet resultSet = callableStatement.getResultSet();
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    while (resultSet.next()) {
                        DataRow dataRow = dt.newRow();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnName(i);
                            dt.getColumns().addColumn(columnName, metaData.getColumnType(i));
                            String columnValue = resultSet.getString(i);
                            dataRow.setValue(columnName, columnValue);
                        }
                    }
                    hasResult = callableStatement.getMoreResults();
                }
                return dt;
            }
        });
        return dt;
    }

    private String getCallString(String proc, int paramSize) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ call ").append(proc);
        sb.append("(");
        for (int i = 0; i < paramSize; i++) {
            sb.append("?").append(",");
        }
        if (paramSize > 0)
            sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        sb.append("}");
        return sb.toString();
    }

    public DataSet dataSet(String dataBaseName, String procName, Map<String, Object> params) {
        DataSet dt = (DataSet) jdbcTemplate.execute(new CallableStatementCreator() {
            @Override
            public CallableStatement createCallableStatement(Connection connection) throws SQLException {
                CallableStatement callableStatement = connection.prepareCall(getCallString(procName, params.size()));
                for (String key : params.keySet()) {
                    callableStatement.setObject(key, params.get(key));
                }
                return callableStatement;
            }
        }, new CallableStatementCallback<Object>() {
            @Override
            public DataSet doInCallableStatement(CallableStatement callableStatement) throws SQLException, DataAccessException {
                boolean hasResult = callableStatement.execute();
                DataSet ds = new DataSet();
                DataTable dt =null;
                while (hasResult) {
                    ResultSet resultSet = callableStatement.getResultSet();
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    DataColumnCollection columnCollection = new DataColumnCollection();
                    for(int i=1;i<=columnCount;i++) {
                        String columnName = metaData.getColumnName(i);
                        columnCollection.addColumn(columnName, metaData.getColumnType(i));
                    }
                    if (!ds.getTableList().contains(columnCollection.getColumns())) {
                        dt = new DataTable();
                        dt.setColumns(columnCollection);
                        ds.addTable(dt);
                    }
                    while (resultSet.next()) {
                        DataRow dataRow = dt.newRow();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnName(i);
                            String columnValue = resultSet.getString(i);
                            dataRow.setValue(columnName, columnValue);
                        }
                    }
                    hasResult = callableStatement.getMoreResults();
                }
                return ds;
            }
        });
        return dt;
    }
}

