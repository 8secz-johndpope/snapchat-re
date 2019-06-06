package defpackage;

/* renamed from: aar */
final class aar<Z> implements aax<Z> {
    final boolean a;
    final aax<Z> b;
    private final boolean c;
    private a d;
    private zd e;
    private int f;
    private boolean g;

    /* renamed from: aar$a */
    interface a {
        void a(zd zdVar, aar<?> aar);
    }

    aar(aax<Z> aax, boolean z, boolean z2) {
        this.b = (aax) ahl.a((Object) aax, "Argument must not be null");
        this.a = z;
        this.c = z2;
    }

    public final Class<Z> a() {
        return this.b.a();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(zd zdVar, a aVar) {
        this.e = zdVar;
        this.d = aVar;
    }

    public final Z b() {
        return this.b.b();
    }

    public final int c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.g = true;
            if (this.c) {
                this.b.d();
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        synchronized (this.d) {
            synchronized (this) {
                if (this.f > 0) {
                    int i = this.f - 1;
                    this.f = i;
                    if (i == 0) {
                        this.d.a(this.e, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    public final synchronized String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("EngineResource{isCacheable=");
        stringBuilder.append(this.a);
        stringBuilder.append(", listener=");
        stringBuilder.append(this.d);
        stringBuilder.append(", key=");
        stringBuilder.append(this.e);
        stringBuilder.append(", acquired=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(this.g);
        stringBuilder.append(", resource=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
