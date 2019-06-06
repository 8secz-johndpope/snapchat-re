package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: adha */
public final class adha {
    private static String[] b = new String[]{"setup-ms", "muxer-ms", "video-ext-ms", "audio-ext-ms", "video-dec-ms", "audio-dec-ms", "video-enc-ms", "audio-enc-ms", "video-rend-ms", "video-buf-rend-ms"};
    public final Map<String, Integer> a = new HashMap(32);

    public final adha a(adgx adgx) {
        if (adgx == null) {
            return this;
        }
        this.a.put("muxer-count", Integer.valueOf(adgx.b()));
        this.a.put("muxer-ms", Integer.valueOf(adgx.a()));
        return this;
    }

    public final adha a(adha adha) {
        for (Entry entry : adha.a().entrySet()) {
            String str = (String) entry.getKey();
            Object obj = (Integer) entry.getValue();
            if (this.a.containsKey(str)) {
                obj = Integer.valueOf(obj.intValue() + ((Integer) this.a.get(str)).intValue());
            }
            this.a.put(str, obj);
        }
        return this;
    }

    public final Map<String, Integer> a() {
        if (!this.a.isEmpty()) {
            int i = 0;
            for (Object obj : b) {
                if (this.a.containsKey(obj)) {
                    i += ((Integer) this.a.get(obj)).intValue();
                }
            }
            this.a.put("total-ms", Integer.valueOf(i));
        }
        return this.a;
    }

    public final adha b(adgx adgx) {
        if (adgx == null) {
            return this;
        }
        this.a.put("video-ext-count", Integer.valueOf(adgx.b()));
        this.a.put("video-ext-ms", Integer.valueOf(adgx.a()));
        return this;
    }

    public final adha c(adgx adgx) {
        if (adgx == null) {
            return this;
        }
        this.a.put("audio-ext-count", Integer.valueOf(adgx.b()));
        this.a.put("audio-ext-ms", Integer.valueOf(adgx.a()));
        return this;
    }

    public final adha d(adgx adgx) {
        if (adgx == null) {
            return this;
        }
        this.a.put("video-enc-count", Integer.valueOf(adgx.b()));
        this.a.put("video-enc-ms", Integer.valueOf(adgx.a()));
        return this;
    }

    public final adha e(adgx adgx) {
        if (adgx == null) {
            return this;
        }
        this.a.put("audio-enc-count", Integer.valueOf(adgx.b()));
        this.a.put("audio-enc-ms", Integer.valueOf(adgx.a()));
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
