package com.eanyatonic.cctvViewer;

//public class TVUrls {
//    public static String[] liveUrls = {
//            "reload",
//            "https://www.yangshipin.cn/?a=0#/tv/home?pid=600001859",
//            "https://tv.cctv.com/live/cctv1/",
//            //"https://lizhiv.netlify.app/v.html?v=a/1",
//            "https://tv.cctv.com/live/cctv2/",
//            "https://tv.cctv.com/live/cctv3/",
//            "https://tv.cctv.com/live/cctv4/",
//            "https://tv.cctv.com/live/cctv5/",
//            "https://tv.cctv.com/live/cctv6/",
//            "https://tv.cctv.com/live/cctv7/",
//            "https://tv.cctv.com/live/cctv8/",
//            "https://tv.cctv.com/live/cctvjilu",
//            "https://tv.cctv.com/live/cctv10/",
//            "https://tv.cctv.com/live/cctv11/",
//            "https://tv.cctv.com/live/cctv12/",
//            "https://tv.cctv.com/live/cctv13/",
//            "https://tv.cctv.com/live/cctvchild",
//            "https://tv.cctv.com/live/cctv15/",
//            "https://tv.cctv.com/live/cctv16/",
//            "https://tv.cctv.com/live/cctv17/",
//            "https://tv.cctv.com/live/cctv5plus/",
//            "https://tv.cctv.com/live/cctveurope",
//            "https://tv.cctv.com/live/cctvamerica/",
//            "https://www.yangshipin.cn/?a=1#/tv/home?pid=600002309",
//            "https://www.yangshipin.cn/?a=2#/tv/home?pid=600002521",
//            "https://www.yangshipin.cn/?a=3#/tv/home?pid=600002483",
//            "https://www.yangshipin.cn/?a=4#/tv/home?pid=600002520",
//            "https://www.yangshipin.cn/?a=5#/tv/home?pid=600002475",
//            "https://www.yangshipin.cn/?a=6#/tv/home?pid=600002508",
//            "https://www.yangshipin.cn/?a=7#/tv/home?pid=600002485",
//            "https://www.yangshipin.cn/?a=8#/tv/home?pid=600002509",
//            "https://www.yangshipin.cn/?a=9#/tv/home?pid=600002498",
//            "https://www.yangshipin.cn/?a=10#/tv/home?pid=600002506",
//            "https://www.yangshipin.cn/?a=11#/tv/home?pid=600002531",
//            "https://www.yangshipin.cn/?a=12#/tv/home?pid=600002481",
//            "https://www.yangshipin.cn/?a=13#/tv/home?pid=600002516",
//            "https://www.yangshipin.cn/?a=14#/tv/home?pid=600002525",
//            "https://www.yangshipin.cn/?a=15#/tv/home?pid=600002484",
//            "https://www.yangshipin.cn/?a=16#/tv/home?pid=600002490",
//            "https://www.yangshipin.cn/?a=17#/tv/home?pid=600002503",
//            "https://www.yangshipin.cn/?a=18#/tv/home?pid=600002505",
//            "https://www.yangshipin.cn/?a=19#/tv/home?pid=600002532",
//            "https://www.yangshipin.cn/?a=20#/tv/home?pid=600002493",
//            "https://www.yangshipin.cn/?a=21#/tv/home?pid=600002513",
//    };
//
//    public static String[] channelNames = {
//            "reload",
//            "1 CCTV-1 综合央视频",
//            "1 CCTV-1 综合",
//            "2 CCTV-2 财经",
//            "3 CCTV-3 综艺",
//            "4 CCTV-4 中文国际",
//            "5 CCTV-5 体育",
//            "6 CCTV-6 电影",
//            "7 CCTV-7 军事农业",
//            "8 CCTV-8 电视剧",
//            "9 CCTV-9 纪录",
//            "10 CCTV-10 科教",
//            "11 CCTV-11 戏曲",
//            "12 CCTV-12 社会与法",
//            "13 CCTV-13 新闻",
//            "14 CCTV-14 少儿",
//            "15 CCTV-15 音乐",
//            "16 CCTV-16 奥林匹克",
//            "17 CCTV-17 农业农村",
//            "18 CCTV-5+ 体育赛事",
//            "19 CCTV Europe",
//            "20 CCTV America",
//            "21 北京卫视",
//            "22 江苏卫视",
//            "23 东方卫视",
//            "24 浙江卫视",
//            "25 湖南卫视",
//            "26 湖北卫视",
//            "27 广东卫视",
//            "28 广西卫视",
//            "29 黑龙江卫视",
//            "30 海南卫视",
//            "31 重庆卫视",
//            "32 深圳卫视",
//            "33 四川卫视",
//            "34 河南卫视",
//            "35 福建东南卫视",
//            "36 贵州卫视",
//            "37 江西卫视",
//            "38 辽宁卫视",
//            "39 安徽卫视",
//            "40 河北卫视",
//            "41 山东卫视",
//    };
//}


import android.content.Context;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;


public class TVUrls {
    public static String[] liveUrls = {
            "reload",
            "https://www.yangshipin.cn/?a=0#/tv/home?pid=600001859",
    };

    public static String[] channelNames = {
            "reload",
            "1 CCTV-1 综合央视频",
    };
    public static void LoadTvUrlJson(Context context)
    {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(context);
        String url ="https://gitee.com/CJyoungNeverGivesUp/the-source-of-tivi/raw/master/TVUrls.json";

        // Request a byte[] response from the provided URL.
        ByteArrayRequest byteArrayRequest = new ByteArrayRequest(Request.Method.GET, url,
                new Response.Listener<byte[]>() {
                    @Override
                    public void onResponse(byte[] response) {
                        try {
                            // Convert byte[] to String with UTF-8 encoding
                            String jsonString = new String(response, "UTF-8");

                            // Parse the JSON response with Gson
                            Gson gson = new Gson();
                            Type type = new TypeToken<Map<String, String>>(){}.getType();
                            Map<String, String> map = gson.fromJson(jsonString, type);

                            // Populate the arrays
                            channelNames = map.values().toArray(new String[0]);
                            liveUrls = map.keySet().toArray(new String[0]);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Handle error
            }
        });

        // Add the request to the RequestQueue.
        queue.add(byteArrayRequest);
    }
}
