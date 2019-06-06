package defpackage;

import android.content.Context;
import android.location.Location;
import com.looksery.sdk.DeviceLocationTracker;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.Trackers;
import com.looksery.sdk.domain.LocationTrackingParameters;
import com.looksery.sdk.listener.GeoDataListener;
import defpackage.mmj.a;
import defpackage.mmj.b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mku */
public final class mku implements mmj {
    final ajws<a> a;
    final AtomicReference<Location> b = new AtomicReference();
    final mkx c;
    private final ajxe d = ajxh.a(new b(this));

    /* renamed from: mku$b */
    static final class b extends akcs implements akbk<ajdp<a>> {
        private /* synthetic */ mku a;

        b(mku mku) {
            this.a = mku;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f();
        }
    }

    /* renamed from: mku$c */
    static final class c extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0080 in {3, 7, 9} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
            /*
            r13 = this;
            r14 = (com.looksery.sdk.LSCoreManagerWrapper) r14;
            r0 = "receiver$0";
            defpackage.akcr.b(r14, r0);
            r0 = r13.a;
            r0 = (defpackage.mmj.b.b) r0;
            r0 = r0.a;
            r1 = r13.a;
            r1 = (defpackage.mmj.b.b) r1;
            r1 = r1.b;
            r2 = r13.a;
            r2 = (defpackage.mmj.b.b) r2;
            r2 = r2.c;
            r3 = r13.a;
            r3 = (defpackage.mmj.b.b) r3;
            r3 = r3.d;
            r3 = (java.lang.Iterable) r3;
            r4 = new java.util.ArrayList;
            r5 = 10;
            r5 = defpackage.ajyn.a(r3, r5);
            r4.<init>(r5);
            r4 = (java.util.Collection) r4;
            r3 = r3.iterator();
            r5 = r3.hasNext();
            if (r5 == 0) goto L_0x0052;
            r5 = r3.next();
            r5 = (defpackage.mmj.b.b.a) r5;
            r12 = new com.looksery.sdk.domain.GeoData$WeatherData$HourlyForecast;
            r7 = r5.b;
            r8 = r5.a;
            r9 = r5.e;
            r10 = r5.c;
            r11 = r5.d;
            r6 = r12;
            r6.<init>(r7, r8, r9, r10, r11);
            r4.add(r12);
            goto L_0x0032;
            r4 = (java.util.List) r4;
            r4 = (java.util.Collection) r4;
            r3 = 0;
            r3 = new com.looksery.sdk.domain.GeoData.WeatherData.HourlyForecast[r3];
            r3 = r4.toArray(r3);
            if (r3 == 0) goto L_0x0078;
            r3 = (com.looksery.sdk.domain.GeoData.WeatherData.HourlyForecast[]) r3;
            r4 = new com.looksery.sdk.domain.GeoData$WeatherData;
            r4.<init>(r0, r1, r2, r3);
            r0 = new com.looksery.sdk.domain.GeoData$TaxonomyData;
            r1 = "";
            r0.<init>(r1);
            r1 = new com.looksery.sdk.domain.GeoData;
            r1.<init>(r4, r0);
            r14.setGeoData(r1);
            r14 = defpackage.ajxw.a;
            return r14;
            r14 = new ajxt;
            r0 = "null cannot be cast to non-null type kotlin.Array<T>";
            r14.<init>(r0);
            throw r14;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mku$c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mku$a */
    static final class a extends akcq implements akbl<b, ajxw> {
        a(mku mku) {
            super(1, mku);
        }

        public final String getName() {
            return "processResult";
        }

        public final akej getOwner() {
            return akde.a(mku.class);
        }

        public final String getSignature() {
            return "processResult(Lcom/snap/lenses/core/GeoDataProcessor$Result;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            mku mku = (mku) this.receiver;
            if (bVar instanceof defpackage.mmj.b.a) {
                mku.b.set(((defpackage.mmj.b.a) bVar).a);
            } else if (bVar instanceof b.b) {
                mku.c.c(new c(bVar));
            }
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mku.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mku(final Context context, mkx mkx) {
        akcr.b(mkx, "lensCore");
        this.c = mkx;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ge…Request>().toSerialized()");
        this.a = r;
        this.c.c(new akbl<LSCoreManagerWrapper, ajxw>(this) {
            final /* synthetic */ mku a;

            /* renamed from: mku$1$a */
            static final class a implements GeoDataListener {
                private /* synthetic */ 1 a;

                a(1 1) {
                    this.a = 1;
                }

                public final void requestGeoData() {
                    this.a.a.a.a((Object) defpackage.mmj.a.b.a);
                }
            }

            /* renamed from: mku$1$b */
            public static final class b implements DeviceLocationTracker {
                private /* synthetic */ 1 a;

                b(1 1) {
                    this.a = 1;
                }

                public final Location getLocation() {
                    return (Location) this.a.a.b.get();
                }

                public final void start(LocationTrackingParameters locationTrackingParameters) {
                    akcr.b(locationTrackingParameters, "locationTrackingParameters");
                    this.a.a.a.a((Object) new a.a.a(locationTrackingParameters.getLocationUpdateIntervalMillis(), locationTrackingParameters.getDistanceFilterMeters()));
                }

                public final void stop() {
                    this.a.a.a.a((Object) defpackage.mmj.a.a.b.a);
                }
            }

            public final /* synthetic */ Object invoke(Object obj) {
                LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
                akcr.b(lSCoreManagerWrapper, "receiver$0");
                b bVar = new b(this);
                lSCoreManagerWrapper.setDeviceLocationTracker(bVar);
                lSCoreManagerWrapper.setGeoDataListener(new a(this));
                lSCoreManagerWrapper.setDeviceCompassTracker(Trackers.deviceCompass(context, bVar));
                return ajxw.a;
            }
        });
    }

    public final ajfb<b> a() {
        return new mkv(new a(this));
    }

    public final ajdp<a> b() {
        return (ajdp) this.d.b();
    }
}
