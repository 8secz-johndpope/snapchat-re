package defpackage;

/* renamed from: akkj */
public abstract class akkj implements akkv {
    protected final akkv a;

    public akkj(akkv akkv) {
        if (akkv != null) {
            this.a = akkv;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(akkd akkd, long j) {
        return this.a.a(akkd, j);
    }

    public final akkw a() {
        return this.a.a();
    }

    public void close() {
        this.a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
