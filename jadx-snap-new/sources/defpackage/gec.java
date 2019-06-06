package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: gec */
public final class gec implements ygh {
    private final String a;
    private final long b;
    private final long c;
    private final boolean d;
    private final ygj e;
    private final ide f;
    private final Set<ygk> g;

    public /* synthetic */ gec(String str, long j, long j2, boolean z, ide ide) {
        ygj ygj = ygj.b;
        Object newHashSet = Sets.newHashSet();
        akcr.a(newHashSet, "Sets.newHashSet()");
        this(str, j, j2, z, ygj, ide, (Set) newHashSet);
    }

    private gec(String str, long j, long j2, boolean z, ygj ygj, ide ide, Set<? extends ygk> set) {
        akcr.b(str, "name");
        akcr.b(ygj, "fileStorageType");
        akcr.b(ide, "attributedFeature");
        akcr.b(set, "fileTypes");
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = ygj;
        this.f = ide;
        this.g = set;
    }

    public final ide a() {
        return this.f;
    }

    public final ygj b() {
        return this.e;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gec) {
                gec gec = (gec) obj;
                if (akcr.a(this.a, gec.a)) {
                    if ((this.b == gec.b ? 1 : null) != null) {
                        if ((this.c == gec.c ? 1 : null) != null) {
                            if (!((this.d == gec.d ? 1 : null) != null && akcr.a(this.e, gec.e) && akcr.a(this.f, gec.f) && akcr.a(this.g, gec.g))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Set<ygk> f() {
        return this.g;
    }

    public final boolean g() {
        return true;
    }

    public final ygo<ygk> h() {
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        ygj ygj = this.e;
        hashCode = (hashCode + (ygj != null ? ygj.hashCode() : 0)) * 31;
        ide ide = this.f;
        hashCode = (hashCode + (ide != null ? ide.hashCode() : 0)) * 31;
        Set set = this.g;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentFileGroup(name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", minCacheSize=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxCacheSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isUserScope=");
        stringBuilder.append(this.d);
        stringBuilder.append(", fileStorageType=");
        stringBuilder.append(this.e);
        stringBuilder.append(", attributedFeature=");
        stringBuilder.append(this.f);
        stringBuilder.append(", fileTypes=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
