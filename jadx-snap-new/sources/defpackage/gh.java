package defpackage;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import defpackage.fs.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: gh */
final class gh {
    private static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final gj b = (VERSION.SDK_INT >= 21 ? new gi() : null);
    private static final gj c = gh.a();

    /* renamed from: gh$a */
    static class a {
        public fv a;
        public boolean b;
        public fs c;
        public fv d;
        public boolean e;
        public fs f;

        a() {
        }
    }

    static View a(iv<String, View> ivVar, a aVar, Object obj, boolean z) {
        fs fsVar = aVar.c;
        if (obj == null || ivVar == null || fsVar.p == null || fsVar.p.isEmpty()) {
            return null;
        }
        return (View) ivVar.get((String) (z ? fsVar.p : fsVar.q).get(0));
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        aVar = new a();
        sparseArray.put(i, aVar);
        return aVar;
    }

    private static gj a() {
        try {
            return (gj) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static gj a(fv fvVar, fv fvVar2) {
        Object sharedElementReturnTransition;
        List arrayList = new ArrayList();
        if (fvVar != null) {
            Object exitTransition = fvVar.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            exitTransition = fvVar.getReturnTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            sharedElementReturnTransition = fvVar.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fvVar2 != null) {
            sharedElementReturnTransition = fvVar2.getEnterTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
            sharedElementReturnTransition = fvVar2.getReenterTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
            sharedElementReturnTransition = fvVar2.getSharedElementEnterTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        gj gjVar = b;
        if (gjVar != null && gh.a(gjVar, arrayList)) {
            return b;
        }
        gjVar = c;
        if (gjVar != null && gh.a(gjVar, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static iv<String, String> a(int i, ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        iv ivVar = new iv();
        while (true) {
            i3--;
            if (i3 < i2) {
                return ivVar;
            }
            fs fsVar = (fs) arrayList.get(i3);
            if (fsVar.b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
                if (fsVar.p != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = fsVar.p.size();
                    if (booleanValue) {
                        arrayList3 = fsVar.p;
                        arrayList4 = fsVar.q;
                    } else {
                        ArrayList arrayList5 = fsVar.p;
                        arrayList3 = fsVar.q;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList4.get(i4);
                        String str2 = (String) arrayList3.get(i4);
                        String str3 = (String) ivVar.remove(str2);
                        if (str3 != null) {
                            ivVar.put(str, str3);
                        } else {
                            ivVar.put(str, str2);
                        }
                    }
                }
            }
        }
    }

    static iv<String, View> a(gj gjVar, iv<String, String> ivVar, Object obj, a aVar) {
        fv fvVar = aVar.a;
        View view = fvVar.getView();
        if (ivVar.isEmpty() || obj == null || view == null) {
            ivVar.clear();
            return null;
        }
        gu exitTransitionCallback;
        Collection collection;
        Map ivVar2 = new iv();
        gjVar.a(ivVar2, view);
        fs fsVar = aVar.c;
        if (aVar.b) {
            exitTransitionCallback = fvVar.getExitTransitionCallback();
            collection = fsVar.p;
        } else {
            exitTransitionCallback = fvVar.getEnterTransitionCallback();
            collection = fsVar.q;
        }
        if (collection != null) {
            jc.a(ivVar2, collection);
            jc.a(ivVar2, ivVar.values());
        }
        if (exitTransitionCallback != null) {
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                view = (View) ivVar2.get(str);
                if (view == null) {
                    str = gh.a((iv) ivVar, str);
                    if (str != null) {
                        ivVar.remove(str);
                    }
                } else if (!str.equals(kb.a.s(view))) {
                    str = gh.a((iv) ivVar, str);
                    if (str != null) {
                        ivVar.put(str, kb.a.s(view));
                    }
                }
            }
        } else {
            for (int size2 = ivVar.size() - 1; size2 >= 0; size2--) {
                if (!ivVar2.containsKey((String) ivVar.c(size2))) {
                    ivVar.d(size2);
                }
            }
        }
        return ivVar2;
    }

    private static Object a(gj gjVar, fv fvVar, fv fvVar2, boolean z) {
        if (fvVar == null || fvVar2 == null) {
            return null;
        }
        return gjVar.c(gjVar.b(z ? fvVar2.getSharedElementReturnTransition() : fvVar.getSharedElementEnterTransition()));
    }

    private static Object a(gj gjVar, fv fvVar, boolean z) {
        if (fvVar == null) {
            return null;
        }
        return gjVar.b(z ? fvVar.getReenterTransition() : fvVar.getEnterTransition());
    }

    private static Object a(gj gjVar, Object obj, Object obj2, Object obj3, fv fvVar, boolean z) {
        boolean allowReturnTransitionOverlap = (obj == null || obj2 == null || fvVar == null) ? true : z ? fvVar.getAllowReturnTransitionOverlap() : fvVar.getAllowEnterTransitionOverlap();
        return allowReturnTransitionOverlap ? gjVar.a(obj2, obj, obj3) : gjVar.b(obj2, obj, obj3);
    }

    private static String a(iv<String, String> ivVar, String str) {
        int size = ivVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(ivVar.c(i))) {
                return (String) ivVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(gj gjVar, Object obj, fv fvVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fvVar.getView();
        if (view2 != null) {
            gjVar.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        gjVar.a(obj, arrayList2);
        return arrayList2;
    }

    private static void a(fs fsVar, SparseArray<a> sparseArray, boolean z) {
        int size = fsVar.b.size();
        for (int i = 0; i < size; i++) {
            gh.a(fsVar, (a) fsVar.b.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009b  */
    /* JADX WARNING: Missing block: B:29:0x0038, code skipped:
            if (r6.mAdded != false) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:51:0x006f, code skipped:
            r12 = 1;
     */
    /* JADX WARNING: Missing block: B:63:0x008b, code skipped:
            if (r6.mHidden == false) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:64:0x008d, code skipped:
            r12 = true;
     */
    private static void a(defpackage.fs r11, defpackage.fs.a r12, android.util.SparseArray<defpackage.gh.a> r13, boolean r14, boolean r15) {
        /*
        r6 = r12.b;
        if (r6 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r7 = r6.mContainerId;
        if (r7 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        if (r14 == 0) goto L_0x0013;
    L_0x000c:
        r0 = a;
        r12 = r12.a;
        r12 = r0[r12];
        goto L_0x0015;
    L_0x0013:
        r12 = r12.a;
    L_0x0015:
        r0 = 0;
        r1 = 1;
        if (r12 == r1) goto L_0x0080;
    L_0x0019:
        r2 = 3;
        if (r12 == r2) goto L_0x0056;
    L_0x001c:
        r2 = 4;
        if (r12 == r2) goto L_0x003e;
    L_0x001f:
        r2 = 5;
        if (r12 == r2) goto L_0x002c;
    L_0x0022:
        r2 = 6;
        if (r12 == r2) goto L_0x0056;
    L_0x0025:
        r2 = 7;
        if (r12 == r2) goto L_0x0080;
    L_0x0028:
        r12 = 0;
        r1 = 0;
    L_0x002a:
        r8 = 0;
        goto L_0x0093;
    L_0x002c:
        if (r15 == 0) goto L_0x003b;
    L_0x002e:
        r12 = r6.mHiddenChanged;
        if (r12 == 0) goto L_0x008f;
    L_0x0032:
        r12 = r6.mHidden;
        if (r12 != 0) goto L_0x008f;
    L_0x0036:
        r12 = r6.mAdded;
        if (r12 == 0) goto L_0x008f;
    L_0x003a:
        goto L_0x008d;
    L_0x003b:
        r12 = r6.mHidden;
        goto L_0x0090;
    L_0x003e:
        if (r15 == 0) goto L_0x004d;
    L_0x0040:
        r12 = r6.mHiddenChanged;
        if (r12 == 0) goto L_0x0071;
    L_0x0044:
        r12 = r6.mAdded;
        if (r12 == 0) goto L_0x0071;
    L_0x0048:
        r12 = r6.mHidden;
        if (r12 == 0) goto L_0x0071;
    L_0x004c:
        goto L_0x006f;
    L_0x004d:
        r12 = r6.mAdded;
        if (r12 == 0) goto L_0x0071;
    L_0x0051:
        r12 = r6.mHidden;
        if (r12 != 0) goto L_0x0071;
    L_0x0055:
        goto L_0x004c;
    L_0x0056:
        if (r15 == 0) goto L_0x0073;
    L_0x0058:
        r12 = r6.mAdded;
        if (r12 != 0) goto L_0x0071;
    L_0x005c:
        r12 = r6.mView;
        if (r12 == 0) goto L_0x0071;
    L_0x0060:
        r12 = r6.mView;
        r12 = r12.getVisibility();
        if (r12 != 0) goto L_0x0071;
    L_0x0068:
        r12 = r6.mPostponedAlpha;
        r2 = 0;
        r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r12 < 0) goto L_0x0071;
    L_0x006f:
        r12 = 1;
        goto L_0x007c;
    L_0x0071:
        r12 = 0;
        goto L_0x007c;
    L_0x0073:
        r12 = r6.mAdded;
        if (r12 == 0) goto L_0x0071;
    L_0x0077:
        r12 = r6.mHidden;
        if (r12 != 0) goto L_0x0071;
    L_0x007b:
        goto L_0x006f;
    L_0x007c:
        r8 = r12;
        r12 = 1;
        r1 = 0;
        goto L_0x0093;
    L_0x0080:
        if (r15 == 0) goto L_0x0085;
    L_0x0082:
        r12 = r6.mIsNewlyAdded;
        goto L_0x0090;
    L_0x0085:
        r12 = r6.mAdded;
        if (r12 != 0) goto L_0x008f;
    L_0x0089:
        r12 = r6.mHidden;
        if (r12 != 0) goto L_0x008f;
    L_0x008d:
        r12 = 1;
        goto L_0x0090;
    L_0x008f:
        r12 = 0;
    L_0x0090:
        r0 = r12;
        r12 = 0;
        goto L_0x002a;
    L_0x0093:
        r2 = r13.get(r7);
        r2 = (defpackage.gh.a) r2;
        if (r0 == 0) goto L_0x00a5;
    L_0x009b:
        r2 = defpackage.gh.a(r2, r13, r7);
        r2.a = r6;
        r2.b = r14;
        r2.c = r11;
    L_0x00a5:
        r9 = r2;
        r10 = 0;
        if (r15 != 0) goto L_0x00cc;
    L_0x00a9:
        if (r1 == 0) goto L_0x00cc;
    L_0x00ab:
        if (r9 == 0) goto L_0x00b3;
    L_0x00ad:
        r0 = r9.d;
        if (r0 != r6) goto L_0x00b3;
    L_0x00b1:
        r9.d = r10;
    L_0x00b3:
        r0 = r11.a;
        r1 = r6.mState;
        if (r1 > 0) goto L_0x00cc;
    L_0x00b9:
        r1 = r0.d;
        if (r1 <= 0) goto L_0x00cc;
    L_0x00bd:
        r1 = r11.r;
        if (r1 != 0) goto L_0x00cc;
    L_0x00c1:
        r0.d(r6);
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r6;
        r0.a(r1, r2, r3, r4, r5);
    L_0x00cc:
        if (r8 == 0) goto L_0x00de;
    L_0x00ce:
        if (r9 == 0) goto L_0x00d4;
    L_0x00d0:
        r0 = r9.d;
        if (r0 != 0) goto L_0x00de;
    L_0x00d4:
        r9 = defpackage.gh.a(r9, r13, r7);
        r9.d = r6;
        r9.e = r14;
        r9.f = r11;
    L_0x00de:
        if (r15 != 0) goto L_0x00ea;
    L_0x00e0:
        if (r12 == 0) goto L_0x00ea;
    L_0x00e2:
        if (r9 == 0) goto L_0x00ea;
    L_0x00e4:
        r11 = r9.a;
        if (r11 != r6) goto L_0x00ea;
    L_0x00e8:
        r9.a = r10;
    L_0x00ea:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.a(fs, fs$a, android.util.SparseArray, boolean, boolean):void");
    }

    static void a(fv fvVar, fv fvVar2, boolean z, iv<String, View> ivVar) {
        if ((z ? fvVar2.getEnterTransitionCallback() : fvVar.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            int size = ivVar == null ? 0 : ivVar.size();
            while (i < size) {
                arrayList2.add(ivVar.b(i));
                arrayList.add(ivVar.c(i));
                i++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0181 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x036f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x032a  */
    static void a(defpackage.ga r35, java.util.ArrayList<defpackage.fs> r36, java.util.ArrayList<java.lang.Boolean> r37, int r38, int r39, boolean r40) {
        /*
        r0 = r35;
        r1 = r36;
        r2 = r37;
        r3 = r39;
        r4 = r40;
        r5 = r0.d;
        if (r5 > 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = new android.util.SparseArray;
        r5.<init>();
        r6 = r38;
    L_0x0016:
        if (r6 >= r3) goto L_0x0034;
    L_0x0018:
        r7 = r1.get(r6);
        r7 = (defpackage.fs) r7;
        r8 = r2.get(r6);
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x002e;
    L_0x002a:
        defpackage.gh.b(r7, r5, r4);
        goto L_0x0031;
    L_0x002e:
        defpackage.gh.a(r7, r5, r4);
    L_0x0031:
        r6 = r6 + 1;
        goto L_0x0016;
    L_0x0034:
        r6 = r5.size();
        if (r6 == 0) goto L_0x0381;
    L_0x003a:
        r6 = new android.view.View;
        r7 = r0.e;
        r7 = r7.b;
        r6.<init>(r7);
        r15 = r5.size();
        r13 = 0;
    L_0x0048:
        if (r13 >= r15) goto L_0x0381;
    L_0x004a:
        r7 = r5.keyAt(r13);
        r12 = r38;
        r11 = defpackage.gh.a(r7, r1, r2, r12, r3);
        r8 = r5.valueAt(r13);
        r10 = r8;
        r10 = (defpackage.gh.a) r10;
        r20 = 0;
        if (r4 == 0) goto L_0x01df;
    L_0x005f:
        r8 = r0.f;
        r8 = r8.a();
        if (r8 == 0) goto L_0x0070;
    L_0x0067:
        r8 = r0.f;
        r7 = r8.a(r7);
        r7 = (android.view.ViewGroup) r7;
        goto L_0x0072;
    L_0x0070:
        r7 = r20;
    L_0x0072:
        if (r7 == 0) goto L_0x01d6;
    L_0x0074:
        r8 = r10.a;
        r9 = r10.d;
        r14 = defpackage.gh.a(r9, r8);
        if (r14 == 0) goto L_0x01d6;
    L_0x007e:
        r1 = r10.b;
        r2 = r10.e;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r30 = r5;
        r5 = defpackage.gh.a(r14, r8, r1);
        r2 = defpackage.gh.b(r14, r9, r2);
        r12 = r10.a;
        r31 = r13;
        r13 = r10.d;
        if (r12 == 0) goto L_0x00a9;
    L_0x009e:
        r32 = r15;
        r15 = r12.getView();
        r0 = 0;
        r15.setVisibility(r0);
        goto L_0x00ab;
    L_0x00a9:
        r32 = r15;
    L_0x00ab:
        if (r12 == 0) goto L_0x0150;
    L_0x00ad:
        if (r13 != 0) goto L_0x00b1;
    L_0x00af:
        goto L_0x0150;
    L_0x00b1:
        r0 = r10.b;
        r15 = r11.isEmpty();
        if (r15 == 0) goto L_0x00be;
    L_0x00b9:
        r16 = r1;
        r15 = r20;
        goto L_0x00c4;
    L_0x00be:
        r15 = defpackage.gh.a(r14, r12, r13, r0);
        r16 = r1;
    L_0x00c4:
        r1 = defpackage.gh.b(r14, r11, r15, r10);
        r17 = r8;
        r8 = defpackage.gh.a(r14, r11, r15, r10);
        r18 = r11.isEmpty();
        if (r18 == 0) goto L_0x00e1;
    L_0x00d4:
        if (r1 == 0) goto L_0x00d9;
    L_0x00d6:
        r1.clear();
    L_0x00d9:
        if (r8 == 0) goto L_0x00de;
    L_0x00db:
        r8.clear();
    L_0x00de:
        r15 = r20;
        goto L_0x00f3;
    L_0x00e1:
        r18 = r15;
        r15 = r11.keySet();
        defpackage.gh.a(r4, r1, r15);
        r15 = r11.values();
        defpackage.gh.a(r3, r8, r15);
        r15 = r18;
    L_0x00f3:
        if (r5 != 0) goto L_0x00fe;
    L_0x00f5:
        if (r2 != 0) goto L_0x00fe;
    L_0x00f7:
        if (r15 != 0) goto L_0x00fe;
    L_0x00f9:
        r34 = r3;
    L_0x00fb:
        r33 = r11;
        goto L_0x0157;
    L_0x00fe:
        defpackage.gh.a(r12, r13, r0, r1);
        if (r15 == 0) goto L_0x0133;
    L_0x0103:
        r3.add(r6);
        r14.a(r15, r6, r4);
        r33 = r11;
        r11 = r10.e;
        r34 = r3;
        r3 = r10.f;
        r21 = r14;
        r22 = r15;
        r23 = r2;
        r24 = r1;
        r25 = r11;
        r26 = r3;
        defpackage.gh.a(r21, r22, r23, r24, r25, r26);
        r1 = new android.graphics.Rect;
        r1.<init>();
        r20 = defpackage.gh.a(r8, r10, r5, r0);
        if (r20 == 0) goto L_0x012e;
    L_0x012b:
        r14.a(r5, r1);
    L_0x012e:
        r28 = r1;
        r26 = r20;
        goto L_0x013b;
    L_0x0133:
        r34 = r3;
        r33 = r11;
        r26 = r20;
        r28 = r26;
    L_0x013b:
        r1 = new gh$3;
        r21 = r1;
        r22 = r12;
        r23 = r13;
        r24 = r0;
        r25 = r8;
        r27 = r14;
        r21.<init>(r22, r23, r24, r25, r26, r27, r28);
        defpackage.gs.a(r7, r1);
        goto L_0x0159;
    L_0x0150:
        r16 = r1;
        r34 = r3;
        r17 = r8;
        goto L_0x00fb;
    L_0x0157:
        r15 = r20;
    L_0x0159:
        if (r5 != 0) goto L_0x015f;
    L_0x015b:
        if (r15 != 0) goto L_0x015f;
    L_0x015d:
        if (r2 == 0) goto L_0x01dc;
    L_0x015f:
        r0 = defpackage.gh.a(r14, r2, r9, r4, r6);
        r1 = r17;
        r3 = r34;
        r8 = defpackage.gh.a(r14, r5, r1, r3, r6);
        r10 = 4;
        defpackage.gh.a(r8, r10);
        r21 = r14;
        r22 = r5;
        r23 = r2;
        r24 = r15;
        r25 = r1;
        r26 = r16;
        r1 = defpackage.gh.a(r21, r22, r23, r24, r25, r26);
        if (r1 == 0) goto L_0x01dc;
    L_0x0181:
        if (r9 == 0) goto L_0x01a6;
    L_0x0183:
        if (r2 == 0) goto L_0x01a6;
    L_0x0185:
        r10 = r9.mAdded;
        if (r10 == 0) goto L_0x01a6;
    L_0x0189:
        r10 = r9.mHidden;
        if (r10 == 0) goto L_0x01a6;
    L_0x018d:
        r10 = r9.mHiddenChanged;
        if (r10 == 0) goto L_0x01a6;
    L_0x0191:
        r10 = 1;
        r9.setHideReplaced(r10);
        r10 = r9.getView();
        r14.b(r2, r10, r0);
        r9 = r9.mContainer;
        r10 = new gh$1;
        r10.<init>(r0);
        defpackage.gs.a(r9, r10);
    L_0x01a6:
        r20 = defpackage.gj.a(r3);
        r21 = r14;
        r22 = r1;
        r23 = r5;
        r24 = r8;
        r25 = r2;
        r26 = r0;
        r27 = r15;
        r28 = r3;
        r21.a(r22, r23, r24, r25, r26, r27, r28);
        r14.a(r7, r1);
        r16 = r14;
        r17 = r7;
        r18 = r4;
        r19 = r3;
        r21 = r33;
        r16.a(r17, r18, r19, r20, r21);
        r0 = 0;
        defpackage.gh.a(r8, r0);
        r14.a(r15, r4, r3);
        goto L_0x0369;
    L_0x01d6:
        r30 = r5;
        r31 = r13;
        r32 = r15;
    L_0x01dc:
        r0 = 0;
        goto L_0x0369;
    L_0x01df:
        r1 = r0;
        r30 = r5;
        r33 = r11;
        r31 = r13;
        r32 = r15;
        r0 = 0;
        r2 = r1.f;
        r2 = r2.a();
        if (r2 == 0) goto L_0x01fa;
    L_0x01f1:
        r2 = r1.f;
        r2 = r2.a(r7);
        r2 = (android.view.ViewGroup) r2;
        goto L_0x01fc;
    L_0x01fa:
        r2 = r20;
    L_0x01fc:
        if (r2 == 0) goto L_0x0369;
    L_0x01fe:
        r3 = r10.a;
        r4 = r10.d;
        r5 = defpackage.gh.a(r4, r3);
        if (r5 == 0) goto L_0x0369;
    L_0x0208:
        r7 = r10.b;
        r8 = r10.e;
        r9 = defpackage.gh.a(r5, r3, r7);
        r8 = defpackage.gh.b(r5, r4, r8);
        r7 = new java.util.ArrayList;
        r7.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r14 = r10.a;
        r13 = r10.d;
        if (r14 == 0) goto L_0x02e8;
    L_0x0224:
        if (r13 != 0) goto L_0x0228;
    L_0x0226:
        goto L_0x02e8;
    L_0x0228:
        r12 = r10.b;
        r11 = r33.isEmpty();
        if (r11 == 0) goto L_0x0233;
    L_0x0230:
        r0 = r20;
        goto L_0x0238;
    L_0x0233:
        r11 = defpackage.gh.a(r5, r14, r13, r12);
        r0 = r11;
    L_0x0238:
        r11 = r33;
        r1 = defpackage.gh.b(r5, r11, r0, r10);
        r16 = r11.isEmpty();
        if (r16 == 0) goto L_0x0247;
    L_0x0244:
        r0 = r20;
        goto L_0x0252;
    L_0x0247:
        r16 = r0;
        r0 = r1.values();
        r7.addAll(r0);
        r0 = r16;
    L_0x0252:
        if (r9 != 0) goto L_0x026f;
    L_0x0254:
        if (r8 != 0) goto L_0x026f;
    L_0x0256:
        if (r0 != 0) goto L_0x026f;
    L_0x0258:
        r21 = r3;
        r22 = r4;
        r1 = r8;
        r3 = r9;
        r0 = r10;
        r33 = r11;
        r28 = r15;
        r17 = r20;
        r26 = r31;
        r24 = r32;
        r29 = 0;
        r31 = r7;
        goto L_0x02fe;
    L_0x026f:
        defpackage.gh.a(r14, r13, r12, r1);
        if (r0 == 0) goto L_0x029f;
    L_0x0274:
        r21 = r3;
        r3 = new android.graphics.Rect;
        r3.<init>();
        r5.a(r0, r6, r7);
        r17 = r7;
        r7 = r10.e;
        r22 = r4;
        r4 = r10.f;
        r18 = r11;
        r11 = r5;
        r19 = r12;
        r12 = r0;
        r23 = r13;
        r13 = r8;
        r24 = r14;
        r14 = r1;
        r1 = r15;
        r15 = r7;
        r16 = r4;
        defpackage.gh.a(r11, r12, r13, r14, r15, r16);
        if (r9 == 0) goto L_0x02b0;
    L_0x029b:
        r5.a(r9, r3);
        goto L_0x02b0;
    L_0x029f:
        r21 = r3;
        r22 = r4;
        r17 = r7;
        r18 = r11;
        r19 = r12;
        r23 = r13;
        r24 = r14;
        r1 = r15;
        r3 = r20;
    L_0x02b0:
        r4 = new gh$4;
        r15 = r17;
        r7 = r4;
        r14 = r8;
        r8 = r5;
        r13 = r9;
        r9 = r18;
        r12 = r10;
        r10 = r0;
        r25 = r0;
        r0 = r18;
        r11 = r12;
        r33 = r0;
        r0 = r12;
        r12 = r1;
        r27 = r13;
        r26 = r31;
        r13 = r6;
        r28 = r1;
        r1 = r14;
        r29 = 0;
        r14 = r24;
        r31 = r15;
        r24 = r32;
        r15 = r23;
        r16 = r19;
        r17 = r31;
        r18 = r27;
        r19 = r3;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        defpackage.gs.a(r2, r4);
        r17 = r25;
        goto L_0x02fc;
    L_0x02e8:
        r21 = r3;
        r22 = r4;
        r1 = r8;
        r27 = r9;
        r0 = r10;
        r28 = r15;
        r26 = r31;
        r24 = r32;
        r29 = 0;
        r31 = r7;
        r17 = r20;
    L_0x02fc:
        r3 = r27;
    L_0x02fe:
        if (r3 != 0) goto L_0x0304;
    L_0x0300:
        if (r17 != 0) goto L_0x0304;
    L_0x0302:
        if (r1 == 0) goto L_0x036f;
    L_0x0304:
        r4 = r22;
        r7 = r31;
        r4 = defpackage.gh.a(r5, r1, r4, r7, r6);
        if (r4 == 0) goto L_0x0314;
    L_0x030e:
        r7 = r4.isEmpty();
        if (r7 == 0) goto L_0x0316;
    L_0x0314:
        r1 = r20;
    L_0x0316:
        r5.b(r3, r6);
        r0 = r0.b;
        r11 = r5;
        r12 = r3;
        r13 = r1;
        r14 = r17;
        r15 = r21;
        r16 = r0;
        r0 = defpackage.gh.a(r11, r12, r13, r14, r15, r16);
        if (r0 == 0) goto L_0x036f;
    L_0x032a:
        r19 = new java.util.ArrayList;
        r19.<init>();
        r11 = r5;
        r12 = r0;
        r13 = r3;
        r14 = r19;
        r15 = r1;
        r16 = r4;
        r18 = r28;
        r11.a(r12, r13, r14, r15, r16, r17, r18);
        r15 = new gh$2;
        r7 = r15;
        r8 = r3;
        r9 = r5;
        r10 = r6;
        r11 = r21;
        r12 = r28;
        r13 = r19;
        r14 = r4;
        r3 = r15;
        r15 = r1;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15);
        defpackage.gs.a(r2, r3);
        r1 = new gj$2;
        r4 = r28;
        r3 = r33;
        r1.<init>(r4, r3);
        defpackage.gs.a(r2, r1);
        r5.a(r2, r0);
        r0 = new gj$3;
        r0.<init>(r4, r3);
        defpackage.gs.a(r2, r0);
        goto L_0x036f;
    L_0x0369:
        r26 = r31;
        r24 = r32;
        r29 = 0;
    L_0x036f:
        r13 = r26 + 1;
        r0 = r35;
        r1 = r36;
        r2 = r37;
        r3 = r39;
        r4 = r40;
        r15 = r24;
        r5 = r30;
        goto L_0x0048;
    L_0x0381:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.a(ga, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    private static void a(gj gjVar, Object obj, Object obj2, iv<String, View> ivVar, boolean z, fs fsVar) {
        if (fsVar.p != null && !fsVar.p.isEmpty()) {
            View view = (View) ivVar.get((String) (z ? fsVar.q : fsVar.p).get(0));
            gjVar.a(obj, view);
            if (obj2 != null) {
                gjVar.a(obj2, view);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, iv<String, View> ivVar, Collection<String> collection) {
        for (int size = ivVar.size() - 1; size >= 0; size--) {
            View view = (View) ivVar.c(size);
            if (collection.contains(kb.a.s(view))) {
                arrayList.add(view);
            }
        }
    }

    private static boolean a(gj gjVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!gjVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static iv<String, View> b(gj gjVar, iv<String, String> ivVar, Object obj, a aVar) {
        if (ivVar.isEmpty() || obj == null) {
            ivVar.clear();
            return null;
        }
        gu enterTransitionCallback;
        Collection collection;
        fv fvVar = aVar.d;
        Map ivVar2 = new iv();
        gjVar.a(ivVar2, fvVar.getView());
        fs fsVar = aVar.f;
        if (aVar.e) {
            enterTransitionCallback = fvVar.getEnterTransitionCallback();
            collection = fsVar.q;
        } else {
            enterTransitionCallback = fvVar.getExitTransitionCallback();
            collection = fsVar.p;
        }
        jc.a(ivVar2, collection);
        if (enterTransitionCallback != null) {
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                View view = (View) ivVar2.get(str);
                if (view == null) {
                    ivVar.remove(str);
                } else if (!str.equals(kb.a.s(view))) {
                    ivVar.put(kb.a.s(view), (String) ivVar.remove(str));
                }
            }
        } else {
            jc.a((Map) ivVar, ivVar2.keySet());
        }
        return ivVar2;
    }

    private static Object b(gj gjVar, fv fvVar, boolean z) {
        if (fvVar == null) {
            return null;
        }
        return gjVar.b(z ? fvVar.getReturnTransition() : fvVar.getExitTransition());
    }

    private static void b(fs fsVar, SparseArray<a> sparseArray, boolean z) {
        if (fsVar.a.f.a()) {
            for (int size = fsVar.b.size() - 1; size >= 0; size--) {
                gh.a(fsVar, (a) fsVar.b.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }
}
