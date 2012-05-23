package jp.tnasu.f1tvnews.controller.google.oauth2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slim3.tester.ControllerTestCase;

public class AuthControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/google/oauth2/auth");
        AuthController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/google/oauth2/auth.jsp"));
    }
}
