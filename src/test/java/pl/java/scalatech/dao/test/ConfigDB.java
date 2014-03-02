package pl.java.scalatech.dao.test;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.Map.Entry;

import javax.persistence.EntityManager;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @author Sławomir Borowiec 
 * Module name : commonDao
 * Creating time :  2 mar 2014 14:31:14
 
 */
@Slf4j
public abstract class ConfigDB {
    protected final static String CONFIG_DEV = "dev";
    protected final static String CONFIG_DEV_SQL = "dev";
    protected final static String CONFIG_PROD = "prod";
    protected final static String TEST = "test";
    protected final static String CONFIG_DEV_DIALECT = "MySQL5InnoDBDialect";
    
    protected final static String CONFIG_DEV_SQL_DIALECT = "MySQL5InnoDBDialect";
    protected final static String CONFIG_PROD_DIALECT = "PostgreSQL9Dialect";
    protected final static String TEST_DIALECT = "HSQLDialect";
    
    protected final static String HBM2DDL = "hibernate.hbm2ddl.auto";// update
    protected final static String SHOW_SQL = "hibernate.show_sql";// true
    protected final static String CONNECTION_CHARSET = "hibernate.connection.charSet";// UTF-8
    protected final static String BATCH_FETCH_SIZE = "hibernate.default_batch_fetch_size";// 25
    protected final static String QUERY_CACHE = "hibernate.cache.use_query_cache";// true
    protected final static String SECOND_LEVEL_CACHE = "hibernate.cache.use_second_level_cache";// true
    protected final static String PERSISTENCE_UNIT_NAME = "hibernate.ejb.persistenceUnitName";// unitPU
    protected final static String REGION_FACTORY = "hibernate.cache.region.factory_class";// org.hibernate.cache.ehcache.EhCacheRegionFactory
    protected final static String DIALECT = "hibernate.dialect";// org.hibernate.dialect.HSQLDialect
    
    protected final static String EXPECTED_BEANS[] = new String[] { "entityManagerFactory", "jpaProperties", "transactionManager" };
    @Autowired
    protected ApplicationContext applicationContext;

    @Autowired
    protected EntityManager entityManager;
    
    @Test
    public void shouldBeanLoaded() {
        String[] names = applicationContext.getBeanDefinitionNames();
        // then
        log.info("+++    loaded beans  {}", Arrays.toString(names));
        assertThat(names).contains(EXPECTED_BEANS);
        
        for (Entry<String, Object> entry : entityManager.getEntityManagerFactory().getProperties().entrySet()) {
            log.debug("+++  key : {}  - value : {}", entry.getKey(), entry.getValue());
        }
    }
    
}
