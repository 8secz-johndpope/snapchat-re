package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ackw */
public final class ackw {
    private List<ajxm<Float[], String>> a;
    private int b;

    /* renamed from: ackw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ackw(acvp acvp) {
        String str;
        Object next;
        akcr.b(acvp, "drawingCluster");
        Collection arrayList = new ArrayList();
        Iterator it = acvp.b().subList(0, acvp.k).iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            Object obj = (acvr) next;
            akcr.a(obj, str);
            if (obj.n() instanceof acwa) {
                arrayList.add(next);
            }
        }
        Object copyOf = ImmutableList.copyOf((Collection) (List) arrayList);
        akcr.a(copyOf, "ImmutableList.copyOf(dra…wingMarker\n            })");
        Iterable<Object> iterable = (Iterable) copyOf;
        arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Object next2 : iterable) {
            Float[] fArr = new Float[]{Float.valueOf(next2.k), Float.valueOf(next2.l), Float.valueOf(next2.j)};
            akcr.a(next2, str);
            acvs n = next2.n();
            if (!(n instanceof acwa)) {
                n = null;
            }
            acwa acwa = (acwa) n;
            if (acwa != null) {
                next2 = acwa.p;
                if (next2 != null) {
                    arrayList.add(new ajxm(fArr, next2));
                }
            }
            next2 = "";
            arrayList.add(new ajxm(fArr, next2));
        }
        this.a = (List) arrayList;
        this.b = this.a.size();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ackw)) {
            return false;
        }
        ackw ackw = (ackw) obj;
        if (this.b != ackw.b) {
            return false;
        }
        int i = 0;
        for (ajxm ajxm : this.a) {
            ajxm ajxm2 = (ajxm) ackw.a.get(i);
            if (Math.abs(((Float[]) ajxm2.a)[0].floatValue() - ((Float[]) ajxm.a)[0].floatValue()) > 0.001f || Math.abs(((Float[]) ajxm2.a)[1].floatValue() - ((Float[]) ajxm.a)[1].floatValue()) > 0.001f || Math.abs(((Float[]) ajxm2.a)[2].floatValue() - ((Float[]) ajxm.a)[2].floatValue()) > 0.001f || (akcr.a((String) ajxm2.b, (String) ajxm.b) ^ 1) != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
