package defpackage;

/* renamed from: qvp */
public final class qvp {

    /* renamed from: qvp$a */
    static final class a extends akcs implements akbw<Long, Long, Long> {
        static {
            a aVar = new a();
        }

        a() {
            super(2);
        }

        public static Long a(Long l, Long l2) {
            return l == null ? l2 : l2 == null ? l : Long.valueOf(Math.max(l.longValue(), l2.longValue()));
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a.a((Long) obj, (Long) obj2);
        }
    }

    /* renamed from: qvp$b */
    static final class b extends akcs implements akbw<Long, Long, Long> {
        static {
            b bVar = new b();
        }

        b() {
            super(2);
        }

        public static Long a(Long l, Long l2) {
            return l == null ? l2 : l2 == null ? l : Long.valueOf(Math.min(l.longValue(), l2.longValue()));
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b.a((Long) obj, (Long) obj2);
        }
    }

    static final qvq a(qvq qvq, qvq qvq2) {
        qvq qvq3 = "";
        in.a(qvq3);
        if (qvq2 == null) {
            in.a();
            return qvq;
        }
        try {
            qvq3 = qvq2.a;
            qvq3 = qvq3 == qvq.a ? true : null;
            String str = "Check failed.";
            if (qvq3 != null) {
                qvq3 = akcr.a(qvq2.b, qvq.b);
                if (qvq3 != null) {
                    qvq qvq4 = new qvq(qvq.a, qvq.b, a.a(qvq2.c, qvq.c), b.a(qvq2.d, qvq.d), a.a(qvq2.e, qvq.e), b.a(qvq2.f, qvq.f), a.a(qvq2.g, qvq.g));
                    return qvq3;
                }
                throw new IllegalStateException(str.toString());
            }
            throw new IllegalStateException(str.toString());
        } finally {
            in.a();
        }
    }
}
