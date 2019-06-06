package defpackage;

import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abwy.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abwz */
public final class abwz extends abwy {
    private final abwk c;
    private final abvv d;
    private final abwx e;

    /* renamed from: abwz$f */
    public static final class f {
        final float a;
        final g b;

        public f(float f, g gVar) {
            akcr.b(gVar, "gravity");
            this.a = f;
            this.b = gVar;
        }
    }

    /* renamed from: abwz$g */
    public enum g {
        FROM_THE_RIGHT(2),
        FROM_THE_LEFT(1),
        CENTERED(3);
        
        final int horizontalGravity;

        private g(int i) {
            this.horizontalGravity = i;
        }
    }

    /* renamed from: abwz$h */
    public static final class h {
        float a = -1.0f;
        float b = -1.0f;
        float c;
        float d;
        f e;
        boolean f = true;
        abxq<Float> g;
        abxq<Float> h;
        final abwy i;

        /* renamed from: abwz$h$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public h(abwy abwy) {
            akcr.b(abwy, "element");
            this.i = abwy;
        }

        public final h a() {
            h hVar = this;
            hVar.c = MapboxConstants.MINIMUM_ZOOM;
            hVar.d = MapboxConstants.MINIMUM_ZOOM;
            return hVar;
        }

        public final h a(float f, float f2) {
            h hVar = this;
            hVar.a = f;
            hVar.b = f2;
            return hVar;
        }

        public final h a(f fVar, float f) {
            akcr.b(fVar, "dimenWithGravityX");
            h hVar = this;
            hVar.e = fVar;
            hVar.d = f;
            return hVar;
        }

        public final h a(abxq<Float> abxq, abxq<Float> abxq2) {
            akcr.b(abxq, "left");
            akcr.b(abxq2, "right");
            h hVar = this;
            hVar.g = abxq;
            hVar.h = abxq2;
            return hVar;
        }

        public final h b() {
            h hVar = this;
            hVar.f = false;
            return hVar;
        }

        public final h b(float f, float f2) {
            h hVar = this;
            hVar.c = f;
            hVar.d = f2;
            return hVar;
        }
    }

    /* renamed from: abwz$1 */
    static final class 1<T> implements Supplier<Float> {
        private /* synthetic */ h a;
        private /* synthetic */ akbk b;

        1(h hVar, akbk akbk) {
            this.a = hVar;
            this.b = akbk;
        }

        public final /* synthetic */ Object get() {
            return Float.valueOf(this.a.c + ((Number) this.b.invoke()).floatValue());
        }
    }

    /* renamed from: abwz$a */
    static final class a<T> implements Supplier<Float> {
        private /* synthetic */ f a;
        private /* synthetic */ abwl b;
        private /* synthetic */ akbk c;
        private /* synthetic */ akbk d;

        a(f fVar, abwl abwl, akbk akbk, akbk akbk2) {
            this.a = fVar;
            this.b = abwl;
            this.c = akbk;
            this.d = akbk2;
        }

        public final /* synthetic */ Object get() {
            return Float.valueOf(this.a.a + ((Number) this.c.invoke()).floatValue());
        }
    }

    /* renamed from: abwz$b */
    static final class b<T> implements Supplier<Float> {
        private /* synthetic */ f a;
        private /* synthetic */ abwl b;
        private /* synthetic */ akbk c;
        private /* synthetic */ akbk d;

        b(f fVar, abwl abwl, akbk akbk, akbk akbk2) {
            this.a = fVar;
            this.b = abwl;
            this.c = akbk;
            this.d = akbk2;
        }

        public final /* synthetic */ Object get() {
            return Float.valueOf(this.a.a + ((Number) this.d.invoke()).floatValue());
        }
    }

    /* renamed from: abwz$e */
    public static class e extends a {
        abxq<Integer> d;
        final List<h> e = new ArrayList();
        public Float f;
        public abxq<Integer> g;
        public float h;

        public final e a(abxq<Integer> abxq) {
            akcr.b(abxq, "color");
            e eVar = this;
            eVar.d = abxq;
            return eVar;
        }

        public final h a(abwy abwy) {
            akcr.b(abwy, "element");
            h hVar = new h(abwy);
            this.e.add(hVar);
            return hVar;
        }

        /* renamed from: b */
        public final abwz a() {
            return new abwz(this);
        }
    }

    /* renamed from: abwz$c */
    static final class c extends akcs implements akbk<Integer> {
        private /* synthetic */ abxq a;

        c(abxq abxq) {
            this.a = abxq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((Number) this.a.a()).intValue());
        }
    }

    /* renamed from: abwz$d */
    static final class d extends akcs implements akbk<Integer> {
        private /* synthetic */ abxq a;

        d(abxq abxq) {
            this.a = abxq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((Number) this.a.a()).intValue());
        }
    }

    /* renamed from: abwz$i */
    static final class i extends akcs implements akbk<Float> {
        private /* synthetic */ h a;

        i(h hVar) {
            this.a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            float floatValue;
            abxq abxq = this.a.g;
            if (abxq != null) {
                Float f = (Float) abxq.a();
                if (f != null) {
                    floatValue = f.floatValue();
                    return Float.valueOf(floatValue);
                }
            }
            floatValue = MapboxConstants.MINIMUM_ZOOM;
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: abwz$j */
    static final class j extends akcs implements akbk<Float> {
        private /* synthetic */ h a;

        j(h hVar) {
            this.a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            float floatValue;
            abxq abxq = this.a.h;
            if (abxq != null) {
                Float f = (Float) abxq.a();
                if (f != null) {
                    floatValue = f.floatValue();
                    return Float.valueOf(floatValue);
                }
            }
            floatValue = MapboxConstants.MINIMUM_ZOOM;
            return Float.valueOf(floatValue);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:66:0x019d in {2, 5, 10, 18, 21, 26, 27, 28, 32, 33, 36, 37, 38, 39, 43, 44, 51, 52, 53, 56, 61, 62, 63, 65} preds:[]
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
    public abwz(defpackage.abwz.e r12) {
        /*
        r11 = this;
        r0 = "builder";
        defpackage.akcr.b(r12, r0);
        r0 = r12;
        r0 = (defpackage.abwy.a) r0;
        r11.<init>(r0);
        r0 = new abwi;
        r0.<init>();
        r1 = r0;
        r1 = (defpackage.abwk) r1;
        r11.c = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.List) r1;
        r2 = r12.h;
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x002d;
        r2 = new abwe;
        r3 = r12.h;
        r2.<init>(r3);
        r1.add(r2);
        r2 = r12.d;
        if (r2 == 0) goto L_0x0040;
        r3 = new abwf;
        r4 = new abwz$c;
        r4.<init>(r2);
        r4 = (defpackage.akbk) r4;
        r3.<init>(r4);
        r1.add(r3);
        r2 = r12.f;
        if (r2 == 0) goto L_0x005f;
        r2 = (java.lang.Number) r2;
        r2 = r2.floatValue();
        r3 = r12.g;
        if (r3 == 0) goto L_0x005f;
        r4 = new abvw;
        r5 = r12.h;
        r6 = new abwz$d;
        r6.<init>(r3);
        r6 = (defpackage.akbk) r6;
        r4.<init>(r5, r6, r2);
        r1.add(r4);
        r1.add(r0);
        r1 = (java.util.Collection) r1;
        r2 = 0;
        r3 = new defpackage.abvv[r2];
        r1 = r1.toArray(r3);
        if (r1 == 0) goto L_0x0195;
        r1 = (defpackage.abvv[]) r1;
        r3 = r1.length;
        r1 = java.util.Arrays.copyOf(r1, r3);
        r1 = (defpackage.abvv[]) r1;
        r3 = new abwd;
        r3.<init>(r1);
        r3 = (defpackage.abvv) r3;
        r11.d = r3;
        r1 = r0;
        r1 = (defpackage.abwx) r1;
        r11.e = r1;
        r12 = r12.e;
        r12 = r12.iterator();
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x0194;
        r1 = r12.next();
        r1 = (defpackage.abwz.h) r1;
        r3 = r1.a;
        r4 = r1.b;
        r5 = r1.i;
        r11.a(r5);
        r5 = new abwh;
        r5.<init>();
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r7 == 0) goto L_0x00ad;
        r5.a(r3);
        r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r7 == 0) goto L_0x00b4;
        r5.b(r4);
        r7 = r1.f;
        r5.a(r7);
        r7 = 1;
        r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x00c5;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 != 0) goto L_0x00c3;
        goto L_0x00c5;
        r8 = 0;
        goto L_0x00c6;
        r8 = 1;
        if (r8 == 0) goto L_0x00eb;
        r9 = new abwq;
        r9.<init>();
        r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x00d3;
        r3 = 1;
        goto L_0x00d4;
        r3 = 0;
        r9.a = r3;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x00dc;
        r3 = 1;
        goto L_0x00dd;
        r3 = 0;
        r9.b = r3;
        r3 = r1.i;
        r3 = r3.a();
        r9.a(r3);
        r9 = (defpackage.abwk) r9;
        goto L_0x00ec;
        r9 = 0;
        r3 = r1.i;
        r3 = r3.c();
        if (r8 == 0) goto L_0x00fa;
        if (r9 != 0) goto L_0x0100;
        defpackage.akcr.a();
        goto L_0x0100;
        r4 = r1.i;
        r9 = r4.a();
        r4 = r1.i;
        r4 = r4.b();
        r5.a(r9, r4, r3);
        r3 = new abwl;
        r3.<init>();
        r4 = r1.f;
        r3.a(r4);
        r4 = new abwz$i;
        r4.<init>(r1);
        r4 = (defpackage.akbk) r4;
        r6 = new abwz$j;
        r6.<init>(r1);
        r6 = (defpackage.akbk) r6;
        r8 = r1.e;
        if (r8 == 0) goto L_0x015e;
        r9 = r8.b;
        r10 = defpackage.abxa.a;
        r9 = r9.ordinal();
        r9 = r10[r9];
        if (r9 == r7) goto L_0x014a;
        r10 = 2;
        if (r9 == r10) goto L_0x0135;
        goto L_0x015e;
        r9 = new abwz$b;
        r9.<init>(r8, r3, r6, r4);
        r9 = (com.google.common.base.Supplier) r9;
        r3.a(r9);
        r8 = new abxc;
        r8.<init>(r6);
        r8 = (com.google.common.base.Supplier) r8;
        r3.c(r8);
        goto L_0x015e;
        r9 = new abwz$a;
        r9.<init>(r8, r3, r6, r4);
        r9 = (com.google.common.base.Supplier) r9;
        r3.c(r9);
        r8 = new abxc;
        r8.<init>(r4);
        r8 = (com.google.common.base.Supplier) r8;
        r3.a(r8);
        r8 = r1.e;
        if (r8 != 0) goto L_0x0176;
        r8 = new abwz$1;
        r8.<init>(r1, r4);
        r8 = (com.google.common.base.Supplier) r8;
        r3.a(r8);
        r4 = new abxb;
        r4.<init>(r6);
        r4 = (com.google.common.base.Supplier) r4;
        r3.c(r4);
        r4 = r1.d;
        r3.a(r4);
        r5 = (defpackage.abwk) r5;
        r3.a(r5);
        r4 = r3;
        r4 = (defpackage.abwk) r4;
        r3 = (defpackage.abwx) r3;
        r1 = r1.e;
        if (r1 == 0) goto L_0x018f;
        r1 = r1.b;
        if (r1 == 0) goto L_0x018f;
        r7 = r1.horizontalGravity;
        r0.a(r4, r3, r7);
        goto L_0x008a;
        return;
        r12 = new ajxt;
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";
        r12.<init>(r0);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwz.<init>(abwz$e):void");
    }

    public final abwk a() {
        return this.c;
    }

    public final abvv b() {
        return this.d;
    }

    public final /* synthetic */ abwx c() {
        return new abwt(this.e, super.c());
    }
}
