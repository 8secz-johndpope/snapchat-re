package defpackage;

import defpackage.py.1;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: pl */
public final class pl {
    public final Executor a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    public final py b;
    public final int c;
    public final int d;
    public final int e;
    private int f;

    /* renamed from: pl$a */
    public static final class a {
        py a;
        int b = 4;
        int c = Integer.MAX_VALUE;
        int d = 20;
        private int e = 0;

        public final a a() {
            this.d = Math.min(20, 50);
            return this;
        }

        public final a a(py pyVar) {
            this.a = pyVar;
            return this;
        }

        public final a b() {
            this.b = 2;
            return this;
        }

        public final pl c() {
            return new pl(this);
        }
    }

    pl(a aVar) {
        this.b = aVar.a == null ? new 1() : aVar.a;
        this.c = aVar.b;
        this.f = 0;
        this.d = aVar.c;
        this.e = aVar.d;
    }
}
