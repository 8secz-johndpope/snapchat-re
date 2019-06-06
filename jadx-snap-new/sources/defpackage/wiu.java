package defpackage;

import com.snap.core.db.record.TalkAuthContextModel;

/* renamed from: wiu */
public final class wiu {
    final ajwy<dib> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: wiu$a */
    static final class a extends akcs implements akbk<dib> {
        private /* synthetic */ wiu a;

        a(wiu wiu) {
            this.a = wiu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wiu.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;");
    }

    public wiu(ajwy<dib> ajwy) {
        akcr.b(ajwy, "_blizzardEventLogger");
        this.a = ajwy;
    }

    /* Access modifiers changed, original: final */
    public final dib a() {
        return (dib) this.b.b();
    }

    public final void a(wjd wjd, boolean z, long j) {
        akcr.b(wjd, TalkAuthContextModel.SCOPEID);
        dib a = a();
        abaj abaj = new abaj();
        abaj.a(wjd.name());
        abaj.a(Long.valueOf(j));
        abaj.a(Boolean.valueOf(z));
        a.a((aajt) abaj);
    }
}
