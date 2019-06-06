package defpackage;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: akhe */
public final class akhe {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private akhe(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            int i3 = ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) ? 0 : 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            return parseLong <= 0 ? Long.MIN_VALUE : parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            } else {
                throw e;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02d5  */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Missing block: B:131:0x025f, code skipped:
            if (r0 > 253402300799999L) goto L_0x0267;
     */
    private static defpackage.akhe a(long r30, defpackage.akhm r32, java.lang.String r33) {
        /*
        r0 = r33;
        r1 = ".";
        r2 = r33.length();
        r3 = 59;
        r4 = 0;
        r5 = defpackage.akib.a(r0, r4, r2, r3);
        r6 = 61;
        r7 = defpackage.akib.a(r0, r4, r5, r6);
        r8 = 0;
        if (r7 != r5) goto L_0x0019;
    L_0x0018:
        return r8;
    L_0x0019:
        r10 = defpackage.akib.c(r0, r4, r7);
        r9 = r10.isEmpty();
        if (r9 != 0) goto L_0x02eb;
    L_0x0023:
        r9 = defpackage.akib.c(r10);
        r11 = -1;
        if (r9 == r11) goto L_0x002c;
    L_0x002a:
        goto L_0x02eb;
    L_0x002c:
        r9 = 1;
        r7 = r7 + r9;
        r7 = defpackage.akib.c(r0, r7, r5);
        r12 = defpackage.akib.c(r7);
        if (r12 == r11) goto L_0x0039;
    L_0x0038:
        return r8;
    L_0x0039:
        r5 = r5 + r9;
        r20 = r8;
        r16 = -1;
        r19 = 0;
        r21 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r23 = 0;
        r24 = 1;
        r25 = 0;
    L_0x004b:
        if (r5 >= r2) goto L_0x022f;
    L_0x004d:
        r14 = defpackage.akib.a(r0, r5, r2, r3);
        r15 = defpackage.akib.a(r0, r5, r14, r6);
        r5 = defpackage.akib.c(r0, r5, r15);
        if (r15 >= r14) goto L_0x0062;
    L_0x005b:
        r15 = r15 + 1;
        r15 = defpackage.akib.c(r0, r15, r14);
        goto L_0x0064;
    L_0x0062:
        r15 = "";
    L_0x0064:
        r6 = "expires";
        r6 = r5.equalsIgnoreCase(r6);
        if (r6 == 0) goto L_0x01c2;
    L_0x006c:
        r5 = r15.length();	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = defpackage.akhe.a(r15, r4, r5, r4);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r12 = f;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r12 = r12.matcher(r15);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r3 = -1;
        r4 = -1;
        r13 = -1;
        r26 = -1;
        r27 = -1;
        r28 = -1;
    L_0x0083:
        if (r6 >= r5) goto L_0x0127;
    L_0x0085:
        r11 = r6 + 1;
        r11 = defpackage.akhe.a(r15, r11, r5, r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r12.region(r6, r11);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = -1;
        if (r3 != r6) goto L_0x00bc;
    L_0x0091:
        r6 = f;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = r12.usePattern(r6);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = r6.matches();	 Catch:{ IllegalArgumentException -> 0x01bf }
        if (r6 == 0) goto L_0x00bc;
    L_0x009d:
        r3 = r12.group(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = 2;
        r6 = r12.group(r6);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = 3;
        r9 = r12.group(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r27 = r6;
        r28 = r9;
        goto L_0x011c;
    L_0x00bc:
        r6 = r26;
        r9 = -1;
        if (r6 != r9) goto L_0x00d8;
    L_0x00c1:
        r9 = e;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r12.usePattern(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r9.matches();	 Catch:{ IllegalArgumentException -> 0x01bf }
        if (r9 == 0) goto L_0x00d7;
    L_0x00cd:
        r9 = 1;
        r6 = r12.group(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ IllegalArgumentException -> 0x01bf }
        goto L_0x011a;
    L_0x00d7:
        r9 = -1;
    L_0x00d8:
        if (r4 != r9) goto L_0x00ff;
    L_0x00da:
        r9 = d;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r12.usePattern(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r9.matches();	 Catch:{ IllegalArgumentException -> 0x01bf }
        if (r9 == 0) goto L_0x00fe;
    L_0x00e6:
        r9 = 1;
        r4 = r12.group(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r4 = r4.toLowerCase(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = d;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r9.pattern();	 Catch:{ IllegalArgumentException -> 0x01bf }
        r4 = r9.indexOf(r4);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r4 = r4 / 4;
        goto L_0x011a;
    L_0x00fe:
        r9 = -1;
    L_0x00ff:
        if (r13 != r9) goto L_0x011a;
    L_0x0101:
        r9 = c;	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r12.usePattern(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = r9.matches();	 Catch:{ IllegalArgumentException -> 0x01bf }
        if (r9 == 0) goto L_0x011a;
    L_0x010d:
        r9 = 1;
        r13 = r12.group(r9);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r9 = java.lang.Integer.parseInt(r13);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r26 = r6;
        r13 = r9;
        goto L_0x011c;
    L_0x011a:
        r26 = r6;
    L_0x011c:
        r11 = r11 + 1;
        r6 = 0;
        r9 = defpackage.akhe.a(r15, r11, r5, r6);	 Catch:{ IllegalArgumentException -> 0x01bf }
        r6 = r9;
        r9 = 1;
        goto L_0x0083;
    L_0x0127:
        r6 = r26;
        r5 = 70;
        if (r13 < r5) goto L_0x0133;
    L_0x012d:
        r5 = 99;
        if (r13 > r5) goto L_0x0133;
    L_0x0131:
        r13 = r13 + 1900;
    L_0x0133:
        if (r13 < 0) goto L_0x013b;
    L_0x0135:
        r5 = 69;
        if (r13 > r5) goto L_0x013b;
    L_0x0139:
        r13 = r13 + 2000;
    L_0x013b:
        r5 = 1601; // 0x641 float:2.243E-42 double:7.91E-321;
        if (r13 < r5) goto L_0x01b7;
    L_0x013f:
        r9 = -1;
        if (r4 == r9) goto L_0x01af;
    L_0x0142:
        if (r6 <= 0) goto L_0x01a7;
    L_0x0144:
        r5 = 31;
        if (r6 > r5) goto L_0x01a7;
    L_0x0148:
        if (r3 < 0) goto L_0x019f;
    L_0x014a:
        r5 = 23;
        if (r3 > r5) goto L_0x019f;
    L_0x014e:
        r11 = r27;
        if (r11 < 0) goto L_0x0197;
    L_0x0152:
        r12 = 59;
        if (r11 > r12) goto L_0x0199;
    L_0x0156:
        r5 = r28;
        if (r5 < 0) goto L_0x0191;
    L_0x015a:
        if (r5 > r12) goto L_0x0191;
    L_0x015c:
        r15 = new java.util.GregorianCalendar;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r9 = defpackage.akib.e;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r15.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r9 = 0;
        r15.setLenient(r9);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r9 = 1;
        r15.set(r9, r13);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r4 = r4 + -1;
        r9 = 2;
        r15.set(r9, r4);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r4 = 5;
        r15.set(r4, r6);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r4 = 11;
        r15.set(r4, r3);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = 12;
        r15.set(r3, r11);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = 13;
        r15.set(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = 14;
        r4 = 0;
        r15.set(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3 = r15.getTimeInMillis();	 Catch:{ IllegalArgumentException -> 0x0224 }
        r21 = r3;
        goto L_0x01d2;
    L_0x0191:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0197:
        r12 = 59;
    L_0x0199:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x019f:
        r12 = 59;
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01a7:
        r12 = 59;
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01af:
        r12 = 59;
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01b7:
        r12 = 59;
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01bf:
        r12 = 59;
        goto L_0x0224;
    L_0x01c2:
        r12 = 59;
        r3 = "max-age";
        r3 = r5.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x01d5;
    L_0x01cc:
        r3 = defpackage.akhe.a(r15);	 Catch:{  }
        r16 = r3;
    L_0x01d2:
        r25 = 1;
        goto L_0x0224;
    L_0x01d5:
        r3 = "domain";
        r3 = r5.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x0204;
    L_0x01dd:
        r3 = r15.endsWith(r1);	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r3 != 0) goto L_0x01fe;
    L_0x01e3:
        r3 = r15.startsWith(r1);	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r3 == 0) goto L_0x01ee;
    L_0x01e9:
        r3 = 1;
        r15 = r15.substring(r3);	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01ee:
        r3 = defpackage.akib.b(r15);	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r3 == 0) goto L_0x01f8;
    L_0x01f4:
        r8 = r3;
        r24 = 0;
        goto L_0x0224;
    L_0x01f8:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x01fe:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0224 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0204:
        r3 = "path";
        r3 = r5.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x020f;
    L_0x020c:
        r20 = r15;
        goto L_0x0224;
    L_0x020f:
        r3 = "secure";
        r3 = r5.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x021a;
    L_0x0217:
        r19 = 1;
        goto L_0x0224;
    L_0x021a:
        r3 = "httponly";
        r3 = r5.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x0224;
    L_0x0222:
        r23 = 1;
    L_0x0224:
        r5 = r14 + 1;
        r3 = 59;
        r4 = 0;
        r6 = 61;
        r9 = 1;
        r11 = -1;
        goto L_0x004b;
    L_0x022f:
        r0 = -9223372036854775808;
        r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x0239;
    L_0x0235:
        r12 = r0;
        r0 = r32;
        goto L_0x026f;
    L_0x0239:
        r0 = -1;
        r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x026b;
    L_0x023f:
        r0 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x024d;
    L_0x0248:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 * r0;
        goto L_0x0252;
    L_0x024d:
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0252:
        r0 = r30 + r16;
        r2 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1));
        if (r2 < 0) goto L_0x0262;
    L_0x0258:
        r2 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0235;
    L_0x0261:
        goto L_0x0267;
    L_0x0262:
        r2 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
    L_0x0267:
        r0 = r32;
        r12 = r2;
        goto L_0x026f;
    L_0x026b:
        r0 = r32;
        r12 = r21;
    L_0x026f:
        r1 = r0.b;
        if (r8 != 0) goto L_0x0276;
    L_0x0273:
        r14 = r1;
        r2 = 0;
        goto L_0x02a7;
    L_0x0276:
        r2 = r1.equals(r8);
        if (r2 == 0) goto L_0x027f;
    L_0x027c:
        r29 = 1;
        goto L_0x02a1;
    L_0x027f:
        r2 = r1.endsWith(r8);
        if (r2 == 0) goto L_0x029f;
    L_0x0285:
        r2 = r1.length();
        r3 = r8.length();
        r2 = r2 - r3;
        r9 = 1;
        r2 = r2 - r9;
        r2 = r1.charAt(r2);
        r3 = 46;
        if (r2 != r3) goto L_0x029f;
    L_0x0298:
        r2 = defpackage.akib.d(r1);
        if (r2 != 0) goto L_0x029f;
    L_0x029e:
        goto L_0x027c;
    L_0x029f:
        r29 = 0;
    L_0x02a1:
        if (r29 != 0) goto L_0x02a5;
    L_0x02a3:
        r2 = 0;
        return r2;
    L_0x02a5:
        r2 = 0;
        r14 = r8;
    L_0x02a7:
        r1 = r1.length();
        r3 = r14.length();
        if (r1 == r3) goto L_0x02ba;
    L_0x02b1:
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a;
        r1 = r1.a(r14);
        if (r1 != 0) goto L_0x02ba;
    L_0x02b9:
        return r2;
    L_0x02ba:
        r1 = "/";
        r8 = r20;
        if (r8 == 0) goto L_0x02c9;
    L_0x02c0:
        r2 = r8.startsWith(r1);
        if (r2 != 0) goto L_0x02c7;
    L_0x02c6:
        goto L_0x02c9;
    L_0x02c7:
        r15 = r8;
        goto L_0x02db;
    L_0x02c9:
        r0 = r32.f();
        r2 = 47;
        r2 = r0.lastIndexOf(r2);
        if (r2 == 0) goto L_0x02da;
    L_0x02d5:
        r3 = 0;
        r1 = r0.substring(r3, r2);
    L_0x02da:
        r15 = r1;
    L_0x02db:
        r0 = new akhe;
        r9 = r0;
        r11 = r7;
        r16 = r19;
        r17 = r23;
        r18 = r24;
        r19 = r25;
        r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19);
        return r0;
    L_0x02eb:
        r0 = r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhe.a(long, akhm, java.lang.String):akhe");
    }

    public static List<akhe> a(akhm akhm, akhl akhl) {
        List b = akhl.b("Set-Cookie");
        int size = b.size();
        List list = null;
        for (int i = 0; i < size; i++) {
            akhe a = akhe.a(System.currentTimeMillis(), akhm, (String) b.get(i));
            if (a != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a);
            }
        }
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akhe)) {
            return false;
        }
        akhe akhe = (akhe) obj;
        return akhe.a.equals(this.a) && akhe.b.equals(this.b) && akhe.h.equals(this.h) && akhe.i.equals(this.i) && akhe.g == this.g && akhe.j == this.j && akhe.k == this.k && akhe.l == this.l && akhe.m == this.m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        long j = this.g;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.j ^ 1)) * 31) + (this.k ^ 1)) * 31) + (this.l ^ 1)) * 31) + (this.m ^ 1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('=');
        stringBuilder.append(this.b);
        if (this.l) {
            String str;
            if (this.g == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                stringBuilder.append("; expires=");
                str = ((DateFormat) akir.a.get()).format(new Date(this.g));
            }
            stringBuilder.append(str);
        }
        if (!this.m) {
            stringBuilder.append("; domain=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.i);
        if (this.j) {
            stringBuilder.append("; secure");
        }
        if (this.k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }
}
