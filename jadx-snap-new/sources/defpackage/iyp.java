package defpackage;

/* renamed from: iyp */
public final class iyp {
    public static final iyp a = new iyp();
    private static final String[] b;
    private static final String[] c;

    static {
        String str = "display_name";
        String str2 = "data1";
        b = new String[]{str2, str, "contact_last_updated_timestamp"};
        c = new String[]{str2, str};
    }

    private iyp() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x0096 in {3, 8, 9, 16, 17, 20, 22, 24, 30, 32, 34} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static java.util.Set<defpackage.iqi> a(android.content.Context r9) {
        /*
        r0 = "context";
        defpackage.akcr.b(r9, r0);
        r0 = defpackage.ifs.a();
        r0 = r0.f();
        if (r0 != 0) goto L_0x0014;
        r9 = defpackage.ajyy.a;
        r9 = (java.util.Set) r9;
        return r9;
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = "phone";
        r1 = r9.getSystemService(r1);
        if (r1 == 0) goto L_0x008e;
        r1 = (android.telephony.TelephonyManager) r1;
        r2 = r1.getSimCountryIso();
        r2 = (java.lang.CharSequence) r2;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x0032;
        r1 = "US";
        goto L_0x0036;
        r1 = r1.getSimCountryIso();
        r2 = r9.getContentResolver();
        r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        r4 = b;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = r2.query(r3, r4, r5, r6, r7);
        r9 = (java.io.Closeable) r9;
        r2 = 0;
        r3 = r9;	 Catch:{ Throwable -> 0x0087 }
        r3 = (android.database.Cursor) r3;	 Catch:{ Throwable -> 0x0087 }
        r4 = r3.moveToFirst();	 Catch:{ Throwable -> 0x0087 }
        if (r4 == 0) goto L_0x007f;	 Catch:{ Throwable -> 0x0087 }
        r4 = 0;	 Catch:{ Throwable -> 0x0087 }
        r4 = r3.getString(r4);	 Catch:{ Throwable -> 0x0087 }
        r5 = 1;	 Catch:{ Throwable -> 0x0087 }
        r5 = r3.getString(r5);	 Catch:{ Throwable -> 0x0087 }
        r6 = 2;	 Catch:{ Throwable -> 0x0087 }
        r6 = r3.getLong(r6);	 Catch:{ Throwable -> 0x0087 }
        if (r4 != 0) goto L_0x0064;	 Catch:{ Throwable -> 0x0087 }
        r4 = r2;	 Catch:{ Throwable -> 0x0087 }
        goto L_0x006d;	 Catch:{ Throwable -> 0x0087 }
        r8 = "countryCode";	 Catch:{ Throwable -> 0x0087 }
        defpackage.akcr.a(r1, r8);	 Catch:{ Throwable -> 0x0087 }
        r4 = defpackage.juo.a(r4, r1);	 Catch:{ Throwable -> 0x0087 }
        if (r4 == 0) goto L_0x0079;	 Catch:{ Throwable -> 0x0087 }
        if (r5 == 0) goto L_0x0079;	 Catch:{ Throwable -> 0x0087 }
        r8 = new iqi;	 Catch:{ Throwable -> 0x0087 }
        r8.<init>(r4, r5, r6);	 Catch:{ Throwable -> 0x0087 }
        r0.add(r8);	 Catch:{ Throwable -> 0x0087 }
        r4 = r3.moveToNext();	 Catch:{ Throwable -> 0x0087 }
        if (r4 != 0) goto L_0x0051;
        defpackage.akax.a(r9, r2);
        r0 = (java.util.Set) r0;
        return r0;
        r0 = move-exception;
        goto L_0x008a;
        r0 = move-exception;
        r2 = r0;
        throw r2;	 Catch:{ all -> 0x0085 }
        defpackage.akax.a(r9, r2);
        throw r0;
        r9 = new ajxt;
        r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
        r9.<init>(r0);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyp.a(android.content.Context):java.util.Set");
    }

    public static boolean a(String str) {
        akcr.b(str, "username");
        return abrk.a().b(abro.HAS_GIVEN_ACCESS_TO_CONTACTS, String.valueOf(str.hashCode())) && ifs.a().f();
    }

    /* JADX WARNING: Missing block: B:13:0x0038, code skipped:
            defpackage.akax.a(r6, r0);
     */
    public static int b(android.content.Context r6) {
        /*
        r0 = "context";
        defpackage.akcr.b(r6, r0);
        r0 = defpackage.ifs.a();
        r0 = r0.f();
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        r6 = 0;
        return r6;
    L_0x0011:
        r0 = r6.getContentResolver();
        r1 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = r0.query(r1, r2, r3, r4, r5);
        r6 = (java.io.Closeable) r6;
        r0 = 0;
        r1 = r6;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0036 }
        r2 = "cursor";
        defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x0036 }
        r1 = r1.getCount();	 Catch:{ Throwable -> 0x0036 }
        r1 = r1 + -1;
        defpackage.akax.a(r6, r0);
        return r1;
    L_0x0034:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0034 }
    L_0x0038:
        defpackage.akax.a(r6, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyp.b(android.content.Context):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x005b in {2, 11, 14, 16, 21, 23} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static int c(android.content.Context r8) {
        /*
        r0 = "context";
        defpackage.akcr.b(r8, r0);
        r0 = defpackage.ifs.a();
        r0 = r0.f();
        r1 = 0;
        if (r0 != 0) goto L_0x0011;
        return r1;
        r2 = r8.getContentResolver();
        r3 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        r4 = c;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r2.query(r3, r4, r5, r6, r7);
        r8 = (java.io.Closeable) r8;
        r0 = 0;
        r2 = r8;	 Catch:{ Throwable -> 0x0055 }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0055 }
        r3 = r2.moveToFirst();	 Catch:{ Throwable -> 0x0055 }
        if (r3 == 0) goto L_0x004f;	 Catch:{ Throwable -> 0x0055 }
        r3 = 0;	 Catch:{ Throwable -> 0x0055 }
        r4 = r2.getString(r1);	 Catch:{ Throwable -> 0x0055 }
        r5 = 1;	 Catch:{ Throwable -> 0x0055 }
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x0055 }
        r6 = android.util.Patterns.EMAIL_ADDRESS;	 Catch:{ Throwable -> 0x0055 }
        r4 = (java.lang.CharSequence) r4;	 Catch:{ Throwable -> 0x0055 }
        r4 = r6.matcher(r4);	 Catch:{ Throwable -> 0x0055 }
        r4 = r4.matches();	 Catch:{ Throwable -> 0x0055 }
        if (r4 == 0) goto L_0x0048;	 Catch:{ Throwable -> 0x0055 }
        if (r5 == 0) goto L_0x0048;	 Catch:{ Throwable -> 0x0055 }
        r3 = r3 + 1;	 Catch:{ Throwable -> 0x0055 }
        r4 = r2.moveToNext();	 Catch:{ Throwable -> 0x0055 }
        if (r4 != 0) goto L_0x002d;
        r1 = r3;
        defpackage.akax.a(r8, r0);
        return r1;
        r1 = move-exception;
        goto L_0x0057;
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
        defpackage.akax.a(r8, r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyp.c(android.content.Context):int");
    }
}
