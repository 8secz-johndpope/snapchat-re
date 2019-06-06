package defpackage;

import java.util.Queue;

/* renamed from: akv */
public final class akv<A, B> {
    public final app<a<A>, B> a;

    /* renamed from: akv$a */
    public static final class a<A> {
        private static final Queue<a<?>> a = aps.a(0);
        private int b;
        private int c;
        private A d;

        private a() {
        }

        public static <A> a<A> a(A a) {
            a aVar = (a) a.poll();
            if (aVar == null) {
                aVar = new a();
            }
            aVar.d = a;
            aVar.c = 0;
            aVar.b = 0;
            return aVar;
        }

        public final void a() {
            a.offer(this);
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

    public akv() {
        this(250);
    }

    public akv(int i) {
        this.a = new app<a<A>, B>(i) {
            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
                ((a) obj).a();
            }
        };
    }
}
