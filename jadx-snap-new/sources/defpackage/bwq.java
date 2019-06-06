package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.bwt.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bwq */
public final class bwq extends bws {
    private static final int[] b = new int[0];
    private final a c;
    private final AtomicReference<c> d;

    /* renamed from: bwq$c */
    public static final class c implements Parcelable {
        public static final Creator<c> CREATOR = new 1();
        public static final c a = new c();
        final SparseArray<Map<bss, d>> b;
        public final String c;
        public final String d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;
        public final int k;
        public final int l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final int r;
        private final SparseBooleanArray s;

        /* renamed from: bwq$c$1 */
        static class 1 implements Creator<c> {
            1() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        }

        private c() {
            this(new SparseArray(), new SparseBooleanArray());
        }

        c(Parcel parcel) {
            this.b = c.a(parcel);
            this.s = parcel.readSparseBooleanArray();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = bzo.a(parcel);
            this.f = parcel.readInt();
            this.n = bzo.a(parcel);
            this.o = bzo.a(parcel);
            this.p = bzo.a(parcel);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = bzo.a(parcel);
            this.q = bzo.a(parcel);
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = bzo.a(parcel);
            this.r = parcel.readInt();
        }

        private c(SparseArray<Map<bss, d>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            this.b = sparseArray;
            this.s = sparseBooleanArray;
            this.c = bzo.a(null);
            this.d = bzo.a(null);
            this.e = false;
            this.f = 0;
            this.n = false;
            this.o = false;
            this.p = true;
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = true;
            this.q = true;
            this.k = Integer.MAX_VALUE;
            this.l = Integer.MAX_VALUE;
            this.m = true;
            this.r = 0;
        }

        private static SparseArray<Map<bss, d>> a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray sparseArray = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((bss) parcel.readParcelable(bss.class.getClassLoader()), (d) parcel.readParcelable(d.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        public final boolean a(int i) {
            return this.s.get(i);
        }

        public final int describeContents() {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:68:0x0109 A:{LOOP_END, LOOP:1: B:53:0x00b2->B:68:0x0109} */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00af A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x010f A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00a1  */
        public final boolean equals(java.lang.Object r11) {
            /*
            r10 = this;
            r0 = 1;
            if (r10 != r11) goto L_0x0004;
        L_0x0003:
            return r0;
        L_0x0004:
            r1 = 0;
            if (r11 == 0) goto L_0x0110;
        L_0x0007:
            r2 = r10.getClass();
            r3 = r11.getClass();
            if (r2 == r3) goto L_0x0013;
        L_0x0011:
            goto L_0x0110;
        L_0x0013:
            r11 = (defpackage.bwq.c) r11;
            r2 = r10.e;
            r3 = r11.e;
            if (r2 != r3) goto L_0x0110;
        L_0x001b:
            r2 = r10.f;
            r3 = r11.f;
            if (r2 != r3) goto L_0x0110;
        L_0x0021:
            r2 = r10.n;
            r3 = r11.n;
            if (r2 != r3) goto L_0x0110;
        L_0x0027:
            r2 = r10.o;
            r3 = r11.o;
            if (r2 != r3) goto L_0x0110;
        L_0x002d:
            r2 = r10.p;
            r3 = r11.p;
            if (r2 != r3) goto L_0x0110;
        L_0x0033:
            r2 = r10.g;
            r3 = r11.g;
            if (r2 != r3) goto L_0x0110;
        L_0x0039:
            r2 = r10.h;
            r3 = r11.h;
            if (r2 != r3) goto L_0x0110;
        L_0x003f:
            r2 = r10.j;
            r3 = r11.j;
            if (r2 != r3) goto L_0x0110;
        L_0x0045:
            r2 = r10.q;
            r3 = r11.q;
            if (r2 != r3) goto L_0x0110;
        L_0x004b:
            r2 = r10.m;
            r3 = r11.m;
            if (r2 != r3) goto L_0x0110;
        L_0x0051:
            r2 = r10.k;
            r3 = r11.k;
            if (r2 != r3) goto L_0x0110;
        L_0x0057:
            r2 = r10.l;
            r3 = r11.l;
            if (r2 != r3) goto L_0x0110;
        L_0x005d:
            r2 = r10.i;
            r3 = r11.i;
            if (r2 != r3) goto L_0x0110;
        L_0x0063:
            r2 = r10.r;
            r3 = r11.r;
            if (r2 != r3) goto L_0x0110;
        L_0x0069:
            r2 = r10.c;
            r3 = r11.c;
            r2 = android.text.TextUtils.equals(r2, r3);
            if (r2 == 0) goto L_0x0110;
        L_0x0073:
            r2 = r10.d;
            r3 = r11.d;
            r2 = android.text.TextUtils.equals(r2, r3);
            if (r2 == 0) goto L_0x0110;
        L_0x007d:
            r2 = r10.s;
            r3 = r11.s;
            r4 = r2.size();
            r5 = r3.size();
            if (r5 == r4) goto L_0x008d;
        L_0x008b:
            r2 = 0;
            goto L_0x009f;
        L_0x008d:
            r5 = 0;
        L_0x008e:
            if (r5 >= r4) goto L_0x009e;
        L_0x0090:
            r6 = r2.keyAt(r5);
            r6 = r3.indexOfKey(r6);
            if (r6 >= 0) goto L_0x009b;
        L_0x009a:
            goto L_0x008b;
        L_0x009b:
            r5 = r5 + 1;
            goto L_0x008e;
        L_0x009e:
            r2 = 1;
        L_0x009f:
            if (r2 == 0) goto L_0x0110;
        L_0x00a1:
            r2 = r10.b;
            r11 = r11.b;
            r3 = r2.size();
            r4 = r11.size();
            if (r4 == r3) goto L_0x00b1;
        L_0x00af:
            r11 = 0;
            goto L_0x010d;
        L_0x00b1:
            r4 = 0;
        L_0x00b2:
            if (r4 >= r3) goto L_0x010c;
        L_0x00b4:
            r5 = r2.keyAt(r4);
            r5 = r11.indexOfKey(r5);
            if (r5 < 0) goto L_0x00af;
        L_0x00be:
            r6 = r2.valueAt(r4);
            r6 = (java.util.Map) r6;
            r5 = r11.valueAt(r5);
            r5 = (java.util.Map) r5;
            r7 = r6.size();
            r8 = r5.size();
            if (r8 == r7) goto L_0x00d6;
        L_0x00d4:
            r5 = 0;
            goto L_0x0106;
        L_0x00d6:
            r6 = r6.entrySet();
            r6 = r6.iterator();
        L_0x00de:
            r7 = r6.hasNext();
            if (r7 == 0) goto L_0x0105;
        L_0x00e4:
            r7 = r6.next();
            r7 = (java.util.Map.Entry) r7;
            r8 = r7.getKey();
            r8 = (defpackage.bss) r8;
            r9 = r5.containsKey(r8);
            if (r9 == 0) goto L_0x00d4;
        L_0x00f6:
            r7 = r7.getValue();
            r8 = r5.get(r8);
            r7 = defpackage.bzo.a(r7, r8);
            if (r7 != 0) goto L_0x00de;
        L_0x0104:
            goto L_0x00d4;
        L_0x0105:
            r5 = 1;
        L_0x0106:
            if (r5 != 0) goto L_0x0109;
        L_0x0108:
            goto L_0x00af;
        L_0x0109:
            r4 = r4 + 1;
            goto L_0x00b2;
        L_0x010c:
            r11 = 1;
        L_0x010d:
            if (r11 == 0) goto L_0x0110;
        L_0x010f:
            return r0;
        L_0x0110:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int i = ((((((((((((((((((((((((((this.e * 31) + this.f) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.g) * 31) + this.h) * 31) + this.j) * 31) + this.q) * 31) + this.m) * 31) + this.k) * 31) + this.l) * 31) + this.i) * 31) + this.r) * 31;
            String str = this.c;
            int i2 = 0;
            i = (i + (str == null ? 0 : str.hashCode())) * 31;
            str = this.d;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i + i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            SparseArray sparseArray = this.b;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                Map map = (Map) sparseArray.valueAt(i2);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.s);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            bzo.a(parcel, this.e);
            parcel.writeInt(this.f);
            bzo.a(parcel, this.n);
            bzo.a(parcel, this.o);
            bzo.a(parcel, this.p);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            bzo.a(parcel, this.j);
            bzo.a(parcel, this.q);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            bzo.a(parcel, this.m);
            parcel.writeInt(this.r);
        }
    }

    /* renamed from: bwq$b */
    static final class b implements Comparable<b> {
        private final c a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public b(blg blg, c cVar, int i) {
            this.a = cVar;
            this.b = bwq.a(i, false);
            this.c = bwq.a(blg, cVar.c);
            i = 1;
            if ((blg.x & 1) == 0) {
                i = 0;
            }
            this.d = i;
            this.e = blg.s;
            this.f = blg.t;
            this.g = blg.b;
        }

        /* renamed from: a */
        public final int compareTo(b bVar) {
            int i = this.b;
            int i2 = bVar.b;
            if (i != i2) {
                return bwq.a(i, i2);
            }
            i = this.c;
            i2 = bVar.c;
            if (i != i2) {
                return bwq.a(i, i2);
            }
            i = this.d;
            i2 = bVar.d;
            if (i != i2) {
                return bwq.a(i, i2);
            }
            if (this.a.n) {
                return bwq.a(bVar.g, this.g);
            }
            int a;
            i2 = 1;
            if (this.b != 1) {
                i2 = -1;
            }
            i = this.e;
            int i3 = bVar.e;
            if (i == i3) {
                i = this.f;
                i3 = bVar.f;
                if (i == i3) {
                    a = bwq.a(this.g, bVar.g);
                    return i2 * a;
                }
            }
            a = bwq.a(i, i3);
            return i2 * a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g;
            }
        }

        public final int hashCode() {
            return (((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
        }
    }

    /* renamed from: bwq$a */
    static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c);
            }
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: bwq$d */
    public static final class d implements Parcelable {
        public static final Creator<d> CREATOR = new 1();
        public final int a;
        public final int[] b = new int[this.c];
        public final int c;

        /* renamed from: bwq$d$1 */
        static class 1 implements Creator<d> {
            1() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }
        }

        d(Parcel parcel) {
            this.a = parcel.readInt();
            this.c = parcel.readByte();
            parcel.readIntArray(this.b);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                d dVar = (d) obj;
                return this.a == dVar.a && Arrays.equals(this.b, dVar.b);
            }
        }

        public final int hashCode() {
            return (this.a * 31) + Arrays.hashCode(this.b);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
        }
    }

    public bwq() {
        this(null);
    }

    public bwq(a aVar) {
        this.c = aVar;
        this.d = new AtomicReference(c.a);
    }

    private static int a(bsr bsr, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = ((Integer) list.get(i6)).intValue();
            if (bwq.a(bsr.b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    private static int a(bsr bsr, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < bsr.a; i2++) {
            if (bwq.a(bsr.b[i2], iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Missing block: B:8:0x000c, code skipped:
            if (r1 != r3) goto L_0x0012;
     */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
        r0 = 1;
        if (r3 == 0) goto L_0x000f;
    L_0x0003:
        r3 = 0;
        if (r6 <= r7) goto L_0x0008;
    L_0x0006:
        r1 = 1;
        goto L_0x0009;
    L_0x0008:
        r1 = 0;
    L_0x0009:
        if (r4 <= r5) goto L_0x000c;
    L_0x000b:
        r3 = 1;
    L_0x000c:
        if (r1 == r3) goto L_0x000f;
    L_0x000e:
        goto L_0x0012;
    L_0x000f:
        r2 = r5;
        r5 = r4;
        r4 = r2;
    L_0x0012:
        r3 = r6 * r4;
        r1 = r7 * r5;
        if (r3 < r1) goto L_0x0021;
    L_0x0018:
        r3 = new android.graphics.Point;
        r1 = r1 + r6;
        r1 = r1 - r0;
        r1 = r1 / r6;
        r3.<init>(r5, r1);
        return r3;
    L_0x0021:
        r5 = new android.graphics.Point;
        r3 = r3 + r7;
        r3 = r3 - r0;
        r3 = r3 / r7;
        r5.<init>(r3, r4);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq.a(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX WARNING: Missing block: B:40:0x008d, code skipped:
            if (defpackage.bwq.b(r2.b, r14) < 0) goto L_0x008f;
     */
    private static defpackage.bwt a(defpackage.bss r18, int[][] r19, defpackage.bwq.c r20) {
        /*
        r0 = r18;
        r1 = r20;
        r3 = -1;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = -1;
        r10 = -1;
    L_0x000b:
        r11 = r0.b;
        if (r5 >= r11) goto L_0x00ce;
    L_0x000f:
        r11 = r0.c;
        r11 = r11[r5];
        r12 = r1.k;
        r13 = r1.l;
        r14 = r1.m;
        r12 = defpackage.bwq.a(r11, r12, r13, r14);
        r13 = r19[r5];
        r14 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = 0;
    L_0x0025:
        r15 = r11.a;
        if (r6 >= r15) goto L_0x00c2;
    L_0x0029:
        r15 = r13[r6];
        r2 = r1.q;
        r2 = defpackage.bwq.a(r15, r2);
        if (r2 == 0) goto L_0x00bb;
    L_0x0033:
        r2 = r11.b;
        r2 = r2[r6];
        r15 = java.lang.Integer.valueOf(r6);
        r15 = r12.contains(r15);
        r16 = 1;
        if (r15 == 0) goto L_0x0063;
    L_0x0043:
        r15 = r2.k;
        if (r15 == r3) goto L_0x004d;
    L_0x0047:
        r15 = r2.k;
        r4 = r1.g;
        if (r15 > r4) goto L_0x0063;
    L_0x004d:
        r4 = r2.l;
        if (r4 == r3) goto L_0x0057;
    L_0x0051:
        r4 = r2.l;
        r15 = r1.h;
        if (r4 > r15) goto L_0x0063;
    L_0x0057:
        r4 = r2.b;
        if (r4 == r3) goto L_0x0061;
    L_0x005b:
        r4 = r2.b;
        r15 = r1.i;
        if (r4 > r15) goto L_0x0063;
    L_0x0061:
        r4 = 1;
        goto L_0x0064;
    L_0x0063:
        r4 = 0;
    L_0x0064:
        if (r4 != 0) goto L_0x006a;
    L_0x0066:
        r15 = r1.j;
        if (r15 == 0) goto L_0x00bb;
    L_0x006a:
        if (r4 == 0) goto L_0x006e;
    L_0x006c:
        r15 = 2;
        goto L_0x006f;
    L_0x006e:
        r15 = 1;
    L_0x006f:
        r3 = r13[r6];
        r0 = 0;
        r3 = defpackage.bwq.a(r3, r0);
        if (r3 == 0) goto L_0x007a;
    L_0x0078:
        r15 = r15 + 1000;
    L_0x007a:
        if (r15 <= r9) goto L_0x007f;
    L_0x007c:
        r17 = 1;
        goto L_0x0081;
    L_0x007f:
        r17 = 0;
    L_0x0081:
        if (r15 != r9) goto L_0x00b0;
    L_0x0083:
        r0 = r1.n;
        if (r0 == 0) goto L_0x0095;
    L_0x0087:
        r0 = r2.b;
        r0 = defpackage.bwq.b(r0, r14);
        if (r0 >= 0) goto L_0x0092;
    L_0x008f:
        r17 = 1;
        goto L_0x00b0;
    L_0x0092:
        r17 = 0;
        goto L_0x00b0;
    L_0x0095:
        r0 = r2.a();
        if (r0 == r10) goto L_0x00a0;
    L_0x009b:
        r0 = defpackage.bwq.b(r0, r10);
        goto L_0x00a6;
    L_0x00a0:
        r0 = r2.b;
        r0 = defpackage.bwq.b(r0, r14);
    L_0x00a6:
        if (r3 == 0) goto L_0x00ad;
    L_0x00a8:
        if (r4 == 0) goto L_0x00ad;
    L_0x00aa:
        if (r0 <= 0) goto L_0x0092;
    L_0x00ac:
        goto L_0x008f;
    L_0x00ad:
        if (r0 >= 0) goto L_0x0092;
    L_0x00af:
        goto L_0x008f;
    L_0x00b0:
        if (r17 == 0) goto L_0x00bb;
    L_0x00b2:
        r14 = r2.b;
        r10 = r2.a();
        r8 = r6;
        r7 = r11;
        r9 = r15;
    L_0x00bb:
        r6 = r6 + 1;
        r3 = -1;
        r0 = r18;
        goto L_0x0025;
    L_0x00c2:
        r5 = r5 + 1;
        r3 = -1;
        r0 = r18;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r14;
        goto L_0x000b;
    L_0x00ce:
        if (r6 != 0) goto L_0x00d2;
    L_0x00d0:
        r0 = 0;
        return r0;
    L_0x00d2:
        r0 = new bwr;
        r0.<init>(r6, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq.a(bss, int[][], bwq$c):bwt");
    }

    private static bwt a(bss bss, int[][] iArr, c cVar, a aVar) {
        int i;
        bss bss2 = bss;
        c cVar2 = cVar;
        a aVar2 = aVar;
        bwt bwt = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < bss2.b) {
            bsr bsr = bss2.c[i2];
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            b bVar = bwt;
            i = i3;
            for (i3 = 0; i3 < bsr.a; i3++) {
                if (bwq.a(iArr2[i3], cVar2.q)) {
                    b bVar2 = new b(bsr.b[i3], cVar2, iArr2[i3]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i2;
                        i5 = i3;
                        bVar = bVar2;
                    }
                }
            }
            i2++;
            i3 = i;
            Object bwt2 = bVar;
            i4 = i5;
        }
        if (i3 == -1) {
            return null;
        }
        bsr bsr2 = bss2.c[i3];
        if (!(cVar2.n || aVar2 == null)) {
            int[] iArr3;
            int[] iArr4 = iArr[i3];
            boolean z = cVar2.o;
            HashSet hashSet = new HashSet();
            Object obj = null;
            i = 0;
            for (i3 = 0; i3 < bsr2.a; i3++) {
                blg blg = bsr2.b[i3];
                a aVar3 = new a(blg.s, blg.t, z ? null : blg.f);
                if (hashSet.add(aVar3)) {
                    int a = bwq.a(bsr2, iArr4, aVar3);
                    if (a > i) {
                        i = a;
                        obj = aVar3;
                    }
                }
            }
            if (i > 1) {
                iArr3 = new int[i];
                int i6 = 0;
                for (int i7 = 0; i7 < bsr2.a; i7++) {
                    if (bwq.a(bsr2.b[i7], iArr4[i7], (a) byo.a(obj))) {
                        i2 = i6 + 1;
                        iArr3[i6] = i7;
                        i6 = i2;
                    }
                }
            } else {
                iArr3 = b;
            }
            if (iArr3.length > 0) {
                return aVar2.a(bsr2, iArr3);
            }
        }
        return new bwr(bsr2, i4);
    }

    private static List<Integer> a(bsr bsr, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(bsr.a);
        for (int i3 = 0; i3 < bsr.a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < bsr.a; i5++) {
                blg blg = bsr.b[i5];
                if (blg.k > 0 && blg.l > 0) {
                    Point a = bwq.a(z, i, i2, blg.k, blg.l);
                    int i6 = blg.k * blg.l;
                    if (blg.k >= ((int) (((float) a.x) * 0.98f)) && blg.l >= ((int) (((float) a.y) * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (i = arrayList.size() - 1; i >= 0; i--) {
                    i2 = bsr.b[((Integer) arrayList.get(i)).intValue()].a();
                    if (i2 == -1 || i2 > i4) {
                        arrayList.remove(i);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0056 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    private static void a(defpackage.bws.a r15, int[][][] r16, defpackage.blu[] r17, defpackage.bwt[] r18, int r19) {
        /*
        r0 = r15;
        r1 = r19;
        if (r1 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2 = -1;
        r3 = 0;
        r4 = 0;
        r5 = -1;
        r6 = -1;
    L_0x000b:
        r7 = r0.a;
        r8 = 1;
        if (r4 >= r7) goto L_0x0059;
    L_0x0010:
        r7 = r0.b;
        r7 = r7[r4];
        r9 = r18[r4];
        if (r7 == r8) goto L_0x001b;
    L_0x0018:
        r10 = 2;
        if (r7 != r10) goto L_0x0056;
    L_0x001b:
        if (r9 == 0) goto L_0x0056;
    L_0x001d:
        r10 = r16[r4];
        r11 = r0.c;
        r11 = r11[r4];
        if (r9 != 0) goto L_0x0027;
    L_0x0025:
        r9 = 0;
        goto L_0x0048;
    L_0x0027:
        r12 = r9.d();
        r11 = r11.a(r12);
        r12 = 0;
    L_0x0030:
        r13 = r9.e();
        if (r12 >= r13) goto L_0x0047;
    L_0x0036:
        r13 = r10[r11];
        r14 = r9.b(r12);
        r13 = r13[r14];
        r14 = 32;
        r13 = r13 & r14;
        if (r13 == r14) goto L_0x0044;
    L_0x0043:
        goto L_0x0025;
    L_0x0044:
        r12 = r12 + 1;
        goto L_0x0030;
    L_0x0047:
        r9 = 1;
    L_0x0048:
        if (r9 == 0) goto L_0x0056;
    L_0x004a:
        if (r7 != r8) goto L_0x0051;
    L_0x004c:
        if (r6 == r2) goto L_0x004f;
    L_0x004e:
        goto L_0x0053;
    L_0x004f:
        r6 = r4;
        goto L_0x0056;
    L_0x0051:
        if (r5 == r2) goto L_0x0055;
    L_0x0053:
        r0 = 0;
        goto L_0x005a;
    L_0x0055:
        r5 = r4;
    L_0x0056:
        r4 = r4 + 1;
        goto L_0x000b;
    L_0x0059:
        r0 = 1;
    L_0x005a:
        if (r6 == r2) goto L_0x005f;
    L_0x005c:
        if (r5 == r2) goto L_0x005f;
    L_0x005e:
        r3 = 1;
    L_0x005f:
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x006b;
    L_0x0062:
        r0 = new blu;
        r0.<init>(r1);
        r17[r6] = r0;
        r17[r5] = r0;
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq.a(bws$a, int[][][], blu[], bwt[], int):void");
    }

    protected static boolean a(int i, boolean z) {
        i &= 7;
        return i == 4 || (z && i == 3);
    }

    private static boolean a(blg blg, int i, a aVar) {
        return bwq.a(i, false) && blg.s == aVar.a && blg.t == aVar.b && (aVar.c == null || TextUtils.equals(aVar.c, blg.f));
    }

    protected static boolean a(blg blg, String str) {
        return str != null && TextUtils.equals(str, bzo.a(blg.y));
    }

    private static boolean a(blg blg, String str, int i, int i2, int i3, int i4, int i5) {
        return bwq.a(i, false) && (i & i2) != 0 && ((str == null || bzo.a(blg.f, (Object) str)) && ((blg.k == -1 || blg.k <= i3) && ((blg.l == -1 || blg.l <= i4) && (blg.b == -1 || blg.b <= i5))));
    }

    private static int b(int i, int i2) {
        return i == -1 ? i2 == -1 ? 0 : -1 : i2 == -1 ? 1 : i - i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Missing block: B:26:0x005f, code skipped:
            if (r14 != null) goto L_0x0074;
     */
    private static defpackage.bwt b(defpackage.bss r16, int[][] r17, defpackage.bwq.c r18) {
        /*
        r0 = r16;
        r1 = r18;
        r2 = 0;
        r3 = 0;
        r5 = r2;
        r4 = 0;
        r6 = 0;
        r7 = 0;
    L_0x000a:
        r8 = r0.b;
        if (r4 >= r8) goto L_0x0099;
    L_0x000e:
        r8 = r0.c;
        r8 = r8[r4];
        r9 = r17[r4];
        r10 = r7;
        r7 = r6;
        r6 = r5;
        r5 = 0;
    L_0x0018:
        r11 = r8.a;
        if (r5 >= r11) goto L_0x0092;
    L_0x001c:
        r11 = r9[r5];
        r12 = r1.q;
        r11 = defpackage.bwq.a(r11, r12);
        if (r11 == 0) goto L_0x008f;
    L_0x0026:
        r11 = r8.b;
        r11 = r11[r5];
        r12 = r11.x;
        r13 = r1.f;
        r13 = r13 ^ -1;
        r12 = r12 & r13;
        r13 = r12 & 1;
        if (r13 == 0) goto L_0x0037;
    L_0x0035:
        r13 = 1;
        goto L_0x0038;
    L_0x0037:
        r13 = 0;
    L_0x0038:
        r12 = r12 & 2;
        if (r12 == 0) goto L_0x003e;
    L_0x003c:
        r12 = 1;
        goto L_0x003f;
    L_0x003e:
        r12 = 0;
    L_0x003f:
        r15 = r1.d;
        r15 = defpackage.bwq.a(r11, r15);
        if (r15 != 0) goto L_0x0074;
    L_0x0047:
        r14 = r1.e;
        if (r14 == 0) goto L_0x0062;
    L_0x004b:
        r14 = r11.y;
        r14 = android.text.TextUtils.isEmpty(r14);
        if (r14 != 0) goto L_0x005e;
    L_0x0053:
        r14 = "und";
        r14 = defpackage.bwq.a(r11, r14);
        if (r14 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x005e;
    L_0x005c:
        r14 = 0;
        goto L_0x005f;
    L_0x005e:
        r14 = 1;
    L_0x005f:
        if (r14 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0074;
    L_0x0062:
        if (r13 == 0) goto L_0x0066;
    L_0x0064:
        r14 = 3;
        goto L_0x0080;
    L_0x0066:
        if (r12 == 0) goto L_0x008f;
    L_0x0068:
        r12 = r1.c;
        r11 = defpackage.bwq.a(r11, r12);
        if (r11 == 0) goto L_0x0072;
    L_0x0070:
        r14 = 2;
        goto L_0x0080;
    L_0x0072:
        r14 = 1;
        goto L_0x0080;
    L_0x0074:
        if (r13 == 0) goto L_0x0079;
    L_0x0076:
        r11 = 8;
        goto L_0x007e;
    L_0x0079:
        if (r12 != 0) goto L_0x007d;
    L_0x007b:
        r11 = 6;
        goto L_0x007e;
    L_0x007d:
        r11 = 4;
    L_0x007e:
        r14 = r11 + r15;
    L_0x0080:
        r11 = r9[r5];
        r11 = defpackage.bwq.a(r11, r3);
        if (r11 == 0) goto L_0x008a;
    L_0x0088:
        r14 = r14 + 1000;
    L_0x008a:
        if (r14 <= r10) goto L_0x008f;
    L_0x008c:
        r7 = r5;
        r6 = r8;
        r10 = r14;
    L_0x008f:
        r5 = r5 + 1;
        goto L_0x0018;
    L_0x0092:
        r4 = r4 + 1;
        r5 = r6;
        r6 = r7;
        r7 = r10;
        goto L_0x000a;
    L_0x0099:
        if (r5 != 0) goto L_0x009c;
    L_0x009b:
        return r2;
    L_0x009c:
        r0 = new bwr;
        r0.<init>(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq.b(bss, int[][], bwq$c):bwt");
    }

    private static void b(bsr bsr, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            if (!bwq.a(bsr.b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    private static bwt c(bss bss, int[][] iArr, c cVar) {
        bsr bsr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < bss.b) {
            bsr bsr2 = bss.c[i];
            int[] iArr2 = iArr[i];
            int i4 = i3;
            i3 = i2;
            bsr bsr3 = bsr;
            for (int i5 = 0; i5 < bsr2.a; i5++) {
                if (bwq.a(iArr2[i5], cVar.q)) {
                    int i6 = 1;
                    if (((bsr2.b[i5].x & 1) != 0 ? 1 : null) != null) {
                        i6 = 2;
                    }
                    if (bwq.a(iArr2[i5], false)) {
                        i6 += MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                    }
                    if (i6 > i4) {
                        i3 = i5;
                        bsr3 = bsr2;
                        i4 = i6;
                    }
                }
            }
            i++;
            bsr = bsr3;
            i2 = i3;
            i3 = i4;
        }
        return bsr == null ? null : new bwr(bsr, i2);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa A:{LOOP_END, LOOP:1: B:20:0x0047->B:46:0x00fa} */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x00ee A:{SYNTHETIC} */
    public final android.util.Pair<defpackage.blu[], defpackage.bwt[]> a(defpackage.bws.a r34, int[][][] r35, int[] r36) {
        /*
        r33 = this;
        r0 = r33;
        r1 = r34;
        r2 = r35;
        r3 = r0.d;
        r3 = r3.get();
        r3 = (defpackage.bwq.c) r3;
        r4 = r1.a;
        r5 = r1.a;
        r6 = new defpackage.bwt[r5];
        r8 = 0;
        r9 = 0;
        r10 = 0;
    L_0x0017:
        r11 = 2;
        if (r8 >= r5) goto L_0x0162;
    L_0x001a:
        r14 = r1.b;
        r14 = r14[r8];
        if (r11 != r14) goto L_0x0148;
    L_0x0020:
        if (r9 != 0) goto L_0x012b;
    L_0x0022:
        r9 = r1.c;
        r9 = r9[r8];
        r14 = r2[r8];
        r15 = r36[r8];
        r7 = r0.c;
        r12 = r3.n;
        if (r12 != 0) goto L_0x0110;
    L_0x0030:
        if (r7 == 0) goto L_0x0110;
    L_0x0032:
        r12 = r3.p;
        if (r12 == 0) goto L_0x0039;
    L_0x0036:
        r12 = 24;
        goto L_0x003b;
    L_0x0039:
        r12 = 16;
    L_0x003b:
        r13 = r3.o;
        if (r13 == 0) goto L_0x0045;
    L_0x003f:
        r13 = r15 & r12;
        if (r13 == 0) goto L_0x0045;
    L_0x0043:
        r13 = 1;
        goto L_0x0046;
    L_0x0045:
        r13 = 0;
    L_0x0046:
        r15 = 0;
    L_0x0047:
        r11 = r9.b;
        if (r15 >= r11) goto L_0x0110;
    L_0x004b:
        r11 = r9.c;
        r11 = r11[r15];
        r25 = r14[r15];
        r26 = r4;
        r4 = r3.g;
        r0 = r3.h;
        r2 = r3.i;
        r27 = r5;
        r5 = r3.k;
        r28 = r10;
        r10 = r3.l;
        r1 = r3.m;
        r29 = r6;
        r6 = r11.a;
        r30 = r8;
        r8 = 2;
        if (r6 >= r8) goto L_0x0071;
    L_0x006c:
        r0 = b;
        r32 = r13;
        goto L_0x00eb;
    L_0x0071:
        r1 = defpackage.bwq.a(r11, r5, r10, r1);
        r5 = r1.size();
        if (r5 >= r8) goto L_0x007c;
    L_0x007b:
        goto L_0x006c;
    L_0x007c:
        if (r13 != 0) goto L_0x00c8;
    L_0x007e:
        r5 = new java.util.HashSet;
        r5.<init>();
        r6 = 0;
        r10 = 0;
        r31 = 0;
    L_0x0087:
        r8 = r1.size();
        if (r6 >= r8) goto L_0x00c3;
    L_0x008d:
        r8 = r1.get(r6);
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r32 = r13;
        r13 = r11.b;
        r8 = r13[r8];
        r8 = r8.f;
        r13 = r5.add(r8);
        if (r13 == 0) goto L_0x00be;
    L_0x00a5:
        r16 = r11;
        r17 = r25;
        r18 = r12;
        r19 = r8;
        r20 = r4;
        r21 = r0;
        r22 = r2;
        r23 = r1;
        r13 = defpackage.bwq.a(r16, r17, r18, r19, r20, r21, r22, r23);
        if (r13 <= r10) goto L_0x00be;
    L_0x00bb:
        r31 = r8;
        r10 = r13;
    L_0x00be:
        r6 = r6 + 1;
        r13 = r32;
        goto L_0x0087;
    L_0x00c3:
        r32 = r13;
        r19 = r31;
        goto L_0x00cc;
    L_0x00c8:
        r32 = r13;
        r19 = 0;
    L_0x00cc:
        r16 = r11;
        r17 = r25;
        r18 = r12;
        r20 = r4;
        r21 = r0;
        r22 = r2;
        r23 = r1;
        defpackage.bwq.b(r16, r17, r18, r19, r20, r21, r22, r23);
        r0 = r1.size();
        r2 = 2;
        if (r0 >= r2) goto L_0x00e7;
    L_0x00e4:
        r0 = b;
        goto L_0x00eb;
    L_0x00e7:
        r0 = defpackage.bzo.a(r1);
    L_0x00eb:
        r1 = r0.length;
        if (r1 <= 0) goto L_0x00fa;
    L_0x00ee:
        r1 = defpackage.byo.a(r7);
        r1 = (defpackage.bwt.a) r1;
        r0 = r1.a(r11, r0);
        r12 = r0;
        goto L_0x011b;
    L_0x00fa:
        r15 = r15 + 1;
        r0 = r33;
        r1 = r34;
        r2 = r35;
        r4 = r26;
        r5 = r27;
        r10 = r28;
        r6 = r29;
        r8 = r30;
        r13 = r32;
        goto L_0x0047;
    L_0x0110:
        r26 = r4;
        r27 = r5;
        r29 = r6;
        r30 = r8;
        r28 = r10;
        r12 = 0;
    L_0x011b:
        if (r12 != 0) goto L_0x0121;
    L_0x011d:
        r12 = defpackage.bwq.a(r9, r14, r3);
    L_0x0121:
        r29[r30] = r12;
        r0 = r29[r30];
        if (r0 == 0) goto L_0x0129;
    L_0x0127:
        r9 = 1;
        goto L_0x0135;
    L_0x0129:
        r9 = 0;
        goto L_0x0135;
    L_0x012b:
        r26 = r4;
        r27 = r5;
        r29 = r6;
        r30 = r8;
        r28 = r10;
    L_0x0135:
        r0 = r34;
        r1 = r0.c;
        r1 = r1[r30];
        r1 = r1.b;
        if (r1 <= 0) goto L_0x0142;
    L_0x013f:
        r24 = 1;
        goto L_0x0144;
    L_0x0142:
        r24 = 0;
    L_0x0144:
        r1 = r28 | r24;
        r10 = r1;
        goto L_0x0153;
    L_0x0148:
        r0 = r1;
        r26 = r4;
        r27 = r5;
        r29 = r6;
        r30 = r8;
        r28 = r10;
    L_0x0153:
        r8 = r30 + 1;
        r2 = r35;
        r1 = r0;
        r4 = r26;
        r5 = r27;
        r6 = r29;
        r0 = r33;
        goto L_0x0017;
    L_0x0162:
        r0 = r1;
        r26 = r4;
        r29 = r6;
        r28 = r10;
        r1 = r5;
        r2 = 0;
        r4 = 0;
        r5 = 0;
    L_0x016d:
        if (r2 >= r1) goto L_0x01cd;
    L_0x016f:
        r6 = r0.b;
        r6 = r6[r2];
        r7 = 1;
        if (r6 == r7) goto L_0x01a8;
    L_0x0176:
        r7 = 2;
        if (r6 == r7) goto L_0x01a5;
    L_0x0179:
        r8 = 3;
        if (r6 == r8) goto L_0x018b;
    L_0x017c:
        r6 = r0.c;
        r6 = r6[r2];
        r8 = r35;
        r9 = r8[r2];
        r6 = defpackage.bwq.c(r6, r9, r3);
        r29[r2] = r6;
        goto L_0x01a2;
    L_0x018b:
        r8 = r35;
        if (r5 != 0) goto L_0x01a2;
    L_0x018f:
        r5 = r0.c;
        r5 = r5[r2];
        r6 = r8[r2];
        r5 = defpackage.bwq.b(r5, r6, r3);
        r29[r2] = r5;
        r5 = r29[r2];
        if (r5 == 0) goto L_0x01a1;
    L_0x019f:
        r5 = 1;
        goto L_0x01a2;
    L_0x01a1:
        r5 = 0;
    L_0x01a2:
        r9 = r33;
        goto L_0x01ca;
    L_0x01a5:
        r8 = r35;
        goto L_0x01a2;
    L_0x01a8:
        r8 = r35;
        r7 = 2;
        if (r4 != 0) goto L_0x01a2;
    L_0x01ad:
        r4 = r0.c;
        r4 = r4[r2];
        r6 = r8[r2];
        if (r28 == 0) goto L_0x01b9;
    L_0x01b5:
        r12 = 0;
        r9 = r33;
        goto L_0x01bd;
    L_0x01b9:
        r9 = r33;
        r12 = r9.c;
    L_0x01bd:
        r4 = defpackage.bwq.a(r4, r6, r3, r12);
        r29[r2] = r4;
        r4 = r29[r2];
        if (r4 == 0) goto L_0x01c9;
    L_0x01c7:
        r4 = 1;
        goto L_0x01ca;
    L_0x01c9:
        r4 = 0;
    L_0x01ca:
        r2 = r2 + 1;
        goto L_0x016d;
    L_0x01cd:
        r9 = r33;
        r8 = r35;
        r1 = r26;
        r2 = 0;
    L_0x01d4:
        if (r2 >= r1) goto L_0x024e;
    L_0x01d6:
        r4 = r3.a(r2);
        if (r4 == 0) goto L_0x01e4;
    L_0x01dc:
        r4 = 0;
        r29[r2] = r4;
        r5 = r4;
    L_0x01e0:
        r7 = 1;
        r24 = 0;
        goto L_0x024b;
    L_0x01e4:
        r4 = r0.c;
        r4 = r4[r2];
        r5 = r3.b;
        r5 = r5.get(r2);
        r5 = (java.util.Map) r5;
        if (r5 == 0) goto L_0x01fa;
    L_0x01f2:
        r5 = r5.containsKey(r4);
        if (r5 == 0) goto L_0x01fa;
    L_0x01f8:
        r5 = 1;
        goto L_0x01fb;
    L_0x01fa:
        r5 = 0;
    L_0x01fb:
        if (r5 == 0) goto L_0x0249;
    L_0x01fd:
        r5 = r3.b;
        r5 = r5.get(r2);
        r5 = (java.util.Map) r5;
        if (r5 == 0) goto L_0x020f;
    L_0x0207:
        r5 = r5.get(r4);
        r12 = r5;
        r12 = (defpackage.bwq.d) r12;
        goto L_0x0210;
    L_0x020f:
        r12 = 0;
    L_0x0210:
        if (r12 != 0) goto L_0x0216;
    L_0x0212:
        r5 = 0;
        r29[r2] = r5;
        goto L_0x01e0;
    L_0x0216:
        r5 = 0;
        r6 = r12.c;
        r7 = 1;
        if (r6 != r7) goto L_0x0230;
    L_0x021c:
        r6 = new bwr;
        r10 = r12.a;
        r4 = r4.c;
        r4 = r4[r10];
        r10 = r12.b;
        r24 = 0;
        r10 = r10[r24];
        r6.<init>(r4, r10);
        r29[r2] = r6;
        goto L_0x024b;
    L_0x0230:
        r24 = 0;
        r6 = r9.c;
        r6 = defpackage.byo.a(r6);
        r6 = (defpackage.bwt.a) r6;
        r10 = r12.a;
        r4 = r4.c;
        r4 = r4[r10];
        r10 = r12.b;
        r4 = r6.a(r4, r10);
        r29[r2] = r4;
        goto L_0x024b;
    L_0x0249:
        r5 = 0;
        goto L_0x01e0;
    L_0x024b:
        r2 = r2 + 1;
        goto L_0x01d4;
    L_0x024e:
        r5 = 0;
        r7 = 1;
        r24 = 0;
        r2 = new defpackage.blu[r1];
        r4 = 0;
    L_0x0255:
        if (r4 >= r1) goto L_0x0276;
    L_0x0257:
        r6 = r3.a(r4);
        if (r6 != 0) goto L_0x026a;
    L_0x025d:
        r6 = r0.b;
        r6 = r6[r4];
        r10 = 5;
        if (r6 == r10) goto L_0x0268;
    L_0x0264:
        r6 = r29[r4];
        if (r6 == 0) goto L_0x026a;
    L_0x0268:
        r6 = 1;
        goto L_0x026b;
    L_0x026a:
        r6 = 0;
    L_0x026b:
        if (r6 == 0) goto L_0x0270;
    L_0x026d:
        r12 = defpackage.blu.a;
        goto L_0x0271;
    L_0x0270:
        r12 = r5;
    L_0x0271:
        r2[r4] = r12;
        r4 = r4 + 1;
        goto L_0x0255;
    L_0x0276:
        r1 = r3.r;
        r3 = r29;
        defpackage.bwq.a(r0, r8, r2, r3, r1);
        r0 = android.util.Pair.create(r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwq.a(bws$a, int[][][], int[]):android.util.Pair");
    }
}
