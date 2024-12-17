package dev.lpsmods.morefood.client.toque;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.spongepowered.include.com.google.gson.JsonParseException;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class ToqueReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JsonObject fromUrl(String url) throws IOException, JsonParseException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            JsonParser jp = new JsonParser(); //from gson
            JsonElement jsonElement = jp.parse(rd);
            return (JsonObject)jsonElement;
        } finally {
            is.close();
        }
    }
}
