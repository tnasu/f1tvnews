package jp.tnasu.f1tvnews.dao;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HtmlDocumentDaoTest extends AppEngineTestCase {

    private HtmlDocumentDao dao = new HtmlDocumentDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
