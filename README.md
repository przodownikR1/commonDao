commonDao
=========

common dao for all projects. Write once run everywhere


jdbc.driverClassName=your db driver
jdbc.url=your url do datasource
jdbc.username=your user
jdbc.password=your password
#dialect + dll + sql_log setting

#hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
#hibernate.dialect=org.hibernate.dialect.PostgreSQL9Dialect

hibernate.dialect=your db dialect
hibernate.generateDdl=Do you want generate schema ?(true/false)
hibernate.showSql=Do you want show sql queries ?(true/false)
hibernate.statistics=Do you want show hibernate statistics ?
hibernate.hbm2ddl.auto=Do you want dynamically update db , create-drop db , or only validate schema ? (validate | update | create | create-drop )
db.spyDriver=com.p6spy.engine.spy.P6SpyDriver

#datasource.config  set according to your needs
jdbc.idleConnectionTestPeriod=60
jdbc.idleMaxAge=240
jdbc.maxConnectionsPerPartition=30
jdbc.minConnectionsPerPartition=10
jdbc.partitionCount=3
jdbc.acquireIncrement=5
jdbc.statementsCacheSize=100
jdbc.releaseHelperThread=3

#jpa repository location tell spring where is package location to your repository definition (if you use spring data jpa ) 
jpa.repository.package=org.java.scalatech.repository