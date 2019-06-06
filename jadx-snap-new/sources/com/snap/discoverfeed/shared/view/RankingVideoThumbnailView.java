package com.snap.discoverfeed.shared.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import com.snap.opera.shared.view.TextureVideoView;
import defpackage.szu.a;

public class RankingVideoThumbnailView extends TextureVideoView {
    private final Matrix u;

    public RankingVideoThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RankingVideoThumbnailView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.u = new Matrix();
    }

    public final a a() {
        return h() ? a.EXOPLAYER_AND_STREAM_DECRYPTION : f() ? a.EXOPLAYER : a.MEDIA_PLAYER;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((this.f != null ? 1 : null) == null && g()) {
            i();
            d(true);
            start();
        }
    }

    public void onMeasure(int i, int i2) {
        float defaultSize = (float) getDefaultSize(this.d, i);
        float defaultSize2 = (float) getDefaultSize(this.e, i2);
        if (this.d > 0 && this.e > 0) {
            float f = defaultSize / 2.0f;
            float f2 = defaultSize2 / 2.0f;
            float f3 = ((float) this.d) * defaultSize2;
            float f4 = ((float) this.e) * defaultSize;
            float f5 = 1.0f;
            if (f3 > f4) {
                f3 /= f4;
            } else {
                f5 = f4 / f3;
                f3 = 1.0f;
            }
            this.u.setScale(f3, f5, f, f2);
            setTransform(this.u);
        }
        setMeasuredDimension(Math.max(1, (int) defaultSize), Math.max(1, (int) defaultSize2));
    }
}
