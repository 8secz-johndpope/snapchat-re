package defpackage;

import defpackage.akwi.a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: akwm */
final class akwm extends a {
    final Executor a;

    /* renamed from: akwm$a */
    static final class a<T> implements akwh<T> {
        final Executor a;
        final akwh<T> b;

        a(Executor executor, akwh<T> akwh) {
            this.a = executor;
            this.b = akwh;
        }

        public final akws<T> a() {
            return this.b.a();
        }

        public final void a(final akwj<T> akwj) {
            akwv.a((Object) akwj, "callback == null");
            this.b.a(new akwj<T>() {
                public final void a(akwh<T> akwh, final akws<T> akws) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            if (a.this.b.c()) {
                                akwj.a(a.this, new IOException("Canceled"));
                            } else {
                                akwj.a(a.this, akws);
                            }
                        }
                    });
                }

                public final void a(akwh<T> akwh, final Throwable th) {
                    a.this.a.execute(new Runnable() {
                        public final void run() {
                            akwj.a(a.this, th);
                        }
                    });
                }
            });
        }

        public final void b() {
            this.b.b();
        }

        public final boolean c() {
            return this.b.c();
        }

        /* renamed from: d */
        public final akwh<T> clone() {
            return new a(this.a, this.b.d());
        }
    }

    akwm(Executor executor) {
        this.a = executor;
    }

    public final akwi<?, ?> a(Type type) {
        if (akwv.a(type) != akwh.class) {
            return null;
        }
        type = akwv.e(type);
        return new akwi<Object, akwh<?>>() {
            public final /* synthetic */ Object a(akwh akwh) {
                return new a(akwm.this.a, akwh);
            }

            public final Type a() {
                return type;
            }
        };
    }
}
