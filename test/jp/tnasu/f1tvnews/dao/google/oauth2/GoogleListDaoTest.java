package jp.tnasu.f1tvnews.dao.google.oauth2;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GoogleListDaoTest extends AppEngineTestCase {

    private GoogleListDao dao = new GoogleListDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
