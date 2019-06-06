package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abwb */
public final class abwb implements abvv {
    public akbk<Float> a;
    private final LinearGradient b;
    private final Paint c;
    private final float d;
    private final a e;

    /* renamed from: abwb$a */
    public enum a {
        TOP_EDGE,
        RIGHT_EDGE,
        BOTTOM_EDGE,
        LEFT_EDGE
    }

    /* renamed from: abwb$b */
    public enum b {
        VERTICAL,
        HORIZONTAL
    }

    public abwb(float f, int i, int i2, b bVar, a aVar) {
        float f2;
        float f3;
        akcr.b(bVar, "orientation");
        akcr.b(aVar, "attachTo");
        this.d = f;
        this.e = aVar;
        int i3 = abwc.a[bVar.ordinal()];
        if (i3 == 1) {
            f2 = MapboxConstants.MINIMUM_ZOOM;
        } else if (i3 == 2) {
            f2 = this.d;
        } else {
            throw new ajxk();
        }
        int i4 = abwc.b[bVar.ordinal()];
        if (i4 == 1) {
            f3 = this.d;
        } else if (i4 == 2) {
            f3 = MapboxConstants.MINIMUM_ZOOM;
        } else {
            throw new ajxk();
        }
        this.b = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f2, f3, i, i2, TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(this.b);
        this.c = paint;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    public final void a(android.view.View r9, android.graphics.Canvas r10, defpackage.abxs r11) {
        /*
        r8 = this;
        r0 = "view";
        defpackage.akcr.b(r9, r0);
        r0 = "canvas";
        defpackage.akcr.b(r10, r0);
        r0 = "dimensions";
        defpackage.akcr.b(r11, r0);
        r0 = r8.a;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r0 == 0) goto L_0x0022;
    L_0x0015:
        r0 = r0.invoke();
        r0 = (java.lang.Float) r0;
        if (r0 == 0) goto L_0x0022;
    L_0x001d:
        r0 = r0.floatValue();
        goto L_0x0024;
    L_0x0022:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0024:
        r2 = r8.c;
        r3 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r0 = r0 * r3;
        r0 = (int) r0;
        r2.setAlpha(r0);
        r0 = r8.e;
        r2 = defpackage.abwc.c;
        r0 = r0.ordinal();
        r0 = r2[r0];
        r2 = 1;
        if (r0 == r2) goto L_0x008f;
    L_0x003a:
        r2 = 2;
        if (r0 == r2) goto L_0x007a;
    L_0x003d:
        r2 = 3;
        if (r0 == r2) goto L_0x0052;
    L_0x0040:
        r1 = 4;
        if (r0 == r1) goto L_0x0044;
    L_0x0043:
        goto L_0x0051;
    L_0x0044:
        r1 = 0;
        r2 = 0;
        r3 = r8.d;
        r0 = r11.b;
        r4 = (float) r0;
        r5 = r8.c;
        r0 = r10;
        r0.drawRect(r1, r2, r3, r4, r5);
    L_0x0051:
        return;
    L_0x0052:
        r0 = r11.b;
        r0 = (float) r0;
        r2 = r8.d;
        r0 = r0 - r2;
        r6 = 0;
        r10.translate(r6, r0);
        r2 = 0;
        r3 = 0;
        r0 = r11.a;
        r4 = (float) r0;
        r0 = r8.d;
        r5 = r0 + r1;
        r7 = r8.c;
        r0 = r10;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r7;
        r0.drawRect(r1, r2, r3, r4, r5);
        r0 = r8.d;
        r1 = r11.b;
        r1 = (float) r1;
        r0 = r0 - r1;
        r10.translate(r6, r0);
        return;
    L_0x007a:
        r0 = r11.a;
        r0 = (float) r0;
        r1 = r8.d;
        r1 = r0 - r1;
        r2 = 0;
        r0 = r11.a;
        r3 = (float) r0;
        r0 = r11.b;
        r4 = (float) r0;
        r5 = r8.c;
        r0 = r10;
        r0.drawRect(r1, r2, r3, r4, r5);
        return;
    L_0x008f:
        r1 = 0;
        r2 = 0;
        r0 = r11.a;
        r3 = (float) r0;
        r4 = r8.d;
        r5 = r8.c;
        r0 = r10;
        r0.drawRect(r1, r2, r3, r4, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwb.a(android.view.View, android.graphics.Canvas, abxs):void");
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
    }
}
