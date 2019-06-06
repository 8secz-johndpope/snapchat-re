package defpackage;

/* renamed from: akcw */
public final class akcw implements akcl {
    private final Class<?> a;
    private final String b;

    public akcw(Class<?> cls, String str) {
        akcr.b(cls, "jClass");
        akcr.b(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    public final Class<?> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akcw) && akcr.a(this.a, ((akcw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
