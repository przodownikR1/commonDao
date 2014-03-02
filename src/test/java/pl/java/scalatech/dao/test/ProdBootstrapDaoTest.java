package pl.java.scalatech.dao.test;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Sławomir Borowiec
 *         Module name : commonDao
 *         Creating time : 2 mar 2014 14:34:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:commonDao.xml" })
@DirtiesContext
@ActiveProfiles(value = DevBootstrapDaoTest.CONFIG_PROD)
public class ProdBootstrapDaoTest extends ConfigDB{
    @Test
    public void shouldContextStart() {
        // given context
        // when try to context load
        String dialect = (String) entityManager.getEntityManagerFactory().getProperties().get(DIALECT);
        // then
        assertThat(dialect).contains(CONFIG_PROD_DIALECT);

    }
}
