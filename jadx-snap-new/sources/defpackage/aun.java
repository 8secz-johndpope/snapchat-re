package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aun */
public final class aun {
    public static final Map<String, String> a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("mkv", "video/x-matroska");
        a = Collections.unmodifiableMap(hashMap);
    }
}
