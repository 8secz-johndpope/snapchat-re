package com.snap.settings.core.ui;

import android.content.Context;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.snapchat.android.R;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajyi;
import defpackage.ajzl;
import defpackage.ajzt;
import defpackage.ajzy;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.wnp;
import defpackage.wnr;
import defpackage.wnt;
import defpackage.wnv;
import defpackage.wnw;
import defpackage.wnx;
import defpackage.wog;
import defpackage.wqd;
import defpackage.wqi;
import defpackage.wqk;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmh;
import defpackage.zms;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class SettingsPresenterV2 extends zll<wnw> implements k {
    final ajwy<wnx> a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final ajxe c = ajxh.a(a.a);
    private final ajxe d = ajxh.a(new b(this));
    private final zfw e = zgb.a(wnr.d.callsite("SettingsPresenter2"));
    private RecyclerView f;
    private zkf g;
    private final Context h;
    private final Set<wnp> i;
    private final Set<wnv> j;

    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((wnp) t).a().ItemGroupOrder), Integer.valueOf(((wnp) t2).a().ItemGroupOrder));
        }
    }

    public static final class d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((wnt) t).ItemGroupOrder), Integer.valueOf(((wnt) t2).ItemGroupOrder));
        }
    }

    public static final class e<T> implements Comparator<T> {
        private /* synthetic */ Comparator a;

        public e(Comparator comparator) {
            this.a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            return compare != 0 ? compare : ajzy.a(Integer.valueOf(((wnp) t).b()), Integer.valueOf(((wnp) t2).b()));
        }
    }

    static final class a extends akcs implements akbk<ajei> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static final class b extends akcs implements akbk<wnx> {
        private /* synthetic */ SettingsPresenterV2 a;

        b(SettingsPresenterV2 settingsPresenterV2) {
            this.a = settingsPresenterV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (wnx) this.a.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SettingsPresenterV2.class), "disposables", "getDisposables()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(SettingsPresenterV2.class), "settingsService", "getSettingsService()Lcom/snap/settings/api/SettingsSyncService;")};
    }

    public SettingsPresenterV2(Context context, ajwy<wnx> ajwy, zgb zgb, Set<wnp> set, Set<wnv> set2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "settingsSyncServiceProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(set, "settingsItemSections");
        akcr.b(set2, "settingsPagePlugins");
        this.h = context;
        this.a = ajwy;
        this.i = set;
        this.j = set2;
    }

    private final ajei a() {
        return (ajei) this.c.b();
    }

    private final wnx b() {
        return (wnx) this.d.b();
    }

    private final void c() {
        for (wnv wnv : this.j) {
            zln.bindTo$default(this, wnv, this, null, null, 6, null);
            wnv.a();
        }
    }

    /* renamed from: a */
    public final void takeTarget(wnw wnw) {
        akcr.b(wnw, "target");
        super.takeTarget(wnw);
        wnw.getLifecycle().a(this);
    }

    public final void dropTarget() {
        wnw wnw = (wnw) getTarget();
        if (wnw != null) {
            j lifecycle = wnw.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.b.compareAndSet(false, true)) {
            wnw wnw = (wnw) getTarget();
            if (wnw != null) {
                View a = wnw.a(R.id.settings_items_layout);
                if (a != null) {
                    this.f = (RecyclerView) a;
                    zln zln = this;
                    this.g = (zkf) zln.bindTo$default(this, new zkf(), zln, null, null, 6, null);
                    zkf zkf = this.g;
                    String str = "bus";
                    if (zkf == null) {
                        akcr.a(str);
                    }
                    zln.bindTo$default(this, zkf.a(this), zln, null, null, 6, null);
                    RecyclerView recyclerView = this.f;
                    String str2 = "recyclerView";
                    if (recyclerView == null) {
                        akcr.a(str2);
                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.h, 1, false));
                    recyclerView = this.f;
                    if (recyclerView == null) {
                        akcr.a(str2);
                    }
                    recyclerView.setItemAnimator(null);
                    Set a2 = ajzt.a((Object[]) new Class[]{wqd.class, wog.class});
                    Collection collection = this.i;
                    if (collection != null) {
                        Object[] toArray = collection.toArray(new wnp[0]);
                        if (toArray != null) {
                            Iterable c = ajyi.c(toArray, new e(new c()));
                            Map linkedHashMap = new LinkedHashMap();
                            for (Object next : c) {
                                wnt a3 = ((wnp) next).a();
                                ArrayList arrayList = linkedHashMap.get(a3);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    linkedHashMap.put(a3, arrayList);
                                }
                                arrayList.add(next);
                            }
                            SortedMap a4 = ajzl.a(linkedHashMap, new d());
                            ArrayList<wnp> arrayList2 = new ArrayList();
                            for (Object next2 : a4.keySet()) {
                                if (a4.get(next2) != null) {
                                    Object obj = a4.get(next2);
                                    if (obj != null) {
                                        List list = (List) obj;
                                        if (next2 != wnt.FOOTER) {
                                            akcr.a(next2, "group");
                                            arrayList2.add(new wqi(next2, list));
                                        }
                                        arrayList2.addAll(list);
                                    } else {
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                }
                            }
                            for (wnp wnp : arrayList2) {
                                Object b = b();
                                akcr.a(b, "settingsService");
                                ajei a5 = a();
                                akcr.b(b, "settingsSyncService");
                                akcr.b(a5, "pageDisposable");
                                wnp.o = b;
                                wnp.p = a5;
                                zln.bindTo$default(this, wnp, zln, null, null, 6, null);
                            }
                            zms zms = new zms((Collection) a2);
                            zkf zkf2 = this.g;
                            if (zkf2 == null) {
                                akcr.a(str);
                            }
                            zke a6 = zkf2.a();
                            akcr.a((Object) a6, "bus.eventDispatcher");
                            zmh zmh = new zmh(zms, a6, (ajdw) this.e.b(), (ajdw) this.e.l(), (List) arrayList2, 32);
                            RecyclerView recyclerView2 = this.f;
                            if (recyclerView2 == null) {
                                akcr.a(str2);
                            }
                            recyclerView2.setAdapter(zmh);
                            recyclerView2 = this.f;
                            if (recyclerView2 == null) {
                                akcr.a(str2);
                            }
                            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.h, 1);
                            dividerItemDecoration.setDrawable(this.h.getResources().getDrawable(R.drawable.new_list_divider));
                            recyclerView2.addItemDecoration(dividerItemDecoration);
                            zln zln2 = zln;
                            zln.bindTo$default(this, zmh.e(), zln2, null, null, 6, null);
                            zln.bindTo$default(this, b(), zln2, null, null, 6, null);
                            c();
                            return;
                        }
                        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
                }
                throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
            }
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        a().a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPageItemBindEvent(wqk wqk) {
        akcr.b(wqk, "event");
        wnw wnw = (wnw) getTarget();
        if (wnw != null) {
            wnw.a();
        }
    }
}
