package jp.tnasu.f1tvnews.model._admin.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AdminGoogleCalendarTest extends AppEngineTestCase {

    private AdminGoogleCalendar model = new AdminGoogleCalendar();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
