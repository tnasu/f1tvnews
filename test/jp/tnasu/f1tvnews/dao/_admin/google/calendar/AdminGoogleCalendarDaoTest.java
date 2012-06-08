package jp.tnasu.f1tvnews.dao._admin.google.calendar;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slim3.tester.AppEngineTestCase;

public class AdminGoogleCalendarDaoTest extends AppEngineTestCase {

    private AdminGoogleCalendarDao dao = new AdminGoogleCalendarDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
