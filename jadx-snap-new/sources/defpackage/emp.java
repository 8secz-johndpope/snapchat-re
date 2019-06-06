package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemClock;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.dpe.a;
import defpackage.dva.d;
import defpackage.ely.b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: emp */
public final class emp implements a, ely.a {
    private final ajei A = new ajei();
    private absz<b> B;
    private igv C = new igv(new AtomicBoolean(false), ajfq.INSTANCE);
    public aipn<ifs> a;
    public b b;
    public ajdp<Float> c;
    public ajdp<Float> d;
    public ajwl<Float> e;
    public Supplier<Float> f;
    public ajdp<Float> g;
    public ajdp<ebs> h;
    public ajdp<dva> i;
    public ebw j;
    public abse k;
    public ajdp<dpw> l;
    public ftl m;
    public ilv n;
    public ablb o;
    public Supplier<abaw> p;
    public Supplier<aaqd> q;
    public aipn<ebr> r;
    public elx s;
    public ajdp<achi> t;
    public dni u;
    public ajwy<eil> v;
    public dod w;
    public dpe x;
    public dqi y;
    private final zfw z = zgb.a(dnh.f, "PreviewPresenter");

    /* renamed from: emp$b */
    enum b {
        READY,
        CAPTURING
    }

    /* renamed from: emp$a */
    enum a implements defpackage.absz.a<b, absy> {
        CAPTURE_START,
        CAPTURE_END
    }

    private float a(float f, float f2) {
        return (f / (((float) this.k.heightPixels) * f2)) + 1.0f;
    }

    private void a(dpp dpp) {
        ebw ebw = this.j;
        ebw.a.a = 1.0f;
        ebw.b.a = 1.0f;
        ajwl ajwl = this.e;
        ajwl.getClass();
        dpp.a((float) MapboxConstants.MINIMUM_ZOOM, new -$$Lambda$rM0UjXCB4c31SzYSk2DAvF7Vqwg(ajwl));
    }

    private void a(dva dva) {
        abkz abkz;
        if (dva instanceof dva.a) {
            ablb ablb = this.o;
            ablb.a = new abkz();
            ablb.b = SystemClock.elapsedRealtime();
            abaw abaw = (abaw) this.p.get();
            abkz = this.o.a;
            if (abkz != null) {
                abkz.c = abaw;
            }
        }
        if (dva instanceof d) {
            double floatValue = (double) ((Float) this.f.get()).floatValue();
            abkz abkz2 = this.o.a;
            if (abkz2 != null) {
                abkz2.d = Double.valueOf(floatValue);
            }
            ablb ablb2 = this.o;
            aaqd aaqd = (aaqd) this.q.get();
            akcr.b(aaqd, "lowLightStatus");
            abkz2 = ablb2.a;
            if (abkz2 != null) {
                abkz2.e = aaqd;
            }
            ablb2 = this.o;
            boolean z = ((ebr) this.r.get()).a;
            abkz2 = ablb2.a;
            if (abkz2 != null) {
                abkz2.f = z;
            }
            ablb2 = this.o;
            abkz = ablb2.a;
            if (abkz != null) {
                abkz.g = Double.valueOf(abqq.a(SystemClock.elapsedRealtime() - ablb2.b, 3));
                Object copyOf = ImmutableMap.copyOf(((ablc) ablb2.d.get()).a);
                akcr.a(copyOf, "userActionCollector.get().asUserActionMap()");
                akcr.b(copyOf, "<set-?>");
                abkz.a = copyOf;
                ((ablc) ablb2.d.get()).a.clear();
                abla abla = ablb2.c;
                abkz abkz3 = ablb2.a;
                if (abkz3 == null) {
                    akcr.a();
                }
                abla.a(abkz3);
            }
            ablb2.a = null;
        }
    }

    private void a(ebs.b bVar) {
        boolean d = ((ifs) this.a.get()).d();
        this.a.get();
        boolean c = ifs.c();
        edl edl = bVar.b;
        if (!c) {
            edl = d ? edl.CAMERA_DISABLED : edl.PERMISSION_NONE;
        } else if (!d) {
            edl = edl.PERMISSION_NOT_GRANTED;
        }
        this.w.a(edl);
        this.n.c(inq.STREAMING_FAILED.a("error", edl.name().toLowerCase(Locale.US)), 1);
        if (d) {
            if (c) {
                this.b.b();
            } else {
                this.b.a();
            }
        }
    }

    private void b(dpp dpp) {
        ebv a = this.j.a(dpp.o());
        a.a();
        float f = a.a - 1.0f;
        ajwl ajwl = this.e;
        ajwl.getClass();
        dpp.a(f, new -$$Lambda$rM0UjXCB4c31SzYSk2DAvF7Vqwg(ajwl));
        this.j.a(dpp.o() ^ 1).a();
    }

    private void d(float f) {
        dpp a = this.y.a();
        if (a != null) {
            ebv a2 = this.j.a(a.o());
            if (a2.a(f)) {
                f = a2.a - 1.0f;
                ajwl ajwl = this.e;
                ajwl.getClass();
                a.a(f, new -$$Lambda$rM0UjXCB4c31SzYSk2DAvF7Vqwg(ajwl));
            }
        }
    }

    private void e() {
        this.A.a();
        this.C.a();
        this.x.b(this);
    }

    private void f() {
        this.n.c(inq.STREAMING_DELAYED, 1);
    }

    public final void a() {
        this.B.a(a.CAPTURE_END);
    }

    public final void a(float f) {
        d(f);
    }

    public final void a(aesf aesf, boolean z) {
        this.B.a(a.CAPTURE_START);
    }

    public final void a(ebi ebi) {
        this.B.a(a.CAPTURE_END);
    }

    public final void b() {
    }

    public final void b(float f) {
        if (this.B.a() == b.CAPTURING) {
            d(a(f, 0.5f));
        }
    }

    public final void c() {
        this.A.a(this.y.c().d(new -$$Lambda$emp$9NHiechsX06UnhbO4xZbgDmFmfk(this)));
    }

    public final void c(float f) {
        d(a(f, 0.25f));
    }

    public final void d() {
        ift ift = ((ifs) this.a.get()).d;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.DeviceAdminSettings"));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.addFlags(AudioPlayer.INFINITY_LOOP_COUNT);
        intent.addFlags(8388608);
        try {
            ift.a(ift.a, intent);
        } catch (ift.a unused) {
            ift.a(ift.a);
        }
    }

    public final ajej start() {
        this.b.a(this);
        Object obj = b.READY;
        ajei ajei = this.A;
        ajei.getClass();
        abta.a a = abta.a(obj, new -$$Lambda$mel42v5AXbZcvAypz7TBWMcjMnk(ajei));
        a.a(b.READY, a.CAPTURE_START, b.CAPTURING);
        a.a(b.CAPTURING, a.CAPTURE_END, b.READY);
        this.B = a.a("PreviewPresenter");
        this.x.a(this);
        if (this.u instanceof dvc) {
            this.A.a(this.m.b(dnd.ENABLE_UNIFIED_CAMERA_OPEN).a((ajdw) this.z.f()).b((ajdw) this.z.l()).a(-$$Lambda$emp$6jfzitbnPFGWYYvo_df09FuyN6k.INSTANCE).b(new -$$Lambda$emp$CWI1223Yej6HNXCtaRt6VgWSeGE(this)).m(new -$$Lambda$emp$OdZu6pQ6FvTGPtGpN4CQ7JdzLyY(this)).f(new -$$Lambda$emp$0GH1esAbN7nwiUDn08k7u6ZoFmk(this)));
        }
        this.A.a(this.i.a(-$$Lambda$emp$_fKyMjM4Vgre-sOiNeWTTVl87PE.INSTANCE).m(new -$$Lambda$emp$mrwtCi8nwh61Sw7m8wgyHWkAZno(this)).f(new -$$Lambda$emp$s7eDyRJPNQUDA0X1N70XfsKLlR4(this)));
        this.A.a(ajek.a(new -$$Lambda$emp$c5OMrKBoiskHjJZCm1xNp11sOCE(this)));
        this.A.a(this.c.f(new -$$Lambda$y2LG_NRIy1-PnRNxCIugG_b_V1E(this)));
        this.A.a(this.d.f(new -$$Lambda$gw5dj63DWhvnSWMB9p3NSrxi0jw(this)));
        this.A.a(this.h.b(ebs.b.class).f(new -$$Lambda$emp$Iju2s6lbsEGsB9oRNjYML92GgSA(this)));
        this.A.a(this.g.f(new -$$Lambda$UMl1Dkiesty2tjyCCkteQz7lULM(this)));
        this.A.a(this.m.p(dnd.ENABLE_CAMERA2_OIS).a(-$$Lambda$emp$yfdGqqlI1mlLCcjXjsY_NjBGa7M.INSTANCE).k(new -$$Lambda$emp$DbyS7deUdrM7lx8A5JrBqWJH4sk(this)).p(-$$Lambda$emp$AHCinJCGIyDQhsgQS486LNbabwc.INSTANCE).j(ajfu.a).m(new -$$Lambda$emp$LVIqG0eVjxGf4podLbOq51two2s(this)).f(-$$Lambda$emp$s-y4pxLS80TKqcoT31y_sfwaAEA.INSTANCE));
        this.A.a(this.i.b(dva.b.class).f(new -$$Lambda$emp$JO0FZT7lwjuhtt_Zddl7VDEfsZU(this)));
        this.A.a(this.h.a(-$$Lambda$emp$bUKjWaaJdH4dDor_1XNQVt50TOg.INSTANCE).f(new -$$Lambda$emp$aWq2-ShX1vYztIZf8IPg8UbyJIY(this)));
        this.A.a(this.i.f(new -$$Lambda$emp$y6-hTu2ifHWH18unx455_i9xMYw(this)));
        return this.A;
    }
}
