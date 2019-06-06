package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.achu.a;

/* renamed from: achs */
public final class achs extends achp<achw> implements a, achx {
    private achr d = achr.PINCH_OUT;
    private final View e;

    /* renamed from: achs$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public achs(achp.a aVar, View view) {
        akcr.b(aVar, "delegate");
        akcr.b(view, "view");
        super(new achu(view), new achw(), aVar);
        this.e = view;
        achn achn = this.a;
        if (achn != null) {
            achu achu = (achu) achn;
            a aVar2 = this;
            akcr.b(aVar2, "<set-?>");
            achu.b = aVar2;
            acho acho = this.b;
            if (acho != null) {
                achw achw = (achw) acho;
                achx achx = this;
                achw.b = achx;
                achw.a = new achy(achx);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type com.snapchat.deck.gestures.PinchSettler");
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.deck.gestures.PinchDetector");
    }

    private static float c(achr achr, float f) {
        int i = acht.a[achr.ordinal()];
        float f2 = i != 1 ? i != 2 ? MapboxConstants.MINIMUM_ZOOM : (f - 1.01f) / -0.89f : 0.99f - f;
        return abpf.a(f2, (float) MapboxConstants.MINIMUM_ZOOM, 1.0f);
    }

    public final void a(float f) {
        this.c.a(f);
    }

    public final void a(achr achr, float f) {
        akcr.b(achr, MapboxEvent.KEY_GESTURE_ID);
        this.c.a(achr, achs.c(achr, f), achj.DRAGGING);
    }

    public final boolean a() {
        achn achn = this.a;
        if (achn != null) {
            if (((achu) achn).a == null) {
                Object obj = this.b;
                akcr.a(obj, "mSettler");
                if (!((achw) obj).a()) {
                    return true;
                }
            }
            return false;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.deck.gestures.PinchDetector");
    }

    public final boolean a(achr achr) {
        akcr.b(achr, MapboxEvent.KEY_GESTURE_ID);
        if (!this.c.a(achr)) {
            c(achr);
            return false;
        } else if (!a()) {
            return false;
        } else {
            this.c.a(achr, MapboxConstants.MINIMUM_ZOOM, achj.DRAGGING);
            return true;
        }
    }

    public final boolean a(achz achz) {
        akcr.b(achz, "programmaticInputGesture");
        achr a = achz.a();
        Object obj = this.b;
        akcr.a(obj, "mSettler");
        String str = "animator";
        if (((achw) obj).a()) {
            achy achy = ((achw) this.b).a;
            if (achy == null) {
                akcr.a(str);
            }
            achy.cancel();
        }
        if (a != achr.PINCH_IN && a != achr.PINCH_OUT) {
            return false;
        }
        this.d = a;
        achw achw = (achw) this.b;
        akcr.b(achz, MapboxEvent.KEY_GESTURE_ID);
        achy achy2 = achw.a;
        if (achy2 == null) {
            akcr.a(str);
        }
        achy2.cancel();
        achy2.setFloatValues(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        achy2.setDuration(300);
        achy2.start();
        return true;
    }

    public final boolean a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        return this.a.a(motionEvent);
    }

    public final void b(float f) {
        this.c.a(this.d, f, achj.SETTLING_TO_DESTINATION);
    }

    public final void b(achr achr) {
        akcr.b(achr, MapboxEvent.KEY_GESTURE_ID);
        this.c.a((float) MapboxConstants.MINIMUM_ZOOM);
    }

    public final void b(achr achr, float f) {
        String str = MapboxEvent.KEY_GESTURE_ID;
        akcr.b(achr, str);
        this.d = achr;
        f = achs.c(achr, f);
        achw achw = (achw) this.b;
        akcr.b(achr, str);
        ajxm a = f < 0.015f ? ajxs.a(Float.valueOf(f), Float.valueOf(MapboxConstants.MINIMUM_ZOOM)) : ajxs.a(Float.valueOf(1.0f - f), Float.valueOf(1.0f));
        float floatValue = ((Number) a.a).floatValue();
        float floatValue2 = ((Number) a.b).floatValue();
        achy achy = achw.a;
        if (achy == null) {
            akcr.a("animator");
        }
        achy.cancel();
        achy.setFloatValues(new float[]{f, floatValue2});
        achy.setDuration((long) (floatValue * 700.0f));
        achy.start();
    }

    public final void c(achr achr) {
        akcr.b(achr, MapboxEvent.KEY_GESTURE_ID);
        this.c.b(achr);
    }

    public final boolean d(achr achr) {
        akcr.b(achr, MapboxEvent.KEY_GESTURE_ID);
        return this.c.a(achr);
    }
}
