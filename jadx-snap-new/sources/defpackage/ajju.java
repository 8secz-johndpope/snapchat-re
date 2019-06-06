package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajju */
public final class ajju<T> extends ajde<T> {
    private T[] b;

    /* renamed from: ajju$c */
    static abstract class c<T> extends ajud<T> {
        final T[] a;
        int b;
        volatile boolean c;

        c(T[] tArr) {
            this.a = tArr;
        }

        public final int a(int i) {
            return i & 1;
        }

        public abstract void a();

        public final void a(long j) {
            if (ajui.b(j) && ajum.a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                    return;
                }
                b(j);
            }
        }

        public final void b() {
            this.c = true;
        }

        public abstract void b(long j);

        public final void clear() {
            this.b = this.a.length;
        }

        public final boolean isEmpty() {
            return this.b == this.a.length;
        }

        public final T poll() {
            int i = this.b;
            Object[] objArr = this.a;
            if (i == objArr.length) {
                return null;
            }
            this.b = i + 1;
            return ajfv.a(objArr[i], "array element is null");
        }
    }

    /* renamed from: ajju$b */
    static final class b<T> extends c<T> {
        private akux<? super T> d;

        b(akux<? super T> akux, T[] tArr) {
            super(tArr);
            this.d = akux;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            Object[] objArr = this.a;
            int length = objArr.length;
            akux akux = this.d;
            int i = this.b;
            while (i != length) {
                if (!this.c) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        akux.a(new NullPointerException("array element is null"));
                        return;
                    } else {
                        akux.a(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.c) {
                akux.a();
            }
        }

        /* Access modifiers changed, original: final */
        public final void b(long j) {
            Object[] objArr = this.a;
            int length = objArr.length;
            int i = this.b;
            akux akux = this.d;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            if (!this.c) {
                                akux.a();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.b = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.c) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            akux.a(new NullPointerException("array element is null"));
                            return;
                        }
                        akux.a(obj);
                        j++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: ajju$a */
    static final class a<T> extends c<T> {
        private ajfw<? super T> d;

        a(ajfw<? super T> ajfw, T[] tArr) {
            super(tArr);
            this.d = ajfw;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            Object[] objArr = this.a;
            int length = objArr.length;
            ajfw ajfw = this.d;
            int i = this.b;
            while (i != length) {
                if (!this.c) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        ajfw.a((Throwable) new NullPointerException("array element is null"));
                        return;
                    } else {
                        ajfw.b(obj);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.c) {
                ajfw.a();
            }
        }

        /* Access modifiers changed, original: final */
        public final void b(long j) {
            Object[] objArr = this.a;
            int length = objArr.length;
            int i = this.b;
            ajfw ajfw = this.d;
            long j2 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j2 || i == length) {
                        if (i == length) {
                            if (!this.c) {
                                ajfw.a();
                            }
                            return;
                        }
                        j2 = get();
                        if (j == j2) {
                            this.b = i;
                            j2 = addAndGet(-j);
                        }
                    } else if (!this.c) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            ajfw.a((Throwable) new NullPointerException("array element is null"));
                            return;
                        }
                        if (ajfw.b(obj)) {
                            j++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public ajju(T[] tArr) {
        this.b = tArr;
    }

    public final void a_(akux<? super T> akux) {
        akux.a(akux instanceof ajfw ? new a((ajfw) akux, this.b) : new b(akux, this.b));
    }
}
