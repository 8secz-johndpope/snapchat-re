package com.snap.ui.view.multisnap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.akco;
import defpackage.akcr;
import defpackage.jwa;
import defpackage.jwj;
import defpackage.kaz;

public final class ThumbnailTrimmingOverlayView extends ImageView {
    private static final float BUFFER_BITMAP_HEIGHT = 200.0f;
    public static final Companion Companion = new Companion();
    private static final int INNER_CORNER_RADIUS_PIXELATION_FIX = 2;
    private static final float INVALID_DIMEN = -1.0f;
    private static final String TAG = "ThumbnailTrimmingOverlayView";
    private jwa bitmapFactory;
    private kaz<jwj> bufferBitmap;
    private int bufferBitmapWidth = 1200;
    private Canvas bufferCanvas;
    private float bufferedLeftMargin = -1.0f;
    private float bufferedRightMargin = -1.0f;
    private float bufferedWidth = -1.0f;
    private final float cornerRadius;
    private final Rect innerRect;
    private int leftMargin;
    private final Rect outerRect;
    private final int overlayColor;
    private final Paint paint;
    private final RectF rectF = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, BUFFER_BITMAP_HEIGHT);
    private int rightMargin;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public ThumbnailTrimmingOverlayView(Context context) {
        String str = "context";
        akcr.b(context, str);
        super(context);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.paint = paint;
        Object context2 = getContext();
        akcr.a(context2, str);
        this.overlayColor = context2.getResources().getColor(R.color.black_fifty_opacity);
        context2 = getContext();
        akcr.a(context2, str);
        this.cornerRadius = context2.getResources().getDimension(R.dimen.multi_snap_thumbnail_border_radius) - 1.0f;
        this.innerRect = new Rect(0, 0, 0, 0);
        this.outerRect = new Rect(0, 0, 0, 0);
    }

    public ThumbnailTrimmingOverlayView(Context context, AttributeSet attributeSet) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.paint = paint;
        Object context2 = getContext();
        akcr.a(context2, str);
        this.overlayColor = context2.getResources().getColor(R.color.black_fifty_opacity);
        context2 = getContext();
        akcr.a(context2, str);
        this.cornerRadius = context2.getResources().getDimension(R.dimen.multi_snap_thumbnail_border_radius) - 1.0f;
        this.innerRect = new Rect(0, 0, 0, 0);
        this.outerRect = new Rect(0, 0, 0, 0);
    }

    public ThumbnailTrimmingOverlayView(Context context, AttributeSet attributeSet, int i) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.paint = paint;
        Object context2 = getContext();
        akcr.a(context2, str);
        this.overlayColor = context2.getResources().getColor(R.color.black_fifty_opacity);
        context2 = getContext();
        akcr.a(context2, str);
        this.cornerRadius = context2.getResources().getDimension(R.dimen.multi_snap_thumbnail_border_radius) - 1.0f;
        this.innerRect = new Rect(0, 0, 0, 0);
        this.outerRect = new Rect(0, 0, 0, 0);
    }

    private final void updateBufferedBitmap(float f, float f2, float f3, float f4) {
        jwa jwa = this.bitmapFactory;
        if (jwa != null) {
            if (!kaz.a(this.bufferBitmap)) {
                this.bufferBitmap = jwa.a(this.bufferBitmapWidth, (int) Callback.DEFAULT_DRAG_ANIMATION_DURATION, TAG);
            }
            if (this.bufferCanvas == null) {
                kaz kaz = this.bufferBitmap;
                if (kaz == null) {
                    akcr.a();
                }
                Object a = kaz.a();
                akcr.a(a, "bufferBitmap!!.get()");
                this.bufferCanvas = new Canvas(((jwj) a).a());
            }
            Canvas canvas = this.bufferCanvas;
            if (canvas != null) {
                canvas.drawColor(0, Mode.SRC);
            }
            RectF rectF = this.rectF;
            rectF.left = MapboxConstants.MINIMUM_ZOOM;
            rectF.right = f;
            this.paint.setColor(this.overlayColor);
            canvas = this.bufferCanvas;
            if (canvas != null) {
                canvas.drawRoundRect(this.rectF, f4, f4, this.paint);
            }
            rectF = this.rectF;
            rectF.left = f2;
            rectF.right = f - f3;
            this.paint.setColor(0);
            canvas = this.bufferCanvas;
            if (canvas != null) {
                f4 += 2.0f;
                canvas.drawRoundRect(this.rectF, f4, f4, this.paint);
            }
            this.bufferedWidth = f;
            this.bufferedLeftMargin = f2;
            this.bufferedRightMargin = f3;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        if (this.leftMargin != 0 || this.rightMargin != 0) {
            float height = BUFFER_BITMAP_HEIGHT / ((float) canvas.getHeight());
            float width = ((float) canvas.getWidth()) * height;
            float f = ((float) this.leftMargin) * height;
            float f2 = ((float) this.rightMargin) * height;
            float f3 = this.cornerRadius * height;
            if (!(kaz.a(this.bufferBitmap) && this.bufferCanvas != null && this.bufferedLeftMargin == f && this.bufferedRightMargin == f2 && this.bufferedWidth == width)) {
                updateBufferedBitmap(width, f, f2, f3);
            }
            kaz kaz = this.bufferBitmap;
            if (kaz != null) {
                Rect rect = this.innerRect;
                rect.right = (int) width;
                rect.bottom = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
                this.outerRect.right = getWidth();
                this.outerRect.bottom = getHeight();
                Object a = kaz.a();
                akcr.a(a, "it.get()");
                canvas.drawBitmap(((jwj) a).a(), this.innerRect, this.outerRect, null);
            }
        }
    }

    public final void setBitmapFactory(jwa jwa) {
        akcr.b(jwa, "bitmapFactory");
        this.bitmapFactory = jwa;
    }

    public final void setLeftMargin(int i) {
        this.leftMargin = i;
    }

    public final void setRightMargin(int i) {
        this.rightMargin = i;
    }
}
