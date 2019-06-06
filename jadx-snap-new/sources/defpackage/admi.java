package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: admi */
public final class admi {

    /* renamed from: admi$a */
    static final class a<T> implements ajfb<T> {
        private /* synthetic */ AtomicInteger a;

        a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final void accept(T t) {
            this.a.incrementAndGet();
        }
    }

    /* renamed from: admi$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ AtomicBoolean a;
        private /* synthetic */ akbl b;

        b(AtomicBoolean atomicBoolean, akbl akbl) {
            this.a = atomicBoolean;
            this.b = akbl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            if (this.a.compareAndSet(false, true)) {
                akbl akbl = this.b;
                akcr.a(obj, "it");
                akbl.invoke(obj);
            }
        }
    }

    /* renamed from: admi$c */
    static final class c implements ajev {
        private /* synthetic */ AtomicBoolean a;
        private /* synthetic */ AtomicInteger b;
        private /* synthetic */ akbl c;

        c(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, akbl akbl) {
            this.a = atomicBoolean;
            this.b = atomicInteger;
            this.c = akbl;
        }

        public final void run() {
            if (this.a.compareAndSet(false, true)) {
                int i = this.b.get();
                if (i > 0) {
                    this.c.invoke(Integer.valueOf(i));
                }
            }
        }
    }

    public static final <T> ajdp<T> a(ajdp<T> ajdp, akbl<? super Integer, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(akbl, "onSuccess");
        akcr.b(akbl2, "onError");
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object a = ajdp.d((ajfb) new a(atomicInteger)).c((ajfb) new b(atomicBoolean, akbl2)).a((ajev) new c(atomicBoolean, atomicInteger, akbl));
        akcr.a(a, "this.doOnNext {\n        … disposed\n        }\n    }");
        return a;
    }
}
