package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: abp */
public final class abp implements abn {
    private static final Config[] a;
    private static final Config[] b;
    private static final Config[] c = new Config[]{Config.RGB_565};
    private static final Config[] d = new Config[]{Config.ARGB_4444};
    private static final Config[] e = new Config[]{Config.ALPHA_8};
    private final b f = new b();
    private final abj<a, Bitmap> g = new abj();
    private final Map<Config, NavigableMap<Integer, Integer>> h = new HashMap();

    /* renamed from: abp$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[Config.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0014 }
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
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abp$1.<clinit>():void");
        }
    }

    /* renamed from: abp$a */
    static final class a implements abo {
        int a;
        private final b b;
        private Config c;

        public a(b bVar) {
            this.b = bVar;
        }

        public final void a() {
            this.b.a(this);
        }

        public final void a(int i, Config config) {
            this.a = i;
            this.c = config;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && ahm.a(this.c, aVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.a * 31;
            Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return abp.a(this.a, this.c);
        }
    }

    /* renamed from: abp$b */
    static class b extends abf<a> {
        b() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ abo a() {
            return new a(this);
        }

        public final a a(int i, Config config) {
            a aVar = (a) b();
            aVar.a(i, config);
            return aVar;
        }
    }

    static {
        Config[] configArr = new Config[]{Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        a = configArr;
        b = configArr;
    }

    static String a(int i, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private NavigableMap<Integer, Integer> a(Config config) {
        NavigableMap navigableMap = (NavigableMap) this.h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.h.put(config, treeMap);
        return treeMap;
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap a = a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            StringBuilder stringBuilder = new StringBuilder("Tried to decrement empty size, size: ");
            stringBuilder.append(num);
            stringBuilder.append(", removed: ");
            stringBuilder.append(b(bitmap));
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap a() {
        Bitmap bitmap = (Bitmap) this.g.a();
        if (bitmap != null) {
            a(Integer.valueOf(ahm.a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    public final android.graphics.Bitmap a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r0 = defpackage.ahm.a(r10, r11, r12);
        r1 = r9.f;
        r1 = r1.a(r0, r12);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 0;
        r4 = 26;
        if (r2 < r4) goto L_0x001c;
    L_0x0011:
        r2 = android.graphics.Bitmap.Config.RGBA_F16;
        r2 = r2.equals(r12);
        if (r2 == 0) goto L_0x001c;
    L_0x0019:
        r2 = b;
        goto L_0x0040;
    L_0x001c:
        r2 = defpackage.abp.1.a;
        r4 = r12.ordinal();
        r2 = r2[r4];
        r4 = 1;
        if (r2 == r4) goto L_0x003e;
    L_0x0027:
        r5 = 2;
        if (r2 == r5) goto L_0x003b;
    L_0x002a:
        r5 = 3;
        if (r2 == r5) goto L_0x0038;
    L_0x002d:
        r5 = 4;
        if (r2 == r5) goto L_0x0035;
    L_0x0030:
        r2 = new android.graphics.Bitmap.Config[r4];
        r2[r3] = r12;
        goto L_0x0040;
    L_0x0035:
        r2 = e;
        goto L_0x0040;
    L_0x0038:
        r2 = d;
        goto L_0x0040;
    L_0x003b:
        r2 = c;
        goto L_0x0040;
    L_0x003e:
        r2 = a;
    L_0x0040:
        r4 = r2.length;
    L_0x0041:
        if (r3 >= r4) goto L_0x0081;
    L_0x0043:
        r5 = r2[r3];
        r6 = r9.a(r5);
        r7 = java.lang.Integer.valueOf(r0);
        r6 = r6.ceilingKey(r7);
        r6 = (java.lang.Integer) r6;
        if (r6 == 0) goto L_0x007e;
    L_0x0055:
        r7 = r6.intValue();
        r8 = r0 << 3;
        if (r7 > r8) goto L_0x007e;
    L_0x005d:
        r2 = r6.intValue();
        if (r2 != r0) goto L_0x006e;
    L_0x0063:
        if (r5 != 0) goto L_0x0068;
    L_0x0065:
        if (r12 == 0) goto L_0x0081;
    L_0x0067:
        goto L_0x006e;
    L_0x0068:
        r0 = r5.equals(r12);
        if (r0 != 0) goto L_0x0081;
    L_0x006e:
        r0 = r9.f;
        r0.a(r1);
        r0 = r9.f;
        r1 = r6.intValue();
        r1 = r0.a(r1, r5);
        goto L_0x0081;
    L_0x007e:
        r3 = r3 + 1;
        goto L_0x0041;
    L_0x0081:
        r0 = r9.g;
        r0 = r0.a(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x0097;
    L_0x008b:
        r1 = r1.a;
        r1 = java.lang.Integer.valueOf(r1);
        r9.a(r1, r0);
        r0.reconfigure(r10, r11, r12);
    L_0x0097:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abp.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void a(Bitmap bitmap) {
        a a = this.f.a(ahm.a(bitmap), bitmap.getConfig());
        this.g.a(a, bitmap);
        NavigableMap a2 = a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.a));
        Integer valueOf = Integer.valueOf(a.a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    public final String b(int i, int i2, Config config) {
        return abp.a(ahm.a(i, i2, config), config);
    }

    public final String b(Bitmap bitmap) {
        return abp.a(ahm.a(bitmap), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap) {
        return ahm.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.g);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.h.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.h.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
