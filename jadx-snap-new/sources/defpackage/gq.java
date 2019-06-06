package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: gq */
final class gq {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    static {
        Object obj = new Object();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x005f in {6, 16, 18, 21, 24, 26, 29, 32, 35} preds:[]
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
    public static android.os.Bundle a(android.app.Notification r6) {
        /*
        r0 = a;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x005c }
        r2 = 0;	 Catch:{ all -> 0x005c }
        if (r1 == 0) goto L_0x000a;	 Catch:{ all -> 0x005c }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        return r2;
        r1 = 1;
        r3 = b;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        if (r3 != 0) goto L_0x0033;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = android.app.Notification.class;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r4 = "extras";	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = r3.getDeclaredField(r4);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r4 = android.os.Bundle.class;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r5 = r3.getType();	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r4 = r4.isAssignableFrom(r5);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        if (r4 != 0) goto L_0x002e;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r6 = "NotificationCompat";	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = "Notification.extras field is not of type Bundle";	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        android.util.Log.e(r6, r3);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        c = r1;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        return r2;
        r3.setAccessible(r1);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        b = r3;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = b;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = r3.get(r6);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = (android.os.Bundle) r3;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        if (r3 != 0) goto L_0x0047;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3 = new android.os.Bundle;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r3.<init>();	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r4 = b;	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        r4.set(r6, r3);	 Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        return r3;	 Catch:{ all -> 0x005c }
        r6 = move-exception;	 Catch:{ all -> 0x005c }
        r3 = "NotificationCompat";	 Catch:{ all -> 0x005c }
        r4 = "Unable to access notification extras";	 Catch:{ all -> 0x005c }
        android.util.Log.e(r3, r4, r6);	 Catch:{ all -> 0x005c }
        goto L_0x0058;	 Catch:{ all -> 0x005c }
        r6 = move-exception;	 Catch:{ all -> 0x005c }
        r3 = "NotificationCompat";	 Catch:{ all -> 0x005c }
        r4 = "Unable to access notification extras";	 Catch:{ all -> 0x005c }
        goto L_0x004e;	 Catch:{ all -> 0x005c }
        c = r1;	 Catch:{ all -> 0x005c }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        return r2;	 Catch:{ all -> 0x005c }
        r6 = move-exception;	 Catch:{ all -> 0x005c }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.a(android.app.Notification):android.os.Bundle");
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }
}
