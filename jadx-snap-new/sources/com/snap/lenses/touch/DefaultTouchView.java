package com.snap.lenses.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.ajxk;
import defpackage.ajxt;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.nab;
import defpackage.nab.a.b;

public final class DefaultTouchView extends View implements nab {

    static final class a implements OnTouchListener {
        private /* synthetic */ defpackage.nab.a a;

        a(defpackage.nab.a aVar) {
            this.a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            akbw akbw = ((b) this.a).a;
            akcr.a((Object) view, "v");
            akcr.a((Object) motionEvent, "event");
            return ((Boolean) akbw.invoke(view, motionEvent)).booleanValue();
        }
    }

    public DefaultTouchView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultTouchView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.nab.a aVar = (defpackage.nab.a) obj;
        akcr.b(aVar, MapboxEvent.KEY_MODEL);
        boolean z = true;
        Object obj2 = null;
        if (aVar instanceof defpackage.nab.a.a) {
            setOnTouchListener(null);
            z = false;
        } else if (aVar instanceof b) {
            setOnTouchListener(new a(aVar));
            if (getHeight() != 0 && ((double) (((float) getWidth()) / ((float) getHeight()))) < 0.5625d) {
                obj2 = 1;
            }
            if (obj2 != null) {
                LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    b bVar = (b) aVar;
                    if (marginLayoutParams.bottomMargin != bVar.b.d) {
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, bVar.b.d);
                    }
                    setLayoutParams(marginLayoutParams);
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        } else {
            throw new ajxk();
        }
        setEnabled(z);
    }
}
