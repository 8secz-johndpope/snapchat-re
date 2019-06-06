package defpackage;

import android.util.Pair;
import com.google.common.base.Preconditions;
import defpackage.adhy.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: adhz */
public final class adhz {
    private final adnj a;
    private final a b;
    private final Map<Integer, adhy> c;
    private final Map<Pair<Integer, String>, adhy> d;

    public adhz(adnj adnj) {
        this(adnj, new a());
    }

    private adhz(adnj adnj, a aVar) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = (adnj) Preconditions.checkNotNull(adnj);
        this.b = aVar;
    }

    private void b() {
        for (Entry value : this.c.entrySet()) {
            ((adhy) value.getValue()).b();
        }
        this.c.clear();
    }

    private void c() {
        for (Entry value : this.d.entrySet()) {
            ((adhy) value.getValue()).b();
        }
        this.d.clear();
    }

    public final adhy a(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            adni.a("Reusing vertex shader for resourceId = %d", Integer.valueOf(i));
            return (adhy) this.c.get(Integer.valueOf(i));
        }
        adhy adhy = new adhy();
        adhy.a(35633, this.a.a(i));
        this.c.put(Integer.valueOf(i), adhy);
        return adhy;
    }

    public final adhy a(int i, String... strArr) {
        Pair pair = new Pair(Integer.valueOf(i), Arrays.deepToString(strArr));
        if (this.d.containsKey(pair)) {
            adni.a("Reusing fragment shader for resourceId = %d, definitions = %s", Integer.valueOf(i), strArr);
            return (adhy) this.d.get(pair);
        }
        adhy adhy = new adhy();
        adhy.a(35632, this.a.a(i, strArr));
        this.d.put(pair, adhy);
        return adhy;
    }

    public final void a() {
        b();
        c();
    }
}
