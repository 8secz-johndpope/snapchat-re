package defpackage;

import com.brightcove.player.media.ErrorFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ilz */
public final class ilz {
    public final ily a;
    public final ArrayList<String> b;

    /* renamed from: ilz$a */
    public static final class a extends Throwable {
        public a(String str) {
            akcr.b(str, ErrorFields.MESSAGE);
            super(str);
        }
    }

    public /* synthetic */ ilz(ily ily) {
        this(ily, new ArrayList(10));
    }

    private ilz(ily ily, ArrayList<String> arrayList) {
        akcr.b(ily, "metricBase");
        akcr.b(arrayList, "dimensions");
        this.a = ily;
        this.b = arrayList;
    }

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a(str, enumR.name());
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        if (this.b.size() < 10) {
            this.b.add(str);
            this.b.add(str2);
            return this;
        }
        throw new a("Cannot have more than 5 custom dimensions");
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a(str, String.valueOf(z));
    }

    public final String a() {
        Collection arrayList = new ArrayList();
        for (Object next : this.b) {
            CharSequence charSequence = (String) next;
            int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
            if ((i ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ".", null, null, 0, null, null, 62);
    }

    public final Enum<?> b() {
        ily ily = this.a;
        if (ily != null) {
            return (Enum) ily;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Enum<*>");
    }

    public final String c() {
        ily ily = this.a;
        if (ily != null) {
            return ((Enum) ily).name();
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Enum<*>");
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.ilz;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.ilz) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ily ily = this.a;
        int i = 0;
        int hashCode = (ily != null ? ily.hashCode() : 0) * 31;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MetricWithDimensions(metricBase=");
        stringBuilder.append(this.a);
        stringBuilder.append(", dimensions=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
