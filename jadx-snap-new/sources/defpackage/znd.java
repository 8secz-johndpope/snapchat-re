package defpackage;

import com.brightcove.player.event.Event;
import java.util.Iterator;
import java.util.List;

/* renamed from: znd */
public final class znd<T> implements znh<T> {
    private final List<znh<T>> a;

    public znd(List<? extends znh<T>> list) {
        akcr.b(list, Event.LIST);
        this.a = list;
    }

    public final int a() {
        int i = 0;
        for (znh a : this.a) {
            i += a.a();
        }
        return i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0027 in {6, 7, 9} preds:[]
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
    public final T a(int r4) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x001f;
        r1 = r0.next();
        r1 = (defpackage.znh) r1;
        r2 = r1.a();
        if (r4 >= r2) goto L_0x001d;
        r4 = r1.a(r4);
        return r4;
        r4 = r4 - r2;
        goto L_0x0006;
        r4 = new java.lang.IndexOutOfBoundsException;
        r4.<init>();
        r4 = (java.lang.Throwable) r4;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znd.a(int):java.lang.Object");
    }

    public final Iterator<T> iterator() {
        return new zni(this);
    }
}
