package defpackage;

/* renamed from: apr */
public final class apr {
    private Class<?> a;
    private Class<?> b;

    public apr(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public final void a(Class<?> cls, Class<?> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        apr apr = (apr) obj;
        return !this.a.equals(apr.a) ? false : this.b.equals(apr.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiClassKey{first=");
        stringBuilder.append(this.a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
