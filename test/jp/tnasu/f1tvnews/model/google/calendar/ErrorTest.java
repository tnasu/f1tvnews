package jp.tnasu.f1tvnews.model.google.calendar;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ErrorTest extends AppEngineTestCase {

    private Error model = new Error();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
