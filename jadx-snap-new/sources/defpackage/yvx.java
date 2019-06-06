package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.ui.view.button.ScButton;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: yvx */
public final class yvx extends wqj {
    private static final zjm j = new zjm(hbn.f, "opted_in_notifications_list", false, false, false, false, null, false, false, false, false, null, 4092);
    String a;
    final Set<vdu> b = new LinkedHashSet();
    final Set<vdu> c = new LinkedHashSet();
    final yvw d = new yvw();
    final yvw e = new yvw();
    final zfw f = zgb.a(hbn.f, "OptInNotificationListPageController");
    final yum g;
    private final zkf h = new zkf();
    private final yui i;

    /* renamed from: yvx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: yvx$b */
    static final class b implements OnClickListener {
        private /* synthetic */ yvx a;

        b(yvx yvx) {
            this.a = yvx;
        }

        public final void onClick(View view) {
            Collection arrayList;
            yvx yvx = this.a;
            ajcx a = ajvo.a(ajhn.a);
            String str = "Completable.complete()";
            akcr.a((Object) a, str);
            List a2 = yvx.d.a();
            if (a2 != null) {
                Iterable<yvt> iterable = a2;
                arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (yvt yvt : iterable) {
                    arrayList.add(yvt.a);
                }
                a2 = ajyu.e((List) arrayList, yvx.b);
                if (a2 != null) {
                    a = yvx.g.a(a2, true);
                }
            }
            ajcx a3 = ajvo.a(ajhn.a);
            akcr.a((Object) a3, str);
            List a4 = yvx.e.a();
            if (a4 != null) {
                Iterable<yvt> iterable2 = a4;
                arrayList = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                for (yvt yvt2 : iterable2) {
                    arrayList.add(yvt2.a);
                }
                a4 = ajyu.e((List) arrayList, yvx.c);
                if (a4 != null) {
                    a3 = yvx.g.a(a4, false);
                }
            }
            ajei ajei = new ajei();
            ajej a5 = a.c((ajdb) a3).f(new f(ajei)).b((ajdw) yvx.f.g()).a((ajdw) yvx.f.l()).a((ajfb) g.a).a((ajev) h.a, igu.a("OptInNotificationListPageController"));
            akcr.a((Object) a5, "updateOptInCompletable.c…er(TAG)\n                )");
            ajvv.a(a5, ajei);
            yvx.n.e();
        }
    }

    /* renamed from: yvx$1 */
    static final class 1<T> implements ajfb<abkq> {
        private /* synthetic */ yvx a;

        1(yvx yvx) {
            this.a = yvx;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            String str = ((abkq) obj).a;
            if (str != null) {
                this.a.a = str;
            }
        }
    }

    /* renamed from: yvx$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yvx a;

        c(yvx yvx) {
            this.a = yvx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return this.a.g.a(bool.booleanValue());
        }
    }

    /* renamed from: yvx$d */
    static final class d<T> implements ajfb<List<? extends vdu>> {
        private /* synthetic */ yvx a;
        private /* synthetic */ View b;

        d(yvx yvx, View view) {
            this.a = yvx;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            this.b.setVisibility(8);
            yvx yvx = this.a;
            akcr.a(obj, "entities");
            yvw yvw = this.a.d;
            yvw yvw2 = this.a.e;
            Collection arrayList = new ArrayList();
            for (Object next : (Iterable) obj) {
                CharSequence b = ((vdu) next).b();
                int i = (b == null || b.length() == 0) ? 1 : 0;
                if ((1 ^ i) != 0) {
                    arrayList.add(next);
                }
            }
            for (vdu vdu : (List) arrayList) {
                (vdu.c() == 1 ? yvx.b : yvx.c).add(vdu);
            }
            yvw.a(ajyu.k(yvx.b));
            yvw2.a(ajyu.k(yvx.c));
        }
    }

    /* renamed from: yvx$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ View a;

        e(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.setVisibility(8);
        }
    }

    /* renamed from: yvx$f */
    static final class f implements ajev {
        private /* synthetic */ ajei a;

        f(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.a();
        }
    }

    /* renamed from: yvx$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ieg.a("Error updating opt in notification status ".concat(String.valueOf((Throwable) obj)), true, 0);
        }
    }

    /* renamed from: yvx$h */
    static final class h implements ajev {
        public static final h a = new h();

        h() {
        }

        public final void run() {
            ieg.a("Opt in notification sync successful", true, 0);
        }
    }

    static {
        a aVar = new a();
    }

    public yvx(Context context, achb<zjm, zjk> achb, zkq zkq, zgb zgb, gpb gpb, yum yum, yui yui) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(zkq, "insetsDetector");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(yum, "notificationDataSource");
        akcr.b(yui, "optInNotifConfiguration");
        super(context, j, R.string.story_notifications_settings_title, R.layout.opt_in_notification_list, achb, zkq);
        this.g = yum;
        this.i = yui;
        ajej f = gpb.c().f((ajfb) new 1(this));
        akcr.a((Object) f, "userAuthStore.observeUse…Id?.let { userId = it } }");
        ajvv.a(f, getDisposable());
        this.h.a(this);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOptInEntitySelectionEvent(yvr yvr) {
        akcr.b(yvr, "event");
        vdu vdu = yvr.a;
        vdu.a(yvr.b ? 1 : 2);
        if (yvr.b) {
            this.d.a(vdu);
            this.e.b(vdu);
            return;
        }
        this.d.b(vdu);
        this.e.a(vdu);
    }

    public final void onPageAdded() {
        super.onPageAdded();
        Object findViewById = getContentView().findViewById(R.id.opt_in_entities);
        akcr.a(findViewById, "contentView.findViewById(R.id.opt_in_entities)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.m);
        Object a = this.h.a();
        akcr.a(a, "rxBus.eventDispatcher");
        yvz yvz = new yvz(a);
        zmh zmh = new zmh(new zms((zlx) yvz, ywa.class), yvz.a, (ajdw) this.f.b(), (ajdw) this.f.l(), ajym.b((Object[]) new zma[]{new yvy(this.i, true), this.d, new yvy(this.i, false), this.e}), 32);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(zmh);
        getDisposable().a(zmh.e());
        findViewById = getContentView().findViewById(R.id.loading_spinner);
        akcr.a(findViewById, "contentView.findViewById(R.id.loading_spinner)");
        findViewById.setVisibility(0);
        Object findViewById2 = getContentView().findViewById(R.id.opt_in_submit_button);
        akcr.a(findViewById2, "contentView.findViewById….id.opt_in_submit_button)");
        ((ScButton) findViewById2).setOnClickListener(new b(this));
        ajej a2 = this.i.a().a((ajfc) new c(this)).b((ajdw) this.f.g()).a((ajdw) this.f.l()).a((ajfb) new d(this, findViewById), (ajfb) new e(findViewById));
        akcr.a((Object) a2, "optInNotifConfiguration\n…      }\n                )");
        ajvv.a(a2, getDisposable());
    }
}
