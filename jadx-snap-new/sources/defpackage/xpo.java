package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.adjm.a;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: xpo */
public final class xpo implements adjm {
    private final ajxe a;
    private final xpn b;
    private final xhm c;

    /* renamed from: xpo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xpo$b */
    static final class b extends akcs implements akbk<xpt> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xpt) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xpo.class), "newportMetadataReaderWriter", "getNewportMetadataReaderWriter()Lcom/snap/spectacles/lib/main/newport/NewportMetadataReaderWriter;");
        a aVar = new a();
    }

    public xpo(ajwy<xpt> ajwy, xpn xpn, xhm xhm) {
        akcr.b(ajwy, "newportMetadataReaderWriterLazy");
        akcr.b(xpn, "newportLutCache");
        akcr.b(xhm, "spectaclesUuidUtils");
        this.b = xpn;
        this.c = xhm;
        this.a = ajxh.a(new b(ajwy));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0105 in {5, 8, 9, 18, 19, 20, 21, 24, 27, 28, 31} preds:[]
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
    private final defpackage.adjn a(byte[] r18, defpackage.xdg r19, boolean r20, java.lang.String r21) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r18;
        r2 = r19;
        r3 = r20;
        r4 = r21;
        r5 = new adjn;
        r6 = 0;
        r5.<init>(r6, r6);
        r7 = "calibration";
        r8 = "prefix";
        defpackage.akcr.b(r7, r8);
        r8 = ".clb";
        r7 = java.io.File.createTempFile(r7, r8, r6);
        r8 = "File.createTempFile(prefix, suffix, directory)";
        defpackage.akcr.a(r7, r8);
        r8 = r0.length;
        r9 = 0;
        r6 = defpackage.akkz.a(r7, r9);	 Catch:{ all -> 0x0100 }
        r6.write(r0, r9, r8);	 Catch:{ all -> 0x0100 }
        r6.close();	 Catch:{ all -> 0x0100 }
        defpackage.aklc.a(r6);
        r0 = new com.snapchat.labscv.DepthSystem;
        r11 = r3 ^ 1;
        r12 = 0;
        r14 = r7.getPath();
        r13 = "";
        r15 = "";
        r10 = r0;
        r10.<init>(r11, r12, r13, r14, r15);
        r6 = new org.opencv.core.Mat;
        r6.<init>();
        r8 = new org.opencv.core.Mat;
        r8.<init>();
        r10 = new org.opencv.core.Mat;
        r10.<init>();
        r11 = new org.opencv.core.Mat;
        r11.<init>();
        r0.extractLut(r6, r8, r10, r11);
        r7.delete();
        r7 = defpackage.xdg.RIGHT;
        if (r2 != r7) goto L_0x0061;
        r6 = r8;
        r7 = defpackage.xdg.RIGHT;
        if (r2 != r7) goto L_0x0066;
        goto L_0x0067;
        r11 = r10;
        r7 = r6.total();
        r10 = r6.channels();
        r12 = (long) r10;
        r7 = r7 * r12;
        r12 = r11.total();
        r10 = r11.channels();
        r14 = (long) r10;
        r12 = r12 * r14;
        r14 = 0;
        r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1));
        if (r10 <= 0) goto L_0x00e1;
        r5 = (int) r7;
        r7 = new float[r5];
        r6.get(r9, r9, r7);
        r6 = 1;
        r5 = r5 << r6;
        r5 = java.nio.ByteBuffer.allocate(r5);
        r5 = r5.array();
        r8 = r7.length;
        r10 = 0;
        r14 = 0;
        r15 = 0;
        if (r10 >= r8) goto L_0x00d0;
        r9 = r7[r10];
        r6 = 0;
        r6 = java.lang.Math.max(r9, r6);
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = java.lang.Math.min(r6, r9);
        r9 = 1;
        if (r14 != r9) goto L_0x00b4;
        r9 = defpackage.xdg.RIGHT;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r2 != r9) goto L_0x00b2;
        r6 = r6 * r16;
        r6 = r6 + r16;
        goto L_0x00b4;
        r6 = r6 * r16;
        r14 = r14 ^ 1;
        r9 = 1199570688; // 0x477fff00 float:65535.0 double:5.926666667E-315;
        r6 = r6 * r9;
        r6 = (int) r6;
        r9 = r15 + 1;
        r16 = r7;
        r7 = (byte) r6;
        r5[r15] = r7;
        r15 = r9 + 1;
        r6 = r6 >> 8;
        r6 = (byte) r6;
        r5[r9] = r6;
        r10 = r10 + 1;
        r7 = r16;
        r6 = 1;
        r9 = 0;
        goto L_0x0095;
        r6 = (int) r12;
        r6 = new float[r6];
        r7 = 0;
        r11.get(r7, r7, r6);
        r7 = new adjn;
        r5 = java.nio.ByteBuffer.wrap(r5);
        r7.<init>(r5, r6);
        r5 = r7;
        r0.release();
        r0 = r5.a;
        if (r0 == 0) goto L_0x00f6;
        r6 = r1.b;
        r0 = r0.array();
        r7 = "byteBuffer.array()";
        defpackage.akcr.a(r0, r7);
        r6.a(r4, r2, r0, r3);
        r0 = r5.b;
        if (r0 == 0) goto L_0x00ff;
        r6 = r1.b;
        r6.a(r4, r2, r0, r3);
        return r5;
        r0 = move-exception;
        defpackage.aklc.a(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpo.a(byte[], xdg, boolean, java.lang.String):adjn");
    }

    private final xpt a() {
        return (xpt) this.a.b();
    }

    public final adjn a(String str, String str2, boolean z, a aVar) {
        xpq b;
        xdg xdg;
        akcr.b(str, MessageMediaRefModel.URI);
        akcr.b(str2, "mediaId");
        akcr.b(aVar, "lutType");
        str2 = "Uri.parse(uri)";
        Object parse;
        if (z) {
            a();
            parse = Uri.parse(str);
            akcr.a(parse, str2);
            b = xpt.b(new File(parse.getPath()));
            if (b == null) {
                throw new ajxt("null cannot be cast to non-null type com.snap.spectacles.lib.main.newport.NewportMetadataParseResult");
            }
        }
        a();
        parse = Uri.parse(str);
        akcr.a(parse, str2);
        b = xpt.a(new File(parse.getPath()));
        xps xps = (xps) b;
        String str3 = "deviceId";
        str2 = xps.c != null ? xhm.b(xps.c) : str3;
        int i = xpp.a[aVar.ordinal()];
        if (i == 1) {
            xdg = xps.a;
        } else if (i == 2) {
            xdg = xdg.LEFT;
        } else if (i == 3) {
            xdg = xdg.RIGHT;
        } else {
            throw new ajxk();
        }
        xpn xpn = this.b;
        akcr.a((Object) str2, str3);
        if (xpn.a(str2, xdg, z, xjh.LUT) && this.b.a(str2, xdg, z, xjh.ALIGNMENT_MATRIX)) {
            return new adjn(ByteBuffer.wrap(this.b.a(str2, xdg, z)), this.b.b(str2, xdg, z));
        }
        byte[] bArr = xps.b;
        return bArr != null ? a(bArr, xdg, z, str2) : new adjn(null, null);
    }
}
