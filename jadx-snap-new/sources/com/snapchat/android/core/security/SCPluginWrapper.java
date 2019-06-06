package com.snapchat.android.core.security;

import android.os.SystemClock;
import android.support.annotation.Keep;
import android.util.Pair;
import com.google.common.base.Strings;
import defpackage.abki;
import defpackage.abkk;
import defpackage.ajwy;
import java.util.Map;
import java.util.Map.Entry;

public final class SCPluginWrapper {
    @Keep
    private static final byte[] DATA = new byte[]{(byte) 41, (byte) 82, (byte) -31, (byte) 109, (byte) 9, (byte) 85, (byte) 95, (byte) 77, (byte) 57, (byte) 121, (byte) -53, Byte.MAX_VALUE, (byte) 59, (byte) -70, (byte) -118, (byte) -27, (byte) 109, (byte) 15, (byte) -73, (byte) 73, (byte) -21, (byte) 12, (byte) -97, (byte) -22, (byte) -87, Byte.MAX_VALUE, (byte) -11, (byte) -59, (byte) -84, (byte) 88, (byte) 4, (byte) 67, (byte) 68, (byte) 126, (byte) 48, (byte) -99, (byte) -73, (byte) 48, (byte) -53, (byte) -87, (byte) -17, (byte) -62, (byte) -100, (byte) 86, (byte) -16, (byte) -116, (byte) -68, (byte) -87, (byte) 8, (byte) 83, (byte) -99, (byte) -58, (byte) 105, (byte) -4, (byte) 48, (byte) -54, (byte) -60, (byte) 29, (byte) 106, (byte) -99, (byte) 54, (byte) 94, (byte) 32, (byte) 72};
    private static final Object c = new Object();
    private static volatile Boolean d = null;
    private final ajwy<abki> a;
    private final ajwy<abkk> b;

    public SCPluginWrapper(ajwy<abki> ajwy, ajwy<abkk> ajwy2) {
        this.a = ajwy;
        this.b = ajwy2;
        a();
    }

    private static Pair<String[], String[]> a(Map<String, String> map) {
        int size = map.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = Strings.nullToEmpty((String) entry.getValue());
            i++;
        }
        return Pair.create(strArr, strArr2);
    }

    public static boolean a() {
        Boolean bool = d;
        if (bool == null) {
            synchronized (c) {
                bool = d;
                if (bool == null) {
                    bool = Boolean.valueOf(b());
                    d = bool;
                }
            }
        }
        return bool.booleanValue();
    }

    private static boolean b() {
        if (d != null) {
            return d.booleanValue();
        }
        try {
            System.loadLibrary("scplugin");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public static native String getNonce(String str);

    private static native String signRequest(String[] strArr, String[] strArr2, String str, byte[] bArr);

    public static native String signToken(String str);

    public final String a(Map<String, String> map, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a()) {
            return null;
        }
        Pair a = a(map);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        String signRequest = signRequest((String[]) a.first, (String[]) a.second, str, ((abkk) this.b.get()).a);
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        ajwy ajwy = this.a;
        if (ajwy != null) {
            ((abki) ajwy.get()).a(elapsedRealtime3 - elapsedRealtime, elapsedRealtime3 - elapsedRealtime2);
        }
        return signRequest;
    }
}
