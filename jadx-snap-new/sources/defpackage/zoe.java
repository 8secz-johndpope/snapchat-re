package defpackage;

import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.zob.b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zoe */
public class zoe extends zob {
    private boolean a = true;
    protected ArrayList<zob> r = new ArrayList();
    int s;
    boolean t = false;

    /* renamed from: zoe$a */
    static class a extends zoc {
        private zoe a;

        a(zoe zoe) {
            this.a = zoe;
        }

        public final void a() {
            if (!this.a.t) {
                this.a.c();
                this.a.t = true;
            }
        }

        public final void a(zob zob) {
            zoe zoe = this.a;
            zoe.s--;
            if (this.a.s == 0) {
                zoe = this.a;
                zoe.t = false;
                zoe.d();
            }
            zob.b((b) this);
        }
    }

    private zoe f() {
        zoe zoe = (zoe) super.clone();
        zoe.r = new ArrayList();
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            zoe.a(((zob) this.r.get(i)).clone());
        }
        return zoe;
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        String a = super.a(str);
        for (int i = 0; i < this.r.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            zob zob = (zob) this.r.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(zob.a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    public final zoe a(zob zob) {
        if (zob != null) {
            this.r.add(zob);
            zob.n = this;
            if (this.l >= 0) {
                zob.a(this.l);
            }
        }
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ViewGroup viewGroup, zoh zoh, zoh zoh2, ArrayList<zog> arrayList, ArrayList<zog> arrayList2) {
        long j = this.k;
        int size = this.r.size();
        int i = 0;
        while (i < size) {
            zob zob = (zob) this.r.get(i);
            if (j > 0 && (this.a || i == 0)) {
                long j2 = zob.k;
                if (j2 > 0) {
                    zob.b(j2 + j);
                } else {
                    zob.b(j);
                }
            }
            zob.a(viewGroup, zoh, zoh2, arrayList, arrayList2);
            i++;
        }
    }

    public final void a(zog zog) {
        if (a(zog.a)) {
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                zob zob = (zob) it.next();
                if (zob.a(zog.a)) {
                    zob.a(zog);
                    zog.c.add(zob);
                }
            }
        }
    }

    public final zoe b(zob zob) {
        this.r.remove(zob);
        zob.n = null;
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        if (this.r.isEmpty()) {
            c();
            d();
            return;
        }
        b aVar = new a(this);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((zob) it.next()).a(aVar);
        }
        this.s = this.r.size();
        int size = this.r.size();
        int i = 0;
        if (this.a) {
            while (i < size) {
                ((zob) this.r.get(i)).b();
                i++;
            }
            return;
        }
        for (int i2 = 1; i2 < size; i2++) {
            final zob zob = (zob) this.r.get(i2);
            ((zob) this.r.get(i2 - 1)).a(new zoc() {
                public final void a(zob zob) {
                    zob.b();
                    zob.b((b) this);
                }
            });
        }
        zob zob2 = (zob) this.r.get(0);
        if (zob2 != null) {
            zob2.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(ViewGroup viewGroup) {
        super.b(viewGroup);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((zob) this.r.get(i)).b(viewGroup);
        }
    }

    public final void b(zog zog) {
        if (a(zog.a)) {
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                zob zob = (zob) it.next();
                if (zob.a(zog.a)) {
                    zob.b(zog);
                    zog.c.add(zob);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        super.b(z);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((zob) this.r.get(i)).b(z);
        }
    }

    public final zoe c(int i) {
        if (i == 0) {
            this.a = true;
        } else if (i == 1) {
            this.a = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
        }
        return this;
    }

    public final void c(View view) {
        super.c(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((zob) this.r.get(i)).c(view);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(zog zog) {
        super.c(zog);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((zob) this.r.get(i)).c(zog);
        }
    }

    public /* synthetic */ Object clone() {
        return f();
    }

    public final void d(View view) {
        super.d(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((zob) this.r.get(i)).d(view);
        }
    }

    public final /* synthetic */ zob e() {
        return f();
    }
}
