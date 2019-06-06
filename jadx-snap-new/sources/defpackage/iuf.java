package defpackage;

/* renamed from: iuf */
public final class iuf implements sem {
    final aipn<iyw> a;
    final aipn<ftl> b;

    /* renamed from: iuf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iuf$b */
    public static final class b<T1, T2, T3, T4, R> implements ajfe<T1, T2, T3, T4, R> {
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean z;
            Object obj = (Long) t4;
            Object obj2 = (Long) t3;
            Long l = (Long) t1;
            if (((Number) t2).intValue() > 0 && (l == null || l.longValue() != -1)) {
                long longValue = l.longValue();
                akcr.a(obj2, "lastSeenAddedMeMs");
                if (longValue > obj2.longValue()) {
                    long longValue2 = l.longValue();
                    akcr.a(obj, "lastSeenResurrectedAddedMeMs");
                    if (longValue2 > obj.longValue()) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: iuf$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ iuf a;

        /* renamed from: iuf$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return ((iyw) this.a.a.a.get()).f();
                }
                obj = ajdp.b(Integer.valueOf(0));
                akcr.a(obj, "Observable.just(0)");
                return obj;
            }
        }

        c(iuf iuf) {
            this.a = iuf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? ((ftl) this.a.b.get()).p(jic.ANDROID_RESURRECT_TRIGGER_BADGE).k((ajfc) new 1(this)) : ajdp.b(Integer.valueOf(0));
        }
    }

    static {
        a aVar = new a();
    }

    public iuf(aipn<iyw> aipn, aipn<ftl> aipn2) {
        akcr.b(aipn, "friendingClient");
        akcr.b(aipn2, "config");
        this.a = aipn;
        this.b = aipn2;
    }

    public final ajdp<Integer> a() {
        Object t = ((ftl) this.b.get()).t(jic.RES_7_DAY_IN_MS);
        akcr.a(t, "config.get().observeLong…ationKey.RES_7_DAY_IN_MS)");
        ajdp f = ((iyw) this.a.get()).f();
        Object t2 = ((ftl) this.b.get()).t(jic.LAST_SEEN_ADDED_ME_TIMESTAMP);
        akcr.a(t2, "config.get().observeLong…_SEEN_ADDED_ME_TIMESTAMP)");
        Object t3 = ((ftl) this.b.get()).t(jic.LAST_TIME_TO_SEE_RESURRECTION_ADDED_ME_TIMESTAMP);
        akcr.a(t3, "config.get().observeLong…CTION_ADDED_ME_TIMESTAMP)");
        ajdp a = ajdp.a((ajdt) t, (ajdt) f, (ajdt) t2, (ajdt) t3, (ajfe) new b());
        if (a == null) {
            akcr.a();
        }
        t = a.k((ajfc) new c(this));
        akcr.a(t, "combineLatest(\n         …)\n            }\n        }");
        return t;
    }
}
