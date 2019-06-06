package com.snap.stickers.ui.views.infosticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.ajxm;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.xsv;
import defpackage.xws;
import defpackage.ybi;
import defpackage.zfw;

public final class InfoStickerView extends FrameLayout {
    public ybi<InfoStickerView> a;

    public InfoStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private InfoStickerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final void a(xws xws, zfw zfw) {
        akcr.b(xws, "sticker");
        akcr.b(zfw, "schedulers");
        ajxm a = xsv.a(xws.d.c(), zfw);
        if (a != null) {
            ybi ybi = (ybi) ((akbl) a.b).invoke(xws.d);
            ybi.takeTarget(this);
            this.a = ybi;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        return true;
    }
}
