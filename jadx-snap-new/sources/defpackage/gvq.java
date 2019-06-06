package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: gvq */
public final class gvq implements gvp {
    private final List<gvn> a;
    private final a b;

    /* renamed from: gvq$a */
    public static class a {
    }

    public gvq(Set<? extends gvn> set, a aVar) {
        akcr.b(set, "handlerSet");
        akcr.b(aVar, "patternMatcher");
        this.b = aVar;
        Object copyOf = ImmutableList.copyOf((Collection) set);
        akcr.a(copyOf, "ImmutableList.copyOf(handlerSet)");
        this.a = (List) copyOf;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0073 in {12, 14, 16, 18} preds:[]
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
    public final defpackage.gvn a(android.net.Uri r9) {
        /*
        r8 = this;
        r0 = "uri";
        defpackage.akcr.b(r9, r0);
        r9 = r9.toString();
        r0 = "uri.toString()";
        defpackage.akcr.a(r9, r0);
        r0 = "null cannot be cast to non-null type java.lang.String";
        if (r9 == 0) goto L_0x006d;
        r9 = r9.toLowerCase();
        r1 = "(this as java.lang.String).toLowerCase()";
        defpackage.akcr.a(r9, r1);
        r2 = r8.a;
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x006b;
        r3 = r2.next();
        r3 = (defpackage.gvn) r3;
        r4 = r3.a();
        r4 = (java.lang.Iterable) r4;
        r4 = r4.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0023;
        r5 = r4.next();
        r5 = (java.lang.String) r5;
        if (r5 == 0) goto L_0x0065;
        r5 = r5.toLowerCase();
        defpackage.akcr.a(r5, r1);
        r6 = "match";
        defpackage.akcr.b(r9, r6);
        r6 = "pattern";
        defpackage.akcr.b(r5, r6);
        r6 = new android.os.PatternMatcher;
        r7 = 2;
        r6.<init>(r5, r7);
        r5 = r6.match(r9);
        if (r5 == 0) goto L_0x0039;
        return r3;
        r9 = new ajxt;
        r9.<init>(r0);
        throw r9;
        r9 = 0;
        return r9;
        r9 = new ajxt;
        r9.<init>(r0);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvq.a(android.net.Uri):gvn");
    }
}
