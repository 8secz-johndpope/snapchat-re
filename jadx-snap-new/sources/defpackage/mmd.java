package defpackage;

import com.looksery.sdk.DeviceClass;

/* renamed from: mmd */
public final class mmd {

    /* renamed from: mmd$c */
    static final class c<T1, T2, T3, R> implements ajfd<Long, Long, Long, ajxr<? extends Long, ? extends Long, ? extends Long>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return new ajxr(Long.valueOf(((Number) obj).longValue()), Long.valueOf(((Number) obj2).longValue()), Long.valueOf(((Number) obj3).longValue()));
        }
    }

    /* renamed from: mmd$a */
    static final class a<T, R> implements ajfc<Long, DeviceClass> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return mmd.a(new ajxr(Long.valueOf(5), Long.valueOf(4), Long.valueOf(1)), l.longValue());
        }
    }

    /* renamed from: mmd$b */
    static final class b<Upstream, Downstream> implements ajdu<Long, DeviceClass> {
        final /* synthetic */ ajdp a;
        final /* synthetic */ ajdp b;
        final /* synthetic */ ajdp c;
        final /* synthetic */ ajfc d;

        /* renamed from: mmd$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final Long l = (Long) obj;
                akcr.b(l, "value");
                return this.a.a.u(new ajfc<T, ajdt<? extends R>>(this) {
                    final /* synthetic */ 1 a;

                    /* renamed from: mmd$b$1$1$1 */
                    static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                        private /* synthetic */ 1 a;

                        1(1 1) {
                            this.a = 1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            final ajxr ajxr = (ajxr) obj;
                            akcr.b(ajxr, "setting");
                            Long l = l;
                            if (l != null && l.longValue() == -1) {
                                return this.a.a.a.c.u(new ajfc<T, ajdt<? extends R>>() {
                                    public final /* synthetic */ Object apply(Object obj) {
                                        Long l = (Long) obj;
                                        akcr.b(l, "unknown");
                                        Object obj2 = ajxr;
                                        akcr.a(obj2, "setting");
                                        return ajdp.b(mmd.a(obj2, l.longValue()));
                                    }
                                });
                            }
                            Object obj2 = l;
                            akcr.a(obj2, "value");
                            return ajdp.b(mmd.a(ajxr, obj2.longValue()));
                        }
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        akcr.b(bool, "enabled");
                        if (!bool.booleanValue()) {
                            return ajdp.b(this.a.a.d.apply(l));
                        }
                        obj = this.a.a.b;
                        akcr.a(obj, "mapping");
                        return obj.u(new 1(this));
                    }
                });
            }
        }

        b(ajdp ajdp, ajdp ajdp2, ajdp ajdp3, ajfc ajfc) {
            this.a = ajdp;
            this.b = ajdp2;
            this.c = ajdp3;
            this.d = ajfc;
        }

        public final /* synthetic */ ajdt apply(ajdp ajdp) {
            akcr.b(ajdp, "it");
            return ajdp.u(new 1(this));
        }
    }

    static {
        mmd mmd = new mmd();
    }

    private mmd() {
    }

    public static ajdu<Long, DeviceClass> a(ajdp<Boolean> ajdp, ajdp<Long> ajdp2, ajdp<Long> ajdp3, ajdp<Long> ajdp4, ajdp<Long> ajdp5) {
        akcr.b(ajdp, "deviceClusterEnabled");
        akcr.b(ajdp2, "highEndStart");
        akcr.b(ajdp3, "midEndStart");
        akcr.b(ajdp4, "lowEndStart");
        akcr.b(ajdp5, "unknownDeviceCluster");
        return new b(ajdp, ajdp.b(ajdp2, ajdp3, ajdp4, c.a), ajdp5, a.a);
    }

    public static final /* synthetic */ DeviceClass a(ajxr ajxr, long j) {
        return j >= ((Number) ajxr.a).longValue() ? DeviceClass.HIGH_END : j >= ((Number) ajxr.b).longValue() ? DeviceClass.MID_END : (j >= ((Number) ajxr.c).longValue() || j < 0) ? DeviceClass.LOW_END : DeviceClass.BARELY_WORKING;
    }
}
