package com.snap.identity.api.sharedui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class ProgressButton extends StatefulView {
    final ajxe a = ajxh.a(new c(this));
    private int b;
    private int c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements OnPreDrawListener {
        private /* synthetic */ ProgressButton a;

        b(ProgressButton progressButton) {
            this.a = progressButton;
        }

        public final boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            View childAt = this.a.getChildAt(0);
            if (childAt != null) {
                ScButton scButton = (ScButton) childAt;
                int intValue = ((Number) this.a.a.b()).intValue();
                LayoutParams layoutParams = this.a.getLayoutParams();
                if (scButton.getTextView().getLineCount() > 1) {
                    layoutParams.height = -2;
                } else {
                    layoutParams.height = intValue;
                }
                this.a.setLayoutParams(layoutParams);
                return true;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.button.ScButton");
        }
    }

    static final class c extends akcs implements akbk<Integer> {
        private /* synthetic */ ProgressButton a;

        c(ProgressButton progressButton) {
            this.a = progressButton;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.getLayoutParams().height);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ProgressButton.class), "initialHeight", "getInitialHeight()I");
        a aVar = new a();
    }

    public ProgressButton(Context context, AttributeSet attributeSet) {
        String str;
        akcr.b(context, "context");
        super(context, attributeSet);
        this.b = context.getResources().getColor(R.color.regular_blue);
        this.c = context.getResources().getColor(R.color.dark_blue);
        String str2 = "";
        if (attributeSet != null) {
            String string;
            Object obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.irt.a.b, 0, 0);
            akcr.a(obtainStyledAttributes, "context.theme.obtainStyl…ble.ProgressButton, 0, 0)");
            if (obtainStyledAttributes.hasValue(2)) {
                string = obtainStyledAttributes.getString(2);
                akcr.a((Object) string, "typedArray.getString(R.s…rogressButton_buttonText)");
            } else {
                string = str2;
            }
            if (obtainStyledAttributes.hasValue(3)) {
                str2 = obtainStyledAttributes.getString(3);
                akcr.a((Object) str2, "typedArray.getString(R.s…ogressButton_pendingText)");
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.b = obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.regular_blue));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.c = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.dark_blue));
            }
            obtainStyledAttributes.recycle();
            str = str2;
            str2 = string;
        } else {
            str = str2;
        }
        a(0, str2);
        a(1, str2);
        a(2, str);
    }

    public final void a(int i, String str) {
        Builder text;
        Object context;
        akcr.b(str, "text");
        String str2 = "context";
        if (i == 0) {
            text = new Builder().text(str);
        } else if (i == 1) {
            text = new Builder().text(str).backgroundColors(this.b, Integer.valueOf(this.c));
            context = getContext();
            akcr.a(context, str2);
            addState(i, text.buildLazy(context));
            getViewTreeObserver().addOnPreDrawListener(new b(this));
        } else if (i == 2) {
            text = new Builder().text(str).spinner();
        } else {
            throw new IllegalArgumentException("Unexpected state: ".concat(String.valueOf(i)));
        }
        Object context2 = getContext();
        akcr.a(context2, str2);
        text = text.backgroundColors(context2.getResources().getColor(R.color.dark_grey), null).disabled();
        context = getContext();
        akcr.a(context, str2);
        addState(i, text.buildLazy(context));
        getViewTreeObserver().addOnPreDrawListener(new b(this));
    }
}
