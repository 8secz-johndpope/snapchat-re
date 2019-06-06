package defpackage;

import android.view.MotionEvent;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.touch.RotateGestureDetector.OnRotateGestureListener;
import com.looksery.sdk.touch.TouchConverter;

/* renamed from: mon */
final class mon implements OnRotateGestureListener {
    private final mkx a;
    private final TouchConverter<Object> b;

    /* renamed from: mon$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ int a;
        private /* synthetic */ float b;
        private /* synthetic */ float[] c;

        a(int i, float f, float[] fArr) {
            this.a = i;
            this.b = f;
            this.c = fArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            int i = this.a;
            float f = this.b;
            float[] fArr = this.c;
            lSCoreManagerWrapper.processRotateGesture(i, f, fArr[0], fArr[1]);
            return ajxw.a;
        }
    }

    public mon(mkx mkx, TouchConverter<Object> touchConverter) {
        akcr.b(mkx, "lensCore");
        akcr.b(touchConverter, "touchConverter");
        this.a = mkx;
        this.b = touchConverter;
    }

    private final void a(int i, float f, float f2, float f3) {
        this.a.b(new a(i, f, this.b.normalizePosition(null, f2, f3)));
    }

    public final boolean onRotate(MotionEvent motionEvent, float f, float f2, float f3) {
        akcr.b(motionEvent, "event");
        a(1, f, f2, f3);
        return true;
    }

    public final boolean onRotateBegin(MotionEvent motionEvent, float f, float f2, float f3) {
        akcr.b(motionEvent, "event");
        a(0, f, f2, f3);
        return true;
    }

    public final boolean onRotateEnd(MotionEvent motionEvent, float f, float f2, float f3) {
        akcr.b(motionEvent, "event");
        a(2, f, f2, f3);
        return true;
    }
}
