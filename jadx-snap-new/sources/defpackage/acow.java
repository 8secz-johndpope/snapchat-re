package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: acow */
public final class acow {
    final Set<String> a;
    final List<acov> b;
    String c;

    public acow(List<String> list, List<acov> list2) {
        this.a = new HashSet(list);
        this.b = list2;
    }

    public final List<acov> a() {
        ArrayList arrayList = new ArrayList();
        for (acov acov : this.b) {
            if (TextUtils.equals(acov.a, this.c)) {
                arrayList.add(0, acov);
            } else {
                arrayList.add(acov);
            }
        }
        return arrayList;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str) || this.a.contains(str)) {
            this.c = str;
        }
    }

    public final String toString() {
        List<acov> a = a();
        StringBuilder stringBuilder = new StringBuilder("Cluster: ");
        for (acov acov : a) {
            stringBuilder.append(acov.a);
            stringBuilder.append(':');
            stringBuilder.append(acov.b);
            stringBuilder.append(ppy.d);
        }
        return stringBuilder.toString();
    }
}
