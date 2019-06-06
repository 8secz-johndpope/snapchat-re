package com.mapbox.services.commons.utils;

public class MapboxUtils {
    public static boolean isAccessTokenValid(String str) {
        return TextUtils.isEmpty(str) ? false : str.startsWith("pk.") || str.startsWith("sk.") || str.startsWith("tk.");
    }
}
