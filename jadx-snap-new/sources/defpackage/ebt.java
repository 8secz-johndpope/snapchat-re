package defpackage;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: ebt */
public final class ebt {
    public final ecw a;
    public final adnh b = new adnh(320);
    public final adnh c = new adnh(320);
    public final adnh d = new adnh(320);
    public final Map<ecw, adnh> e = new EnumMap(ecw.class);
    public final adnh f = new adnh(320);
    public final adnh g = new adnh(320);
    public final adnh h = new adnh(320);

    public ebt(Collection<ecw> collection, ecw ecw) {
        this.a = ecw;
        for (ecw ecw2 : collection) {
            this.e.put(ecw2, new adnh(320));
        }
    }

    public final adnh a() {
        return this.b;
    }

    public final adnh b() {
        return this.d;
    }

    public final adnh c() {
        return this.c;
    }

    public final Map<ecw, adnh> d() {
        return this.e;
    }

    public final adnh e() {
        return this.f;
    }

    public final adnh f() {
        return this.g;
    }

    public final adnh g() {
        return this.h;
    }
}
