package com.snap.camera.subcomponents.cameramode.batchcapture.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

public class BatchCaptureAnimationView extends View {
    public BatchCaptureAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private /* synthetic */ void a() {
        setVisibility(8);
    }

    public final void a(Bitmap bitmap, Rect rect) {
        setBackground(new BitmapDrawable(getResources(), bitmap));
        animate().cancel();
        setVisibility(0);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setPivotX(((float) (rect.left + rect.right)) / 2.0f);
        setPivotY(((float) (rect.top + rect.bottom)) / 2.0f);
        setAlpha(1.0f);
        animate().scaleX(0.04f).scaleY(0.04f).alpha(0.25f).setDuration(200).withEndAction(new -$$Lambda$BatchCaptureAnimationView$fsLPukKI4lt079ts-fkGSDcFN4o(this)).start();
    }
}
