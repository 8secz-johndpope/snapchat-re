package defpackage;

import defpackage.sdl.a;
import defpackage.sdl.b;
import java.util.HashMap;

/* renamed from: scj */
public final class scj implements achk<zjm, zjk>, sdn {
    public final ajwo<sdl> a;
    public final achb<zjm, zjk> b;
    private final HashMap<zjm, sdl> c = new HashMap();
    private final b d = b.DISPLAY_ALL;
    private boolean e;

    /* renamed from: scj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: scj$c */
    public static final class c implements ajev {
        private /* synthetic */ scj a;

        public c(scj scj) {
            this.a = scj;
        }

        public final void run() {
            this.a.b.b((achk) this.a);
        }
    }

    /* renamed from: scj$b */
    static final class b implements sdl {
        private final zjm b;
        private final sdl c;

        public b(zjm zjm, sdl sdl) {
            akcr.b(zjm, "mainPageType");
            akcr.b(sdl, "delegate");
            this.b = zjm;
            this.c = sdl;
        }

        public final a evaluateNotification(sdr sdr) {
            akcr.b(sdr, "notification");
            Object evaluateNotification = this.c.evaluateNotification(sdr);
            akcr.a(evaluateNotification, "delegate.evaluateNotification(notification)");
            return evaluateNotification;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("[Custom policy for ");
            stringBuilder.append(this.b);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static {
        a aVar = new a();
    }

    public scj(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.b = achb;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.a = ajwo;
    }

    private final void a(sdl sdl) {
        this.a.a((Object) sdl);
    }

    private final void b(zjm zjm, sdl sdl) {
        if (!this.e && akcr.a((Object) zjm, (zjm) this.b.h())) {
            a(sdl);
        }
    }

    public final sdl a() {
        sdl sdl = (sdl) this.c.get(this.b.h());
        return sdl == null ? this.d : sdl;
    }

    public final void a(achi<zjm, zjk> achi) {
        this.e = true;
    }

    public final void a(zjm zjm) {
        akcr.b(zjm, "mainPageType");
        this.c.remove(zjm);
        b(zjm, this.d);
    }

    public final void a(zjm zjm, sdl sdl) {
        akcr.b(zjm, "mainPageType");
        akcr.b(sdl, "inAppNotificationPolicy");
        b bVar = new b(zjm, sdl);
        this.c.put(zjm, bVar);
        b(zjm, bVar);
    }

    public final void b(achi<zjm, zjk> achi) {
        this.e = false;
        a(a());
    }

    public final void c(achi<zjm, zjk> achi) {
        this.e = false;
    }
}
