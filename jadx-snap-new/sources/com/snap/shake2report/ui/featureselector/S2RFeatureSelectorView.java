package com.snap.shake2report.ui.featureselector;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snap.ui.view.button.SnapFontButton;
import com.snapchat.android.R;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.cfl;
import defpackage.zfw;

public final class S2RFeatureSelectorView extends FrameLayout {
    final ajei a;
    View b;
    LinearLayout c;
    LinearLayout d;
    View e;
    TextView f;
    String g;
    Button h;

    static final class a<T> implements ajfb<Object> {
        private /* synthetic */ S2RFeatureSelectorView a;
        private /* synthetic */ SnapFontButton b;
        private /* synthetic */ zfw c;

        a(S2RFeatureSelectorView s2RFeatureSelectorView, SnapFontButton snapFontButton, zfw zfw) {
            this.a = s2RFeatureSelectorView;
            this.b = snapFontButton;
            this.c = zfw;
        }

        public final void accept(Object obj) {
            S2RFeatureSelectorView s2RFeatureSelectorView = this.a;
            Object obj2 = this.b;
            zfw zfw = this.c;
            if (akcr.a(obj2, s2RFeatureSelectorView.h)) {
                s2RFeatureSelectorView.b(obj2);
                return;
            }
            if (s2RFeatureSelectorView.h != null) {
                Button button = s2RFeatureSelectorView.h;
                if (button == null) {
                    akcr.a();
                }
                s2RFeatureSelectorView.b(button);
            }
            s2RFeatureSelectorView.a(obj2);
            s2RFeatureSelectorView.a(obj2.getText().toString(), zfw);
        }
    }

    static final class b<T> implements ajfb<Object> {
        private /* synthetic */ S2RFeatureSelectorView a;

        b(S2RFeatureSelectorView s2RFeatureSelectorView) {
            this.a = s2RFeatureSelectorView;
        }

        public final void accept(Object obj) {
            this.a.a();
        }
    }

    public S2RFeatureSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private S2RFeatureSelectorView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = new ajei();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        View view = this.e;
        if (view == null) {
            akcr.a();
        }
        view.setVisibility(8);
        view = this.b;
        if (view == null) {
            akcr.a();
        }
        view.setVisibility(0);
    }

    /* Access modifiers changed, original: final */
    public final void a(Button button) {
        this.g = button.getText().toString();
        this.h = button;
        button.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.s2r_submit_button_pressed));
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, zfw zfw) {
        View view = this.b;
        if (view == null) {
            akcr.a();
        }
        view.setVisibility(8);
        view = this.e;
        if (view == null) {
            akcr.a();
        }
        view.setVisibility(0);
        TextView textView = this.f;
        if (textView == null) {
            akcr.a();
        }
        textView.setText(str);
        this.g = str;
        ajei ajei = this.a;
        view = this.e;
        if (view == null) {
            akcr.a();
        }
        ajei.a(cfl.c(view).a((ajdw) zfw.l()).f((ajfb) new b(this)));
    }

    /* Access modifiers changed, original: final */
    public final void b(Button button) {
        button.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.s2r_project_button));
        this.g = null;
        this.h = null;
    }
}
