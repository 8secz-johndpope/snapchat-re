package com.snapchat.client;

public final class LoadAllLibraries {
    public static void run() {
        System.loadLibrary("c++_shared");
        System.loadLibrary("protobuf");
        System.loadLibrary("client");
    }
}
