package jp.tnasu.f1tvnews.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HtmlDocumentTest extends AppEngineTestCase {

    private HtmlDocument model = new HtmlDocument();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
