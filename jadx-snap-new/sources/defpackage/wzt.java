package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.snapchat.android.R;
import defpackage.sti.a;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: wzt */
public final class wzt extends wqj {
    final ajei a = new ajei();
    final zfw b = zgb.a(wwt.c.callsite("history_list"));
    final wzn c;
    LinearLayoutManager d;
    zmh e;
    final wyr f;
    private RecyclerView g;
    private View h;
    private View i;
    private zkf j;
    private zms k;
    private final wzx l;

    /* renamed from: wzt$a */
    static final class a<T, R> implements ajfc<Throwable, Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: wzt$c */
    public static final class c extends OnScrollListener {
        private /* synthetic */ wzt a;

        c(wzt wzt) {
            this.a = wzt;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 2) {
                wzt wzt = this.a;
                LinearLayoutManager linearLayoutManager = wzt.d;
                if (linearLayoutManager == null) {
                    akcr.a("linearLayoutManager");
                }
                double findLastVisibleItemPosition = (double) linearLayoutManager.findLastVisibleItemPosition();
                zmh zmh = wzt.e;
                if (zmh == null) {
                    akcr.a("adapter");
                }
                double itemCount = (double) zmh.getItemCount();
                Double.isNaN(itemCount);
                if (findLastVisibleItemPosition >= itemCount * 0.9d) {
                    Object c = wzt.c.a().a((ajdw) wzt.b.l()).g(a.a).c();
                    akcr.a(c, "shazamHistorySection.loa…             .subscribe()");
                    std.a(c, wzt.a);
                }
            }
        }
    }

    /* renamed from: wzt$d */
    static final class d<T, R> implements ajfc<Throwable, Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: wzt$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ wzt a;

        e(wzt wzt) {
            this.a = wzt;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            wzt wzt = this.a;
            akcr.a(obj, "hasItems");
            wzt.a(obj.booleanValue());
        }
    }

    /* renamed from: wzt$b */
    static final class b extends akcs implements akbl<a, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: wzt$f */
    public static final class f extends wzo {
        private /* synthetic */ wzt a;

        f(wzt wzt, Context context) {
            this.a = wzt;
            super(context);
        }

        public final void onSwiped(ViewHolder viewHolder, int i) {
            if (viewHolder instanceof zmq) {
                zmq zmq = (zmq) viewHolder;
                if (zmq.c() instanceof wzq) {
                    wzt wzt = this.a;
                    zmy c = zmq.c();
                    if (c != null) {
                        wzq wzq = (wzq) c;
                        int adapterPosition = zmq.getAdapterPosition();
                        zmh zmh = wzt.e;
                        if (zmh == null) {
                            akcr.a("adapter");
                        }
                        if (zmh.getItemCount() <= 2) {
                            wzt.a(false);
                        }
                        wzn wzn = wzt.c;
                        adapterPosition--;
                        if (adapterPosition >= 0 && adapterPosition <= wzn.b.size() - 1) {
                            wzn.b.remove(adapterPosition);
                            wzn.a.a(znk.a((List) wzn.b));
                        }
                        wyr wyr = wzt.f;
                        akcr.b(wzq, "shazamHistoryModel");
                        String str = wzq.a;
                        String str2 = wzq.b;
                        Object uri = wzq.d.toString();
                        akcr.a(uri, "shazamHistoryModel.imageUri.toString()");
                        Object uri2 = wzq.e.toString();
                        akcr.a(uri2, "shazamHistoryModel.largeImageUri.toString()");
                        Object e = wyr.a.deleteSongFromHistory(new wyg(str, str2, uri, uri2, wzq.f, wzq.g)).a(ajfu.g).e();
                        akcr.a(e, "shazamHistoryWebService.…             .subscribe()");
                        std.a(e, wzt.a);
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.shazam.ui.history.ShazamHistoryItemViewModel");
                }
            }
        }
    }

    public wzt(Context context, achb<zjm, zjk> achb, zkq zkq, zgb zgb, ihi ihi, wyr wyr, wzx wzx) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(zkq, "insetsDetector");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ihi, "dateTimeUtils");
        akcr.b(wyr, "shazamHistoryWebService");
        akcr.b(wzx, "operaLauncher");
        super(context, wzu.a, R.string.shazam_settings_item_header, R.layout.shazam_history_layout, achb, zkq);
        this.f = wyr;
        this.l = wzx;
        this.c = new wzn(this.b, ihi, this.f);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        View view;
        String str = "emptyView";
        String str2 = "recyclerView";
        RecyclerView recyclerView;
        if (z) {
            recyclerView = this.g;
            if (recyclerView == null) {
                akcr.a(str2);
            }
            recyclerView.setVisibility(0);
            view = this.i;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(8);
        } else {
            recyclerView = this.g;
            if (recyclerView == null) {
                akcr.a(str2);
            }
            recyclerView.setVisibility(8);
            view = this.i;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(0);
        }
        view = this.h;
        if (view == null) {
            akcr.a("spinner");
        }
        view.setVisibility(8);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onHistoryItemClicked(wzj wzj) {
        akcr.b(wzj, "itemClicked");
        Object l = this.l.a(wzj.a.f, b.a).a((ajdw) this.b.l()).l();
        akcr.a(l, "operaLauncher\n          …             .subscribe()");
        std.a(l, this.a);
    }

    public final void onPageAdded() {
        super.onPageAdded();
        Object findViewById = getContentView().findViewById(R.id.shazam_history_loading_spinner);
        akcr.a(findViewById, "contentView.findViewById…_history_loading_spinner)");
        this.h = findViewById;
        findViewById = getContentView().findViewById(R.id.shazam_history_table);
        akcr.a(findViewById, "contentView.findViewById….id.shazam_history_table)");
        this.g = (RecyclerView) findViewById;
        findViewById = getContentView().findViewById(R.id.shazam_history_empty);
        akcr.a(findViewById, "contentView.findViewById….id.shazam_history_empty)");
        this.i = findViewById;
        this.k = new zms(wzr.class);
        this.j = new zkf();
        findViewById = ImmutableList.of(new wzk(), this.c);
        akcr.a(findViewById, "ImmutableList.of(\n      …    shazamHistorySection)");
        zms zms = this.k;
        if (zms == null) {
            akcr.a("viewFactory");
        }
        zkf zkf = this.j;
        String str = "bus";
        if (zkf == null) {
            akcr.a(str);
        }
        zke a = zkf.a();
        akcr.a((Object) a, "bus.eventDispatcher");
        this.e = new zmh(zms, a, (ajdw) this.b.b(), (ajdw) this.b.l(), ajyu.k((Iterable) findViewById), 32);
        RecyclerView recyclerView = this.g;
        String str2 = "recyclerView";
        if (recyclerView == null) {
            akcr.a(str2);
        }
        zmh zmh = this.e;
        String str3 = "adapter";
        if (zmh == null) {
            akcr.a(str3);
        }
        recyclerView.setAdapter(zmh);
        this.d = new LinearLayoutManager(this.m);
        recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        LinearLayoutManager linearLayoutManager = this.d;
        if (linearLayoutManager == null) {
            akcr.a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.addOnScrollListener(new c(this));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new f(this, this.m));
        recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        itemTouchHelper.attachToRecyclerView(recyclerView);
        zmh zmh2 = this.e;
        if (zmh2 == null) {
            akcr.a(str3);
        }
        std.a(zmh2.e(), this.a);
        zkf zkf2 = this.j;
        if (zkf2 == null) {
            akcr.a(str);
        }
        findViewById = zkf2.a(this);
        akcr.a(findViewById, "bus.subscribe(this)");
        std.a(findViewById, this.a);
        findViewById = this.c.a().a((ajdw) this.b.l()).g(d.a).e((ajfb) new e(this));
        akcr.a(findViewById, "shazamHistorySection.loa…UserInterface(hasItems) }");
        std.a(findViewById, this.a);
    }

    public final void onPageRemoved() {
        super.onPageRemoved();
        this.a.dispose();
    }
}
