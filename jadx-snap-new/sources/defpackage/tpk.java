package defpackage;

import java.util.List;

/* renamed from: tpk */
public final class tpk {
    public final List<String> a;
    public final List<String> b;
    public final List<String> c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final List<String> j;

    public tpk() {
        this(null, null, null, null, 0, 0, false, false, 1023);
    }

    public /* synthetic */ tpk(List list, List list2, List list3, List list4, int i, int i2, boolean z, boolean z2, int i3) {
        int i4 = i3;
        this((i4 & 1) != 0 ? ajyw.a : list, (i4 & 2) != 0 ? ajyw.a : list2, (i4 & 4) != 0 ? ajyw.a : list3, (i4 & 8) != 0 ? ajyw.a : list4, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? false : z2, false, false);
    }

    public tpk(List<String> list, List<String> list2, List<String> list3, List<String> list4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        akcr.b(list, "names");
        akcr.b(list2, "usernames");
        akcr.b(list3, "groupIds");
        akcr.b(list4, "storyIds");
        this.a = list;
        this.b = list2;
        this.j = list3;
        this.c = list4;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tpk) {
                tpk tpk = (tpk) obj;
                if (akcr.a(this.a, tpk.a) && akcr.a(this.b, tpk.b) && akcr.a(this.j, tpk.j) && akcr.a(this.c, tpk.c)) {
                    if ((this.d == tpk.d ? 1 : null) != null) {
                        if ((this.e == tpk.e ? 1 : null) != null) {
                            if ((this.f == tpk.f ? 1 : null) != null) {
                                if ((this.g == tpk.g ? 1 : null) != null) {
                                    if ((this.h == tpk.h ? 1 : null) != null) {
                                        if ((this.i == tpk.i ? 1 : null) != null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
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
        list2 = this.j;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        list2 = this.c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        hashCode = (((((hashCode + i) * 31) + this.d) * 31) + this.e) * 31;
        i = this.f;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.g;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.h;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.i;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewSendToData(names=");
        stringBuilder.append(this.a);
        stringBuilder.append(", usernames=");
        stringBuilder.append(this.b);
        stringBuilder.append(", groupIds=");
        stringBuilder.append(this.j);
        stringBuilder.append(", storyIds=");
        stringBuilder.append(this.c);
        stringBuilder.append(", recipientCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", storyCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", withSnapSend=");
        stringBuilder.append(this.f);
        stringBuilder.append(", withStoryPost=");
        stringBuilder.append(this.g);
        stringBuilder.append(", withMyStoryPost=");
        stringBuilder.append(this.h);
        stringBuilder.append(", withOurStoryPost=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
