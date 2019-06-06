package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;

/* renamed from: afan */
public final class afan {
    public static aead a(afag afag) {
        aead aead = new aead();
        if (afag.a != null) {
            aead.a = afag.a;
        }
        if (afag.b != null) {
            aead.b = afag.b;
        }
        if (afag.c != null) {
            aead.c = afag.c;
        }
        if (afag.d != null) {
            aead.d = afag.d.intValue();
        }
        if (afag.e != null) {
            aead.e = afag.e;
        }
        if (afag.f != null) {
            aead.f = afag.f.intValue();
        }
        if (afag.g != null) {
            aead.g = afag.g.booleanValue();
        }
        if (afag.h != null) {
            aead.h = afag.h;
        }
        if (afag.i != null) {
            aead.i = new String[afag.i.size()];
            for (int i = 0; i < afag.i.size(); i++) {
                aead.i[i] = (String) afag.i.get(i);
            }
        }
        if (afag.j != null) {
            aead.j = new String[afag.j.size()];
            for (int i2 = 0; i2 < afag.j.size(); i2++) {
                aead.j[i2] = (String) afag.j.get(i2);
            }
        }
        if (afag.k != null) {
            aead.k = afag.k;
        }
        if (afag.l != null) {
            aead.l = aeng.a(afag.l);
        }
        if (afag.m != null) {
            aead.m = afag.m;
        }
        if (afag.n != null) {
            aead.n = afag.n;
        }
        if (afag.o != null) {
            aead.o = afag.o.longValue();
        }
        if (afag.p != null) {
            afaj afaj = afag.p;
            aeae aeae = new aeae();
            if (afaj.a != null) {
                aeae.a = afaj.a;
            }
            if (afaj.b != null) {
                aeae.b = afaj.b.intValue();
            }
            if (afaj.c != null) {
                aeae.c = afaj.c.intValue();
            }
            aead.p = aeae;
        }
        if (afag.q != null) {
            aead.q = afag.q;
        }
        if (afag.r != null) {
            aead.r = afag.r.booleanValue();
        }
        return aead;
    }

    public static afag a(aead aead) {
        ArrayList arrayList;
        afag afag = new afag();
        if (!aead.a.isEmpty()) {
            afag.a = aead.a;
        }
        if (!aead.b.isEmpty()) {
            afag.b = aead.b;
        }
        if (!aead.c.isEmpty()) {
            afag.c = aead.c;
        }
        afag.d = Integer.valueOf(aead.d);
        if (!aead.e.isEmpty()) {
            afag.e = aead.e;
        }
        afag.f = Integer.valueOf(aead.f);
        afag.g = Boolean.valueOf(aead.g);
        if (!aead.h.isEmpty()) {
            afag.h = aead.h;
        }
        if (aead.i.length > 0) {
            arrayList = new ArrayList();
            for (Object add : aead.i) {
                arrayList.add(add);
            }
            afag.i = arrayList;
        }
        if (aead.j.length > 0) {
            arrayList = new ArrayList();
            for (Object add2 : aead.j) {
                arrayList.add(add2);
            }
            afag.j = arrayList;
        }
        if (!aead.k.isEmpty()) {
            afag.k = aead.k;
        }
        if (!(aead.l == null || MessageNano.messageNanoEquals(aead.l, new adzi()))) {
            afag.l = aeng.a(aead.l);
        }
        if (!aead.m.isEmpty()) {
            afag.m = aead.m;
        }
        if (!aead.n.isEmpty()) {
            afag.n = aead.n;
        }
        afag.o = Long.valueOf(aead.o);
        if (!(aead.p == null || MessageNano.messageNanoEquals(aead.p, new aeae()))) {
            aeae aeae = aead.p;
            afaj afaj = new afaj();
            if (!aeae.a.isEmpty()) {
                afaj.a = aeae.a;
            }
            afaj.b = Integer.valueOf(aeae.b);
            afaj.c = Integer.valueOf(aeae.c);
            afag.p = afaj;
        }
        if (!aead.q.isEmpty()) {
            afag.q = aead.q;
        }
        afag.r = Boolean.valueOf(aead.r);
        return afag;
    }
}
