package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abwg */
public final class abwg implements abvv, abww {
    public akbk<Float> a = a.a;
    private akbk<Float> b = b.a;

    /* renamed from: abwg$a */
    static final class a extends akcs implements akbk<Float> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    /* renamed from: abwg$b */
    static final class b extends akcs implements akbk<Float> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void a(akbk<Float> akbk) {
        akcr.b(akbk, "<set-?>");
        this.a = akbk;
    }

    public final void a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        motionEvent.offsetLocation(-((Number) this.a.invoke()).floatValue(), -((Number) this.b.invoke()).floatValue());
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        canvas.save();
        canvas.translate(((Number) this.a.invoke()).floatValue(), ((Number) this.b.invoke()).floatValue());
    }

    public final void b(akbk<Float> akbk) {
        akcr.b(akbk, "<set-?>");
        this.b = akbk;
    }

    public final void b(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        motionEvent.offsetLocation(((Number) this.a.invoke()).floatValue(), ((Number) this.b.invoke()).floatValue());
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        canvas.restore();
    }
}
