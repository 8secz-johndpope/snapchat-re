package com.snap.camera.subcomponents.cameramode.gridlevel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

public class GridLevelCanvasView extends View {
    public Path a;
    public double b = 0.0d;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    private Path f;
    private Paint g;
    private Paint h;
    private final int i = getResources().getColor(R.color.snapchat_yellow_full_opacity);
    private boolean j = false;
    private boolean k = true;
    private Integer l = null;

    public GridLevelCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float dimension = getResources().getDimension(R.dimen.camera_mode_grid_line_width);
        float dimension2 = getResources().getDimension(R.dimen.camera_mode_grid_border_width);
        this.h = new Paint(1);
        this.h.setStrokeWidth((dimension2 * 2.0f) + dimension);
        this.h.setColor(getResources().getColor(R.color.off_black_twelve_opacity));
        this.h.setStyle(Style.STROKE);
        this.g = new Paint(1);
        this.g.setStrokeWidth(dimension);
        this.g.setColor(getResources().getColor(R.color.white_forty_five_opacity));
        this.g.setStyle(Style.STROKE);
        this.g.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
    }

    private void a(Path path, Canvas canvas) {
        canvas.drawPath(path, this.h);
        canvas.drawPath(path, this.g);
    }

    public final void a(boolean z) {
        this.j = this.c;
        this.c = z;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        Object obj;
        float strokeWidth;
        float width;
        float height;
        float f;
        float f2;
        Path path;
        int height2 = getHeight();
        Integer num = this.l;
        if (num == null || num.intValue() != height2) {
            this.l = Integer.valueOf(height2);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            strokeWidth = this.h.getStrokeWidth();
            width = (float) getWidth();
            height = (float) getHeight();
            f = strokeWidth * 2.0f;
            f2 = (width - f) / 3.0f;
            f = (height - f) / 3.0f;
            path = new Path();
            int i = 0;
            while (i < 2) {
                int i2 = i + 1;
                float f3 = (((float) i2) * f2) + ((((float) i) + 0.5f) * strokeWidth);
                path.moveTo(f3, MapboxConstants.MINIMUM_ZOOM);
                path.lineTo(f3, height);
                i = i2;
            }
            int i3 = 0;
            while (i3 < 2) {
                int i4 = i3 + 1;
                float f4 = (((float) i4) * f) + ((((float) i3) + 0.5f) * strokeWidth);
                path.moveTo(MapboxConstants.MINIMUM_ZOOM, f4);
                path.lineTo(width, f4);
                i3 = i4;
            }
            this.f = path;
        }
        a(this.f, canvas);
        if (!this.e) {
            if (this.a == null) {
                strokeWidth = this.h.getStrokeWidth();
                width = (float) getWidth();
                f = 0.0666f * width;
                f2 = 0.15733f * width;
                height = ((float) getHeight()) / 2.0f;
                width = (width - f2) / 2.0f;
                f2 += width;
                path = new Path();
                strokeWidth /= 2.0f;
                path.moveTo(width + strokeWidth, height);
                path.lineTo((width - strokeWidth) - f, height);
                path.moveTo(f2 - strokeWidth, height);
                path.lineTo((f2 + strokeWidth) + f, height);
                this.a = path;
            }
            if (this.d) {
                if (this.c) {
                    Path path2 = this.a;
                    canvas.drawPath(path2, this.h);
                    int color = this.g.getColor();
                    this.g.setColor(this.i);
                    canvas.drawPath(path2, this.g);
                    this.g.setColor(color);
                    if (!this.j && this.k) {
                        performHapticFeedback(0, 2);
                        return;
                    }
                }
                a(this.a, canvas);
            }
        }
    }

    public void setHapticFeedbackEnabled(boolean z) {
        this.k = z;
    }
}
