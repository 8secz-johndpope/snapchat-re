package com.snap.identity.loginsignup.ui.shared;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.ajdp;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.akcr;
import defpackage.zjk;
import defpackage.zjm;

public abstract class LoginSignupFragment extends MainPageFragment {
    private boolean a;
    private boolean b;
    private final ajwl<Boolean> c;

    static final class a implements OnClickListener {
        private /* synthetic */ LoginSignupFragment a;

        a(LoginSignupFragment loginSignupFragment) {
            this.a = loginSignupFragment;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public LoginSignupFragment() {
        Object i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault(false)");
        this.c = i;
    }

    public final boolean I_() {
        return this.a && this.b;
    }

    public final ajdp<Boolean> J_() {
        Object j = this.c.j(ajfu.a);
        akcr.a(j, "visibilitySubject.distinctUntilChanged()");
        return j;
    }

    public void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        this.b = true;
        this.c.a(Boolean.valueOf(I_()));
    }

    public void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        this.b = false;
        this.c.a(Boolean.valueOf(I_()));
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        this.a = false;
        this.c.a(Boolean.valueOf(I_()));
    }

    public void onResume() {
        super.onResume();
        this.a = true;
        this.c.a(Boolean.valueOf(I_()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        view = view.findViewById(R.id.back_button);
        if (view != null) {
            view.setOnClickListener(new a(this));
        }
    }
}
