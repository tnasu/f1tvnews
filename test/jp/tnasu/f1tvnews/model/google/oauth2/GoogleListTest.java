package jp.tnasu.f1tvnews.model.google.oauth2;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GoogleListTest extends AppEngineTestCase {

    private GoogleList model = new GoogleList();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
