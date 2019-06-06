package defpackage;

import defpackage.abuh.a;
import defpackage.abuh.b;
import defpackage.abuh.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acbf */
public class acbf<T extends acbg> implements a<T> {
    protected final List<Object> a = new ArrayList();
    private final T b;

    public acbf(T t) {
        this.b = t;
    }

    public void a(T t, c cVar) {
        cVar.a(this.b.getX(), this.b.getY(), this.b.getScaleX(), this.b.getScaleX(), this.b.getScaleX(), (float) Math.toRadians((double) this.b.getRotation()));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public boolean a(T t, c cVar, b bVar, b bVar2) {
        float c = cVar.c();
        this.b.setX(cVar.a);
        this.b.setY(cVar.b);
        this.b.setRotation(((float) Math.toDegrees((double) cVar.d())) % 360.0f);
        this.b.setScaleX(c);
        this.b.setScaleY(c);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.b;
    }

    public final boolean c() {
        return this.b.ac_();
    }
}
