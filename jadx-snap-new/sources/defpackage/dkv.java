package defpackage;

/* renamed from: dkv */
public final class dkv extends dku {
    private final dio a;

    public dkv(String str, dio dio, ilv ilv) {
        akcr.b(str, "logQueueName");
        akcr.b(dio, "databaseManager");
        akcr.b(ilv, "graphene");
        super(str, ilv);
        this.a = dio;
    }

    public final synchronized void b() {
        this.a.f(a());
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized long c() {
        return this.a.e();
    }
}
