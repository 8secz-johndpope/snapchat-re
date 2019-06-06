package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: rvu */
public final class rvu implements gnb {
    final ajwy<ryw<ryz>> a;
    final ajwy<ftl> b;
    private final ajxe c = ajxh.a(b.a);
    private final ajxe d;
    private final ajxe e;
    private final gnq f;
    private final String g;
    private final List<gna> h;
    private final god i;

    /* renamed from: rvu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: rvu$e */
    static final class e extends akcs implements akbk<god> {
        final /* synthetic */ ajwy a;

        /* renamed from: rvu$e$1 */
        static final class 1 implements gns {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final void a(aajt aajt) {
                ((dib) this.a.a.get()).a(aajt);
            }
        }

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new god(new 1(this));
        }
    }

    /* renamed from: rvu$c */
    static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ rvu a;

        c(rvu rvu) {
            this.a = rvu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.b.get()).a((fth) fxm.SANITY_BACKGROUND_PREFETCH_ENABLED));
        }
    }

    /* renamed from: rvu$b */
    static final class b extends akcs implements akbk<List<? extends gna>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            r0 = new gna[5];
            r0[0] = new gna("30min", true, false, 0, 0, true, null, new gnm(gnn.BACKGROUND, 30, (byte) 0), 344);
            r0[1] = new gna("60min one-time", true, false, 0, 0, false, null, new gnm(gnn.BACKGROUND, 60, (byte) 0), 344);
            r0[2] = new gna("6am", true, false, 0, 0, true, new gnh(6, 0, null, 6), null, 408);
            r0[3] = new gna("3pm", true, false, 0, 0, true, new gnh(15, 0, null, 6), null, 408);
            r0[4] = new gna("7pm", true, false, 0, 0, true, new gnh(19, 0, null, 6), null, 408);
            return ajym.b((Object[]) r0);
        }
    }

    /* renamed from: rvu$d */
    static final class d<T> implements ajea<T> {
        private /* synthetic */ rvu a;
        private /* synthetic */ String b;

        /* renamed from: rvu$d$a */
        static final class a implements defpackage.ryw.a {
            private /* synthetic */ ajdy a;

            a(ajdy ajdy) {
                this.a = ajdy;
            }

            public final void onComplete(sat<sai> sat) {
                Object obj = this.a;
                akcr.a(obj, Event.EMITTER);
                if (!obj.isDisposed()) {
                    ajdy ajdy = this.a;
                    akcr.a((Object) sat, "result");
                    Object a = sat.a();
                    akcr.a(a, "result.response");
                    ajdy.a(Boolean.valueOf(a.b()));
                }
            }
        }

        d(rvu rvu, String str) {
            this.a = rvu;
            this.b = str;
        }

        public final void subscribe(ajdy<Boolean> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            a aVar = new a("https://cf-st.sc-cdn.net/ping/ping_res", sac.GET, c.LARGE_MEDIA, new HashSet());
            String str = this.b;
            if (str != null) {
                aVar.b("__xsc_local__:capture_media_id", str);
            }
            final Object a = ((ryw) this.a.a.get()).a(aVar.e(), new a(ajdy));
            akcr.a(a, "networkManager.get().sub…          }\n            }");
            ajdy.a((ajfa) new ajfa() {
                public final void cancel() {
                    a.b();
                }
            });
        }
    }

    /* renamed from: rvu$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ rvu a;
        final /* synthetic */ String b;

        /* renamed from: rvu$f$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final Integer num = (Integer) obj;
                akcr.b(num, AnalyticsListener.ANALYTICS_COUNT_KEY);
                return this.a.a.a(this.a.b).f(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        int intValue;
                        Boolean bool = (Boolean) obj;
                        akcr.b(bool, "it");
                        if (bool.booleanValue()) {
                            intValue = num.intValue() + 1;
                        } else {
                            obj = num;
                            akcr.a(obj, AnalyticsListener.ANALYTICS_COUNT_KEY);
                            intValue = obj.intValue();
                        }
                        return Integer.valueOf(intValue);
                    }
                });
            }
        }

        f(rvu rvu, String str) {
            this.a = rvu;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "success");
            return bool.booleanValue() ? ajdx.b(Integer.valueOf(1)).b(15, TimeUnit.SECONDS).a((ajfc) new 1(this)) : ajdx.b(Integer.valueOf(0));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rvu.class), "constraints", "getConstraints()Ljava/util/List;"), new akdc(akde.a(rvu.class), "prefetchAnalyticsListener", "getPrefetchAnalyticsListener()Lcom/snap/core/prefetch/impl/BlizzardBackgroundPrefetchAnalyticsListener;"), new akdc(akde.a(rvu.class), "enabled", "getEnabled()Z")};
        a aVar = new a();
    }

    public rvu(ajwy<ryw<ryz>> ajwy, ajwy<ftl> ajwy2, ajwy<dib> ajwy3) {
        akcr.b(ajwy, "networkManager");
        akcr.b(ajwy2, "configurationProvider");
        akcr.b(ajwy3, "blizzardEventLogger");
        this.a = ajwy;
        this.b = ajwy2;
        this.d = ajxh.a(new e(ajwy3));
        this.e = ajxh.a(new c(this));
        this.f = gnq.a;
        this.g = "MROOM_SANITY_1";
        this.h = (List) this.c.b();
        this.i = (god) this.d.b();
    }

    public final ajdx<Integer> a(gfu gfu, Map<String, String> map) {
        akcr.b(gfu, "contentResolver");
        String str = map != null ? (String) map.get("bg_prefetch_uuid_key") : null;
        Object c = a(str).a((ajfc) new f(this, str)).c(Integer.valueOf(-1));
        akcr.a(c, "ping(trackingId)\n       …   .onErrorReturnItem(-1)");
        return c;
    }

    /* Access modifiers changed, original: final */
    public final ajdx<Boolean> a(String str) {
        Object a;
        String str2;
        if (((ftl) this.b.get()).a((fth) fxm.SANITY_BACKGROUND_PREFETCH_RPC_ENABLED)) {
            a = ajdx.a((ajea) new d(this, str));
            str2 = "Single.create { emitter …ller.cancel() }\n        }";
        } else {
            a = ajdx.b(Boolean.TRUE);
            str2 = "Single.just(true)";
        }
        akcr.a(a, str2);
        return a;
    }

    public final boolean a() {
        ((ftl) this.b.get()).a((fth) fxm.SANITY_BACKGROUND_PREFETCH_ENABLED);
        ((ftl) this.b.get()).w(fxm.SANITY_BACKGROUND_PREFETCH_ENABLED);
        return ((Boolean) this.e.b()).booleanValue();
    }

    public final List<gna> b() {
        return this.h;
    }

    public final /* bridge */ /* synthetic */ gno c() {
        return this.i;
    }
}
