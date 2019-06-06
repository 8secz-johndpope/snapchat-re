package com.snap.discoverfeed.ui.main.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.common.collect.Sets;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajhn;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajvv;
import defpackage.ajwl;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.akcr;
import defpackage.cfl;
import defpackage.hbn;
import defpackage.hgm;
import defpackage.hgr;
import defpackage.hhk;
import defpackage.hhp;
import defpackage.hhu;
import defpackage.hjd;
import defpackage.hju;
import defpackage.hjv;
import defpackage.hjv.c;
import defpackage.hnc;
import defpackage.hno;
import defpackage.hpa;
import defpackage.hpx;
import defpackage.hqu;
import defpackage.hqz;
import defpackage.hrb;
import defpackage.hrl;
import defpackage.hrw;
import defpackage.hrz;
import defpackage.hst;
import defpackage.hsy;
import defpackage.hte;
import defpackage.hte.d;
import defpackage.ihh;
import defpackage.zfw;
import defpackage.zke;
import defpackage.zkq;
import defpackage.zmh;
import defpackage.zms;
import java.util.Set;

public final class DiscoverChannelFragment extends MainPageFragment {
    public zkq a;
    public hst b;
    public hrw c;
    public hgm d;
    public hhu e;
    public hqu f;
    public ihh g;
    private TextView h;
    private ImageButton i;
    private RecyclerView j;
    private hsy k;
    private zmh l;
    private hte m;
    private Long n;
    private final ajwl<hrl> o;

    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ DiscoverChannelFragment a;

        a(DiscoverChannelFragment discoverChannelFragment) {
            this.a = discoverChannelFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "<anonymous parameter 0>");
            FragmentActivity activity = this.a.getActivity();
            if (activity == null) {
                return null;
            }
            activity.onBackPressed();
            return ajxw.a;
        }
    }

    static final class b<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), rect.bottom);
        }
    }

    public DiscoverChannelFragment() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<TileSizingInfo>()");
        this.o = ajwl;
    }

    public final void a(acih acih) {
        acih acih2 = acih;
        if (acih2 instanceof hrz) {
            String str;
            hst hst;
            hrz hrz = (hrz) acih2;
            hjd hjd = hrz.a;
            zke zke = hrz.b;
            hjv hjv = hjd.c;
            String str2 = "adapterContext";
            if (hjv instanceof defpackage.hjv.b) {
                str = ((defpackage.hjv.b) hjv).a;
            } else if (hjv instanceof c) {
                hst = this.b;
                if (hst == null) {
                    akcr.a(str2);
                }
                str = hst.l.getString(((c) hjv).a);
                akcr.a((Object) str, "adapterContext.appContex…String(sectionKeyName.id)");
            } else {
                str = "";
            }
            TextView textView = this.h;
            if (textView == null) {
                akcr.a("headerView");
            }
            textView.setText(str);
            hst = this.b;
            if (hst == null) {
                akcr.a(str2);
            }
            ajdp ajdp = this.o;
            hst hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            ajdp b = hst2.m.b(hjd);
            hju hju = hju.CHANNEL_PIVOT_SECTION;
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            Object a2 = ajvo.a(ajhn.a);
            akcr.a(a2, "Completable.complete()");
            this.k = new hsy(hst, zke, ajdp, b, hju, null, hjd, 2, a, a2);
            hrw hrw = this.c;
            String str3 = "storiesViewFactory";
            if (hrw == null) {
                akcr.a(str3);
            }
            zms zms = hrw;
            hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            ajdw b2 = ((zfw) hst2.a.get()).b();
            hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            ajdw l = ((zfw) hst2.a.get()).l();
            hsy[] hsyArr = new hsy[1];
            hsy hsy = this.k;
            if (hsy == null) {
                akcr.a("controller");
            }
            hsyArr[0] = hsy;
            this.l = new zmh(zms, zke, b2, l, ajym.c(hsyArr), 32);
            if (this.c == null) {
                akcr.a(str3);
            }
            Object e = hrw.e();
            akcr.a(e, "layoutManager");
            e.setItemPrefetchEnabled(true);
            RecyclerView recyclerView = this.j;
            String str4 = "recyclerView";
            if (recyclerView == null) {
                akcr.a(str4);
            }
            recyclerView.setLayoutManager(e);
            RecyclerView recyclerView2 = this.j;
            if (recyclerView2 == null) {
                akcr.a(str4);
            }
            RecyclerView recyclerView3 = this.j;
            if (recyclerView3 == null) {
                akcr.a(str4);
            }
            recyclerView2.addItemDecoration(new hpx(recyclerView3.getContext()));
            recyclerView2 = this.j;
            if (recyclerView2 == null) {
                akcr.a(str4);
            }
            zmh zmh = this.l;
            String str5 = "adapter";
            if (zmh == null) {
                akcr.a(str5);
            }
            recyclerView2.setAdapter(zmh);
            zmh zmh2 = this.l;
            if (zmh2 == null) {
                akcr.a(str5);
            }
            ScopedFragment scopedFragment = this;
            ScopedFragment.a(this, zmh2.e(), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
            recyclerView3 = this.j;
            if (recyclerView3 == null) {
                akcr.a(str4);
            }
            ihh ihh = this.g;
            if (ihh == null) {
                akcr.a("clock");
            }
            hgm hgm = this.d;
            if (hgm == null) {
                akcr.a("storyCardDataSource");
            }
            hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            Object obj = hst2.h.get();
            akcr.a(obj, "adapterContext.storyFeedSessionManager.get()");
            hnc hnc = (hnc) obj;
            hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            hgr hgr = hst2.m;
            hqu hqu = this.f;
            if (hqu == null) {
                akcr.a("tabSectionsConfig");
            }
            hst2 = this.b;
            if (hst2 == null) {
                akcr.a(str2);
            }
            obj = hst2.a.get();
            akcr.a(obj, "adapterContext.schedulers.get()");
            zfw zfw = (zfw) obj;
            hhu hhu = this.e;
            String str6 = "storiesAnalytics";
            if (hhu == null) {
                akcr.a(str6);
            }
            ScopedFragment scopedFragment2 = scopedFragment;
            this.m = new hte(recyclerView3, ihh, hgm, hnc, hgr, hqu, hjd, zfw, hhu);
            hte hte = this.m;
            if (hte == null) {
                akcr.a("storyLoader");
            }
            ajei ajei = new ajei();
            ajvv.a((ajej) hte.a, ajei);
            ajej e2 = hte.a.a().b((ajdw) hte.i.l()).a((ajdw) hte.i.i()).a((ajfc) new d(hte), false).e();
            akcr.a((Object) e2, "nearScrollEndDetector.ob…             .subscribe()");
            ajvv.a(e2, ajei);
            ScopedFragment scopedFragment3 = scopedFragment2;
            ScopedFragment.a(this, (ajej) ajei, scopedFragment3, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
            recyclerView2 = this.j;
            if (recyclerView2 == null) {
                akcr.a(str4);
            }
            zmh = this.l;
            if (zmh == null) {
                akcr.a(str5);
            }
            hpa hpa = new hpa(recyclerView2, zmh, null);
            hhu hhu2 = this.e;
            if (hhu2 == null) {
                akcr.a(str6);
            }
            hrb hrb = new hrb(hhu2, null, hjd, hbn.b);
            hst hst3 = this.b;
            if (hst3 == null) {
                akcr.a(str2);
            }
            Object obj2 = hst3.k.get();
            akcr.a(obj2, "adapterContext.performanceAnalytics.get()");
            hno hno = (hno) obj2;
            hst3 = this.b;
            if (hst3 == null) {
                akcr.a(str2);
            }
            obj2 = hst3.d.get();
            akcr.a(obj2, "adapterContext.fragmentTracker.get()");
            hhk hhk = (hhk) obj2;
            hst3 = this.b;
            if (hst3 == null) {
                akcr.a(str2);
            }
            obj2 = hst3.j.get();
            akcr.a(obj2, "adapterContext.promotedStoryAdInfoStore.get()");
            hhp hhp = (hhp) obj2;
            hhu hhu3 = this.e;
            if (hhu3 == null) {
                akcr.a(str6);
            }
            Set newConcurrentHashSet = Sets.newConcurrentHashSet();
            akcr.a((Object) newConcurrentHashSet, "Sets.newConcurrentHashSet()");
            hst hst4 = this.b;
            if (hst4 == null) {
                akcr.a(str2);
            }
            ScopedFragment.a(this, new hqz(hpa, hno, hhk, hhp, hrb, hhu3, newConcurrentHashSet, ((zfw) hst4.a.get()).b(), hbn.b).a(), scopedFragment3, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        }
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.channel_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.header_title);
        akcr.a(findViewById, "view.findViewById(R.id.header_title)");
        this.h = (TextView) findViewById;
        findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.j = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.header_dismiss_button);
        akcr.a(findViewById, "view.findViewById(R.id.header_dismiss_button)");
        this.i = (ImageButton) findViewById;
        akcr.a(inflate, "view");
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        hhu hhu = this.e;
        if (hhu == null) {
            akcr.a("storiesAnalytics");
        }
        ihh ihh = this.g;
        if (ihh == null) {
            akcr.a("clock");
        }
        long b = ihh.b();
        Long l = this.n;
        if (l == null) {
            akcr.a();
        }
        double longValue = (double) (b - l.longValue());
        Double.isNaN(longValue);
        hhu.b(Double.valueOf(0.001d * longValue), null);
    }

    public final void onResume() {
        super.onResume();
        ihh ihh = this.g;
        if (ihh == null) {
            akcr.a("clock");
        }
        this.n = Long.valueOf(ihh.b());
        hhu hhu = this.e;
        if (hhu == null) {
            akcr.a("storiesAnalytics");
        }
        hhu.F_();
    }

    public final void onStart() {
        super.onStart();
        ImageButton imageButton = this.i;
        if (imageButton == null) {
            akcr.a("dismissButton");
        }
        ScopedFragment.a((ScopedFragment) this, cfl.c(imageButton).p(new a(this)).l(), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
        hst hst = this.b;
        if (hst == null) {
            akcr.a("adapterContext");
        }
        Context context = hst.l;
        if (context != null) {
            int a = abtp.a(context);
            int b = abtp.b(context);
            int min = Math.min(b, a);
            b = Math.max(b, a);
            double d = (double) min;
            Double.isNaN(d);
            a = (int) (d * 0.5d);
            d = (double) a;
            Double.isNaN(d);
            this.o.a(new hrl(Integer.valueOf(min), Integer.valueOf(b), Integer.valueOf(a), Integer.valueOf((int) (d * 1.59d))));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        zkq zkq = this.a;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new b(view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
