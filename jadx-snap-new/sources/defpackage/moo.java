package defpackage;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.touch.TouchConverter;

/* renamed from: moo */
final class moo implements OnScaleGestureListener {
    float a;
    private final mkx b;
    private final TouchConverter<Object> c;

    /* renamed from: moo$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ moo a;
        private /* synthetic */ float[] b;

        a(moo moo, float[] fArr) {
            this.a = moo;
            this.b = fArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            float f = this.a.a;
            float[] fArr = this.b;
            lSCoreManagerWrapper.processPinchGesture(1, f, fArr[0], fArr[1]);
            return ajxw.a;
        }
    }

    /* renamed from: moo$b */
    static final class b extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ moo a;
        private /* synthetic */ float[] b;

        b(moo moo, float[] fArr) {
            this.a = moo;
            this.b = fArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            float f = this.a.a;
            float[] fArr = this.b;
            lSCoreManagerWrapper.processPinchGesture(0, f, fArr[0], fArr[1]);
            return ajxw.a;
        }
    }

    /* renamed from: moo$c */
    static final class c extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ moo a;
        private /* synthetic */ float[] b;

        c(moo moo, float[] fArr) {
            this.a = moo;
            this.b = fArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            float f = this.a.a;
            float[] fArr = this.b;
            lSCoreManagerWrapper.processPinchGesture(2, f, fArr[0], fArr[1]);
            return ajxw.a;
        }
    }

    public moo(mkx mkx, TouchConverter<Object> touchConverter) {
        akcr.b(mkx, "lensCore");
        akcr.b(touchConverter, "touchConverter");
        this.b = mkx;
        this.c = touchConverter;
    }

    private final float[] a(ScaleGestureDetector scaleGestureDetector) {
        Object normalizePosition = this.c.normalizePosition(null, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        akcr.a(normalizePosition, "touchConverter.normalize….focusX, detector.focusY)");
        return normalizePosition;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        this.a *= scaleGestureDetector.getScaleFactor();
        this.b.b(new a(this, a(scaleGestureDetector)));
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        this.a = 1.0f;
        this.b.b(new b(this, a(scaleGestureDetector)));
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        this.b.b(new c(this, a(scaleGestureDetector)));
    }
}
