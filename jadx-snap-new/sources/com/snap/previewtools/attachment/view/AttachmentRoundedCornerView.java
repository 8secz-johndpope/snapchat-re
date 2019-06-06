package com.snap.previewtools.attachment.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.akcr;

public final class AttachmentRoundedCornerView extends ScrollablePullDownBaseView {
    private final Paint d = new Paint();
    private final Path e;
    private final Path f;

    public AttachmentRoundedCornerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        int a = abtp.a(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.snap_attachment_webview_corner_radius);
        this.d.setColor(-16777216);
        this.e = new Path();
        dimensionPixelOffset <<= 1;
        float f = (float) dimensionPixelOffset;
        this.e.addArc(new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, f), 180.0f, 90.0f);
        this.e.lineTo(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        this.e.close();
        this.f = new Path();
        float f2 = (float) a;
        this.f.addArc(new RectF((float) (a - dimensionPixelOffset), MapboxConstants.MINIMUM_ZOOM, f2, f), MapboxConstants.MINIMUM_ZOOM, -90.0f);
        this.f.lineTo(f2, MapboxConstants.MINIMUM_ZOOM);
        this.f.close();
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        int save = canvas.save();
        super.dispatchDraw(canvas);
        canvas.drawPath(this.e, this.d);
        canvas.drawPath(this.f, this.d);
        canvas.restoreToCount(save);
    }
}
