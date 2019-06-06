package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jvx */
public final class jvx {
    private static final AtomicReference<a> a = new AtomicReference();

    /* renamed from: jvx$a */
    public static class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final jwq d;
        private ExecutorService e = null;
        private zfw f;

        /* renamed from: jvx$a$a */
        public static class a {
            final zfw a;
            boolean b = false;
            boolean c = false;
            boolean d = false;
            jwq e = null;
            private ExecutorService f = null;

            public a(zfw zfw) {
                this.a = (zfw) Preconditions.checkNotNull(zfw);
            }

            public final a a() {
                this.c = true;
                return this;
            }

            public final a a(jwq jwq) {
                this.e = (jwq) Preconditions.checkNotNull(jwq);
                return this;
            }

            public final a a(boolean z) {
                this.b = z;
                return this;
            }

            public final a b() {
                this.d = true;
                return this;
            }

            public final a c() {
                return new a(this);
            }
        }

        a(a aVar) {
            this.a = aVar.b;
            this.b = aVar.c;
            this.c = aVar.d;
            this.f = aVar.a;
            this.d = aVar.e;
        }
    }

    static {
        AtomicReference atomicReference = new AtomicReference();
    }

    public static a a() {
        a aVar = (a) a.get();
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Image loading settings must be initialized first!");
    }

    public static void a(a aVar) {
        if (aVar != null) {
            a.set(aVar);
            return;
        }
        throw new IllegalArgumentException("Image loading settings can not be null");
    }
}
