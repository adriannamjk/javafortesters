package gson;

import com.google.gson.Gson;
import json.Obiekt;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SampleOfGson {

    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/file.json";
        String jsonResponse = convertJsonFileToString(path);

        Gson gson = new Gson();
        Obiekt newObject = gson.fromJson(jsonResponse, Obiekt.class);
        System.out.println(newObject);

        String path2 = "src/main/resources/Ada.json";
        String jsonResponse2 = convertJsonFileToString(path2);

        Gson gson2 = new Gson();
        Relation[] newObject2 = gson.fromJson(jsonResponse2, Relation[].class);
        System.out.println(newObject2);

        newObject2[0].getTargetNode().getId();


    }

    public static String convertJsonFileToString(String filepath) throws IOException {
        InputStream is = new FileInputStream(filepath);
        String content = IOUtils.toString(is);
        return content;
    }


}
