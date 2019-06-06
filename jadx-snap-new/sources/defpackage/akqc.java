package defpackage;

import defpackage.akpi.b;
import java.util.Collection;
import java.util.Collections;

/* renamed from: akqc */
public final class akqc extends akpi {
    private final String a;
    private final Collection<Object> b;
    private final b c;
    private final int d;
    private final akpn e;
    private final akov f;

    public akqc(String str, Collection<Object> collection, b bVar, int i, akpn akpn, akov akov) {
        this.a = str;
        this.b = collection;
        this.c = bVar;
        this.d = i;
        this.e = akpn;
        this.f = akov;
    }

    public final Collection<Object> a() {
        Collection collection = this.b;
        return collection == null ? Collections.emptyList() : collection;
    }

    public final b b() {
        return this.c;
    }
}
