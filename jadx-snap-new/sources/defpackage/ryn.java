package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: ryn */
public final class ryn {
    public Long a;
    public Long b;
    public final ihh c;

    public ryn(ihh ihh) {
        akcr.b(ihh, "clock");
        this.c = ihh;
    }

    public static Long a(String str) {
        try {
            Object parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).parse(str);
            akcr.a(parse, "date");
            return Long.valueOf(parse.getTime());
        } catch (ParseException unused) {
            return null;
        }
    }

    public final synchronized long a() {
        long c = this.c.c();
        Long l = this.b;
        Long l2 = this.a;
        if (l != null) {
            if (l2 != null) {
                return l2.longValue() + (c - l.longValue());
            }
        }
        return System.currentTimeMillis();
    }
}
