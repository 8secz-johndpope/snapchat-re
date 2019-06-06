package defpackage;

/* renamed from: abya */
public final class abya {
    public static abtl a(abtl abtl) {
        int ceil = ((int) Math.ceil((Math.hypot((double) abtl.b(), (double) abtl.c()) * 0.0d) / 2.0d)) << 1;
        return new abtl(abtl.b() + ceil, abtl.c() + ceil);
    }
}
