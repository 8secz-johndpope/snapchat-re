package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesContextNotificationSettingsPresenter;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesContextNotificationSettingsPresenter.i;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesContextNotificationSettingsPresenter.j;
import com.snapchat.android.R;
import defpackage.acgu;
import defpackage.achb;
import defpackage.achg;
import defpackage.acis;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajyw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.fth;
import defpackage.tnj;
import defpackage.xai;
import defpackage.xiz;
import defpackage.xjd;
import defpackage.xlp;
import defpackage.xmi;
import defpackage.xmq;
import defpackage.zhk;
import defpackage.zhn;
import defpackage.zjk;
import defpackage.zjm;
import java.util.List;

public final class SpectaclesContextNotificationSettingsFragment extends SpectaclesFragment implements xmi {
    static final zjm e = new zjm(xai.f, "SpectaclesContextNotificationSettingsFragment", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> f;
    public static final acgu<zjm> g;
    public static final zjm h = new zjm(xai.f, "context_notification_settings_send_to", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> i;
    public static final acgu<zjm> j;
    public SpectaclesContextNotificationSettingsPresenter a;
    public achb<zjm, zjk> b;
    private View k;
    private View l;
    private View m;
    private CheckBox n;
    private View o;
    private RadioGroup p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements OnCheckedChangeListener {
        private /* synthetic */ SpectaclesContextNotificationSettingsFragment a;

        b(SpectaclesContextNotificationSettingsFragment spectaclesContextNotificationSettingsFragment) {
            this.a = spectaclesContextNotificationSettingsFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            akcr.a((Object) compoundButton, "button");
            if (compoundButton.isPressed()) {
                SpectaclesContextNotificationSettingsPresenter h = this.a.h();
                ((tnj) h.j.get()).b().a((fth) xjd.CONTEXT_NOTIFICATION_ENABLED, Boolean.valueOf(z)).b();
                xmi xmi = (xmi) h.getTarget();
                if (xmi != null) {
                    xmi.a(z);
                }
            }
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ SpectaclesContextNotificationSettingsFragment a;

        c(SpectaclesContextNotificationSettingsFragment spectaclesContextNotificationSettingsFragment) {
            this.a = spectaclesContextNotificationSettingsFragment;
        }

        public final void onClick(View view) {
            SpectaclesContextNotificationSettingsPresenter h = this.a.h();
            zhn zhn = (zhn) h.d.b();
            zjm zjm = (zjm) h.e.b();
            Object obj = (xlp) h.c.b();
            akcr.a(obj, "colorSelectionActionMenuDataProvider");
            zhn.a(zjm, (zhk) obj);
        }
    }

    static final class d implements RadioGroup.OnCheckedChangeListener {
        private /* synthetic */ SpectaclesContextNotificationSettingsFragment a;

        d(SpectaclesContextNotificationSettingsFragment spectaclesContextNotificationSettingsFragment) {
            this.a = spectaclesContextNotificationSettingsFragment;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            xiz xiz;
            this.a.h();
            if (i == R.id.best_friends) {
                xiz = xiz.BEST_FRIENDS;
            } else if (i == R.id.only_these_friends) {
                xiz = xiz.CUSTOM;
            } else if (i == R.id.all_friends) {
                xiz = xiz.ALL_FRIENDS;
            } else {
                throw new IllegalArgumentException("Invalid res id");
            }
            if (!(xiz == this.a.h().b() || xiz == xiz.CUSTOM)) {
                this.a.h().a(xiz);
                SpectaclesContextNotificationSettingsPresenter h = this.a.h();
                List list = this.a.h().g;
                if (list == null) {
                    akcr.a("currentFriendsWhitelist");
                }
                h.a(xiz, list);
            }
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SpectaclesContextNotificationSettingsFragment a;

        e(SpectaclesContextNotificationSettingsFragment spectaclesContextNotificationSettingsFragment) {
            this.a = spectaclesContextNotificationSettingsFragment;
        }

        public final void onClick(View view) {
            SpectaclesContextNotificationSettingsPresenter h = this.a.h();
            List list = h.g;
            String str = "currentFriendsWhitelist";
            if (list == null) {
                akcr.a(str);
            }
            if (list.isEmpty()) {
                h.a((List) ajyw.a);
                return;
            }
            list = h.g;
            if (list == null) {
                akcr.a(str);
            }
            ajdp p = ajdp.b((Iterable) list).b((ajdw) h.a().b()).p(new i(h));
            List list2 = h.g;
            if (list2 == null) {
                akcr.a(str);
            }
            Object a = p.a(list2.size()).a((ajdw) h.a().l());
            akcr.a(a, "Observable.fromIterable(…(schedulers.mainThread())");
            akbl jVar = new j(h);
            akbl akbl = h.h;
            akcr.b(a, "receiver$0");
            akcr.b(akbl, "onError");
            akcr.b(jVar, "onSuccess");
            ajej a2 = a.a((ajfb) new xmq(jVar), (ajfb) new xmq(akbl));
            akcr.a((Object) a2, "subscribe(onSuccess, onError)");
            ajvv.a(a2, h.b);
        }
    }

    static {
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) e, true);
        f = a;
        g = a.j();
        a = acgu.a(acis.b, (achg) h, true);
        i = a;
        j = a.j();
    }

    public final void a(int i) {
        RadioGroup radioGroup = this.p;
        if (radioGroup == null) {
            akcr.a("radioGroup");
        }
        radioGroup.check(i);
    }

    public final void a(boolean z) {
        String str = "enableCheckbox";
        String str2 = "indicationColorContainer";
        String str3 = "allFriendsContainer";
        String str4 = "selectedFriendsContainer";
        String str5 = "bestFriendsContainer";
        View view;
        CheckBox checkBox;
        if (z) {
            view = this.k;
            if (view == null) {
                akcr.a(str5);
            }
            view.setClickable(true);
            view = this.l;
            if (view == null) {
                akcr.a(str4);
            }
            view.setClickable(true);
            view = this.m;
            if (view == null) {
                akcr.a(str3);
            }
            view.setClickable(true);
            view = this.o;
            if (view == null) {
                akcr.a(str2);
            }
            view.setClickable(true);
            view = this.k;
            if (view == null) {
                akcr.a(str5);
            }
            view.setAlpha(1.0f);
            view = this.l;
            if (view == null) {
                akcr.a(str4);
            }
            view.setAlpha(1.0f);
            view = this.m;
            if (view == null) {
                akcr.a(str3);
            }
            view.setAlpha(1.0f);
            view = this.o;
            if (view == null) {
                akcr.a(str2);
            }
            view.setAlpha(1.0f);
            checkBox = this.n;
            if (checkBox == null) {
                akcr.a(str);
            }
            checkBox.setChecked(true);
            return;
        }
        view = this.k;
        if (view == null) {
            akcr.a(str5);
        }
        view.setClickable(false);
        view = this.l;
        if (view == null) {
            akcr.a(str4);
        }
        view.setClickable(false);
        view = this.m;
        if (view == null) {
            akcr.a(str3);
        }
        view.setClickable(false);
        view = this.o;
        if (view == null) {
            akcr.a(str2);
        }
        view.setClickable(false);
        view = this.k;
        if (view == null) {
            akcr.a(str5);
        }
        view.setAlpha(0.2f);
        view = this.l;
        if (view == null) {
            akcr.a(str4);
        }
        view.setAlpha(0.2f);
        view = this.m;
        if (view == null) {
            akcr.a(str3);
        }
        view.setAlpha(0.2f);
        view = this.o;
        if (view == null) {
            akcr.a(str2);
        }
        view.setAlpha(0.2f);
        checkBox = this.n;
        if (checkBox == null) {
            akcr.a(str);
        }
        checkBox.setChecked(false);
    }

    public final SpectaclesContextNotificationSettingsPresenter h() {
        SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter = this.a;
        if (spectaclesContextNotificationSettingsPresenter == null) {
            akcr.a("contextNotificationSettingsPresenter");
        }
        return spectaclesContextNotificationSettingsPresenter;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter = this.a;
        if (spectaclesContextNotificationSettingsPresenter == null) {
            akcr.a("contextNotificationSettingsPresenter");
        }
        spectaclesContextNotificationSettingsPresenter.takeTarget((xmi) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.spectacles_notification_settings_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.best_friends);
        akcr.a(findViewById, "view.findViewById(R.id.best_friends)");
        this.k = findViewById;
        Object findViewById2 = inflate.findViewById(R.id.only_these_friends);
        akcr.a(findViewById2, "view.findViewById(R.id.only_these_friends)");
        this.l = findViewById2;
        findViewById2 = inflate.findViewById(R.id.all_friends);
        akcr.a(findViewById2, "view.findViewById(R.id.all_friends)");
        this.m = findViewById2;
        findViewById2 = inflate.findViewById(R.id.notification_enable_checkbox);
        akcr.a(findViewById2, "view.findViewById(R.id.n…fication_enable_checkbox)");
        this.n = (CheckBox) findViewById2;
        findViewById2 = inflate.findViewById(R.id.indication_color_container);
        akcr.a(findViewById2, "view.findViewById(R.id.indication_color_container)");
        this.o = findViewById2;
        CheckBox checkBox = this.n;
        if (checkBox == null) {
            akcr.a("enableCheckbox");
        }
        checkBox.setOnCheckedChangeListener(new b(this));
        View view = this.o;
        if (view == null) {
            akcr.a("indicationColorContainer");
        }
        view.setOnClickListener(new c(this));
        findViewById2 = inflate.findViewById(R.id.context_notification_friend_selection_radio_group);
        akcr.a(findViewById2, "view.findViewById(R.id.c…nd_selection_radio_group)");
        this.p = (RadioGroup) findViewById2;
        RadioGroup radioGroup = this.p;
        if (radioGroup == null) {
            akcr.a("radioGroup");
        }
        radioGroup.setOnCheckedChangeListener(new d(this));
        View findViewById3 = inflate.findViewById(R.id.only_these_friends);
        if (findViewById3 != null) {
            ((RadioButton) findViewById3).setOnClickListener(new e(this));
            return inflate;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.RadioButton");
    }

    public final void onDetach() {
        SpectaclesContextNotificationSettingsPresenter spectaclesContextNotificationSettingsPresenter = this.a;
        if (spectaclesContextNotificationSettingsPresenter == null) {
            akcr.a("contextNotificationSettingsPresenter");
        }
        spectaclesContextNotificationSettingsPresenter.dropTarget();
        super.onDetach();
    }
}
