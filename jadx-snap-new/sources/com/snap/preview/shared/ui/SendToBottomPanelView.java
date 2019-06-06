package com.snap.preview.shared.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.abtc;
import defpackage.abur;

public class SendToBottomPanelView extends RelativeLayout {
    final TextView a;
    final TextView b;
    private final ImageView c;
    private final HorizontalScrollView d;
    private final LinearLayout e;
    private final LoadingSpinnerView f;
    private abur<View> g;
    private boolean h;
    private Boolean i;

    public SendToBottomPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SendToBottomPanelView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.h = false;
        this.i = null;
        View.inflate(context, R.layout.send_to_bottom_panel_view, this);
        this.c = (ImageView) findViewById(R.id.preview_send_to_bottom_panel_send_button);
        this.d = (HorizontalScrollView) findViewById(R.id.send_to_bottom_panel_scroller);
        this.e = (LinearLayout) findViewById(R.id.send_to_bottom_panel_text_container);
        this.a = (TextView) findViewById(R.id.send_to_bottom_panel_text);
        this.b = (TextView) findViewById(R.id.send_to_bottom_panel_help_text);
        this.f = (LoadingSpinnerView) findViewById(R.id.send_to_bottom_panel_loading_spinner);
    }

    public final void a(abur<View> abur) {
        this.g = abur;
        this.c.setVisibility(8);
    }

    public final void a(OnClickListener onClickListener) {
        abur abur = this.g;
        if (abur != null) {
            abur.a().setOnClickListener(onClickListener);
        } else {
            this.c.setOnClickListener(onClickListener);
        }
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.a.getText());
    }

    public final void b() {
        if (this.g == null) {
            ImageView imageView = this.c;
            imageView.setOnTouchListener(new abtc(imageView));
        }
    }

    public final synchronized void c() {
        if (!this.h) {
            Object obj;
            TextView textView = this.b;
            if (textView.getVisibility() == 8) {
                textView.setVisibility(4);
                obj = 1;
            } else {
                obj = null;
            }
            textView.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = textView.getMeasuredHeight();
            if (obj != null) {
                textView.setVisibility(8);
            }
            float f = ((float) measuredHeight) / 2.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationY", new float[]{f * -1.0f});
            ofFloat.setDuration(200);
            ofFloat.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    SendToBottomPanelView.this.a.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                    SendToBottomPanelView.this.b.setAlpha(1.0f);
                    SendToBottomPanelView.this.b.setVisibility(0);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            this.h = true;
            animatorSet.start();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.a.setOnClickListener(onClickListener);
        this.b.setOnClickListener(onClickListener);
    }
}
