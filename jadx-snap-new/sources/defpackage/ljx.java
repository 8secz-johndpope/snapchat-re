package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.snap.lenses.app.geo.GeoDataHttpInterface;
import defpackage.miw.b.a;
import java.util.TimeZone;

/* renamed from: ljx */
public abstract class ljx {

    /* renamed from: ljx$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ljx$d */
    public interface d {
        Context a();

        Supplier<nbl> b();

        zgb c();

        mxa d();

        miw e();
    }

    /* renamed from: ljx$a */
    public interface a extends mhi<ljx> {
        a a(ide ide);

        a a(d dVar);
    }

    /* renamed from: ljx$c */
    public static final class c {

        /* renamed from: ljx$c$a */
        static final class a extends akcs implements akbk<GeoDataHttpInterface> {
            private /* synthetic */ aipn a;

            a(aipn aipn) {
                this.a = aipn;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return (GeoDataHttpInterface) this.a.get();
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdp<Boolean> a(miw miw) {
            akcr.b(miw, "configurationRepository");
            Object c = miw.a(a.a).a(mja.LENSES_WEATHER_DATA_ENABLED).c(1).c();
            akcr.a(c, "configurationRepository\n…\n                .cache()");
            return c;
        }

        public static final GeoDataHttpInterface a(mxa mxa) {
            akcr.b(mxa, "remoteServiceFactory");
            return (GeoDataHttpInterface) mxa.a(GeoDataHttpInterface.class);
        }

        public static final TimeZone a() {
            Object obj = TimeZone.getDefault();
            akcr.a(obj, "TimeZone.getDefault()");
            return obj;
        }

        public static final mtr a(Supplier<nbl> supplier) {
            akcr.b(supplier, "currentLocationManager");
            return new ljt(supplier);
        }

        public static final mtv a(Context context, zgb zgb, ide ide, aipn<GeoDataHttpInterface> aipn, Supplier<nbl> supplier, ajdp<Boolean> ajdp, ajdp<String> ajdp2, TimeZone timeZone, mhk mhk) {
            ide ide2 = ide;
            aipn<GeoDataHttpInterface> aipn2 = aipn;
            ajdp<Boolean> ajdp3 = ajdp;
            Context context2 = context;
            akcr.b(context, "context");
            zgb zgb2 = zgb;
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide2, "attributedFeature");
            akcr.b(aipn2, "geoDataHttpInterface");
            Supplier<nbl> supplier2 = supplier;
            akcr.b(supplier2, "currentLocationManager");
            String str = "weatherEnabled";
            akcr.b(ajdp3, str);
            ajdp<String> ajdp4 = ajdp2;
            akcr.b(ajdp4, "weatherBaseUrl");
            TimeZone timeZone2 = timeZone;
            akcr.b(timeZone2, "timezone");
            mhk mhk2 = mhk;
            akcr.b(mhk2, "clock");
            mtv ljv = new ljv(context2, zgb.a(ide2.callsite("LensesWeatherRepository")), ajxh.a(new a(aipn2)), supplier2, ajdp4, timeZone2, mhk2, (byte) 0);
            akcr.b(ljv, "weatherRepository");
            akcr.b(ajdp3, str);
            return new mtu.a(ajdp3, ljv);
        }

        public static final ajdp<String> b(miw miw) {
            akcr.b(miw, "configurationRepository");
            Object c = miw.a(a.a).f(mja.LENSES_WEATHER_BASE_URL_KEY).c(1).c();
            akcr.a(c, "configurationRepository\n…\n                .cache()");
            return c;
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mtr c();

    public abstract mtv d();
}
