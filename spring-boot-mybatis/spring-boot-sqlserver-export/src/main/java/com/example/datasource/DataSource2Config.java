package com.example.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by summer on 2016/11/25.
 */
@Configuration
@MapperScan(basePackages = "com.example.mapper.loanmanagementfilter", sqlSessionTemplateRef  = "SqlSessionTemplate2")
public class DataSource2Config {

    @Bean(name = "DataSource2")
    @ConfigurationProperties(prefix = "spring.datasource.loanmanagementfilter")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "SqlSessionFactory2")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("DataSource2") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/loanmanagementfilter/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "TransactionManager2")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("DataSource2") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "SqlSessionTemplate2")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("SqlSessionFactory2") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "JdbcTemplate2")
    public JdbcTemplate testJdbcTemplate(@Qualifier("DataSource2") DataSource dataSource) throws Exception {
        return new JdbcTemplate(dataSource);
    }
}
