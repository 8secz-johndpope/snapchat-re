package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: aps */
public final class aps {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];

    /* renamed from: aps$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[Config.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.RGBA_F16;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aps$1.<clinit>():void");
        }
    }

    public static int a(int i, int i2, Config config) {
        return (i * i2) * aps.a(config);
    }

    private static int a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = 1.a[config.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? 2 : i != 4 ? 4 : 8 : 1;
    }

    @TargetApi(19)
    public static int a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            try {
                bitmap = bitmap.getAllocationByteCount();
                return bitmap;
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002e in {6, 9, 12} preds:[]
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
    public static java.lang.String a(byte[] r7) {
        /*
        r0 = b;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x002b }
        r2 = 0;	 Catch:{ all -> 0x002b }
        r3 = r7.length;	 Catch:{ all -> 0x002b }
        if (r2 >= r3) goto L_0x0024;	 Catch:{ all -> 0x002b }
        r3 = r7[r2];	 Catch:{ all -> 0x002b }
        r3 = r3 & 255;	 Catch:{ all -> 0x002b }
        r4 = r2 << 1;	 Catch:{ all -> 0x002b }
        r5 = a;	 Catch:{ all -> 0x002b }
        r6 = r3 >>> 4;	 Catch:{ all -> 0x002b }
        r5 = r5[r6];	 Catch:{ all -> 0x002b }
        r1[r4] = r5;	 Catch:{ all -> 0x002b }
        r4 = r4 + 1;	 Catch:{ all -> 0x002b }
        r5 = a;	 Catch:{ all -> 0x002b }
        r3 = r3 & 15;	 Catch:{ all -> 0x002b }
        r3 = r5[r3];	 Catch:{ all -> 0x002b }
        r1[r4] = r3;	 Catch:{ all -> 0x002b }
        r2 = r2 + 1;	 Catch:{ all -> 0x002b }
        goto L_0x0006;	 Catch:{ all -> 0x002b }
        r7 = new java.lang.String;	 Catch:{ all -> 0x002b }
        r7.<init>(r1);	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        return r7;	 Catch:{ all -> 0x002b }
        r7 = move-exception;	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aps.a(byte[]):java.lang.String");
    }

    public static <T> List<T> a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static <T> Queue<T> a(int i) {
        return new ArrayDeque(i);
    }

    public static void a() {
        if (!aps.b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean a(int i, int i2) {
        return aps.b(i) && aps.b(i2);
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean c() {
        return !aps.b();
    }
}
