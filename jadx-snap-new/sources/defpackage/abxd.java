package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import defpackage.abwy.a;

/* renamed from: abxd */
public final class abxd extends abwy implements ajej {
    final abvy c;
    Runnable d;
    private ajei e = new ajei();

    /* renamed from: abxd$g */
    public static final class g {
        private g() {
        }

        public /* synthetic */ g(byte b) {
            this();
        }
    }

    /* renamed from: abxd$h */
    static final class h implements Runnable {
        private /* synthetic */ View a;

        h(View view) {
            this.a = view;
        }

        public final void run() {
            this.a.requestLayout();
            this.a.postInvalidate();
        }
    }

    /* renamed from: abxd$a */
    static final class a<T> implements ajfb<Bitmap> {
        private /* synthetic */ abxd a;

        a(abxd abxd) {
            this.a = abxd;
        }

        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.a.c.c = bitmap;
                Runnable runnable = this.a.d;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: abxd$b */
    static final class b<T> implements ajfb<Drawable> {
        private /* synthetic */ abxd a;

        b(abxd abxd) {
            this.a = abxd;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.b = (Drawable) obj;
            Runnable runnable = this.a.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: abxd$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: abxd$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: abxd$f */
    public static final class f extends a {
        ajdx<Bitmap> d;
        public Drawable e;
        ajdp<Drawable> f;
        ScaleType g = ScaleType.FIT_XY;
        abxq<Float> h;

        public final void a(abxq<Float> abxq) {
            akcr.b(abxq, "animatingAlpha");
            this.h = abxq;
        }

        public final void a(ajdp<Drawable> ajdp) {
            akcr.b(ajdp, "drawableObservable");
            this.f = ajdp;
        }

        public final void a(ajdx<Bitmap> ajdx) {
            akcr.b(ajdx, "bitmap");
            this.d = ajdx;
        }

        public final void a(ScaleType scaleType) {
            akcr.b(scaleType, "<set-?>");
            this.g = scaleType;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0067 in {4, 10, 11, 15, 16, 20, 22, 24} preds:[]
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
        /* renamed from: b */
        public final defpackage.abxd a() {
            /*
            r7 = this;
            r0 = 4;
            r1 = new java.lang.Object[r0];
            r2 = 0;
            r3 = 0;
            r1[r2] = r3;
            r3 = r7.f;
            r4 = 1;
            r1[r4] = r3;
            r3 = r7.d;
            r5 = 2;
            r1[r5] = r3;
            r3 = r7.e;
            r5 = 3;
            r1[r5] = r3;
            r1 = defpackage.ajym.b(r1);
            r1 = (java.lang.Iterable) r1;
            r3 = r1 instanceof java.util.Collection;
            if (r3 == 0) goto L_0x002a;
            r3 = r1;
            r3 = (java.util.Collection) r3;
            r3 = r3.isEmpty();
            if (r3 == 0) goto L_0x002a;
            goto L_0x0049;
            r1 = r1.iterator();
            r3 = 0;
            r6 = r1.hasNext();
            if (r6 == 0) goto L_0x0048;
            r6 = r1.next();
            if (r6 != 0) goto L_0x003d;
            r6 = 1;
            goto L_0x003e;
            r6 = 0;
            if (r6 == 0) goto L_0x002f;
            r3 = r3 + 1;
            if (r3 >= 0) goto L_0x002f;
            defpackage.ajym.b();
            goto L_0x002f;
            r2 = r3;
            if (r2 == r0) goto L_0x005d;
            if (r2 != r5) goto L_0x0053;
            r0 = new abxd;
            r0.<init>(r7);
            return r0;
            r0 = new java.lang.IllegalStateException;
            r1 = "Can only have one of bitmap, drawable, single<bitmap> or maybe<drawable> in Image.Builder";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r0 = new java.lang.IllegalStateException;
            r1 = "setBitmap or setDrawable must be called in Image.Builder";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abxd$f.a():abxd");
        }
    }

    /* renamed from: abxd$e */
    static final class e extends akcs implements akbk<Float> {
        private /* synthetic */ abxq a;

        e(abxq abxq) {
            this.a = abxq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((Number) this.a.a()).floatValue());
        }
    }

    static {
        g gVar = new g();
    }

    public abxd(f fVar) {
        akcr.b(fVar, "builder");
        super(fVar);
        abvy abvy = new abvy();
        abvy.a = false;
        abvy.c = null;
        abvy.b = fVar.e;
        ScaleType scaleType = fVar.g;
        String str = "<set-?>";
        akcr.b(scaleType, str);
        abvy.d = scaleType;
        this.c = abvy;
        ajdx ajdx = fVar.d;
        if (ajdx != null) {
            this.e.a(ajdx.a((ajfb) new a(this), (ajfb) c.a));
        }
        ajdp ajdp = fVar.f;
        if (ajdp != null) {
            this.e.a(ajdp.a((ajfb) new b(this), (ajfb) d.a));
        }
        abxq abxq = fVar.h;
        if (abxq != null) {
            abvy = this.c;
            akbk eVar = new e(abxq);
            akcr.b(eVar, str);
            abvy.e = eVar;
        }
    }

    public final void a(View view) {
        akcr.b(view, "v");
        super.a(view);
        this.d = new h(view);
    }

    public final /* bridge */ /* synthetic */ abvv b() {
        return this.c;
    }

    public final void dispose() {
        this.e.dispose();
    }

    public final boolean isDisposed() {
        return this.e.isDisposed();
    }
}
