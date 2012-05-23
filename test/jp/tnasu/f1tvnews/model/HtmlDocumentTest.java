package jp.tnasu.f1tvnews.model;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slim3.tester.AppEngineTestCase;

public class HtmlDocumentTest extends AppEngineTestCase {

    private HtmlDocument model = new HtmlDocument();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
