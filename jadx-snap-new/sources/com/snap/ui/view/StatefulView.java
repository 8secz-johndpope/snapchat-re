package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ajxe;
import defpackage.akco;
import defpackage.akcr;
import java.util.HashMap;

public class StatefulView extends FrameLayout {
    private Integer currentState;
    private final HashMap<Integer, ajxe<View>> stateMap;

    public StatefulView(Context context) {
        this(context, null, 2, null);
    }

    public StatefulView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.stateMap = new HashMap();
    }

    public /* synthetic */ StatefulView(Context context, AttributeSet attributeSet, int i, akco akco) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private final void setCurrentState(Integer num) {
        this.currentState = num;
    }

    public final void addState(int i, ajxe<? extends View> ajxe) {
        akcr.b(ajxe, "lazyView");
        this.stateMap.put(Integer.valueOf(i), ajxe);
        if (this.currentState == null) {
            setState(i);
        }
    }

    public final Integer getCurrentState() {
        return this.currentState;
    }

    public final void setState(int i) {
        Integer num = this.currentState;
        if (num == null || num.intValue() != i) {
            Object obj = this.stateMap.get(Integer.valueOf(i));
            if (obj != null) {
                View view = (View) ((ajxe) obj).b();
                addView(view);
                if (getChildCount() > 1) {
                    removeViewAt(0);
                }
                this.currentState = Integer.valueOf(i);
                setEnabled(view.isEnabled());
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
