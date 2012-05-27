package jp.tnasu.f1tvnews.model.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalendarTest extends AppEngineTestCase {

    private Calendar model = new Calendar();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
