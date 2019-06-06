package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SqlDelightDbManager;
import com.snap.location.map.SharingPreferenceHttpInterface;
import com.snap.map.core.SnapMapHttpInterface;
import com.snapchat.maps.api.locationsharing.LocationRequestHttpInterface;
import defpackage.acmx.a;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: addn */
public final class addn {

    /* renamed from: addn$b */
    public static final class b {

        /* renamed from: addn$b$a */
        static final class a<V> implements Callable<T> {
            private /* synthetic */ aipn a;

            a(aipn aipn) {
                this.a = aipn;
            }

            public final /* synthetic */ Object call() {
                return (nll) this.a.get();
            }
        }

        /* renamed from: addn$b$b */
        static final class b<V> implements Callable<T> {
            private /* synthetic */ aipn a;

            b(aipn aipn) {
                this.a = aipn;
            }

            public final /* synthetic */ Object call() {
                return (nln) this.a.get();
            }
        }

        public static a a(nkm nkm) {
            akcr.b(nkm, "impl");
            return nkm;
        }

        public static ajdx<fts> a(aipn<nll> aipn) {
            akcr.b(aipn, "kashmirHandler");
            Object a = ajdx.c((Callable) new a(aipn)).a();
            akcr.a(a, "Single.fromCallable<UriO…irHandler.get() }.cache()");
            return a;
        }

        public static SqlDelightDbManager a(Context context, gqr gqr, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
            Context context2 = context;
            akcr.b(context, "context");
            gqr gqr2 = gqr;
            akcr.b(gqr, "exceptionTracker");
            zgb zgb2 = zgb;
            akcr.b(zgb, "schedulersProvider");
            ihh ihh2 = ihh;
            akcr.b(ihh, "clock");
            DbLogger dbLogger2 = dbLogger;
            akcr.b(dbLogger2, "dbLogger");
            igb igb2 = igb;
            akcr.b(igb2, "noDiskExceptionDetector");
            zfw a = zgb.a(adcw.b.callsite("MapDbManager"));
            return new nlc(context2, gqr2, zgb2, a.p(), a.i(), a.p().a(), ihh2, dbLogger2, igb2);
        }

        public static SnapMapHttpInterface a(gcy gcy) {
            akcr.b(gcy, "serviceFactory");
            Object a = gcy.a(SnapMapHttpInterface.class);
            akcr.a(a, "serviceFactory.create(Sn…ttpInterface::class.java)");
            return (SnapMapHttpInterface) a;
        }

        public static Set<gfp> a() {
            return ajzt.a((Object[]) new gfz[]{nlk.a, nlm.a});
        }

        public static ygh a(nju nju) {
            akcr.b(nju, "mapFileGroup");
            return nju;
        }

        public static ajdx<fts> b(aipn<nln> aipn) {
            akcr.b(aipn, "worldEffectsHandler");
            Object a = ajdx.c((Callable) new b(aipn)).a();
            akcr.a(a, "Single.fromCallable<UriO…tsHandler.get() }.cache()");
            return a;
        }

        public static SharingPreferenceHttpInterface b(gcy gcy) {
            akcr.b(gcy, "serviceFactory");
            Object a = gcy.a(SharingPreferenceHttpInterface.class);
            akcr.a(a, "serviceFactory.create(Sh…ttpInterface::class.java)");
            return (SharingPreferenceHttpInterface) a;
        }

        public static LocationRequestHttpInterface c(gcy gcy) {
            akcr.b(gcy, "serviceFactory");
            Object a = gcy.a(LocationRequestHttpInterface.class);
            akcr.a(a, "serviceFactory.create(Lo…ttpInterface::class.java)");
            return (LocationRequestHttpInterface) a;
        }
    }

    /* renamed from: addn$a */
    public static final class a {
        public static adbg a(njn njn) {
            akcr.b(njn, "mapClientReactiveImpl");
            return njn;
        }

        public static adcl a(nku nku) {
            akcr.b(nku, "snapMapClientImpl");
            return nku;
        }

        public static adcu a(nkk nkk) {
            akcr.b(nkk, "impl");
            return nkk;
        }

        public static adcz a(acsy acsy) {
            akcr.b(acsy, "mapStoryShareClientImpl");
            return acsy;
        }

        public static ajdp<defpackage.j.a> a(ajwl<defpackage.j.a> ajwl) {
            akcr.b(ajwl, "impl");
            return ajwl;
        }

        public static ajwl<defpackage.j.a> a() {
            Object ajwl = new ajwl();
            akcr.a(ajwl, "BehaviorSubject.create<Lifecycle.Event>()");
            return ajwl;
        }

        public static nfs a(njh njh) {
            akcr.b(njh, "impl");
            return njh;
        }
    }

    /* renamed from: addn$c */
    public static final class c {
        public static acmf a(nki nki, acyr acyr) {
            akcr.b(nki, "configProvider");
            akcr.b(acyr, "mapBoxHostDelegateFactory");
            return nki.d() ? acyr : acyr;
        }
    }
}
