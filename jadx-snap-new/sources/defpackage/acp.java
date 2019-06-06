package defpackage;

import java.util.Queue;

/* renamed from: acp */
public final class acp<A, B> {
    public final ahi<a<A>, B> a;

    /* renamed from: acp$a */
    public static final class a<A> {
        private static final Queue<a<?>> a = ahm.a(0);
        private int b;
        private int c;
        private A d;

        private a() {
        }

        public static <A> a<A> a(A a) {
            a aVar;
            synchronized (a) {
                aVar = (a) a.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.d = a;
            aVar.c = 0;
            aVar.b = 0;
            return aVar;
        }

        public final void a() {
            synchronized (a) {
                a.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (this.d.equals(((a) obj).d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + 0;
        }
    }

    public acp() {
        this(250);
    }

    public acp(long j) {
        this.a = new ahi<a<A>, B>(j) {
            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
                ((a) obj).a();
            }
        };
    }

    public final B a(A a) {
        a a2 = a.a(a);
        Object b = this.a.b(a2);
        a2.a();
        return b;
    }
}
