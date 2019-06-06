package defpackage;

import android.content.Context;
import android.content.Intent;
import com.snap.talk.lockscreen.LockScreenActivity;

/* renamed from: rrv */
public final class rrv {
    final igw a;
    final zfw b;
    volatile boolean c;
    final seo d;
    private final ajxe e;
    private final rrt f;

    /* renamed from: rrv$a */
    static final class a extends akcs implements akbk<Context> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Context) this.a.get();
        }
    }

    /* renamed from: rrv$b */
    static final class b<T> implements ajfl<sep> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            sep sep = (sep) obj;
            akcr.b(sep, "it");
            return sep.f;
        }
    }

    /* renamed from: rrv$c */
    static final class c implements ajev {
        public static final c a = new c();

        c() {
        }

        public final void run() {
        }
    }

    /* renamed from: rrv$d */
    static final class d<T> implements ajfb<sep> {
        private /* synthetic */ rrv a;
        private /* synthetic */ rrz b;
        private /* synthetic */ long c;

        d(rrv rrv, rrz rrz, long j) {
            this.a = rrv;
            this.b = rrz;
            this.c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            sep sep = (sep) obj;
            rrv rrv = this.a;
            rrz rrz = this.b;
            long j = this.c;
            boolean z = sep.d;
            Object a = rrv.a();
            String str = "context";
            akcr.a(a, str);
            String str2 = rrz.a.a;
            String str3 = rrz.a.c;
            String str4 = rrz.d.a;
            String str5 = rrz.c;
            String str6 = rrz.a.e.a;
            String str7 = rrz.a.e.c;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = str7;
            yzj yzj = r4;
            boolean d = rrw.d(rrz.a.b);
            rrv rrv2 = rrv;
            String str9 = str;
            yzj yzj2 = new yzj(str2, str3, str4, j, str5, str6, str8, d, rrw.a(rrz.a.b), z);
            akcr.b(a, str9);
            akcr.b(yzj, "lockScreenContext");
            Intent intent = new Intent(a, LockScreenActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("LOCK_SCREEN_CONTEXT_EXTRA", yzj);
            rrv2.a().startActivity(intent);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rrv.class), "context", "getContext()Landroid/content/Context;");
    }

    public rrv(ajwy<Context> ajwy, ajei ajei, rrt rrt, seo seo, zgb zgb, acbn acbn) {
        akcr.b(ajwy, "applicationContext");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(rrt, "lockScreenGating");
        akcr.b(seo, "notificationPreferences");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(acbn, "feature");
        this.f = rrt;
        this.d = seo;
        this.a = (igw) igk.a(new igw(), ajei);
        this.b = zgb.a(acbn, "LockScreenNotificationController");
        this.e = ajxh.a(new a(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final Context a() {
        return (Context) this.e.b();
    }

    public final boolean b() {
        return !this.c && rrt.a() && gr.a(a()).b();
    }
}
