package defpackage;

import defpackage.geg.a;
import java.util.Set;

/* renamed from: gew */
public final class gew implements geg {
    private final String a;
    private final sak<? extends Object> b;
    private final gdw c;
    private final a d;
    private final gfl e;
    private final geo f;
    private final Set<rzg> g;
    private final Set<gdy> h;
    private final ifi i;

    public gew(String str, sak<? extends Object> sak, gdw gdw, a aVar, gfl gfl, geo geo, Set<rzg> set, Set<? extends gdy> set2, ifi ifi) {
        akcr.b(str, "id");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(geo, "contentType");
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        this.a = str;
        this.b = sak;
        this.c = gdw;
        this.d = aVar;
        this.e = gfl;
        this.f = geo;
        this.g = set;
        this.h = set2;
        this.i = ifi;
    }

    public /* synthetic */ gew(String str, sak sak, a aVar, gfl gfl, geo geo, Set set, Set set2, int i) {
        this(str, (i & 2) != 0 ? null : sak, null, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? gii.a : gfl, geo, set, set2, null);
    }

    public final String a() {
        return this.a;
    }

    public final sak<? extends Object> b() {
        return this.b;
    }

    public final gdw c() {
        return this.c;
    }

    public final a d() {
        return this.d;
    }

    public final gfl e() {
        return this.e;
    }

    public final geo f() {
        return this.f;
    }

    public final Set<rzg> g() {
        return this.g;
    }

    public final Set<gdy> h() {
        return this.h;
    }

    public final ifi i() {
        return this.i;
    }
}
