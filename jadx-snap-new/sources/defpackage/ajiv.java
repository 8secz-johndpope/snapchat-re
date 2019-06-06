package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajiv */
public final class ajiv<T> extends ajde<T> {
    private akuw<? extends T>[] b;
    private boolean c = false;

    /* renamed from: ajiv$a */
    static final class a<T> extends ajuh implements ajdh<T> {
        private akux<? super T> a;
        private akuw<? extends T>[] b;
        private boolean e = false;
        private AtomicInteger f = new AtomicInteger();
        private int g;
        private List<Throwable> h;
        private long i;

        a(akuw<? extends T>[] akuwArr, boolean z, akux<? super T> akux) {
            this.a = akux;
            this.b = akuwArr;
        }

        public final void a() {
            if (this.f.getAndIncrement() == 0) {
                akuw[] akuwArr = this.b;
                int length = akuwArr.length;
                int i = this.g;
                while (i != length) {
                    akuw akuw = akuwArr[i];
                    if (akuw == null) {
                        Throwable nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.e) {
                            List list = this.h;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.h = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.a.a(nullPointerException);
                            return;
                        }
                    }
                    long j = this.i;
                    if (j != 0) {
                        this.i = 0;
                        b(j);
                    }
                    akuw.a(this);
                    i++;
                    this.g = i;
                    if (this.f.decrementAndGet() == 0) {
                    }
                }
                Iterable iterable = this.h;
                if (iterable == null) {
                    this.a.a();
                } else if (iterable.size() == 1) {
                    this.a.a((Throwable) iterable.get(0));
                } else {
                    this.a.a(new ajeo(iterable));
                }
            }
        }

        public final void a(akuy akuy) {
            b(akuy);
        }

        public final void a(T t) {
            this.i++;
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            if (this.e) {
                List list = this.h;
                if (list == null) {
                    list = new ArrayList((this.b.length - this.g) + 1);
                    this.h = list;
                }
                list.add(th);
                a();
                return;
            }
            this.a.a(th);
        }
    }

    public ajiv(akuw<? extends T>[] akuwArr) {
        this.b = akuwArr;
    }

    public final void a_(akux<? super T> akux) {
        akuy aVar = new a(this.b, false, akux);
        akux.a(aVar);
        aVar.a();
    }
}
