package defpackage;

import android.text.TextUtils;
import defpackage.szw.b;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: tjj */
public final class tjj {
    public static final Pattern a = Pattern.compile("^01");
    public final tgg b = new tgg();
    public final tjm c = new tjm();
    public final dib d;
    private final tgh e;
    private final Map<Object, String> f = new HashMap();
    private final tfz g;
    private final zfw h;
    private final ajei i = new ajei();
    private tga j;

    public tjj(tgh tgh, dib dib, tfz tfz) {
        String uuid = abpu.a().toString();
        this.e = tgh;
        this.b.b(tge.e, uuid);
        this.d = dib;
        this.h = zgb.a(tfv.A.callsite("CommerceMetricsLogger"));
        this.g = tfz;
        this.i.a(this.g.a(uuid).b((ajdw) this.h.f()).a(-$$Lambda$tjj$lKY--TZ1cmKZq74RPcBKgQeCNw4.INSTANCE, -$$Lambda$tjj$pDutLqscMl4H3lPMeN5QvUCNULU.INSTANCE));
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    public final tjj a() {
        h();
        this.f.clear();
        this.b.d();
        this.i.a();
        String uuid = abpu.a().toString();
        this.b.b(tge.e, uuid);
        this.i.a(this.g.a(uuid).b((ajdw) this.h.f()).a(-$$Lambda$tjj$eAYRYjMryrycBtDBFGjrTJJQSGQ.INSTANCE, -$$Lambda$tjj$C-2-Ml6x1njiRW4JjmRZln_HBCg.INSTANCE));
        return this;
    }

    public final tjj a(abbd abbd) {
        this.b.b(tge.C, abbd);
        return this;
    }

    public final tjj a(b<Long> bVar, Long l) {
        this.b.b(bVar, l);
        return this;
    }

    public final tjj a(b<String> bVar, String str) {
        this.b.b(bVar, str);
        return this;
    }

    public final void a(aafp aafp, String str) {
        aajt a = tjm.a(this.b, aafp);
        if (!TextUtils.isEmpty(str)) {
            a.c = str;
        }
        this.d.a(a);
    }

    public final void a(aafr aafr) {
        this.f.put(aafr, abpu.a().toString());
        aajt a = tjm.a(this.b, aafr);
        a.i = (String) this.f.get(aafr);
        this.d.a(a);
    }

    public final void a(aafr aafr, aagf aagf, abbd abbd) {
        this.b.b(tge.C, abbd);
        b(aagf);
        tgg tgg = this.b;
        aajt aafs = new aafs();
        tjm.a((aaga) aafs, tgg);
        aafs.d = aafr;
        this.d.a(aafs);
    }

    public final void a(aafz aafz, aaxv aaxv, long j) {
        aajt c = tjm.c(this.b);
        c.a = aafz;
        c.b = aaxv;
        c.f = Long.valueOf(j);
        c.d = Long.valueOf(200);
        c.c = Boolean.TRUE;
        this.d.a(c);
    }

    public final void a(aafz aafz, aaxv aaxv, long j, String str, long j2) {
        aajt c = tjm.c(this.b);
        c.a = aafz;
        c.b = aaxv;
        c.f = Long.valueOf(j2);
        c.d = Long.valueOf(j);
        c.e = str;
        c.c = Boolean.FALSE;
        this.d.a(c);
    }

    public final void a(aaga aaga) {
        this.d.a((aajt) aaga);
    }

    public final void a(aagb aagb, abbd abbd, aagf aagf, zyr zyr) {
        this.b.b(tge.C, abbd);
        b(aagf);
        tgg tgg = this.b;
        aajt aagc = new aagc();
        tjm.a((aaga) aagc, tgg);
        aagc.d = aagb;
        aagc.a = zyr;
        this.d.a(aagc);
    }

    public final void a(aagf aagf) {
        this.f.put(aagf, abpu.a().toString());
        aagf aagf2 = (aagf) this.b.a(tge.i);
        b(aagf);
        aajt a = tjm.a(this.b);
        if (aagf2 != null) {
            a.a = aagf2;
        }
        a.i = (String) this.f.get(aagf);
        this.d.a(a);
    }

    public final void a(aagf aagf, String str) {
        aajt d = tjm.d(this.b);
        d.a = zyr.TAP;
        d.d = aagf;
        if (!TextUtils.isEmpty(str)) {
            d.c = str;
        }
        this.d.a(d);
    }

    public final void a(aagf aagf, String str, aaya aaya) {
        tgg tgg = this.b;
        aajt aagu = new aagu();
        tjm.a((aaga) aagu, tgg);
        aagu.b = aagf;
        aagu.d = str;
        aagu.e = aaya;
        this.d.a(aagu);
    }

    public final void a(aagv aagv) {
        this.d.a(tjm.a(this.b, aagv));
    }

    public final void a(String str, long j) {
        tga tga = this.j;
        if (tga != null) {
            akcr.b(str, "categoryId");
            if (akcr.a(tga.d, (Object) str)) {
                tga.c = Math.max(j, tga.c);
            }
        }
    }

    public final void a(String str, long j, long j2) {
        tgg tgg = this.b;
        aajt aagt = new aagt();
        tjm.a((aaga) aagt, tgg);
        aagt.c = str;
        aagt.a = Long.valueOf(j);
        aagt.b = Long.valueOf(j2);
        this.d.a(aagt);
    }

    public final void a(String str, aafm aafm, boolean z, the the) {
        tgg tgg = this.b;
        aajt aago = new aago();
        tjm.a(tgg, aago, aafm, z, the);
        aago.e = str;
        this.d.a(aago);
    }

    public final void a(String str, String str2, long j, long j2) {
        this.b.b(tge.v, str);
        this.b.b(tge.x, str2);
        this.b.b(tge.w, Long.valueOf(j));
        this.b.b(tge.y, Long.valueOf(j2));
        this.j = new tga(str);
    }

    public final void a(thn thn, String str, aafm aafm, boolean z, the the) {
        this.d.a(this.c.a(thn, str, this.b, aafm, z, the));
    }

    public final void a(boolean z, the the) {
        this.d.a(this.c.a(this.b, z, the));
    }

    public final tjj b(aagf aagf) {
        this.b.b(tge.i, aagf);
        this.b.b(tge.a, this.f.get(aagf));
        return this;
    }

    public final void b() {
        if (this.b.c(tge.i)) {
            aajt b = tjm.b(this.b);
            b.i = (String) this.f.get(this.b.a(tge.i));
            this.d.a(b);
        }
    }

    public final void b(aafr aafr) {
        aajt b = tjm.b(this.b, aafr);
        b.i = (String) this.f.get(aafr);
        this.d.a(b);
    }

    public final void b(aagf aagf, String str) {
        aajt d = tjm.d(this.b);
        d.a = zyr.SWIPE_UP;
        d.d = aagf;
        if (!TextUtils.isEmpty(str)) {
            d.c = str;
        }
        this.d.a(d);
    }

    public final void b(String str, long j) {
        tga tga = this.j;
        if (tga != null) {
            akcr.b(str, "categoryId");
            if (akcr.a(tga.d, (Object) str)) {
                tga.b = j;
            }
        }
    }

    public final void c() {
        if (this.j != null) {
            this.j = null;
        }
    }

    public final void c(aagf aagf, String str) {
        aajt d = tjm.d(this.b);
        d.a = zyr.SWIPE_DOWN;
        d.d = aagf;
        if (!TextUtils.isEmpty(str)) {
            d.c = str;
        }
        this.d.a(d);
    }

    public final void d() {
        tga tga = this.j;
        if (tga != null) {
            tga.a = System.currentTimeMillis();
            tga.b = 0;
            tga.c = 0;
            tgg tgg = this.b;
            aajt aags = new aags();
            tjm.a((aaga) aags, tgg);
            this.d.a(aags);
        }
    }

    public final void e() {
        if (this.b.c(tge.v)) {
            tga tga = this.j;
            if (tga != null) {
                long currentTimeMillis = System.currentTimeMillis() - tga.a;
                long j = this.j.c;
                long j2 = this.j.b;
                tgg tgg = this.b;
                aajt aagq = new aagq();
                tjm.a((aaga) aagq, tgg);
                aagq.a = Long.valueOf(currentTimeMillis);
                aagq.b = Long.valueOf(j);
                aagq.c = Long.valueOf(j2);
                this.d.a(aagq);
            }
        }
    }

    public final void f() {
        this.e.a(abpu.a().toString());
        this.b.b(tge.c, this.e.b());
    }

    public final void g() {
        if (!this.e.a.empty()) {
            this.e.a();
            if (this.e.a.empty()) {
                this.b.b(tge.c);
            } else {
                this.b.b(tge.c, this.e.b());
            }
        }
    }

    public final int h() {
        int size = this.e.a.size();
        while (!this.e.a.empty()) {
            this.e.a();
        }
        return size;
    }

    public final tgg i() {
        return this.b;
    }
}
