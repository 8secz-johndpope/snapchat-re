package defpackage;

import android.content.Context;

/* renamed from: rbs */
public final class rbs implements rbt {
    private final ajxe a;
    private final ftl b;

    /* renamed from: rbs$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ qwy a;

        a(qwy qwy) {
            this.a = qwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((Number) this.a.b().b()).longValue() < 5);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rbs.class), "hasFewFriendsCachedRes", "getHasFewFriendsCachedRes()Z");
    }

    public rbs(ftl ftl, qwy qwy) {
        akcr.b(ftl, "configProvider");
        akcr.b(qwy, "friendsFeedDataProvider");
        this.b = ftl;
        this.a = ajxh.a(new a(qwy));
    }

    public final boolean a() {
        return this.b.a((fth) jic.ENABLE_BIRTHDAY_PARTY);
    }

    public final boolean a(Context context) {
        akcr.b(context, "context");
        return gr.a(context).b();
    }

    public final boolean b() {
        this.b.a((fth) jic.IS_EMAIL_VERIFIED);
        return false;
    }

    public final boolean c() {
        return ((Boolean) this.a.b()).booleanValue();
    }
}
