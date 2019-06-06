package defpackage;

import com.brightcove.player.event.EventType;
import defpackage.akhn.a;

/* renamed from: wii */
public final class wii extends saa implements akhn {
    private static a e = new a();
    final abkk a;
    private final String b = e.getClass().getSimpleName();
    private final ajdw c;
    private final zgb d;

    /* renamed from: wii$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: wii$b */
    static final class b implements Runnable {
        private /* synthetic */ wii a;
        private /* synthetic */ String b;

        b(wii wii, String str) {
            this.a = wii;
            this.b = str;
        }

        public final void run() {
            this.a.a.a(this.b);
        }
    }

    /* renamed from: wii$c */
    static final class c implements Runnable {
        private /* synthetic */ wii a;
        private /* synthetic */ String b;

        c(wii wii, String str) {
            this.a = wii;
            this.b = str;
        }

        public final void run() {
            this.a.a.a(this.b);
        }
    }

    public wii(abkk abkk, zgb zgb) {
        akcr.b(abkk, "dustManager");
        akcr.b(zgb, "schedulerProvider");
        this.a = abkk;
        this.d = zgb;
        ide ide = whl.a;
        Object obj = this.b;
        akcr.a(obj, "tag");
        this.c = zgb.a(ide, obj).f();
    }

    public final void a(saq<sai> saq, sab sab) {
        akcr.b(saq, EventType.RESPONSE);
        akcr.b(sab, "chain");
        sab.a((saq) saq);
        String str = (String) saq.h().get("x-snapchat-dust-msg");
        if (str != null) {
            this.c.a((Runnable) new c(this, str));
        }
    }

    public final akhv intercept(a aVar) {
        akcr.b(aVar, "chain");
        Object a = aVar.a(aVar.a());
        String a2 = a.a("x-snapchat-dust-msg");
        if (a2 != null) {
            this.c.a((Runnable) new b(this, a2));
        }
        akcr.a(a, EventType.RESPONSE);
        return a;
    }
}
