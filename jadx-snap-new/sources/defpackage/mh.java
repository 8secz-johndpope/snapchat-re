package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: mh */
public final class mh {
    private static final Comparator<e> a = new 1();

    /* renamed from: mh$a */
    public static abstract class a {
        public abstract int a();

        public Object a(int i) {
            return null;
        }

        public abstract boolean a(int i, int i2);

        public abstract int b();

        public abstract boolean b(int i, int i2);
    }

    /* renamed from: mh$1 */
    static class 1 implements Comparator<e> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            int i = eVar.a - eVar2.a;
            return i == 0 ? eVar.b - eVar2.b : i;
        }
    }

    /* renamed from: mh$d */
    static class d {
        int a;
        int b;
        int c;
        int d;

        public d(int i, int i2) {
            this.a = 0;
            this.b = i;
            this.c = 0;
            this.d = i2;
        }
    }

    /* renamed from: mh$b */
    public static class b {
        private final List<e> a;
        private final int[] b;
        private final int[] c;
        private final a d;
        private final int e;
        private final int f;
        private final boolean g;

        b(a aVar, List<e> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(this.b, 0);
            Arrays.fill(this.c, 0);
            this.d = aVar;
            this.e = aVar.a();
            this.f = aVar.b();
            this.g = z;
            e eVar = this.a.isEmpty() ? null : (e) this.a.get(0);
            if (!(eVar != null && eVar.a == 0 && eVar.b == 0)) {
                eVar = new e();
                eVar.a = 0;
                eVar.b = 0;
                eVar.d = false;
                eVar.c = 0;
                eVar.e = false;
                this.a.add(0, eVar);
            }
            a();
        }

        private static c a(List<c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                c cVar = (c) list.get(size);
                if (cVar.a == i && cVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        c cVar2 = (c) list.get(size);
                        cVar2.b += z ? 1 : -1;
                        size++;
                    }
                    return cVar;
                }
                size--;
            }
            return null;
        }

        private void a() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = (e) this.a.get(size);
                int i3 = eVar.a + eVar.c;
                int i4 = eVar.b + eVar.c;
                int i5 = 0;
                if (this.g) {
                    while (i > i3) {
                        if (this.b[i - 1] == 0) {
                            a(i, i2, size, false);
                        }
                        i--;
                    }
                    while (i2 > i4) {
                        if (this.c[i2 - 1] == 0) {
                            a(i, i2, size, true);
                        }
                        i2--;
                    }
                }
                while (i5 < eVar.c) {
                    i = eVar.a + i5;
                    i2 = eVar.b + i5;
                    i3 = this.d.b(i, i2) ? 1 : 2;
                    this.b[i] = (i2 << 5) | i3;
                    this.c[i2] = (i << 5) | i3;
                    i5++;
                }
                i = eVar.a;
                i2 = eVar.b;
            }
        }

        private void a(List<c> list, mi miVar, int i, int i2, int i3) {
            if (this.g) {
                while (true) {
                    i2--;
                    if (i2 >= 0) {
                        int i4 = i3 + i2;
                        int i5 = this.c[i4] & 31;
                        if (i5 == 0) {
                            miVar.onInserted(i, 1);
                            for (c cVar : list) {
                                cVar.b++;
                            }
                        } else if (i5 == 4 || i5 == 8) {
                            i4 = this.c[i4] >> 5;
                            miVar.onMoved(b.a(list, i4, true).b, i);
                            if (i5 == 4) {
                                miVar.onChanged(i, 1, this.d.a(i4));
                            }
                        } else if (i5 == 16) {
                            list.add(new c(i4, i, false));
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("unknown flag for pos ");
                            stringBuilder.append(i4);
                            stringBuilder.append(" ");
                            stringBuilder.append(Long.toBinaryString((long) i5));
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                    return;
                }
            }
            miVar.onInserted(i, i2);
        }

        private boolean a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i4 = i2 - 1;
                i2--;
                i5 = i4;
                i4 = i;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                e eVar = (e) this.a.get(i3);
                int i6 = eVar.a + eVar.c;
                int i7 = eVar.b + eVar.c;
                int i8 = 8;
                if (!z) {
                    while (true) {
                        i2--;
                        if (i2 < i7) {
                            continue;
                            break;
                        } else if (this.d.a(i5, i2)) {
                            if (!this.d.b(i5, i2)) {
                                i8 = 4;
                            }
                            i--;
                            this.b[i] = (i2 << 5) | 16;
                            this.c[i2] = (i << 5) | i8;
                            return true;
                        }
                    }
                }
                for (i4--; i4 >= i6; i4--) {
                    if (this.d.a(i4, i5)) {
                        if (!this.d.b(i4, i5)) {
                            i8 = 4;
                        }
                        this.c[i5] = (i4 << 5) | 16;
                        this.b[i4] = (i5 << 5) | i8;
                        return true;
                    }
                }
                continue;
                i4 = eVar.a;
                i2 = eVar.b;
                i3--;
            }
            return false;
        }

        private void b(List<c> list, mi miVar, int i, int i2, int i3) {
            if (this.g) {
                while (true) {
                    i2--;
                    if (i2 >= 0) {
                        int i4 = i3 + i2;
                        int i5 = this.b[i4] & 31;
                        if (i5 == 0) {
                            miVar.onRemoved(i + i2, 1);
                            for (c cVar : list) {
                                cVar.b--;
                            }
                        } else if (i5 == 4 || i5 == 8) {
                            c a = b.a(list, this.b[i4] >> 5, false);
                            miVar.onMoved(i + i2, a.b - 1);
                            if (i5 == 4) {
                                miVar.onChanged(a.b - 1, 1, this.d.a(i4));
                            }
                        } else if (i5 == 16) {
                            list.add(new c(i4, i + i2, true));
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("unknown flag for pos ");
                            stringBuilder.append(i4);
                            stringBuilder.append(" ");
                            stringBuilder.append(Long.toBinaryString((long) i5));
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                    return;
                }
            }
            miVar.onRemoved(i, i2);
        }

        public final void a(Adapter adapter) {
            a(new mf(adapter));
        }

        public final void a(mi miVar) {
            mg mgVar = miVar instanceof mg ? (mg) miVar : new mg(miVar);
            ArrayList arrayList = new ArrayList();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = (e) this.a.get(size);
                int i3 = eVar.c;
                int i4 = eVar.a + i3;
                int i5 = eVar.b + i3;
                if (i4 < i) {
                    b(arrayList, mgVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    a(arrayList, mgVar, i4, i2 - i5, i5);
                }
                for (i3--; i3 >= 0; i3--) {
                    if ((this.b[eVar.a + i3] & 31) == 2) {
                        mgVar.onChanged(eVar.a + i3, 1, this.d.a(eVar.a + i3));
                    }
                }
                i = eVar.a;
                i2 = eVar.b;
            }
            mgVar.a();
        }
    }

    /* renamed from: mh$e */
    static class e {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        e() {
        }
    }

    /* renamed from: mh$c */
    static class c {
        int a;
        int b;
        boolean c;

        public c(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static b a(a aVar) {
        return mh.a(aVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    public static defpackage.mh.b a(defpackage.mh.a r15, boolean r16) {
        /*
        r0 = r15.a();
        r1 = r15.b();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = new mh$d;
        r3.<init>(r0, r1);
        r2.add(r3);
        r3 = r0 + r1;
        r0 = r0 - r1;
        r0 = java.lang.Math.abs(r0);
        r0 = r0 + r3;
        r1 = r0 << 1;
        r13 = new int[r1];
        r1 = new int[r1];
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x002d:
        r5 = r2.isEmpty();
        if (r5 != 0) goto L_0x00e0;
    L_0x0033:
        r5 = r2.size();
        r5 = r5 + -1;
        r5 = r2.remove(r5);
        r14 = r5;
        r14 = (defpackage.mh.d) r14;
        r6 = r14.a;
        r7 = r14.b;
        r8 = r14.c;
        r9 = r14.d;
        r5 = r15;
        r10 = r13;
        r11 = r1;
        r12 = r0;
        r5 = defpackage.mh.a(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r5 == 0) goto L_0x00db;
    L_0x0052:
        r6 = r5.c;
        if (r6 <= 0) goto L_0x0059;
    L_0x0056:
        r4.add(r5);
    L_0x0059:
        r6 = r5.a;
        r7 = r14.a;
        r6 = r6 + r7;
        r5.a = r6;
        r6 = r5.b;
        r7 = r14.c;
        r6 = r6 + r7;
        r5.b = r6;
        r6 = r3.isEmpty();
        if (r6 == 0) goto L_0x0073;
    L_0x006d:
        r6 = new mh$d;
        r6.<init>();
        goto L_0x007f;
    L_0x0073:
        r6 = r3.size();
        r6 = r6 + -1;
        r6 = r3.remove(r6);
        r6 = (defpackage.mh.d) r6;
    L_0x007f:
        r7 = r14.a;
        r6.a = r7;
        r7 = r14.c;
        r6.c = r7;
        r7 = r5.e;
        if (r7 == 0) goto L_0x0094;
    L_0x008b:
        r7 = r5.a;
    L_0x008d:
        r6.b = r7;
        r7 = r5.b;
    L_0x0091:
        r6.d = r7;
        goto L_0x00a6;
    L_0x0094:
        r7 = r5.d;
        if (r7 == 0) goto L_0x009d;
    L_0x0098:
        r7 = r5.a;
        r7 = r7 + -1;
        goto L_0x008d;
    L_0x009d:
        r7 = r5.a;
        r6.b = r7;
        r7 = r5.b;
        r7 = r7 + -1;
        goto L_0x0091;
    L_0x00a6:
        r2.add(r6);
        r6 = r5.e;
        if (r6 == 0) goto L_0x00c8;
    L_0x00ad:
        r6 = r5.d;
        if (r6 == 0) goto L_0x00b9;
    L_0x00b1:
        r6 = r5.a;
        r7 = r5.c;
        r6 = r6 + r7;
        r6 = r6 + 1;
        goto L_0x00cd;
    L_0x00b9:
        r6 = r5.a;
        r7 = r5.c;
        r6 = r6 + r7;
        r14.a = r6;
        r6 = r5.b;
        r5 = r5.c;
        r6 = r6 + r5;
        r6 = r6 + 1;
        goto L_0x00d4;
    L_0x00c8:
        r6 = r5.a;
        r7 = r5.c;
        r6 = r6 + r7;
    L_0x00cd:
        r14.a = r6;
        r6 = r5.b;
        r5 = r5.c;
        r6 = r6 + r5;
    L_0x00d4:
        r14.c = r6;
        r2.add(r14);
        goto L_0x002d;
    L_0x00db:
        r3.add(r14);
        goto L_0x002d;
    L_0x00e0:
        r0 = a;
        java.util.Collections.sort(r4, r0);
        r0 = new mh$b;
        r2 = r0;
        r3 = r15;
        r5 = r13;
        r6 = r1;
        r7 = r16;
        r2.<init>(r3, r4, r5, r6, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.a(mh$a, boolean):mh$b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ee A:{SYNTHETIC, EDGE_INSN: B:83:0x00ee->B:53:0x00ee ?: BREAK  , EDGE_INSN: B:83:0x00ee->B:53:0x00ee ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3 A:{LOOP_END, LOOP:4: B:47:0x00cf->B:51:0x00e3} */
    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (r1[r13 - 1] < r1[r13 + r7]) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:41:0x00ba, code skipped:
            if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    private static defpackage.mh.e a(defpackage.mh.a r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
        r0 = r19;
        r1 = r24;
        r2 = r25;
        r3 = r21 - r20;
        r4 = r23 - r22;
        if (r3 <= 0) goto L_0x0133;
    L_0x000c:
        if (r4 > 0) goto L_0x0010;
    L_0x000e:
        goto L_0x0133;
    L_0x0010:
        r5 = r3 - r4;
        r6 = r3 + r4;
        r7 = 1;
        r6 = r6 + r7;
        r6 = r6 / 2;
        r8 = r26 - r6;
        r8 = r8 - r7;
        r9 = r26 + r6;
        r9 = r9 + r7;
        r10 = 0;
        java.util.Arrays.fill(r1, r8, r9, r10);
        r8 = r8 + r5;
        r9 = r9 + r5;
        java.util.Arrays.fill(r2, r8, r9, r3);
        r8 = r5 % 2;
        if (r8 == 0) goto L_0x002d;
    L_0x002b:
        r8 = 1;
        goto L_0x002e;
    L_0x002d:
        r8 = 0;
    L_0x002e:
        r9 = 0;
    L_0x002f:
        if (r9 > r6) goto L_0x012b;
    L_0x0031:
        r11 = -r9;
        r12 = r11;
    L_0x0033:
        if (r12 > r9) goto L_0x00a2;
    L_0x0035:
        if (r12 == r11) goto L_0x004d;
    L_0x0037:
        if (r12 == r9) goto L_0x0045;
    L_0x0039:
        r13 = r26 + r12;
        r14 = r13 + -1;
        r14 = r1[r14];
        r13 = r13 + r7;
        r13 = r1[r13];
        if (r14 >= r13) goto L_0x0045;
    L_0x0044:
        goto L_0x004d;
    L_0x0045:
        r13 = r26 + r12;
        r13 = r13 - r7;
        r13 = r1[r13];
        r13 = r13 + r7;
        r14 = 1;
        goto L_0x0053;
    L_0x004d:
        r13 = r26 + r12;
        r13 = r13 + r7;
        r13 = r1[r13];
        r14 = 0;
    L_0x0053:
        r15 = r13 - r12;
    L_0x0055:
        if (r13 >= r3) goto L_0x006a;
    L_0x0057:
        if (r15 >= r4) goto L_0x006a;
    L_0x0059:
        r10 = r20 + r13;
        r7 = r22 + r15;
        r7 = r0.a(r10, r7);
        if (r7 == 0) goto L_0x006a;
    L_0x0063:
        r13 = r13 + 1;
        r15 = r15 + 1;
        r7 = 1;
        r10 = 0;
        goto L_0x0055;
    L_0x006a:
        r7 = r26 + r12;
        r1[r7] = r13;
        if (r8 == 0) goto L_0x009c;
    L_0x0070:
        r10 = r5 - r9;
        r13 = 1;
        r10 = r10 + r13;
        if (r12 < r10) goto L_0x009c;
    L_0x0076:
        r10 = r5 + r9;
        r10 = r10 - r13;
        if (r12 > r10) goto L_0x009c;
    L_0x007b:
        r10 = r1[r7];
        r13 = r2[r7];
        if (r10 < r13) goto L_0x009c;
    L_0x0081:
        r0 = new mh$e;
        r0.<init>();
        r3 = r2[r7];
        r0.a = r3;
        r3 = r0.a;
        r3 = r3 - r12;
        r0.b = r3;
        r1 = r1[r7];
        r2 = r2[r7];
        r1 = r1 - r2;
        r0.c = r1;
        r0.d = r14;
        r7 = 0;
        r0.e = r7;
        return r0;
    L_0x009c:
        r7 = 0;
        r12 = r12 + 2;
        r7 = 1;
        r10 = 0;
        goto L_0x0033;
    L_0x00a2:
        r7 = 0;
        r10 = r11;
    L_0x00a4:
        if (r10 > r9) goto L_0x0120;
    L_0x00a6:
        r12 = r10 + r5;
        r13 = r9 + r5;
        if (r12 == r13) goto L_0x00c6;
    L_0x00ac:
        r13 = r11 + r5;
        if (r12 == r13) goto L_0x00bd;
    L_0x00b0:
        r13 = r26 + r12;
        r14 = r13 + -1;
        r14 = r2[r14];
        r15 = 1;
        r13 = r13 + r15;
        r13 = r2[r13];
        if (r14 >= r13) goto L_0x00be;
    L_0x00bc:
        goto L_0x00c7;
    L_0x00bd:
        r15 = 1;
    L_0x00be:
        r13 = r26 + r12;
        r13 = r13 + r15;
        r13 = r2[r13];
        r13 = r13 - r15;
        r14 = 1;
        goto L_0x00cd;
    L_0x00c6:
        r15 = 1;
    L_0x00c7:
        r13 = r26 + r12;
        r13 = r13 - r15;
        r13 = r2[r13];
        r14 = 0;
    L_0x00cd:
        r16 = r13 - r12;
    L_0x00cf:
        if (r13 <= 0) goto L_0x00ec;
    L_0x00d1:
        if (r16 <= 0) goto L_0x00ec;
    L_0x00d3:
        r17 = r20 + r13;
        r7 = r17 + -1;
        r17 = r22 + r16;
        r18 = r3;
        r3 = r17 + -1;
        r3 = r0.a(r7, r3);
        if (r3 == 0) goto L_0x00ee;
    L_0x00e3:
        r13 = r13 + -1;
        r16 = r16 + -1;
        r3 = r18;
        r7 = 0;
        r15 = 1;
        goto L_0x00cf;
    L_0x00ec:
        r18 = r3;
    L_0x00ee:
        r3 = r26 + r12;
        r2[r3] = r13;
        if (r8 != 0) goto L_0x0119;
    L_0x00f4:
        if (r12 < r11) goto L_0x0119;
    L_0x00f6:
        if (r12 > r9) goto L_0x0119;
    L_0x00f8:
        r7 = r1[r3];
        r13 = r2[r3];
        if (r7 < r13) goto L_0x0119;
    L_0x00fe:
        r0 = new mh$e;
        r0.<init>();
        r4 = r2[r3];
        r0.a = r4;
        r4 = r0.a;
        r4 = r4 - r12;
        r0.b = r4;
        r1 = r1[r3];
        r2 = r2[r3];
        r1 = r1 - r2;
        r0.c = r1;
        r0.d = r14;
        r3 = 1;
        r0.e = r3;
        return r0;
    L_0x0119:
        r3 = 1;
        r10 = r10 + 2;
        r3 = r18;
        r7 = 0;
        goto L_0x00a4;
    L_0x0120:
        r18 = r3;
        r3 = 1;
        r9 = r9 + 1;
        r3 = r18;
        r7 = 1;
        r10 = 0;
        goto L_0x002f;
    L_0x012b:
        r0 = new java.lang.IllegalStateException;
        r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.";
        r0.<init>(r1);
        throw r0;
    L_0x0133:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.a(mh$a, int, int, int, int, int[], int[], int):mh$e");
    }
}
