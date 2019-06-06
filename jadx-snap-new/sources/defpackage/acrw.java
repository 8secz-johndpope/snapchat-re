package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Optional;
import com.snap.core.db.column.FeatureType;
import defpackage.gyz.b;
import defpackage.iez.a;
import java.util.List;

/* renamed from: acrw */
public final class acrw {
    final acsl a;
    final gwb b;
    final aipn<gfu> c;
    private final ajxe d = ajxh.a(f.a);
    private final ajxe e = ajxh.a(new b(this));
    private final adbg f;

    /* renamed from: acrw$a */
    static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aliv aliv = (aliv) obj;
            akcr.b(aliv, EventType.RESPONSE);
            return aliv.a != null ? ajdj.b(aliv.a) : ajvo.a(ajlu.a);
        }
    }

    /* renamed from: acrw$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ List a;
        private /* synthetic */ acrw b;

        /* renamed from: acrw$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((gej) obj, "it");
                return this.a.a;
            }
        }

        c(acrw acrw, List list) {
            this.b = acrw;
            this.a = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            if (list.isEmpty()) {
                return ajdx.b(this.a);
            }
            return ((gfu) this.b.c.get()).a(gxm.b(((gwg) list.get(0)).a, FeatureType.MAP), adcw.a(), false, new gdy[0]).f(new 1(this));
        }
    }

    /* renamed from: acrw$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ cgi a;

        d(cgi cgi) {
            this.a = cgi;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (defpackage.akxa) r2;
            r0 = "result";
            defpackage.akcr.b(r2, r0);
            r0 = r2.c();
            if (r0 != 0) goto L_0x0026;
        L_0x000d:
            r2 = r2.a();
            if (r2 == 0) goto L_0x001e;
        L_0x0013:
            r2 = r2.f();
            r2 = (defpackage.alit) r2;
            if (r2 == 0) goto L_0x001e;
        L_0x001b:
            r2 = r2.a;
            goto L_0x001f;
        L_0x001e:
            r2 = 0;
        L_0x001f:
            if (r2 == 0) goto L_0x0026;
        L_0x0021:
            r2 = com.google.common.base.Optional.of(r2);
            return r2;
        L_0x0026:
            r2 = com.google.common.base.Optional.absent();
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acrw$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acrw$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "models");
            return (gwu) list.get(0);
        }
    }

    /* renamed from: acrw$b */
    static final class b extends akcs implements akbk<gxa> {
        private /* synthetic */ acrw a;

        b(acrw acrw) {
            this.a = acrw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new gxa(this.a.a());
        }
    }

    /* renamed from: acrw$f */
    static final class f extends akcs implements akbk<gxc> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new gxc(gxb.SNAP_ROW_ID, gxe.ASC);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acrw.class), "snapOrderConfig", "getSnapOrderConfig()Lcom/snap/discover/playback/api/opera/SnapOrderConfig;"), new akdc(akde.a(acrw.class), "playbackItemProviderConfig", "getPlaybackItemProviderConfig()Lcom/snap/discover/playback/api/opera/PlaybackItemProviderConfig;")};
    }

    public acrw(adbg adbg, acsl acsl, gwb gwb, aipn<gfu> aipn) {
        akcr.b(adbg, "client");
        akcr.b(acsl, "manifestConverter");
        akcr.b(gwb, "repository");
        akcr.b(aipn, "contentResolver");
        this.f = adbg;
        this.a = acsl;
        this.b = gwb;
        this.c = aipn;
    }

    public final ajdj<alee> a(aliu aliu) {
        long a;
        akcr.b(aliu, "request");
        if (abss.a().b()) {
            syx syx = new syx();
            a = syx.a();
        } else {
            a = 0;
        }
        ajdx a2 = this.f.a(aliu);
        akcr.b(a2, "receiver$0");
        Object b = a2.b((ajfc) a.a);
        akcr.a(b, "flatMapMaybe { result ->…   Maybe.just(body)\n    }");
        b = b.a((ajfc) new a(a)).b(ajfu.g);
        akcr.a(b, "client.rpcGetPoiPlaylist…       .onErrorComplete()");
        return b;
    }

    public final ajdx<Optional<alee>> a(aclg aclg, cgi cgi) {
        cgi cgi2 = cgi;
        akcr.b(aclg, "snapMap");
        akcr.b(cgi2, "latLng");
        alis alis = new alis();
        Object i = aclg.i();
        String str = "Single.just(Optional.absent())";
        Object b;
        if (i == null) {
            b = ajdx.b(Optional.absent());
            akcr.a(b, str);
            return b;
        }
        akcr.a(i, "snapMap.tileManager ?: r…e.just(Optional.absent())");
        alis.a = i.a(acxv.HEAT);
        alis.b = adbu.a(cgi);
        i = aclg.j();
        akcr.a(i, "viewHost");
        double d = 0.0d;
        if (i.e()) {
            Object i2 = aclg.i();
            if (i2 != null) {
                akcr.a(i2, "tileManager ?: return 0.0");
                cgj a = i.n().a();
                if (a != null) {
                    i = i.j();
                    if (i != null) {
                        akcr.a(i, "viewHost.mapController ?: return 0.0");
                        Object e = i.e();
                        if (e != null) {
                            akcr.a(e, "controller.center ?: return 0.0");
                            alkj[] a2 = adbu.a(cgo.a(a.getLatSouth(), a.getLonWest()), cgo.a(a.getLatNorth(), a.getLonEast()), (double) Math.min(18, (int) Math.ceil(i.i())), e.getLongitude());
                            if (a2 != null) {
                                for (alkj a3 : a2) {
                                    acxf a4 = i2.a(a3);
                                    if (a4 != null) {
                                        d = Math.max(d, a4.f);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        alis.b(d);
        Object j = aclg.j();
        akcr.a(j, "snapMap.viewHost");
        acmj j2 = j.j();
        if (j2 == null) {
            b = ajdx.b(Optional.absent());
            akcr.a(b, str);
            return b;
        }
        akcr.a((Object) j2, "viewHost.mapController ?…e.just(Optional.absent())");
        double i3 = j2.i();
        alis.a(adbu.a((((float) Math.pow(1.03d, i3)) * 40.0f) * j.a(), cgi2, j2));
        alis.c(i3);
        b = this.f.a(alis).f(new d(cgi2));
        akcr.a(b, "client.rpcGetPlaylist(re…      }\n                }");
        return b;
    }

    public final ajdx<List<b>> a(List<b> list) {
        akcr.b(list, "groups");
        Object a = this.b.a(((b) list.get(0)).b, FeatureType.MAP, a()).e().a((ajfc) new c(this, list));
        akcr.a(a, "repository.loadPlayableS…roups }\n                }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final gxc a() {
        return (gxc) this.d.b();
    }

    public final gxa b() {
        return (gxa) this.e.b();
    }
}
