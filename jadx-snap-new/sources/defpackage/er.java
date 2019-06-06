package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.eo.b;
import defpackage.eo.c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: er */
public class er extends eo {
    public ArrayList<eo> a = new ArrayList();
    public boolean i = false;
    int j;
    boolean k = false;

    /* renamed from: er$a */
    static class a extends ep {
        private er a;

        a(er erVar) {
            this.a = erVar;
        }

        public final void a(eo eoVar) {
            er erVar = this.a;
            erVar.j--;
            if (this.a.j == 0) {
                erVar = this.a;
                erVar.k = false;
                erVar.d();
            }
            eoVar.b((c) this);
        }

        public final void c() {
            if (!this.a.k) {
                this.a.c();
                this.a.k = true;
            }
        }
    }

    public final eo a(int i) {
        return (i < 0 || i >= this.a.size()) ? null : (eo) this.a.get(i);
    }

    public final er a(eo eoVar) {
        this.a.add(eoVar);
        eoVar.f = this;
        if (this.c >= 0) {
            eoVar.a(this.c);
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        String a = super.a(str);
        for (int i = 0; i < this.a.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            eo eoVar = (eo) this.a.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(eoVar.a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ViewGroup viewGroup, et etVar, et etVar2, ArrayList<es> arrayList, ArrayList<es> arrayList2) {
        long j = this.b;
        int size = this.a.size();
        int i = 0;
        while (i < size) {
            eo eoVar = (eo) this.a.get(i);
            if (j > 0 && (this.i || i == 0)) {
                long j2 = eoVar.b;
                if (j2 > 0) {
                    eoVar.b(j2 + j);
                } else {
                    eoVar.b(j);
                }
            }
            eoVar.a(viewGroup, etVar, etVar2, arrayList, arrayList2);
            i++;
        }
    }

    public final void a(b bVar) {
        super.a(bVar);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((eo) this.a.get(i)).a(bVar);
        }
    }

    public final void a(es esVar) {
        if (b(esVar.b)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                eo eoVar = (eo) it.next();
                if (eoVar.b(esVar.b)) {
                    eoVar.a(esVar);
                    esVar.c.add(eoVar);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (this.a.isEmpty()) {
            c();
            d();
            return;
        }
        c aVar = new a(this);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eo) it.next()).a(aVar);
        }
        this.j = this.a.size();
        if (this.i) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((eo) it2.next()).b();
            }
            return;
        }
        for (int i = 1; i < this.a.size(); i++) {
            final eo eoVar = (eo) this.a.get(i);
            ((eo) this.a.get(i - 1)).a(new ep() {
                public final void a(eo eoVar) {
                    eoVar.b();
                    eoVar.b((c) this);
                }
            });
        }
        eo eoVar2 = (eo) this.a.get(0);
        if (eoVar2 != null) {
            eoVar2.b();
        }
    }

    public final void b(es esVar) {
        if (b(esVar.b)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                eo eoVar = (eo) it.next();
                if (eoVar.b(esVar.b)) {
                    eoVar.b(esVar);
                    esVar.c.add(eoVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final er a(long j) {
        super.a(j);
        if (this.c >= 0) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ((eo) this.a.get(i)).a(j);
            }
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void c(es esVar) {
        super.c(esVar);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((eo) this.a.get(i)).c(esVar);
        }
    }

    public final /* synthetic */ eo d(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            ((eo) this.a.get(i)).d(view);
        }
        return (er) super.d(view);
    }

    /* renamed from: e */
    public final eo clone() {
        er erVar = (er) super.clone();
        erVar.a = new ArrayList();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            erVar.a(((eo) this.a.get(i)).clone());
        }
        return erVar;
    }

    public final void e(View view) {
        super.e(view);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((eo) this.a.get(i)).e(view);
        }
    }

    public final void f(View view) {
        super.f(view);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((eo) this.a.get(i)).f(view);
        }
    }
}
