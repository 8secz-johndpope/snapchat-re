package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
/* renamed from: ajy */
public final class ajy implements ajv {
    private static final Config[] a = new Config[]{Config.ARGB_8888, null};
    private static final Config[] b = new Config[]{Config.RGB_565};
    private static final Config[] c = new Config[]{Config.ARGB_4444};
    private static final Config[] d = new Config[]{Config.ALPHA_8};
    private final b e = new b();
    private final ajt<a, Bitmap> f = new ajt();
    private final Map<Config, NavigableMap<Integer, Integer>> g = new HashMap();

    /* renamed from: ajy$b */
    static class b extends ajq<a> {
        b() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ ajx a() {
            return new a(this);
        }

        public final a a(int i, Config config) {
            a aVar = (a) b();
            aVar.a = i;
            aVar.b = config;
            return aVar;
        }
    }

    /* renamed from: ajy$a */
    static final class a implements ajx {
        int a;
        Config b;
        private final b c;

        public a(b bVar) {
            this.c = bVar;
        }

        public final void a() {
            this.c.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a) {
                    Config config = this.b;
                    if (config != null ? !config.equals(aVar.b) : aVar.b != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.a * 31;
            Config config = this.b;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return ajy.a(this.a, this.b);
        }
    }

    /* renamed from: ajy$1 */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajy$1.<clinit>():void");
        }
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
        NavigableMap navigableMap = (NavigableMap) this.g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.g.put(config, treeMap);
        return treeMap;
    }

    private void a(Integer num, Config config) {
        NavigableMap a = a(config);
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            StringBuilder stringBuilder = new StringBuilder("Tried to decrement empty size, size: ");
            stringBuilder.append(num);
            stringBuilder.append(", removed: ");
            stringBuilder.append(config);
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            Log.e("SizeConfigStrategy", stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap a() {
        Bitmap bitmap = (Bitmap) this.f.a();
        if (bitmap != null) {
            a(Integer.valueOf(aps.a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A:{SKIP} */
    public final android.graphics.Bitmap a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r0 = defpackage.aps.a(r10, r11, r12);
        r1 = r9.e;
        r1 = r1.a(r0, r12);
        r2 = defpackage.ajy.1.a;
        r3 = r12.ordinal();
        r2 = r2[r3];
        r3 = 0;
        r4 = 1;
        if (r2 == r4) goto L_0x002d;
    L_0x0016:
        r5 = 2;
        if (r2 == r5) goto L_0x002a;
    L_0x0019:
        r5 = 3;
        if (r2 == r5) goto L_0x0027;
    L_0x001c:
        r5 = 4;
        if (r2 == r5) goto L_0x0024;
    L_0x001f:
        r2 = new android.graphics.Bitmap.Config[r4];
        r2[r3] = r12;
        goto L_0x002f;
    L_0x0024:
        r2 = d;
        goto L_0x002f;
    L_0x0027:
        r2 = c;
        goto L_0x002f;
    L_0x002a:
        r2 = b;
        goto L_0x002f;
    L_0x002d:
        r2 = a;
    L_0x002f:
        r4 = r2.length;
    L_0x0030:
        if (r3 >= r4) goto L_0x0070;
    L_0x0032:
        r5 = r2[r3];
        r6 = r9.a(r5);
        r7 = java.lang.Integer.valueOf(r0);
        r6 = r6.ceilingKey(r7);
        r6 = (java.lang.Integer) r6;
        if (r6 == 0) goto L_0x006d;
    L_0x0044:
        r7 = r6.intValue();
        r8 = r0 << 3;
        if (r7 > r8) goto L_0x006d;
    L_0x004c:
        r2 = r6.intValue();
        if (r2 != r0) goto L_0x005d;
    L_0x0052:
        if (r5 != 0) goto L_0x0057;
    L_0x0054:
        if (r12 == 0) goto L_0x0070;
    L_0x0056:
        goto L_0x005d;
    L_0x0057:
        r12 = r5.equals(r12);
        if (r12 != 0) goto L_0x0070;
    L_0x005d:
        r12 = r9.e;
        r12.a(r1);
        r12 = r9.e;
        r0 = r6.intValue();
        r1 = r12.a(r0, r5);
        goto L_0x0070;
    L_0x006d:
        r3 = r3 + 1;
        goto L_0x0030;
    L_0x0070:
        r12 = r9.f;
        r12 = r12.a(r1);
        r12 = (android.graphics.Bitmap) r12;
        if (r12 == 0) goto L_0x00ce;
    L_0x007a:
        if (r1 == 0) goto L_0x00af;
    L_0x007c:
        r0 = r12.getConfig();
        r2 = r1.b;
        if (r0 == r2) goto L_0x00af;
    L_0x0084:
        r0 = new java.lang.StringBuilder;
        r2 = "config mismatch: result[";
        r0.<init>(r2);
        r2 = r12.getConfig();
        r0.append(r2);
        r2 = 44;
        r0.append(r2);
        r2 = "] key[";
        r0.append(r2);
        r1 = r1.b;
        r0.append(r1);
        r1 = "]";
        r0.append(r1);
        r0 = r0.toString();
        r1 = "SizeConfigStrategy";
        android.util.Log.e(r1, r0);
    L_0x00af:
        r0 = defpackage.aps.a(r12);
        r0 = java.lang.Integer.valueOf(r0);
        r1 = r12.getConfig();
        r9.a(r0, r1);
        r0 = r12.getConfig();
        if (r0 == 0) goto L_0x00c9;
    L_0x00c4:
        r0 = r12.getConfig();
        goto L_0x00cb;
    L_0x00c9:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x00cb:
        r12.reconfigure(r10, r11, r0);
    L_0x00ce:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajy.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void a(Bitmap bitmap) {
        a a = this.e.a(aps.a(bitmap), bitmap.getConfig());
        this.f.a(a, bitmap);
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
        return ajy.a(aps.a(i, i2, config), config);
    }

    public final String b(Bitmap bitmap) {
        return ajy.a(aps.a(bitmap), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap) {
        return aps.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.g.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.g.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
