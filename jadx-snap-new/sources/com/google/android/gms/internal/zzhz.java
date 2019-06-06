package com.google.android.gms.internal;

import java.util.PriorityQueue;

@zzabh
public final class zzhz {
    private static long zza(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? zza((j * j) % 1073807359, i / 2) : j * (zza((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static String zza(String[] strArr, int i, int i2) {
        i2 += i;
        if (strArr.length < i2) {
            zzaky.e("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int i3 = i2 - 1;
            if (i < i3) {
                stringBuilder.append(strArr[i]);
                stringBuilder.append(' ');
                i++;
            } else {
                stringBuilder.append(strArr[i3]);
                return stringBuilder.toString();
            }
        }
    }

    /* JADX WARNING: Missing block: B:6:0x0025, code skipped:
            return;
     */
    private static void zza(int r2, long r3, java.lang.String r5, int r6, java.util.PriorityQueue<com.google.android.gms.internal.zzia> r7) {
        /*
        r0 = new com.google.android.gms.internal.zzia;
        r0.<init>(r3, r5, r6);
        r3 = r7.size();
        if (r3 != r2) goto L_0x0026;
    L_0x000b:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.zzia) r3;
        r3 = r3.zzbal;
        r4 = r0.zzbal;
        if (r3 > r4) goto L_0x0025;
    L_0x0017:
        r3 = r7.peek();
        r3 = (com.google.android.gms.internal.zzia) r3;
        r3 = r3.value;
        r5 = r0.value;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x0026;
    L_0x0025:
        return;
    L_0x0026:
        r3 = r7.contains(r0);
        if (r3 == 0) goto L_0x002d;
    L_0x002c:
        return;
    L_0x002d:
        r7.add(r0);
        r3 = r7.size();
        if (r3 <= r2) goto L_0x0039;
    L_0x0036:
        r7.poll();
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhz.zza(int, long, java.lang.String, int, java.util.PriorityQueue):void");
    }

    public static void zza(String[] strArr, int i, int i2, PriorityQueue<zzia> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            zza(i, zzb(strArr2, 0, strArr2.length), zza(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long zzb = zzb(strArr2, 0, i3);
        zza(i, zzb, zza(strArr2, 0, i3), i2, priorityQueue);
        long zza = zza(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            zzb += 1073807359;
            zzb = (((((zzb - ((((((long) zzhw.zzaa(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzhw.zzaa(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            zza(i, zzb, zza(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    private static long zzb(String[] strArr, int i, int i2) {
        long zzaa = (((long) zzhw.zzaa(strArr[0])) + 2147483647L) % 1073807359;
        for (i = 1; i < i2; i++) {
            zzaa = (((zzaa * 16785407) % 1073807359) + ((((long) zzhw.zzaa(strArr[i])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zzaa;
    }
}
