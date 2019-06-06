package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byg */
final class byg {
    final HashMap<String, byf> a;
    final SparseArray<String> b;
    final byp c;
    boolean d;
    private final Cipher e;
    private final SecretKeySpec f;
    private final boolean g = false;
    private bzg h;

    public byg(File file) {
        byo.b(true);
        this.e = null;
        this.f = null;
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new byp(new File(file, "cached_content_index.exi"));
    }

    private void a(byf byf) {
        this.a.put(byf.b, byf);
        this.b.put(byf.a, byf.b);
    }

    public final byf a(String str) {
        byf byf = (byf) this.a.get(str);
        if (byf != null) {
            return byf;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            keyAt = 0;
            while (keyAt < size && keyAt == sparseArray.keyAt(keyAt)) {
                keyAt++;
            }
        }
        byf = new byf(keyAt, str);
        a(byf);
        this.d = true;
        return byf;
    }

    public final String a(int i) {
        return (String) this.b.get(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x007e in {2, 7, 8, 15, 18, 20, 22, 24, 27, 28, 30} preds:[]
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
    public final void a() {
        /*
        r8 = this;
        r0 = r8.d;
        if (r0 != 0) goto L_0x0005;
        return;
        r0 = 0;
        r1 = r8.c;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r1 = r1.a();	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2 = r8.h;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        if (r2 != 0) goto L_0x0018;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2 = new bzg;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2.<init>(r1);	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r8.h = r2;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        goto L_0x001d;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2 = r8.h;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2.a(r1);	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r1 = new java.io.DataOutputStream;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2 = r8.h;	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r1.<init>(r2);	 Catch:{ IOException -> 0x006f, all -> 0x006a }
        r2 = 2;
        r1.writeInt(r2);	 Catch:{ IOException -> 0x0068 }
        r3 = 0;	 Catch:{ IOException -> 0x0068 }
        r1.writeInt(r3);	 Catch:{ IOException -> 0x0068 }
        r4 = r8.a;	 Catch:{ IOException -> 0x0068 }
        r4 = r4.size();	 Catch:{ IOException -> 0x0068 }
        r1.writeInt(r4);	 Catch:{ IOException -> 0x0068 }
        r4 = r8.a;	 Catch:{ IOException -> 0x0068 }
        r4 = r4.values();	 Catch:{ IOException -> 0x0068 }
        r4 = r4.iterator();	 Catch:{ IOException -> 0x0068 }
        r5 = 0;	 Catch:{ IOException -> 0x0068 }
        r6 = r4.hasNext();	 Catch:{ IOException -> 0x0068 }
        if (r6 == 0) goto L_0x0055;	 Catch:{ IOException -> 0x0068 }
        r6 = r4.next();	 Catch:{ IOException -> 0x0068 }
        r6 = (defpackage.byf) r6;	 Catch:{ IOException -> 0x0068 }
        r6.a(r1);	 Catch:{ IOException -> 0x0068 }
        r6 = r6.a(r2);	 Catch:{ IOException -> 0x0068 }
        r5 = r5 + r6;	 Catch:{ IOException -> 0x0068 }
        goto L_0x0040;	 Catch:{ IOException -> 0x0068 }
        r1.writeInt(r5);	 Catch:{ IOException -> 0x0068 }
        r2 = r8.c;	 Catch:{ IOException -> 0x0068 }
        r1.close();	 Catch:{ IOException -> 0x0068 }
        r2 = r2.b;	 Catch:{ IOException -> 0x0068 }
        r2.delete();	 Catch:{ IOException -> 0x0068 }
        defpackage.bzo.a(r0);
        r8.d = r3;
        return;
        r0 = move-exception;
        goto L_0x0073;
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x007a;
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
        r2 = new bxx$a;	 Catch:{ all -> 0x0079 }
        r2.<init>(r0);	 Catch:{ all -> 0x0079 }
        throw r2;	 Catch:{ all -> 0x0079 }
        r0 = move-exception;
        defpackage.bzo.a(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byg.a():void");
    }

    public final byf b(String str) {
        return (byf) this.a.get(str);
    }

    public final void b() {
        String[] strArr = new String[this.a.size()];
        this.a.keySet().toArray(strArr);
        for (String d : strArr) {
            d(d);
        }
    }

    public final int c(String str) {
        return a(str).a;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    public final boolean c() {
        /*
        r8 = this;
        r0 = 0;
        r1 = 0;
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r3 = r8.c;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4 = r3.b;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4 = r4.exists();	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        if (r4 == 0) goto L_0x001a;
    L_0x000e:
        r4 = r3.a;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4.delete();	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4 = r3.b;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r5 = r3.a;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4.renameTo(r5);	 Catch:{ IOException -> 0x0081, all -> 0x007a }
    L_0x001a:
        r4 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r3 = r3.a;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r2.<init>(r4);	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r3 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0081, all -> 0x007a }
        r1 = r3.readInt();	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        if (r1 < 0) goto L_0x0071;
    L_0x002f:
        r2 = 2;
        if (r1 <= r2) goto L_0x0033;
    L_0x0032:
        goto L_0x0071;
    L_0x0033:
        r2 = r3.readInt();	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r4 = 1;
        r2 = r2 & r4;
        if (r2 == 0) goto L_0x003f;
    L_0x003b:
        defpackage.bzo.a(r3);
        return r0;
    L_0x003f:
        r2 = r3.readInt();	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r5 = 0;
        r6 = 0;
    L_0x0045:
        if (r5 >= r2) goto L_0x0056;
    L_0x0047:
        r7 = defpackage.byf.a(r1, r3);	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r8.a(r7);	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r7 = r7.a(r1);	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r6 = r6 + r7;
        r5 = r5 + 1;
        goto L_0x0045;
    L_0x0056:
        r1 = r3.readInt();	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r2 = r3.read();	 Catch:{ IOException -> 0x0078, all -> 0x0075 }
        r5 = -1;
        if (r2 != r5) goto L_0x0063;
    L_0x0061:
        r2 = 1;
        goto L_0x0064;
    L_0x0063:
        r2 = 0;
    L_0x0064:
        if (r1 != r6) goto L_0x006d;
    L_0x0066:
        if (r2 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x006d;
    L_0x0069:
        defpackage.bzo.a(r3);
        return r4;
    L_0x006d:
        defpackage.bzo.a(r3);
        return r0;
    L_0x0071:
        defpackage.bzo.a(r3);
        return r0;
    L_0x0075:
        r0 = move-exception;
        r1 = r3;
        goto L_0x007b;
    L_0x0078:
        r1 = r3;
        goto L_0x0081;
    L_0x007a:
        r0 = move-exception;
    L_0x007b:
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        defpackage.bzo.a(r1);
    L_0x0080:
        throw r0;
    L_0x0081:
        if (r1 == 0) goto L_0x0086;
    L_0x0083:
        defpackage.bzo.a(r1);
    L_0x0086:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byg.c():boolean");
    }

    public final void d(String str) {
        byf byf = (byf) this.a.get(str);
        if (byf != null && byf.c.isEmpty() && !byf.e) {
            this.a.remove(str);
            this.b.remove(byf.a);
            this.d = true;
        }
    }
}
