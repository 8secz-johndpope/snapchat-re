package com.snap.talk.lockscreen;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snap.talk.ui.fullscreen.GroupFullscreenPane;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import com.snap.ui.avatar.AvatarView;
import com.snapchat.android.R;
import defpackage.abii;
import defpackage.abij;
import defpackage.aipp;
import defpackage.ajfo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.igw;
import defpackage.yzj;
import defpackage.zgi;

public final class LockScreenActivity extends ScopedFragmentActivity implements defpackage.yyy.b {
    public defpackage.yzm.a i;
    public zgi j;
    private defpackage.yyy.a k;
    private final igw l = new igw();
    private final ajxe m = ajxh.a(new f(this));
    private final ajxe n = ajxh.a(new d(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class g implements OnClickListener {
        private /* synthetic */ LockScreenActivity a;

        g(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
        }

        public final void onClick(View view) {
            LockScreenActivity.a(this.a).a(abii.CHAT);
        }
    }

    static final class h implements OnClickListener {
        private /* synthetic */ LockScreenActivity a;

        h(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
        }

        public final void onClick(View view) {
            LockScreenActivity.a(this.a).a(abii.DISMISS);
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ LockScreenActivity a;

        b(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LockScreenActivity.a(this.a).a(abii.ACCEPT);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ LockScreenActivity a;

        c(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LockScreenActivity.a(this.a).a(abii.IGNORED);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbk<View> {
        private /* synthetic */ LockScreenActivity a;

        d(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.findViewById(R.id.dismiss_call);
        }
    }

    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ LockScreenActivity a;
        private /* synthetic */ Bundle b;

        e(LockScreenActivity lockScreenActivity, Bundle bundle) {
            this.a = lockScreenActivity;
            this.b = bundle;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            super.onCreate(this.b);
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbk<View> {
        private /* synthetic */ LockScreenActivity a;

        f(LockScreenActivity lockScreenActivity) {
            this.a = lockScreenActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.findViewById(R.id.open_chat);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(LockScreenActivity.class), "openChatButton", "getOpenChatButton()Landroid/view/View;"), new akdc(akde.a(LockScreenActivity.class), "dismissCallButton", "getDismissCallButton()Landroid/view/View;")};
        a aVar = new a();
    }

    public static final /* synthetic */ defpackage.yyy.a a(LockScreenActivity lockScreenActivity) {
        defpackage.yyy.a aVar = lockScreenActivity.k;
        if (aVar == null) {
            akcr.a("presenter");
        }
        return aVar;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.yyy.a aVar = this.k;
        if (aVar == null) {
            akcr.a("presenter");
        }
        aVar.a();
    }

    public final void onBackPressed() {
        defpackage.yyy.a aVar = this.k;
        if (aVar == null) {
            akcr.a("presenter");
        }
        aVar.a(abii.DISMISS);
    }

    public final void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        defpackage.gvr.a.a(new e(this, bundle));
        setContentView(R.layout.lock_screen);
        getWindow().addFlags(2621568);
        Object systemService = getSystemService("power");
        if (systemService != null) {
            ((PowerManager) systemService).newWakeLock(1, "com.snapchat.android.talk.lockscreen:LockScreenActivity").acquire(100);
            systemService = (yzj) getIntent().getParcelableExtra("LOCK_SCREEN_CONTEXT_EXTRA");
            defpackage.yzm.a aVar = this.i;
            if (aVar == null) {
                akcr.a("lockScreenComponentBuilder");
            }
            aVar = aVar.a((defpackage.yyy.b) this);
            Object findViewById = findViewById(R.id.accept_call_container);
            akcr.a(findViewById, "findViewById(R.id.accept_call_container)");
            aVar = aVar.a((FrameLayout) findViewById);
            findViewById = findViewById(R.id.lock_screen_avatar);
            akcr.a(findViewById, "findViewById(R.id.lock_screen_avatar)");
            aVar = aVar.a((AvatarView) findViewById).a(getResources().getDimension(R.dimen.lock_screen_avatar_size));
            findViewById = findViewById(R.id.video_pane);
            akcr.a(findViewById, "findViewById(R.id.video_pane)");
            aVar = aVar.a((GroupFullscreenPane) findViewById);
            View findViewById2 = findViewById(R.id.video_overlay);
            akcr.a((Object) findViewById2, "findViewById(R.id.video_overlay)");
            aVar = aVar.a(findViewById2);
            findViewById = findViewById(R.id.lock_screen_title);
            akcr.a(findViewById, "findViewById(R.id.lock_screen_title)");
            aVar = aVar.b((TextView) findViewById);
            findViewById = findViewById(R.id.lock_screen_subtitle);
            akcr.a(findViewById, "findViewById(R.id.lock_screen_subtitle)");
            aVar = aVar.a((TextView) findViewById).b((akbk) new b(this)).a((akbk) new c(this)).a((ajfo) this.l);
            akcr.a(systemService, "lockScreenContext");
            this.k = aVar.a((abij) systemService).a().b();
            ((View) this.m.b()).setOnClickListener(new g(this));
            ((View) this.n.b()).setOnClickListener(new h(this));
            zgi zgi = this.j;
            if (zgi == null) {
                akcr.a("activityObserver");
            }
            zgi.h();
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.os.PowerManager");
    }

    public final void onDestroy() {
        defpackage.yyy.a aVar = this.k;
        if (aVar == null) {
            akcr.a("presenter");
        }
        aVar.a(abii.IGNORED);
        getWindow().clearFlags(2621568);
        this.l.dispose();
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        defpackage.yyy.a aVar = this.k;
        if (aVar == null) {
            akcr.a("presenter");
        }
        aVar.b();
    }

    public final void onResume() {
        super.onResume();
        zgi zgi = this.j;
        if (zgi == null) {
            akcr.a("activityObserver");
        }
        zgi.i();
    }
}
