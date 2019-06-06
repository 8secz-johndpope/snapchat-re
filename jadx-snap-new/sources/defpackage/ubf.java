package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.common.collect.ImmutableList;
import com.snap.previewtools.attachment.view.ScrollablePullDownBaseView;
import com.snapchat.android.R;
import defpackage.uca.b;
import defpackage.zgy.a;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: ubf */
public final class ubf extends zll<b> {
    final ajxe a;
    final ajxe b;
    RecyclerView c;
    ScrollablePullDownBaseView d;
    zmh e;
    ucx f;
    final Context g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m = ajxh.a(d.a);
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private zms t;

    /* renamed from: ubf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ubf$b */
    public interface b {
        RecyclerView a();

        ScrollablePullDownBaseView b();
    }

    /* renamed from: ubf$r */
    static final class r<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ ubf a;

        r(ubf ubf) {
            this.a = ubf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            String str2 = "url";
            akcr.b(str, str2);
            uca uca = (uca) this.a.b.b();
            akcr.b(str, str2);
            return uca.a.runInTransaction("PreviewAttachmentHistoryRepository:deleteAttachHistoryTransaction", new b(uca, str));
        }
    }

    /* renamed from: ubf$s */
    static final class s implements ajev {
        public static final s a = new s();

        s() {
        }

        public final void run() {
        }
    }

    /* renamed from: ubf$t */
    static final class t<T> implements ajfb<Throwable> {
        public static final t a = new t();

        t() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ubf$c */
    static final class c extends akcs implements akbk<uca> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uca) this.a.get();
        }
    }

    /* renamed from: ubf$d */
    static final class d extends akcs implements akbk<zkf> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zkf();
        }
    }

    /* renamed from: ubf$e */
    static final class e extends akcs implements akbk<ucd> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ucd) this.a.get();
        }
    }

    /* renamed from: ubf$f */
    static final class f extends akcs implements akbk<uce> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uce) this.a.get();
        }
    }

    /* renamed from: ubf$g */
    static final class g extends akcs implements akbk<uby> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uby) this.a.get();
        }
    }

    /* renamed from: ubf$h */
    static final class h extends akcs implements akbk<ucc> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ucc) this.a.get();
        }
    }

    /* renamed from: ubf$i */
    static final class i extends akcs implements akbk<ajwo<String>> {
        public static final i a = new i();

        i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ubf$j */
    static final class j extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ ubf a;

        j(ubf ubf) {
            this.a = ubf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.g.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: ubf$k */
    static final class k extends akcs implements akbk<ajwo<String>> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ubf$l */
    static final class l extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        l(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: ubf$m */
    static final class m extends akcs implements akbk<ucb> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ucb) this.a.get();
        }
    }

    /* renamed from: ubf$n */
    static final class n extends akcs implements akbk<ucg> {
        private /* synthetic */ ajwy a;

        n(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ucg) this.a.get();
        }
    }

    /* renamed from: ubf$o */
    static final class o extends akcs implements akbk<uch> {
        private /* synthetic */ ajwy a;

        o(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uch) this.a.get();
        }
    }

    /* renamed from: ubf$p */
    static final class p extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        p(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d, "AttachHistoryPresenter");
        }
    }

    /* renamed from: ubf$q */
    static final class q extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ubf a;
        private /* synthetic */ Context b;
        private /* synthetic */ zjm c;
        private /* synthetic */ String d;
        private /* synthetic */ boolean e;
        private /* synthetic */ String f;

        q(ubf ubf, Context context, zjm zjm, String str, boolean z, String str2) {
            this.a = ubf;
            this.b = context;
            this.c = zjm;
            this.d = str;
            this.e = z;
            this.f = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            if (this.e) {
                this.a.a().a(true);
            } else {
                this.a.c().a(this.f);
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ubf.class), "clipBoardTitleSection", "getClipBoardTitleSection()Lcom/snap/previewtools/attachment/history/sections/AttachmentHistoryClipBoardTitleSection;"), new akdc(akde.a(ubf.class), "clipBoardItemSection", "getClipBoardItemSection()Lcom/snap/previewtools/attachment/history/sections/AttachmentHistoryClipBoardItemSection;"), new akdc(akde.a(ubf.class), "previouslyAttachedTitleSection", "getPreviouslyAttachedTitleSection()Lcom/snap/previewtools/attachment/history/sections/PreviouslyAttachedTitleSection;"), new akdc(akde.a(ubf.class), "previouslyAttachedItemSection", "getPreviouslyAttachedItemSection()Lcom/snap/previewtools/attachment/history/sections/PreviouslyAttachedItemSection;"), new akdc(akde.a(ubf.class), "clipboardPermissionSection", "getClipboardPermissionSection()Lcom/snap/previewtools/attachment/history/sections/AttachmentClipboardPermissionSection;"), new akdc(akde.a(ubf.class), "bus", "getBus()Lcom/snap/ui/event/RxBus;"), new akdc(akde.a(ubf.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ubf.class), "clipboardItemRetriever", "getClipboardItemRetriever()Lcom/snap/previewtools/attachment/history/ClipboardItemRetriever;"), new akdc(akde.a(ubf.class), "previouslyAttachedItemRetriever", "getPreviouslyAttachedItemRetriever()Lcom/snap/previewtools/attachment/history/PreviouslyAttachedItemRetriever;"), new akdc(akde.a(ubf.class), "loadWebViewSubject", "getLoadWebViewSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ubf.class), "attachHistoryRepository", "getAttachHistoryRepository()Lcom/snap/previewtools/attachment/history/PreviewAttachmentHistoryRepository;"), new akdc(akde.a(ubf.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(ubf.class), "deletePreviouslyAttachedItemSubject", "getDeletePreviouslyAttachedItemSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ubf.class), "keyboardManager", "getKeyboardManager()Landroid/view/inputmethod/InputMethodManager;")};
        a aVar = new a();
    }

    public ubf(Context context, zgb zgb, ajwy<uby> ajwy, ajwy<ucb> ajwy2, ajwy<uce> ajwy3, ajwy<ucd> ajwy4, ajwy<uch> ajwy5, ajwy<ucg> ajwy6, ajwy<ucc> ajwy7, ajwy<uca> ajwy8, ajwy<achb<zjm, zjk>> ajwy9) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "clipboardItemRetrieverProvider");
        akcr.b(ajwy2, "previouslyAttachedItemRetrieverProvider");
        akcr.b(ajwy3, "clipBoardTitleSectionProvider");
        akcr.b(ajwy4, "clipBoardItemSectionProvider");
        akcr.b(ajwy5, "previouslyAttachedTitleSectionProvider");
        akcr.b(ajwy6, "previouslyAttachedItemSectionProvider");
        akcr.b(ajwy7, "clipboardPermissionSectionProvider");
        akcr.b(ajwy8, "previewAttachmentHistoryRepositoryProvider");
        akcr.b(ajwy9, "navigationHostProvider");
        this.g = context;
        this.h = ajxh.a(new f(ajwy3));
        this.i = ajxh.a(new e(ajwy4));
        this.j = ajxh.a(new o(ajwy5));
        this.k = ajxh.a(new n(ajwy6));
        this.l = ajxh.a(new h(ajwy7));
        this.n = ajxh.a(new p(zgb));
        this.o = ajxh.a(new g(ajwy));
        this.a = ajxh.a(new m(ajwy2));
        this.p = ajxh.a(k.a);
        this.b = ajxh.a(new c(ajwy8));
        this.q = ajxh.a(new l(ajwy9));
        this.r = ajxh.a(i.a);
        this.s = ajxh.a(new j(this));
    }

    private final zkf d() {
        return (zkf) this.m.b();
    }

    private final zfw e() {
        return (zfw) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final uby a() {
        return (uby) this.o.b();
    }

    /* renamed from: a */
    public final void takeTarget(b bVar) {
        akcr.b(bVar, "target");
        super.takeTarget(bVar);
        d().a(this);
        this.c = bVar.a();
        this.d = bVar.b();
        this.t = new zms(ubx.class);
        Object of = ImmutableList.of((ucc) this.l.b(), (uce) this.h.b(), (ucd) this.i.b(), (uch) this.j.b(), (ucg) this.k.b());
        akcr.a(of, "ImmutableList.of(\n      …chedItemSection\n        )");
        zms zms = this.t;
        if (zms == null) {
            akcr.a("viewFactory");
        }
        zke a = d().a();
        akcr.a((Object) a, "bus.eventDispatcher");
        this.e = new zmh(zms, a, (ajdw) e().b(), (ajdw) e().l(), ajyu.k((Iterable) of), 32);
        RecyclerView recyclerView = this.c;
        String str = "historyRecyclerView";
        if (recyclerView == null) {
            akcr.a(str);
        }
        zmh zmh = this.e;
        String str2 = "adapter";
        if (zmh == null) {
            akcr.a(str2);
        }
        recyclerView.setAdapter(zmh);
        recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.g));
        zmh zmh2 = this.e;
        if (zmh2 == null) {
            akcr.a(str2);
        }
        ajej e = zmh2.e();
        zln zln = this;
        zln.bindTo$default(this, e, zln, null, null, 6, null);
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null) {
            akcr.a(str);
        }
        recyclerView2.setVisibility(0);
        RecyclerView recyclerView3 = this.c;
        if (recyclerView3 == null) {
            akcr.a(str);
        }
        ScrollablePullDownBaseView scrollablePullDownBaseView = this.d;
        String str3 = "historyContainer";
        if (scrollablePullDownBaseView == null) {
            akcr.a(str3);
        }
        this.f = new ucx(recyclerView3, scrollablePullDownBaseView);
        scrollablePullDownBaseView = this.d;
        if (scrollablePullDownBaseView == null) {
            akcr.a(str3);
        }
        ucx ucx = this.f;
        if (ucx == null) {
            akcr.a("historyListPullDownController");
        }
        Object d = ucx.d();
        akcr.a(d, "historyListPullDownContr…ranslationYPublishSubject");
        scrollablePullDownBaseView.a((ajdp) d);
        zln.bindTo$default(this, c().a((ajdw) e().m()).a((ajfc) new r(this), false).a((ajev) s.a, (ajfb) t.a), zln, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final ajwo<String> b() {
        return (ajwo) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<String> c() {
        return (ajwo) this.r.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void deleteAttachHistory(ubw ubw) {
        ubw ubw2 = ubw;
        akcr.b(ubw2, "event");
        Context context = this.g;
        achb achb = (achb) this.q.b();
        akcr.a((Object) achb, "navigationHost");
        String str = ubw2.a;
        String str2 = ubw2.b;
        boolean z = ubw2.c;
        Object obj = (b) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            int i = 0;
            ((InputMethodManager) this.s.b()).hideSoftInputFromWindow(obj.b().getWindowToken(), 0);
            if (str.length() == 0) {
                i = 1;
            }
            String str3 = i != 0 ? str2 : str;
            zjm zjm = new zjm(toc.d, "AttachHistoryPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
            zgy a = a.a(new a(context, achb, zjm, false, null, 24).b(str3).a((int) R.string.previously_attached_remove_button, (akbl) new q(this, context, zjm, str3, z, str2), true), null, false, null, null, null, 31).a();
            achb.a((achd) a, a.a, null);
        }
    }

    public final void dropTarget() {
        super.dropTarget();
        ucx ucx = this.f;
        if (ucx == null) {
            akcr.a("historyListPullDownController");
        }
        ucx.b().dispose();
        ucx.k.b.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHistoryItemClicked(ubv ubv) {
        akcr.b(ubv, "event");
        b().a(ubv.a);
    }
}
