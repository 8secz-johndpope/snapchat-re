package com.mapbox.mapboxsdk.http;

public interface RequestMaker {
    void cancel(String str);

    String request(String str, String str2, String str3, String str4, RequestReceiver requestReceiver);
}
