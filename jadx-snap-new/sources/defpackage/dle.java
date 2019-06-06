package defpackage;

/* renamed from: dle */
public abstract class dle extends dky {
    public dkx a;
    private boolean b;
    private final String c;
    private String d;
    private aipn<dje> e;
    private aipn<dii> f;

    public dle(String str, String str2, aipn<dje> aipn, aipn<dii> aipn2) {
        akcr.b(str, "queueName");
        akcr.b(str2, "baseUrl");
        akcr.b(aipn, "configProvider");
        akcr.b(aipn2, "blizzardPropertiesProvider");
        this.c = str;
        this.d = str2;
        this.e = aipn;
        this.f = aipn2;
    }

    public String a() {
        return this.c;
    }

    public abstract void a(dkt dkt, dkw dkw);

    public final synchronized void a(boolean z) {
        this.b = z;
    }

    public final synchronized boolean b() {
        return this.b;
    }

    public final dkx c() {
        dkx dkx = this.a;
        if (dkx == null) {
            akcr.a("delegate");
        }
        return dkx;
    }

    public String d() {
        return this.d;
    }
}
