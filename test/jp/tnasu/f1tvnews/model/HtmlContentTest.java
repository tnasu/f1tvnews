package jp.tnasu.f1tvnews.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HtmlContentTest extends AppEngineTestCase {

    private HtmlContent model = new HtmlContent();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
