package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: zom */
public final class zom extends zoi {
    private List<a> a = new ArrayList();

    /* renamed from: zom$a */
    public static abstract class a {
        public abstract Animator a(ViewGroup viewGroup, View view, zog zog);

        public abstract Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2);

        public void a(zog zog) {
        }
    }

    public zom(a... aVarArr) {
        this.a.addAll(Arrays.asList(aVarArr));
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (a a : this.a) {
            arrayList.add(a.a(viewGroup, view, zog));
        }
        return zof.a(arrayList);
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (a a : this.a) {
            arrayList.add(a.a(viewGroup, view, zog, zog2));
        }
        return zof.a(arrayList);
    }

    public final void a(zog zog) {
        super.a(zog);
        for (a a : this.a) {
            a.a(zog);
        }
    }

    public final void b(zog zog) {
        super.b(zog);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
