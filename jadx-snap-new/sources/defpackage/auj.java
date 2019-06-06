package defpackage;

/* renamed from: auj */
public final class auj {

    /* renamed from: auj$2 */
    static class 2 implements aui<Boolean> {
        2() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: auj$3 */
    static class 3 implements aui<Boolean> {
        3() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return Boolean.FALSE;
        }
    }

    static {
        2 2 = new 2();
        3 3 = new 3();
    }

    public static <T> aui<T> a(final T t) {
        return new aui<T>() {
            public final T get() {
                return t;
            }
        };
    }
}
