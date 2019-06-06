package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aju */
public class aju implements ajw {
    private static final Config a = Config.ARGB_8888;
    private final ajv b;
    private final Set<Config> c;
    private final int d;
    private final a e;
    private final Set<Object> f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    /* renamed from: aju$b */
    public static class b implements a {
    }

    /* renamed from: aju$a */
    public interface a {
    }

    public aju(int i) {
        ajv ajy = VERSION.SDK_INT >= 19 ? new ajy() : new ajp();
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        this(i, ajy, Collections.unmodifiableSet(hashSet), new b());
    }

    private aju(int i, ajv ajv, Set<Config> set, a aVar) {
        this.d = i;
        this.g = i;
        this.b = ajv;
        this.c = set;
        this.e = aVar;
        this.f = new CopyOnWriteArraySet();
    }

    private void b() {
        b(this.g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0074 in {8, 11, 16, 19, 20, 23, 26} preds:[]
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
    private synchronized void b(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.h;	 Catch:{ all -> 0x0071 }
        if (r0 <= r5) goto L_0x006c;	 Catch:{ all -> 0x0071 }
        r0 = r4.b;	 Catch:{ all -> 0x0071 }
        r0 = r0.a();	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x0071 }
        r5 = "LruBitmapPool";	 Catch:{ all -> 0x0071 }
        r0 = 5;	 Catch:{ all -> 0x0071 }
        r5 = android.util.Log.isLoggable(r5, r0);	 Catch:{ all -> 0x0071 }
        if (r5 == 0) goto L_0x0020;	 Catch:{ all -> 0x0071 }
        r5 = "LruBitmapPool";	 Catch:{ all -> 0x0071 }
        r0 = "Size mismatch, resetting";	 Catch:{ all -> 0x0071 }
        android.util.Log.w(r5, r0);	 Catch:{ all -> 0x0071 }
        r4.d();	 Catch:{ all -> 0x0071 }
        r5 = 0;	 Catch:{ all -> 0x0071 }
        r4.h = r5;	 Catch:{ all -> 0x0071 }
        monitor-exit(r4);
        return;
        r1 = r4.h;	 Catch:{ all -> 0x0071 }
        r2 = r4.b;	 Catch:{ all -> 0x0071 }
        r2 = r2.c(r0);	 Catch:{ all -> 0x0071 }
        r1 = r1 - r2;	 Catch:{ all -> 0x0071 }
        r4.h = r1;	 Catch:{ all -> 0x0071 }
        r1 = r4.l;	 Catch:{ all -> 0x0071 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0071 }
        r4.l = r1;	 Catch:{ all -> 0x0071 }
        r1 = r4.f;	 Catch:{ all -> 0x0071 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0071 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0071 }
        if (r2 == 0) goto L_0x0046;	 Catch:{ all -> 0x0071 }
        r1.next();	 Catch:{ all -> 0x0071 }
        goto L_0x003c;	 Catch:{ all -> 0x0071 }
        r1 = "LruBitmapPool";	 Catch:{ all -> 0x0071 }
        r2 = 3;	 Catch:{ all -> 0x0071 }
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x0071 }
        if (r1 == 0) goto L_0x0068;	 Catch:{ all -> 0x0071 }
        r1 = "LruBitmapPool";	 Catch:{ all -> 0x0071 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r3 = "Evicting bitmap=";	 Catch:{ all -> 0x0071 }
        r2.<init>(r3);	 Catch:{ all -> 0x0071 }
        r3 = r4.b;	 Catch:{ all -> 0x0071 }
        r0 = r3.b(r0);	 Catch:{ all -> 0x0071 }
        r2.append(r0);	 Catch:{ all -> 0x0071 }
        r0 = r2.toString();	 Catch:{ all -> 0x0071 }
        android.util.Log.d(r1, r0);	 Catch:{ all -> 0x0071 }
        r4.c();	 Catch:{ all -> 0x0071 }
        goto L_0x0001;	 Catch:{ all -> 0x0071 }
        r4.i();	 Catch:{ all -> 0x0071 }
        monitor-exit(r4);
        return;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aju.b(int):void");
    }

    private void c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            d();
        }
    }

    private void d() {
        StringBuilder stringBuilder = new StringBuilder("Hits=");
        stringBuilder.append(this.i);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.j);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.k);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.l);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.h);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.g);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.b);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    private void e() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void f() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void g() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void h() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void i() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final synchronized Bitmap a(int i, int i2, Config config) {
        Bitmap b;
        b = b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    public void a() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        b(0);
    }

    public final synchronized void a(float f) {
        this.g = Math.round(((float) this.d) * f);
        b();
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "trimMemory, level=".concat(String.valueOf(i)));
        }
        if (i >= 60) {
            a();
            return;
        }
        if (i >= 40) {
            b(this.g / 2);
        }
    }

    public synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            StringBuilder stringBuilder;
            if (bitmap.isMutable() && this.b.c(bitmap) <= this.g) {
                if (this.c.contains(bitmap.getConfig())) {
                    int c = this.b.c(bitmap);
                    this.b.a(bitmap);
                    this.k++;
                    this.h += c;
                    g();
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
            if (Log.isLoggable("LruBitmapPool", 2)) {
                stringBuilder = new StringBuilder("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(this.b.b(bitmap));
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(bitmap.isMutable());
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(this.c.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", stringBuilder.toString());
            }
            h();
            return;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @TargetApi(12)
    public synchronized Bitmap b(int i, int i2, Config config) {
        Bitmap a;
        a = this.b.a(i, i2, config != null ? config : a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder("Missing bitmap=");
                stringBuilder.append(this.b.b(i, i2, config));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            this.j++;
            f();
        } else {
            this.i++;
            this.h -= this.b.c(a);
            a.setHasAlpha(true);
            e();
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder stringBuilder2 = new StringBuilder("Get bitmap=");
            stringBuilder2.append(this.b.b(i, i2, config));
            Log.v("LruBitmapPool", stringBuilder2.toString());
        }
        c();
        return a;
    }
}
