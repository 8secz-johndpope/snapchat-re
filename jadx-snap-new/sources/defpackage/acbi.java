package defpackage;

import android.graphics.Matrix;
import com.google.common.base.Preconditions;
import defpackage.abuh.b;
import defpackage.abuh.c;
import java.util.Iterator;

/* renamed from: acbi */
public final class acbi<T extends acbg> extends acbf<T> {
    private Matrix b = new Matrix();
    private Matrix c = new Matrix();
    private float d;
    private float e;
    private float f;
    private float g = 1.0f;

    public acbi(T t) {
        super(t);
    }

    private void a(T t) {
        this.d = t.getX();
        this.e = t.getY();
        this.g = t.getScaleX();
        this.f = t.getRotation();
    }

    private static void a(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        matrix.setTranslate(f, f2);
        matrix.preRotate(f5, f3, f4);
        matrix.preScale(f6, f6, f3, f4);
    }

    public final void a(T t, c cVar) {
        a(t);
        float[] fArr = new float[]{t.getX(), t.getY()};
        cVar.a(fArr[0], fArr[1], t.getScaleX(), t.getScaleX(), t.getScaleX(), (float) Math.toRadians((double) t.getRotation()));
    }

    public final boolean a(T t, c cVar, b bVar, b bVar2) {
        T t2 = t;
        c cVar2 = cVar;
        b bVar3 = bVar;
        b bVar4 = bVar2;
        Preconditions.checkNotNull(this.a);
        float f = cVar2.a;
        float f2 = cVar2.b;
        float c = cVar.c();
        t2.setRotation(((float) Math.toDegrees((double) cVar.d())) % 360.0f);
        t2.setScaleX(c);
        t2.setScaleY(c);
        float scaleX = t.getScaleX();
        float rotation = t.getRotation();
        if (bVar3.a == 2 && bVar4 != null) {
            float[] fArr = new float[]{bVar4.f, bVar4.g};
            Matrix matrix = this.b;
            Matrix matrix2 = this.c;
            acbi.a(matrix, this.d, this.e, t.getPivotX(), t.getPivotY(), this.f, this.g);
            if (matrix.invert(matrix2)) {
                float[] fArr2 = new float[2];
                matrix2.mapPoints(fArr2, fArr);
                float[] fArr3 = fArr2;
                acbi.a(matrix, f, f2, t.getPivotX(), t.getPivotY(), rotation, scaleX);
                fArr = new float[2];
                matrix.mapPoints(fArr, fArr3);
                f += bVar3.f - fArr[0];
                f2 += bVar3.g - fArr[1];
            } else {
                throw new RuntimeException("Get invert matrix failed. ".concat(String.valueOf(matrix)));
            }
        }
        t2.setX(f);
        t2.setY(f2);
        a(t);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }
}
