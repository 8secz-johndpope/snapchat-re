package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.axu.a;

/* renamed from: axw */
public class axw<DH extends axs> extends ImageView {
    private final a a = new a();
    private float b = MapboxConstants.MINIMUM_ZOOM;
    private axv<DH> c;
    private boolean d = false;
    private boolean e = false;

    public axw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public axw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        if (!this.d) {
            this.d = true;
            this.c = new axv();
            if (VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                } else {
                    return;
                }
            }
            this.e = false;
        }
    }

    public axr a() {
        return this.c.c;
    }

    public final void a(float f) {
        if (f != this.b) {
            this.b = f;
            requestLayout();
        }
    }

    public void a(axr axr) {
        this.c.a(axr);
        super.setImageDrawable(this.c.c());
    }

    public final void a(DH dh) {
        axk axk = this.c;
        axk.d.a(awm.a.ON_SET_HIERARCHY);
        boolean e = axk.e();
        axk.a(null);
        axk.b = (axs) auh.a((Object) dh);
        Drawable a = axk.b.a();
        boolean z = a == null || a.isVisible();
        axk.a(z);
        axk.a(axk);
        if (e) {
            axk.c.a((axs) dh);
        }
        super.setImageDrawable(this.c.c());
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        axv axv = this.c;
        axv.d.a(awm.a.ON_HOLDER_DETACH);
        axv.a = false;
        axv.d();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.c.b();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        a aVar = this.a;
        aVar.a = i;
        aVar.b = i2;
        float f = this.b;
        LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f > MapboxConstants.MINIMUM_ZOOM && layoutParams != null) {
            if (axu.a(layoutParams.height)) {
                aVar.b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.a) - paddingLeft)) / f) + ((float) paddingTop)), aVar.b), AudioPlayer.INFINITY_LOOP_COUNT);
            } else if (axu.a(layoutParams.width)) {
                aVar.a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.b) - paddingTop)) * f) + ((float) paddingLeft)), aVar.a), AudioPlayer.INFINITY_LOOP_COUNT);
            }
        }
        super.onMeasure(this.a.a, this.a.b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        axv axv = this.c;
        if (axv.e()) {
            axv.c.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* Access modifiers changed, original: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        getContext();
        c();
        this.c.a(null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        getContext();
        c();
        this.c.a(null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        getContext();
        c();
        this.c.a(null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        getContext();
        c();
        this.c.a(null);
        super.setImageURI(uri);
    }

    public String toString() {
        aug.a a = aug.a(this);
        axv axv = this.c;
        return a.a("holder", axv != null ? axv.toString() : "<no holder set>").toString();
    }
}
