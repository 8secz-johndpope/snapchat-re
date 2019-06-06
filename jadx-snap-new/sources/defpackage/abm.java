package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abm */
public final class abm implements abg {
    private static final Config a = Config.ARGB_8888;
    private final abn b;
    private final Set<Config> c;
    private final long d;
    private final a e;
    private long f;
    private long g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* renamed from: abm$a */
    interface a {
    }

    /* renamed from: abm$b */
    static final class b implements a {
        b() {
        }
    }

    public abm(long j) {
        abn abp = VERSION.SDK_INT >= 19 ? new abp() : new abe();
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        this(j, abp, Collections.unmodifiableSet(hashSet));
    }

    private abm(long j, abn abn, Set<Config> set) {
        this.d = j;
        this.f = j;
        this.b = abn;
        this.c = set;
        this.e = new b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0068 in {8, 11, 15, 17, 19, 22} preds:[]
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
    private synchronized void a(long r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.g;	 Catch:{ all -> 0x0065 }
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));	 Catch:{ all -> 0x0065 }
        if (r2 <= 0) goto L_0x0063;	 Catch:{ all -> 0x0065 }
        r0 = r5.b;	 Catch:{ all -> 0x0065 }
        r0 = r0.a();	 Catch:{ all -> 0x0065 }
        if (r0 != 0) goto L_0x0028;	 Catch:{ all -> 0x0065 }
        r6 = "LruBitmapPool";	 Catch:{ all -> 0x0065 }
        r7 = 5;	 Catch:{ all -> 0x0065 }
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ all -> 0x0065 }
        if (r6 == 0) goto L_0x0022;	 Catch:{ all -> 0x0065 }
        r6 = "LruBitmapPool";	 Catch:{ all -> 0x0065 }
        r7 = "Size mismatch, resetting";	 Catch:{ all -> 0x0065 }
        android.util.Log.w(r6, r7);	 Catch:{ all -> 0x0065 }
        r5.d();	 Catch:{ all -> 0x0065 }
        r6 = 0;	 Catch:{ all -> 0x0065 }
        r5.g = r6;	 Catch:{ all -> 0x0065 }
        monitor-exit(r5);
        return;
        r1 = r5.g;	 Catch:{ all -> 0x0065 }
        r3 = r5.b;	 Catch:{ all -> 0x0065 }
        r3 = r3.c(r0);	 Catch:{ all -> 0x0065 }
        r3 = (long) r3;	 Catch:{ all -> 0x0065 }
        r1 = r1 - r3;	 Catch:{ all -> 0x0065 }
        r5.g = r1;	 Catch:{ all -> 0x0065 }
        r1 = r5.k;	 Catch:{ all -> 0x0065 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0065 }
        r5.k = r1;	 Catch:{ all -> 0x0065 }
        r1 = "LruBitmapPool";	 Catch:{ all -> 0x0065 }
        r2 = 3;	 Catch:{ all -> 0x0065 }
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x0065 }
        if (r1 == 0) goto L_0x005c;	 Catch:{ all -> 0x0065 }
        r1 = "LruBitmapPool";	 Catch:{ all -> 0x0065 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0065 }
        r3 = "Evicting bitmap=";	 Catch:{ all -> 0x0065 }
        r2.<init>(r3);	 Catch:{ all -> 0x0065 }
        r3 = r5.b;	 Catch:{ all -> 0x0065 }
        r3 = r3.b(r0);	 Catch:{ all -> 0x0065 }
        r2.append(r3);	 Catch:{ all -> 0x0065 }
        r2 = r2.toString();	 Catch:{ all -> 0x0065 }
        android.util.Log.d(r1, r2);	 Catch:{ all -> 0x0065 }
        r5.c();	 Catch:{ all -> 0x0065 }
        r0.recycle();	 Catch:{ all -> 0x0065 }
        goto L_0x0001;
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abm.a(long):void");
    }

    private void b() {
        a(this.f);
    }

    private static Bitmap c(int i, int i2, Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            d();
        }
    }

    private synchronized Bitmap d(int i, int i2, Config config) {
        Bitmap a;
        if (VERSION.SDK_INT >= 26) {
            if (config == Config.HARDWARE) {
                StringBuilder stringBuilder = new StringBuilder("Cannot create a mutable Bitmap with config: ");
                stringBuilder.append(config);
                stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        a = this.b.a(i, i2, config != null ? config : a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder2 = new StringBuilder("Missing bitmap=");
                stringBuilder2.append(this.b.b(i, i2, config));
                Log.d("LruBitmapPool", stringBuilder2.toString());
            }
            this.i++;
        } else {
            this.h++;
            this.g -= (long) this.b.c(a);
            a.setHasAlpha(true);
            if (VERSION.SDK_INT >= 19) {
                a.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder stringBuilder3 = new StringBuilder("Get bitmap=");
            stringBuilder3.append(this.b.b(i, i2, config));
            Log.v("LruBitmapPool", stringBuilder3.toString());
        }
        c();
        return a;
    }

    private void d() {
        StringBuilder stringBuilder = new StringBuilder("Hits=");
        stringBuilder.append(this.h);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.i);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.j);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.k);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.g);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.f);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.b);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    public final Bitmap a(int i, int i2, Config config) {
        Bitmap d = d(i, i2, config);
        if (d == null) {
            return abm.c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    public final void a() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        a(0);
    }

    public final synchronized void a(float f) {
        this.f = (long) Math.round(((float) this.d) * f);
        b();
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "trimMemory, level=".concat(String.valueOf(i)));
        }
        if (i >= 40) {
            a();
            return;
        }
        if (i >= 20 || i == 15) {
            a(this.f / 2);
        }
    }

    public final synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                StringBuilder stringBuilder;
                int i = 2;
                if (bitmap.isMutable() && ((long) this.b.c(bitmap)) <= this.f) {
                    if (this.c.contains(bitmap.getConfig())) {
                        int c = this.b.c(bitmap);
                        this.b.a(bitmap);
                        this.j++;
                        this.g += (long) c;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            stringBuilder = new StringBuilder("Put bitmap in pool=");
                            stringBuilder.append(this.b.b(bitmap));
                            Log.v("LruBitmapPool", stringBuilder.toString());
                        }
                        c();
                        b();
                        return;
                    }
                }
                if (Log.isLoggable("LruBitmapPool", i)) {
                    stringBuilder = new StringBuilder("Reject bitmap from pool, bitmap: ");
                    stringBuilder.append(this.b.b(bitmap));
                    stringBuilder.append(", is mutable: ");
                    stringBuilder.append(bitmap.isMutable());
                    stringBuilder.append(", is allowed config: ");
                    stringBuilder.append(this.c.contains(bitmap.getConfig()));
                    Log.v("LruBitmapPool", stringBuilder.toString());
                }
                bitmap.recycle();
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final Bitmap b(int i, int i2, Config config) {
        Bitmap d = d(i, i2, config);
        return d == null ? abm.c(i, i2, config) : d;
    }
}
