package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bac */
public final class bac implements bav {
    private final Context a;

    public bac(Context context) {
        this.a = context;
    }

    private static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    private static List<String> a(List<String> list, String str) {
        if (str == null) {
            return list;
        }
        if (list == null) {
            return bac.a(str);
        }
        Collections.addAll(list, new String[]{str});
        return list;
    }

    private static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        list.addAll(list2);
        return list;
    }

    private static List<String> a(boolean z, List<String> list, String str) {
        return z ? bac.a((List) list, str) : list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012d  */
    public final java.util.List<java.lang.String> a(defpackage.bas r13) {
        /*
        r12 = this;
        r0 = r13.f();
        r1 = defpackage.bay.a;
        r2 = 0;
        if (r0 == r1) goto L_0x0018;
    L_0x0009:
        r1 = r0 instanceof defpackage.bau.b;
        if (r1 != 0) goto L_0x0018;
    L_0x000d:
        r0 = r0 instanceof defpackage.bau.a;
        if (r0 != 0) goto L_0x0018;
    L_0x0011:
        r0 = "Unknown trigger provided";
        r0 = defpackage.bac.a(r0);
        goto L_0x0019;
    L_0x0018:
        r0 = r2;
    L_0x0019:
        r0 = defpackage.bac.a(r2, r0);
        r1 = r13.c();
        r3 = r1.c;
        r4 = r1.d;
        r1 = r1.e;
        r5 = 2;
        r6 = 0;
        r7 = 1;
        if (r3 == r7) goto L_0x0030;
    L_0x002c:
        if (r3 == r5) goto L_0x0030;
    L_0x002e:
        r3 = 1;
        goto L_0x0031;
    L_0x0030:
        r3 = 0;
    L_0x0031:
        r8 = "Unknown retry policy provided";
        r3 = defpackage.bac.a(r3, r2, r8);
        if (r1 >= r4) goto L_0x003b;
    L_0x0039:
        r8 = 1;
        goto L_0x003c;
    L_0x003b:
        r8 = 0;
    L_0x003c:
        r9 = "Maximum backoff must be greater than or equal to initial backoff";
        r3 = defpackage.bac.a(r8, r3, r9);
        r8 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r8 <= r1) goto L_0x0048;
    L_0x0046:
        r1 = 1;
        goto L_0x0049;
    L_0x0048:
        r1 = 0;
    L_0x0049:
        r8 = "Maximum backoff must be greater than 300s (5 minutes)";
        r1 = defpackage.bac.a(r1, r3, r8);
        r3 = 30;
        if (r4 >= r3) goto L_0x0055;
    L_0x0053:
        r3 = 1;
        goto L_0x0056;
    L_0x0055:
        r3 = 0;
    L_0x0056:
        r4 = "Initial backoff must be at least 30s";
        r1 = defpackage.bac.a(r3, r1, r4);
        r0 = defpackage.bac.a(r0, r1);
        r1 = r13.h();
        if (r1 == 0) goto L_0x0074;
    L_0x0066:
        r1 = r13.f();
        r3 = defpackage.bay.a;
        if (r1 != r3) goto L_0x0074;
    L_0x006e:
        r1 = "ImmediateTriggers can't be used with recurring jobs";
        r0 = defpackage.bac.a(r0, r1);
    L_0x0074:
        r1 = r13.b();
        if (r1 == 0) goto L_0x00a7;
    L_0x007a:
        r3 = android.os.Parcel.obtain();
        r1.writeToParcel(r3, r6);
        r1 = r3.dataSize();
        r3.recycle();
        r3 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        if (r1 <= r3) goto L_0x00a7;
    L_0x008c:
        r4 = java.util.Locale.US;
        r8 = new java.lang.Object[r5];
        r1 = java.lang.Integer.valueOf(r1);
        r8[r6] = r1;
        r1 = java.lang.Integer.valueOf(r3);
        r8[r7] = r1;
        r1 = "Extras too large: %d bytes is > the max (%d bytes)";
        r1 = java.lang.String.format(r4, r1, r8);
        r1 = defpackage.bac.a(r1);
        goto L_0x00a8;
    L_0x00a7:
        r1 = r2;
    L_0x00a8:
        r0 = defpackage.bac.a(r0, r1);
        r1 = r13.g();
        if (r1 <= r7) goto L_0x010a;
    L_0x00b2:
        r1 = r13.b();
        if (r1 == 0) goto L_0x0105;
    L_0x00b8:
        r3 = r1.keySet();
        r3 = r3.iterator();
        r4 = r2;
    L_0x00c1:
        r8 = r3.hasNext();
        if (r8 == 0) goto L_0x0106;
    L_0x00c7:
        r8 = r3.next();
        r8 = (java.lang.String) r8;
        r9 = r1.get(r8);
        if (r9 == 0) goto L_0x00ff;
    L_0x00d3:
        r10 = r9 instanceof java.lang.Integer;
        if (r10 != 0) goto L_0x00ff;
    L_0x00d7:
        r10 = r9 instanceof java.lang.Long;
        if (r10 != 0) goto L_0x00ff;
    L_0x00db:
        r10 = r9 instanceof java.lang.Double;
        if (r10 != 0) goto L_0x00ff;
    L_0x00df:
        r10 = r9 instanceof java.lang.String;
        if (r10 != 0) goto L_0x00ff;
    L_0x00e3:
        r10 = r9 instanceof java.lang.Boolean;
        if (r10 == 0) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00ff;
    L_0x00e8:
        r10 = java.util.Locale.US;
        r11 = new java.lang.Object[r5];
        if (r9 != 0) goto L_0x00f0;
    L_0x00ee:
        r9 = r2;
        goto L_0x00f4;
    L_0x00f0:
        r9 = r9.getClass();
    L_0x00f4:
        r11[r6] = r9;
        r11[r7] = r8;
        r8 = "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean";
        r8 = java.lang.String.format(r10, r8, r11);
        goto L_0x0100;
    L_0x00ff:
        r8 = r2;
    L_0x0100:
        r4 = defpackage.bac.a(r4, r8);
        goto L_0x00c1;
    L_0x0105:
        r4 = r2;
    L_0x0106:
        r0 = defpackage.bac.a(r0, r4);
    L_0x010a:
        r1 = r13.e();
        if (r1 != 0) goto L_0x0117;
    L_0x0110:
        r1 = "Tag can't be null";
    L_0x0112:
        r1 = defpackage.bac.a(r1);
        goto L_0x0123;
    L_0x0117:
        r1 = r1.length();
        r3 = 100;
        if (r1 <= r3) goto L_0x0122;
    L_0x011f:
        r1 = "Tag must be shorter than 100";
        goto L_0x0112;
    L_0x0122:
        r1 = r2;
    L_0x0123:
        r0 = defpackage.bac.a(r0, r1);
        r13 = r13.i();
        if (r13 == 0) goto L_0x01a3;
    L_0x012d:
        r1 = r13.isEmpty();
        if (r1 == 0) goto L_0x0134;
    L_0x0133:
        goto L_0x01a3;
    L_0x0134:
        r1 = r12.a;
        if (r1 != 0) goto L_0x013b;
    L_0x0138:
        r13 = "Context is null, can't query PackageManager";
        goto L_0x01a5;
    L_0x013b:
        r1 = r1.getPackageManager();
        if (r1 != 0) goto L_0x0144;
    L_0x0141:
        r13 = "PackageManager is null, can't validate service";
        goto L_0x01a5;
    L_0x0144:
        r3 = new android.content.Intent;
        r4 = "com.firebase.jobdispatcher.ACTION_EXECUTE";
        r3.<init>(r4);
        r4 = r12.a;
        r3.setClassName(r4, r13);
        r1 = r1.queryIntentServices(r3, r6);
        if (r1 == 0) goto L_0x018a;
    L_0x0156:
        r3 = r1.isEmpty();
        if (r3 == 0) goto L_0x015d;
    L_0x015c:
        goto L_0x018a;
    L_0x015d:
        r1 = r1.iterator();
    L_0x0161:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0178;
    L_0x0167:
        r3 = r1.next();
        r3 = (android.content.pm.ResolveInfo) r3;
        r4 = r3.serviceInfo;
        if (r4 == 0) goto L_0x0161;
    L_0x0171:
        r3 = r3.serviceInfo;
        r3 = r3.enabled;
        if (r3 == 0) goto L_0x0161;
    L_0x0177:
        goto L_0x01a9;
    L_0x0178:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r13);
        r13 = " is disabled.";
        r1.append(r13);
        r13 = r1.toString();
        goto L_0x01a5;
    L_0x018a:
        r1 = new java.lang.StringBuilder;
        r3 = "Couldn't find a registered service with the name ";
        r1.<init>(r3);
        r1.append(r13);
        r13 = ". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.";
        r1.append(r13);
        r13 = r1.toString();
        r1 = "FJD.GooglePlayReceiver";
        android.util.Log.e(r1, r13);
        goto L_0x01a9;
    L_0x01a3:
        r13 = "Service can't be empty";
    L_0x01a5:
        r2 = defpackage.bac.a(r13);
    L_0x01a9:
        r13 = defpackage.bac.a(r0, r2);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.a(bas):java.util.List");
    }
}
