package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.mof.a;
import java.io.File;
import java.util.Set;

/* renamed from: mjo */
public abstract class mjo {

    /* renamed from: mjo$d */
    public interface d {
        ide I();

        miw K_();

        zgb u();

        Context v();

        Supplier<iha> w();

        Supplier<kpc> x();
    }

    /* renamed from: mjo$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public static a a(d dVar) {
            akcr.b(dVar, "parentComponent");
            return mkb.c().a(true).b(false).a((mof) a.a).a((mng) mng.a.a).a((mok) mok.a.a).a((Set) ajyy.a).a((lnr) lnr.a.a).a((mio) mio.a.a).a((mmh) defpackage.mmh.b.a).a(dVar).a().b();
        }
    }

    /* renamed from: mjo$a */
    public static abstract class a {
        public abstract a a();

        public abstract a a(Set<? extends akbl<? super mmt, ? extends mph>> set);

        public abstract a a(lnr lnr);

        public abstract a a(mio mio);

        public abstract a a(d dVar);

        public abstract a a(mmh mmh);

        public abstract a a(mng mng);

        public abstract a a(mns mns);

        public abstract a a(mof mof);

        public abstract a a(mok<? super moc> mok);

        public abstract a a(mxa mxa);

        public abstract a a(boolean z);

        public abstract a b();

        public abstract a b(boolean z);

        public abstract mjo c();
    }

    /* renamed from: mjo$c */
    public static final class c {

        /* renamed from: mjo$c$b */
        public static final class b implements mpc {
            final /* synthetic */ Context a;
            private final ajxe b = ajxh.a(new a(this));

            /* renamed from: mjo$c$b$a */
            static final class a extends akcs implements akbk<File> {
                private /* synthetic */ b a;

                a(b bVar) {
                    this.a = bVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    return this.a.a.getCacheDir();
                }
            }

            static {
                new aken[1][0] = new akdc(akde.a(b.class), "cacheDir", "getCacheDir()Ljava/io/File;");
            }

            b(Context context) {
                this.a = context;
            }

            public final File a() {
                abmr.a("TrackingDataCacheResolver#resolve must not be called on the main thread");
                return new File((File) this.b.b(), "trackingData");
            }
        }

        /* renamed from: mjo$c$c */
        static final class c extends akcs implements akbk<mpf> {
            private /* synthetic */ mpc a;
            private /* synthetic */ mxa b;
            private /* synthetic */ mpd c;
            private /* synthetic */ zfw d;

            c(mpc mpc, mxa mxa, mpd mpd, zfw zfw) {
                this.a = mpc;
                this.b = mxa;
                this.c = mpd;
                this.d = zfw;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                mpc mpc = this.a;
                mxa mxa = this.b;
                mpd mpd = this.c;
                zfw zfw = this.d;
                String str = "cacheResolver";
                akcr.b(mpc, str);
                String str2 = "remoteServiceFactory";
                akcr.b(mxa, str2);
                String str3 = "trackingDataChecksumValidator";
                akcr.b(mpd, str3);
                String str4 = "qualifiedSchedulers";
                akcr.b(zfw, str4);
                akcr.b(mpc, str);
                akcr.b(mpd, str3);
                akcr.b(zfw, str4);
                mmy mmy = new mmy(mpc, mpd, zfw);
                akcr.b(mxa, str2);
                akcr.b(mpc, "trackingDataCacheResolver");
                akcr.b(mpd, str3);
                akcr.b(zfw, str4);
                return mpe.a(mmy, new mnl(mxa, mpc, mpd, zfw));
            }
        }

        /* renamed from: mjo$c$a */
        public static final class a implements mxa {
            private /* synthetic */ akwt a;

            a(akwt akwt) {
                this.a = akwt;
            }

            public final <T> T a(Class<T> cls) {
                akcr.b(cls, "t");
                return this.a.a((Class) cls);
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final Supplier<mmf> a(Context context, mot mot, zfw zfw, Supplier<iha> supplier, miw miw, mka mka, mpf mpf, boolean z, boolean z2, mng mng, mns mns, lnr lnr, Set<? extends akbl<? super mmt, ? extends mph>> set, mio mio, mmh mmh, Supplier<kpc> supplier2, boolean z3, boolean z4) {
            Context context2 = context;
            zfw zfw2 = zfw;
            Supplier<iha> supplier3 = supplier;
            miw miw2 = miw;
            mka mka2 = mka;
            mpf mpf2 = mpf;
            mng mng2 = mng;
            lnr lnr2 = lnr;
            Set<? extends akbl<? super mmt, ? extends mph>> set2 = set;
            mio mio2 = mio;
            mmh mmh2 = mmh;
            Supplier<kpc> supplier4 = supplier2;
            String str = "context";
            akcr.b(context2, str);
            String str2 = "qualifiedSchedulers";
            akcr.b(zfw2, str2);
            String str3 = "serializationHelperSupplier";
            akcr.b(supplier3, str3);
            String str4 = "configurationRepository";
            akcr.b(miw2, str4);
            String str5 = "coreResourceManager";
            akcr.b(mka2, str5);
            String str6 = str5;
            akcr.b(mpf2, "trackingDataObservable");
            str5 = "nativeExceptionHandler";
            akcr.b(mng2, str5);
            String str7 = str5;
            str5 = "assetUploader";
            akcr.b(lnr2, str5);
            String str8 = str5;
            str5 = "uriDataHandlerFactories";
            akcr.b(set2, str5);
            String str9 = str5;
            str5 = "systemUiElementsPositionProvider";
            akcr.b(mio2, str5);
            String str10 = str5;
            str5 = "fallbackGestureHandler";
            akcr.b(mmh2, str5);
            String str11 = str5;
            str5 = "codecLeasingEngineSupplier";
            akcr.b(supplier4, str5);
            if (mot != null) {
                Supplier ofInstance = Suppliers.ofInstance(mot);
                if (ofInstance != null) {
                    return ofInstance;
                }
            }
            String str12 = str5;
            mhk mhk = mhk.a.a;
            akcr.b(context2, str);
            akcr.b(mhk, "clock");
            akcr.b(zfw2, str2);
            akcr.b(supplier3, str3);
            akcr.b(mpf2, "trackingDataRepository");
            str = str6;
            akcr.b(miw, str4);
            akcr.b(mka2, str);
            akcr.b(mng2, str7);
            akcr.b(lnr2, str8);
            akcr.b(set2, str9);
            akcr.b(mio2, str10);
            akcr.b(mmh2, str11);
            akcr.b(supplier4, str12);
            return new mjp(mkx.a.a(new mmu(context, mhk, zfw, supplier, mpf, miw, z, mka, mng, mns, lnr, set, mio, z2, mmh, supplier2, z3, z4)));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mni a();

    public abstract Supplier<mmf> b();
}
