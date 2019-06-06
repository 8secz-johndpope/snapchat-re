package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: abut */
public class abut extends ImageView {
    private boolean a = false;
    private boolean b;

    public abut(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abut(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        boolean z = MeasureSpec.getMode(i) == AudioPlayer.INFINITY_LOOP_COUNT && MeasureSpec.getMode(i2) == AudioPlayer.INFINITY_LOOP_COUNT;
        this.b = z;
        super.onMeasure(i, i2);
    }

    public void requestLayout() {
        if (!this.a) {
            super.requestLayout();
        }
        this.a = false;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (this.b) {
            this.a = true;
        }
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.b) {
            this.a = true;
        }
        super.setImageDrawable(drawable);
    }

    public void setImageURI(Uri uri) {
        if (this.b) {
            this.a = true;
        }
        super.setImageURI(uri);
    }
}
