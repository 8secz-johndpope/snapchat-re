package defpackage;

import com.brightcove.player.event.EventType;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.unlockables.lib.network.api.LocationIndependentUnlockHttpInterface;
import defpackage.iib.a;
import defpackage.zst.b;
import defpackage.zst.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: zru */
public final class zru {
    final ajxe a;
    final ajxe b;
    final ftl c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f;

    /* renamed from: zru$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        h(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zpy.a.callsite("LocIndependentUnlockablesUnlocker"));
        }
    }

    /* renamed from: zru$g */
    static final class g extends akcs implements akbk<LocationIndependentUnlockHttpInterface> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LocationIndependentUnlockHttpInterface) this.a.get();
        }
    }

    /* renamed from: zru$i */
    static final class i extends akcs implements akbk<ajdx<a>> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((iib) this.a.get()).b();
        }
    }

    /* renamed from: zru$a */
    static final class a extends akcs implements akbk<ihh> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: zru$n */
    static final class n extends akcs implements akbk<zsg> {
        private /* synthetic */ ajwy a;

        n(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zsg) this.a.get();
        }
    }

    /* renamed from: zru$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zru a;
        private /* synthetic */ PersistableUnlockableType b;

        b(zru zru, PersistableUnlockableType persistableUnlockableType) {
            this.a = zru;
            this.b = persistableUnlockableType;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            String str = "TimeZone.getDefault()";
            LocationIndependentUnlockHttpInterface a;
            if (zrv.a[this.b.ordinal()] != 1) {
                a = ((LocationIndependentUnlockHttpInterface) this.a.e.b());
                aera aera = new aera();
                aera.f = Float.valueOf(aVar.e);
                aera.g = Float.valueOf(aVar.f);
                aera.h = Integer.valueOf(aVar.g);
                aera.i = Integer.valueOf(aVar.h);
                obj = TimeZone.getDefault();
                akcr.a(obj, str);
                aera.j = obj.getID();
                return a.fetchUnlockedFilterOrLens(aera);
            }
            a = ((LocationIndependentUnlockHttpInterface) this.a.e.b());
            aiad aiad = new aiad();
            aiad.a = "USER_UNLOCKED_STICKER_PACK";
            aiad.c = Float.valueOf(aVar.e);
            aiad.d = Float.valueOf(aVar.f);
            obj = TimeZone.getDefault();
            akcr.a(obj, str);
            aiad.b = obj.getID();
            return a.fetchUnlockedSticker(aiad);
        }
    }

    /* renamed from: zru$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (affs) fst.a(akxa);
        }
    }

    /* renamed from: zru$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ zru a;

        d(zru zru) {
            this.a = zru;
        }

        public final /* synthetic */ Object apply(Object obj) {
            affs affs = (affs) obj;
            akcr.b(affs, "it");
            ajwj ajwj = new ajwj(affs, ((ihh) this.a.b.b()).a(), TimeUnit.MILLISECONDS);
            akcr.b(ajwj, "timedUnlockables");
            obj = ajwj.a;
            akcr.a(obj, "timedUnlockables.value()");
            affs = (affs) obj;
            List list = affs.e;
            if (list == null) {
                list = ajyw.a;
            }
            List list2 = list;
            list = affs.c;
            if (list == null) {
                list = ajyw.a;
            }
            Collection arrayList = new ArrayList();
            for (Object next : r1) {
                if ((((aenr) next).u.booleanValue() ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            List list3 = (List) arrayList;
            List list4 = affs.c;
            if (list4 == null) {
                list4 = ajyw.a;
            }
            Collection arrayList2 = new ArrayList();
            for (Object next2 : list4) {
                Object obj2 = ((aenr) next2).u;
                akcr.a(obj2, "it.isLens");
                if (obj2.booleanValue()) {
                    arrayList2.add(next2);
                }
            }
            return new zsk.a(list3, (List) arrayList2, list2, null, TimeUnit.MILLISECONDS.convert(ajwj.b, ajwj.c), 8);
        }
    }

    /* renamed from: zru$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ PersistableUnlockableType a;

        e(PersistableUnlockableType persistableUnlockableType) {
            this.a = persistableUnlockableType;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zru$f */
    static final class f implements ajev {
        private /* synthetic */ zru a;
        private /* synthetic */ idd b;

        f(zru zru, idd idd) {
            this.a = zru;
            this.b = idd;
        }

        public final void run() {
            ((zsg) this.a.f.b()).a(zrt.LOC_INDEPENDENT_FETCH, this.b);
        }
    }

    /* renamed from: zru$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zru a;
        private /* synthetic */ b b;

        /* renamed from: zru$j$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akxa akxa = (akxa) obj;
                akcr.b(akxa, "it");
                return (aenr) fst.a(akxa);
            }
        }

        /* renamed from: zru$j$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                aenr aenr = (aenr) obj;
                akcr.b(aenr, EventType.RESPONSE);
                afag afag = aenr.X;
                if (afag != null) {
                    return new zsk.b.b(afag);
                }
                throw new IllegalStateException("sticker pack is not presented in ".concat(String.valueOf(aenr)));
            }
        }

        j(zru zru, b bVar) {
            this.a = zru;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            akcr.b((b) obj, "it");
            b bVar = this.b;
            if (bVar instanceof c) {
                obj = ((LocationIndependentUnlockHttpInterface) this.a.e.b()).unlockSticker((aikd) zru.a(this.b)).a((ajdw) this.a.a().b()).f(1.a).f(2.a);
                str = "httpInterface\n          …                        }";
            } else if ((bVar instanceof b.b) || (bVar instanceof b.a)) {
                obj = ((LocationIndependentUnlockHttpInterface) this.a.e.b()).unlockFilterOrLens((zrw) zru.a(this.b)).a((ajdw) this.a.a().b()).a(zsk.b.a.a);
                str = "httpInterface\n          …nlockSingle.FilterOrLens)";
            } else {
                throw new ajxk();
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: zru$k */
    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ b a;

        k(b bVar) {
            this.a = bVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zru$l */
    static final class l<T> implements ajfb<zsk.b> {
        private /* synthetic */ b a;

        l(b bVar) {
            this.a = bVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zru$m */
    static final class m implements ajev {
        private /* synthetic */ zru a;
        private /* synthetic */ idd b;

        m(zru zru, idd idd) {
            this.a = zru;
            this.b = idd;
        }

        public final void run() {
            ((zsg) this.a.f.b()).a(zrt.UNLOCK, this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zru.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(zru.class), "httpInterface", "getHttpInterface()Lcom/snap/unlockables/lib/network/api/LocationIndependentUnlockHttpInterface;"), new akdc(akde.a(zru.class), "screenParams", "getScreenParams()Lio/reactivex/Single;"), new akdc(akde.a(zru.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(zru.class), "unlockablesGrapheneLogger", "getUnlockablesGrapheneLogger()Lcom/snap/unlockables/lib/network/util/UnlockablesGrapheneLogger;")};
    }

    public zru(zgb zgb, ajwy<LocationIndependentUnlockHttpInterface> ajwy, ajwy<iib> ajwy2, ajwy<ihh> ajwy3, ajwy<zsg> ajwy4, ftl ftl) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "unlockHttpInterfaceProvider");
        akcr.b(ajwy2, "screenParameterProvider");
        akcr.b(ajwy3, "clockProvider");
        akcr.b(ajwy4, "unlockablesGrapheneLoggerProvider");
        akcr.b(ftl, "configProvider");
        this.c = ftl;
        this.d = ajxh.a(new h(zgb));
        this.e = ajxh.a(new g(ajwy));
        this.a = ajxh.a(new i(ajwy2));
        this.b = ajxh.a(new a(ajwy3));
        this.f = ajxh.a(new n(ajwy4));
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.d.b();
    }
}
