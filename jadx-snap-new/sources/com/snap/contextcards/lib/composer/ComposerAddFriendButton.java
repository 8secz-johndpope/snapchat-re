package com.snap.contextcards.lib.composer;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.views.ComposerMeasurer;
import com.snap.composer.views.ComposerTouchTarget;
import com.snap.ui.view.LoadingSpinnerButtonView;
import com.snap.ui.view.LoadingSpinnerButtonView.ButtonState;
import com.snapchat.android.R;
import defpackage.aecr;
import defpackage.aejd;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajws;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fvu;
import defpackage.fvy;
import defpackage.gcn;
import defpackage.iqt;
import defpackage.iqv;
import defpackage.isj;
import defpackage.itc;
import defpackage.ith;
import defpackage.psh;
import defpackage.psv;
import defpackage.std;
import defpackage.zfw;
import defpackage.zgb;

@Keep
public final class ComposerAddFriendButton extends LoadingSpinnerButtonView implements ComposerMeasurer, ComposerTouchTarget {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(ComposerAddFriendButton.class), "scheduler", "getScheduler()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    public static final a Companion = new a();
    private static final String TAG = "ComposerAddFriendButton";
    private final iqv friendActionProcessor;
    private final ajws<psh> quickReplyEventSubject;
    private final ajxe scheduler$delegate = ajxh.a(new g(this));
    private final zgb schedulersProvider;
    private fvy userInfo;
    private final ajei viewDisposables = new ajei();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public final class b extends SimpleOnGestureListener {
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ComposerAddFriendButton.this.onTap();
            return true;
        }
    }

    static final class c implements ajev {
        private /* synthetic */ ComposerAddFriendButton a;
        private /* synthetic */ fvy b;

        c(ComposerAddFriendButton composerAddFriendButton, fvy fvy) {
            this.a = composerAddFriendButton;
            this.b = fvy;
        }

        public final void run() {
            fvy fvy = this.b;
            fvy.d ^= 1;
            this.a.setButtonState(this.b.d ? ButtonState.CHECKED : ButtonState.UNCHECKED);
            ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(this.a);
            if (findViewNode != null) {
                findViewNode.invalidateLayout();
            }
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ ComposerAddFriendButton a;

        d(ComposerAddFriendButton composerAddFriendButton) {
            this.a = composerAddFriendButton;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.setButtonState(ButtonState.UNCHECKED);
            ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(this.a);
            if (findViewNode != null) {
                findViewNode.invalidateLayout();
            }
        }
    }

    static final class e implements ajev {
        private /* synthetic */ ComposerAddFriendButton a;
        private /* synthetic */ fvy b;

        e(ComposerAddFriendButton composerAddFriendButton, fvy fvy) {
            this.a = composerAddFriendButton;
            this.b = fvy;
        }

        public final void run() {
            this.b.d = true;
            this.a.setButtonState(ButtonState.CHECKED);
            ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(this.a);
            if (findViewNode != null) {
                findViewNode.invalidateLayout();
            }
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ ComposerAddFriendButton a;

        f(ComposerAddFriendButton composerAddFriendButton) {
            this.a = composerAddFriendButton;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.setButtonState(ButtonState.UNCHECKED);
            ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(this.a);
            if (findViewNode != null) {
                findViewNode.invalidateLayout();
            }
        }
    }

    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ ComposerAddFriendButton a;

        g(ComposerAddFriendButton composerAddFriendButton) {
            this.a = composerAddFriendButton;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.schedulersProvider;
            return zgb.a(fvu.a.callsite("context-cards"));
        }
    }

    public ComposerAddFriendButton(Context context, AttributeSet attributeSet, zgb zgb, iqv iqv, ajws<psh> ajws) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(iqv, "friendActionProcessor");
        akcr.b(ajws, "quickReplyEventSubject");
        super(context, attributeSet);
        this.schedulersProvider = zgb;
        this.friendActionProcessor = iqv;
        this.quickReplyEventSubject = ajws;
        final GestureDetector gestureDetector = new GestureDetector(context, new b());
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        if (this.userInfo == null) {
            setButtonState(ButtonState.UNCHECKED_LOADING);
        }
        Object context2 = getContext();
        String str = "getContext()";
        akcr.a(context2, str);
        setCheckedText(context2.getResources().getString(R.string.snap));
        context2 = getContext();
        akcr.a(context2, str);
        setUncheckedText(context2.getResources().getString(R.string.add));
    }

    private final zfw getScheduler() {
        return (zfw) this.scheduler$delegate.b();
    }

    public static /* synthetic */ void userInfo$annotations() {
    }

    public final boolean canHandleTouchEvents() {
        return true;
    }

    public final boolean canUsePlaceholderViewToMeasure() {
        return false;
    }

    public final fvy getUserInfo$context_cards_core_release() {
        return this.userInfo;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.viewDisposables.a();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onTap() {
        fvy fvy = this.userInfo;
        if (fvy == null || !isClickable()) {
            return;
        }
        Object a;
        if (fvy.e) {
            setButtonState(fvy.d ? ButtonState.UNCHECKED_LOADING : ButtonState.CHECKED_LOADING);
            a = (fvy.d ? this.friendActionProcessor.a(new itc(fvy.a, fvy.b, aejd.DELETED_BY_EXTERNAL)) : this.friendActionProcessor.a(new isj(fvy.a, fvy.b, aecr.ADDED_BY_MENTION, null, iqt.CONTEXT_CARDS, ith.CONTEXT_CARD))).b((ajdw) getScheduler().h()).a((ajdw) getScheduler().l()).a((ajev) new c(this, fvy), (ajfb) new d(this));
            akcr.a(a, "if (userInfo.isFriend) {…                       })");
            std.a(a, this.viewDisposables);
        } else if (fvy.d) {
            this.quickReplyEventSubject.a((Object) new psh(new psv(fvy.b, fvy.a, fvy.c, gcn.STORY), null, null, false, null, 30));
        } else {
            setButtonState(ButtonState.CHECKED_LOADING);
            a = this.friendActionProcessor.a(new isj(fvy.a, fvy.b, aecr.ADDED_BY_MENTION, null, iqt.CONTEXT_CARDS, ith.CONTEXT_CARD)).b((ajdw) getScheduler().f()).a((ajdw) getScheduler().l()).a((ajev) new e(this, fvy), (ajfb) new f(this));
            akcr.a(a, "friendActionProcessor.pr…                       })");
            std.a(a, this.viewDisposables);
        }
    }

    public final boolean requiresInterceptBeforeHandlingTouchEvents() {
        return false;
    }

    public final void setUserInfo(fvy fvy) {
        this.userInfo = fvy;
        ButtonState buttonState = fvy == null ? ButtonState.UNCHECKED_LOADING : fvy.d ? ButtonState.CHECKED : ButtonState.UNCHECKED;
        setButtonState(buttonState);
        ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(this);
        if (findViewNode != null) {
            findViewNode.invalidateLayout();
        }
    }

    public final void setUserInfo$context_cards_core_release(fvy fvy) {
        this.userInfo = fvy;
    }
}
