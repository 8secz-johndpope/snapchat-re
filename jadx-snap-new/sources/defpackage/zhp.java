package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.android.R;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: zhp */
public final class zhp extends zja implements zjj, zjq {
    final LayoutInflater a;
    private acgv<zjm> b;
    private final AtomicBoolean c;
    private zkf d;
    private zhl e;
    private zmh f;
    private RecyclerView g;
    private final ajxe h;
    private final ajxe i;
    private final zfw j;
    private final achb<zjm, zjk> k;
    private final zkq l;
    private final zhk m;

    /* renamed from: zhp$a */
    public static final class a {
        private zfw a;
        private zhk b;
        private final Context c;
        private final zkq d;
        private final achb<zjm, zjk> e;

        public a(Context context, zkq zkq, achb<zjm, zjk> achb) {
            akcr.b(context, "context");
            akcr.b(zkq, "insertsDetector");
            akcr.b(achb, "navigationHost");
            this.c = context;
            this.d = zkq;
            this.e = achb;
        }

        public final a a(zfw zfw) {
            akcr.b(zfw, "schedulers");
            this.a = zfw;
            return this;
        }

        public final a a(zhk zhk) {
            akcr.b(zhk, "dataProvider");
            this.b = zhk;
            return this;
        }

        public final zhp a() {
            Context context = this.c;
            zfw zfw = this.a;
            if (zfw == null) {
                akcr.a("schedulers");
            }
            achb achb = this.e;
            zkq zkq = this.d;
            zhk zhk = this.b;
            if (zhk == null) {
                akcr.a("dataProvider");
            }
            return new zhp(context, zfw, achb, zkq, zhk, (byte) 0);
        }
    }

    /* renamed from: zhp$d */
    static final class d implements OnClickListener {
        private /* synthetic */ zhp a;

        d(zhp zhp) {
            this.a = zhp;
        }

        public final void onClick(View view) {
            this.a.a();
        }
    }

    /* renamed from: zhp$e */
    static final class e<T> implements ajfb<Rect> {
        private /* synthetic */ zhp a;

        e(zhp zhp) {
            this.a = zhp;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.getContentView().setPadding(0, 0, 0, ((Rect) obj).bottom);
        }
    }

    /* renamed from: zhp$b */
    static final class b extends akcs implements akbk<View> {
        private /* synthetic */ zhp a;

        b(zhp zhp) {
            this.a = zhp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.inflate(R.layout.action_menu_page, null);
        }
    }

    /* renamed from: zhp$c */
    static final class c extends akcs implements akbk<DividerItemDecoration> {
        private /* synthetic */ Context a;

        c(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.a, 1);
            dividerItemDecoration.setDrawable(this.a.getResources().getDrawable(R.drawable.action_menu_item_divider));
            return dividerItemDecoration;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zhp.class), "contentView", "getContentView()Landroid/view/View;"), new akdc(akde.a(zhp.class), "dividerItemDecoration", "getDividerItemDecoration()Landroid/support/v7/widget/DividerItemDecoration;")};
    }

    private zhp(Context context, zfw zfw, achb<zjm, zjk> achb, zkq zkq, zhk zhk) {
        super(zhm.a, null, null, 4, null);
        this.j = zfw;
        this.k = achb;
        this.l = zkq;
        this.m = zhk;
        this.b = acgv.a().a(zhm.b.j()).a();
        this.a = LayoutInflater.from(context);
        this.c = new AtomicBoolean();
        this.h = ajxh.a(new b(this));
        this.i = ajxh.a(new c(context));
    }

    public /* synthetic */ zhp(Context context, zfw zfw, achb achb, zkq zkq, zhk zhk, byte b) {
        this(context, zfw, achb, zkq, zhk);
    }

    public final long S_() {
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.k.b((acig) new acio(zhm.a, true, true));
    }

    public final boolean d() {
        return true;
    }

    public final View getContentView() {
        return (View) this.h.b();
    }

    public final acgv<zjm> getNavigationActionSpec() {
        return this.b;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onActionMenuEvent(zhv zhv) {
        akcr.b(zhv, "event");
        if (zhv instanceof zhw) {
            a();
            return;
        }
        zhl zhl = this.e;
        if (zhl == null) {
            akcr.a("pageEventHandler");
        }
        zhl.a(zhv);
    }

    public final void onPageAdded() {
        super.onPageAdded();
        this.m.e();
        String str = "recyclerViewAdapter";
        String str2 = "bus";
        if (this.c.compareAndSet(false, true)) {
            this.d = new zkf();
            this.e = this.m.c();
            zhl zhl = this.e;
            if (zhl == null) {
                akcr.a("pageEventHandler");
            }
            zkf zkf = this.d;
            if (zkf == null) {
                akcr.a(str2);
            }
            Object a = zkf.a();
            String str3 = "bus.eventDispatcher";
            akcr.a(a, str3);
            achb achb = this.k;
            akcr.b(a, "eventDispatcher");
            akcr.b(achb, "navigationHost");
            zhl.k = a;
            zhl.l = achb;
            Object findViewById = getContentView().findViewById(R.id.action_menu);
            akcr.a(findViewById, "contentView.findViewById(R.id.action_menu)");
            this.g = (RecyclerView) findViewById;
            RecyclerView recyclerView = this.g;
            if (recyclerView == null) {
                akcr.a("recyclerView");
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration((DividerItemDecoration) this.i.b());
            zms zms = new zms((Collection) this.m.a());
            zkf zkf2 = this.d;
            if (zkf2 == null) {
                akcr.a(str2);
            }
            zke a2 = zkf2.a();
            akcr.a((Object) a2, str3);
            this.f = new zmh(zms, a2, (ajdw) this.j.b(), (ajdw) this.j.l(), this.m.b(), 32);
            zmh zmh = this.f;
            if (zmh == null) {
                akcr.a(str);
            }
            recyclerView.setAdapter(zmh);
            findViewById = getContentView().findViewById(R.id.background_view);
            akcr.a(findViewById, "contentView.findViewById(R.id.background_view)");
            findViewById.setOnClickListener(new d(this));
        }
        ajej f = this.l.a().f((ajfb) new e(this));
        akcr.a((Object) f, "insetsDetector.windowRec…0, rect.bottom)\n        }");
        ajvv.a(f, getDisposable());
        zkf zkf3 = this.d;
        if (zkf3 == null) {
            akcr.a(str2);
        }
        f = zkf3.a(this);
        akcr.a((Object) f, "bus.subscribe(this)");
        ajvv.a(f, getDisposable());
        zmh zmh2 = this.f;
        if (zmh2 == null) {
            akcr.a(str);
        }
        ajvv.a(zmh2.e(), getDisposable());
    }

    public final void onPageUnstacked() {
        this.m.d();
        super.onPageUnstacked();
    }

    public final void setNavigationActionSpec(acgv<zjm> acgv) {
        this.b = acgv;
    }
}
