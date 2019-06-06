package com.snap.messaging.chat.features.storyreply;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;
import com.snap.messaging.api.reply.InputBarControllerFragment;
import com.snap.messaging.chat.ui.view.BackButtonInterceptingLinearLayout;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achi;
import defpackage.achk;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajwa;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.odu;
import defpackage.pqg;
import defpackage.pqh;
import defpackage.prx;
import defpackage.pva;
import defpackage.pvh;
import defpackage.qal;
import defpackage.qau;
import defpackage.qav;
import defpackage.qax;
import defpackage.qcq;
import defpackage.qcs;
import defpackage.ssm;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkr;
import org.opencv.imgproc.Imgproc;

public final class InputBarFragment extends InputBarControllerFragment implements com.snap.messaging.chat.ui.view.BackButtonInterceptingLinearLayout.a {
    public zgb b;
    public ajdx<prx> c;
    public pqg d;
    public achb<zjm, zjk> e;
    public defpackage.pvl.a f;
    public zhh g;
    public zkr h;
    public odu i;
    final ajwo<ajxm<pvh, achi<zjm, zjk>>> j;
    public final ajws<pqh> k;
    public zjm l;
    public pva m;
    public pqh n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    private final ajws<Boolean> t;
    private BackButtonInterceptingLinearLayout u;
    private qcq v;
    private final ajxe w = ajxh.a(new a(this));
    private final ajxe x = ajxh.a(new e(this));
    private Integer y;
    private c z = new c(this);

    static final class b implements OnClickListener {
        private /* synthetic */ InputBarFragment a;

        b(InputBarFragment inputBarFragment) {
            this.a = inputBarFragment;
        }

        public final void onClick(View view) {
            Toast.makeText(this.a.getContext(), R.string.coming_soon, 1).show();
        }
    }

    public static final class c implements achk<zjm, zjk> {
        private /* synthetic */ InputBarFragment a;

        c(InputBarFragment inputBarFragment) {
            this.a = inputBarFragment;
        }

        public final void a(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
            if (achi.a(ssm.a)) {
                this.a.j.a(new ajxm(pvh.ON_NAVIGATE, achi));
            }
        }

        public final void b(achi<zjm, zjk> achi) {
        }

        public final void c(achi<zjm, zjk> achi) {
        }
    }

    static final class d<T> implements ajfb<ajxm<? extends Rect, ? extends Integer>> {
        private /* synthetic */ InputBarFragment a;
        private /* synthetic */ View b;

        d(InputBarFragment inputBarFragment, View view) {
            this.a = inputBarFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Rect rect = (Rect) ajxm.a;
            Integer num = (Integer) ajxm.b;
            InputBarFragment.a(this.a).setPadding(InputBarFragment.a(this.a).getPaddingLeft(), rect.top, InputBarFragment.a(this.a).getPaddingRight(), InputBarFragment.a(this.a).getPaddingBottom());
            Object obj2 = this.b;
            String str = "insetView";
            akcr.a(obj2, str);
            Object obj3 = this.b;
            akcr.a(obj3, str);
            LayoutParams layoutParams = obj3.getLayoutParams();
            int i = ((num != null && num.intValue() == 0) || this.a.a) ? 0 : rect.bottom;
            layoutParams.height = i;
            obj2.setLayoutParams(layoutParams);
        }
    }

    static final class a extends akcs implements akbk<qal> {
        private /* synthetic */ InputBarFragment a;

        a(InputBarFragment inputBarFragment) {
            this.a = inputBarFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            pqg b = this.a.b();
            odu odu = this.a.i;
            if (odu == null) {
                akcr.a("mediaPackageManager");
            }
            ajei ajei = new ajei();
            ScopedFragment scopedFragment = this.a;
            ScopedFragment.a(scopedFragment, (ajej) ajei, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
            return new qal(b, odu, ajei);
        }
    }

    static final class e extends akcs implements akbk<qcs> {
        private /* synthetic */ InputBarFragment a;

        e(InputBarFragment inputBarFragment) {
            this.a = inputBarFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new qcs(this.a.b());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(InputBarFragment.class), "chatSendingDelegate", "getChatSendingDelegate()Lcom/snap/messaging/chat/features/input/ChatSendingDelegate;"), new akdc(akde.a(InputBarFragment.class), "replyDelegate", "getReplyDelegate()Lcom/snap/messaging/chat/features/storyreply/ReplyDelegate;")};
    }

    public InputBarFragment() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject\n         … MainPageController>?>>()");
        this.j = ajwo;
        ajwo = new ajwl();
        String str = "BehaviorSubject.create()";
        akcr.a(ajwo, str);
        this.k = (ajws) ajwo;
        ajwo = new ajwl();
        akcr.a(ajwo, str);
        this.t = (ajws) ajwo;
    }

    public static final /* synthetic */ BackButtonInterceptingLinearLayout a(InputBarFragment inputBarFragment) {
        BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout = inputBarFragment.u;
        if (backButtonInterceptingLinearLayout == null) {
            akcr.a("fragmentView");
        }
        return backButtonInterceptingLinearLayout;
    }

    private final qal h() {
        return (qal) this.w.b();
    }

    private final qcs i() {
        return (qcs) this.x.b();
    }

    public final pqg b() {
        pqg pqg = this.d;
        if (pqg == null) {
            akcr.a("chatCommands");
        }
        return pqg;
    }

    public final boolean c() {
        pva pva = this.m;
        if (pva == null) {
            akcr.a("operaEventListener");
        }
        pva.m();
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_input_bar, viewGroup, false);
        if (inflate != null) {
            this.u = (BackButtonInterceptingLinearLayout) inflate;
            BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout = this.u;
            if (backButtonInterceptingLinearLayout == null) {
                akcr.a("fragmentView");
            }
            return backButtonInterceptingLinearLayout;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.messaging.chat.ui.view.BackButtonInterceptingLinearLayout");
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        String str = "orchestrator";
        qcq qcq;
        if (z) {
            Integer num = this.y;
            String str2 = "activity!!";
            if (num != null) {
                int intValue = num.intValue();
                Object activity = getActivity();
                if (activity == null) {
                    akcr.a();
                }
                akcr.a(activity, str2);
                activity = activity.getWindow();
                akcr.a(activity, "activity!!.window");
                activity = activity.getDecorView();
                akcr.a(activity, "activity!!.window.decorView");
                activity.setSystemUiVisibility(intValue);
            }
            Object activity2 = getActivity();
            if (activity2 == null) {
                akcr.a();
            }
            akcr.a(activity2, str2);
            activity2.getWindow().clearFlags(Imgproc.INTER_TAB_SIZE2);
            qcq = this.v;
            if (qcq == null) {
                akcr.a(str);
            }
            qcq.a();
            return;
        }
        qcq = this.v;
        if (qcq == null) {
            akcr.a(str);
        }
        qcq.e();
    }

    public final void onStart() {
        super.onStart();
        achb achb = this.e;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a((achk) this.z);
        this.j.a(new ajxm(pvh.ON_STACKED, null));
        this.j.a(new ajxm(pvh.ON_VISIBLE, null));
    }

    public final void onStop() {
        super.onStop();
        achb achb = this.e;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.b((achk) this.z);
        this.j.a(new ajxm(pvh.ON_HIDDEN, null));
        this.t.a((Object) Boolean.TRUE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        qal h;
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout = this.u;
        String str = "fragmentView";
        if (backButtonInterceptingLinearLayout == null) {
            akcr.a(str);
        }
        backButtonInterceptingLinearLayout.a = this;
        backButtonInterceptingLinearLayout = this.u;
        if (backButtonInterceptingLinearLayout == null) {
            akcr.a(str);
        }
        view = backButtonInterceptingLinearLayout.findViewById(R.id.navbar_inset);
        zkr zkr = this.h;
        if (zkr == null) {
            akcr.a("windowRectObserver");
        }
        Object a = zkr.a();
        akcr.a(a, "windowRectObserver.windowRectObservable");
        zhh zhh = this.g;
        String str2 = "keyboardDetector";
        if (zhh == null) {
            akcr.a(str2);
        }
        Object a2 = zhh.a();
        String str3 = "keyboardDetector.keyboardHeightObservable";
        akcr.a(a2, str3);
        ajej f = ajwa.a(a, a2).f((ajfb) new d(this, view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        String str4 = "operaEventListener";
        if (this.o) {
            h = h();
            pva pva = this.m;
            if (pva == null) {
                akcr.a(str4);
            }
            h.a = pva;
            h = h();
        } else {
            qcs i = i();
            String str5 = this.p;
            String str6 = "snapId";
            if (str5 == null) {
                akcr.a(str6);
            }
            String str7 = this.q;
            String str8 = this.r;
            String str9 = this.s;
            pva pva2 = this.m;
            if (pva2 == null) {
                akcr.a(str4);
            }
            akcr.b(str5, str6);
            akcr.b(pva2, "inputBarFragmentEventListener");
            i.a = str5;
            i.c = str8;
            i.b = str7;
            i.d = str9;
            i.e = pva2;
            h = i();
        }
        qax qax = h;
        BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout2 = this.u;
        if (backButtonInterceptingLinearLayout2 == null) {
            akcr.a(str);
        }
        View findViewById = backButtonInterceptingLinearLayout2.findViewById(R.id.chat_drawer_or_keyboard);
        BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout3 = this.u;
        if (backButtonInterceptingLinearLayout3 == null) {
            akcr.a(str);
        }
        Object findViewById2 = backButtonInterceptingLinearLayout3.findViewById(R.id.chat_input_text_field);
        akcr.a(findViewById2, "inputTextField");
        findViewById2.setTag("input_bar");
        defpackage.pvl.a aVar = this.f;
        if (aVar == null) {
            akcr.a("inputBarComponentBuilder");
        }
        aVar = aVar.a((ajdp) this.j).b((ajdp) this.t);
        BackButtonInterceptingLinearLayout backButtonInterceptingLinearLayout4 = this.u;
        if (backButtonInterceptingLinearLayout4 == null) {
            akcr.a(str);
        }
        aVar = aVar.a((View) backButtonInterceptingLinearLayout4);
        akcr.a((Object) findViewById, "drawerContainer");
        defpackage.pvl.a b = aVar.b(findViewById);
        findViewById2 = this.k.j(ajfu.a);
        akcr.a(findViewById2, "chatContextObservable.distinctUntilChanged()");
        b = b.d(findViewById2);
        zhh zhh2 = this.g;
        if (zhh2 == null) {
            akcr.a(str2);
        }
        Object a3 = zhh2.a();
        akcr.a(a3, str3);
        this.v = b.c(a3).a(qax).a().a();
        qcq qcq = this.v;
        str4 = "orchestrator";
        if (qcq == null) {
            akcr.a(str4);
        }
        ScopedFragment.a((ScopedFragment) this, qcq.start(), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ajws ajws = this.k;
        pqh pqh = this.n;
        if (pqh == null) {
            akcr.a("chatContext");
        }
        ajws.a((Object) pqh);
        Object activity = getActivity();
        if (activity == null) {
            akcr.a();
        }
        akcr.a(activity, "activity!!");
        activity = activity.getWindow();
        akcr.a(activity, "activity!!.window");
        activity = activity.getDecorView();
        akcr.a(activity, "activity!!.window.decorView");
        this.y = Integer.valueOf(activity.getSystemUiVisibility());
        backButtonInterceptingLinearLayout = this.u;
        if (backButtonInterceptingLinearLayout == null) {
            akcr.a(str);
        }
        activity = backButtonInterceptingLinearLayout.findViewById(R.id.chat_input_bar_gallery);
        akcr.a(activity, "this");
        activity.setOnClickListener(new b(this));
        qcq = this.v;
        if (qcq == null) {
            akcr.a(str4);
        }
        qau qau = qav.a;
        akcr.b(qau, "style");
        defpackage.qaq.a aVar2 = qcq.a;
        if (aVar2 == null) {
            akcr.a("inputPresenter");
        }
        aVar2.a(qau);
    }
}
