package defpackage;

import android.util.Log;
import defpackage.ajz.b;
import java.io.File;

/* renamed from: ajc */
public final class ajc<A, T, Z> {
    private static final b e = new b();
    final ajh a;
    public final aiv<A> b;
    final ajd c;
    public volatile boolean d;
    private final int f;
    private final int g;
    private final aof<A, T> h;
    private final ais<T> i;
    private final anm<T, Z> j;
    private final a k;
    private final aia l;
    private final b m;

    /* renamed from: ajc$a */
    interface a {
        ajz a();
    }

    /* renamed from: ajc$b */
    static class b {
        b() {
        }
    }

    /* renamed from: ajc$c */
    class c<DataType> implements b {
        private final ain<DataType> a;
        private final DataType b;

        public c(ain<DataType> ain, DataType dataType) {
            this.a = ain;
            this.b = dataType;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0029 A:{Catch:{ all -> 0x001f }} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A:{SYNTHETIC, Splitter:B:19:0x0030} */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A:{SYNTHETIC, Splitter:B:25:0x0037} */
        public final boolean a(java.io.File r5) {
            /*
            r4 = this;
            r0 = "DecodeJob";
            r1 = 0;
            r2 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x0021 }
            r3 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0021 }
            r3.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0021 }
            r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0021 }
            r5 = r4.a;	 Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r1 = r4.b;	 Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r5 = r5.a(r1, r2);	 Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r2.close();	 Catch:{ IOException -> 0x0034 }
            goto L_0x0034;
        L_0x0019:
            r5 = move-exception;
            r1 = r2;
            goto L_0x0035;
        L_0x001c:
            r5 = move-exception;
            r1 = r2;
            goto L_0x0022;
        L_0x001f:
            r5 = move-exception;
            goto L_0x0035;
        L_0x0021:
            r5 = move-exception;
        L_0x0022:
            r2 = 3;
            r2 = android.util.Log.isLoggable(r0, r2);	 Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x002e;
        L_0x0029:
            r2 = "Failed to find file to write to disk cache";
            android.util.Log.d(r0, r2, r5);	 Catch:{ all -> 0x001f }
        L_0x002e:
            if (r1 == 0) goto L_0x0033;
        L_0x0030:
            r1.close();	 Catch:{ IOException -> 0x0033 }
        L_0x0033:
            r5 = 0;
        L_0x0034:
            return r5;
        L_0x0035:
            if (r1 == 0) goto L_0x003a;
        L_0x0037:
            r1.close();	 Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajc$c.a(java.io.File):boolean");
        }
    }

    public ajc(ajh ajh, int i, int i2, aiv<A> aiv, aof<A, T> aof, ais<T> ais, anm<T, Z> anm, a aVar, ajd ajd, aia aia) {
        this(ajh, i, i2, aiv, aof, ais, anm, aVar, ajd, aia, e);
    }

    private ajc(ajh ajh, int i, int i2, aiv<A> aiv, aof<A, T> aof, ais<T> ais, anm<T, Z> anm, a aVar, ajd ajd, aia aia, b bVar) {
        this.a = ajh;
        this.f = i;
        this.g = i2;
        this.b = aiv;
        this.h = aof;
        this.i = ais;
        this.j = anm;
        this.k = aVar;
        this.c = ajd;
        this.l = aia;
        this.m = bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0098 in {4, 8, 14, 18, 19, 23, 25, 28} preds:[]
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
    final defpackage.ajn<T> a() {
        /*
        r8 = this;
        r0 = "DecodeJob";
        r1 = defpackage.apo.a();	 Catch:{ all -> 0x0091 }
        r3 = r8.b;	 Catch:{ all -> 0x0091 }
        r4 = r8.l;	 Catch:{ all -> 0x0091 }
        r3 = r3.a(r4);	 Catch:{ all -> 0x0091 }
        r4 = 2;	 Catch:{ all -> 0x0091 }
        r5 = android.util.Log.isLoggable(r0, r4);	 Catch:{ all -> 0x0091 }
        if (r5 == 0) goto L_0x001a;	 Catch:{ all -> 0x0091 }
        r5 = "Fetched data";	 Catch:{ all -> 0x0091 }
        r8.a(r5, r1);	 Catch:{ all -> 0x0091 }
        r1 = r8.d;	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0025;
        r0 = r8.b;
        r0.a();
        r0 = 0;
        return r0;
        r1 = r8.c;	 Catch:{ all -> 0x0091 }
        r1 = r1.cacheSource;	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0070;	 Catch:{ all -> 0x0091 }
        r1 = defpackage.apo.a();	 Catch:{ all -> 0x0091 }
        r5 = new ajc$c;	 Catch:{ all -> 0x0091 }
        r6 = r8.h;	 Catch:{ all -> 0x0091 }
        r6 = r6.c();	 Catch:{ all -> 0x0091 }
        r5.<init>(r6, r3);	 Catch:{ all -> 0x0091 }
        r3 = r8.k;	 Catch:{ all -> 0x0091 }
        r3 = r3.a();	 Catch:{ all -> 0x0091 }
        r6 = r8.a;	 Catch:{ all -> 0x0091 }
        r6 = r6.a();	 Catch:{ all -> 0x0091 }
        r3.a(r6, r5);	 Catch:{ all -> 0x0091 }
        r3 = android.util.Log.isLoggable(r0, r4);	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x0054;	 Catch:{ all -> 0x0091 }
        r3 = "Wrote source to cache";	 Catch:{ all -> 0x0091 }
        r8.a(r3, r1);	 Catch:{ all -> 0x0091 }
        r1 = defpackage.apo.a();	 Catch:{ all -> 0x0091 }
        r3 = r8.a;	 Catch:{ all -> 0x0091 }
        r3 = r3.a();	 Catch:{ all -> 0x0091 }
        r3 = r8.a(r3);	 Catch:{ all -> 0x0091 }
        r0 = android.util.Log.isLoggable(r0, r4);	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x008b;	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x0091 }
        r0 = "Decoded source from cache";	 Catch:{ all -> 0x0091 }
        r8.a(r0, r1);	 Catch:{ all -> 0x0091 }
        goto L_0x008b;	 Catch:{ all -> 0x0091 }
        r1 = defpackage.apo.a();	 Catch:{ all -> 0x0091 }
        r5 = r8.h;	 Catch:{ all -> 0x0091 }
        r5 = r5.b();	 Catch:{ all -> 0x0091 }
        r6 = r8.f;	 Catch:{ all -> 0x0091 }
        r7 = r8.g;	 Catch:{ all -> 0x0091 }
        r3 = r5.a(r3, r6, r7);	 Catch:{ all -> 0x0091 }
        r0 = android.util.Log.isLoggable(r0, r4);	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x008b;	 Catch:{ all -> 0x0091 }
        r0 = "Decoded from source";	 Catch:{ all -> 0x0091 }
        goto L_0x006c;
        r0 = r8.b;
        r0.a();
        return r3;
        r0 = move-exception;
        r1 = r8.b;
        r1.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajc.a():ajn");
    }

    /* Access modifiers changed, original: final */
    public final ajn<T> a(aio aio) {
        File a = this.k.a().a(aio);
        if (a == null) {
            return null;
        }
        try {
            ajn<T> a2 = this.h.a().a(a, this.f, this.g);
            if (a2 == null) {
            }
            return a2;
        } finally {
            this.k.a().b(aio);
        }
    }

    /* Access modifiers changed, original: final */
    public final ajn<Z> a(ajn<T> ajn) {
        Object obj;
        long a = apo.a();
        if (ajn == null) {
            obj = null;
        } else {
            ajn a2 = this.i.a(ajn, this.f, this.g);
            if (!ajn.equals(a2)) {
                ajn.c();
            }
            obj = a2;
        }
        String str = "DecodeJob";
        if (Log.isLoggable(str, 2)) {
            a("Transformed resource from source", a);
        }
        if (obj != null && this.c.cacheResult) {
            a = apo.a();
            this.k.a().a(this.a, new c(this.h.d(), obj));
            if (Log.isLoggable(str, 2)) {
                a("Wrote transformed from source to cache", a);
            }
        }
        a = apo.a();
        ajn b = b(obj);
        if (Log.isLoggable(str, 2)) {
            a("Transcoded transformed from source", a);
        }
        return b;
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(apo.a(j));
        stringBuilder.append(", key: ");
        stringBuilder.append(this.a);
        Log.v("DecodeJob", stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final ajn<Z> b(ajn<T> ajn) {
        return ajn == null ? null : this.j.a(ajn);
    }
}
