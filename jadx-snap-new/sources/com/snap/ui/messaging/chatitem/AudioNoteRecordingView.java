package com.snap.ui.messaging.chatitem;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.zku;
import defpackage.zkv;
import java.util.ArrayList;
import java.util.List;

public final class AudioNoteRecordingView extends FrameLayout {
    private b A;
    private long B;
    public final zkv a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public final ImageView e;
    public final Animator f;
    public final Animator g;
    public c h;
    public boolean i;
    public boolean j;
    public boolean k;
    public AnimatorSet l;
    public AnimatorSet m;
    private final float n;
    private final float o;
    private final float p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final Path[] v;
    private final Paint w;
    private final Paint x;
    private final RectF y;
    private int z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static Paint a(Context context, int i) {
            int color = ContextCompat.getColor(context, i);
            Paint paint = new Paint(1);
            paint.setColor(color);
            return paint;
        }
    }

    public enum b {
        RECORDING,
        STOPPED
    }

    public interface c {
        int a();
    }

    static final class d implements AnimatorUpdateListener {
        private /* synthetic */ AudioNoteRecordingView a;

        d(AudioNoteRecordingView audioNoteRecordingView) {
            this.a = audioNoteRecordingView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.a.d.setAlpha((int) (255.0f * floatValue));
                this.a.e.setAlpha(1.0f - floatValue);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class e implements AnimatorListener {
        private /* synthetic */ AudioNoteRecordingView a;

        e(AudioNoteRecordingView audioNoteRecordingView) {
            this.a = audioNoteRecordingView;
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.e.setVisibility(8);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            Paint paint = this.a.c;
            Object context = this.a.getContext();
            akcr.a(context, "context");
            paint.setColor(context.getResources().getColor(R.color.regular_yellow));
        }
    }

    static final class f implements AnimatorUpdateListener {
        private /* synthetic */ AudioNoteRecordingView a;

        f(AudioNoteRecordingView audioNoteRecordingView) {
            this.a = audioNoteRecordingView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.a.d.setAlpha((int) (255.0f * floatValue));
                this.a.e.setAlpha(1.0f - floatValue);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class g implements AnimatorListener {
        private /* synthetic */ AudioNoteRecordingView a;

        g(AudioNoteRecordingView audioNoteRecordingView) {
            this.a = audioNoteRecordingView;
        }

        public final void onAnimationCancel(Animator animator) {
            akcr.b(animator, "animation");
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            akcr.b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            akcr.b(animator, "animation");
            this.a.e.setVisibility(0);
            Paint paint = this.a.c;
            Object context = this.a.getContext();
            akcr.a(context, "context");
            paint.setColor(context.getResources().getColor(R.color.regular_grey));
        }
    }

    static {
        a aVar = new a();
    }

    public AudioNoteRecordingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AudioNoteRecordingView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = new zkv();
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[3];
        String str = "scaleX";
        animatorArr[0] = ObjectAnimator.ofFloat(this, str, new float[]{1.0f, 0.7f});
        String str2 = "scaleY";
        animatorArr[1] = ObjectAnimator.ofFloat(this, str2, new float[]{1.0f, 0.7f});
        String str3 = "translationY";
        animatorArr[2] = ObjectAnimator.ofFloat(this, str3, new float[]{this.b, b()});
        animatorSet.playTogether(animatorArr);
        this.l = animatorSet;
        animatorSet = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        animatorArr2[0] = ObjectAnimator.ofFloat(this, str, new float[]{0.7f, 1.0f});
        animatorArr2[1] = ObjectAnimator.ofFloat(this, str2, new float[]{0.7f, 1.0f});
        animatorArr2[2] = ObjectAnimator.ofFloat(this, str3, new float[]{b(), this.b});
        animatorSet.playTogether(animatorArr2);
        this.m = animatorSet;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_recording_preview_with_ring_diameter);
        this.b = getTranslationY();
        float f = (float) (dimensionPixelOffset / 2);
        this.n = f;
        this.o = f;
        this.p = (float) resources.getDimensionPixelOffset(R.dimen.chat_audio_note_recording_preview_diameter);
        this.q = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_width);
        this.r = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_spacing);
        this.s = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_width);
        this.t = resources.getDimensionPixelOffset(R.dimen.chat_audio_video_note_ring_stroke_width);
        this.u = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_discard_view_size);
        this.v = new Path[14];
        this.z = R.color.regular_yellow;
        this.c = a.a(context, R.color.regular_yellow);
        this.c.setStrokeCap(Cap.ROUND);
        this.c.setStyle(Style.STROKE);
        this.c.setStrokeWidth((float) this.t);
        this.w = a.a(context, R.color.white);
        this.x = a.a(context, R.color.regular_grey);
        this.x.setStyle(Style.STROKE);
        this.d = a.a(context, R.color.regular_yellow);
        this.d.setStrokeCap(Cap.ROUND);
        this.d.setStyle(Style.STROKE);
        this.d.setStrokeWidth((float) this.q);
        float f2 = (float) (this.t / 2);
        float f3 = MapboxConstants.MINIMUM_ZOOM + f2;
        float f4 = ((float) dimensionPixelOffset) - f2;
        this.y = new RectF(f3, f3, f4, f4);
        ImageView imageView = new ImageView(context);
        dimensionPixelOffset = this.u;
        LayoutParams layoutParams = new LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.audio_note_cancel);
        imageView.setVisibility(8);
        this.e = imageView;
        addView(this.e);
        Object ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        ofFloat.addUpdateListener(new f(this));
        ofFloat.addListener(new g(this));
        akcr.a(ofFloat, "showDiscardAnimator");
        this.f = (Animator) ofFloat;
        ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.addUpdateListener(new d(this));
        ofFloat.addListener(new e(this));
        akcr.a(ofFloat, "hideDiscardAnimator");
        this.g = (Animator) ofFloat;
        setWillNotDraw(false);
    }

    private final void a() {
        this.B = SystemClock.elapsedRealtime();
        this.j = true;
        this.k = true;
        invalidate();
    }

    private final float b() {
        return ((((float) getResources().getDimensionPixelOffset(R.dimen.chat_audio_note_recording_preview_with_ring_diameter)) * 0.3f) / 2.0f) + ((float) getResources().getDimensionPixelOffset(R.dimen.chat_audio_video_note_preview_translation_y));
    }

    public final void a(b bVar) {
        akcr.b(bVar, "state");
        if (this.A != bVar) {
            this.A = bVar;
            int i = zku.a[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.k = false;
                }
                return;
            }
            a();
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        akcr.b(canvas2, "canvas");
        if (this.k) {
            invalidate();
        }
        float f = this.p * 0.5f;
        canvas2.drawCircle(this.n, this.o, f - 1.0f, this.w);
        canvas2.drawCircle(this.n, this.o, f, this.x);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.B;
        if (this.j) {
            defpackage.zkw.a aVar;
            f = (float) elapsedRealtime;
            float f2 = -90.0f + (((f / 1000.0f) * 180.0f) % 360.0f);
            float f3 = 90.0f;
            if (f < 1000.0f) {
                f3 = (f * 90.0f) / 1000.0f;
            }
            canvas.drawArc(this.y, f2, f3, false, this.c);
            int i = this.q;
            int i2 = this.r;
            f2 = (float) (((i + i2) * 13) + i);
            float f4 = (((float) (i2 * 2)) + f2) * 0.5f;
            f = (((float) i) - f2) * 0.5f;
            zkv zkv = this.a;
            c cVar = this.h;
            if (cVar == null) {
                akcr.a();
            }
            int a = cVar.a();
            int size = zkv.a.size();
            if (size % 8 != 0) {
                aVar = zkv.c;
            } else if (size < 20) {
                aVar = new defpackage.zkw.a();
                for (int i3 = 0; i3 < 14; i3++) {
                    aVar.a[i3] = zkv.b.nextFloat() * 0.1f;
                }
            } else {
                defpackage.zkw.a aVar2 = new defpackage.zkw.a();
                int i4 = zkv.d;
                ArrayList arrayList = new ArrayList(8);
                int a2 = zkv.a(i4);
                if (a2 <= zkv.e) {
                    a2 = zkv.e;
                }
                int i5 = i4 + 8;
                while (i4 < i5) {
                    arrayList.add(Float.valueOf(((float) ((Number) zkv.a.get(i4)).intValue()) / ((float) a2)));
                    i4++;
                }
                zkv.a(aVar2, zkv.a((List) arrayList));
                zkv.d = size;
                aVar = aVar2;
            }
            zkv.a.add(Integer.valueOf(a));
            zkv.e = Math.max(zkv.e, a);
            if (zkv.a.size() % 600 == 0) {
                zkv.e = 4095;
            }
            zkv.c = aVar;
            if (aVar != null) {
                f2 = f;
                for (i = 0; i < 14; i++) {
                    f3 = Math.max(aVar.a[i] * (((float) Math.sqrt(1.0d - Math.pow((double) (f2 / f4), 2.0d))) * f4), ((float) this.s) * 0.5f);
                    Path path = this.v[i];
                    if (path == null) {
                        path = new Path();
                        this.v[i] = path;
                    } else {
                        path.reset();
                    }
                    float f5 = this.n + f2;
                    path.moveTo(f5, this.o + f3);
                    path.lineTo(f5, this.o - f3);
                    canvas2.drawPath(path, this.d);
                    f2 += (float) (this.q + this.r);
                }
            }
        }
    }
}
