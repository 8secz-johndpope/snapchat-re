package com.snap.identity.ui.settings.tfa.settings;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.iuc;
import defpackage.joq;
import defpackage.jpx;
import defpackage.jpz;
import defpackage.jpz.f;
import defpackage.jpz.g;
import defpackage.jpz.h;
import defpackage.jpz.i;
import defpackage.jpz.j;
import defpackage.jpz.k;
import defpackage.jpz.l;
import defpackage.jpz.m;
import defpackage.jpz.n;
import defpackage.jpz.o;
import defpackage.jpz.p;
import defpackage.jpz.q;
import defpackage.jpz.r;
import defpackage.jqa;
import defpackage.jqb;
import defpackage.jqc;
import defpackage.jqd;
import defpackage.jqe;
import defpackage.jqf;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;

public final class TfaForgetDevicesFragment extends BaseIdentitySettingsFragment implements jqf {
    public jqb a;
    public jpz b;
    final akbl<View, ajxw> c = new d(this);
    private View d;
    private TextView e;
    private TextView f;
    private TextView j;
    private RecyclerView k;
    private zfw l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class e<T> implements ajfb<jqe> {
        private /* synthetic */ TfaForgetDevicesFragment a;

        e(TfaForgetDevicesFragment tfaForgetDevicesFragment) {
            this.a = tfaForgetDevicesFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jqe) obj;
            this.a.g();
            jpz jpz = this.a.b;
            if (jpz == null) {
                akcr.a("presenter");
            }
            akcr.a(obj, "it");
            akcr.b(obj, "state");
            Object obj2 = (jqf) jpz.getTarget();
            if (obj2 != null) {
                String str;
                zgy a;
                Object valueOf;
                akbk jVar;
                k kVar;
                Context context;
                int i;
                akcr.a(obj2, "target ?: return");
                String str2 = "navigationHost.get()";
                if ((akgb.a(obj.a) ^ 1) != 0) {
                    str = obj.a;
                    Context context2 = jpz.c;
                    Object obj3 = jpz.d.get();
                    akcr.a(obj3, str2);
                    a = new defpackage.zgy.a(context2, (achb) obj3, jpz.e, false, null, 24).b(str).a((int) R.string.privacy_policy_ok, (akbl) q.a, true).a();
                    ((achb) jpz.d.get()).a((achd) a, a.a, null);
                }
                if (obj.d && obj.e.isEmpty()) {
                    Context context3 = jpz.c;
                    Object obj4 = jpz.d.get();
                    akcr.a(obj4, str2);
                    a = new defpackage.zgy.a(context3, (achb) obj4, jpz.e, false, null, 24).b((int) R.string.settings_tfa_forget_all_devices_succeeded_message).a((int) R.string.ok, (akbl) new r(jpz), false).a();
                    ((achb) jpz.d.get()).a((achd) a, a.a, null);
                }
                int i2 = 8;
                if (obj.c) {
                    jpz.a(jpz.c.getString(R.string.loading), new defpackage.jpz.b(obj2.b().getText()), new i(obj2.b()));
                    valueOf = Integer.valueOf(0);
                    jVar = new j(obj2.a());
                    kVar = new k(obj2.a());
                } else if (obj.b) {
                    jpz.a(jpz.c.getString(R.string.forgetting), new l(obj2.b().getText()), new m(obj2.b()));
                    valueOf = Integer.valueOf(0);
                    jVar = new n(obj2.a());
                    kVar = new o(obj2.a());
                } else {
                    valueOf = Integer.valueOf(8);
                    jVar = new p(obj2.a());
                    kVar = new defpackage.jpz.c(obj2.a());
                }
                jpz.a(valueOf, jVar, kVar);
                if (!obj.e.isEmpty()) {
                    i2 = 0;
                }
                int size = obj.e.size();
                if (size == 0) {
                    context = jpz.c;
                    i = R.string.settings_tfa_forget_no_device_explanation;
                } else if (size != 1) {
                    context = jpz.c;
                    i = R.string.settings_tfa_forget_multiple_devices_explanation;
                } else {
                    context = jpz.c;
                    i = R.string.settings_tfa_forget_one_device_explanation;
                }
                str = context.getString(i);
                obj2.f().setAdapter(new jqd(jpz.c, obj.e, new defpackage.jpz.d(jpz)));
                jpz.a(str, new defpackage.jpz.e(obj2.c().getText()), new f(obj2.c()));
                jpz.a(Integer.valueOf(i2), new g(obj2.d()), new h(obj2.d()));
            }
            TfaForgetDevicesFragment tfaForgetDevicesFragment = this.a;
            tfaForgetDevicesFragment.d().setOnClickListener(new jqa(tfaForgetDevicesFragment.c));
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaForgetDevicesFragment a;

        d(TfaForgetDevicesFragment tfaForgetDevicesFragment) {
            this.a = tfaForgetDevicesFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            jqb jqb = this.a.a;
            if (jqb == null) {
                akcr.a("handler");
            }
            jqb.a(jqe.a(jqb.a(), "", true, false, false, null, 28));
            ajej e = ((joq) jqb.c.get()).y().e((ajfb) new defpackage.jqb.d(jqb));
            akcr.a((Object) e, "settingsTfaFlowManager.g…eItems)\n                }");
            ajvv.a(e, jqb.b);
            return ajxw.a;
        }
    }

    static final class b extends akcq implements akbl<jpx, ajxw> {
        b(jqb jqb) {
            super(1, jqb);
        }

        public final String getName() {
            return "onForgetOneConfirmed";
        }

        public final akej getOwner() {
            return akde.a(jqb.class);
        }

        public final String getSignature() {
            return "onForgetOneConfirmed(Lcom/snap/identity/ui/settings/tfa/settings/TfaDeviceItem;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            jpx jpx = (jpx) obj;
            akcr.b(jpx, "p1");
            jqb jqb = (jqb) this.receiver;
            akcr.b(jpx, "item");
            jqb.a(jqe.a(jqb.a(), "", false, false, true, null, 22));
            jqb.a(jpx.a(jpx, "", true));
            joq joq = (joq) jqb.c.get();
            Object obj2 = jpx.a.a;
            akcr.a(obj2, "item.device.id");
            ajej e = joq.d(obj2).e((ajfb) new defpackage.jqb.e(jqb, jpx));
            akcr.a((Object) e, "settingsTfaFlowManager.g…ssage))\n                }");
            ajvv.a(e, jqb.b);
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbk<ajxw> {
        c(jqb jqb) {
            super(0, jqb);
        }

        public final String getName() {
            return "onForgetAllSucceeded";
        }

        public final akej getOwner() {
            return akde.a(jqb.class);
        }

        public final String getSignature() {
            return "onForgetAllSucceeded()V";
        }

        public final /* synthetic */ Object invoke() {
            ((joq) ((jqb) this.receiver).c.get()).j();
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final View a() {
        View view = this.d;
        if (view == null) {
            akcr.a("overlay");
        }
        return view;
    }

    public final TextView b() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("overlayText");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("explanationText");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("forgetAllButton");
        }
        return textView;
    }

    public final RecyclerView f() {
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            akcr.a("deviceItemList");
        }
        return recyclerView;
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        d().setOnClickListener(null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jpz jpz = this.b;
        if (jpz == null) {
            akcr.a("presenter");
        }
        jpz.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jqb jqb = this.a;
        String str = "handler";
        if (jqb == null) {
            akcr.a(str);
        }
        ajej f = ((joq) jqb.c.get()).c().f((ajfb) new jqc(new defpackage.jqb.b(jqb)));
        akcr.a((Object) f, "settingsTfaFlowManager.g…e(::onUserTfaStateUpdate)");
        ajvv.a(f, jqb.b);
        jqb.a(jqe.a(jqb.a(), null, false, true, false, null, 27));
        f = ((joq) jqb.c.get()).a().g(new defpackage.jqb.c(jqb));
        akcr.a((Object) f, "settingsTfaFlowManager.g…LoadingDevices = false) }");
        ajvv.a(f, jqb.b);
        jpz jpz = this.b;
        String str2 = "presenter";
        if (jpz == null) {
            akcr.a(str2);
        }
        jqb jqb2 = this.a;
        if (jqb2 == null) {
            akcr.a(str);
        }
        jpz.b = new b(jqb2);
        jpz = this.b;
        if (jpz == null) {
            akcr.a(str2);
        }
        jqb jqb3 = this.a;
        if (jqb3 == null) {
            akcr.a(str);
        }
        jpz.a = new c(jqb3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_forget_devices, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jqb jqb = this.a;
        if (jqb == null) {
            akcr.a("handler");
        }
        jqb.b.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jpz jpz = this.b;
        if (jpz == null) {
            akcr.a("presenter");
        }
        jpz.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        g();
    }

    public final void onResume() {
        super.onResume();
        jqb jqb = this.a;
        if (jqb == null) {
            akcr.a("handler");
        }
        Object h = jqb.a.h((Object) jqb.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.l;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new e(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_forget_devices_overlay);
        akcr.a(findViewById, "view.findViewById(R.id.tfa_forget_devices_overlay)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.d = findViewById;
        findViewById = view.findViewById(R.id.tfa_forget_devices_overlay_text);
        akcr.a(findViewById, "view.findViewById(R.id.t…get_devices_overlay_text)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.tfa_settings_forget_devices_item_list);
        akcr.a(findViewById, "view.findViewById(R.id.t…forget_devices_item_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        akcr.b(recyclerView, str);
        this.k = recyclerView;
        findViewById = view.findViewById(R.id.settings_two_fa_forget_device_explanation);
        akcr.a(findViewById, "view.findViewById(R.id.s…orget_device_explanation)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        Object findViewById2 = view.findViewById(R.id.tfa_settings_forget_devices_forget_all_button);
        akcr.a(findViewById2, "view.findViewById(R.id.t…evices_forget_all_button)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.j = textView2;
        o().get();
        this.l = zgb.a(iuc.m, "TfaForgetDevicesFragment");
        f().setHasFixedSize(false);
        f().setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
