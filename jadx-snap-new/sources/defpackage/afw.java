package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: afw */
public final class afw {
    private final Context a;

    public afw(Context context) {
        this.a = context;
    }

    private static afu a(String str) {
        try {
            Class cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                afw.a(cls, e);
            }
            if (obj instanceof afu) {
                return (afu) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(obj)));
        } catch (ClassNotFoundException e2) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e2);
        }
    }

    private static void a(Class<?> cls, Exception exception) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), exception);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00a3 in {2, 9, 10, 13, 22, 25, 26, 29} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<defpackage.afu> a() {
        /*
        r8 = this;
        r0 = 3;
        r1 = "ManifestParser";
        r2 = android.util.Log.isLoggable(r1, r0);
        if (r2 == 0) goto L_0x000e;
        r2 = "Loading Glide modules";
        android.util.Log.d(r1, r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.a;	 Catch:{ NameNotFoundException -> 0x009a }
        r3 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r8.a;	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x009a }
        r3 = r3.getApplicationInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r3.metaData;	 Catch:{ NameNotFoundException -> 0x009a }
        if (r4 != 0) goto L_0x0035;	 Catch:{ NameNotFoundException -> 0x009a }
        r0 = android.util.Log.isLoggable(r1, r0);	 Catch:{ NameNotFoundException -> 0x009a }
        if (r0 == 0) goto L_0x0034;	 Catch:{ NameNotFoundException -> 0x009a }
        r0 = "Got null app info metadata";	 Catch:{ NameNotFoundException -> 0x009a }
        android.util.Log.d(r1, r0);	 Catch:{ NameNotFoundException -> 0x009a }
        return r2;	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = 2;	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = android.util.Log.isLoggable(r1, r4);	 Catch:{ NameNotFoundException -> 0x009a }
        if (r4 == 0) goto L_0x004f;	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = "Got app info metadata: ";	 Catch:{ NameNotFoundException -> 0x009a }
        r4.<init>(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = r3.metaData;	 Catch:{ NameNotFoundException -> 0x009a }
        r4.append(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r4.toString();	 Catch:{ NameNotFoundException -> 0x009a }
        android.util.Log.v(r1, r4);	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r3.metaData;	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r4.keySet();	 Catch:{ NameNotFoundException -> 0x009a }
        r4 = r4.iterator();	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = r4.hasNext();	 Catch:{ NameNotFoundException -> 0x009a }
        if (r5 == 0) goto L_0x008e;	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = r4.next();	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = (java.lang.String) r5;	 Catch:{ NameNotFoundException -> 0x009a }
        r6 = "GlideModule";	 Catch:{ NameNotFoundException -> 0x009a }
        r7 = r3.metaData;	 Catch:{ NameNotFoundException -> 0x009a }
        r7 = r7.get(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r6 = r6.equals(r7);	 Catch:{ NameNotFoundException -> 0x009a }
        if (r6 == 0) goto L_0x0059;	 Catch:{ NameNotFoundException -> 0x009a }
        r6 = defpackage.afw.a(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r2.add(r6);	 Catch:{ NameNotFoundException -> 0x009a }
        r6 = android.util.Log.isLoggable(r1, r0);	 Catch:{ NameNotFoundException -> 0x009a }
        if (r6 == 0) goto L_0x0059;	 Catch:{ NameNotFoundException -> 0x009a }
        r6 = "Loaded Glide module: ";	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        r5 = r6.concat(r5);	 Catch:{ NameNotFoundException -> 0x009a }
        android.util.Log.d(r1, r5);	 Catch:{ NameNotFoundException -> 0x009a }
        goto L_0x0059;
        r0 = android.util.Log.isLoggable(r1, r0);
        if (r0 == 0) goto L_0x0099;
        r0 = "Finished loading Glide modules";
        android.util.Log.d(r1, r0);
        return r2;
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Unable to find metadata to parse GlideModules";
        r1.<init>(r2, r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afw.a():java.util.List");
    }
}
