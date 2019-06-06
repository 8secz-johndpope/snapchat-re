package com.snap.messaging.sendto.internal.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.StackingLayout;
import com.snapchat.android.R;

public class SendToBottomPanelView extends StackingLayout {
    public final ImageView a;
    public final View b;
    public final HorizontalScrollView c;
    public final TextView d;
    ObjectAnimator e;
    private final LinearLayout f;
    private final TextView g;
    private boolean h;

    public interface a {
        void a(Integer num);
    }

    /* renamed from: com.snap.messaging.sendto.internal.ui.view.SendToBottomPanelView$3 */
    public class AnonymousClass3 implements OnTouchListener {
        private /* synthetic */ a a;

        public AnonymousClass3(a aVar) {
            this.a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            SendToBottomPanelView.this.getParent().requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getActionMasked() != 1) {
                return true;
            }
            int offsetForPosition = textView.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            if (offsetForPosition >= 0 && offsetForPosition < text.length()) {
                this.a.a(Integer.valueOf(offsetForPosition));
            }
            return false;
        }
    }

    public SendToBottomPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SendToBottomPanelView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        inflate(context, R.layout.mushroom_send_to_bottom_panel_view, this);
        this.a = (ImageView) findViewById(R.id.send_to_bottom_panel_send_button);
        this.b = findViewById(R.id.sent_to_button_label_mode_view);
        this.c = (HorizontalScrollView) findViewById(R.id.send_to_bottom_panel_scroller);
        this.f = (LinearLayout) findViewById(R.id.send_to_bottom_panel_text_container);
        this.d = (TextView) findViewById(R.id.send_to_bottom_panel_text);
        this.g = (TextView) findViewById(R.id.send_to_bottom_panel_help_text);
        this.f.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                SendToBottomPanelView.this.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    public final void a(final boolean z) {
        if (z != this.h) {
            float f;
            int i = getLayoutParams().height;
            if (getVisibility() != 0) {
                setVisibility(0);
                setTranslationY((float) i);
            }
            this.h = z;
            float f2 = MapboxConstants.MINIMUM_ZOOM;
            if (z) {
                f2 = (float) i;
                f = MapboxConstants.MINIMUM_ZOOM;
            } else {
                f = (float) i;
            }
            ObjectAnimator objectAnimator = this.e;
            if (objectAnimator != null) {
                f2 = ((Float) objectAnimator.getAnimatedValue()).floatValue();
                objectAnimator = this.e;
                this.e = null;
                objectAnimator.cancel();
            }
            this.e = ObjectAnimator.ofFloat(this, "translationY", new float[]{f2, f});
            this.e.setDuration((long) ((((int) Math.abs(f2 - f)) * 100) / Math.abs(i)));
            this.e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (SendToBottomPanelView.this.e == animator) {
                        SendToBottomPanelView sendToBottomPanelView = SendToBottomPanelView.this;
                        sendToBottomPanelView.e = null;
                        if (!z) {
                            sendToBottomPanelView.setVisibility(8);
                        }
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    SendToBottomPanelView sendToBottomPanelView = SendToBottomPanelView.this;
                    sendToBottomPanelView.setTranslationY(((Float) sendToBottomPanelView.e.getAnimatedValue()).floatValue());
                }
            });
            this.e.start();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.g.setOnClickListener(onClickListener);
    }
}
