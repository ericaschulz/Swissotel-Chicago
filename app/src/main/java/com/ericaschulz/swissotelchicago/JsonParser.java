package com.ericaschulz.swissotelchicago;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ericaschulz on 8/11/16.
 */
public class JsonParser {
    private static Response response;

    public static JSONObject getSwissotelChicagoDetails(String ChicagoDetails) {
        try {
            OkHttpClient client = new OkHttpClient();
            String ChicagoDetails_url = "http://apistage.swissotel.com/hotels/chicago/";
            Request request = new Request.Builder()
                    .url(ChicagoDetails_url).build();

            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
