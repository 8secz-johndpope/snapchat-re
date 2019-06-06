package defpackage;

import android.app.Activity;
import com.brightcove.player.event.Event;
import java.util.Collections;
import java.util.Map;

/* renamed from: aru */
final class aru {
    public final arv a;
    public final long b;
    public final b c;
    public final Map<String, String> d;
    public final String e;
    public final Map<String, Object> f;
    public final String g;
    public final Map<String, Object> h;
    private String i;

    /* renamed from: aru$a */
    public static class a {
        final b a;
        final long b = System.currentTimeMillis();
        public Map<String, String> c = null;
        public Map<String, Object> d = null;
        private String e = null;
        private String f = null;
        private Map<String, Object> g = null;

        public a(b bVar) {
            this.a = bVar;
        }
    }

    /* renamed from: aru$b */
    public enum b {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    private aru(arv arv, long j, b bVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.a = arv;
        this.b = j;
        this.c = bVar;
        this.d = map;
        this.e = null;
        this.f = map2;
        this.g = null;
        this.h = null;
    }

    /* synthetic */ aru(arv arv, long j, b bVar, Map map, Map map2) {
        this(arv, j, bVar, map, null, map2, null, null);
    }

    public static a a(b bVar, Activity activity) {
        Map singletonMap = Collections.singletonMap(Event.ACTIVITY, activity.getClass().getName());
        a aVar = new a(bVar);
        aVar.c = singletonMap;
        return aVar;
    }

    public final String toString() {
        if (this.i == null) {
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(": timestamp=");
            stringBuilder.append(this.b);
            stringBuilder.append(", type=");
            stringBuilder.append(this.c);
            stringBuilder.append(", details=");
            stringBuilder.append(this.d);
            stringBuilder.append(", customType=");
            stringBuilder.append(this.e);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.f);
            stringBuilder.append(", predefinedType=");
            stringBuilder.append(this.g);
            stringBuilder.append(", predefinedAttributes=");
            stringBuilder.append(this.h);
            stringBuilder.append(", metadata=[");
            stringBuilder.append(this.a);
            stringBuilder.append("]]");
            this.i = stringBuilder.toString();
        }
        return this.i;
    }
}
