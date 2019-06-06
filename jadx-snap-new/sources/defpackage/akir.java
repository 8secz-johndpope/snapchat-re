package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: akir */
public final class akir {
    public static final ThreadLocal<DateFormat> a = new 1();
    private static final String[] b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] c = new DateFormat[15];

    /* renamed from: akir$1 */
    class 1 extends ThreadLocal<DateFormat> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(akib.e);
            return simpleDateFormat;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x005e in {2, 5, 14, 18, 19, 21, 24} preds:[]
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
    public static java.util.Date a(java.lang.String r8) {
        /*
        r0 = r8.length();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
        return r1;
        r0 = new java.text.ParsePosition;
        r2 = 0;
        r0.<init>(r2);
        r3 = a;
        r3 = r3.get();
        r3 = (java.text.DateFormat) r3;
        r3 = r3.parse(r8, r0);
        r4 = r0.getIndex();
        r5 = r8.length();
        if (r4 != r5) goto L_0x0025;
        return r3;
        r3 = b;
        monitor-enter(r3);
        r4 = 0;
        r5 = 15;
        if (r4 >= r5) goto L_0x0059;
        r5 = c;	 Catch:{ all -> 0x005b }
        r5 = r5[r4];	 Catch:{ all -> 0x005b }
        if (r5 != 0) goto L_0x0047;	 Catch:{ all -> 0x005b }
        r5 = new java.text.SimpleDateFormat;	 Catch:{ all -> 0x005b }
        r6 = b;	 Catch:{ all -> 0x005b }
        r6 = r6[r4];	 Catch:{ all -> 0x005b }
        r7 = java.util.Locale.US;	 Catch:{ all -> 0x005b }
        r5.<init>(r6, r7);	 Catch:{ all -> 0x005b }
        r6 = defpackage.akib.e;	 Catch:{ all -> 0x005b }
        r5.setTimeZone(r6);	 Catch:{ all -> 0x005b }
        r6 = c;	 Catch:{ all -> 0x005b }
        r6[r4] = r5;	 Catch:{ all -> 0x005b }
        r0.setIndex(r2);	 Catch:{ all -> 0x005b }
        r5 = r5.parse(r8, r0);	 Catch:{ all -> 0x005b }
        r6 = r0.getIndex();	 Catch:{ all -> 0x005b }
        if (r6 == 0) goto L_0x0056;	 Catch:{ all -> 0x005b }
        monitor-exit(r3);	 Catch:{ all -> 0x005b }
        return r5;	 Catch:{ all -> 0x005b }
        r4 = r4 + 1;	 Catch:{ all -> 0x005b }
        goto L_0x0029;	 Catch:{ all -> 0x005b }
        monitor-exit(r3);	 Catch:{ all -> 0x005b }
        return r1;	 Catch:{ all -> 0x005b }
        r8 = move-exception;	 Catch:{ all -> 0x005b }
        monitor-exit(r3);	 Catch:{ all -> 0x005b }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akir.a(java.lang.String):java.util.Date");
    }
}
