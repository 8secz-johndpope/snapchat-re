package com.snap.camera.subcomponents.cameramode.countdowntimer;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;

public class CountDownAnimationView extends FrameLayout {
    public final Animator[] a;
    public final Handler b;
    public int c;
    private final int d;
    private final int e;

    public CountDownAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CountDownAnimationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = new Animator[2];
        this.b = new Handler();
        int integer = getContext().getResources().getInteger(R.integer.countdown_digit_duration);
        int integer2 = getContext().getResources().getInteger(R.integer.countdown_digit_overlap);
        this.d = integer - integer2;
        this.e = integer - (integer2 << 1);
        b();
    }

    private void b() {
        for (int i = 0; i < 2; i++) {
            this.a[i] = AnimatorInflater.loadAnimator(getContext(), R.animator.countdown_animator);
            final TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.countdown_animation_textview, this, false);
            Animator animator = this.a[i];
            final int i2 = this.e;
            animator.setTarget(textView);
            animator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    textView.setVisibility(8);
                    if (CountDownAnimationView.this.c > 0) {
                        Handler handler = CountDownAnimationView.this.b;
                        animator.getClass();
                        handler.postDelayed(new -$$Lambda$VKaan4AksvR9EA2Slt2S3X5pVOI(animator), (long) i2);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    CountDownAnimationView countDownAnimationView = CountDownAnimationView.this;
                    int i = countDownAnimationView.c;
                    countDownAnimationView.c = i - 1;
                    textView.setText(String.valueOf(i));
                    textView.setVisibility(0);
                }
            });
            addView(textView);
        }
    }

    public final void a() {
        this.c = getContext().getResources().getInteger(R.integer.countdown_max_count);
        Handler handler = this.b;
        Object obj = this.a[0];
        obj.getClass();
        handler.post(new -$$Lambda$VKaan4AksvR9EA2Slt2S3X5pVOI(obj));
        handler = this.b;
        obj = this.a[1];
        obj.getClass();
        handler.postDelayed(new -$$Lambda$VKaan4AksvR9EA2Slt2S3X5pVOI(obj), (long) this.d);
        setVisibility(0);
    }
}
