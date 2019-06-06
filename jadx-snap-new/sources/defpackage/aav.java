package defpackage;

import defpackage.jf.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: aav */
public final class aav<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final a<List<Throwable>> b;
    private final List<? extends aak<Data, ResourceType, Transcode>> c;
    private final String d;

    public aav(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<aak<Data, ResourceType, Transcode>> list, a<List<Throwable>> aVar) {
        this.a = cls;
        this.b = aVar;
        this.c = (List) ahl.a((Collection) list);
        StringBuilder stringBuilder = new StringBuilder("Failed LoadPath{");
        stringBuilder.append(cls.getSimpleName());
        String str = "->";
        stringBuilder.append(str);
        stringBuilder.append(cls2.getSimpleName());
        stringBuilder.append(str);
        stringBuilder.append(cls3.getSimpleName());
        stringBuilder.append("}");
        this.d = stringBuilder.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003a in {5, 7, 9, 11, 13} preds:[]
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
    private defpackage.aax<Transcode> a(defpackage.zn<Data> r6, defpackage.zf r7, int r8, int r9, defpackage.aak.a<ResourceType> r10, java.util.List<java.lang.Throwable> r11) {
        /*
        r5 = this;
        r0 = r5.c;
        r0 = r0.size();
        r1 = 0;
        r2 = 0;
        if (r2 >= r0) goto L_0x002a;
        r3 = r5.c;
        r3 = r3.get(r2);
        r3 = (defpackage.aak) r3;
        r4 = r3.a(r6, r8, r9, r7);	 Catch:{ aas -> 0x0021 }
        r4 = r10.a(r4);	 Catch:{ aas -> 0x0021 }
        r3 = r3.a;	 Catch:{ aas -> 0x0021 }
        r1 = r3.a(r4, r7);	 Catch:{ aas -> 0x0021 }
        goto L_0x0025;
        r3 = move-exception;
        r11.add(r3);
        if (r1 != 0) goto L_0x002a;
        r2 = r2 + 1;
        goto L_0x0008;
        if (r1 == 0) goto L_0x002d;
        return r1;
        r6 = new aas;
        r7 = r5.d;
        r8 = new java.util.ArrayList;
        r8.<init>(r11);
        r6.<init>(r7, r8);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aav.a(zn, zf, int, int, aak$a, java.util.List):aax");
    }

    public final aax<Transcode> a(zn<Data> znVar, zf zfVar, int i, int i2, aak.a<ResourceType> aVar) {
        List list = (List) ahl.a(this.b.a(), "Argument must not be null");
        try {
            aax<Transcode> a = a(znVar, zfVar, i, i2, aVar, list);
            return a;
        } finally {
            this.b.a(list);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadPath{decodePaths=");
        stringBuilder.append(Arrays.toString(this.c.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
