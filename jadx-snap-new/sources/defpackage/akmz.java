package defpackage;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: akmz */
public abstract class akmz<F extends Format> {
    private final ConcurrentMap<a, F> a = new ConcurrentHashMap(7);

    /* renamed from: akmz$a */
    static class a {
        private final Object[] a;
        private int b;

        public a(Object... objArr) {
            this.a = objArr;
        }

        public final boolean equals(Object obj) {
            return Arrays.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            if (this.b == 0) {
                int i = 0;
                for (Object obj : this.a) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.b = i;
            }
            return this.b;
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
    }

    akmz() {
    }

    public final F a(String str, TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        a aVar = new a(str, timeZone, Locale.getDefault());
        Format format = (Format) this.a.get(aVar);
        if (format != null) {
            return format;
        }
        format = a(str, timeZone, r0);
        F f = (Format) this.a.putIfAbsent(aVar, format);
        return f != null ? f : format;
    }

    public abstract F a(String str, TimeZone timeZone, Locale locale);
}
