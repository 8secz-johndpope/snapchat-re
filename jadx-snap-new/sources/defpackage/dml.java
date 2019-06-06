package defpackage;

/* renamed from: dml */
public final class dml<T> {
    final long a;
    final String b;
    final boolean c;
    private final T d;

    public dml(T t, long j, boolean z) {
        this(t, j, z, "");
    }

    public dml(T t, long j, boolean z, String str) {
        this.d = t;
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final T a() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BoltConfig{ lastCheckedMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastModifiedDate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isProd=");
        stringBuilder.append(this.c);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
