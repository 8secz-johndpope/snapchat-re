package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    static Map<List<a>, SoftReference<long[]>> cache = new WeakHashMap();
    List<a> entries = Collections.emptyList();

    public static class a {
        public long a;
        public long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{count=");
            stringBuilder.append(this.a);
            stringBuilder.append(", delta=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TimeToSampleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TimeToSampleBox.java", TimeToSampleBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0066 in {8, 19, 24, 25, 27, 30} preds:[]
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
    public static synchronized long[] blowupTimeToSamples(java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.a> r12) {
        /*
        r0 = com.coremedia.iso.boxes.TimeToSampleBox.class;
        monitor-enter(r0);
        r1 = cache;	 Catch:{ all -> 0x0063 }
        r1 = r1.get(r12);	 Catch:{ all -> 0x0063 }
        r1 = (java.lang.ref.SoftReference) r1;	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x0063 }
        r1 = r1.get();	 Catch:{ all -> 0x0063 }
        r1 = (long[]) r1;	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0017;
        monitor-exit(r0);
        return r1;
        r1 = 0;
        r3 = r12.iterator();	 Catch:{ all -> 0x0063 }
        r4 = r3.hasNext();	 Catch:{ all -> 0x0063 }
        if (r4 != 0) goto L_0x0059;	 Catch:{ all -> 0x0063 }
        r2 = (int) r1;	 Catch:{ all -> 0x0063 }
        r1 = new long[r2];	 Catch:{ all -> 0x0063 }
        r2 = r12.iterator();	 Catch:{ all -> 0x0063 }
        r3 = 0;	 Catch:{ all -> 0x0063 }
        r4 = 0;	 Catch:{ all -> 0x0063 }
        r5 = r2.hasNext();	 Catch:{ all -> 0x0063 }
        if (r5 != 0) goto L_0x003e;	 Catch:{ all -> 0x0063 }
        r2 = cache;	 Catch:{ all -> 0x0063 }
        r3 = new java.lang.ref.SoftReference;	 Catch:{ all -> 0x0063 }
        r3.<init>(r1);	 Catch:{ all -> 0x0063 }
        r2.put(r12, r3);	 Catch:{ all -> 0x0063 }
        monitor-exit(r0);
        return r1;
        r5 = r2.next();	 Catch:{ all -> 0x0063 }
        r5 = (com.coremedia.iso.boxes.TimeToSampleBox.a) r5;	 Catch:{ all -> 0x0063 }
        r6 = r4;	 Catch:{ all -> 0x0063 }
        r4 = 0;	 Catch:{ all -> 0x0063 }
        r7 = (long) r4;	 Catch:{ all -> 0x0063 }
        r9 = r5.a;	 Catch:{ all -> 0x0063 }
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));	 Catch:{ all -> 0x0063 }
        if (r11 < 0) goto L_0x004f;	 Catch:{ all -> 0x0063 }
        r4 = r6;	 Catch:{ all -> 0x0063 }
        goto L_0x002c;	 Catch:{ all -> 0x0063 }
        r7 = r6 + 1;	 Catch:{ all -> 0x0063 }
        r8 = r5.b;	 Catch:{ all -> 0x0063 }
        r1[r6] = r8;	 Catch:{ all -> 0x0063 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0063 }
        r6 = r7;	 Catch:{ all -> 0x0063 }
        goto L_0x0046;	 Catch:{ all -> 0x0063 }
        r4 = r3.next();	 Catch:{ all -> 0x0063 }
        r4 = (com.coremedia.iso.boxes.TimeToSampleBox.a) r4;	 Catch:{ all -> 0x0063 }
        r4 = r4.a;	 Catch:{ all -> 0x0063 }
        r1 = r1 + r4;
        goto L_0x001d;
        r12 = move-exception;
        monitor-exit(r0);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coremedia.iso.boxes.TimeToSampleBox.blowupTimeToSamples(java.util.List):long[]");
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = ces.a(aqi.a(byteBuffer));
        this.entries = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.entries.add(new a(aqi.a(byteBuffer), aqi.a(byteBuffer)));
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.entries.size());
        for (a aVar : this.entries) {
            aqk.b(byteBuffer, aVar.a);
            aqk.b(byteBuffer, aVar.b);
        }
    }

    public long getContentSize() {
        return (long) ((this.entries.size() << 3) + 8);
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TimeToSampleBox[entryCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
