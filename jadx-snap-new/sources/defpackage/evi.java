package defpackage;

import defpackage.fth.a;

/* renamed from: evi */
public final class evi<T> implements fth {
    private String a;
    private a<T> b;
    private ftg c;

    public evi(String str, a<T> aVar, ftg ftg) {
        akcr.b(str, "configId");
        akcr.b(aVar, "delegate");
        akcr.b(ftg, "configurationFeature");
        this.a = str;
        this.b = aVar;
        this.c = ftg;
    }

    public final a<T> a() {
        return this.b;
    }

    public final ftg b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            return (akcr.a(this.a, ((evi) obj).a) ^ 1) == 0;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.circumstanceengine.api.DynamicConfigurationKey<*>");
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String name() {
        return this.a;
    }
}
