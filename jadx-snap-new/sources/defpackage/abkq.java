package defpackage;

import java.util.List;

/* renamed from: abkq */
public final class abkq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    public final long j;
    public final Long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Long p;

    public /* synthetic */ abkq(Long l) {
        this(null, null, null, null, null, null, null, null, null, 0, l, null, null, null, null, null);
    }

    public abkq(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, long j, Long l2, String str9, String str10, String str11, String str12, Long l3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = l;
        this.i = str8;
        this.j = j;
        this.k = l2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = l3;
    }

    public final String a() {
        String str = this.c;
        List a = str != null ? akgc.a((CharSequence) str, new String[]{" "}, 0, 6) : null;
        if (!(a == null || a.isEmpty())) {
            if ((((CharSequence) a.get(0)).length() == 0 ? 1 : null) == null) {
                return (String) a.get(0);
            }
        }
        str = this.b;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abkq) {
                abkq abkq = (abkq) obj;
                if (akcr.a(this.a, abkq.a) && akcr.a(this.b, abkq.b) && akcr.a(this.c, abkq.c) && akcr.a(this.d, abkq.d) && akcr.a(this.e, abkq.e) && akcr.a(this.f, abkq.f) && akcr.a(this.g, abkq.g) && akcr.a(this.h, abkq.h) && akcr.a(this.i, abkq.i)) {
                    if (!((this.j == abkq.j ? 1 : null) != null && akcr.a(this.k, abkq.k) && akcr.a(this.l, abkq.l) && akcr.a(this.m, abkq.m) && akcr.a(this.n, abkq.n) && akcr.a(this.o, abkq.o) && akcr.a(this.p, abkq.p))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.j;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.n;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.o;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.p;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserSession(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", username=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayname=");
        stringBuilder.append(this.c);
        stringBuilder.append(", email=");
        stringBuilder.append(this.d);
        stringBuilder.append(", phone=");
        stringBuilder.append(this.e);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.h);
        stringBuilder.append(", blizzardToken=");
        stringBuilder.append(this.i);
        stringBuilder.append(", friendCount=");
        stringBuilder.append(this.j);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.k);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.l);
        stringBuilder.append(", countryCode=");
        stringBuilder.append(this.m);
        stringBuilder.append(", ipBasedCountryCode=");
        stringBuilder.append(this.n);
        stringBuilder.append(", registrationCountryCode=");
        stringBuilder.append(this.o);
        stringBuilder.append(", createdTimestamp=");
        stringBuilder.append(this.p);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
