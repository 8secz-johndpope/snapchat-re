package com.snap.composer.views;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajxk;
import defpackage.akcr;

public final class EdgeEffectWrapper {
    private EdgeEffect a;
    private float b;
    private boolean c;
    private boolean d = true;
    private int e;
    private int f;
    private final Context g;
    private final Edge h;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Edge.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Edge.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$0[Edge.TOP.ordinal()] = 2;
            $EnumSwitchMapping$0[Edge.RIGHT.ordinal()] = 3;
            $EnumSwitchMapping$0[Edge.BOTTOM.ordinal()] = 4;
            iArr = new int[Edge.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[Edge.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$1[Edge.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$1[Edge.TOP.ordinal()] = 3;
            $EnumSwitchMapping$1[Edge.BOTTOM.ordinal()] = 4;
        }
    }

    public EdgeEffectWrapper(Context context, Edge edge) {
        akcr.b(context, "context");
        akcr.b(edge, "edge");
        this.g = context;
        this.h = edge;
    }

    private final EdgeEffect a() {
        EdgeEffect edgeEffect;
        if (this.a == null) {
            this.a = new EdgeEffect(this.g);
            edgeEffect = this.a;
            if (edgeEffect == null) {
                akcr.a();
            }
            edgeEffect.setSize(this.e, this.f);
        }
        edgeEffect = this.a;
        if (edgeEffect == null) {
            akcr.a();
        }
        return edgeEffect;
    }

    public final boolean draw(Canvas canvas, int i, int i2) {
        akcr.b(canvas, "canvas");
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect == null) {
            return false;
        }
        int save = canvas.save();
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.h.ordinal()];
        if (i3 == 1) {
            canvas.rotate(270.0f);
            canvas.translate(-((float) i2), MapboxConstants.MINIMUM_ZOOM);
        } else if (i3 != 2) {
            if (i3 == 3) {
                canvas.rotate(90.0f);
                canvas.translate(MapboxConstants.MINIMUM_ZOOM, -((float) i));
            } else if (i3 == 4) {
                canvas.rotate(180.0f);
                canvas.translate(-((float) i), -((float) i2));
            }
        }
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        if (!draw || edgeEffect.isFinished()) {
            finish();
        }
        return draw;
    }

    public final void finish() {
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.c = false;
        this.d = false;
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
    }

    public final boolean isFinished() {
        EdgeEffect edgeEffect = this.a;
        return edgeEffect != null ? edgeEffect.isFinished() : true;
    }

    public final void onAbsorb(int i) {
        if (this.c || this.d) {
            finish();
        }
        a().onAbsorb(Math.abs(i));
    }

    public final void onPull(float f, float f2) {
        if (!this.c) {
            finish();
            this.c = true;
        }
        float f3 = f - this.b;
        this.b = f;
        if (VERSION.SDK_INT >= 21) {
            if (this.h == Edge.LEFT || this.h == Edge.BOTTOM) {
                f2 = 1.0f - f2;
            }
            a().onPull(f3, f2);
            return;
        }
        a().onPull(f3);
    }

    public final void onRelease() {
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.c = false;
        this.d = true;
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
        }
    }

    public final void setSize(int i, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$1[this.h.ordinal()];
        if (i3 == 1 || i3 == 2) {
            int i4 = i2;
            i2 = i;
            i = i4;
        } else if (!(i3 == 3 || i3 == 4)) {
            throw new ajxk();
        }
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect != null) {
            edgeEffect.setSize(i, this.f);
        }
        this.e = i;
        this.f = i2;
    }
}
