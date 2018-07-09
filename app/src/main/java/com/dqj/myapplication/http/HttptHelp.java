package com.dqj.myapplication.http;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


/**
 * Created by 83961 on 2018/3/24.
 */

public class HttptHelp {
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    Context context;
    String ip="http://baidu.com";
    public void getme(){
        RequestQueue Rq=Volley.newRequestQueue(context);
        StringRequest Sr=new StringRequest(ip, new Response.Listener<String>() {
            /**
             * Called when a response is received.
             *
             * @param response
             */
            @Override
            public void onResponse(String response) {
Log.v("*************",response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
Log.e(")))))))))))))",error.getMessage().toString());
            }
        });



    Rq.add(Sr);
    }
}
