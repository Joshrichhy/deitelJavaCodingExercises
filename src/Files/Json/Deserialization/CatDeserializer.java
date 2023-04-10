package Files.Json.Deserialization;

import Files.Json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static Cat deserializeJsonToCat(String Json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(Json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
