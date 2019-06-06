package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.android.R;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fdm */
public final class fdm extends zja {
    final fdn a = new fdn();
    final Context b;
    final String c;
    final zfw d;
    final ezd e;
    final fan f;
    final eyw g;
    final exz h;
    final gpb i;
    final ajwy<fap> j;
    final ajei k;
    private zkf l;
    private RecyclerView m;
    private zmh n;
    private View o;
    private final ajxe p = ajxh.a(new a(this));
    private final achb<zjm, zjk> q;
    private final zjm r;
    private final List<ffv> s;
    private final ezf t;

    /* renamed from: fdm$b */
    static final class b implements OnClickListener {
        private /* synthetic */ fdm a;

        b(fdm fdm) {
            this.a = fdm;
        }

        public final void onClick(View view) {
            fdm fdm = this.a;
            if (fdm.e.e() && fdm.e.e() && fdm.c != null) {
                List k = ajyu.k(fdm.a.a);
                List a = fes.a(fdm.a.b);
                Resources resources = fdm.b.getResources();
                akcr.a((Object) a, "displayNames");
                Object a2 = fes.a(resources, a.size(), a);
                akcr.a(a2, "CognacUtils.getRingingTe…es.count(), displayNames)");
                ajej a3 = fdm.f.a(fdm.c, k).a((ajdw) fdm.d.l()).a((ajfb) new d(fdm, k, a2), (ajfb) new e(fdm));
                akcr.a((Object) a3, "networkHandler\n         …_TYPE)\n                })");
                ajvv.a(a3, fdm.k);
            }
            this.a.q.a(true);
        }
    }

    /* renamed from: fdm$c */
    static final class c implements OnClickListener {
        private /* synthetic */ fdm a;

        c(fdm fdm) {
            this.a = fdm;
        }

        public final void onClick(View view) {
            this.a.q.a(true);
        }
    }

    /* renamed from: fdm$d */
    static final class d<T> implements ajfb<acdw> {
        private /* synthetic */ fdm a;
        private /* synthetic */ List b;
        private /* synthetic */ String c;

        d(fdm fdm, List list, String str) {
            this.a = fdm;
            this.b = list;
            this.c = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((acdw) obj).a == null) {
                ((fap) this.a.j.get()).a((long) this.b.size());
                this.a.g.a(this.a.i.b(), this.c, this.a.c, this.b);
            }
        }
    }

    /* renamed from: fdm$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ fdm a;

        e(fdm fdm) {
            this.a = fdm;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.h.a(this.a.b, this.a.b.getResources().getString(R.string.cognac_oops), this.a.b.getResources().getString(R.string.no_internet_connection), eym.a);
        }
    }

    /* renamed from: fdm$a */
    static final class a extends akcs implements akbk<View> {
        private /* synthetic */ fdm a;

        a(fdm fdm) {
            this.a = fdm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return LayoutInflater.from(this.a.b).inflate(R.layout.cognac_friend_picker, null);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fdm.class), "contentView", "getContentView()Landroid/view/View;");
    }

    public fdm(Context context, String str, achb<zjm, zjk> achb, zjm zjm, List<? extends ffv> list, zfw zfw, ezd ezd, fan fan, eyw eyw, exz exz, gpb gpb, ezf ezf, ajwy<fap> ajwy, ajei ajei) {
        Context context2 = context;
        achb<zjm, zjk> achb2 = achb;
        zjm zjm2 = zjm;
        List<? extends ffv> list2 = list;
        zfw zfw2 = zfw;
        ezd ezd2 = ezd;
        fan fan2 = fan;
        eyw eyw2 = eyw;
        exz exz2 = exz;
        gpb gpb2 = gpb;
        ajwy<fap> ajwy2 = ajwy;
        ajei ajei2 = ajei;
        akcr.b(context2, "context");
        akcr.b(achb2, "navigationHost");
        akcr.b(zjm2, "pageType");
        akcr.b(list2, "appParticipants");
        akcr.b(zfw2, "schedulers");
        akcr.b(ezd2, "tweakService");
        akcr.b(fan2, "networkHandler");
        akcr.b(eyw2, "notificationService");
        akcr.b(exz2, "alertService");
        akcr.b(gpb2, "authStore");
        akcr.b(ajwy2, "cognacAnalytics");
        akcr.b(ajei2, "activityScopedDisposable");
        super(zjm, acgv.a().a(eym.c.j()).a(), null, 4, null);
        this.b = context2;
        this.c = str;
        this.q = achb2;
        this.r = zjm2;
        this.s = list2;
        this.d = zfw2;
        this.e = ezd2;
        this.f = fan2;
        this.g = eyw2;
        this.h = exz2;
        this.i = gpb;
        this.t = ezf;
        this.j = ajwy;
        this.k = ajei;
    }

    public final View getContentView() {
        return (View) this.p.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendPickerCellClicked(fdg fdg) {
        akcr.b(fdg, "event");
        this.a.a(fdg.a.d, fdg.a.e ^ 1);
        View view = this.o;
        if (view == null) {
            akcr.a("inviteFriendButton");
        }
        view.setEnabled(this.a.a.isEmpty() ^ 1);
    }

    public final void onPageAdded() {
        super.onPageAdded();
        this.l = new zkf();
        Object findViewById = getContentView().findViewById(R.id.cognac_friends_list);
        akcr.a(findViewById, "contentView.findViewById(R.id.cognac_friends_list)");
        this.m = (RecyclerView) findViewById;
        zms zms = new zms(fdf.class);
        fde fde = new fde(this.b, this.s, this.a);
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        zkf zkf = this.l;
        String str = "bus";
        if (zkf == null) {
            akcr.a(str);
        }
        zke a = zkf.a();
        akcr.a((Object) a, "bus.eventDispatcher");
        this.n = new zmh(zms, a, (ajdw) this.d.b(), (ajdw) this.d.l(), ajyl.a(fde), 32);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setItemAnimator(null);
        zmh zmh = this.n;
        String str2 = "recyclerViewAdapter";
        if (zmh == null) {
            akcr.a(str2);
        }
        recyclerView.setAdapter(zmh);
        zmh = this.n;
        if (zmh == null) {
            akcr.a(str2);
        }
        ajvv.a(zmh.e(), getDisposable());
        ezf ezf = this.t;
        if (ezf != null) {
            ezf.a();
        }
        View contentView = getContentView();
        Object a2 = absj.a();
        akcr.a(a2, "StatusBarUtils.getInstance()");
        int b = a2.b();
        Object a3 = absi.a();
        akcr.a(a3, "SoftNavBarDetector.getInstance()");
        contentView.setPadding(0, b, 0, a3.f());
        findViewById = getContentView().findViewById(R.id.cognac_invite_friends_button);
        akcr.a(findViewById, "contentView.findViewById…ac_invite_friends_button)");
        this.o = findViewById;
        findViewById = getContentView().findViewById(R.id.cognac_friend_picker_dismiss_button);
        akcr.a(findViewById, "contentView.findViewById…nd_picker_dismiss_button)");
        View view = this.o;
        if (view == null) {
            akcr.a("inviteFriendButton");
        }
        view.setOnClickListener(new b(this));
        findViewById.setOnClickListener(new c(this));
        zkf zkf2 = this.l;
        if (zkf2 == null) {
            akcr.a(str);
        }
        ajej a4 = zkf2.a(this);
        akcr.a((Object) a4, "bus.subscribe(this)");
        ajvv.a(a4, getDisposable());
    }

    public final void onPageRemoved() {
        super.onPageRemoved();
        ezf ezf = this.t;
        if (ezf != null) {
            ezf.b();
        }
    }
}
