package qa.guru.testjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qa.guru.model.Samples;

import java.io.IOException;
import java.io.InputStream;

public class TestJsonFile {

    ClassLoader classLoader = TestJsonFile.class.getClassLoader();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testJsonFileReading() throws IOException {
        InputStream stream = classLoader.getResourceAsStream("samplektm.json");
        Samples samples = objectMapper.readValue(stream, Samples.class);

        Assertions.assertEquals("KTM", samples.getMot());
        Assertions.assertEquals("Turenduro", samples.getType());
        Assertions.assertEquals("890 Adventure", samples.getSeries());
        Assertions.assertEquals("105", samples.getItems().get(0).getPower());
        Assertions.assertEquals("890", samples.getItems().get(0).getEngineCapacity());
    }
}
