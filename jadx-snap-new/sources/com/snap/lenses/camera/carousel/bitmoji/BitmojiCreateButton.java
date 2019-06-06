package com.snap.lenses.camera.carousel.bitmoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.abur;
import defpackage.akcr;

public final class BitmojiCreateButton extends FrameLayout {
    private TextView a;
    private abur<LoadingSpinnerView> b;
    private boolean c;
    private boolean d;

    public BitmojiCreateButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private BitmojiCreateButton(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final void a(boolean z) {
        String str = "loadingSpinner";
        String str2 = "label";
        TextView textView;
        if (z) {
            textView = this.a;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setVisibility(8);
            abur abur = this.b;
            if (abur == null) {
                akcr.a(str);
            }
            abur.a(0);
        } else {
            textView = this.a;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setVisibility(0);
            abur abur2 = this.b;
            if (abur2 == null) {
                akcr.a(str);
            }
            abur2.a(8);
        }
        this.d = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.c) {
            View.inflate(getContext(), R.layout.lenses_bitmoji_create_button_view, this);
            Object findViewById = findViewById(R.id.lenses_bitmoji_create_button_label);
            akcr.a(findViewById, "findViewById(R.id.lenses…moji_create_button_label)");
            this.a = (TextView) findViewById;
            this.b = new abur((View) this, (int) R.id.lenses_bitmoji_create_button_spinner_stub, (int) R.id.lenses_bitmoji_create_button_spinner);
            this.c = true;
        }
    }
}
