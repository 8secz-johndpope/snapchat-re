package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import defpackage.nfd.d;
import defpackage.nfe.c;
import defpackage.tnj.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: nff */
public final class nff implements nce {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private a f;
    private final ajxe g;

    /* renamed from: nff$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nff$d */
    static final class d extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: nff$g */
    static final class g extends akcs implements akbk<tnj> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tnj) this.a.get();
        }
    }

    /* renamed from: nff$e */
    static final class e extends akcs implements akbk<nfe> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nfe) this.a.get();
        }
    }

    /* renamed from: nff$b */
    static final class b extends akcs implements akbk<nfd> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nfd) this.a.get();
        }
    }

    /* renamed from: nff$f */
    static final class f extends akcs implements akbk<zfr> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ ide b;

        f(ajwy ajwy, ide ide) {
            this.a = ajwy;
            this.b = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(this.b.callsite("MushroomLocationPreferences")).m();
        }
    }

    /* renamed from: nff$c */
    static final class c extends akcs implements akbk<ajei> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajei) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nff.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(nff.class), "preferences", "getPreferences()Lcom/snap/prefs/Preferences;"), new akdc(akde.a(nff.class), "customFriendRepository", "getCustomFriendRepository()Lcom/snap/location/core/mushroomonly/CustomFriendEntryRepository;"), new akdc(akde.a(nff.class), "blacklistFriendRepository", "getBlacklistFriendRepository()Lcom/snap/location/core/mushroomonly/BlacklistFriendEntryRepository;"), new akdc(akde.a(nff.class), "dbScheduler", "getDbScheduler()Lcom/snap/taskexecution/scheduling/HandlerScheduler;"), new akdc(akde.a(nff.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;")};
        a aVar = new a();
    }

    public nff(ajwy<ftl> ajwy, ajwy<tnj> ajwy2, ajwy<nfe> ajwy3, ajwy<nfd> ajwy4, ajwy<zgb> ajwy5, ide ide, ajwy<ajei> ajwy6) {
        akcr.b(ajwy, "configProviderProvider");
        akcr.b(ajwy2, "preferencesProvider");
        akcr.b(ajwy3, "customFriendRepositoryProvider");
        akcr.b(ajwy4, "blacklistFriendRepositoryProvider");
        akcr.b(ajwy5, "schedulersProviderProvider");
        akcr.b(ide, "attributedFeature");
        akcr.b(ajwy6, "compositeDisposableProvider");
        this.a = ajxh.a(new d(ajwy));
        this.b = ajxh.a(new g(ajwy2));
        this.c = ajxh.a(new e(ajwy3));
        this.d = ajxh.a(new b(ajwy4));
        this.e = ajxh.a(new f(ajwy5, ide));
        this.g = ajxh.a(new c(ajwy6));
    }

    private final ftl P() {
        return (ftl) this.a.b();
    }

    private final tnj Q() {
        return (tnj) this.b.b();
    }

    private final nfe R() {
        return (nfe) this.c.b();
    }

    private final nfd S() {
        return (nfd) this.d.b();
    }

    private final zfr T() {
        return (zfr) this.e.b();
    }

    private final ajei U() {
        return (ajei) this.g.b();
    }

    private final synchronized a V() {
        a aVar = this.f;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        Object b = Q().b();
        this.f = b;
        akcr.a(b, "next");
        return b;
    }

    public final void A() {
        a V = V();
        fth fth = nfg.NYC_LAST_LOCATION_LATITUDE;
        Object a = nfg.NYC_LAST_LOCATION_LATITUDE.a();
        akcr.a(a, "InternalLocationConfigur…OCATION_LATITUDE.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Float) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }

    public final void B() {
        a V = V();
        fth fth = nfg.NYC_LAST_LOCATION_LONGITUDE;
        Object a = nfg.NYC_LAST_LOCATION_LONGITUDE.a();
        akcr.a(a, "InternalLocationConfigur…CATION_LONGITUDE.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Float) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }

    public final void C() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_GHOST_MODE_DURATION_TO_SET;
        Object a = nfg.NYC_SETTINGS_GHOST_MODE_DURATION_TO_SET.a();
        akcr.a(a, "InternalLocationConfigur…_DURATION_TO_SET.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Long) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Long");
    }

    public final void D() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_PENDING_SYNC;
        Object a = nfg.NYC_SETTINGS_PENDING_SYNC.a();
        akcr.a(a, "InternalLocationConfigur…NGS_PENDING_SYNC.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Boolean) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final void E() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_FETCHED_FROM_SERVER;
        Object a = nfg.NYC_SETTINGS_FETCHED_FROM_SERVER.a();
        akcr.a(a, "InternalLocationConfigur…CHED_FROM_SERVER.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Boolean) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final synchronized void F() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.b();
        }
        this.f = null;
    }

    public final synchronized void G() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.b();
        }
        this.f = null;
    }

    public final synchronized void H() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.b();
        }
        this.f = null;
    }

    public final ajdp<Boolean> I() {
        Object p = P().p(nfg.NYC_SETTINGS_PENDING_SYNC);
        akcr.a(p, "configProvider.observeBo…YC_SETTINGS_PENDING_SYNC)");
        return p;
    }

    public final ajdp<Boolean> J() {
        Object p = P().p(nfg.NYC_SETTINGS_HAS_SET_GHOST_MODE);
        akcr.a(p, "configProvider.observeBo…TINGS_HAS_SET_GHOST_MODE)");
        return p;
    }

    public final float K() {
        Object a = nfg.NYC_LAST_LOCATION_LATITUDE.a();
        akcr.a(a, "InternalLocationConfigur…OCATION_LATITUDE.delegate");
        a = a.b();
        if (a != null) {
            return ((Float) a).floatValue();
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }

    public final float L() {
        Object a = nfg.NYC_LAST_LOCATION_LONGITUDE.a();
        akcr.a(a, "InternalLocationConfigur…CATION_LONGITUDE.delegate");
        a = a.b();
        if (a != null) {
            return ((Float) a).floatValue();
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Float");
    }

    public final synchronized void M() {
        if (!P().a((fth) nfg.MUSHROOM_MIGRATOR_PERFORMED_MIGRATION)) {
            boolean z = d() == nch.CUSTOM && e().isEmpty();
            f(z);
            Q().b().a((fth) nfg.MUSHROOM_MIGRATOR_PERFORMED_MIGRATION, Boolean.TRUE);
            H();
        }
    }

    public final ajdp<Boolean> N() {
        Object p = P().p(nfg.NYC_SHOW_DIALOG_LEAVING_GHOST_MODE);
        akcr.a(p, "configProvider.observeBo…IALOG_LEAVING_GHOST_MODE)");
        return p;
    }

    public final ajdp<Boolean> O() {
        Object p = P().p(nfg.NYC_SETTINGS_GHOST_MODE);
        akcr.a(p, "configProvider.observeBo….NYC_SETTINGS_GHOST_MODE)");
        return p;
    }

    public final void a(float f) {
        V().a((fth) nfg.NYC_LAST_LOCATION_LATITUDE, Float.valueOf(f));
    }

    public final void a(long j) {
        V().a((fth) nfg.NYC_SETTINGS_SYNC_TIMESTAMP, Long.valueOf(j));
    }

    public final void a(Set<String> set) {
        String str = "compositeDisposable";
        akcr.b(set, "ids");
        try {
            ajej e = R().b().e();
            akcr.a((Object) e, "customFriendRepository.deleteFriends().subscribe()");
            ajei U = U();
            akcr.a((Object) U, str);
            ajvv.a(e, U);
            nfe R = R();
            akcr.b(set, "friendIds");
            ajej e2 = R.a.runInTransaction("CustomFriendEntryRepository#insertFriends", new c(R, set)).b((ajdw) T()).e();
            akcr.a((Object) e2, "customFriendRepository.i…(dbScheduler).subscribe()");
            ajei U2 = U();
            akcr.a((Object) U2, str);
            ajvv.a(e2, U2);
        } catch (Exception unused) {
        }
    }

    public final void a(nch nch) {
        akcr.b(nch, "sharingAudience");
        V().a((fth) nfg.NYC_SETTINGS_AUDIENCE, nch.toString());
    }

    public final void a(boolean z) {
        V().a((fth) nfg.NYC_SETTINGS_GHOST_MODE, Boolean.valueOf(z)).a((fth) nfg.NYC_SETTINGS_HAS_SET_GHOST_MODE, Boolean.TRUE);
    }

    public final boolean a() {
        return P().a((fth) nfg.NYC_SETTINGS_HAS_SET_GHOST_MODE);
    }

    public final void b(float f) {
        V().a((fth) nfg.NYC_LAST_LOCATION_LONGITUDE, Float.valueOf(f));
    }

    public final void b(long j) {
        V().a((fth) nfg.NYC_SETTINGS_GHOST_MODE_DURATION_TO_SET, Long.valueOf(j));
    }

    public final void b(Set<String> set) {
        String str = "compositeDisposable";
        akcr.b(set, "ids");
        try {
            ajej e = S().b().e();
            akcr.a((Object) e, "blacklistFriendRepositor…leteFriends().subscribe()");
            ajei U = U();
            akcr.a((Object) U, str);
            ajvv.a(e, U);
            nfd S = S();
            akcr.b(set, "friendIds");
            ajej e2 = S.a.runInTransaction("BlacklistFriendEntryRepository#insertFriends", new d(S, set)).b((ajdw) T()).e();
            akcr.a((Object) e2, "blacklistFriendRepositor…(dbScheduler).subscribe()");
            ajei U2 = U();
            akcr.a((Object) U2, str);
            ajvv.a(e2, U2);
        } catch (Exception unused) {
        }
    }

    public final void b(boolean z) {
        V().a((fth) nfg.NYC_SETTINGS_PENDING_SYNC, Boolean.valueOf(z));
    }

    public final boolean b() {
        return P().a((fth) nfg.NYC_SETTINGS_GHOST_MODE);
    }

    public final void c(boolean z) {
        V().a((fth) nfg.NYC_SETTINGS_HAS_GHOST_MODE_DURATION, Boolean.valueOf(z));
    }

    public final boolean c() {
        return P().a((fth) nfg.NYC_SETTINGS_HAS_GHOST_MODE_DURATION);
    }

    public final nch d() {
        Object j = P().j(nfg.NYC_SETTINGS_AUDIENCE);
        try {
            akcr.a(j, "sharingAudienceString");
            return nch.valueOf(j);
        } catch (IllegalArgumentException unused) {
            return nch.CUSTOM;
        }
    }

    public final void d(boolean z) {
        V().a((fth) nfg.NYC_HAS_ONBOARDED, Boolean.valueOf(z));
    }

    public final Set<String> e() {
        Object obj = R().a;
        akcr.a(obj, "dbClient");
        akcr.a(nfk.a, "CustomFriendRecord.FACTORY");
        Object a = nfm.c.a();
        akcr.a(a, "CustomFriendRecord.FACTORY.customFriends");
        Object obj2 = nfk.b;
        akcr.a(obj2, "CustomFriendRecord.MAPPER");
        Iterable<nfk> queryList = BriteDatabaseExtensionsKt.queryList(obj, a, obj2);
        Collection arrayList = new ArrayList(ajyn.a((Iterable) queryList, 10));
        for (nfk b : queryList) {
            arrayList.add(b.b());
        }
        return ajyu.p((List) arrayList);
    }

    public final void e(boolean z) {
        V().a((fth) nfg.NYC_SETTINGS_HAS_PASSIVE, Boolean.valueOf(z));
    }

    public final Set<String> f() {
        Object obj = S().a;
        akcr.a(obj, "dbClient");
        akcr.a(nfj.a, "BlacklistFriendRecord.FACTORY");
        Object a = nfl.c.a();
        akcr.a(a, "BlacklistFriendRecord.FACTORY.blacklistFriends");
        Object obj2 = nfj.b;
        akcr.a(obj2, "BlacklistFriendRecord.MAPPER");
        Iterable<nfj> queryList = BriteDatabaseExtensionsKt.queryList(obj, a, obj2);
        Collection arrayList = new ArrayList(ajyn.a((Iterable) queryList, 10));
        for (nfj b : queryList) {
            arrayList.add(b.b());
        }
        return ajyu.p((List) arrayList);
    }

    public final void f(boolean z) {
        V().a((fth) nfg.NYC_SHOW_DIALOG_LEAVING_GHOST_MODE, Boolean.valueOf(z));
    }

    public final boolean g() {
        return P().a((fth) nfg.NYC_SETTINGS_PENDING_SYNC);
    }

    public final boolean h() {
        return P().a((fth) nfg.NYC_SETTINGS_FETCHED_FROM_SERVER);
    }

    public final long i() {
        return P().h(nfg.NYC_SETTINGS_SYNC_TIMESTAMP);
    }

    public final boolean j() {
        return P().a((fth) nfg.NYC_SETTINGS_HAS_PASSIVE);
    }

    public final boolean k() {
        return P().a((fth) nfg.NYC_HAS_ONBOARDED);
    }

    public final boolean l() {
        return P().a((fth) nfg.NYC_SHOW_DIALOG_LEAVING_GHOST_MODE);
    }

    public final boolean m() {
        return P().a((fth) nfc.IGNORE_SERVER_SHARING_SETTINGS);
    }

    public final float n() {
        return P().c(nfg.NYC_LAST_LOCATION_LATITUDE);
    }

    public final float o() {
        return P().c(nfg.NYC_LAST_LOCATION_LONGITUDE);
    }

    public final long p() {
        return P().h(nfg.NYC_SETTINGS_GHOST_MODE_DURATION_TO_SET);
    }

    public final String q() {
        return "";
    }

    public final void r() {
        V().a((fth) nfg.NYC_SETTINGS_FETCHED_FROM_SERVER, Boolean.TRUE);
    }

    public final void s() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_SYNC_TIMESTAMP;
        Object a = nfg.NYC_SETTINGS_SYNC_TIMESTAMP.a();
        akcr.a(a, "InternalLocationConfigur…S_SYNC_TIMESTAMP.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Long) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Long");
    }

    public final void t() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_AUDIENCE;
        Object a = nfg.NYC_SETTINGS_AUDIENCE.a();
        akcr.a(a, "InternalLocationConfigur…ETTINGS_AUDIENCE.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (String) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.String");
    }

    public final void u() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_GHOST_MODE;
        Object a = nfg.NYC_SETTINGS_GHOST_MODE.a();
        akcr.a(a, "InternalLocationConfigur…TINGS_GHOST_MODE.delegate");
        a = a.b();
        String str = "null cannot be cast to non-null type kotlin.Boolean";
        if (a != null) {
            V = V.a(fth, (Boolean) a);
            fth = nfg.NYC_SETTINGS_HAS_SET_GHOST_MODE;
            a = nfg.NYC_SETTINGS_HAS_SET_GHOST_MODE.a();
            akcr.a(a, "InternalLocationConfigur…S_SET_GHOST_MODE.delegate");
            a = a.b();
            if (a != null) {
                V.a(fth, (Boolean) a);
                return;
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }

    public final void v() {
        a V = V();
        fth fth = nfg.NYC_SETTINGS_HAS_GHOST_MODE_DURATION;
        Object a = nfg.NYC_SETTINGS_HAS_GHOST_MODE_DURATION.a();
        akcr.a(a, "InternalLocationConfigur…ST_MODE_DURATION.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Boolean) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final void w() {
        try {
            ajej e = R().b().b((ajdw) T()).e();
            akcr.a((Object) e, "customFriendRepository.d…(dbScheduler).subscribe()");
            ajei U = U();
            akcr.a((Object) U, "compositeDisposable");
            ajvv.a(e, U);
        } catch (Exception unused) {
        }
    }

    public final void x() {
        try {
            ajej e = S().b().b((ajdw) T()).e();
            akcr.a((Object) e, "blacklistFriendRepositor…(dbScheduler).subscribe()");
            ajei U = U();
            akcr.a((Object) U, "compositeDisposable");
            ajvv.a(e, U);
        } catch (Exception unused) {
        }
    }

    public final void y() {
        a V = V();
        fth fth = nfg.NYC_HAS_ONBOARDED;
        Object a = nfg.NYC_HAS_ONBOARDED.a();
        akcr.a(a, "InternalLocationConfigur…YC_HAS_ONBOARDED.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Boolean) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final void z() {
        a V = V();
        fth fth = nfg.NYC_SHOW_DIALOG_LEAVING_GHOST_MODE;
        Object a = nfg.NYC_SHOW_DIALOG_LEAVING_GHOST_MODE.a();
        akcr.a(a, "InternalLocationConfigur…AVING_GHOST_MODE.delegate");
        a = a.b();
        if (a != null) {
            V.a(fth, (Boolean) a);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
    }
}
