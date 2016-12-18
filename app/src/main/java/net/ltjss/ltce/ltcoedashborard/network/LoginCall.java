package net.ltjss.ltce.ltcoedashborard.network;

import android.annotation.TargetApi;
import android.os.Build;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by a0_ on 18/12/16.
 */
public class LoginCall {

    OkHttpClient client;
    String url;
    ArrayList<String> urlParams;

    LoginCall(String url, ArrayList<String> urlParams){
        client = new OkHttpClient();
        this.url = url;
        this.urlParams = urlParams;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    String run()throws IOException{
        Request mRequest = new Request.Builder()
                .url(this.url)
                .build();

        try (Response mRes = client.newCall(mRequest).execute()){
            return mRes.body().string();
        }
    }

    public String MakeConn(){
        try {
            String response = this.run();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "INVALID";
    }
}
