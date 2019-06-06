package defpackage;

import android.os.Build.VERSION;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;
import java.util.Collections;
import java.util.Set;

/* renamed from: ekc */
public final class ekc {
    private final Set<a> a;
    private final SortedMultiset<ecc> b;
    private final dpk c;

    /* renamed from: ekc$a */
    public static class a {
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        public static a a() {
            return new a(true);
        }

        public static a b() {
            return new a(false);
        }

        public final ecc c() {
            return this.a ? ecc.SINGLE_FLASH : ecc.TORCH;
        }
    }

    public ekc(dpk dpk) {
        this.c = dpk;
        this.a = VERSION.SDK_INT >= 23 ? new ArraySet() : Collections.newSetFromMap(new ArrayMap());
        this.b = TreeMultiset.create();
        this.b.add(ecc.OFF);
    }

    public final ajdx<Boolean> a(a aVar) {
        if (aVar.c() == ecc.SINGLE_FLASH && this.b.lastEntry().getElement() == ecc.TORCH) {
            return ajdx.b(Boolean.FALSE);
        }
        if (!this.a.add(aVar)) {
            return ajdx.b(Boolean.FALSE);
        }
        this.b.add(aVar.c());
        return this.c.a((ecc) this.b.lastEntry().getElement());
    }

    public final void b(a aVar) {
        if (this.a.remove(aVar)) {
            this.b.remove(aVar.c());
            this.c.a((ecc) this.b.lastEntry().getElement());
        }
    }
}
