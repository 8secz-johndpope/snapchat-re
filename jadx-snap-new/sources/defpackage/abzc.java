package defpackage;

/* renamed from: abzc */
public final class abzc {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final long k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;
    public final String p;
    public final String q;
    public final long r;
    public final String s;
    public final long t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;
    public final String y;
    public final String z;

    public abzc(long j, long j2, long j3, String str, long j4, long j5, String str2, long j6, long j7, String str3, long j8, long j9, long j10, String str4, long j11, String str5, String str6, long j12, String str7, long j13, String str8, long j14, long j15, long j16, String str9, String str10, long j17, long j18, long j19, long j20) {
        String str11 = str;
        String str12 = str4;
        String str13 = str5;
        String str14 = str7;
        String str15 = str9;
        akcr.b(str, "stickerBitmojiList");
        akcr.b(str12, "stickerInfoList");
        akcr.b(str13, "stickerContextualList");
        akcr.b(str14, "stickerUnlockedList");
        akcr.b(str15, "stickerGeoBitmojiList");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str11;
        this.e = j4;
        this.f = j5;
        this.g = str2;
        this.h = j6;
        this.i = j7;
        this.j = str3;
        this.k = j8;
        this.l = j9;
        this.m = j10;
        this.n = str12;
        this.o = j11;
        this.p = str13;
        this.q = str6;
        this.r = j12;
        this.s = str14;
        this.t = j13;
        this.u = str8;
        this.v = j14;
        this.w = j15;
        this.x = j16;
        this.y = str15;
        this.z = str10;
        this.A = j17;
        this.B = j18;
        this.C = j19;
        this.D = j20;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abzc) {
                abzc abzc = (abzc) obj;
                if ((this.a == abzc.a ? 1 : null) != null) {
                    if ((this.b == abzc.b ? 1 : null) != null) {
                        if ((this.c == abzc.c ? 1 : null) != null && akcr.a(this.d, abzc.d)) {
                            if ((this.e == abzc.e ? 1 : null) != null) {
                                if ((this.f == abzc.f ? 1 : null) != null && akcr.a(this.g, abzc.g)) {
                                    if ((this.h == abzc.h ? 1 : null) != null) {
                                        if ((this.i == abzc.i ? 1 : null) != null && akcr.a(this.j, abzc.j)) {
                                            if ((this.k == abzc.k ? 1 : null) != null) {
                                                if ((this.l == abzc.l ? 1 : null) != null) {
                                                    if ((this.m == abzc.m ? 1 : null) != null && akcr.a(this.n, abzc.n)) {
                                                        if ((this.o == abzc.o ? 1 : null) != null && akcr.a(this.p, abzc.p) && akcr.a(this.q, abzc.q)) {
                                                            if ((this.r == abzc.r ? 1 : null) != null && akcr.a(this.s, abzc.s)) {
                                                                if ((this.t == abzc.t ? 1 : null) != null && akcr.a(this.u, abzc.u)) {
                                                                    if ((this.v == abzc.v ? 1 : null) != null) {
                                                                        if ((this.w == abzc.w ? 1 : null) != null) {
                                                                            if ((this.x == abzc.x ? 1 : null) != null && akcr.a(this.y, abzc.y) && akcr.a(this.z, abzc.z)) {
                                                                                if ((this.A == abzc.A ? 1 : null) != null) {
                                                                                    if ((this.B == abzc.B ? 1 : null) != null) {
                                                                                        if ((this.C == abzc.C ? 1 : null) != null) {
                                                                                            if ((this.D == abzc.D ? 1 : null) != null) {
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.d;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j3 = this.e;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.f;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.g;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.h;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.i;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.j;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.k;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.l;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.m;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.n;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.o;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.p;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.r;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.s;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.t;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.u;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        j3 = this.v;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.w;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.x;
        i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        str = this.y;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.z;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        j2 = this.A;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.B;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.C;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.D;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StickersMetrics(stickerCount=");
        stringBuilder.append(this.a);
        stringBuilder.append(", stickerBitmojiCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", stickerBitmojiFromRecentsCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", stickerBitmojiList=");
        stringBuilder.append(this.d);
        stringBuilder.append(", stickerSnapchatCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", stickerSnapchatFromRecentsCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(", stickerSnapchatList=");
        stringBuilder.append(this.g);
        stringBuilder.append(", stickerEmojiCount=");
        stringBuilder.append(this.h);
        stringBuilder.append(", stickerEmojiFromRecentsCount=");
        stringBuilder.append(this.i);
        stringBuilder.append(", stickerEmojiList=");
        stringBuilder.append(this.j);
        stringBuilder.append(", stickerCustomCount=");
        stringBuilder.append(this.k);
        stringBuilder.append(", stickerCustomFromRecentsCount=");
        stringBuilder.append(this.l);
        stringBuilder.append(", stickerInfoCount=");
        stringBuilder.append(this.m);
        stringBuilder.append(", stickerInfoList=");
        stringBuilder.append(this.n);
        stringBuilder.append(", stickerContextualCount=");
        stringBuilder.append(this.o);
        stringBuilder.append(", stickerContextualList=");
        stringBuilder.append(this.p);
        stringBuilder.append(", widgetValueList=");
        stringBuilder.append(this.q);
        stringBuilder.append(", stickerUnlockedCount=");
        stringBuilder.append(this.r);
        stringBuilder.append(", stickerUnlockedList=");
        stringBuilder.append(this.s);
        stringBuilder.append(", stickerGiphyCount=");
        stringBuilder.append(this.t);
        stringBuilder.append(", stickerGiphyList=");
        stringBuilder.append(this.u);
        stringBuilder.append(", stickerGeoCount=");
        stringBuilder.append(this.v);
        stringBuilder.append(", stickerGeoBitmojiCount=");
        stringBuilder.append(this.w);
        stringBuilder.append(", stickerGeoBitmojiFromRecentsCount=");
        stringBuilder.append(this.x);
        stringBuilder.append(", stickerGeoBitmojiList=");
        stringBuilder.append(this.y);
        stringBuilder.append(", stickerPackIds=");
        stringBuilder.append(this.z);
        stringBuilder.append(", stickerFromSearchCount=");
        stringBuilder.append(this.A);
        stringBuilder.append(", stickerAutoGeneratedUsageCount=");
        stringBuilder.append(this.B);
        stringBuilder.append(", animatedStickerCount=");
        stringBuilder.append(this.C);
        stringBuilder.append(", pinnedStickerCount=");
        stringBuilder.append(this.D);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
