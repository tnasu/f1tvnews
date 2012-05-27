package jp.tnasu.f1tvnews.model.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalendarReminderTest extends AppEngineTestCase {

    private CalendarReminder model = new CalendarReminder();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
