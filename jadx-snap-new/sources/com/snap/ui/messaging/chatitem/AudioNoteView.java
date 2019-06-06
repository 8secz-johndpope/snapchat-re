package com.snap.ui.messaging.chatitem;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.hh;
import defpackage.hj;
import defpackage.zkw;
import defpackage.zkx;

public class AudioNoteView extends zkx {
    private final Resources a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private final RectF f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final Path[] n;
    private final LoadingSpinnerView o;
    private int p;
    private int q;
    private int r;
    private Path[] s;
    private Path[] t;
    private a u;
    private int v;
    private boolean w;

    public interface a {
        zkw a();

        int b();

        int c();
    }

    public AudioNoteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AudioNoteView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.v = 1;
        this.a = context.getResources();
        this.b = new Paint(1);
        int color = context.getResources().getColor(R.color.regular_grey);
        Paint paint = new Paint(1);
        paint.setColor(color);
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new RectF();
        this.g = this.a.getDimensionPixelOffset(R.dimen.chat_audio_video_note_padding);
        color = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_size) + (this.g * 2);
        int dimensionPixelOffset = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_size) + (this.g * 2);
        this.p = color / 2;
        this.q = dimensionPixelOffset / 2;
        this.r = Math.min(this.p, this.q) - this.g;
        this.h = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_width);
        this.i = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_spacing);
        this.j = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_waveform_width);
        this.k = this.a.getDimensionPixelOffset(R.dimen.chat_audio_video_note_ring_stroke_width);
        this.l = this.a.getDimensionPixelSize(R.dimen.chat_audio_video_note_progress_bar_size);
        this.m = hh.a(this.a, (int) R.color.off_white);
        int dimensionPixelOffset2 = this.a.getDimensionPixelOffset(R.dimen.chat_audio_note_ring_spacing_from_circle);
        RectF rectF = this.f;
        int i = this.g;
        rectF.set((float) (dimensionPixelOffset2 + i), (float) (dimensionPixelOffset2 + i), (float) ((color - dimensionPixelOffset2) - i), (float) ((dimensionPixelOffset - dimensionPixelOffset2) - i));
        this.s = a(this.a);
        this.t = a();
        this.n = new Path[14];
        LoadingSpinnerView loadingSpinnerView = new LoadingSpinnerView(context);
        dimensionPixelOffset = this.l;
        LayoutParams layoutParams = new LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.addRule(13);
        loadingSpinnerView.setLayoutParams(layoutParams);
        loadingSpinnerView.b(1);
        this.o = loadingSpinnerView;
        addView(this.o);
        this.d.setStyle(Style.STROKE);
        this.d.setStrokeWidth((float) this.h);
        this.d.setStrokeCap(Cap.ROUND);
        this.c.setStyle(Style.STROKE);
        this.e.setStrokeWidth((float) this.k);
        this.e.setStyle(Style.STROKE);
        this.e.setStrokeCap(Cap.ROUND);
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        for (Path drawPath : this.s) {
            canvas.drawPath(drawPath, this.d);
        }
    }

    private Path[] a() {
        float f = (float) (this.h + this.i);
        float f2 = -7.0f * f;
        float f3 = ((float) this.j) * 0.5f;
        Path[] pathArr = new Path[9];
        for (int i = 0; i < 9; i++) {
            float f4 = ((float) this.p) + f2;
            pathArr[i] = new Path();
            pathArr[i].moveTo(f4, ((float) this.q) - f3);
            pathArr[i].lineTo(f4, ((float) this.q) + f3);
            f2 += f;
            if (i == 4) {
                f2 += 5.0f * f;
            }
        }
        return pathArr;
    }

    private Path[] a(Resources resources) {
        r1 = new int[5];
        int i = 0;
        r1[0] = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_play_button_bar_height_0);
        r1[1] = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_play_button_bar_height_1);
        r1[2] = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_play_button_bar_height_2);
        r1[3] = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_play_button_bar_height_3);
        r1[4] = resources.getDimensionPixelOffset(R.dimen.chat_audio_note_play_button_bar_height_4);
        int i2 = this.h;
        float f = (float) (this.i + i2);
        float f2 = (((float) i2) - ((4.0f * f) + ((float) i2))) * 0.5f;
        Path[] pathArr = new Path[5];
        while (i < 5) {
            float f3 = ((float) this.p) + f2;
            float f4 = ((float) r1[i]) * 0.5f;
            pathArr[i] = new Path();
            pathArr[i].moveTo(f3, ((float) this.q) - f4);
            pathArr[i].lineTo(f3, ((float) this.q) + f4);
            f2 += f;
            i++;
        }
        return pathArr;
    }

    private void b(Canvas canvas) {
        for (Path path : this.t) {
            this.d.setAlpha(64);
            canvas.drawPath(path, this.d);
            this.d.setAlpha(255);
        }
    }

    public final void a(int i) {
        if (i == 3) {
            this.w = true;
            invalidate();
        } else if (i == 2) {
            this.w = false;
        }
        if (i == 1) {
            this.o.setVisibility(0);
        } else {
            this.o.setVisibility(8);
        }
        this.v = i;
        invalidate();
    }

    public final void a(a aVar, int i) {
        this.u = aVar;
        this.d.setColor(i);
        this.e.setColor(hj.b(i, 64));
        this.o.a(i);
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        Canvas canvas2 = canvas;
        if (this.v == 1) {
            paint = this.b;
            i = this.m;
        } else {
            paint = this.b;
            i = -1;
        }
        paint.setColor(i);
        canvas2.drawCircle((float) this.p, (float) this.q, (float) this.r, this.b);
        canvas2.drawCircle((float) this.p, (float) this.q, (float) this.r, this.c);
        if (this.v != 1) {
            zkw a = this.u.a();
            if (a != null) {
                long b = (long) this.u.b();
                int i2 = this.v;
                if (i2 == 3 || i2 == 4) {
                    canvas.drawArc(this.f, -90.0f, ((((float) b) / ((float) this.u.c())) - 1.0f) * 360.0f, false, this.e);
                }
                if (this.v == 3) {
                    i2 = this.h;
                    int i3 = this.i;
                    float f = (float) (i2 + i3);
                    float f2 = (13.0f * f) + ((float) i2);
                    float f3 = (((float) (i3 * 2)) + f2) * 0.5f;
                    float f4 = (((float) i2) - f2) * 0.5f;
                    defpackage.zkw.a aVar = new defpackage.zkw.a();
                    float f5 = ((float) b) / 1000.0f;
                    int i4 = (int) (f5 * 15.0f);
                    int i5 = 14;
                    if (i4 < a.a.size()) {
                        defpackage.zkw.a aVar2 = (defpackage.zkw.a) a.a.get(i4);
                        int i6 = i4 + 1;
                        if (i6 < a.a.size()) {
                            defpackage.zkw.a aVar3 = (defpackage.zkw.a) a.a.get(i6);
                            f5 = (f5 - (((float) i4) / 15.0f)) * 15.0f;
                            for (int i7 = 0; i7 < 14; i7++) {
                                aVar.a[i7] = ((1.0f - f5) * aVar2.a[i7]) + (aVar3.a[i7] * f5);
                            }
                        } else {
                            aVar = aVar2;
                        }
                    }
                    float f6 = f4;
                    i2 = 0;
                    while (i2 < i5) {
                        float max = Math.max((aVar.a[i2] * (this.v == 2 ? 0.5f : 1.0f)) * (((float) Math.sqrt(1.0d - Math.pow((double) (f6 / f3), 2.0d))) * f3), ((float) this.j) * 0.5f);
                        Path path = this.n[i2];
                        if (path == null) {
                            path = new Path();
                            this.n[i2] = path;
                        } else {
                            path.reset();
                        }
                        float f7 = ((float) this.p) + f6;
                        path.moveTo(f7, ((float) this.q) - max);
                        path.lineTo(f7, ((float) this.q) + max);
                        canvas2.drawPath(path, this.d);
                        f6 += f;
                        i2++;
                        i5 = 14;
                    }
                } else {
                    a(canvas);
                    b(canvas);
                }
            }
            if (this.w) {
                invalidate();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = i / 2;
        this.q = i2 / 2;
        this.r = Math.min(this.p, this.q) - this.g;
        this.s = a(this.a);
        this.t = a();
    }
}
