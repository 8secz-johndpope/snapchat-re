package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.media.MediaPlayer;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abmh.a;

/* renamed from: adfv */
final class adfv {
    final MediaPlayer a;
    final a b;
    final int c;
    private boolean d;
    private boolean e;

    /* renamed from: adfv$1 */
    class 1 implements AnimatorUpdateListener {
        1() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            adfv.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: adfv$2 */
    class 2 extends AnimatorListenerAdapter {
        2() {
        }

        public final void onAnimationEnd(Animator animator) {
            adfv.this.a();
        }
    }

    /* renamed from: adfv$3 */
    class 3 implements AnimatorUpdateListener {
        3() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (adfv.this.c()) {
                adfv.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    adfv(MediaPlayer mediaPlayer, a aVar, int i) {
        this.a = mediaPlayer;
        this.c = i;
        this.b = aVar;
    }

    public final synchronized void a() {
        if (!this.e) {
            this.e = true;
            this.a.release();
        }
    }

    public final synchronized void a(float f) {
        if (!this.e) {
            this.a.setVolume(f, f);
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            return;
     */
    public final synchronized void a(android.media.MediaPlayer.OnPreparedListener r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e;	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0016;
    L_0x0005:
        r0 = r1.d;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0016;
    L_0x000a:
        r0 = r1.a;	 Catch:{ all -> 0x0018 }
        r0.setOnPreparedListener(r2);	 Catch:{ all -> 0x0018 }
        r2 = r1.a;	 Catch:{ all -> 0x0018 }
        r2.prepareAsync();	 Catch:{ all -> 0x0018 }
        monitor-exit(r1);
        return;
    L_0x0016:
        monitor-exit(r1);
        return;
    L_0x0018:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfv.a(android.media.MediaPlayer$OnPreparedListener):void");
    }

    /* JADX WARNING: Missing block: B:11:0x0015, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e;	 Catch:{ all -> 0x0016 }
        if (r0 != 0) goto L_0x0014;
    L_0x0005:
        r0 = r1.d;	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0014;
    L_0x000a:
        r0 = 1;
        r1.d = r0;	 Catch:{ all -> 0x0016 }
        r0 = r1.a;	 Catch:{ all -> 0x0016 }
        r0.start();	 Catch:{ all -> 0x0016 }
        monitor-exit(r1);
        return;
    L_0x0014:
        monitor-exit(r1);
        return;
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfv.b():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0011 in {6, 8, 9, 12} preds:[]
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
    public final synchronized boolean c() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x000e }
        r0 = r1.e;	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x000c;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x000a;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfv.c():boolean");
    }

    public final synchronized void d() {
        if (!this.e) {
            if (this.d) {
                this.d = false;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
                ofFloat.addUpdateListener(new 1());
                ofFloat.addListener(new 2());
                ofFloat.start();
                return;
            }
            a();
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0034, code skipped:
            return;
     */
    public final synchronized void e() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x0033;
    L_0x0005:
        r0 = r3.d;	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0033;
    L_0x000a:
        r0 = 0;
        r3.a(r0);	 Catch:{ all -> 0x0035 }
        r1 = 2;
        r1 = new float[r1];	 Catch:{ all -> 0x0035 }
        r2 = 0;
        r1[r2] = r0;	 Catch:{ all -> 0x0035 }
        r0 = 1;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1[r0] = r2;	 Catch:{ all -> 0x0035 }
        r0 = android.animation.ValueAnimator.ofFloat(r1);	 Catch:{ all -> 0x0035 }
        r1 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0.setDuration(r1);	 Catch:{ all -> 0x0035 }
        r1 = new adfv$3;	 Catch:{ all -> 0x0035 }
        r1.<init>();	 Catch:{ all -> 0x0035 }
        r0.addUpdateListener(r1);	 Catch:{ all -> 0x0035 }
        r3.b();	 Catch:{ all -> 0x0035 }
        r0.start();	 Catch:{ all -> 0x0035 }
        monitor-exit(r3);
        return;
    L_0x0033:
        monitor-exit(r3);
        return;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfv.e():void");
    }
}
