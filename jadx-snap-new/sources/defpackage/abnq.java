package defpackage;

import com.google.common.base.Supplier;
import java.util.concurrent.CountDownLatch;

@Deprecated
/* renamed from: abnq */
public final class abnq {
    public static volatile boolean a;
    private static volatile abnp b;
    private static final CountDownLatch c = new CountDownLatch(1);
    private static final ide d = new ide("BusProvider", idi.APP_PLATFORM) {
        public final idl getAttributionFor(String str) {
            return super.getAttributionFor(str);
        }

        public final idj getPage() {
            return super.getPage();
        }
    };

    /* renamed from: abnq$2 */
    static class 2 implements Supplier<abnp> {
        2() {
        }

        public final /* synthetic */ Object get() {
            return abnq.b();
        }
    }

    static {
        2 2 = new 2();
    }

    public static synchronized void a() {
        synchronized (abnq.class) {
            if (b == null) {
                akqk akqk = new akqk();
                akqk.g = false;
                akqk.e = true;
                akqk.b = false;
                akqk.d = false;
                zgb zgb = new zgb();
                akqk.h = zgb.a(d, "eventBusShared").a();
                b = new abnp(akqk.a());
                c.countDown();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 7, 9, 11} preds:[]
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
    public static defpackage.abnp b() {
        /*
        r0 = a;
        if (r0 == 0) goto L_0x0019;
        r0 = b;
        if (r0 != 0) goto L_0x0018;
        r1 = c;	 Catch:{ InterruptedException -> 0x0010 }
        r1.await();	 Catch:{ InterruptedException -> 0x0010 }
        r0 = b;	 Catch:{ InterruptedException -> 0x0010 }
        goto L_0x0006;
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
        goto L_0x0006;
        return r0;
        r0 = new java.lang.IllegalStateException;
        r1 = "Call to BusProvider#getInstance() being made too early in the app lifecycle";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnq.b():abnp");
    }
}
