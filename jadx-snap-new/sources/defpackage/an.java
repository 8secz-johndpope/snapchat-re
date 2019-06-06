package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: an */
public final class an {
    long[] a;
    Object[] b = new Object[1];
    long c = 0;
    final ap d;
    AtomicBoolean e;
    volatile boolean f;
    volatile ae g;
    final f<Object, b> h;
    Runnable i;
    private iv<String, Integer> j;
    private String[] k;
    private a l;

    /* renamed from: an$1 */
    class 1 implements Runnable {
        1() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0034 in {5, 7, 10} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private boolean a() {
            /*
            r7 = this;
            r0 = defpackage.an.this;
            r0 = r0.d;
            r1 = defpackage.an.this;
            r1 = r1.b;
            r2 = "SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;";
            r0 = r0.a(r2, r1);
            r1 = 1;
            r2 = 0;
            r3 = 0;
            r4 = r0.moveToNext();	 Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x002b;	 Catch:{ all -> 0x002f }
            r3 = r0.getLong(r2);	 Catch:{ all -> 0x002f }
            r5 = r0.getInt(r1);	 Catch:{ all -> 0x002f }
            r6 = defpackage.an.this;	 Catch:{ all -> 0x002f }
            r6 = r6.a;	 Catch:{ all -> 0x002f }
            r6[r5] = r3;	 Catch:{ all -> 0x002f }
            r5 = defpackage.an.this;	 Catch:{ all -> 0x002f }
            r5.c = r3;	 Catch:{ all -> 0x002f }
            r3 = 1;
            goto L_0x0011;
            r0.close();
            return r3;
            r1 = move-exception;
            r0.close();
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.an$1.a():boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:89:0x010f in {6, 7, 9, 12, 16, 17, 20, 25, 30, 40, 42, 44, 46, 48, 50, 53, 57, 58, 59, 61, 76, 78, 79, 80, 82, 85, 86, 88} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r14 = this;
            r0 = defpackage.an.this;
            r0 = r0.d;
            r0 = r0.e;
            r1 = 1;
            r2 = 0;
            r0.lock();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r3.d;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r4.a;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r4 == 0) goto L_0x001b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r4.isOpen();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r4 == 0) goto L_0x001b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = 1;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            goto L_0x001c;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = 0;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r4 != 0) goto L_0x0020;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = 0;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            goto L_0x0038;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r3.f;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r4 != 0) goto L_0x002b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r3.d;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r4.b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4.getWritableDatabase();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.f;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r3 != 0) goto L_0x0037;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = "ROOM";	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = "database is not initialized even though it is open";	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            android.util.Log.e(r3, r4);	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            goto L_0x001e;
            r3 = 1;
            if (r3 != 0) goto L_0x003e;
            r0.unlock();
            return;
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.e;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.compareAndSet(r1, r2);	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r3 != 0) goto L_0x004c;
            r0.unlock();
            return;
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.d;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.f();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r3 == 0) goto L_0x005a;
            r0.unlock();
            return;
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.g;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3.executeUpdateDelete();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = r4.c;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r4 = java.lang.Long.valueOf(r4);	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3[r2] = r4;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.d;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.c;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            if (r3 == 0) goto L_0x009b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = defpackage.an.this;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.d;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.b;	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3 = r3.getWritableDatabase();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            r3.beginTransaction();	 Catch:{ all -> 0x0091 }
            r4 = r14.a();	 Catch:{ all -> 0x0091 }
            r3.setTransactionSuccessful();	 Catch:{ all -> 0x008f }
            r3.endTransaction();	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            goto L_0x00ad;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            r5 = move-exception;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            goto L_0x0093;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            r5 = move-exception;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            r4 = 0;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            r3.endTransaction();	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            throw r5;	 Catch:{ IllegalStateException -> 0x0099, SQLiteException -> 0x0097 }
            r3 = move-exception;
            goto L_0x00a6;
            r3 = move-exception;
            goto L_0x00a6;
            r4 = r14.a();	 Catch:{ IllegalStateException -> 0x00a4, SQLiteException -> 0x00a2 }
            goto L_0x00ad;
            r1 = move-exception;
            goto L_0x010b;
            r3 = move-exception;
            goto L_0x00a5;
            r3 = move-exception;
            r4 = 0;
            r5 = "ROOM";	 Catch:{ all -> 0x00a0 }
            r6 = "Cannot run invalidation tracker. Is the db closed?";	 Catch:{ all -> 0x00a0 }
            android.util.Log.e(r5, r6, r3);	 Catch:{ all -> 0x00a0 }
            r0.unlock();
            if (r4 == 0) goto L_0x010a;
            r0 = defpackage.an.this;
            r0 = r0.h;
            monitor-enter(r0);
            r3 = defpackage.an.this;	 Catch:{ all -> 0x0107 }
            r3 = r3.h;	 Catch:{ all -> 0x0107 }
            r3 = r3.iterator();	 Catch:{ all -> 0x0107 }
            r4 = r3.hasNext();	 Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0105;	 Catch:{ all -> 0x0107 }
            r4 = r3.next();	 Catch:{ all -> 0x0107 }
            r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x0107 }
            r4 = r4.getValue();	 Catch:{ all -> 0x0107 }
            r4 = (defpackage.an.b) r4;	 Catch:{ all -> 0x0107 }
            r5 = defpackage.an.this;	 Catch:{ all -> 0x0107 }
            r5 = r5.a;	 Catch:{ all -> 0x0107 }
            r6 = 0;	 Catch:{ all -> 0x0107 }
            r7 = r4.a;	 Catch:{ all -> 0x0107 }
            r7 = r7.length;	 Catch:{ all -> 0x0107 }
            r8 = r6;	 Catch:{ all -> 0x0107 }
            r6 = 0;	 Catch:{ all -> 0x0107 }
            if (r6 >= r7) goto L_0x00bf;	 Catch:{ all -> 0x0107 }
            r9 = r4.a;	 Catch:{ all -> 0x0107 }
            r9 = r9[r6];	 Catch:{ all -> 0x0107 }
            r9 = r5[r9];	 Catch:{ all -> 0x0107 }
            r11 = r4.c;	 Catch:{ all -> 0x0107 }
            r12 = r11[r6];	 Catch:{ all -> 0x0107 }
            r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));	 Catch:{ all -> 0x0107 }
            if (r11 >= 0) goto L_0x0102;	 Catch:{ all -> 0x0107 }
            r11 = r4.c;	 Catch:{ all -> 0x0107 }
            r11[r6] = r9;	 Catch:{ all -> 0x0107 }
            if (r7 != r1) goto L_0x00f4;	 Catch:{ all -> 0x0107 }
            r8 = r4.d;	 Catch:{ all -> 0x0107 }
            goto L_0x0102;	 Catch:{ all -> 0x0107 }
            if (r8 != 0) goto L_0x00fb;	 Catch:{ all -> 0x0107 }
            r8 = new iw;	 Catch:{ all -> 0x0107 }
            r8.<init>(r7);	 Catch:{ all -> 0x0107 }
            r9 = r4.b;	 Catch:{ all -> 0x0107 }
            r9 = r9[r6];	 Catch:{ all -> 0x0107 }
            r8.add(r9);	 Catch:{ all -> 0x0107 }
            r6 = r6 + 1;	 Catch:{ all -> 0x0107 }
            goto L_0x00db;	 Catch:{ all -> 0x0107 }
            monitor-exit(r0);	 Catch:{ all -> 0x0107 }
            return;	 Catch:{ all -> 0x0107 }
            r1 = move-exception;	 Catch:{ all -> 0x0107 }
            monitor-exit(r0);	 Catch:{ all -> 0x0107 }
            throw r1;
            return;
            r0.unlock();
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.an$1.run():void");
        }
    }

    /* renamed from: an$a */
    static class a {
        private long[] a;
        private boolean[] b;
        private int[] c;

        a(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
            Arrays.fill(this.a, 0);
            Arrays.fill(this.b, false);
        }
    }

    /* renamed from: an$b */
    static class b {
        final int[] a;
        final String[] b;
        final long[] c;
        final Set<String> d;
    }

    static {
        new String[]{"UPDATE", "DELETE", "INSERT"};
    }

    public an(ap apVar, String... strArr) {
        int i = 0;
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.h = new f();
        this.i = new 1();
        this.d = apVar;
        this.l = new a(strArr.length);
        this.j = new iv();
        int length = strArr.length;
        this.k = new String[length];
        while (i < length) {
            String toLowerCase = strArr[i].toLowerCase(Locale.US);
            this.j.put(toLowerCase, Integer.valueOf(i));
            this.k[i] = toLowerCase;
            i++;
        }
        this.a = new long[strArr.length];
        Arrays.fill(this.a, 0);
    }

    /* Access modifiers changed, original: final */
    public final void a(aa aaVar) {
        if (!aaVar.inTransaction()) {
            try {
                ReentrantLock reentrantLock = this.d.e;
                reentrantLock.lock();
                reentrantLock.unlock();
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }
}
