package com.snap.ui.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtp;
import defpackage.ajcx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajej;
import defpackage.ajfq;
import defpackage.zkq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CustomVolumeView extends LinearLayout {
    private static final int ANIMATION_DELAY_MILLIS = 500;
    private static final int ANIMATION_DURATION_MILLIS = 500;
    private static final double BAR_HEIGHT_SCREEN_HEIGHT_FRACTION = 0.0088d;
    private static final double BAR_MARGIN_SCREEN_WIDTH_FRACTION = 0.00402d;
    private final HashSet<Integer> mAllowedAudioStreams = new HashSet();
    private AudioManager mAudioManager;
    protected int mAudioStream = 3;
    protected final List<View> mBarViews = new ArrayList();
    private Context mContext;
    private ObjectAnimator mHideAnimator;
    private Runnable mHideVolumeRunnable;
    protected int mNumVolumeBars;
    private ajej mScheduledAnimation = ajfq.INSTANCE;
    protected int mStreamMaxVolume;
    protected int mThresholdMultiplier;

    public CustomVolumeView(Context context) {
        super(context);
        init(context, (AudioManager) context.getSystemService("audio"));
    }

    protected CustomVolumeView(Context context, AudioManager audioManager) {
        super(context);
        init(context, audioManager);
    }

    public CustomVolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, (AudioManager) context.getSystemService("audio"));
    }

    public CustomVolumeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, (AudioManager) context.getSystemService("audio"));
    }

    private void init(Context context, AudioManager audioManager) {
        this.mAllowedAudioStreams.add(Integer.valueOf(3));
        this.mAllowedAudioStreams.add(Integer.valueOf(0));
        this.mAllowedAudioStreams.add(Integer.valueOf(2));
        this.mAudioManager = audioManager;
        this.mContext = context;
        initViews();
        initHideAnimation();
    }

    private void initHideAnimation() {
        this.mHideAnimator = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        this.mHideAnimator.setDuration(500);
        this.mHideAnimator.addListener(new AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
                CustomVolumeView.this.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                CustomVolumeView.this.setVisibility(8);
                CustomVolumeView.this.setAlpha(1.0f);
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        });
        this.mHideVolumeRunnable = new Runnable() {
            public void run() {
                CustomVolumeView.this.mHideAnimator.start();
            }
        };
    }

    private void initViews() {
        initializeParameters();
        boolean e = abtp.e(this.mContext);
        int a = e ? abtp.a(this.mContext) : abtp.b(this.mContext);
        double b = (double) (e ? abtp.b(this.mContext) : abtp.a(this.mContext));
        Double.isNaN(b);
        int i = (int) (b * BAR_HEIGHT_SCREEN_HEIGHT_FRACTION);
        double d = (double) a;
        Double.isNaN(d);
        a = (int) (d * BAR_MARGIN_SCREEN_WIDTH_FRACTION);
        int i2 = 0;
        while (i2 < this.mNumVolumeBars) {
            View view = new View(this.mContext);
            LayoutParams layoutParams = new LayoutParams(-2, i, 1.0f);
            layoutParams.setMargins(i2 == 0 ? 0 : a, 0, i2 == this.mNumVolumeBars + -1 ? 0 : a, 0);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(-1);
            this.mBarViews.add(view);
            addView(view);
            i2++;
        }
        updateVolumeView();
    }

    private void initializeParameters() {
        this.mStreamMaxVolume = this.mAudioManager.getStreamMaxVolume(this.mAudioStream);
        this.mThresholdMultiplier = this.mAudioStream == 0 ? 1 : 2;
        double d = (double) this.mStreamMaxVolume;
        double d2 = (double) this.mThresholdMultiplier;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.mNumVolumeBars = (int) Math.ceil(d / d2);
    }

    private void reset(Activity activity) {
        for (View removeView : this.mBarViews) {
            removeView(removeView);
        }
        this.mBarViews.clear();
        setVisibility(4);
        this.mAudioStream = activity.getVolumeControlStream();
        if (!this.mAllowedAudioStreams.contains(Integer.valueOf(this.mAudioStream))) {
            this.mAudioStream = 3;
        }
        initViews();
    }

    private void updateVolumeView() {
        int streamVolume = this.mAudioManager.getStreamVolume(this.mAudioStream);
        int i = 0;
        while (i < this.mNumVolumeBars) {
            View view = (View) this.mBarViews.get(i);
            if (!(streamVolume == 0 && i == 0 && this.mAudioStream != 0)) {
                float f;
                int i2 = this.mThresholdMultiplier * i;
                int i3 = (this.mAudioStream == 0 || this.mStreamMaxVolume % 2 != 0) ? 0 : 1;
                i2 += i3;
                if (streamVolume > i2) {
                    view.setVisibility(0);
                    f = 1.0f;
                } else if (streamVolume == i2) {
                    view.setVisibility(0);
                    f = 0.5f;
                }
                view.setAlpha(f);
                i++;
            }
            view.setVisibility(4);
            i++;
        }
    }

    public /* synthetic */ void lambda$setInsetsDetector$0$CustomVolumeView(Rect rect) {
        setTranslationY((float) rect.top);
    }

    public void onVolumeLevelChanged(Activity activity, int i) {
        if (this.mStreamMaxVolume == 0 || this.mAudioStream != activity.getVolumeControlStream()) {
            reset(activity);
        }
        this.mScheduledAnimation.dispose();
        this.mHideAnimator.cancel();
        this.mAudioManager.adjustStreamVolume(this.mAudioStream, i, 0);
        updateVolumeView();
        setVisibility(0);
        this.mScheduledAnimation = ajcx.a(this.mHideVolumeRunnable).b(500, TimeUnit.MILLISECONDS).a(ajee.a(ajef.a)).e();
    }

    public ajej setInsetsDetector(zkq zkq) {
        return zkq.c.f(new -$$Lambda$CustomVolumeView$_bbgjmtaJmXrbyKPEZCqFl6Sw1g(this));
    }
}
