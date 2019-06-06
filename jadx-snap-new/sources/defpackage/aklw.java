package defpackage;

/* renamed from: aklw */
public final class aklw {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0033 A:{SYNTHETIC, Splitter:B:29:0x0033} */
    public static <T> T a(java.io.InputStream r2) {
        /*
        r0 = 0;
        r1 = new java.io.ObjectInputStream;	 Catch:{ ClassCastException -> 0x002a, ClassNotFoundException -> 0x0023, IOException -> 0x001c }
        r1.<init>(r2);	 Catch:{ ClassCastException -> 0x002a, ClassNotFoundException -> 0x0023, IOException -> 0x001c }
        r2 = r1.readObject();	 Catch:{ ClassCastException -> 0x0017, ClassNotFoundException -> 0x0014, IOException -> 0x0011, all -> 0x000e }
        r1.close();	 Catch:{ IOException -> 0x000d }
    L_0x000d:
        return r2;
    L_0x000e:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0031;
    L_0x0011:
        r2 = move-exception;
        r0 = r1;
        goto L_0x001d;
    L_0x0014:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0024;
    L_0x0017:
        r2 = move-exception;
        r0 = r1;
        goto L_0x002b;
    L_0x001a:
        r2 = move-exception;
        goto L_0x0031;
    L_0x001c:
        r2 = move-exception;
    L_0x001d:
        r1 = new aklv;	 Catch:{ all -> 0x001a }
        r1.<init>(r2);	 Catch:{ all -> 0x001a }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x0023:
        r2 = move-exception;
    L_0x0024:
        r1 = new aklv;	 Catch:{ all -> 0x001a }
        r1.<init>(r2);	 Catch:{ all -> 0x001a }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x002a:
        r2 = move-exception;
    L_0x002b:
        r1 = new aklv;	 Catch:{ all -> 0x001a }
        r1.<init>(r2);	 Catch:{ all -> 0x001a }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x0031:
        if (r0 == 0) goto L_0x0036;
    L_0x0033:
        r0.close();	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.a(java.io.InputStream):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001e A:{SYNTHETIC, Splitter:B:18:0x001e} */
    public static void a(java.io.Serializable r2, java.io.OutputStream r3) {
        /*
        r0 = 0;
        r1 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0015 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0015 }
        r1.writeObject(r2);	 Catch:{ IOException -> 0x0010, all -> 0x000d }
        r1.close();	 Catch:{ IOException -> 0x000c }
    L_0x000c:
        return;
    L_0x000d:
        r2 = move-exception;
        r0 = r1;
        goto L_0x001c;
    L_0x0010:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0016;
    L_0x0013:
        r2 = move-exception;
        goto L_0x001c;
    L_0x0015:
        r2 = move-exception;
    L_0x0016:
        r3 = new aklv;	 Catch:{ all -> 0x0013 }
        r3.<init>(r2);	 Catch:{ all -> 0x0013 }
        throw r3;	 Catch:{ all -> 0x0013 }
    L_0x001c:
        if (r0 == 0) goto L_0x0021;
    L_0x001e:
        r0.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.a(java.io.Serializable, java.io.OutputStream):void");
    }
}
