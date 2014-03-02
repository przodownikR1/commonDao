package pl.java.scalatech.dao.test;

import static org.fest.assertions.Assertions.assertThat;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Sławomir Borowiec 
 * Module name : commonDao
 * Creating time :  2 mar 2014 14:34:20
 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:commonDao.xml" })
@DirtiesContext
@ActiveProfiles(value = DevBootstrapDaoTest.CONFIG_DEV_SQL)
public class DevSqlBootstrapDaoTest extends ConfigDB{
    @Test
    public void shouldContextStart()  {
        // given context
        // when get dialect
        String dialect = (String) entityManager.getEntityManagerFactory().getProperties().get(DIALECT);
        //then
        assertThat(dialect).contains(CONFIG_DEV_SQL_DIALECT);
    }
}
