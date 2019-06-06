package defpackage;

import java.util.Locale;

/* renamed from: krj */
public final class krj {
    public volatile String a;
    public volatile String b;
    public volatile boolean c;
    public final kre d;

    /* renamed from: krj$a */
    public static final class a extends akcs implements akbk<abbc> {
        private /* synthetic */ krj a;
        private /* synthetic */ kqi b;

        public a(krj krj, kqi kqi) {
            this.a = krj;
            this.b = kqi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbc a = krj.a(this.a);
            a.a(abay.CLOSE);
            a.a(this.b.a);
            a.b(this.b.k.a());
            return a;
        }
    }

    /* renamed from: krj$b */
    public static final class b extends akcs implements akbk<abbb> {
        private /* synthetic */ krj a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        public b(krj krj, String str, String str2) {
            this.a = krj;
            this.b = str;
            this.c = str2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbb abbb = new abbb();
            abbb.a(abba.JOIN);
            abbb.a(this.b);
            abbb.c(this.c);
            abbb.d(this.a.b);
            return abbb;
        }
    }

    /* renamed from: krj$c */
    public static final class c extends akcs implements akbk<abbc> {
        private /* synthetic */ krj a;
        private /* synthetic */ kqi b;

        public c(krj krj, kqi kqi) {
            this.a = krj;
            this.b = kqi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbc a = krj.a(this.a);
            a.a(abay.CREATE_PHOTO);
            a.a(this.b.a);
            a.b(this.b.k.a());
            return a;
        }
    }

    /* renamed from: krj$d */
    public static final class d extends akcs implements akbk<abbc> {
        private /* synthetic */ krj a;
        private /* synthetic */ kqi b;

        public d(krj krj, kqi kqi) {
            this.a = krj;
            this.b = kqi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbc a = krj.a(this.a);
            a.a(abay.PLAY);
            a.a(this.b.a);
            a.b(this.b.k.a());
            return a;
        }
    }

    /* renamed from: krj$e */
    public static final class e extends akcs implements akbk<abbb> {
        private /* synthetic */ krj a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ int d;

        public e(krj krj, String str, String str2, int i) {
            this.a = krj;
            this.b = str;
            this.c = str2;
            this.d = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbb abbb = new abbb();
            abbb.a(abba.SKIP);
            abbb.a(this.b);
            abbb.c(this.c);
            abbb.d(krj.a(this.d));
            return abbb;
        }
    }

    /* renamed from: krj$f */
    static final class f extends akcs implements akbk<abbc> {
        private /* synthetic */ krj a;
        private /* synthetic */ kqi b;

        f(krj krj, kqi kqi) {
            this.a = krj;
            this.b = kqi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abbc a = krj.a(this.a);
            a.a(this.b.a);
            a.b(this.b.k.a());
            a.a(abay.CREATE_VIDEO);
            return a;
        }
    }

    public krj(kre kre) {
        akcr.b(kre, "blizzardEventLogger");
        this.d = kre;
    }

    public static String a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        Object uuid = abpu.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        Object obj = Locale.US;
        akcr.a(obj, "Locale.US");
        if (uuid != null) {
            uuid = uuid.toUpperCase(obj);
            akcr.a(uuid, "(this as java.lang.String).toUpperCase(locale)");
            stringBuilder.append(uuid);
            stringBuilder.append('~');
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }

    private final void b(kqi kqi) {
        if (kqi.b.a() && this.c) {
            this.d.a(new f(this, kqi));
        }
    }

    public final void a(kqi kqi) {
        akcr.b(kqi, "analyticsSession");
        b(kqi);
    }
}
