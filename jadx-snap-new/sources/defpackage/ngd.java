package defpackage;

import defpackage.ncn.a;
import defpackage.ncn.b;
import defpackage.ncn.c;
import java.util.List;
import java.util.Set;

/* renamed from: ngd */
public final class ngd implements ncn {
    private final ajxe a;

    /* renamed from: ngd$a */
    static final class a extends akcs implements akbk<nge> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nge) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ngd.class), "impl", "getImpl()Lcom/snap/location/map/NycSharingManagerImpl;");
    }

    public ngd(ajwy<nge> ajwy) {
        akcr.b(ajwy, "provider");
        this.a = ajxh.a(ajxj.NONE, new a(ajwy));
    }

    private final nge w() {
        return (nge) this.a.b();
    }

    public final ajdp<Set<String>> a(ajdw ajdw) {
        akcr.b(ajdw, "scheduler");
        Object a = w().a(ajdw);
        akcr.a(a, "impl.observeCustomFriendIds(scheduler)");
        return a;
    }

    public final ajdp<Boolean> a(ajdw ajdw, String str) {
        akcr.b(ajdw, "scheduler");
        akcr.b(str, "friendUserId");
        Object a = w().a(ajdw, str);
        akcr.a(a, "impl.isSharingLocationWi…(scheduler, friendUserId)");
        return a;
    }

    public final alht a(ncs ncs) {
        akcr.b(ncs, "provider");
        Object a = w().a(ncs);
        akcr.a(a, "impl.getGDPRSettings(provider)");
        return a;
    }

    public final List<String> a(nch nch) {
        return w().a(nch);
    }

    public final void a() {
        w().a();
    }

    public final void a(abbd abbd) {
        akcr.b(abbd, "sourceType");
        w().a(abbd);
    }

    public final void a(abbd abbd, aapu aapu, nch nch) {
        akcr.b(nch, "friends");
        w().a(abbd, aapu, nch);
    }

    public final void a(abbd abbd, aapu aapu, boolean z) {
        w().a(abbd, aapu, z);
    }

    public final void a(Runnable runnable, Runnable runnable2) {
        w().a(runnable, runnable2);
    }

    public final void a(Set<String> set, abbd abbd) {
        akcr.b(set, "friendUserIds");
        akcr.b(abbd, "sourceType");
        w().a((Set) set, abbd);
    }

    public final void a(Set<String> set, nca nca) {
        akcr.b(set, "ids");
        akcr.b(nca, "metricsContext");
        w().a((Set) set, nca);
    }

    public final void a(nca nca, boolean z, long j) {
        w().a(nca, z, j);
    }

    public final void a(a aVar) {
        akcr.b(aVar, "ghostModeTimerDoneListener");
        w().a(aVar);
    }

    public final void a(b bVar) {
        w().a(bVar);
    }

    public final void a(c cVar) {
        akcr.b(cVar, "sharingSettingUpdatedListener");
        w().a(cVar);
    }

    public final void a(boolean z) {
        w().a(z);
    }

    public final boolean a(String str) {
        akcr.b(str, "friendUsername");
        return w().a(str);
    }

    public final ajdp<Set<String>> b(ajdw ajdw) {
        akcr.b(ajdw, "scheduler");
        Object b = w().b(ajdw);
        akcr.a(b, "impl.observeBlacklistFriendIds(scheduler)");
        return b;
    }

    public final void b(abbd abbd, aapu aapu, boolean z) {
        w().b(abbd, aapu, z);
    }

    public final void b(Set<String> set, abbd abbd) {
        akcr.b(set, "friendUserIds");
        akcr.b(abbd, "sourceType");
        w().b((Set) set, abbd);
    }

    public final void b(Set<String> set, nca nca) {
        akcr.b(set, "ids");
        akcr.b(nca, "metricsContext");
        w().b((Set) set, nca);
    }

    public final void b(a aVar) {
        akcr.b(aVar, "ghostModeTimerDoneListener");
        w().b(aVar);
    }

    public final void b(c cVar) {
        akcr.b(cVar, "sharingSettingUpdatedListener");
        w().b(cVar);
    }

    public final boolean b() {
        return w().b();
    }

    public final boolean c() {
        Object w = w();
        akcr.a(w, "impl");
        return w.c();
    }

    public final boolean d() {
        Object w = w();
        akcr.a(w, "impl");
        return w.d();
    }

    public final boolean e() {
        Object w = w();
        akcr.a(w, "impl");
        return w.e();
    }

    public final Set<String> f() {
        Object w = w();
        akcr.a(w, "impl");
        w = w.f();
        akcr.a(w, "impl.customSharingFriendIds");
        return w;
    }

    public final Set<String> g() {
        Object w = w();
        akcr.a(w, "impl");
        w = w.g();
        akcr.a(w, "impl.blacklistedFriendIds");
        return w;
    }

    public final ajdp<alkf> h() {
        Object h = w().h();
        akcr.a(h, "impl.observeSharingSettingUpdated()");
        return h;
    }

    public final ajdp<nga.c> i() {
        Object i = w().i();
        akcr.a(i, "impl.observeFailedToFetchSharingSettings()");
        return i;
    }

    public final ajdp<Boolean> j() {
        Object j = w().j();
        akcr.a(j, "impl.observeGhostMode()");
        return j;
    }

    public final aapt k() {
        Object w = w();
        akcr.a(w, "impl");
        return w.k();
    }

    public final aapt l() {
        Object w = w();
        akcr.a(w, "impl");
        w = w.l();
        akcr.a(w, "impl.locationSharingSetting");
        return w;
    }

    public final nch m() {
        Object w = w();
        akcr.a(w, "impl");
        return w.m();
    }

    public final boolean n() {
        Object w = w();
        akcr.a(w, "impl");
        return w.n();
    }

    public final void o() {
        w().o();
    }

    public final boolean p() {
        Object w = w();
        akcr.a(w, "impl");
        return w.p();
    }

    public final boolean q() {
        return w().q();
    }

    public final nbr r() {
        Object w = w();
        akcr.a(w, "impl");
        return w.r();
    }

    public final void s() {
        w().s();
    }

    public final void t() {
        w().t();
    }

    public final void u() {
        w().u();
    }

    public final void v() {
        w().v();
    }
}
