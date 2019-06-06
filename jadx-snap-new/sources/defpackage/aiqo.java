package defpackage;

import android.content.Context;
import io.fabric.sdk.android.FabricContext;
import java.io.File;

/* renamed from: aiqo */
public abstract class aiqo<Result> implements Comparable<aiqo> {
    public aiqj d;
    protected aiqn<Result> e = new aiqn(this);
    public Context f;
    aiql<Result> g;
    protected airm h;
    final airv i = ((airv) getClass().getAnnotation(airv.class));

    private boolean a(aiqo aiqo) {
        if (e()) {
            for (Class isAssignableFrom : this.i.a()) {
                if (isAssignableFrom.isAssignableFrom(aiqo.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean e() {
        return this.i != null;
    }

    public abstract String a();

    /* Access modifiers changed, original: final */
    public final void a(Context context, aiqj aiqj, aiql<Result> aiql, airm airm) {
        this.d = aiqj;
        this.f = new FabricContext(context, b(), j());
        this.g = aiql;
        this.h = airm;
    }

    public abstract String b();

    public /* synthetic */ int compareTo(Object obj) {
        aiqo aiqo = (aiqo) obj;
        return a(aiqo) ? 1 : aiqo.a(this) ? -1 : (!e() || aiqo.e()) ? (e() || !aiqo.e()) ? 0 : -1 : 1;
    }

    public abstract Result d();

    /* Access modifiers changed, original: protected */
    public boolean d_() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        this.e.a(this.d.a, null);
    }

    public final String j() {
        StringBuilder stringBuilder = new StringBuilder(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(b());
        return stringBuilder.toString();
    }
}
