package defpackage;

import defpackage.mws.c;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: mwi */
public final class mwi {
    static final mvy a;
    static final mvy b;
    static final mvy c;
    public static final akbl<mux, Boolean> d = a.a;
    public static final akbl<mux, Boolean> e = b.a;
    public static final akbl<mux, Boolean> f = c.a;
    public static final akbl<mux, Boolean> g = d.a;

    /* renamed from: mwi$a */
    static final class a extends akcs implements akbl<mux, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(mux.i.a(mwi.a));
        }
    }

    /* renamed from: mwi$b */
    static final class b extends akcs implements akbl<mux, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(mux.i.a(mwi.b));
        }
    }

    /* renamed from: mwi$c */
    static final class c extends akcs implements akbl<mux, Boolean> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(mux.i.a(mwi.c));
        }
    }

    /* renamed from: mwi$d */
    static final class d extends akcs implements akbl<mux, Boolean> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return Boolean.valueOf(!(mux.m instanceof c));
        }
    }

    static {
        mvy mvy = mvy.d;
        Object of = EnumSet.of(muz.LIVE_CAMERA);
        akcr.a(of, "EnumSet.of(LensApplicableContext.LIVE_CAMERA)");
        a = mvy.a(mvy, (Set) of);
        mvy = mvy.d;
        of = EnumSet.of(muz.REPLY_CAMERA);
        akcr.a(of, "EnumSet.of(LensApplicableContext.REPLY_CAMERA)");
        b = mvy.a(mvy, (Set) of);
        mvy = mvy.d;
        of = EnumSet.of(muz.VIDEO_CHAT);
        akcr.a(of, "EnumSet.of(LensApplicableContext.VIDEO_CHAT)");
        c = mvy.a(mvy, (Set) of);
    }
}
