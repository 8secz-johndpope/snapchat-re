package defpackage;

import java.util.List;

/* renamed from: acum */
public final class acum {
    public float[] a;
    public float[] b;

    /* renamed from: acum$a */
    public interface a<T> {
        int a();

        void a(float[] fArr, Iterable<T> iterable);
    }

    public acum(int i) {
        i = Math.max(i, 4);
        this.a = new float[i];
        this.b = new float[i];
    }

    public final <T> float[] a(acmj acmj, float f, int i, Iterable<T> iterable, a<T> aVar) {
        i *= aVar.a();
        if (this.a.length < i) {
            this.a = new float[i];
            this.b = new float[i];
        }
        aVar.a(this.a, iterable);
        acmj.a(i, this.a, this.b, f);
        return this.b;
    }

    public final <T> float[] a(acmj acmj, float f, List<T> list, a<T> aVar) {
        return a(acmj, f, list.size(), list, aVar);
    }
}
