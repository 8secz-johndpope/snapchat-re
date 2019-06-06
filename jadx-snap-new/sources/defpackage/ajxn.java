package defpackage;

import java.io.Serializable;

/* renamed from: ajxn */
public final class ajxn<T> implements Serializable {
    private final Object a;

    /* renamed from: ajxn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ajxn$b */
    public static final class b implements Serializable {
        public final Throwable a;

        public b(Throwable th) {
            akcr.b(th, "exception");
            this.a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && akcr.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Failure(");
            stringBuilder.append(this.a);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    static {
        a aVar = new a();
    }

    public static final Throwable a(Object obj) {
        return obj instanceof b ? ((b) obj).a : null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajxn) && akcr.a(this.a, ((ajxn) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        return obj != null ? obj.hashCode() : 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof b) {
            return obj.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("Success(");
        stringBuilder.append(obj);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
