package jp.tnasu.f1tvnews.dao.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GoogleCalendarDtoMapDaoTest extends AppEngineTestCase {

    private GoogleCalendarDtoMapDao dao = new GoogleCalendarDtoMapDao();

    @Test
    public void test() throws Exception {
        assertThat(dao, is(notNullValue()));
    }
}
