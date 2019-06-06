package defpackage;

/* renamed from: ajpc */
public final class ajpc<T> extends ajdp<T> {
    private T[] a;

    /* renamed from: ajpc$a */
    static final class a<T> extends ajgi<T> {
        final ajdv<? super T> a;
        final T[] b;
        boolean c;
        private int d;
        private volatile boolean e;

        a(ajdv<? super T> ajdv, T[] tArr) {
            this.a = ajdv;
            this.b = tArr;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.c = true;
            return 1;
        }

        public final void clear() {
            this.d = this.b.length;
        }

        public final void dispose() {
            this.e = true;
        }

        public final boolean isDisposed() {
            return this.e;
        }

        public final boolean isEmpty() {
            return this.d == this.b.length;
        }

        public final T poll() {
            int i = this.d;
            Object[] objArr = this.b;
            if (i == objArr.length) {
                return null;
            }
            this.d = i + 1;
            return ajfv.a(objArr[i], "The array element is null");
        }
    }

    public ajpc(T[] tArr) {
        this.a = tArr;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv, this.a);
        ajdv.a(aVar);
        if (!aVar.c) {
            Object[] objArr = aVar.b;
            int length = objArr.length;
            for (int i = 0; i < length && !aVar.isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    ajdv ajdv2 = aVar.a;
                    StringBuilder stringBuilder = new StringBuilder("The ");
                    stringBuilder.append(i);
                    stringBuilder.append("th element is null");
                    ajdv2.a(new NullPointerException(stringBuilder.toString()));
                    return;
                }
                aVar.a.a(obj);
            }
            if (!aVar.isDisposed()) {
                aVar.a.a();
            }
        }
    }
}
