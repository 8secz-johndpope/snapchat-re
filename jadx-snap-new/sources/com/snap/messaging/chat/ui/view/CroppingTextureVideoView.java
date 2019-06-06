package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.shared.view.TextureVideoViewExtended;
import defpackage.pvm;
import defpackage.pvm.b;
import defpackage.szu.a;

public class CroppingTextureVideoView extends TextureVideoViewExtended {
    private final Matrix u;

    public CroppingTextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CroppingTextureVideoView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.u = new Matrix();
    }

    private void a(float f, float f2) {
        if (this.d > 0 && this.e > 0 && f2 > MapboxConstants.MINIMUM_ZOOM && f > MapboxConstants.MINIMUM_ZOOM) {
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            float f5 = 1.0f;
            if (((float) this.d) > f && ((float) this.e) > f2) {
                f5 = ((float) this.d) / f;
                f = (float) this.e;
            } else if (((float) this.d) < f && ((float) this.e) < f2) {
                float f6 = f / ((float) this.d);
                f5 = f2 / ((float) this.e);
                f = f6;
                this.u.setScale(f5, f, f3, f4);
                super.setTransform(this.u);
            } else if (f > ((float) this.d)) {
                f /= (float) this.d;
                f2 /= (float) this.e;
            } else {
                if (f2 > ((float) this.e)) {
                    f5 = (f2 / ((float) this.e)) / (f / ((float) this.d));
                }
                f = 1.0f;
                this.u.setScale(f5, f, f3, f4);
                super.setTransform(this.u);
            }
            f /= f2;
            this.u.setScale(f5, f, f3, f4);
            super.setTransform(this.u);
        }
    }

    public final a a() {
        b bVar = pvm.d;
        return (bVar == null || !bVar.b) ? a.MEDIA_PLAYER : super.a();
    }

    public void onMeasure(int i, int i2) {
        float defaultSize = (float) getDefaultSize(this.e, i2);
        float defaultSize2 = (float) getDefaultSize(this.d, i);
        a(defaultSize2, defaultSize);
        setMeasuredDimension(Math.max(1, (int) defaultSize2), Math.max(1, (int) defaultSize));
    }

    public void setTransform(Matrix matrix) {
        a((float) getWidth(), (float) getHeight());
    }
}
