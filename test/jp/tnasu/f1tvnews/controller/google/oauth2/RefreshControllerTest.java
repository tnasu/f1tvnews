package jp.tnasu.f1tvnews.controller.google.oauth2;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RefreshControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/google/oauth2/refresh");
        RefreshController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/google/oauth2/refresh.jsp"));
    }
}
