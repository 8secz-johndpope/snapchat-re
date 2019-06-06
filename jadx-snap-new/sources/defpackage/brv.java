package defpackage;

import android.os.Handler;
import defpackage.bsj.b;
import defpackage.bsk.a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: brv */
public abstract class brv implements bsj {
    protected final a a = new a();
    private final ArrayList<b> b = new ArrayList(1);
    private blb c;
    private bly d;
    private Object e;

    /* Access modifiers changed, original: protected|final */
    public final a a(int i, bsj.a aVar) {
        return this.a.a(i, aVar, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final a a(bsj.a aVar) {
        return this.a.a(0, aVar, 0);
    }

    public abstract void a();

    public final void a(Handler handler, bsk bsk) {
        a aVar = this.a;
        boolean z = (handler == null || bsk == null) ? false : true;
        byo.a(z);
        aVar.c.add(new a.a(handler, bsk));
    }

    public abstract void a(blb blb, boolean z);

    public final void a(blb blb, boolean z, b bVar) {
        blb blb2 = this.c;
        boolean z2 = blb2 == null || blb2 == blb;
        byo.a(z2);
        this.b.add(bVar);
        if (this.c == null) {
            this.c = blb;
            a(blb, z);
            return;
        }
        bly bly = this.d;
        if (bly != null) {
            bVar.a(this, bly, this.e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bly bly, Object obj) {
        this.d = bly;
        this.e = obj;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, bly, obj);
        }
    }

    public final void a(b bVar) {
        this.b.remove(bVar);
        if (this.b.isEmpty()) {
            this.c = null;
            this.d = null;
            this.e = null;
            a();
        }
    }

    public final void a(bsk bsk) {
        a aVar = this.a;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            a.a aVar2 = (a.a) it.next();
            if (aVar2.b == bsk) {
                aVar.c.remove(aVar2);
            }
        }
    }
}
