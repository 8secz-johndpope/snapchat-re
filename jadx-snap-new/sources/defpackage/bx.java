package defpackage;

import java.util.ArrayList;

/* renamed from: bx */
public final class bx {
    int a;
    int b;
    int c;
    int d;
    ArrayList<a> e = new ArrayList();

    /* renamed from: bx$a */
    static class a {
        bn a;
        bn b;
        int c;
        int d;
        int e;

        public a(bn bnVar) {
            this.a = bnVar;
            this.b = bnVar.d;
            this.c = bnVar.b();
            this.d = bnVar.f;
            this.e = bnVar.g;
        }
    }

    public bx(bo boVar) {
        this.a = boVar.j();
        this.b = boVar.k();
        this.c = boVar.l();
        this.d = boVar.m();
        ArrayList u = boVar.u();
        int size = u.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a((bn) u.get(i)));
        }
    }
}
