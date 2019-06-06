package defpackage;

import android.view.MotionEvent;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.touch.PanGestureDetector.OnPanGestureListener;
import com.looksery.sdk.touch.TouchConverter;

/* renamed from: mno */
final class mno implements OnPanGestureListener {
    private final mkx a;
    private final TouchConverter<Object> b;

    /* renamed from: mno$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ int a;
        private /* synthetic */ float[] b;
        private /* synthetic */ float[] c;
        private /* synthetic */ int d;

        a(int i, float[] fArr, float[] fArr2, int i2) {
            this.a = i;
            this.b = fArr;
            this.c = fArr2;
            this.d = i2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            int i = this.a;
            float[] fArr = this.b;
            float f = -fArr[0];
            float f2 = -fArr[1];
            float[] fArr2 = this.c;
            lSCoreManagerWrapper.processPanGesture(i, f, f2, fArr2[0], fArr2[1], this.d);
            return ajxw.a;
        }
    }

    public mno(mkx mkx, TouchConverter<Object> touchConverter) {
        akcr.b(mkx, "lensCore");
        akcr.b(touchConverter, "touchConverter");
        this.a = mkx;
        this.b = touchConverter;
    }

    private final void a(MotionEvent motionEvent, int i, float f, float f2, float f3, float f4) {
        this.a.b(new a(i, this.b.normalizePosition(null, f, f2), this.b.normalizePosition(null, f3, f4), motionEvent.getPointerCount()));
    }

    public final boolean onPan(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        akcr.b(motionEvent, "e");
        a(motionEvent, 1, f, f2, f3, f4);
        return true;
    }

    public final boolean onPanBegin(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        akcr.b(motionEvent, "e");
        a(motionEvent, 0, f, f2, f3, f4);
        return true;
    }

    public final boolean onPanEnd(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        akcr.b(motionEvent, "e");
        a(motionEvent, 2, f, f2, f3, f4);
        return true;
    }
}
