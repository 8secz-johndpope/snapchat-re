package defpackage;

import defpackage.rzf.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: glf */
abstract class glf<State> implements rzi<ryz, State> {
    final Map<String, rzf<ryz>> a = new HashMap();
    private final String b;

    glf(String str) {
        this.b = str;
    }

    public abstract Map<a, List<rzf<ryz>>> a();

    public void a(rzf<ryz> rzf) {
        if (this.a.put(rzf.c(), rzf) == null) {
            glg.a(this.b, this.a);
        }
    }

    public boolean b(rzf<ryz> rzf) {
        if (this.a.remove(rzf.c()) == null) {
            return false;
        }
        glg.a(this.b, this.a);
        return true;
    }
}
