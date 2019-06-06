package com.snap.ui.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajdx;
import defpackage.ajea;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.ajzg;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akef;
import defpackage.awt;
import defpackage.axa;
import defpackage.dfd;
import defpackage.idl;
import defpackage.in;
import defpackage.zjx;
import defpackage.zkb.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AvatarDrawable extends awt {
    private static final Paint CLIPPING_PAINT;
    public static final Companion Companion = new Companion();
    private static final Paint LAYER_PAINT;
    private List<Avatar> avatars = ajyw.a;
    private int avatarsLoaded;
    private Path clipPath = new Path();
    private final dfd[] drawables;
    private boolean eatResizeRequest;
    private b loadCompleteCallback;
    private final AvatarDrawable$loadingStateListener$1 loadingStateListener;
    private final axa[] matrixDrawables;
    private final idl uiPage;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ajdx<AvatarDrawable> create(Context context, int i, idl idl, List<Avatar> list) {
            akcr.b(context, "context");
            akcr.b(idl, "uiPage");
            akcr.b(list, "infos");
            Object a = ajdx.a((ajea) new AvatarDrawable$Companion$create$1(context, idl, i, list));
            akcr.a(a, "Single.create { emitter …          }\n            }");
            return a;
        }
    }

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        CLIPPING_PAINT = paint;
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        LAYER_PAINT = paint;
    }

    public AvatarDrawable(Context context, idl idl) {
        akcr.b(context, "context");
        akcr.b(idl, "uiPage");
        super(new Drawable[]{zjx.a, zjx.a, zjx.a});
        this.uiPage = idl;
        this.drawables = new dfd[]{new dfd(context), new dfd(context), new dfd(context)};
        this.matrixDrawables = new axa[]{new axa(this.drawables[0], new Matrix()), new axa(this.drawables[1], new Matrix()), new axa(this.drawables[2], new Matrix())};
        this.loadingStateListener = new AvatarDrawable$loadingStateListener$1(this);
    }

    public static final ajdx<AvatarDrawable> create(Context context, int i, idl idl, List<Avatar> list) {
        return Companion.create(context, i, idl, list);
    }

    private final void resetClippingPath() {
        this.clipPath.reset();
        Rect bounds = getBounds();
        float centerX = (float) bounds.centerX();
        float centerY = (float) bounds.centerY();
        float min = Math.min(centerX, centerY);
        this.clipPath.addRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, Direction.CW);
        this.clipPath.addCircle(centerX, centerY, min, Direction.CCW);
    }

    private final void setUserInfo(List<Avatar> list, b bVar) {
        this.loadCompleteCallback = bVar;
        this.avatarsLoaded = 0;
        Object obj = this.avatars;
        this.avatars = list;
        if (!akcr.a(obj, this.avatars)) {
            Iterator it = akef.a(0, this.drawables.length).iterator();
            while (it.hasNext()) {
                int a = ((ajzg) it).a();
                if (a >= list.size() || (1 ^ akcr.a((Avatar) list.get(a), (Avatar) ajyu.a((List) obj, a))) != 0) {
                    this.drawables[a].b();
                    setDrawable(a, zjx.a);
                }
            }
            this.eatResizeRequest = true;
            Iterable iterable = this.avatars;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                Avatar avatar = (Avatar) next;
                dfd[] dfdArr = this.drawables;
                int length = (dfdArr.length - i) - 1;
                dfd dfd = dfdArr[length];
                dfd.a = this.loadingStateListener;
                dfd.a(this.uiPage, avatar.getBitmojiUri(), avatar.getUsername(), avatar.getFallbackColor());
                arrayList.add(setDrawable(length, this.matrixDrawables[length]));
                i = i2;
            }
            updateDrawablePositions();
            this.eatResizeRequest = false;
        }
    }

    private final void updateDrawablePositions() {
        AvatarDrawable avatarDrawable = this;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0) {
            float f = (float) width;
            float f2 = f / 2.0f;
            float f3 = (float) bounds.bottom;
            resetClippingPath();
            int size = avatarDrawable.avatars.size();
            Iterable iterable = avatarDrawable.avatars;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            Iterator it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                float f4;
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                dfd[] dfdArr = avatarDrawable.drawables;
                int length = (dfdArr.length - i) - 1;
                dfd dfd = dfdArr[length];
                Matrix b = avatarDrawable.matrixDrawables[length].b();
                b.reset();
                float f5 = (float) height;
                b.setRectToRect(new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) dfd.getIntrinsicWidth(), (float) dfd.getIntrinsicHeight()), new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, f5), ScaleToFit.CENTER);
                Object obj = i == 0 ? 1 : null;
                int i3 = obj != null ? 255 : 76;
                float f6 = size == 1 ? 1.0f : obj != null ? 0.97f : 0.85f;
                dfd.setAlpha(i3);
                b.preScale(f6, f6, f2, f3);
                if (size != 1) {
                    float f7;
                    if (size != 2) {
                        if (size == 3) {
                            if (i == 0) {
                                f5 *= 0.06f;
                                f4 = MapboxConstants.MINIMUM_ZOOM;
                            } else if (i == 1) {
                                b.postTranslate((((float) (-width)) * 0.64f) / 2.0f, f5 * 0.06f);
                                arrayList.add(ajxw.a);
                                avatarDrawable = this;
                                i = i2;
                            } else if (i == 2) {
                                f4 = 0.64f * f;
                                f7 = 2.0f;
                            }
                        }
                        arrayList.add(ajxw.a);
                        avatarDrawable = this;
                        i = i2;
                    } else {
                        f7 = 2.0f;
                        if (obj != null) {
                            f4 = ((0.29300004f * f) / 2.0f) * 0.92999995f;
                            f5 *= 0.06f;
                        } else {
                            f4 = ((float) (-width)) * 0.41900003f;
                        }
                    }
                    f4 /= f7;
                    f5 *= 0.06f;
                } else {
                    f4 = MapboxConstants.MINIMUM_ZOOM;
                    f5 *= MapboxConstants.MINIMUM_ZOOM;
                }
                b.postTranslate(f4, f5);
                arrayList.add(ajxw.a);
                avatarDrawable = this;
                i = i2;
            }
        }
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        in.a("");
        try {
            if (!this.avatars.isEmpty()) {
                Rect bounds = getBounds();
                int saveLayer = canvas.saveLayer((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, LAYER_PAINT, 31);
                super.draw(canvas);
                canvas.drawPath(this.clipPath, CLIPPING_PAINT);
                canvas.restoreToCount(saveLayer);
            }
            in.a();
        } catch (Throwable th) {
            in.a();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        akcr.b(rect, "bounds");
        super.onBoundsChange(rect);
        updateDrawablePositions();
    }

    public final void setUserInfo(List<Avatar> list) {
        akcr.b(list, "infos");
        setUserInfo(list, null);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AvatarDrawable[");
        Iterable<Avatar> iterable = this.avatars;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Avatar username : iterable) {
            arrayList.add(username.getUsername());
        }
        stringBuilder.append(ajyu.a((Iterable) (List) arrayList, null, null, null, 0, null, null, 63));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
