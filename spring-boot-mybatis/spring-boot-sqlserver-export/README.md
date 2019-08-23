**简介：**
大数据对接开发是针对资产管理系统生产数据导出生成指定格式文件，并且上传至大数据对接指定的文件服务器（FTP上传）
**开发环境：**
jdk1.8 ,
**开发工具：**
spring boot + mybatis,
**项目配置文件：**
application.properties 需要配置文件导出的数据库地址，用户名，密码，表数据导出临时目录，ftp文件服务器地址，对应的用户名，密码，路径,
**功能：**
生成数据文件并压缩，生成数据文件，上传至指定服务器，
**部署：**
Window:打开cmd命令窗口，进入jar文件目录运行java –jar spring-boot-sqlserver-export-2.0.0.jar
linux:：直接进入jar文件目录运行java –jar spring-boot-sqlserver-export-2.0.0.jar
**数据表：****LoanManagement库19张表**
Loan,CollateralBill,CollateralCar,CollateralHouse,CollateralhouseRelation,CollateralInsurance,CollateralReceivables,
CompanyBasic,LoanConnonBorrower,LoanCompany,LoanExtension,LoanUser,LoanUserRelationship,ProjectBasic,ProjectCounterpartyInfo,
ProjectCreditCompany,ProjectCreditPerson,RepayPlan,RepayResult
