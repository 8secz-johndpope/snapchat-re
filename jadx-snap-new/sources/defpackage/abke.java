package defpackage;

import defpackage.abkb.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: abke */
public final class abke implements abka {
    private static final a d = new a(5000);
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean();
    private String c = "";

    /* renamed from: abke$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final int a(a aVar) {
        akcr.b(aVar, "locationParams");
        if (this.a.get() || this.b.get()) {
            this.c = "PRIORITY_HIGH_ACCURACY";
            return 100;
        }
        this.c = "PRIORITY_BALANCED_POWER_ACCURACY";
        return 102;
    }

    public final a a() {
        return d;
    }

    public final void a(StringBuilder stringBuilder) {
        akcr.b(stringBuilder, "builder");
        stringBuilder.append("MushroomLocationParamsEngine");
        String str = "\n";
        stringBuilder.append(str);
        StringBuilder stringBuilder2 = new StringBuilder("getCalculatedPriority [");
        stringBuilder2.append(this.c);
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
        stringBuilder2 = new StringBuilder("Is in map [");
        stringBuilder2.append(this.a.get());
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
        stringBuilder2 = new StringBuilder("Is polling gps [");
        stringBuilder2.append(this.b.get());
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
    }

    public final void a(boolean z) {
        this.a.set(z);
    }

    public final long b(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final void b(boolean z) {
        this.b.set(z);
    }

    public final long c(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final long d(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final long e(a aVar) {
        akcr.b(aVar, "locationParams");
        return 0;
    }
}
