package API;

import Utils.Utilities;

public class APIClass {
    public static String API(String Name, String Job) {
        String body = "{\n" +
                "    \"name\": "+Name+",\n" +
                "    \"job\": "+Job+"\n" +
                "}";
        return body;
    }
}
