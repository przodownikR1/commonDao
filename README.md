commonDao
=========

common dao for all projects. Write once run everywhere


jdbc.driverClassName=your db driver
jdbc.url=your url do datasource
jdbc.username=your user
jdbc.password=your password



hibernate.dialect=your db dialect
hibernate.generateDdl=Do you want generate schema ?(true/false)
hibernate.showSql=Do you want show sql queries ?(true/false)
hibernate.statistics=Do you want show hibernate statistics ?
hibernate.hbm2ddl.auto=Do you want dynamically update db , create-drop db , or only validate schema ? (validate | update | create | create-drop )
db.spyDriver=com.p6spy.engine.spy.P6SpyDriver


jdbc.idleConnectionTestPeriod=60
jdbc.idleMaxAge=240
jdbc.maxConnectionsPerPartition=30
jdbc.minConnectionsPerPartition=10
jdbc.partitionCount=3
jdbc.acquireIncrement=5
jdbc.statementsCacheSize=100
jdbc.releaseHelperThread=3

 
jpa.repository.package=org.java.scalatech.repository
