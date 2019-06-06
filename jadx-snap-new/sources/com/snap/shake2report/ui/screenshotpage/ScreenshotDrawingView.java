package com.snap.shake2report.ui.screenshotpage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akcr;
import defpackage.jwj;
import defpackage.kaz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ScreenshotDrawingView extends View {
    kaz<jwj> a;
    Canvas b;
    Paint c;
    private Path d;
    private final Paint e;
    private final List<Path> f;
    private float g;
    private float h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ScreenshotDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ScreenshotDrawingView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.e = new Paint(4);
        this.f = new ArrayList();
    }

    public final boolean a() {
        return !((Collection) this.f).isEmpty();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
        }
        for (Path path : this.f) {
            Canvas canvas2 = this.b;
            if (canvas2 == null) {
                akcr.a("canvas");
            }
            Paint paint = this.c;
            if (paint == null) {
                akcr.a("paint");
            }
            canvas2.drawPath(path, paint);
        }
        kaz kaz = this.a;
        String str = "bitmapRef";
        if (kaz == null) {
            akcr.a(str);
        }
        if (!(kaz.isDisposed() || canvas == null)) {
            kaz = this.a;
            if (kaz == null) {
                akcr.a(str);
            }
            Object a = kaz.a();
            akcr.a(a, "bitmapRef.get()");
            canvas.drawBitmap(((jwj) a).a(), MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.e);
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        float y;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        String str = "currentDrawPath";
        Path path;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (motionEvent == null) {
                akcr.a();
            }
            x = motionEvent.getX();
            y = motionEvent.getY();
            this.d = new Path();
            List list = this.f;
            Path path2 = this.d;
            if (path2 == null) {
                akcr.a(str);
            }
            list.add(path2);
            path = this.d;
            if (path == null) {
                akcr.a(str);
            }
            path.moveTo(x, y);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (motionEvent == null) {
                akcr.a();
            }
            x = motionEvent.getX();
            y = motionEvent.getY();
            float abs = Math.abs(x - this.g);
            float abs2 = Math.abs(y - this.h);
            if (abs > 4.0f || abs2 > 4.0f) {
                path = this.d;
                if (path == null) {
                    akcr.a(str);
                }
                float f = this.g;
                abs2 = this.h;
                path.quadTo(f, abs2, (x + f) / 2.0f, (y + abs2) / 2.0f);
            }
            invalidate();
            return true;
        } else {
            if (valueOf != null && valueOf.intValue() == 1) {
                Path path3 = this.d;
                if (path3 == null) {
                    akcr.a(str);
                }
                path3.lineTo(this.g, this.h);
                invalidate();
            }
            return true;
        }
        this.g = x;
        this.h = y;
        invalidate();
        return true;
    }
}
