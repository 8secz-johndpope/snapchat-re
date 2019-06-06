package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: abuz */
public final class abuz implements abva {
    private final List<abvi> a = new ArrayList();
    private int b;
    private int c;

    public final void a() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((abvi) this.a.get(size)).b();
        }
    }

    public final void a(int i, int i2) {
        this.b = i;
        this.c = i2;
        for (i = this.a.size() - 1; i >= 0; i--) {
            ((abvi) this.a.get(i)).a();
        }
    }

    public final void a(abvi abvi) {
        this.a.add(abvi);
    }

    public final void a(boolean z, int i, int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((abvi) this.a.get(size)).a(z, i, i2);
        }
    }

    public final void b(int i, int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((abvi) this.a.get(size)).a(i - this.b, i2 - this.c);
        }
    }
}
