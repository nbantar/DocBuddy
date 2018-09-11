package docbuddy.users.service.users.util;

import docbuddy.users.exceptions.JacksonUtilityException;
import docbuddy.users.util.JacksonUtility;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JacksonUtilityTest {
    private static Map<String, Object> TEST_MAP;
    private static String TEST_STRING = "{\"testKey1\":\"testValue1\"}";

    @BeforeClass
    public static void init() {
        TEST_MAP = new HashMap<>();
    }

    @Test
    public void getJsonStringFromMap_nullMap() throws JacksonUtilityException {
        String result = JacksonUtility.getJsonStringFromMap(null);

        Assert.assertEquals("", result);
    }

    @Test
    public void getJsonStringFromMap_emptyMap() throws JacksonUtilityException {
        String result = JacksonUtility.getJsonStringFromMap(TEST_MAP);

        Assert.assertEquals("", result);
    }

    @Test
    public void getJsonStringFromMap_validMap() throws JacksonUtilityException {
        TEST_MAP.put("testKey1", "testValue1");

        String result = JacksonUtility.getJsonStringFromMap(TEST_MAP);

        Assert.assertEquals(TEST_STRING, result);
    }

    @Test
    public void getJsonStringAsMap_nulString() throws JacksonUtilityException {
        Map<String, Object> result = JacksonUtility.getJsonStringAsMap(null);

        Assert.assertEquals(new HashMap<>(), result);
    }

    @Test
    public void getJsonStringAsMap_emptyString() throws JacksonUtilityException {
        Map<String, Object> result = JacksonUtility.getJsonStringAsMap("");

        Assert.assertEquals(new HashMap<>(), result);
    }

    @Test
    public void getJsonStringAsMap_validString() throws JacksonUtilityException {
        TEST_MAP.put("testKey1", "testValue1");
        Map<String, Object> result = JacksonUtility.getJsonStringAsMap(TEST_STRING);

        Assert.assertEquals(TEST_MAP, result);
    }
}
