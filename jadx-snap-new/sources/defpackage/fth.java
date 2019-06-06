package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: fth */
public interface fth {

    /* renamed from: fth$a */
    public static final class a<T> {
        public final T a;
        public final fti b;
        public final Type c;

        private a(fti fti, T t) {
            this.b = fti;
            this.a = t;
            this.c = null;
        }

        private a(Type type, T t) {
            this.b = fti.STRING;
            this.a = t;
            this.c = type;
        }

        public static a<Double> a(double d) {
            return new a(fti.DOUBLE, Double.valueOf(d));
        }

        public static a<Float> a(float f) {
            return new a(fti.FLOAT, Float.valueOf(f));
        }

        public static a<Integer> a(int i) {
            return new a(fti.INTEGER, Integer.valueOf(i));
        }

        public static a<Long> a(long j) {
            return new a(fti.LONG, Long.valueOf(j));
        }

        public static <T extends Enum<T>> a<String> a(T t) {
            if (t != null) {
                return new a(t.getDeclaringClass(), t.name());
            }
            throw new IllegalArgumentException("Config key defaults cannot be null.");
        }

        public static a<String> a(String str) {
            if (str != null) {
                return new a(fti.STRING, (Object) str);
            }
            throw new IllegalArgumentException("Config key defaults cannot be null.");
        }

        public static <T> a<T> a(Type type, T t) {
            if (t != null) {
                return new a(type, (Object) t);
            }
            throw new IllegalArgumentException("Config key defaults cannot be null.");
        }

        public static <T> a<String> a(Type type, String str) {
            return new a(type, (Object) str);
        }

        public static a<Boolean> a(boolean z) {
            return new a(fti.BOOLEAN, Boolean.valueOf(z));
        }

        public final fti a() {
            return this.b;
        }

        public final T b() {
            return this.a;
        }

        public final Type c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return Objects.equals(this.a, aVar.a) && this.b == aVar.b && Objects.equals(this.c, aVar.c);
            }
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }
    }

    a<?> a();

    ftg b();

    String name();
}
