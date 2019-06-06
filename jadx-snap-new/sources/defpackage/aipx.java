package defpackage;

import android.util.Log;
import com.brightcove.player.event.Event;

/* renamed from: aipx */
public final class aipx {
    public static void a(fv fvVar) {
        aiqf.a(fvVar, Event.FRAGMENT);
        aipy b = aipx.b(fvVar);
        String str = "dagger.android.support";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, String.format("An injector for %s was found in %s", new Object[]{fvVar.getClass().getCanonicalName(), b.getClass().getCanonicalName()}));
        }
        aipq c = b.c();
        aiqf.a(c, "%s.supportFragmentInjector() returned null", b.getClass());
        c.a(fvVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0042 in {6, 10, 14, 16} preds:[]
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
    private static defpackage.aipy b(defpackage.fv r3) {
        /*
        r0 = r3;
        r0 = r0.getParentFragment();
        if (r0 == 0) goto L_0x000e;
        r1 = r0 instanceof defpackage.aipy;
        if (r1 == 0) goto L_0x0001;
        r0 = (defpackage.aipy) r0;
        return r0;
        r0 = r3.getActivity();
        r1 = r0 instanceof defpackage.aipy;
        if (r1 == 0) goto L_0x0019;
        r0 = (defpackage.aipy) r0;
        return r0;
        r1 = r0.getApplication();
        r1 = r1 instanceof defpackage.aipy;
        if (r1 == 0) goto L_0x0028;
        r3 = r0.getApplication();
        r3 = (defpackage.aipy) r3;
        return r3;
        r0 = new java.lang.IllegalArgumentException;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = r3.getClass();
        r3 = r3.getCanonicalName();
        r1[r2] = r3;
        r3 = "No injector was found for %s";
        r3 = java.lang.String.format(r3, r1);
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aipx.b(fv):aipy");
    }
}
