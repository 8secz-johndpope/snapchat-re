package com.brightcove.player.mediacontroller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.brightcove.player.R;
import com.brightcove.player.view.BaseVideoView;
import com.brightcove.player.view.BaseVideoView.OnVideoViewSizeChangedListener;
import java.util.ArrayList;
import java.util.List;

public class BrightcoveControlBar extends LinearLayout {
    public static final int AUDIO_TRACKS = R.styleable.BrightcoveMediaController_brightcove_audio_tracks;
    public static final int AUDIO_TRACKS_IMAGE = R.styleable.BrightcoveMediaController_brightcove_audio_tracks_image;
    public static final int CLOSED_CAPTIONS = R.styleable.BrightcoveMediaController_brightcove_closed_captions;
    public static final int CLOSED_CAPTIONS_IMAGE = R.styleable.BrightcoveMediaController_brightcove_closed_captions_image;
    public static final int ENTER_FULL_SCREEN_IMAGE = R.styleable.BrightcoveMediaController_brightcove_enter_full_screen_image;
    public static final int EXIT_FULL_SCREEN_IMAGE = R.styleable.BrightcoveMediaController_brightcove_exit_full_screen_image;
    public static final int FAST_FORWARD = R.styleable.BrightcoveMediaController_brightcove_fast_forward;
    public static final int FULL_SCREEN = R.styleable.BrightcoveMediaController_brightcove_full_screen;
    public static final int LIVE = R.styleable.BrightcoveMediaController_brightcove_live;
    public static final int PAUSE_IMAGE = R.styleable.BrightcoveMediaController_brightcove_pause_image;
    public static final int PLAY = R.styleable.BrightcoveMediaController_brightcove_play;
    public static final int PLAYER_OPTIONS = R.styleable.BrightcoveMediaController_brightcove_player_options;
    public static final int PLAYER_OPTIONS_IMAGE = R.styleable.BrightcoveMediaController_brightcove_player_options_image;
    public static final int PLAY_IMAGE = R.styleable.BrightcoveMediaController_brightcove_play_image;
    public static final int REWIND = R.styleable.BrightcoveMediaController_brightcove_rewind;
    public static final int REWIND_IMAGE = R.styleable.BrightcoveMediaController_brightcove_pause_image;
    public static final int SEEK_BAR = R.styleable.BrightcoveMediaController_brightcove_seekbar;
    public static final int VR_MODE = R.styleable.BrightcoveMediaController_brightcove_vr_mode;
    public static final int VR_MODE_IMAGE = R.styleable.BrightcoveMediaController_brightcove_vr_mode_image;
    private static final String a = BrightcoveControlBar.class.getSimpleName();
    private List<TypedValue> b;
    private SparseArray<Drawable> c;
    private BaseVideoView d;
    private boolean e;

    public BrightcoveControlBar(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new SparseArray();
    }

    public BrightcoveControlBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public BrightcoveControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        this.c = new SparseArray();
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        String str = a;
        Object[] objArr = new Object[1];
        int i2 = 0;
        objArr[0] = Integer.valueOf(attributeSet == null ? -1 : attributeSet.getAttributeCount());
        Log.d(str, String.format("The attribute set contains %1$d attributes.", objArr));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BrightcoveMediaController, i, R.style.BrightcoveControlBar);
        while (i2 < obtainStyledAttributes.length()) {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(i2, typedValue);
            this.b.add(typedValue);
            if ((i2 == R.styleable.BrightcoveMediaController_brightcove_chrome_cast_image || i2 == R.styleable.BrightcoveMediaController_brightcove_audio_tracks_image || i2 == R.styleable.BrightcoveMediaController_brightcove_closed_captions_image || i2 == R.styleable.BrightcoveMediaController_brightcove_enter_full_screen_image || i2 == R.styleable.BrightcoveMediaController_brightcove_exit_full_screen_image || i2 == R.styleable.BrightcoveMediaController_brightcove_pause_image || i2 == R.styleable.BrightcoveMediaController_brightcove_play_image || i2 == R.styleable.BrightcoveMediaController_brightcove_rewind_image || i2 == R.styleable.BrightcoveMediaController_brightcove_vr_mode_image) && typedValue.type == 3) {
                Drawable drawable = obtainStyledAttributes.getDrawable(i2);
                if (drawable != null) {
                    this.c.put(i2, drawable);
                }
            }
            if (i2 == R.styleable.BrightcoveMediaController_brightcove_align) {
                setAlign(obtainStyledAttributes.getBoolean(i2, true));
            }
            i2++;
        }
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        BaseVideoView baseVideoView = this.d;
        if (baseVideoView != null && this.e) {
            int height = (baseVideoView.getHeight() - this.d.getMeasuredVideoHeight()) / 2;
            if (height == 0) {
                height = (this.d.getHeight() - this.d.getStillView().getMeasuredHeight()) / 2;
            }
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            if (height != layoutParams.bottomMargin) {
                layoutParams.setMargins(0, 0, 0, height);
                requestLayout();
            }
        }
    }

    /* Access modifiers changed, original: final */
    @SuppressLint({"NewApi"})
    public final void a(BaseVideoView baseVideoView) {
        this.d = baseVideoView;
        baseVideoView.addOnVideoViewSizeChangedListener(new OnVideoViewSizeChangedListener() {
            public final void onVideoViewSizeChange(int i, int i2, int i3, int i4) {
                BrightcoveControlBar.this.a();
            }
        });
        if (VERSION.SDK_INT >= 11) {
            baseVideoView.getStillView().addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BrightcoveControlBar.this.a();
                }
            });
        }
        a();
    }

    public boolean getBooleanResource(int i) {
        String str;
        Object[] objArr;
        String str2;
        if (i < 0 || i >= this.b.size()) {
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && typedValue.type == 18) {
                return typedValue.data != 0;
            } else {
                str = a;
                objArr = new Object[]{Integer.valueOf(i)};
                str2 = "The styleable attribute at index %1$d is either null or not a boolean!";
            }
        }
        Log.e(str, String.format(str2, objArr));
        return false;
    }

    public int getColorResource(int i, int i2) {
        String str;
        Object[] objArr;
        String str2;
        if (i < 0 || i >= this.b.size()) {
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && typedValue.type == 28) {
                return typedValue.data;
            }
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The styleable attribute at index %1$d is either null or not a color value!";
        }
        Log.e(str, String.format(str2, objArr));
        return i2;
    }

    public float getFloatResource(int i, float f) {
        String str;
        Object[] objArr;
        String str2;
        if (i < 0 || i >= this.b.size()) {
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && typedValue.type == 4) {
                return typedValue.getFloat();
            }
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The styleable attribute at index %1$d is either null or not a float!";
        }
        Log.e(str, String.format(str2, objArr));
        return f;
    }

    public Drawable getImage(int i) {
        return (Drawable) this.c.get(i);
    }

    public int getIntegerResource(int i, int i2) {
        String str;
        Object[] objArr;
        String str2;
        if (i < 0 || i >= this.b.size()) {
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && (typedValue.type == 16 || typedValue.type == 17)) {
                return typedValue.data;
            }
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The styleable attribute at index %1$d is either null or not an integer!";
        }
        Log.e(str, String.format(str2, objArr));
        return i2;
    }

    public int getResourceId(int i) {
        String str;
        Object[] objArr;
        String str2;
        if (i < 0 || i >= this.b.size()) {
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && typedValue.type == 1) {
                return typedValue.data;
            }
            str = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str2 = "The styleable attribute at index %1$d is either null or not a reference!";
        }
        Log.e(str, String.format(str2, objArr));
        return -1;
    }

    public String getStringResource(int i, String str) {
        String str2;
        Object[] objArr;
        String str3;
        if (i < 0 || i >= this.b.size()) {
            str2 = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str3 = "The index %1$d is not valid.";
        } else {
            TypedValue typedValue = (TypedValue) this.b.get(i);
            if (typedValue != null && typedValue.type == 3) {
                return (String) typedValue.string;
            }
            str2 = a;
            objArr = new Object[]{Integer.valueOf(i)};
            str3 = "The styleable attribute at index %1$d is either null or not a string!";
        }
        Log.e(str2, String.format(str3, objArr));
        return str;
    }

    public void setAlign(boolean z) {
        this.e = z;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        a();
    }
}
