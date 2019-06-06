package defpackage;

/* renamed from: akat */
public final class akat {
    public static final akas a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f7 */
    static {
        /*
        r0 = defpackage.akat.a();
        r1 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)";
        r2 = ", base type classloader: ";
        r3 = "Instance classloader: ";
        r4 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations";
        r5 = "Class.forName(\"kotlin.in…entations\").newInstance()";
        r6 = 65544; // 0x10008 float:9.1847E-41 double:3.2383E-319;
        if (r0 < r6) goto L_0x00a7;
    L_0x0013:
        r6 = "kotlin.internal.jdk8.JDK8PlatformImplementations";
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x005d }
        r6 = r6.newInstance();	 Catch:{ ClassNotFoundException -> 0x005d }
        defpackage.akcr.a(r6, r5);	 Catch:{ ClassNotFoundException -> 0x005d }
        if (r6 == 0) goto L_0x0028;
    L_0x0022:
        r6 = (defpackage.akas) r6;	 Catch:{ ClassCastException -> 0x0026 }
        goto L_0x0146;
    L_0x0026:
        r7 = move-exception;
        goto L_0x002e;
    L_0x0028:
        r7 = new ajxt;	 Catch:{ ClassCastException -> 0x0026 }
        r7.<init>(r4);	 Catch:{ ClassCastException -> 0x0026 }
        throw r7;	 Catch:{ ClassCastException -> 0x0026 }
    L_0x002e:
        r6 = r6.getClass();	 Catch:{ ClassNotFoundException -> 0x005d }
        r6 = r6.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x005d }
        r8 = defpackage.akas.class;
        r8 = r8.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x005d }
        r9 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x005d }
        r10 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x005d }
        r10.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x005d }
        r10.append(r6);	 Catch:{ ClassNotFoundException -> 0x005d }
        r10.append(r2);	 Catch:{ ClassNotFoundException -> 0x005d }
        r10.append(r8);	 Catch:{ ClassNotFoundException -> 0x005d }
        r6 = r10.toString();	 Catch:{ ClassNotFoundException -> 0x005d }
        r9.<init>(r6);	 Catch:{ ClassNotFoundException -> 0x005d }
        r7 = (java.lang.Throwable) r7;	 Catch:{ ClassNotFoundException -> 0x005d }
        r6 = r9.initCause(r7);	 Catch:{ ClassNotFoundException -> 0x005d }
        defpackage.akcr.a(r6, r1);	 Catch:{ ClassNotFoundException -> 0x005d }
        throw r6;	 Catch:{ ClassNotFoundException -> 0x005d }
    L_0x005d:
        r6 = "kotlin.internal.JRE8PlatformImplementations";
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r6 = r6.newInstance();	 Catch:{ ClassNotFoundException -> 0x00a7 }
        defpackage.akcr.a(r6, r5);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        if (r6 == 0) goto L_0x0072;
    L_0x006c:
        r6 = (defpackage.akas) r6;	 Catch:{ ClassCastException -> 0x0070 }
        goto L_0x0146;
    L_0x0070:
        r7 = move-exception;
        goto L_0x0078;
    L_0x0072:
        r7 = new ajxt;	 Catch:{ ClassCastException -> 0x0070 }
        r7.<init>(r4);	 Catch:{ ClassCastException -> 0x0070 }
        throw r7;	 Catch:{ ClassCastException -> 0x0070 }
    L_0x0078:
        r6 = r6.getClass();	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r6 = r6.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r8 = defpackage.akas.class;
        r8 = r8.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r9 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r10 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r10.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r10.append(r6);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r10.append(r2);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r10.append(r8);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r6 = r10.toString();	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r9.<init>(r6);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r7 = (java.lang.Throwable) r7;	 Catch:{ ClassNotFoundException -> 0x00a7 }
        r6 = r9.initCause(r7);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        defpackage.akcr.a(r6, r1);	 Catch:{ ClassNotFoundException -> 0x00a7 }
        throw r6;	 Catch:{ ClassNotFoundException -> 0x00a7 }
    L_0x00a7:
        r6 = 65543; // 0x10007 float:9.1845E-41 double:3.23825E-319;
        if (r0 < r6) goto L_0x0141;
    L_0x00ac:
        r0 = "akav";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x00f7 }
        defpackage.akcr.a(r0, r5);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00bb:
        r6 = r0;
        r6 = (defpackage.akas) r6;	 Catch:{ ClassCastException -> 0x00c0 }
        goto L_0x0146;
    L_0x00c0:
        r6 = move-exception;
        goto L_0x00c8;
    L_0x00c2:
        r6 = new ajxt;	 Catch:{ ClassCastException -> 0x00c0 }
        r6.<init>(r4);	 Catch:{ ClassCastException -> 0x00c0 }
        throw r6;	 Catch:{ ClassCastException -> 0x00c0 }
    L_0x00c8:
        r0 = r0.getClass();	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r7 = defpackage.akas.class;
        r7 = r7.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r8 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r9 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r9.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r9.append(r0);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r9.append(r2);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r9.append(r7);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r0 = r9.toString();	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r8.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ ClassNotFoundException -> 0x00f7 }
        r0 = r8.initCause(r6);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        defpackage.akcr.a(r0, r1);	 Catch:{ ClassNotFoundException -> 0x00f7 }
        throw r0;	 Catch:{ ClassNotFoundException -> 0x00f7 }
    L_0x00f7:
        r0 = "kotlin.internal.JRE7PlatformImplementations";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x0141 }
        defpackage.akcr.a(r0, r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        if (r0 == 0) goto L_0x010c;
    L_0x0106:
        r6 = r0;
        r6 = (defpackage.akas) r6;	 Catch:{ ClassCastException -> 0x010a }
        goto L_0x0146;
    L_0x010a:
        r4 = move-exception;
        goto L_0x0112;
    L_0x010c:
        r5 = new ajxt;	 Catch:{ ClassCastException -> 0x010a }
        r5.<init>(r4);	 Catch:{ ClassCastException -> 0x010a }
        throw r5;	 Catch:{ ClassCastException -> 0x010a }
    L_0x0112:
        r0 = r0.getClass();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r5 = defpackage.akas.class;
        r5 = r5.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r6 = new java.lang.ClassCastException;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r7.<init>(r3);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r7.append(r0);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r7.append(r2);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r7.append(r5);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r0 = r7.toString();	 Catch:{ ClassNotFoundException -> 0x0141 }
        r6.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0141 }
        r4 = (java.lang.Throwable) r4;	 Catch:{ ClassNotFoundException -> 0x0141 }
        r0 = r6.initCause(r4);	 Catch:{ ClassNotFoundException -> 0x0141 }
        defpackage.akcr.a(r0, r1);	 Catch:{ ClassNotFoundException -> 0x0141 }
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0141 }
    L_0x0141:
        r6 = new akas;
        r6.<init>();
    L_0x0146:
        a = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akat.<clinit>():void");
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int a = akgc.a(charSequence, '.', 0, false, 6);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) << 16;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = akgc.a(charSequence, '.', i2, false, 4);
        if (a2 < 0) {
            a2 = property.length();
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        if (property != null) {
            Object substring = property.substring(0, a);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            akcr.a(substring, str2);
            if (property != null) {
                Object substring2 = property.substring(i2, a2);
                akcr.a(substring2, str2);
                try {
                    i = (Integer.parseInt(substring) << 16) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }
}
