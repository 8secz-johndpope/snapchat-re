package com.snap.messaging.sendto.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snap.messaging.sendto.internal.ui.SendToPresenter;
import com.snap.messaging.sendto.internal.ui.view.MushroomSendToActionBarView;
import com.snap.messaging.sendto.internal.ui.view.SendToBottomPanelView;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.ViewStubWrapper;
import com.snap.ui.view.ViewStubWrapper.OnInflatedListener;
import com.snap.ui.view.scrollbar.SnapScrollBar;
import com.snap.ui.view.scrollbar.SnapScrollBar.IndicatorTextLookup;
import com.snapchat.android.R;
import defpackage.abgc;
import defpackage.ablk;
import defpackage.abll;
import defpackage.abtc;
import defpackage.abtj;
import defpackage.achi;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajwy;
import defpackage.ajxw;
import defpackage.akcr;
import defpackage.akly;
import defpackage.ftl;
import defpackage.igu;
import defpackage.jic;
import defpackage.puk;
import defpackage.pus;
import defpackage.rgq;
import defpackage.rgr;
import defpackage.rgs;
import defpackage.rgv;
import defpackage.rgw;
import defpackage.rhf;
import defpackage.rhl;
import defpackage.rhm;
import defpackage.rhq;
import defpackage.rhz;
import defpackage.rif;
import defpackage.rit;
import defpackage.rjf;
import defpackage.rjn;
import defpackage.rmk;
import defpackage.rmr;
import defpackage.rnq;
import defpackage.sdl;
import defpackage.sdm;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zic;
import defpackage.zig;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkq;
import defpackage.zme;
import defpackage.zml;
import defpackage.zmy;
import defpackage.zmz;
import defpackage.zna;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class SendToFragmentImpl extends MainPageFragment implements com.snap.messaging.sendto.internal.ui.view.SendToBottomPanelView.a, IndicatorTextLookup, rgs, zjj, zjq {
    private ViewStubWrapper<SendToBottomPanelView> A;
    private View B;
    private View C;
    private b D;
    private final List<a> E = new ArrayList();
    private final a F = a(jic.SEND_TO_PRESELECT_RECIPIENTS_IN_CREATE_GROUP);
    private final a G = a(jic.ST_SEARCH_V2_ENABLE);
    private final a H = a(jic.ST_SELECTION_V2_ENABLE);
    private final a I = a(jic.SEND_TO_NEW_GROUP_SECTION);
    private rgq J;
    private puk K = null;
    private ajei L;
    private final ajwl<rhl> M = new ajwl();
    private final ajwl<rgv> N = new ajwl();
    private final OnGlobalLayoutListener O = new OnGlobalLayoutListener() {
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
        /* JADX WARNING: Missing block: B:42:0x00a9, code skipped:
            if (r1 != null) goto L_0x00ad;
     */
        public final void onGlobalLayout() {
            /*
            r8 = this;
            r0 = com.snap.messaging.sendto.internal.SendToFragmentImpl.this;
            r0 = r0.isAdded();
            if (r0 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = com.snap.messaging.sendto.internal.SendToFragmentImpl.this;
            r0 = r0.b;
            r0 = r0.getHeight();
            if (r0 > 0) goto L_0x0014;
        L_0x0013:
            return;
        L_0x0014:
            r0 = com.snap.messaging.sendto.internal.SendToFragmentImpl.this;
            r1 = r0.g;
            r2 = 0;
            r3 = 1;
            if (r1 != 0) goto L_0x0063;
        L_0x001c:
            r1 = r0.b;
            r1 = r1.getAdapter();
            r1 = (defpackage.zml) r1;
            if (r1 == 0) goto L_0x0063;
        L_0x0026:
            r4 = 0;
        L_0x0027:
            r5 = r1.getItemCount();
            if (r4 >= r5) goto L_0x0063;
        L_0x002d:
            r5 = r1.a(r4);
            r5 = r5 instanceof defpackage.rmp;
            if (r5 == 0) goto L_0x0060;
        L_0x0035:
            r0.g = r3;
            r0.w();
            r5 = r0.v;
            if (r5 == 0) goto L_0x0059;
        L_0x003e:
            r5 = r0.v;
            r5 = r5.f;
            if (r5 != 0) goto L_0x0056;
        L_0x0044:
            r5 = r0.v;
            r5.a();
            r5 = r0.j;
            r6 = android.os.SystemClock.elapsedRealtime();
            r6 = java.lang.Long.valueOf(r6);
            r5.d(r6);
        L_0x0056:
            r5 = 0;
            r0.v = r5;
        L_0x0059:
            r5 = r0.y;
            r6 = defpackage.ajxw.a;
            r5.a(r6);
        L_0x0060:
            r4 = r4 + 1;
            goto L_0x0027;
        L_0x0063:
            r0 = com.snap.messaging.sendto.internal.SendToFragmentImpl.this;
            r1 = r0.f;
            r1 = r1.a();
            if (r1 == 0) goto L_0x0071;
        L_0x006d:
            r1 = r0.t;
            if (r1 != 0) goto L_0x00ad;
        L_0x0071:
            r1 = r0.b;
            r1 = r1.getLayoutManager();
            r1 = (android.support.v7.widget.LinearLayoutManager) r1;
            if (r1 == 0) goto L_0x00ad;
        L_0x007b:
            r4 = r1.findFirstCompletelyVisibleItemPosition();
            r5 = -1;
            if (r4 == 0) goto L_0x0087;
        L_0x0082:
            if (r4 != r5) goto L_0x0085;
        L_0x0084:
            goto L_0x0087;
        L_0x0085:
            r4 = 0;
            goto L_0x0088;
        L_0x0087:
            r4 = 1;
        L_0x0088:
            if (r4 == 0) goto L_0x00ab;
        L_0x008a:
            r4 = r0.b;
            r4 = r4.getAdapter();
            if (r4 != 0) goto L_0x0094;
        L_0x0092:
            r1 = 1;
            goto L_0x00a9;
        L_0x0094:
            r1 = r1.findLastCompletelyVisibleItemPosition();
            r4 = r0.b;
            r4 = r4.getAdapter();
            r4 = r4.getItemCount();
            r4 = r4 - r3;
            if (r1 == r4) goto L_0x0092;
        L_0x00a5:
            if (r1 != r5) goto L_0x00a8;
        L_0x00a7:
            goto L_0x0092;
        L_0x00a8:
            r1 = 0;
        L_0x00a9:
            if (r1 != 0) goto L_0x00ad;
        L_0x00ab:
            r1 = 1;
            goto L_0x00ae;
        L_0x00ad:
            r1 = 0;
        L_0x00ae:
            if (r1 == 0) goto L_0x00ca;
        L_0x00b0:
            r1 = r0.q;
            if (r1 != 0) goto L_0x00e5;
        L_0x00b4:
            r0.q = r3;
            r1 = r0.f;
            r1 = r1.a();
            if (r1 == 0) goto L_0x00c4;
        L_0x00be:
            r0 = r0.d;
            r0.setVisibility(r2);
            return;
        L_0x00c4:
            r0 = r0.c;
            r0.showScrollBar();
            return;
        L_0x00ca:
            r1 = r0.q;
            if (r1 == 0) goto L_0x00e5;
        L_0x00ce:
            r0.q = r2;
            r1 = r0.f;
            r1 = r1.a();
            r2 = 8;
            if (r1 == 0) goto L_0x00e0;
        L_0x00da:
            r0 = r0.d;
            r0.setVisibility(r2);
            return;
        L_0x00e0:
            r0 = r0.c;
            r0.setVisibility(r2);
        L_0x00e5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.sendto.internal.SendToFragmentImpl$AnonymousClass1.onGlobalLayout():void");
        }
    };
    private zic P;
    MushroomSendToActionBarView a;
    RecyclerView b;
    SnapScrollBar c;
    ViewStubWrapper<AlphabeticScrollbar> d;
    int e = 0;
    final a f = a(jic.SEND_TO_SCROLLBAR_V2_ENABLE);
    volatile boolean g = false;
    public zkq h;
    public SendToPresenter i;
    public rhz j;
    public sdm k;
    public zhh l;
    public ajwy<zig> m;
    public ajwy<ablk> n;
    public zgb o;
    public ftl p;
    boolean q;
    boolean r;
    boolean s = false;
    boolean t = false;
    boolean u = false;
    abll v = null;
    ajei w;
    final ajwl<rgw> x = new ajwl();
    final ajwl<ajxw> y = new ajwl();
    private View z;

    static class a {
        final rhq<Boolean> a;
        final jic b;

        a(jic jic) {
            this.b = jic;
            this.a = new rhq((Boolean) jic.delegate.a);
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return ((Boolean) this.a.a()).booleanValue();
        }
    }

    static class b extends zme {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final void a(Rect rect, View view, zmy zmy) {
            if (zmy.getType() != rit.STORIES_SECTION) {
                int i;
                Object obj = ((zmy instanceof zmz) || (zmy instanceof zna)) ? 1 : null;
                if (obj != null) {
                    i = this.a;
                    rect.left = i;
                } else {
                    rect.left = this.a;
                    i = this.b;
                }
                rect.right = i;
            }
        }
    }

    private a a(jic jic) {
        a aVar = new a(jic);
        this.E.add(aVar);
        return aVar;
    }

    private void a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.b.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.c.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.c.setLayoutParams(layoutParams);
    }

    public static void a(Context context, View view) {
        if (context != null) {
            try {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception unused) {
            }
        }
    }

    private void a(rhf rhf) {
        rgq rgq = this.J;
        Object obj = ((rgq == null || rgq.k) && !rhf.d()) ? 1 : null;
        if (obj != null) {
            ((SendToBottomPanelView) this.A.get()).a(true);
            SendToBottomPanelView sendToBottomPanelView = (SendToBottomPanelView) this.A.get();
            sendToBottomPanelView.d.setText(rhf.e());
            sendToBottomPanelView.c.post(new Runnable() {
                public final void run() {
                    SendToBottomPanelView.this.c.fullScroll(66);
                }
            });
            a(this.e);
        } else {
            a(0);
            if (this.A.getIfInflated() != null) {
                ((SendToBottomPanelView) this.A.get()).a(false);
            }
        }
        this.a.b();
    }

    static pus b(String str) {
        return (str == null || akly.c(str)) ? null : new pus(str, Collections.emptyList(), Collections.emptyList());
    }

    private void c(String str) {
        this.i.m().b.a(new rjn(str));
        this.j.f();
    }

    public final long S_() {
        return -1;
    }

    public final ajdp<ajxw> a() {
        return this.y.d().g();
    }

    public final void a(acih acih) {
        super.a(acih);
        if (acih instanceof rhm) {
            rhm rhm = (rhm) acih;
            this.j.a(rhm.c);
            this.j.a(rhm.e);
            Object obj = rhm.a;
            this.K = obj.c;
            this.M.a(obj);
            this.J = rhm.b;
            rgq rgq = this.J;
            if (!(rgq == null || rgq.m == null)) {
                this.a.a(this.J.m);
            }
            rgq = this.J;
            if (rgq != null && rgq.q) {
                MushroomSendToActionBarView mushroomSendToActionBarView = this.a;
                AnonymousClass6 anonymousClass6 = new OnClickListener() {
                    public final void onClick(View view) {
                        if (SendToFragmentImpl.this.i != null) {
                            SendToFragmentImpl.this.i.m().b.a(new rjf());
                        }
                    }
                };
                ImageView imageView = (ImageView) mushroomSendToActionBarView.a.a();
                mushroomSendToActionBarView.b.a();
                if (imageView != null) {
                    imageView.setOnClickListener(anonymousClass6);
                    imageView.setOnTouchListener(new abtc(imageView));
                }
            }
            this.v = rhm.d;
        }
        this.i.n = this.f.a();
        this.i.o = this.G.a();
        this.i.p = this.F.a();
        this.i.q = this.H.a();
        this.i.r = this.I.a();
        this.i.takeTarget(this);
        this.L.a(this.M.f((ajfb) new -$$Lambda$SendToFragmentImpl$S488-7d5IT5fCvj42KyUwyiN8Sg(this)));
    }

    public final void a(Integer num) {
        String a = this.i.e.a(num.intValue());
        if (!TextUtils.isEmpty(a)) {
            this.a.a(false);
            this.a.a(a);
            this.i.a(true);
        }
    }

    public final void a(String str) {
        this.a.a((CharSequence) str);
    }

    public final void a_(achi<zjm, zjk> achi) {
        super.a_(achi);
        this.k.a((zjm) achi.f.e(), sdl.a);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.O);
        if (this.P == null && ((ablk) this.n.get()).a(new abgc())) {
            this.P = new zic(this.m, rgr.b.b());
            this.b.addOnScrollListener(this.P);
        }
        this.b.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!SendToFragmentImpl.this.s && abtj.a(SendToFragmentImpl.this.getContext())) {
                    SendToFragmentImpl.a(SendToFragmentImpl.this.getContext(), SendToFragmentImpl.this.a);
                    SendToFragmentImpl.this.s = true;
                }
                if (motionEvent.getAction() == 1) {
                    SendToFragmentImpl.this.s = false;
                }
                return false;
            }
        });
    }

    public final ajdp<rgv> b() {
        return this.N;
    }

    public final void b(achi<zjm, zjk> achi) {
        super.b((achi) achi);
        this.k.a((zjm) achi.e.e());
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.O);
        this.b.setOnTouchListener(null);
        this.b.removeOnScrollListener(this.P);
        View ifInflated = this.A.getIfInflated();
        if (ifInflated != null && abtj.a(ifInflated.getContext())) {
            a(ifInflated.getContext(), ifInflated);
        }
    }

    public final boolean d() {
        return false;
    }

    public final ajdp<rgw> g() {
        return this.x;
    }

    public String getScrollIndicatorTextForItem(int i) {
        zmy a = ((zml) this.b.getAdapter()).a(i);
        String str = "";
        if (a instanceof rmk) {
            rmk rmk = (rmk) a;
            int f = rmk.f();
            String charSequence;
            if (f == 0) {
                charSequence = rmk.c().toString();
                if (Strings.isNullOrEmpty(charSequence)) {
                    return str;
                }
                return new StringBuilder().appendCodePoint(charSequence.codePointAt(0)).toString().toUpperCase(Locale.getDefault());
            }
            if (f != 1) {
                Resources resources;
                if (f == 2) {
                    resources = getResources();
                    f = R.string.send_to_groups_scroll_bar_label;
                } else if (f == 3) {
                    resources = getResources();
                    f = R.string.send_to_recent_scroll_bar_label;
                } else if (f == 6) {
                    resources = getResources();
                    f = R.string.send_to_quick_add_scroll_bar_label;
                } else if (f == 8) {
                    resources = getResources();
                    f = R.string.send_to_suggested_scroll_bar_label;
                } else if (f != 16) {
                    charSequence = null;
                } else {
                    resources = getResources();
                    f = R.string.send_to_new_groups;
                }
                charSequence = resources.getString(f);
            } else {
                charSequence = getResources().getString(R.string.send_to_best_scroll_bar_label);
            }
            if (!Strings.isNullOrEmpty(charSequence)) {
                return charSequence;
            }
        } else if (a instanceof rnq) {
            return getResources().getString(R.string.send_to_best_scroll_bar_label);
        } else {
            if (a instanceof rmr) {
                return ((rmr) a).a;
            }
        }
        return str;
    }

    public final MainPageFragment h() {
        return this;
    }

    public final RecyclerView i() {
        return this.b;
    }

    public final ajdx<Uri> j() {
        return this.M.n(-$$Lambda$SendToFragmentImpl$CgdEJHUzDhDkfN3rztQOBkRqeGs.INSTANCE).e();
    }

    public final ajdp<Boolean> k() {
        return this.M.p(-$$Lambda$qMEBQ4A4vP9DW7DAJvXD8zRfU7s.INSTANCE);
    }

    public final rgq l() {
        rgq rgq = this.J;
        return rgq != null ? rgq : new rgq();
    }

    public final rhz m() {
        return this.j;
    }

    public final rif n() {
        return this.j;
    }

    public final SnapScrollBar o() {
        return this.c;
    }

    public final boolean o_() {
        this.j.h();
        SendToPresenter sendToPresenter = this.i;
        if (sendToPresenter == null) {
            return super.o_();
        }
        if (Strings.isNullOrEmpty((String) sendToPresenter.g.p())) {
            return this.r ? true : super.o_();
        } else {
            this.a.a();
            return true;
        }
    }

    public void onAttach(Context context) {
        this.L = new ajei();
        aipx.a(this);
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j.a(SystemClock.elapsedRealtime());
        this.w = new ajei();
        zfw a = zgb.a(rgr.d, "SendToFragmentImpl");
        for (a aVar : this.E) {
            ajei ajei = this.w;
            ajdp b = this.p.p(aVar.b).b((ajdw) a.h());
            rhq rhq = aVar.a;
            akcr.b(b, "valueStream");
            Pair a2 = igu.a(b, rhq.b);
            rhq.a = (Supplier) a2.second;
            Object obj = a2.first;
            akcr.a(obj, "pair.first");
            ajei.a((ajej) obj);
        }
        this.z = layoutInflater.inflate(R.layout.mushroom_sendto_fragment, viewGroup, false);
        this.b = (RecyclerView) this.z.findViewById(R.id.recycler_view);
        this.c = (SnapScrollBar) this.z.findViewById(R.id.scroll_bar);
        this.d = new ViewStubWrapper((ViewStub) this.z.findViewById(R.id.sendto_scroll_bar_v2_viewstub));
        this.A = new ViewStubWrapper((ViewStub) this.z.findViewById(R.id.bottom_panel_viewstub));
        this.A.setOnInflatedListener(new OnInflatedListener<SendToBottomPanelView>() {
            private static /* synthetic */ void a(SendToBottomPanelView sendToBottomPanelView, Integer num) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) sendToBottomPanelView.getLayoutParams();
                marginLayoutParams.bottomMargin = num.intValue();
                sendToBottomPanelView.setLayoutParams(marginLayoutParams);
            }

            public final /* synthetic */ void onInflated(Object obj) {
                SendToBottomPanelView sendToBottomPanelView = (SendToBottomPanelView) obj;
                sendToBottomPanelView.a.setOnTouchListener(new abtc(sendToBottomPanelView.a));
                ImageView imageView = sendToBottomPanelView.a;
                if (sendToBottomPanelView.getResources().getConfiguration().getLayoutDirection() == 1) {
                    imageView.setScaleX(-1.0f);
                }
                sendToBottomPanelView.d.setOnTouchListener(new com.snap.messaging.sendto.internal.ui.view.SendToBottomPanelView.AnonymousClass3(SendToFragmentImpl.this));
                -$$Lambda$SendToFragmentImpl$3$xyHTDRJ_KTZ9HTQ04qmiJajj7hc -__lambda_sendtofragmentimpl_3_xyhtdrj_ktz9htq04qmijajj7hc = new -$$Lambda$SendToFragmentImpl$3$xyHTDRJ_KTZ9HTQ04qmiJajj7hc(this);
                sendToBottomPanelView.b.setOnClickListener(-__lambda_sendtofragmentimpl_3_xyhtdrj_ktz9htq04qmijajj7hc);
                sendToBottomPanelView.a.setOnClickListener(-__lambda_sendtofragmentimpl_3_xyhtdrj_ktz9htq04qmijajj7hc);
                SendToFragmentImpl.this.w.a(SendToFragmentImpl.this.l.a.j(ajfu.a).f(new -$$Lambda$SendToFragmentImpl$3$a0m9JgAXo9L59lj6qyK4OM9TqD8(sendToBottomPanelView)));
                SendToFragmentImpl.this.w.a(ajek.a(new -$$Lambda$SendToFragmentImpl$3$tBTDwbMGl3Tp62u4ecnSBJX5jug(sendToBottomPanelView)));
                SendToFragmentImpl sendToFragmentImpl = SendToFragmentImpl.this;
                sendToFragmentImpl.e = sendToFragmentImpl.getResources().getDimensionPixelSize(R.dimen.send_to_send_bar_height);
            }
        });
        this.a = (MushroomSendToActionBarView) this.z.findViewById(R.id.top_panel);
        this.a.a((TextWatcher) new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SendToFragmentImpl.this.i.g.a(charSequence.toString());
                SendToFragmentImpl.this.t = Strings.isNullOrEmpty(charSequence.toString()) ^ 1;
            }
        });
        this.a.b(new OnClickListener() {
            public final void onClick(View view) {
                if (SendToFragmentImpl.this.i != null) {
                    SendToFragmentImpl.this.i.a(false);
                    if (Strings.isNullOrEmpty((String) SendToFragmentImpl.this.i.g.p())) {
                        if (abtj.a(SendToFragmentImpl.this.getContext())) {
                            SendToFragmentImpl.a(SendToFragmentImpl.this.getContext(), SendToFragmentImpl.this.a);
                        }
                        SendToFragmentImpl.this.getActivity().onBackPressed();
                        return;
                    }
                    SendToFragmentImpl.this.a.a();
                }
            }
        });
        this.a.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                if (SendToFragmentImpl.this.i != null) {
                    SendToFragmentImpl.this.i.a(false);
                }
            }
        });
        this.w.a(this.a.c().f(new -$$Lambda$SendToFragmentImpl$3A4EN4Gx8I9yBmhFz40Hu4HrhQo(this)));
        this.a.e.setVisibility(8);
        this.B = this.z.findViewById(R.id.statusbar_inset);
        this.C = this.z.findViewById(R.id.navbar_inset);
        this.q = false;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.send_to_recycler_margin_start);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.send_to_recycler_margin_end);
        this.b.removeItemDecoration(this.D);
        this.D = new b(dimensionPixelOffset, dimensionPixelOffset2);
        this.b.addItemDecoration(this.D);
        return this.z;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.w.a();
        this.b.clearOnScrollListeners();
        this.a.b(null);
        this.a.a(null);
    }

    public void onDetach() {
        this.L.a();
        this.L = null;
        this.i.dropTarget();
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        this.j.a(Long.valueOf(System.currentTimeMillis()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b.setLayoutManager(new LinearLayoutManager(getActivity()) {
            public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
                return false;
            }

            public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }
        });
        this.b.setItemAnimator(null);
        ajej f = this.h.c.f(new -$$Lambda$SendToFragmentImpl$k3aa5hcSMp2dbCZ7vdIs8x3yG0s(this));
        if (this.f.a()) {
            this.w.a(((AlphabeticScrollbar) this.d.get()).a().f(new -$$Lambda$SendToFragmentImpl$WBbh8Q3FNGTDgsJqawZC44B9s-g(this)));
            this.d.setVisibility(4);
            this.b.addOnScrollListener(new OnScrollListener() {
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (i != 0 || i2 != 0) {
                        SendToFragmentImpl.this.j.f();
                    }
                }
            });
        } else {
            this.b.addOnScrollListener(new OnScrollListener() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i != 0) {
                        if (i == 1) {
                            SendToFragmentImpl.this.r = true;
                        }
                        return;
                    }
                    SendToFragmentImpl.this.r = false;
                }

                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (i != 0 || i2 != 0) {
                        SendToFragmentImpl.this.j.f();
                    }
                }
            });
            this.c.setScrollBarIndicatorImageSource((Drawable) Objects.requireNonNull(ContextCompat.getDrawable(getContext(), R.drawable.send_to_scroll_bar_background_image)));
            this.c.setScrollBarIndicatorTextBackground((Drawable) Objects.requireNonNull(ContextCompat.getDrawable(getContext(), R.drawable.send_to_scroll_bar_background_color)));
            this.c.setVisibility(4);
        }
        this.w.a(this.i.l().f(new -$$Lambda$SendToFragmentImpl$l0cR4Kg3ZFE1M0s_eQjRJlHl-F8(this)), f);
        this.j.c(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final puk p() {
        return this.K;
    }

    public final void q_() {
        this.N.a(new rgv(new rhl(this.i.e.c(), null, null, null, this.i.e.f(), this.i.e.g(), this.u)));
    }
}
