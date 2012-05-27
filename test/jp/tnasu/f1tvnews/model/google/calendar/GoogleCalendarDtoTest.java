package jp.tnasu.f1tvnews.model.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GoogleCalendarDtoTest extends AppEngineTestCase {

    private GoogleCalendarDto model = new GoogleCalendarDto();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
