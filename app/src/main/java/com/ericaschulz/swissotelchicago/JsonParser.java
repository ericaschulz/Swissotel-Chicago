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

    public JSONObject getDetails() {
        try {
            OkHttpClient client = new OkHttpClient();
            String Details_url = "http://apistage.swissotel.com/hotels/chicago/explore-hotel/local-guide/";
            Request request = new Request.Builder()
                    .url(Details_url).build();

            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public JSONObject getPhotos() {
//
//        try {
//            OkHttpClient client = new OkHttpClient();
//            String Gallery_url = "http://apistage.swissotel.com/hotels/chicago/media/photos/";
//            Request request = new Request.Builder()
//                    .url(Gallery_url).build();
//
//            response = client.newCall(request).execute();
//            return new JSONObject((response.body().string()));
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }




}
