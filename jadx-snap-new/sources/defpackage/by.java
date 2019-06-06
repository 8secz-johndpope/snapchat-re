package defpackage;

import java.util.ArrayList;

/* renamed from: by */
public class by extends bo {
    protected ArrayList<bo> ab = new ArrayList();

    public void B() {
        v();
        ArrayList arrayList = this.ab;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bo boVar = (bo) this.ab.get(i);
                if (boVar instanceof by) {
                    ((by) boVar).B();
                }
            }
        }
    }

    public final void E() {
        this.ab.clear();
    }

    public final void a(bg bgVar) {
        super.a(bgVar);
        int size = this.ab.size();
        for (int i = 0; i < size; i++) {
            ((bo) this.ab.get(i)).a(bgVar);
        }
    }

    public final void a(bo boVar) {
        this.ab.add(boVar);
        if (boVar.A != null) {
            ((by) boVar.A).b(boVar);
        }
        boVar.A = this;
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        i = this.ab.size();
        for (i2 = 0; i2 < i; i2++) {
            ((bo) this.ab.get(i2)).b(p(), q());
        }
    }

    public final void b(bo boVar) {
        this.ab.remove(boVar);
        boVar.A = null;
    }

    public void f() {
        this.ab.clear();
        super.f();
    }

    public final void v() {
        super.v();
        ArrayList arrayList = this.ab;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bo boVar = (bo) this.ab.get(i);
                boVar.b(n(), o());
                if (!(boVar instanceof bp)) {
                    boVar.v();
                }
            }
        }
    }
}
