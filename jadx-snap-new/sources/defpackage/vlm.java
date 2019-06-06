package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.gcp.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vlm */
public final class vlm implements vll {
    final ftl a;
    private final Set<b> b = new LinkedHashSet();
    private final ajxe c = ajxh.a(new d(this));
    private final abse d;

    /* renamed from: vlm$b */
    static final class b {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;

        public b(float f, float f2) {
            this.d = f;
            this.e = f2;
            this.a = Math.min(this.d, this.e);
            f = this.d;
            f2 = this.e;
            this.b = f * f2;
            this.c = f / f2;
        }

        public b(int i, int i2) {
            this((float) i, (float) i2);
        }

        public b(abtl abtl) {
            akcr.b(abtl, MapboxEvent.KEY_RESOLUTION);
            this((float) abtl.b(), (float) abtl.c());
        }

        public final abtl a() {
            return new abtl(akdp.a(this.d), akdp.a(this.e));
        }

        public final b a(float f) {
            return new b(this.d * f, this.e * f);
        }

        public final b b() {
            return new b(this.e, this.d);
        }
    }

    /* renamed from: vlm$d */
    static final class d extends akcs implements akbk<Integer> {
        private /* synthetic */ vlm a;

        d(vlm vlm) {
            this.a = vlm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.a.f(vju.ANIMATED_IMAGE_MAX_DIMENSION));
        }
    }

    /* renamed from: vlm$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Float.valueOf(((b) t2).d), Float.valueOf(((b) t).d));
        }
    }

    /* renamed from: vlm$c */
    static abstract class c {

        /* renamed from: vlm$c$a */
        public static final class a extends c {
            final float a;
            final akdy b;

            public a(float f, akdy akdy) {
                akcr.b(akdy, "shortDimensionRange");
                super();
                this.a = f;
                this.b = akdy;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.vlm.c.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.vlm.c.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = java.lang.Float.compare(r0, r1);
                if (r0 != 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm$c$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                int floatToIntBits = Float.floatToIntBits(this.a) * 31;
                akdy akdy = this.b;
                return floatToIntBits + (akdy != null ? akdy.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("LegacyConfiguration(downScaleFactor=");
                stringBuilder.append(this.a);
                stringBuilder.append(", shortDimensionRange=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: vlm$c$b */
        public static final class b extends c {
            final abtl a;

            public b(abtl abtl) {
                akcr.b(abtl, "resolutionHint");
                super();
                this.a = abtl;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.vlm.c.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.vlm.c.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.vlm.c.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm$c$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                abtl abtl = this.a;
                return abtl != null ? abtl.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ResolutionHintConfiguration(resolutionHint=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: vlm$e */
    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Float.valueOf(((b) t).c), Float.valueOf(((b) t2).c));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(vlm.class), "animatedImageMaxDimension", "getAnimatedImageMaxDimension()I");
    }

    public vlm(vjr vjr, abse abse, ftl ftl) {
        akcr.b(vjr, "videoResolutionSetter");
        akcr.b(abse, "displayMetrics");
        akcr.b(ftl, "configProvider");
        this.d = abse;
        this.a = ftl;
        Set set = this.b;
        Iterable<abtl> a = vjr.a();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) a, 10));
        for (abtl bVar : a) {
            arrayList.add(new b(bVar));
        }
        set.addAll((List) arrayList);
        set = this.b;
        Iterable<abtl> a2 = vjr.a();
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) a2, 10));
        for (abtl a3 : a2) {
            Object a4 = a3.a();
            akcr.a(a4, "it.transpose()");
            arrayList2.add(new b(a4));
        }
        set.addAll((List) arrayList2);
        ajyu.a((Iterable) this.b, (Comparator) new a());
    }

    private static float a(b bVar, b bVar2) {
        return Math.min(bVar2.d / bVar.d, bVar2.e / bVar.e);
    }

    private final int a() {
        return ((Number) this.c.b()).intValue();
    }

    private static int a(float f) {
        int a = akdp.a(f) / 16;
        int i = a << 4;
        a = (a + 1) << 4;
        return Math.abs(f - ((float) i)) < Math.abs(((float) a) - f) ? i : a;
    }

    private final abtl a(List<? extends aeew> list) {
        Object obj;
        Iterable<aeew> iterable = list;
        Collection collection = (Collection) iterable;
        Object obj2 = 1;
        if (!collection.isEmpty()) {
            for (aeew aeew : iterable) {
                if (a.a(aeew.a).g()) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        int f;
        if (obj != null) {
            f = this.a.f(vju.MALIBU_SENDING_RESOLUTION);
            return new abtl(f, f);
        }
        if (!collection.isEmpty()) {
            for (aeew aeew2 : iterable) {
                if (a.a(aeew2.a).f()) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            f = this.a.f(vju.MALIBU_SENDING_RESOLUTION);
            return new abtl(f, f);
        }
        if (!collection.isEmpty()) {
            for (aeew aeew3 : iterable) {
                if (a.a(aeew3.a).h()) {
                    break;
                }
            }
        }
        obj2 = null;
        if (obj2 == null) {
            return new abtl(800, 800);
        }
        f = this.a.f(vju.LAGUNA_HD_SENDING_RESOLUTION);
        return new abtl(f, f);
    }

    private static b a(aeew aeew) {
        abtl b = abyj.b(aeew);
        Float f = aeew.d;
        float f2 = 1.0f;
        float floatValue = f != null ? f.floatValue() : 1.0f;
        Float f3 = aeew.e;
        if (f3 != null) {
            f2 = f3.floatValue();
        }
        return new b(((float) b.b()) * floatValue, ((float) b.c()) * f2);
    }

    private final b a(List<b> list, float f) {
        Iterable<b> iterable;
        Collection arrayList;
        int a;
        if (f < 1.0f) {
            iterable = list;
            arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(Float.valueOf(bVar.e));
            }
            a = vlm.a(Math.min((float) a(), ((Number) iej.a((Iterable) (List) arrayList)).floatValue()));
            return new b(vlm.a(((float) a) * f), a);
        }
        iterable = list;
        arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (b bVar2 : iterable) {
            arrayList.add(Float.valueOf(bVar2.d));
        }
        a = vlm.a(Math.min((float) a(), ((Number) iej.a((Iterable) (List) arrayList)).floatValue()));
        return new b(a, vlm.a(((float) a) / f));
    }

    private static b a(List<b> list, float f, a aVar) {
        int i;
        int i2;
        akdy akdy = aVar.b;
        float f2 = aVar.a;
        Iterable<b> iterable;
        Collection arrayList;
        float floatValue;
        if (f > 1.0f) {
            iterable = list;
            arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(Float.valueOf(bVar.e));
            }
            floatValue = ((Number) iej.a((Iterable) (List) arrayList)).floatValue();
            if (floatValue > ((float) akdy.b)) {
                floatValue *= f2;
                if (floatValue <= ((float) akdy.a)) {
                    i = akdy.a;
                } else if (floatValue > ((float) akdy.b)) {
                    i = akdy.b;
                }
                floatValue = (float) i;
            }
            i = vlm.a(floatValue);
            int a = vlm.a(((float) i) * f);
            i2 = i;
            i = a;
        } else {
            iterable = list;
            arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b bVar2 : iterable) {
                arrayList.add(Float.valueOf(bVar2.d));
            }
            floatValue = ((Number) iej.a((Iterable) (List) arrayList)).floatValue();
            if (floatValue > ((float) akdy.b)) {
                floatValue *= f2;
                if (floatValue <= ((float) akdy.a)) {
                    i = akdy.a;
                } else if (floatValue > ((float) akdy.b)) {
                    i = akdy.b;
                }
                floatValue = (float) i;
            }
            i = vlm.a(floatValue);
            i2 = vlm.a(((float) i) / f);
        }
        return new b(i, i2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:92:0x01c0 in {5, 13, 14, 16, 17, 25, 26, 28, 29, 31, 34, 35, 37, 38, 44, 46, 55, 56, 58, 64, 70, 73, 79, 80, 84, 85, 87, 89, 91} preds:[]
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
    private final defpackage.vlm.b a(java.util.List<defpackage.vlm.b> r8, defpackage.vlm.b r9, boolean r10, boolean r11, boolean r12, defpackage.vlm.c r13) {
        /*
        r7 = this;
        r0 = r8;
        r0 = (java.util.Collection) r0;
        r0 = r0.isEmpty();
        r1 = 1;
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x01b2;
        r0 = r8;
        r0 = (java.lang.Iterable) r0;
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r0, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r0 = r0.iterator();
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0035;
        r3 = r0.next();
        r3 = (defpackage.vlm.b) r3;
        r3 = r3.c;
        r3 = java.lang.Float.valueOf(r3);
        r2.add(r3);
        goto L_0x001f;
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r0 = r2;
        r0 = (java.util.Collection) r0;
        r3 = r0.isEmpty();
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        if (r3 != 0) goto L_0x0064;
        r3 = r2.iterator();
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x0064;
        r6 = r3.next();
        r6 = (java.lang.Number) r6;
        r6 = r6.floatValue();
        r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x005f;
        r6 = 1;
        goto L_0x0060;
        r6 = 0;
        if (r6 != 0) goto L_0x0049;
        r3 = 0;
        goto L_0x0065;
        r3 = 1;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x008a;
        r0 = r2.iterator();
        r6 = r0.hasNext();
        if (r6 == 0) goto L_0x008a;
        r6 = r0.next();
        r6 = (java.lang.Number) r6;
        r6 = r6.floatValue();
        r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x0085;
        r6 = 1;
        goto L_0x0086;
        r6 = 0;
        if (r6 != 0) goto L_0x006f;
        r0 = 0;
        goto L_0x008b;
        r0 = 1;
        if (r11 == 0) goto L_0x0090;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x00a8;
        if (r10 != 0) goto L_0x00a6;
        if (r0 == 0) goto L_0x009f;
        r9 = defpackage.iej.a(r2);
        r9 = (java.lang.Number) r9;
        r9 = r9.floatValue();
        goto L_0x00a8;
        if (r3 == 0) goto L_0x00a6;
        r9 = defpackage.iej.b(r2);
        goto L_0x0098;
        r9 = r9.c;
        r10 = r13 instanceof defpackage.vlm.c.b;
        if (r10 == 0) goto L_0x00d5;
        r13 = (defpackage.vlm.c.b) r13;
        r8 = r13.a;
        r8 = r8.d();
        r8 = (float) r8;
        r8 = defpackage.vlm.a(r8);
        r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r10 <= 0) goto L_0x00c9;
        r10 = (float) r8;
        r10 = r10 * r9;
        r9 = defpackage.vlm.a(r10);
        r10 = new vlm$b;
        r10.<init>(r9, r8);
        return r10;
        r10 = (float) r8;
        r10 = r10 / r9;
        r9 = defpackage.vlm.a(r10);
        r10 = new vlm$b;
        r10.<init>(r8, r9);
        return r10;
        r10 = r13 instanceof defpackage.vlm.c.a;
        if (r10 == 0) goto L_0x01ac;
        if (r12 == 0) goto L_0x01a7;
        r10 = r7.b;
        r10 = (java.lang.Iterable) r10;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r11 = (java.util.Collection) r11;
        r10 = r10.iterator();
        r12 = r10.hasNext();
        if (r12 == 0) goto L_0x010e;
        r12 = r10.next();
        r0 = r12;
        r0 = (defpackage.vlm.b) r0;
        r0 = r0.c;
        r0 = r0 - r9;
        r0 = java.lang.Math.abs(r0);
        r2 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0107;
        r0 = 1;
        goto L_0x0108;
        r0 = 0;
        if (r0 == 0) goto L_0x00ea;
        r11.add(r12);
        goto L_0x00ea;
        r11 = (java.util.List) r11;
        r11 = (java.lang.Iterable) r11;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r10 = (java.util.Collection) r10;
        r11 = r11.iterator();
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x0135;
        r12 = r11.next();
        r0 = r12;
        r0 = (defpackage.vlm.b) r0;
        r0 = defpackage.vlm.a(r0, r8);
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x011d;
        r10.add(r12);
        goto L_0x011d;
        r10 = (java.util.List) r10;
        r10 = (java.lang.Iterable) r10;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r11 = (java.util.Collection) r11;
        r10 = r10.iterator();
        r12 = r10.hasNext();
        if (r12 == 0) goto L_0x015f;
        r12 = r10.next();
        r0 = r12;
        r0 = (defpackage.vlm.b) r0;
        r2 = r13;
        r2 = (defpackage.vlm.c.a) r2;
        r0 = defpackage.vlm.a(r0, r8, r2);
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x0144;
        r11.add(r12);
        goto L_0x0144;
        r11 = (java.util.List) r11;
        r11 = (java.lang.Iterable) r11;
        r10 = r11.iterator();
        r11 = r10.hasNext();
        if (r11 != 0) goto L_0x016f;
        r10 = 0;
        goto L_0x019b;
        r11 = r10.next();
        r12 = r11;
        r12 = (defpackage.vlm.b) r12;
        r12 = r12.c;
        r12 = r12 - r9;
        r12 = java.lang.Math.abs(r12);
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x019a;
        r0 = r10.next();
        r1 = r0;
        r1 = (defpackage.vlm.b) r1;
        r1 = r1.c;
        r1 = r1 - r9;
        r1 = java.lang.Math.abs(r1);
        r2 = java.lang.Float.compare(r12, r1);
        if (r2 <= 0) goto L_0x017d;
        r11 = r0;
        r12 = r1;
        goto L_0x017d;
        r10 = r11;
        r10 = (defpackage.vlm.b) r10;
        if (r10 != 0) goto L_0x01a6;
        r13 = (defpackage.vlm.c.a) r13;
        r8 = defpackage.vlm.a(r8, r9, r13);
        return r8;
        return r10;
        r8 = r7.a(r8, r9);
        return r8;
        r8 = new ajxk;
        r8.<init>();
        throw r8;
        r8 = new java.lang.IllegalStateException;
        r9 = "Check failed.";
        r9 = r9.toString();
        r8.<init>(r9);
        r8 = (java.lang.Throwable) r8;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm.a(java.util.List, vlm$b, boolean, boolean, boolean, vlm$c):vlm$b");
    }

    private static b a(b bVar, b bVar2, acaj acaj) {
        if (acaj == null) {
            acaj = new acaj();
        }
        if (acaj.a(acaj)) {
            bVar = bVar.b();
        }
        bVar = bVar.a(acaj.d());
        return new b(Math.min(bVar2.d, bVar.d), Math.min(bVar2.e, bVar.e));
    }

    private static boolean a(RectF rectF, RectF rectF2, float f, float f2, float f3, float f4, float f5, float f6) {
        f3 /= 2.0f;
        f4 /= 2.0f;
        RectF rectF3 = new RectF(f - f3, f2 - f4, f3 + f, f4 + f2);
        float[] fArr = new float[]{rectF3.left, rectF3.top, rectF3.right, rectF3.top, rectF3.left, rectF3.bottom, rectF3.right, rectF3.bottom};
        Matrix matrix = new Matrix();
        matrix.setScale(f6, f6, f, f2);
        matrix.setRotate(f5, f, f2);
        matrix.mapPoints(fArr);
        for (int i = 0; i < 4; i++) {
            int i2 = i << 1;
            f4 = fArr[i2];
            f2 = fArr[i2 + 1];
            if (f4 < rectF.left && rectF.left != rectF2.left) {
                return true;
            }
            if (f4 > rectF.right && rectF.right != rectF2.right) {
                return true;
            }
            if (f2 < rectF.top && rectF.top != rectF2.top) {
                return true;
            }
            if (f2 > rectF.bottom && rectF.bottom != rectF2.bottom) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(b bVar, List<b> list) {
        Iterable<b> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (b a : iterable) {
            arrayList.add(a.a(0.4f));
        }
        for (b bVar2 : (List) arrayList) {
            if (bVar.a < bVar2.a) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(b bVar, List<b> list, a aVar) {
        if (bVar.b * 6.0f > 4000000.0f) {
            return true;
        }
        akdy akdy = aVar.b;
        float f = aVar.a;
        Iterable<b> iterable = list;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (b bVar2 : iterable) {
                Object obj;
                float f2 = bVar2.a;
                if (f2 > ((float) akdy.b)) {
                    int i;
                    f2 *= f;
                    if (f2 <= ((float) akdy.a)) {
                        i = akdy.a;
                    } else if (f2 > ((float) akdy.b)) {
                        i = akdy.b;
                    }
                    f2 = (float) i;
                }
                if (bVar.a > f2) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0220  */
    private final boolean a(defpackage.vlm.b r20, defpackage.vlm.b r21, defpackage.abyy r22) {
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        r2 = r1.d;
        r3 = r0.d;
        r2 = r2 - r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r3;
        r4 = r1.e;
        r5 = r0.e;
        r4 = r4 - r5;
        r4 = r4 / r3;
        r13 = new android.graphics.RectF;
        r5 = r0.d;
        r5 = r5 + r2;
        r0 = r0.e;
        r0 = r0 + r4;
        r13.<init>(r2, r4, r5, r0);
        r0 = new android.graphics.RectF;
        r2 = r1.d;
        r4 = r1.e;
        r5 = 0;
        r0.<init>(r5, r5, r2, r4);
        r2 = r19;
        r4 = r2.d;
        r4 = r4.density;
        r14 = 1;
        if (r22 == 0) goto L_0x0049;
    L_0x0030:
        r5 = r22.a();
        if (r5 == 0) goto L_0x0049;
    L_0x0036:
        r6 = "filters";
        defpackage.akcr.a(r5, r6);
        r6 = r5.g();
        if (r6 == 0) goto L_0x0042;
    L_0x0041:
        return r14;
    L_0x0042:
        r5 = r5.f();
        if (r5 == 0) goto L_0x0049;
    L_0x0048:
        return r14;
    L_0x0049:
        r15 = "caption";
        r12 = "caption.center";
        if (r22 == 0) goto L_0x00ba;
    L_0x004f:
        r5 = r22.b();
        if (r5 == 0) goto L_0x00ba;
    L_0x0055:
        defpackage.akcr.a(r5, r15);
        r6 = r5.k();
        r8 = r1.d;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r6 = r6 * r8;
        r8 = r5.l();
        r10 = r1.e;
        r10 = (double) r10;
        java.lang.Double.isNaN(r10);
        r8 = r8 * r10;
        r10 = r5.f();
        defpackage.akcr.a(r10, r12);
        r10 = r10.a();
        r10 = r10.doubleValue();
        r3 = r1.d;
        r16 = r15;
        r14 = (double) r3;
        java.lang.Double.isNaN(r14);
        r10 = r10 * r14;
        r3 = r5.f();
        defpackage.akcr.a(r3, r12);
        r3 = r3.b();
        r14 = r3.doubleValue();
        r3 = r1.e;
        r2 = (double) r3;
        java.lang.Double.isNaN(r2);
        r14 = r14 * r2;
        r2 = (float) r10;
        r3 = (float) r14;
        r10 = (float) r6;
        r11 = (float) r8;
        r6 = r5.g();
        r14 = (float) r6;
        r15 = r5.h();
        r5 = r13;
        r6 = r0;
        r7 = r2;
        r8 = r3;
        r9 = r10;
        r10 = r11;
        r11 = r14;
        r2 = r12;
        r12 = r15;
        r3 = defpackage.vlm.a(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r3 == 0) goto L_0x00bd;
    L_0x00b8:
        r3 = 1;
        return r3;
    L_0x00ba:
        r2 = r12;
        r16 = r15;
    L_0x00bd:
        r3 = "it";
        if (r22 == 0) goto L_0x014f;
    L_0x00c1:
        r5 = r22.c();
        if (r5 == 0) goto L_0x014f;
    L_0x00c7:
        defpackage.akcr.a(r5, r3);
        r5 = (java.lang.Iterable) r5;
        r14 = r5.iterator();
    L_0x00d0:
        r5 = r14.hasNext();
        if (r5 == 0) goto L_0x014f;
    L_0x00d6:
        r5 = r14.next();
        r5 = (defpackage.abzg) r5;
        r15 = r16;
        defpackage.akcr.a(r5, r15);
        r6 = r5.k();
        r8 = r1.d;
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r6 = r6 * r8;
        r8 = r5.l();
        r10 = r1.e;
        r10 = (double) r10;
        java.lang.Double.isNaN(r10);
        r8 = r8 * r10;
        r10 = r5.f();
        defpackage.akcr.a(r10, r2);
        r10 = r10.a();
        r10 = r10.doubleValue();
        r12 = r1.d;
        r16 = r14;
        r17 = r15;
        r14 = (double) r12;
        java.lang.Double.isNaN(r14);
        r10 = r10 * r14;
        r12 = r5.f();
        defpackage.akcr.a(r12, r2);
        r12 = r12.b();
        r14 = r12.doubleValue();
        r12 = r1.e;
        r18 = r2;
        r1 = (double) r12;
        java.lang.Double.isNaN(r1);
        r14 = r14 * r1;
        r1 = (float) r10;
        r2 = (float) r14;
        r10 = (float) r6;
        r11 = (float) r8;
        r6 = r5.g();
        r12 = (float) r6;
        r14 = r5.h();
        r5 = r13;
        r6 = r0;
        r7 = r1;
        r8 = r2;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r14;
        r1 = defpackage.vlm.a(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r1 == 0) goto L_0x0146;
    L_0x0144:
        r1 = 1;
        return r1;
    L_0x0146:
        r1 = r21;
        r14 = r16;
        r16 = r17;
        r2 = r18;
        goto L_0x00d0;
    L_0x014f:
        if (r22 == 0) goto L_0x021c;
    L_0x0151:
        r1 = r22.f();
        if (r1 == 0) goto L_0x021c;
    L_0x0157:
        r2 = "stickers";
        defpackage.akcr.a(r1, r2);
        r1 = r1.a();
        r2 = "stickers.stickerDataList";
        defpackage.akcr.a(r1, r2);
        r1 = (java.lang.Iterable) r1;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2 = (java.util.Collection) r2;
        r1 = r1.iterator();
    L_0x0172:
        r5 = r1.hasNext();
        if (r5 == 0) goto L_0x018e;
    L_0x0178:
        r5 = r1.next();
        r6 = r5;
        r6 = (defpackage.acam) r6;
        defpackage.akcr.a(r6, r3);
        r6 = r6.o();
        r7 = 1;
        r6 = r6 ^ r7;
        if (r6 == 0) goto L_0x0172;
    L_0x018a:
        r2.add(r5);
        goto L_0x0172;
    L_0x018e:
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r1 = r2.iterator();
    L_0x0196:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x021c;
    L_0x019c:
        r2 = r1.next();
        r2 = (defpackage.acam) r2;
        r5 = (double) r4;
        r7 = "stickerData";
        defpackage.akcr.a(r2, r7);
        r7 = r2.k();
        java.lang.Double.isNaN(r5);
        r7 = r7 * r5;
        r9 = r2.j();
        r7 = r7 * r9;
        r9 = (float) r7;
        r7 = r2.l();
        java.lang.Double.isNaN(r5);
        r5 = r5 * r7;
        r7 = r2.j();
        r5 = r5 * r7;
        r10 = (float) r5;
        r5 = r2.h();
        r6 = "stickerData.position";
        defpackage.akcr.a(r5, r6);
        r5 = r5.a();
        r7 = r5.doubleValue();
        r14 = r21;
        r5 = r14.d;
        r11 = (double) r5;
        java.lang.Double.isNaN(r11);
        r7 = r7 * r11;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = r9 / r5;
        r11 = (double) r11;
        java.lang.Double.isNaN(r11);
        r7 = r7 + r11;
        r5 = r2.h();
        defpackage.akcr.a(r5, r6);
        r5 = r5.b();
        r5 = r5.doubleValue();
        r11 = r14.e;
        r11 = (double) r11;
        java.lang.Double.isNaN(r11);
        r5 = r5 * r11;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r12 = r10 / r11;
        r11 = (double) r12;
        java.lang.Double.isNaN(r11);
        r5 = r5 + r11;
        r7 = (float) r7;
        r8 = (float) r5;
        r5 = r2.i();
        r11 = (float) r5;
        r5 = r2.j();
        r12 = (float) r5;
        r5 = r13;
        r6 = r0;
        r2 = defpackage.vlm.a(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r2 == 0) goto L_0x0196;
    L_0x021a:
        r2 = 1;
        return r2;
    L_0x021c:
        r14 = r21;
        if (r22 == 0) goto L_0x0281;
    L_0x0220:
        r0 = r22.d();
        if (r0 == 0) goto L_0x0281;
    L_0x0226:
        defpackage.akcr.a(r0, r3);
        r0 = r0.a();
        r1 = "it.strokes";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
    L_0x0238:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0281;
    L_0x023e:
        r1 = r0.next();
        r1 = (defpackage.abzm) r1;
        r2 = new android.graphics.RectF;
        r2.<init>(r13);
        r3 = r1.d();
        r3 = r3 * r4;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r5;
        r2.inset(r3, r3);
        r1 = r1.b();
        r3 = "drawingStroke.points";
        defpackage.akcr.a(r1, r3);
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x0263:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0238;
    L_0x0269:
        r3 = r1.next();
        r3 = (android.graphics.PointF) r3;
        r6 = r3.x;
        r7 = r14.d;
        r6 = r6 * r7;
        r3 = r3.y;
        r7 = r14.e;
        r3 = r3 * r7;
        r3 = r2.contains(r6, r3);
        if (r3 != 0) goto L_0x0263;
    L_0x027f:
        r3 = 1;
        return r3;
    L_0x0281:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm.a(vlm$b, vlm$b, abyy):boolean");
    }

    public final abtl a(aeew aeew, abyy abyy) {
        akcr.b(aeew, "mediaMetadata");
        Object obj = aeew.a;
        akcr.a(obj, "this.mediaType");
        if (abyp.i(obj.intValue())) {
            if (!a.a(aeew.a).g()) {
                return abyj.b(aeew);
            }
            obj = aeew.q;
            akcr.a(obj, "mediaMetadata.width");
            return new abtl(obj.intValue(), aeew.p.intValue() / akdp.a(2.0f));
        } else if (abyy == null) {
            return abyj.c(aeew);
        } else {
            b bVar = (abyy.w() == 0 || abyy.x() == 0) ? new b(this.d.widthPixels, this.d.heightPixels) : new b(abyy.w(), abyy.x());
            b a = vlm.a(aeew);
            float a2 = vlm.a(a, bVar);
            a = vlm.a(a.a(a2), bVar, abyy.n());
            return (!a(a, bVar, abyy) ? a.a(1.0f / a2) : bVar.a(1.0f / a2)).a();
        }
    }

    public final abtl a(vmo vmo, List<vod> list) {
        Object obj;
        vmo vmo2 = vmo;
        List<vod> list2 = list;
        akcr.b(vmo2, "videoProcessingConfiguration");
        akcr.b(list2, "mediaSources");
        Iterable<vod> iterable = list2;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (vod vod : iterable) {
            arrayList.add(vod.a.e);
        }
        List list3 = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (vod vod2 : iterable) {
            arrayList2.add(vod2.f);
        }
        List list4 = (List) arrayList2;
        acch acch = vmo2.b;
        b bVar = acch != null ? new b(new abtl(acch.a(), acch.b())) : vmo2.a instanceof ofh.a ? this.a.a((fth) vju.HIGH_QUALITY_EXPORT) ? new a(1.0f, new akdy(0, 1080)) : new a(0.5f, new akdy(360, 540)) : new a(0.5f, new akdy(360, 540));
        c cVar = bVar;
        Iterable<aeew> iterable2 = list3;
        Collection collection = (Collection) iterable2;
        String str = "this.mediaType";
        if (!collection.isEmpty()) {
            for (aeew aeew : iterable2) {
                Object obj2 = aeew.a;
                akcr.a(obj2, str);
                if (!abyp.i(obj2.intValue())) {
                    obj = null;
                    break;
                }
            }
        }
        obj = 1;
        if (obj != null) {
            return a(list3);
        }
        Object obj3;
        boolean z;
        boolean z2;
        boolean z3;
        Iterable iterable3 = list4;
        Collection arrayList3 = new ArrayList(ajyn.a(iterable3, 10));
        int i = 0;
        for (Object next : iterable3) {
            Object ajxm;
            int i2 = i + 1;
            if (i < 0) {
                ajym.a();
            }
            abyy abyy = (abyy) next;
            if (abyy == null) {
                ajxm = new ajxm(Boolean.FALSE, vlm.a((aeew) list3.get(i)));
            } else {
                b bVar2 = (abyy.w() == 0 || abyy.x() == 0) ? new b(this.d.widthPixels, this.d.heightPixels) : new b(abyy.w(), abyy.x());
                b a = vlm.a((aeew) list3.get(i));
                float a2 = vlm.a(a, bVar2);
                a = vlm.a(a.a(a2), bVar2, abyy.n());
                ajxm = new ajxm(Boolean.valueOf(a(a, bVar2, abyy)), a.a(1.0f / a2));
            }
            arrayList3.add(ajxm);
            i = i2;
        }
        Iterable<ajxm> iterable4 = (List) arrayList3;
        arrayList = new ArrayList(ajyn.a((Iterable) iterable4, 10));
        for (ajxm ajxm2 : iterable4) {
            arrayList.add(Boolean.valueOf(((Boolean) ajxm2.a).booleanValue()));
        }
        list3 = (List) arrayList;
        Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable4, 10));
        for (ajxm ajxm3 : iterable4) {
            arrayList4.add((b) ajxm3.b);
        }
        List list5 = (List) arrayList4;
        Collection arrayList5 = new ArrayList();
        for (Object obj32 : ajyu.g(iterable3)) {
            abyy abyy2 = (abyy) obj32;
            obj = (abyy2.w() == 0 || abyy2.x() == 0) ? null : 1;
            if (obj != null) {
                arrayList5.add(obj32);
            }
        }
        Iterable<abyy> iterable5 = (List) arrayList5;
        arrayList2 = new ArrayList(ajyn.a((Iterable) iterable5, 10));
        for (abyy abyy3 : iterable5) {
            arrayList2.add(new b(abyy3.w(), abyy3.x()));
        }
        list4 = ajyu.a((Iterable) (List) arrayList2, (Comparator) new e());
        Iterable<b> iterable6 = list4;
        Collection arrayList6 = new ArrayList(ajyn.a((Iterable) iterable6, 10));
        for (b bVar3 : iterable6) {
            arrayList6.add(Float.valueOf(bVar3.c));
        }
        ajyu.m((List) arrayList6).size();
        b bVar4 = (b) ajyu.g(list4);
        if (bVar4 == null) {
            bVar4 = new b(this.d.widthPixels, this.d.heightPixels);
        }
        if (!collection.isEmpty()) {
            for (aeew aeew2 : iterable2) {
                obj32 = aeew2.a;
                akcr.a(obj32, str);
                if (abyp.i(obj32.intValue())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!collection.isEmpty()) {
            for (aeew aeew3 : iterable2) {
                Object obj4 = aeew3.a;
                akcr.a(obj4, str);
                if (abyp.a(obj4.intValue())) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        Iterable<Boolean> iterable7 = list3;
        if (!((Collection) iterable7).isEmpty()) {
            for (Boolean booleanValue : iterable7) {
                if (booleanValue.booleanValue()) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        return a(list5, bVar4, z3, z, z2, cVar).a();
    }
}
