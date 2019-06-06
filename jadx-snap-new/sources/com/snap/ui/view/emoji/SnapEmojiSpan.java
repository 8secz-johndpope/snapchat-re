package com.snap.ui.view.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import com.snap.core.db.record.FriendmojiModel;
import defpackage.ajdj;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.akcr;
import defpackage.akcv;
import defpackage.akde;
import defpackage.aken;
import defpackage.iim;
import defpackage.znp;

public final class SnapEmojiSpan extends DynamicDrawableSpan implements ajej, znp {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akcv(akde.a(SnapEmojiSpan.class), "parentView", "getParentView()Landroid/view/View;")};
    private final String TAG = "SnapEmojiSpan";
    private final ajei disposables = new ajei();
    private volatile Drawable drawable;
    private final String emoji;
    private final ajdj<Drawable> loadEmoji;
    private volatile boolean loadingComplete;
    private final iim parentView$delegate = new iim(null);
    private final int size;
    private final Rect textBounds = new Rect();

    public SnapEmojiSpan(String str, int i, ajdj<Drawable> ajdj) {
        akcr.b(str, FriendmojiModel.EMOJI);
        akcr.b(ajdj, "loadEmoji");
        super(1);
        this.emoji = str;
        this.size = i;
        this.loadEmoji = ajdj;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        int i2 = this.size;
        colorDrawable.setBounds(0, 0, i2, i2);
        this.drawable = colorDrawable;
    }

    private final View getParentView() {
        return (View) this.parentView$delegate.a($$delegatedProperties[0]);
    }

    private final void onLoadFailed(Throwable th) {
        this.loadingComplete = true;
        View parentView = getParentView();
        if (parentView != null) {
            parentView.postInvalidate();
        }
    }

    private final void setEmojiDrawable(Drawable drawable) {
        int i = this.size;
        drawable.setBounds(0, 0, i, i);
        this.drawable = drawable;
        this.loadingComplete = true;
        View parentView = getParentView();
        if (parentView != null) {
            parentView.postInvalidate();
        }
    }

    private final void setParentView(View view) {
        this.parentView$delegate.a($$delegatedProperties[0], view);
    }

    public final void attach(View view) {
        akcr.b(view, "view");
        setParentView(view);
    }

    public final void detach() {
        setParentView(null);
    }

    public final void dispose() {
        this.disposables.dispose();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        akcr.b(canvas, "canvas");
        CharSequence charSequence2 = charSequence;
        akcr.b(charSequence, "text");
        akcr.b(paint, "paint");
        canvas.save();
        if (this.loadingComplete && this.drawable == null) {
            canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        } else {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                float f2 = f;
                canvas.translate(f, (float) ((((i5 - i3) / 2) + i3) - (drawable.getBounds().height() / 2)));
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        akcr.b(paint, "paint");
        akcr.b(charSequence, "text");
        if (!this.loadingComplete || this.drawable != null) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        String str = this.emoji;
        paint.getTextBounds(str, 0, str.length(), this.textBounds);
        return this.textBounds.right;
    }

    public final void initialize() {
        ajej a = this.loadEmoji.a((ajfb) new SnapEmojiSpan$sam$i$io_reactivex_functions_Consumer$0(new SnapEmojiSpan$initialize$1$1(this)), (ajfb) new SnapEmojiSpan$sam$i$io_reactivex_functions_Consumer$0(new SnapEmojiSpan$initialize$1$2(this)));
        akcr.a((Object) a, "loadEmoji\n              …Drawable, ::onLoadFailed)");
        ajvv.a(a, this.disposables);
    }

    public final boolean isDisposed() {
        return this.disposables.isDisposed();
    }
}
