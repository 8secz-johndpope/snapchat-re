package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gw */
public final class gw implements Iterable<Intent> {
    public final ArrayList<Intent> a = new ArrayList();
    public final Context b;

    /* renamed from: gw$a */
    public interface a {
        Intent a_();
    }

    /* renamed from: gw$c */
    static class c {
        c() {
        }
    }

    /* renamed from: gw$b */
    static class b extends c {
        b() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            b bVar = new b();
        } else {
            c cVar = new c();
        }
    }

    public gw(Context context) {
        this.b = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0029 in {6, 7, 10} preds:[]
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
    public final defpackage.gw a(android.content.ComponentName r3) {
        /*
        r2 = this;
        r0 = r2.a;
        r0 = r0.size();
        r1 = r2.b;	 Catch:{ NameNotFoundException -> 0x001b }
        r3 = defpackage.gm.a(r1, r3);	 Catch:{ NameNotFoundException -> 0x001b }
        if (r3 == 0) goto L_0x001a;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r2.a;	 Catch:{ NameNotFoundException -> 0x001b }
        r1.add(r0, r3);	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r2.b;	 Catch:{ NameNotFoundException -> 0x001b }
        r3 = r3.getComponent();	 Catch:{ NameNotFoundException -> 0x001b }
        goto L_0x0008;
        return r2;
        r3 = move-exception;
        r0 = "TaskStackBuilder";
        r1 = "Bad ComponentName while traversing activity parent metadata";
        android.util.Log.e(r0, r1);
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw.a(android.content.ComponentName):gw");
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
