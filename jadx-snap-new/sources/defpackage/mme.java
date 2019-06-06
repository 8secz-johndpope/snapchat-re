package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.touch.TouchConverter;
import defpackage.mmh.a.a;

/* renamed from: mme */
final class mme extends SimpleOnGestureListener {
    private final mkx a;
    private final TouchConverter<Object> b;
    private final mmh c;

    /* renamed from: mme$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ float[] a;

        a(float[] fArr) {
            this.a = fArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            float[] fArr = this.a;
            lSCoreManagerWrapper.processTapGesture(0, fArr[0], fArr[1]);
            return ajxw.a;
        }
    }

    public mme(mkx mkx, TouchConverter<Object> touchConverter, mmh mmh) {
        akcr.b(mkx, "lensCore");
        akcr.b(touchConverter, "touchConverter");
        akcr.b(mmh, "fallbackGestureHandler");
        this.a = mkx;
        this.b = touchConverter;
        this.c = mmh;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        akcr.b(motionEvent, "e");
        Boolean bool = null;
        float[] normalizePosition = this.b.normalizePosition(null, motionEvent.getX(), motionEvent.getY());
        mkx mkx = this.a;
        boolean z = true;
        if ((mkx.isDisposed() ^ 1) != 0) {
            LSCoreManagerWrapper lSCoreManagerWrapper = ((mpn) mkx.a.b()).b;
            if (!lSCoreManagerWrapper.shouldBlockTouch(normalizePosition[0], normalizePosition[1], 0) || lSCoreManagerWrapper.shouldBlockTouch(normalizePosition[0], normalizePosition[1], 4)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return bool != null ? bool.booleanValue() : false ? this.c.a(a.a) : false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        akcr.b(motionEvent, "e");
        this.a.b(new a(this.b.normalizePosition(null, motionEvent.getX(), motionEvent.getY())));
        return true;
    }
}
