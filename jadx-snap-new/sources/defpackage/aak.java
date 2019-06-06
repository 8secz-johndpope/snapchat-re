package defpackage;

import defpackage.jf.a;
import java.util.List;

/* renamed from: aak */
public final class aak<DataType, ResourceType, Transcode> {
    final afa<ResourceType, Transcode> a;
    private final Class<DataType> b;
    private final List<? extends zg<DataType, ResourceType>> c;
    private final a<List<Throwable>> d;
    private final String e;

    /* renamed from: aak$a */
    interface a<ResourceType> {
        aax<ResourceType> a(aax<ResourceType> aax);
    }

    public aak(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends zg<DataType, ResourceType>> list, afa<ResourceType, Transcode> afa, a<List<Throwable>> aVar) {
        this.b = cls;
        this.c = list;
        this.a = afa;
        this.d = aVar;
        StringBuilder stringBuilder = new StringBuilder("Failed DecodePath{");
        stringBuilder.append(cls.getSimpleName());
        String str = "->";
        stringBuilder.append(str);
        stringBuilder.append(cls2.getSimpleName());
        stringBuilder.append(str);
        stringBuilder.append(cls3.getSimpleName());
        stringBuilder.append("}");
        this.e = stringBuilder.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0058 in {7, 9, 11, 12, 15, 16, 18, 20, 22} preds:[]
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
    private defpackage.aax<ResourceType> a(defpackage.zn<DataType> r8, int r9, int r10, defpackage.zf r11, java.util.List<java.lang.Throwable> r12) {
        /*
        r7 = this;
        r0 = r7.c;
        r0 = r0.size();
        r1 = 0;
        r2 = 0;
        if (r2 >= r0) goto L_0x0048;
        r3 = r7.c;
        r3 = r3.get(r2);
        r3 = (defpackage.zg) r3;
        r4 = r8.a();	 Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027, OutOfMemoryError -> 0x0025 }
        r4 = r3.a(r4, r11);	 Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027, OutOfMemoryError -> 0x0025 }
        if (r4 == 0) goto L_0x0043;	 Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027, OutOfMemoryError -> 0x0025 }
        r4 = r8.a();	 Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027, OutOfMemoryError -> 0x0025 }
        r1 = r3.a(r4, r9, r10, r11);	 Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027, OutOfMemoryError -> 0x0025 }
        goto L_0x0043;
        r4 = move-exception;
        goto L_0x002a;
        r4 = move-exception;
        goto L_0x002a;
        r4 = move-exception;
        r5 = 2;
        r6 = "DecodePath";
        r5 = android.util.Log.isLoggable(r6, r5);
        if (r5 == 0) goto L_0x0040;
        r3 = java.lang.String.valueOf(r3);
        r5 = "Failed to decode data for ";
        r3 = r5.concat(r3);
        android.util.Log.v(r6, r3, r4);
        r12.add(r4);
        if (r1 != 0) goto L_0x0048;
        r2 = r2 + 1;
        goto L_0x0008;
        if (r1 == 0) goto L_0x004b;
        return r1;
        r8 = new aas;
        r9 = r7.e;
        r10 = new java.util.ArrayList;
        r10.<init>(r12);
        r8.<init>(r9, r10);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aak.a(zn, int, int, zf, java.util.List):aax");
    }

    /* Access modifiers changed, original: final */
    public final aax<ResourceType> a(zn<DataType> znVar, int i, int i2, zf zfVar) {
        List list = (List) ahl.a(this.d.a(), "Argument must not be null");
        try {
            aax<ResourceType> a = a(znVar, i, i2, zfVar, list);
            return a;
        } finally {
            this.d.a(list);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecodePath{ dataClass=");
        stringBuilder.append(this.b);
        stringBuilder.append(", decoders=");
        stringBuilder.append(this.c);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
