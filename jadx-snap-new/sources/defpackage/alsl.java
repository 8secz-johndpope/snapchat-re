package defpackage;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import defpackage.also.e;

/* renamed from: alsl */
public final class alsl implements OnDoubleTapListener {
    private also a;

    public alsl(also also) {
        this.a = also;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        also also = this.a;
        if (also == null) {
            return false;
        }
        try {
            float f;
            float e = also.e();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (e < this.a.e) {
                also = this.a;
                f = this.a.e;
            } else if (e < this.a.e || e >= this.a.f) {
                also = this.a;
                f = this.a.d;
            } else {
                also = this.a;
                f = this.a.f;
            }
            also.b(f, x, y);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        also also = this.a;
        if (also == null) {
            return false;
        }
        also.d();
        if (this.a.k != null) {
            e eVar = this.a.k;
            motionEvent.getX();
            motionEvent.getY();
            eVar.a();
        }
        return false;
    }
}
