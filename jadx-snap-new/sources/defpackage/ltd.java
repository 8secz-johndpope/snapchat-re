package defpackage;

import defpackage.lsa.a;
import defpackage.mhs.b;
import java.util.List;
import java.util.Set;

/* renamed from: ltd */
final class ltd {
    final List<mux> a;
    final List<mux> b;
    final List<mux> c;
    final Set<mux> d;
    final lsx e;
    final a f;
    final boolean g;
    final b h;

    public /* synthetic */ ltd() {
        this(ajyw.a, ajyw.a, ajyw.a, ajyy.a, new lsx.a(ajyw.a), null, false, null);
    }

    public ltd(List<mux> list, List<mux> list2, List<mux> list3, Set<mux> set, lsx lsx, a aVar, boolean z, b bVar) {
        akcr.b(list, "allLenses");
        akcr.b(list2, "leftLenses");
        akcr.b(list3, "rightLenses");
        akcr.b(set, "removedLenses");
        akcr.b(lsx, "currentSchedule");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = set;
        this.e = lsx;
        this.f = aVar;
        this.g = z;
        this.h = bVar;
    }

    public final lqe a() {
        return this.e instanceof lsx.a ? lqe.FRONT : lqe.BACK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ltd) {
                ltd ltd = (ltd) obj;
                if (akcr.a(this.a, ltd.a) && akcr.a(this.b, ltd.b) && akcr.a(this.c, ltd.c) && akcr.a(this.d, ltd.d) && akcr.a(this.e, ltd.e) && akcr.a(this.f, ltd.f)) {
                    if ((this.g == ltd.g ? 1 : null) == null || !akcr.a(this.h, ltd.h)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        list2 = this.c;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set set = this.d;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        lsx lsx = this.e;
        hashCode = (hashCode + (lsx != null ? lsx.hashCode() : 0)) * 31;
        a aVar = this.f;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        int i2 = this.g;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        b bVar = this.h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("State(allLenses=");
        stringBuilder.append(this.a);
        stringBuilder.append(", leftLenses=");
        stringBuilder.append(this.b);
        stringBuilder.append(", rightLenses=");
        stringBuilder.append(this.c);
        stringBuilder.append(", removedLenses=");
        stringBuilder.append(this.d);
        stringBuilder.append(", currentSchedule=");
        stringBuilder.append(this.e);
        stringBuilder.append(", action=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isScheduleFlipped=");
        stringBuilder.append(this.g);
        stringBuilder.append(", flippedOnLensId=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
