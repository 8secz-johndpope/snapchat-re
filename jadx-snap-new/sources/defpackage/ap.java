package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.util.Log;
import defpackage.ab.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ap */
public abstract class ap {
    public volatile aa a;
    ab b;
    boolean c;
    public List<b> d;
    final ReentrantLock e = new ReentrantLock();
    private final an f = a();
    private boolean g;

    /* renamed from: ap$c */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* renamed from: ap$a */
    public static class a<T extends ap> {
        public ArrayList<b> a;
        public boolean b;
        public boolean c = true;
        private final Class<T> d;
        private final String e;
        private final Context f;
        private c g;
        private c h = c.AUTOMATIC;
        private final d i = new d();
        private Set<Integer> j;

        public a(Context context, Class<T> cls, String str) {
            this.f = context;
            this.d = cls;
            this.e = str;
        }

        public final a<T> a(au... auVarArr) {
            if (this.j == null) {
                this.j = new HashSet();
            }
            for (au auVar : auVarArr) {
                this.j.add(Integer.valueOf(auVar.a));
                this.j.add(Integer.valueOf(auVar.b));
            }
            this.i.a(auVarArr);
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0071 in {6, 16, 17, 19, 20, 22, 24, 26} preds:[]
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
        public final T a() {
            /*
            r10 = this;
            r0 = r10.f;
            if (r0 == 0) goto L_0x0069;
            r0 = r10.d;
            if (r0 == 0) goto L_0x0061;
            r0 = r10.g;
            if (r0 != 0) goto L_0x0013;
            r0 = new ah;
            r0.<init>();
            r10.g = r0;
            r0 = new ak;
            r2 = r10.f;
            r3 = r10.e;
            r4 = r10.g;
            r5 = r10.i;
            r6 = r10.a;
            r7 = r10.b;
            r1 = r10.h;
            r8 = defpackage.ap.c.AUTOMATIC;
            if (r1 == r8) goto L_0x0029;
            r8 = r1;
            goto L_0x004d;
            r1 = android.os.Build.VERSION.SDK_INT;
            r8 = 16;
            if (r1 < r8) goto L_0x004a;
            r1 = "activity";
            r1 = r2.getSystemService(r1);
            r1 = (android.app.ActivityManager) r1;
            if (r1 == 0) goto L_0x004a;
            r8 = android.os.Build.VERSION.SDK_INT;
            r9 = 19;
            if (r8 < r9) goto L_0x0044;
            r1 = r1.isLowRamDevice();
            goto L_0x0045;
            r1 = 0;
            if (r1 != 0) goto L_0x004a;
            r1 = defpackage.ap.c.WRITE_AHEAD_LOGGING;
            goto L_0x0027;
            r1 = defpackage.ap.c.TRUNCATE;
            goto L_0x0027;
            r9 = r10.c;
            r1 = r0;
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
            r1 = r10.d;
            r2 = "_Impl";
            r1 = defpackage.ao.a(r1, r2);
            r1 = (defpackage.ap) r1;
            r1.a(r0);
            return r1;
            r0 = new java.lang.IllegalArgumentException;
            r1 = "Must provide an abstract class that extends RoomDatabase";
            r0.<init>(r1);
            throw r0;
            r0 = new java.lang.IllegalArgumentException;
            r1 = "Cannot provide null context for the database.";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ap$a.a():ap");
        }
    }

    /* renamed from: ap$d */
    public static class d {
        private ji<ji<au>> a = new ji();

        /* Access modifiers changed, original: final */
        public final List<au> a(List<au> list, boolean z, int i, int i2) {
            int i3 = z ? -1 : 1;
            Object obj;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                ji jiVar = (ji) this.a.a(i, null);
                if (jiVar == null) {
                    return null;
                }
                int i4;
                int b = jiVar.b();
                obj = null;
                if (z) {
                    i4 = b - 1;
                    b = -1;
                } else {
                    i4 = 0;
                }
                while (i4 != b) {
                    int b2 = jiVar.b(i4);
                    Object obj2 = (z ? b2 > i2 || b2 <= i : b2 < i2 || b2 >= i) ? null : 1;
                    if (obj2 != null) {
                        list.add(jiVar.c(i4));
                        i = b2;
                        obj = 1;
                        continue;
                        break;
                    }
                    i4 += i3;
                }
            } while (obj != null);
            return null;
        }

        public final void a(au... auVarArr) {
            for (au auVar : auVarArr) {
                int i = auVar.a;
                int i2 = auVar.b;
                ji jiVar = (ji) this.a.a(i, null);
                if (jiVar == null) {
                    jiVar = new ji();
                    this.a.b(i, jiVar);
                }
                au auVar2 = (au) jiVar.a(i2, null);
                if (auVar2 != null) {
                    StringBuilder stringBuilder = new StringBuilder("Overriding migration ");
                    stringBuilder.append(auVar2);
                    stringBuilder.append(" with ");
                    stringBuilder.append(auVar);
                    Log.w("ROOM", stringBuilder.toString());
                }
                jiVar.c(i2, auVar);
            }
        }
    }

    /* renamed from: ap$b */
    public static abstract class b {
        public void a(aa aaVar) {
        }
    }

    public final ae a(String str) {
        b();
        return this.b.getWritableDatabase().compileStatement(str);
    }

    public abstract an a();

    public final Cursor a(ad adVar) {
        b();
        return this.b.getWritableDatabase().query(adVar);
    }

    public final Cursor a(String str, Object[] objArr) {
        return this.b.getWritableDatabase().query(new z(str, objArr));
    }

    public final void a(aa aaVar) {
        an anVar = this.f;
        synchronized (anVar) {
            if (anVar.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            aaVar.beginTransaction();
            try {
                aaVar.execSQL("PRAGMA temp_store = MEMORY;");
                aaVar.execSQL("PRAGMA recursive_triggers='ON';");
                aaVar.execSQL("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                aaVar.setTransactionSuccessful();
                anVar.a(aaVar);
                anVar.g = aaVar.compileStatement("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                anVar.f = true;
            } finally {
                aaVar.endTransaction();
            }
        }
    }

    public final void a(ak akVar) {
        this.b = b(akVar);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (akVar.g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.b.setWriteAheadLoggingEnabled(z);
        }
        this.d = akVar.e;
        this.g = akVar.f;
        this.c = z;
    }

    public abstract ab b(ak akVar);

    public final void b() {
        if (!this.g && b.a().a.b()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void c() {
        b();
        aa writableDatabase = this.b.getWritableDatabase();
        this.f.a(writableDatabase);
        writableDatabase.beginTransaction();
    }

    public final void d() {
        this.b.getWritableDatabase().endTransaction();
        if (!f()) {
            an anVar = this.f;
            if (anVar.e.compareAndSet(false, true)) {
                b.a().a(anVar.i);
            }
        }
    }

    public final void e() {
        this.b.getWritableDatabase().setTransactionSuccessful();
    }

    public final boolean f() {
        return this.b.getWritableDatabase().inTransaction();
    }
}
