package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: achp */
public abstract class achp<T extends acho> {
    protected achn a;
    protected T b;
    protected a c;

    /* renamed from: achp$a */
    public interface a {
        float a();

        void a(float f);

        void a(achr achr, float f, achj achj);

        boolean a(achr achr);

        View b();

        void b(achr achr);
    }

    protected achp(achn achn, T t, a aVar) {
        this.a = achn;
        this.b = t;
        this.c = aVar;
    }

    public abstract boolean a();

    public abstract boolean a(achz achz);

    public abstract boolean a(MotionEvent motionEvent);
}
