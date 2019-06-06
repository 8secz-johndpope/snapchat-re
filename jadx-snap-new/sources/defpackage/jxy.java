package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: jxy */
public final class jxy implements Supplier<azm> {
    final jwi a;
    private final Supplier<azm> b;
    private volatile avq<auz, avb> c;

    /* renamed from: jxy$a */
    static class a extends azl {
        private final avv f;
        private final jwi g;
        private final zfw h;

        public a(Context context, avn avn, atw atw, avq<auz, avb> avq, jwi jwi, zfw zfw) {
            super(context, avn, atw, avq, new HashSet());
            this.f = ayy.a(avn, atw, avq).a(Config.ARGB_8888);
            this.g = jwi;
            this.h = zfw;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002e in {2, 4, 10, 12} preds:[]
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
        private /* synthetic */ void a(defpackage.jya r5, java.io.InputStream r6) {
            /*
            r4 = this;
            r0 = 0;
            r1 = new ave;	 Catch:{ Exception -> 0x0022 }
            r2 = defpackage.auj.a(r6);	 Catch:{ Exception -> 0x0022 }
            r1.<init>(r2);	 Catch:{ Exception -> 0x0022 }
            r2 = r4.f;	 Catch:{ Exception -> 0x0022 }
            r3 = defpackage.avt.a;	 Catch:{ Exception -> 0x0022 }
            r1 = r2.a(r1, r3);	 Catch:{ Exception -> 0x0022 }
            r0 = defpackage.auq.a(r1);	 Catch:{ Exception -> 0x0022 }
            r5.a(r0);	 Catch:{ Exception -> 0x0022 }
            defpackage.auq.c(r0);
            com.google.common.io.Closeables.closeQuietly(r6);
            return;
            r5 = move-exception;
            goto L_0x0027;
            r1 = move-exception;
            r5.b(r1);	 Catch:{ all -> 0x0020 }
            goto L_0x0019;
            defpackage.auq.c(r0);
            com.google.common.io.Closeables.closeQuietly(r6);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jxy$a.a(jya, java.io.InputStream):void");
        }

        public final awf<auq<avb>> a(avz avz, Object obj, int i) {
            if (avz.b != 4) {
                return super.a(avz, obj, i);
            }
            Preconditions.checkArgument(obj instanceof idl);
            ajdx a = this.g.a(new jwh(avz.a, (idl) obj));
            jya jya = new jya();
            a = a.b((ajdw) this.h.f()).a((ajdw) this.h.b());
            ajfb -__lambda_jxy_a_4w5m7xy-q9rthioe_lvkqjuzv7m = new -$$Lambda$jxy$a$4W5M7xY-q9rThIoe_lvKQjUZV7M(this, jya);
            jya.getClass();
            ajej a2 = a.a(-__lambda_jxy_a_4w5m7xy-q9rthioe_lvkqjuzv7m, new -$$Lambda$AcFadWR_oBhpTr8jNhhO4SF7aMI(jya));
            a2.getClass();
            jya.a = new -$$Lambda$VuHZ2JgOps-79WR5b7xHvaU83eg(a2);
            return jya;
        }
    }

    public jxy(Context context, zfw zfw, jwi jwi, aipn<jwb> aipn) {
        this.a = jwi;
        this.b = Suppliers.memoize(new -$$Lambda$jxy$zUU_ssp2iA_HmxJgaC6hux3NSbw(this, context, aipn, zfw));
    }

    private /* synthetic */ azm a(Context context, aipn aipn, zfw zfw) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int a = (displayMetrics.heightPixels * displayMetrics.widthPixels) * jxl.a(Config.ARGB_8888);
        final ajdw b = zfw.b();
        final jwa a2 = ((jwb) aipn.get()).a(jwp.a);
        final avn 2 = new avn() {
            public final auq<Bitmap> b(int i, int i2, Config config) {
                return new jxz(a2.a(i, i2, config, "AnimatedDraweeControllerBuilderSupplierSupplier"), b);
            }
        };
        final zfw zfw2 = zfw;
        final 3 3 = new atw() {
            public final Executor a() {
                return zfw2.a();
            }
        };
        -$$Lambda$6zHfmqRZ93wEogYZP-pCep0B58k -__lambda_6zhfmqrz93weogyzp-pcep0b58k = -$$Lambda$6zHfmqRZ93wEogYZP-pCep0B58k.INSTANCE;
        double d = (double) a;
        Double.isNaN(d);
        final avq avq = new avq(-__lambda_6zhfmqrz93weogyzp-pcep0b58k, new avo(), new -$$Lambda$jxy$lBdlQXTEjDqSI6brVkkbtvVkKjc(((int) (d * 0.75d)) * 24));
        this.c = avq;
        final Context context2 = context;
        return new azm(context, 2, 3, avq) {
            /* renamed from: a */
            public final azl get() {
                return new a(context2, 2, 3, avq, jxy.this.a, zfw2);
            }
        };
    }

    public final void a() {
        avq avq = this.c;
        if (avq != null) {
            ArrayList d;
            ArrayList d2;
            synchronized (avq) {
                d = avq.a.d();
                d2 = avq.b.d();
                avq.c(d2);
            }
            avq.a(d2);
            avq.b(d);
            avq.a();
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return (azm) this.b.get();
    }
}
