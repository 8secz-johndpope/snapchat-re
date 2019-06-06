package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: und */
public final class und extends zll<une> {
    public zmh a;
    AdapterDataObserver b;
    ViewGroup c;
    public RecyclerView d;
    public int e;
    boolean f;
    public final ajwo<Integer> g;
    public final ajwo<Boolean> h;
    private final ajxe i;
    private unb j;
    private zms k;
    private zkf l;
    private zmp m;
    private String n;
    private String o;
    private String p;
    private TextView q;
    private int r;
    private final ajwy<ftl> s;

    /* renamed from: und$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: und$c */
    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        c(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            und und = this.a;
            akcr.a(obj, "it");
            und.e = obj.intValue();
            und.a(this.a, obj.intValue(), false, false, 2);
        }
    }

    /* renamed from: und$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        d(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final /* synthetic */ void accept(Object obj) {
            und und = this.a;
            und.e = 0;
            und.a(und, 0, false, false, 2);
        }
    }

    /* renamed from: und$e */
    static final class e<T> implements ajfb<Integer> {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        e(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            if (this.a.c != null) {
                ViewGroup viewGroup = this.a.c;
                if (viewGroup == null) {
                    akcr.a("timerSelectorView");
                }
                akcr.a(obj, "it");
                viewGroup.setVisibility(obj.intValue());
                if (obj.intValue() == 0) {
                    und und = this.a;
                    und.a(und.e, true);
                    und = this.a;
                    und.a(und.e, true, false);
                }
            }
        }
    }

    /* renamed from: und$f */
    public static final class f extends OnScrollListener {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        f(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                und und = this.a;
                und.a(und, und.e, false, false, 2);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            akcr.b(recyclerView, "recyclerView");
            und und = this.a;
            if (und.d != null) {
                RecyclerView recyclerView2 = und.d;
                if (recyclerView2 == null) {
                    akcr.a("timerSelectorRecyclerView");
                }
                LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    i = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                    if (i >= 0) {
                        zmh zmh = und.a;
                        String str = "adapter";
                        if (zmh == null) {
                            akcr.a(str);
                        }
                        if (i < zmh.getItemCount()) {
                            zmh = und.a;
                            if (zmh == null) {
                                akcr.a(str);
                            }
                            zmy a = zmh.a(i);
                            und.a(und, a instanceof uni ? ((uni) a).a : 0, false, false, 4);
                        }
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: und$g */
    public static final class g extends AdapterDataObserver {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        g(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final void onItemRangeInserted(int i, int i2) {
            und und = this.a;
            und.a(und.e, false);
            zmh zmh = this.a.a;
            if (zmh == null) {
                akcr.a("adapter");
            }
            AdapterDataObserver adapterDataObserver = this.a.b;
            if (adapterDataObserver == null) {
                akcr.a("adapterDataObserver");
            }
            zmh.unregisterAdapterDataObserver(adapterDataObserver);
        }
    }

    /* renamed from: und$h */
    static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ und a;
        private /* synthetic */ une b;

        h(und und, une une) {
            this.a = und;
            this.b = une;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.f = true;
        }
    }

    /* renamed from: und$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: und$j */
    static final class j<T> implements ajfl<Boolean> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: und$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        b(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("TimerSelectorViewPresenter"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(und.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public und(toc toc, zgb zgb, ajwy<ftl> ajwy) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "configProvider");
        this.s = ajwy;
        this.i = ajxh.a(new b(zgb, toc));
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Int>()");
        this.g = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Boolean>()");
        this.h = ajwo;
    }

    private final zfw a() {
        return (zfw) this.i.b();
    }

    public static /* synthetic */ void a(und und, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        und.a(i, z, z2);
    }

    public final void a(int i, boolean z) {
        if (this.d != null) {
            RecyclerView recyclerView = this.d;
            if (recyclerView == null) {
                akcr.a("timerSelectorRecyclerView");
            }
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                akcr.a();
            }
            String str = "adapter";
            if (i > 0) {
                zmh zmh = this.a;
                if (zmh == null) {
                    akcr.a(str);
                }
                if (i < zmh.getItemCount()) {
                    if (z) {
                        layoutManager.smoothScrollToPosition(recyclerView, new State(), i - 1);
                        return;
                    } else {
                        layoutManager.scrollToPosition(i - 1);
                        return;
                    }
                }
            }
            if (i == 0) {
                zmh zmh2 = this.a;
                if (zmh2 == null) {
                    akcr.a(str);
                }
                if (zmh2.getItemCount() > 0) {
                    if (z) {
                        State state = new State();
                        zmh zmh3 = this.a;
                        if (zmh3 == null) {
                            akcr.a(str);
                        }
                        layoutManager.smoothScrollToPosition(recyclerView, state, zmh3.getItemCount() - 1);
                        return;
                    }
                    zmh2 = this.a;
                    if (zmh2 == null) {
                        akcr.a(str);
                    }
                    layoutManager.scrollToPosition(zmh2.getItemCount() - 1);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z, boolean z2) {
        if (this.q != null) {
            String str = "timerSelectorDescriptionTextView";
            if (this.f && this.e != i) {
                TextView textView = this.q;
                if (textView == null) {
                    akcr.a(str);
                }
                textView.performHapticFeedback(3);
            }
            if (z2 && this.e != i) {
                this.g.a(Integer.valueOf(i));
            }
            this.e = i;
            if (z) {
                TextView textView2;
                String str2;
                String str3;
                i = this.e;
                if (i == 0) {
                    textView2 = this.q;
                    if (textView2 == null) {
                        akcr.a(str);
                    }
                    str2 = this.n;
                    if (str2 == null) {
                        str3 = "noLimitString";
                    }
                    textView2.setText(str2);
                } else if (i != 1) {
                    textView2 = this.q;
                    if (textView2 == null) {
                        akcr.a(str);
                    }
                    str2 = this.p;
                    if (str2 == null) {
                        akcr.a("secondsString");
                    }
                    textView2.setText(str2);
                } else {
                    textView2 = this.q;
                    if (textView2 == null) {
                        akcr.a(str);
                    }
                    str2 = this.o;
                    if (str2 == null) {
                        str3 = "secondString";
                    }
                    textView2.setText(str2);
                }
                akcr.a(str3);
                textView2.setText(str2);
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(une une) {
        String str;
        akcr.b(une, "target");
        super.takeTarget(une);
        Object obj = (une) getTarget();
        if (obj != null) {
            akcr.a(obj, "target?: return");
            Context context = obj.a().getContext();
            str = "Required value was null.";
            if (context != null) {
                Resources resources = context.getResources();
                if (resources != null) {
                    this.r = resources.getDimensionPixelSize(R.dimen.new_timer_selector_cell_height);
                    Object string = resources.getString(R.string.timer_selector_no_limit_text);
                    akcr.a(string, "res.getString(R.string.t…r_selector_no_limit_text)");
                    this.n = string;
                    Object quantityString = resources.getQuantityString(R.plurals.snap_timer_selection_units, 1);
                    akcr.a(quantityString, "res.getQuantityString(R.…timer_selection_units, 1)");
                    this.o = quantityString;
                    string = resources.getQuantityString(R.plurals.snap_timer_selection_units, 2);
                    akcr.a(string, "res.getQuantityString(R.…timer_selection_units, 2)");
                    this.p = string;
                    View inflate = LayoutInflater.from(context).inflate(R.layout.timer_selector_view, null);
                    if (inflate != null) {
                        this.c = (ViewGroup) inflate;
                        FrameLayout a = obj.a();
                        ViewGroup viewGroup = this.c;
                        str = "timerSelectorView";
                        if (viewGroup == null) {
                            akcr.a(str);
                        }
                        a.addView(viewGroup, 0);
                        ViewGroup viewGroup2 = this.c;
                        if (viewGroup2 == null) {
                            akcr.a(str);
                        }
                        obj = viewGroup2.findViewById(R.id.timer_list);
                        akcr.a(obj, "timerSelectorView.findViewById(R.id.timer_list)");
                        this.d = (RecyclerView) obj;
                        viewGroup2 = this.c;
                        if (viewGroup2 == null) {
                            akcr.a(str);
                        }
                        obj = viewGroup2.findViewById(R.id.new_timer_description_text);
                        akcr.a(obj, "timerSelectorView.findVi…w_timer_description_text)");
                        this.q = (TextView) obj;
                    } else {
                        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                throw new IllegalStateException(str.toString());
            }
            throw new IllegalStateException(str.toString());
        }
        zln.bindTo$default(this, une.c().a((ajfb) new c(this, une), (ajfb) new d(this, une)), this, null, null, 6, null);
        zln.bindTo$default(this, une.d().a((ajdw) a().l()).a((ajfb) new e(this, une), (ajfb) i.a), this, null, null, 6, null);
        this.m = new zmp();
        zmp zmp = this.m;
        String str2 = "observableOnScrollListener";
        if (zmp == null) {
            akcr.a(str2);
        }
        zmp.a(new f(this, une));
        zmp zmp2 = this.m;
        if (zmp2 == null) {
            akcr.a(str2);
        }
        this.j = new unb(zmp2, une.a().getHeight());
        unb unb = this.j;
        if (unb == null) {
            akcr.a("bindingContext");
        }
        this.k = new zms((zlx) unb, unf.class);
        this.l = (zkf) zln.bindTo$default(this, new zkf(), this, null, null, 6, null);
        zkf zkf = this.l;
        str = "bus";
        if (zkf == null) {
            akcr.a(str);
        }
        zkf.a(this);
        zms zms = this.k;
        if (zms == null) {
            akcr.a("viewFactory");
        }
        zkf zkf2 = this.l;
        if (zkf2 == null) {
            akcr.a(str);
        }
        zke a2 = zkf2.a();
        akcr.a((Object) a2, "bus.eventDispatcher");
        this.a = new zmh(zms, a2, (ajdw) a().b(), (ajdw) a().l(), ajyl.a(new unc(une.b())), 32);
        this.b = new g(this, une);
        zmh zmh = this.a;
        str = "adapter";
        if (zmh == null) {
            akcr.a(str);
        }
        AdapterDataObserver adapterDataObserver = this.b;
        if (adapterDataObserver == null) {
            akcr.a("adapterDataObserver");
        }
        zmh.registerAdapterDataObserver(adapterDataObserver);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        RecyclerView recyclerView = this.d;
        String str3 = "timerSelectorRecyclerView";
        if (recyclerView == null) {
            akcr.a(str3);
        }
        linearSnapHelper.attachToRecyclerView(recyclerView);
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 == null) {
            akcr.a(str3);
        }
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(une.a().getContext(), 1, false));
        recyclerView2.setItemAnimator(null);
        zmh zmh2 = this.a;
        if (zmh2 == null) {
            akcr.a(str);
        }
        recyclerView2.setAdapter(zmh2);
        zmp zmp3 = this.m;
        if (zmp3 == null) {
            akcr.a(str2);
        }
        recyclerView2.addOnScrollListener(zmp3);
        recyclerView2.setPadding(0, ((une.a().getHeight() - this.r) / 2) + 5, 0, ((une.a().getHeight() - this.r) / 2) + 5);
        zmh = this.a;
        if (zmh == null) {
            akcr.a(str);
        }
        zln.bindTo$default(this, zmh.e(), this, null, null, 6, null);
        und.a(this, this.e, false, false, 2);
        zln.bindTo$default(this, ((ftl) this.s.get()).b((fth) tum.PREVIEW_UX).b((ajdw) a().f()).a((ajfl) j.a).d((ajfb) new h(this, une)), this, null, null, 6, null);
    }

    public final void dropTarget() {
        if (this.c != null) {
            une une = (une) getTarget();
            if (une != null) {
                FrameLayout a = une.a();
                if (a != null) {
                    ViewGroup viewGroup = this.c;
                    if (viewGroup == null) {
                        akcr.a("timerSelectorView");
                    }
                    a.removeView(viewGroup);
                }
            }
        }
        super.dropTarget();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onTimerValueSelectedEvent(ung ung) {
        akcr.b(ung, "event");
        if (ung.a == this.e) {
            und.a(this, ung.a, false, false, 6);
            this.h.a(Boolean.TRUE);
            return;
        }
        a(ung.a, true);
        und.a(this, ung.a, false, false, 6);
    }
}
