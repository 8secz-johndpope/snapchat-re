package com.snapchat.android.framework.ui.actionmenu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abts;
import defpackage.abtt;
import defpackage.abtu;
import java.util.List;

public class ActionMenuOptionsContainerView extends FrameLayout {
    private static final int a = Color.parseColor("#DEDEDE");
    private final Path b;
    private final int c;
    private final int d;
    private final LinearLayout e;
    private List<? extends abtt> f;

    public ActionMenuOptionsContainerView(Context context) {
        this(context, null);
    }

    public ActionMenuOptionsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ActionMenuOptionsContainerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.b = new Path();
        this.c = getResources().getDimensionPixelOffset(R.dimen.action_menu_round_corner_radius);
        this.d = getResources().getDimensionPixelOffset(R.dimen.action_menu_option_button_separator_height);
        setLayoutDirection(3);
        this.e = new LinearLayout(getContext());
        this.e.setMotionEventSplittingEnabled(false);
        this.e.setOrientation(1);
        this.e.setLayoutParams(new LayoutParams(-1, -2));
        addView(this.e);
    }

    public static int a(Context context, int i) {
        if (i <= 0) {
            return 0;
        }
        return 0 + ((context.getResources().getDimensionPixelOffset(R.dimen.action_menu_option_button_height) * i) + (context.getResources().getDimensionPixelOffset(R.dimen.action_menu_option_button_separator_height) * (i - 1)));
    }

    private void a(List<? extends abtt> list) {
        if (list != this.f) {
            this.f = list;
            this.e.removeAllViews();
            for (abtt abtt : list) {
                if (this.e.getChildCount() > 0) {
                    View view = new View(getContext());
                    view.setLayoutParams(new LayoutParams(-1, this.d));
                    view.setBackgroundColor(a);
                    this.e.addView(view);
                }
                abtu abtu = (abtu) LayoutInflater.from(getContext()).inflate(abtt.a(), this, false);
                abtu.a(abtt);
                abtu.setOnClickListener(abtt.d);
                this.e.addView(abtu);
            }
        }
    }

    public final void a(abts abts) {
        a(abts.a);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b.reset();
        Path path = this.b;
        RectF rectF = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) i, (float) i2);
        i = this.c;
        path.addRoundRect(rectF, (float) i, (float) i, Direction.CW);
    }
}
