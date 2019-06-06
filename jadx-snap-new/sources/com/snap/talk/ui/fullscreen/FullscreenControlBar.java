package com.snap.talk.ui.fullscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.R;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.iho;
import defpackage.ihp;
import defpackage.kb;
import defpackage.yzy;
import defpackage.zav;
import defpackage.zba;

public final class FullscreenControlBar extends LinearLayout {
    final ajxe a = ajxh.a(new a(this));
    public final View b;
    public final ImageView c;
    public final View d;
    public final ImageView e;
    public final View f;
    public final View g;
    public final View[] h;
    public zba i;
    public yzy j;
    public View k;
    private final ImageView l;
    private ajej m;

    public static final class c implements OnClickListener {
        private /* synthetic */ View a;
        private /* synthetic */ akbk b;

        public c(View view, akbk akbk) {
            this.a = view;
            this.b = akbk;
        }

        public final void onClick(View view) {
            if (this.a.getVisibility() == 0) {
                this.b.invoke();
            }
        }
    }

    public static final class d implements OnLayoutChangeListener {
        private /* synthetic */ FullscreenControlBar a;

        public d(FullscreenControlBar fullscreenControlBar) {
            this.a = fullscreenControlBar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            akcr.b(view, "view");
            view.removeOnLayoutChangeListener(this);
            FullscreenControlBar.a(this.a).a(defpackage.yzy.a.CONTROL_BAR, ((float) this.a.getHeight()) - this.a.getTranslationY());
        }
    }

    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ FullscreenControlBar a;

        b(FullscreenControlBar fullscreenControlBar) {
            this.a = fullscreenControlBar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            FullscreenControlBar fullscreenControlBar = this.a;
            akcr.a(obj, "it");
            int intValue = ((Number) fullscreenControlBar.a.b()).intValue() + obj.intValue();
            iho.e(fullscreenControlBar, intValue);
            View view = fullscreenControlBar.k;
            if (view == null) {
                akcr.a("localMediaContainer");
            }
            iho.g(view, intValue);
            if (!kb.d(fullscreenControlBar) || fullscreenControlBar.isLayoutRequested()) {
                fullscreenControlBar.addOnLayoutChangeListener(new d(fullscreenControlBar));
            } else {
                FullscreenControlBar.a(fullscreenControlBar).a(defpackage.yzy.a.CONTROL_BAR, ((float) fullscreenControlBar.getHeight()) - fullscreenControlBar.getTranslationY());
            }
        }
    }

    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ FullscreenControlBar a;

        a(FullscreenControlBar fullscreenControlBar) {
            this.a = fullscreenControlBar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getResources().getDimensionPixelSize(R.dimen.fullscreen_control_bar_padding_bottom));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(FullscreenControlBar.class), "minBottomPadding", "getMinBottomPadding()I");
    }

    public FullscreenControlBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
        ihp.a(this, R.layout.fullscreen_control_bar);
        Object findViewById = findViewById(R.id.chat_button_container);
        akcr.a(findViewById, "findViewById(R.id.chat_button_container)");
        this.b = findViewById;
        findViewById = findViewById(R.id.fullscreen_bar_mic_button);
        akcr.a(findViewById, "findViewById(R.id.fullscreen_bar_mic_button)");
        this.c = (ImageView) findViewById;
        findViewById = findViewById(R.id.mic_button_container);
        akcr.a(findViewById, "findViewById(R.id.mic_button_container)");
        this.d = findViewById;
        findViewById = findViewById(R.id.fullscreen_bar_video_button);
        akcr.a(findViewById, "findViewById(R.id.fullscreen_bar_video_button)");
        this.e = (ImageView) findViewById;
        findViewById = findViewById(R.id.video_button_container);
        akcr.a(findViewById, "findViewById(R.id.video_button_container)");
        this.f = findViewById;
        findViewById = findViewById(R.id.fullscreen_bar_swap_camera_button);
        akcr.a(findViewById, "findViewById(R.id.fullsc…n_bar_swap_camera_button)");
        this.l = (ImageView) findViewById;
        findViewById = findViewById(R.id.swap_camera_button_container);
        akcr.a(findViewById, "findViewById(R.id.swap_camera_button_container)");
        this.g = findViewById;
        this.h = new View[]{this.b, this.d, this.f, this.g};
    }

    public final void a(boolean z) {
        this.l.setEnabled(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = new zav(this).a().f((ajfb) new b(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajej ajej = this.m;
        if (ajej != null) {
            ajej.dispose();
        }
    }
}
