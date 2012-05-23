package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SaveControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/_admin/google/calendar/save");
        SaveController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
