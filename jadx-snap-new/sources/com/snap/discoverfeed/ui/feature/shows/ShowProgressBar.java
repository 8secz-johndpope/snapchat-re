package com.snap.discoverfeed.ui.feature.shows;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.RoundedFrameLayout;
import defpackage.akcr;

public final class ShowProgressBar extends RoundedFrameLayout {
    private final boolean a;
    private int b;
    private final Paint c;

    public ShowProgressBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private ShowProgressBar(Context context, AttributeSet attributeSet, byte b) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet, 0);
        Object resources = getResources();
        akcr.a(resources, "resources");
        resources = resources.getConfiguration();
        akcr.a(resources, "resources.configuration");
        boolean z = true;
        if (resources.getLayoutDirection() != 1) {
            z = false;
        }
        this.a = z;
        this.b = 100;
        this.c = new Paint();
        resources = getContext();
        akcr.a(resources, str);
        setBackgroundColor(resources.getResources().getColor(R.color.white));
        this.c.setColor(getResources().getColor(R.color.regular_purple));
    }

    public final void a(int i) {
        Object obj = 1;
        if (1 > i || 100 < i) {
            obj = null;
        }
        if (obj != null) {
            this.b = i;
            invalidate();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (this.a) {
            canvas.drawRect(((float) getWidth()) * (1.0f - (((float) this.b) / 100.0f)), MapboxConstants.MINIMUM_ZOOM, (float) getWidth(), (float) getHeight(), this.c);
        } else {
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, ((float) (getWidth() * this.b)) / 100.0f, (float) getHeight(), this.c);
        }
    }
}
