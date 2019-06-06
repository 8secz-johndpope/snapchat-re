package defpackage;

import android.util.SparseIntArray;
import java.util.Arrays;

/* renamed from: dav */
public class dav extends das<dav> {
    public final SparseIntArray[] a;

    public dav() {
        int a = dax.a();
        this.a = new SparseIntArray[a];
        for (int i = 0; i < a; i++) {
            this.a[i] = new SparseIntArray(0);
        }
    }

    private dav a(dav dav) {
        int i = 0;
        while (true) {
            SparseIntArray[] sparseIntArrayArr = this.a;
            if (i >= sparseIntArrayArr.length) {
                return this;
            }
            dav.a(dav.a[i], sparseIntArrayArr[i]);
            i++;
        }
    }

    static void a(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        sparseIntArray2.clear();
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray2.append(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }

    public final /* synthetic */ das b(das das, das das2) {
        dav dav = (dav) das;
        dav dav2 = (dav) das2;
        if (dav2 == null) {
            dav2 = new dav();
        }
        if (dav != null) {
            int i = 0;
            while (true) {
                SparseIntArray[] sparseIntArrayArr = this.a;
                if (i >= sparseIntArrayArr.length) {
                    break;
                }
                int i2;
                int keyAt;
                SparseIntArray sparseIntArray = sparseIntArrayArr[i];
                SparseIntArray sparseIntArray2 = dav.a[i];
                SparseIntArray sparseIntArray3 = dav2.a[i];
                int size = sparseIntArray.size();
                for (i2 = 0; i2 < size; i2++) {
                    keyAt = sparseIntArray.keyAt(i2);
                    sparseIntArray3.put(keyAt, sparseIntArray.valueAt(i2) + sparseIntArray2.get(keyAt, 0));
                }
                size = sparseIntArray2.size();
                for (i2 = 0; i2 < size; i2++) {
                    keyAt = sparseIntArray2.keyAt(i2);
                    if (sparseIntArray.indexOfKey(keyAt) < 0) {
                        sparseIntArray3.put(keyAt, sparseIntArray2.valueAt(i2));
                    }
                }
                i++;
            }
        } else {
            dav2.a(this);
        }
        return dav2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A:{LOOP_END, LOOP:0: B:11:0x001e->B:28:0x005a} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059 A:{SYNTHETIC} */
    public boolean equals(java.lang.Object r10) {
        /*
        r9 = this;
        r0 = 1;
        if (r9 != r10) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r10 == 0) goto L_0x005e;
    L_0x0007:
        r2 = r9.getClass();
        r3 = r10.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x005e;
    L_0x0012:
        r10 = (defpackage.dav) r10;
        r2 = r9.a;
        r2 = r2.length;
        r3 = r10.a;
        r3 = r3.length;
        if (r2 == r3) goto L_0x001d;
    L_0x001c:
        return r1;
    L_0x001d:
        r2 = 0;
    L_0x001e:
        r3 = r9.a;
        r4 = r3.length;
        if (r2 >= r4) goto L_0x005d;
    L_0x0023:
        r3 = r3[r2];
        r4 = r10.a;
        r4 = r4[r2];
        if (r3 == r4) goto L_0x0056;
    L_0x002b:
        r5 = r3.size();
        r6 = r4.size();
        if (r5 == r6) goto L_0x0037;
    L_0x0035:
        r3 = 0;
        goto L_0x0057;
    L_0x0037:
        r5 = r3.size();
        r6 = 0;
    L_0x003c:
        if (r6 >= r5) goto L_0x0056;
    L_0x003e:
        r7 = r3.keyAt(r6);
        r8 = r4.keyAt(r6);
        if (r7 != r8) goto L_0x0035;
    L_0x0048:
        r7 = r3.valueAt(r6);
        r8 = r4.valueAt(r6);
        if (r7 == r8) goto L_0x0053;
    L_0x0052:
        goto L_0x0035;
    L_0x0053:
        r6 = r6 + 1;
        goto L_0x003c;
    L_0x0056:
        r3 = 1;
    L_0x0057:
        if (r3 != 0) goto L_0x005a;
    L_0x0059:
        return r1;
    L_0x005a:
        r2 = r2 + 1;
        goto L_0x001e;
    L_0x005d:
        return r0;
    L_0x005e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dav.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        SparseIntArray[] sparseIntArrayArr = this.a;
        int length = sparseIntArrayArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            SparseIntArray sparseIntArray = sparseIntArrayArr[i];
            int i3 = i2;
            for (i2 = 0; i2 < sparseIntArray.size(); i2++) {
                i3 += sparseIntArray.keyAt(i2) ^ sparseIntArray.valueAt(i2);
            }
            i++;
            i2 = i3;
        }
        return i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CPUFrequencyMetrics{timeInStateS=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
