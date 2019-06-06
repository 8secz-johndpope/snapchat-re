package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: faj */
public final class faj {
    public final Set<String> a = new HashSet();
    public eza b;

    public final void a(eza eza) {
        this.b = eza;
    }

    public final void a(String str) {
        if (str != null) {
            this.a.add(str);
        }
    }

    public final void b(String str) {
        this.a.remove(str);
    }
}
