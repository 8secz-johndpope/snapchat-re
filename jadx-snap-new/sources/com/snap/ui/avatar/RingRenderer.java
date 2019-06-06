package com.snap.ui.avatar;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.View;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.snapchat.android.R;
import defpackage.akco;
import defpackage.akcr;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public final class RingRenderer {
    private static final Paint CLIPPING_PAINT;
    private static final ConcurrentMap<RectF, Path> CLIP_PATH_MAP = new MapMaker().weakValues().makeMap();
    public static final Companion Companion = new Companion();
    private static final int INVALID_COLOR = Integer.MIN_VALUE;
    private static final RingRenderer$Companion$LAYER_PAINT$1 LAYER_PAINT = new RingRenderer$Companion$LAYER_PAINT$1();
    private static final ConcurrentMap<RingPaintProperties, Paint> RING_PAINT_MAP = new MapMaker().weakValues().makeMap();
    private static final Style defaultStyle = Style.STROKE;
    private Path clipPath = new Path();
    private RingPaintProperties currentPaintProperties;
    private RingPaintProperties defaultPaintProperties;
    private LinearGradient gradient;
    private final EnumMap<State, RingColor> ringColorStateMap = Maps.newEnumMap(State.class);
    private Paint ringPaint;
    private final SharedRenderData sharedRenderData;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        CLIPPING_PAINT = paint;
    }

    public RingRenderer(SharedRenderData sharedRenderData) {
        akcr.b(sharedRenderData, "sharedRenderData");
        this.sharedRenderData = sharedRenderData;
    }

    private final void setRingPaint() {
        RingPaintProperties ringPaintProperties = this.currentPaintProperties;
        String str = "currentPaintProperties";
        if (ringPaintProperties == null) {
            akcr.a(str);
        }
        Paint paint = (Paint) RING_PAINT_MAP.get(ringPaintProperties);
        if (paint == null) {
            paint = new Paint(1);
            paint.setStyle(ringPaintProperties.getStyle());
            paint.setStrokeWidth(ringPaintProperties.getStrokeWidth());
            LinearGradient linearGradient = this.gradient;
            if (linearGradient == null) {
                float f = this.sharedRenderData.getDrawRectF().left;
                float f2 = this.sharedRenderData.getDrawRectF().top;
                float f3 = this.sharedRenderData.getDrawRectF().left;
                float f4 = this.sharedRenderData.getDrawRectF().bottom;
                RingPaintProperties ringPaintProperties2 = this.currentPaintProperties;
                if (ringPaintProperties2 == null) {
                    akcr.a(str);
                }
                int startColor = ringPaintProperties2.getRingColor().getStartColor();
                ringPaintProperties2 = this.currentPaintProperties;
                if (ringPaintProperties2 == null) {
                    akcr.a(str);
                }
                LinearGradient linearGradient2 = new LinearGradient(f, f2, f3, f4, startColor, ringPaintProperties2.getRingColor().getEndColor(), TileMode.CLAMP);
                this.gradient = linearGradient2;
            }
            paint.setShader(linearGradient);
            Object obj = RING_PAINT_MAP;
            akcr.a(obj, "RING_PAINT_MAP");
            ((Map) obj).put(ringPaintProperties, paint);
        }
        this.ringPaint = paint;
    }

    public final void dispatchDraw(AvatarView avatarView, Canvas canvas, State state) {
        akcr.b(avatarView, "view");
        akcr.b(canvas, "canvas");
        akcr.b(state, "currentState");
        Object obj = 1;
        Object obj2 = (avatarView.isHardwareAccelerated() && avatarView.getLayerType() == 2) ? 1 : null;
        int saveLayer = obj2 == null ? canvas.saveLayer(this.sharedRenderData.getDrawRectF(), LAYER_PAINT, 31) : 0;
        avatarView.superDispatchDraw$shared_ui_release(canvas);
        if (this.ringColorStateMap.get(state) == null) {
            obj = null;
        }
        if (obj != null) {
            float min = Math.min(this.sharedRenderData.getDrawRectF().centerX(), this.sharedRenderData.getDrawRectF().centerY()) - ((float) (this.sharedRenderData.avatarPadding() / 2));
            float centerX = this.sharedRenderData.getDrawRectF().centerX();
            float centerY = this.sharedRenderData.getDrawRectF().centerY();
            Paint paint = this.ringPaint;
            if (paint == null) {
                akcr.a("ringPaint");
            }
            canvas.drawCircle(centerX, centerY, min, paint);
        } else {
            canvas.drawPath(this.clipPath, CLIPPING_PAINT);
        }
        if (obj2 == null) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final void onAttachedToWindow(View view) {
        String str = "view";
        akcr.b(view, str);
        akcr.b(view, str);
        if (!akcr.a(Build.MANUFACTURER, (Object) "samsung") || VERSION.SDK_INT < 21 || VERSION.SDK_INT > 22) {
            view.setLayerType(2, null);
        }
    }

    public final void resetPathsAndPaints() {
        float centerX = this.sharedRenderData.getDrawRectF().centerX();
        float centerY = this.sharedRenderData.getDrawRectF().centerY();
        Path path = (Path) CLIP_PATH_MAP.get(this.sharedRenderData.getDrawRectF());
        if (path == null) {
            this.clipPath.reset();
            float min = (float) (((int) Math.min(centerX, centerY)) - this.sharedRenderData.imagePadding());
            this.clipPath.addRect(this.sharedRenderData.getDrawRectF(), Direction.CW);
            this.clipPath.addCircle(centerX, centerY, min, Direction.CCW);
            Object obj = CLIP_PATH_MAP;
            akcr.a(obj, "CLIP_PATH_MAP");
            ((Map) obj).put(this.sharedRenderData.getDrawRectF(), this.clipPath);
        } else {
            this.clipPath = path;
        }
        setRingPaint();
    }

    public final void setAttributes(TypedArray typedArray) {
        Object obj;
        akcr.b(typedArray, "customAttrs");
        int color = typedArray.getColor(10, Integer.MIN_VALUE);
        int color2 = this.sharedRenderData.getResources().getColor(R.color.blue_ring_start);
        int color3 = this.sharedRenderData.getResources().getColor(R.color.blue_ring_end);
        int color4 = typedArray.getColor(7, color2);
        int color5 = typedArray.getColor(6, color3);
        String str = "ringColorStateMap";
        if (color != Integer.MIN_VALUE) {
            obj = this.ringColorStateMap;
            akcr.a(obj, str);
            ((Map) obj).put(State.REPLAY_STORY, new RingColor(color, color));
        }
        int color6 = this.sharedRenderData.getResources().getColor(R.color.regular_red);
        int color7 = typedArray.getColor(2, this.sharedRenderData.getResources().getColor(R.color.grey_ring));
        Object obj2 = this.ringColorStateMap;
        akcr.a(obj2, str);
        ((Map) obj2).put(State.FAILED_STORY, new RingColor(color6, color6));
        obj = this.ringColorStateMap;
        akcr.a(obj, str);
        ((Map) obj).put(State.UNREAD_STORY, new RingColor(color4, color5));
        obj = this.ringColorStateMap;
        akcr.a(obj, str);
        ((Map) obj).put(State.EMPTY_STORY, new RingColor(color7, color7));
        this.defaultPaintProperties = new RingPaintProperties(defaultStyle, (float) this.sharedRenderData.avatarPadding(), new RingColor(color2, color3));
        RingPaintProperties ringPaintProperties = this.defaultPaintProperties;
        if (ringPaintProperties == null) {
            akcr.a("defaultPaintProperties");
        }
        this.currentPaintProperties = ringPaintProperties;
    }

    public final void setToColor(State state) {
        akcr.b(state, "newState");
        Style style = defaultStyle;
        float avatarPadding = (float) this.sharedRenderData.avatarPadding();
        RingColor ringColor = (RingColor) this.ringColorStateMap.get(state);
        if (ringColor == null) {
            RingPaintProperties ringPaintProperties = this.defaultPaintProperties;
            if (ringPaintProperties == null) {
                akcr.a("defaultPaintProperties");
            }
            ringColor = ringPaintProperties.getRingColor();
        }
        this.currentPaintProperties = new RingPaintProperties(style, avatarPadding, ringColor);
        this.gradient = null;
        setRingPaint();
    }
}
