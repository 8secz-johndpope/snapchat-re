package com.snap.identity.loginsignup.ui.pages.findfriendssplash;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.jfg;
import defpackage.jrl;
import defpackage.zhh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zln;

public final class FindFriendsSplashFragment extends SignupFragment implements jfg {
    public FindFriendsSplashPresenter a;
    private View c;
    private ProgressButton d;
    private View e;
    private SnapFontTextView f;
    private SnapFontTextView g;
    private TextView h;
    private ImageView i;
    private View j;

    private SnapFontTextView l() {
        SnapFontTextView snapFontTextView = this.f;
        if (snapFontTextView == null) {
            akcr.a("findFriendsTitle");
        }
        return snapFontTextView;
    }

    private SnapFontTextView m() {
        SnapFontTextView snapFontTextView = this.g;
        if (snapFontTextView == null) {
            akcr.a("findFriendsDescription");
        }
        return snapFontTextView;
    }

    private ImageView n() {
        ImageView imageView = this.i;
        if (imageView == null) {
            akcr.a("findFriendsImage");
        }
        return imageView;
    }

    public final View a() {
        View view = this.c;
        if (view == null) {
            akcr.a("scrollableContentContainer");
        }
        return view;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
        if (findFriendsSplashPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) findFriendsSplashPresenter.c.get());
        if (!findFriendsSplashPresenter.a) {
            findFriendsSplashPresenter.b();
        }
    }

    public final ProgressButton b() {
        ProgressButton progressButton = this.d;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final View c() {
        View view = this.e;
        if (view == null) {
            akcr.a("skipButton");
        }
        return view;
    }

    public final /* synthetic */ TextView d() {
        return l();
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_FIND_FRIENDS_SPLASH;
    }

    public final /* synthetic */ TextView g() {
        return m();
    }

    public final TextView h() {
        TextView textView = this.h;
        if (textView == null) {
            akcr.a("privatePolicyText");
        }
        return textView;
    }

    public final /* synthetic */ View i() {
        return n();
    }

    public final void j() {
        b().setVisibility(8);
        h().setVisibility(8);
        c().setVisibility(8);
        l().setVisibility(8);
        m().setVisibility(8);
        n().setVisibility(8);
        View view = this.j;
        if (view == null) {
            akcr.a("loadingView");
        }
        view.setVisibility(0);
    }

    public final void k() {
        b().setVisibility(0);
        h().setVisibility(0);
        c().setVisibility(0);
        l().setVisibility(0);
        m().setVisibility(0);
        n().setVisibility(0);
        View view = this.j;
        if (view == null) {
            akcr.a("loadingView");
        }
        view.setVisibility(8);
    }

    public final boolean o_() {
        FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
        if (findFriendsSplashPresenter == null) {
            akcr.a("presenter");
        }
        findFriendsSplashPresenter.c();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        aipx.a(this);
        super.onCreate(bundle);
        FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
        if (findFriendsSplashPresenter == null) {
            akcr.a("presenter");
        }
        findFriendsSplashPresenter.takeTarget((jfg) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_find_friends_splash, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
        if (findFriendsSplashPresenter == null) {
            akcr.a("presenter");
        }
        findFriendsSplashPresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.scrollable_content_container);
        akcr.a(findViewById, "view.findViewById(R.id.s…llable_content_container)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.c = findViewById;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.d = progressButton;
        b().setState(1);
        findViewById = view.findViewById(R.id.learn_about_pp);
        akcr.a(findViewById, "view.findViewById(R.id.learn_about_pp)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.h = textView;
        h().setMovementMethod(LinkMovementMethod.getInstance());
        findViewById = view.findViewById(R.id.find_friends_splash_title);
        akcr.a(findViewById, "view.findViewById(R.id.find_friends_splash_title)");
        SnapFontTextView snapFontTextView = (SnapFontTextView) findViewById;
        akcr.b(snapFontTextView, str);
        this.f = snapFontTextView;
        findViewById = view.findViewById(R.id.add_friends_description);
        akcr.a(findViewById, "view.findViewById(R.id.add_friends_description)");
        snapFontTextView = (SnapFontTextView) findViewById;
        akcr.b(snapFontTextView, str);
        this.g = snapFontTextView;
        findViewById = view.findViewById(R.id.loading_area);
        akcr.a(findViewById, "view.findViewById(R.id.loading_area)");
        this.j = findViewById;
        findViewById = view.findViewById(R.id.skip_button);
        akcr.a(findViewById, "view.findViewById(R.id.skip_button)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        Object findViewById2 = view.findViewById(R.id.find_friends_image);
        akcr.a(findViewById2, "view.findViewById(R.id.find_friends_image)");
        ImageView imageView = (ImageView) findViewById2;
        akcr.b(imageView, str);
        this.i = imageView;
        FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
        if (findFriendsSplashPresenter == null) {
            akcr.a("presenter");
        }
        jfg jfg = (jfg) findFriendsSplashPresenter.getTarget();
        if (jfg != null) {
            ProgressButton b = jfg.b();
            if (b != null) {
                b.setOnClickListener(new i(findFriendsSplashPresenter));
            }
        }
        jfg = (jfg) findFriendsSplashPresenter.getTarget();
        if (jfg != null) {
            view = jfg.c();
            if (view != null) {
                view.setOnClickListener(new j(findFriendsSplashPresenter));
            }
        }
        findFriendsSplashPresenter.b();
        findViewById2 = findFriendsSplashPresenter.i.get();
        akcr.a(findViewById2, "softKeyboardDetector.get()");
        zln.bindTo$default(findFriendsSplashPresenter, ((zhh) findViewById2).a().a((ajdw) findFriendsSplashPresenter.a().l()).a((ajfb) new k(findFriendsSplashPresenter), (ajfb) l.a), findFriendsSplashPresenter, null, null, 6, null);
    }
}
