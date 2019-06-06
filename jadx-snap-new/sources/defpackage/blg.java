package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blg */
public final class blg implements Parcelable {
    public static final Creator<blg> CREATOR = new 1();
    private int A;
    public final String a;
    public final int b;
    public final String c;
    public final bqp d;
    public final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final bnb i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    public final int p;
    public final byte[] q;
    public final bzr r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final String y;
    public final int z;

    /* renamed from: blg$1 */
    static class 1 implements Creator<blg> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new blg(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new blg[i];
        }
    }

    blg(Parcel parcel) {
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readInt();
        this.g = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.q = bzo.a(parcel) ? parcel.createByteArray() : null;
        this.p = parcel.readInt();
        this.r = (bzr) parcel.readParcelable(bzr.class.getClassLoader());
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.j = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (bnb) parcel.readParcelable(bnb.class.getClassLoader());
        this.d = (bqp) parcel.readParcelable(bqp.class.getClassLoader());
    }

    public blg(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, bzr bzr, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, bnb bnb, bqp bqp) {
        this.a = str;
        this.e = str2;
        this.f = str3;
        this.c = str4;
        this.b = i;
        this.g = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        int i14 = 0;
        int i15 = i5;
        if (i15 == -1) {
            i15 = 0;
        }
        this.n = i15;
        this.o = f2 == -1.0f ? 1.0f : f2;
        this.q = bArr;
        this.p = i6;
        this.r = bzr;
        this.s = i7;
        this.t = i8;
        this.u = i9;
        i15 = i10;
        if (i15 == -1) {
            i15 = 0;
        }
        this.v = i15;
        i15 = i11;
        if (i15 != -1) {
            i14 = i15;
        }
        this.w = i14;
        this.x = i12;
        this.y = str5;
        this.z = i13;
        this.j = j;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = bnb;
        this.d = bqp;
    }

    public static blg a(String str, long j) {
        return new blg(null, null, str, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static blg a(String str, String str2) {
        return blg.a(str, str2, 0, null, null);
    }

    public static blg a(String str, String str2, int i, String str3, int i2) {
        return blg.a(str, str2, i, str3, i2, null, Long.MAX_VALUE, Collections.emptyList());
    }

    public static blg a(String str, String str2, int i, String str3, int i2, bnb bnb, long j, List<byte[]> list) {
        return new blg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, i2, j, list, bnb, null);
    }

    public static blg a(String str, String str2, int i, String str3, bnb bnb) {
        return blg.a(str, str2, i, str3, -1, bnb, Long.MAX_VALUE, Collections.emptyList());
    }

    public static blg a(String str, String str2, int i, List<byte[]> list, String str3, bnb bnb) {
        return new blg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, -1, Long.MAX_VALUE, list, bnb, null);
    }

    public static blg a(String str, String str2, long j) {
        return blg.a(null, str, 0, str2, -1, null, j, Collections.emptyList());
    }

    public static blg a(String str, String str2, String str3, int i, int i2, int i3, float f, List<byte[]> list, float f2) {
        return blg.a(str, str2, str3, i, -1, i2, i3, f, (List) list, -1, f2, null, -1, null, null);
    }

    public static blg a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, bzr bzr, bnb bnb) {
        return new blg(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bzr, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, bnb, null);
    }

    public static blg a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, bnb bnb, int i8, String str4, bqp bqp) {
        return new blg(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, bnb, bqp);
    }

    public static blg a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, bnb bnb, int i6, String str4) {
        return blg.a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, (List) list, bnb, i6, str4, null);
    }

    public static blg a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, bnb bnb, int i5, String str4) {
        return blg.a(str, str2, str3, i, i2, i3, i4, -1, list, bnb, i5, str4);
    }

    public static blg a(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, int i4) {
        return new blg(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static blg a(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5) {
        return new blg(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static blg a(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new blg(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static blg a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new blg(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public static blg b(String str, String str2) {
        return new blg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public final int a() {
        int i = this.k;
        if (i != -1) {
            int i2 = this.l;
            if (i2 != -1) {
                return i * i2;
            }
        }
        return -1;
    }

    public final blg a(int i) {
        int i2 = i;
        return new blg(this.a, this.e, this.f, this.c, this.b, i2, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.j, this.h, this.i, this.d);
    }

    public final blg a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        return new blg(this.a, this.e, this.f, this.c, this.b, this.g, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, i3, i4, this.x, this.y, this.z, this.j, this.h, this.i, this.d);
    }

    public final blg a(long j) {
        return new blg(this.a, this.e, this.f, this.c, this.b, this.g, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, j, this.h, this.i, this.d);
    }

    public final blg a(bnb bnb) {
        bnb bnb2 = bnb;
        return new blg(this.a, this.e, this.f, this.c, this.b, this.g, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.j, this.h, bnb2, this.d);
    }

    public final blg a(bqp bqp) {
        bqp bqp2 = bqp;
        return new blg(this.a, this.e, this.f, this.c, this.b, this.g, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.j, this.h, this.i, bqp2);
    }

    public final blg a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        return new blg(str, this.e, str2, str3, i, this.g, i2, i3, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, i4, str4, this.z, this.j, this.h, this.i, this.d);
    }

    public final boolean a(blg blg) {
        if (this.h.size() != blg.h.size()) {
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!Arrays.equals((byte[]) this.h.get(i), (byte[]) blg.h.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            blg blg = (blg) obj;
            return this.b == blg.b && this.g == blg.g && this.k == blg.k && this.l == blg.l && this.m == blg.m && this.n == blg.n && this.o == blg.o && this.p == blg.p && this.s == blg.s && this.t == blg.t && this.u == blg.u && this.v == blg.v && this.w == blg.w && this.j == blg.j && this.x == blg.x && bzo.a(this.a, blg.a) && bzo.a(this.y, blg.y) && this.z == blg.z && bzo.a(this.e, blg.e) && bzo.a(this.f, blg.f) && bzo.a(this.c, blg.c) && bzo.a(this.i, blg.i) && bzo.a(this.d, blg.d) && bzo.a(this.r, blg.r) && Arrays.equals(this.q, blg.q) && a(blg);
        }
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.a;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.e;
            hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            str2 = this.f;
            hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            str2 = this.c;
            hashCode = (((((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.b) * 31) + this.k) * 31) + this.l) * 31) + this.s) * 31) + this.t) * 31;
            str2 = this.y;
            hashCode = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.z) * 31;
            bnb bnb = this.i;
            hashCode = (hashCode + (bnb == null ? 0 : bnb.hashCode())) * 31;
            bqp bqp = this.d;
            if (bqp != null) {
                i = bqp.hashCode();
            }
            this.A = hashCode + i;
        }
        return this.A;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Format(");
        stringBuilder.append(this.a);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.e);
        stringBuilder.append(str);
        stringBuilder.append(this.f);
        stringBuilder.append(str);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        stringBuilder.append(this.y);
        stringBuilder.append(", [");
        stringBuilder.append(this.k);
        stringBuilder.append(str);
        stringBuilder.append(this.l);
        stringBuilder.append(str);
        stringBuilder.append(this.m);
        stringBuilder.append("], [");
        stringBuilder.append(this.s);
        stringBuilder.append(str);
        stringBuilder.append(this.t);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        bzo.a(parcel, this.q != null);
        byte[] bArr = this.q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.p);
        parcel.writeParcelable(this.r, i);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.j);
        i = this.h.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeByteArray((byte[]) this.h.get(i2));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
