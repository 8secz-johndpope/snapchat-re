package defpackage;

import com.google.common.io.BaseEncoding;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.nano.Any;
import com.google.protobuf.nano.Empty;
import com.google.protobuf.nano.MessageNano;
import defpackage.alqk.a;
import defpackage.alqk.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: pun */
public final class pun extends ptp implements puj {
    @SerializedName("parameterPackage")
    public final pse a;
    public final aesg d;
    public final String e;
    public final String f;
    public final String g;
    public final gcp h;
    public final b i;

    /* renamed from: pun$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:165:0x03ee in {28, 29, 32, 33, 34, 37, 40, 41, 42, 45, 46, 49, 50, 53, 54, 57, 60, 63, 66, 69, 70, 73, 74, 81, 82, 91, 93, 94, 95, 96, 99, 102, 103, 106, 107, 108, 109, 110, 115, 116, 120, 125, 127, 128, 129, 135, 137, 138, 139, 147, 149, 150, 152, 153, 154, 155, 156, 158, 162, 163, 164} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static defpackage.pun a(byte[] r50) {
            /*
            r0 = "media.encryptionInfo";
            r1 = "legacyMultisnap.bundleId";
            r2 = "bytes";
            r3 = r50;
            defpackage.akcr.b(r3, r2);
            r2 = defpackage.alqm.a(r50);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.b;	 Catch:{ Exception -> 0x03e8 }
            r4 = "snapDoc.envelope";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r4);	 Catch:{ Exception -> 0x03e8 }
            r4 = r2.length;	 Catch:{ Exception -> 0x03e8 }
            r7 = 0;	 Catch:{ Exception -> 0x03e8 }
            r8 = 0;	 Catch:{ Exception -> 0x03e8 }
            r9 = 0;	 Catch:{ Exception -> 0x03e8 }
            r10 = 0;	 Catch:{ Exception -> 0x03e8 }
            r12 = 0;	 Catch:{ Exception -> 0x03e8 }
            r13 = 0;	 Catch:{ Exception -> 0x03e8 }
            r14 = 0;	 Catch:{ Exception -> 0x03e8 }
            r15 = 0;	 Catch:{ Exception -> 0x03e8 }
            r16 = 0;	 Catch:{ Exception -> 0x03e8 }
            r17 = 0;	 Catch:{ Exception -> 0x03e8 }
            r18 = 0;	 Catch:{ Exception -> 0x03e8 }
            r19 = 0;	 Catch:{ Exception -> 0x03e8 }
            r20 = 0;	 Catch:{ Exception -> 0x03e8 }
            r21 = 0;	 Catch:{ Exception -> 0x03e8 }
            r22 = 0;	 Catch:{ Exception -> 0x03e8 }
            r23 = 0;	 Catch:{ Exception -> 0x03e8 }
            r24 = 0;	 Catch:{ Exception -> 0x03e8 }
            r27 = 0;	 Catch:{ Exception -> 0x03e8 }
            r28 = 0;	 Catch:{ Exception -> 0x03e8 }
            r29 = 0;	 Catch:{ Exception -> 0x03e8 }
            r30 = 0;	 Catch:{ Exception -> 0x03e8 }
            r32 = 0;	 Catch:{ Exception -> 0x03e8 }
            r33 = 0;	 Catch:{ Exception -> 0x03e8 }
            r5 = 1;	 Catch:{ Exception -> 0x03e8 }
            if (r7 >= r4) goto L_0x0362;	 Catch:{ Exception -> 0x03e8 }
            r6 = r2[r7];	 Catch:{ Exception -> 0x03e8 }
            r31 = r6.b();	 Catch:{ Exception -> 0x03e8 }
            if (r31 == 0) goto L_0x034c;	 Catch:{ Exception -> 0x03e8 }
            r11 = "component";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r6, r11);	 Catch:{ Exception -> 0x03e8 }
            r11 = r6.c();	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x0285;	 Catch:{ Exception -> 0x03e8 }
            r5 = 2;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x024d;	 Catch:{ Exception -> 0x03e8 }
            r5 = 4;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x0218;	 Catch:{ Exception -> 0x03e8 }
            r5 = 5;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x01ed;	 Catch:{ Exception -> 0x03e8 }
            r5 = 6;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x01d0;	 Catch:{ Exception -> 0x03e8 }
            r5 = 7;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x01a9;	 Catch:{ Exception -> 0x03e8 }
            r5 = 31;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x017f;	 Catch:{ Exception -> 0x03e8 }
            r5 = 41;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x015e;	 Catch:{ Exception -> 0x03e8 }
            r5 = 37;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x010c;	 Catch:{ Exception -> 0x03e8 }
            r5 = 38;	 Catch:{ Exception -> 0x03e8 }
            if (r11 == r5) goto L_0x00f8;	 Catch:{ Exception -> 0x03e8 }
            switch(r11) {
                case 33: goto L_0x00b2;
                case 34: goto L_0x0090;
                case 35: goto L_0x0077;
                default: goto L_0x0075;
            };	 Catch:{ Exception -> 0x03e8 }
            goto L_0x034c;	 Catch:{ Exception -> 0x03e8 }
            r5 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.alqd.a(r5);	 Catch:{ Exception -> 0x03e8 }
            r6 = "snapchat.snapdoc.nano.Ca…component.componentBytes)";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r5, r6);	 Catch:{ Exception -> 0x03e8 }
            r5 = r5.a();	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r20 = r5;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0358;	 Catch:{ Exception -> 0x03e8 }
            r5 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.alqp.a(r5);	 Catch:{ Exception -> 0x03e8 }
            r6 = r5.b();	 Catch:{ Exception -> 0x03e8 }
            if (r6 == 0) goto L_0x034c;	 Catch:{ Exception -> 0x03e8 }
            r6 = "spectacles";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r5, r6);	 Catch:{ Exception -> 0x03e8 }
            r5 = r5.a();	 Catch:{ Exception -> 0x03e8 }
            r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r10 = r5;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0358;	 Catch:{ Exception -> 0x03e8 }
            r5 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.alqj.a(r5);	 Catch:{ Exception -> 0x03e8 }
            r6 = new pun$b;	 Catch:{ Exception -> 0x03e8 }
            r11 = new java.util.UUID;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r2 = r5.a;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r1);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r4 = r5.a;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r4, r1);	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r14 = r4.b();	 Catch:{ Exception -> 0x03e8 }
            r11.<init>(r2, r14);	 Catch:{ Exception -> 0x03e8 }
            r2 = r11.toString();	 Catch:{ Exception -> 0x03e8 }
            r3 = "java.util.UUID(legacyMul…dleId.lowBits).toString()";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r3 = "legacyMultisnap";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r5, r3);	 Catch:{ Exception -> 0x03e8 }
            r3 = r5.a();	 Catch:{ Exception -> 0x03e8 }
            r4 = r5.b();	 Catch:{ Exception -> 0x03e8 }
            r6.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x03e8 }
            r33 = r6;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqi.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r18 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r3 = "component.componentBytes";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.pun.a.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = new prm;	 Catch:{ Exception -> 0x03e8 }
            r4 = r2.e;	 Catch:{ Exception -> 0x03e8 }
            if (r4 != 0) goto L_0x012a;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a();	 Catch:{ Exception -> 0x03e8 }
            r5 = r2.h;	 Catch:{ Exception -> 0x03e8 }
            if (r5 != 0) goto L_0x0131;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a();	 Catch:{ Exception -> 0x03e8 }
            r5 = r5.i();	 Catch:{ Exception -> 0x03e8 }
            r39 = r5.name();	 Catch:{ Exception -> 0x03e8 }
            r5 = r2.f;	 Catch:{ Exception -> 0x03e8 }
            r6 = r2.g;	 Catch:{ Exception -> 0x03e8 }
            r42 = 0;	 Catch:{ Exception -> 0x03e8 }
            r43 = 0;	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.d;	 Catch:{ Exception -> 0x03e8 }
            r45 = 0;	 Catch:{ Exception -> 0x03e8 }
            r46 = 0;	 Catch:{ Exception -> 0x03e8 }
            r47 = 0;	 Catch:{ Exception -> 0x03e8 }
            r48 = 0;	 Catch:{ Exception -> 0x03e8 }
            r49 = 1968; // 0x7b0 float:2.758E-42 double:9.723E-321;	 Catch:{ Exception -> 0x03e8 }
            r37 = r3;	 Catch:{ Exception -> 0x03e8 }
            r38 = r4;	 Catch:{ Exception -> 0x03e8 }
            r40 = r5;	 Catch:{ Exception -> 0x03e8 }
            r41 = r6;	 Catch:{ Exception -> 0x03e8 }
            r44 = r2;	 Catch:{ Exception -> 0x03e8 }
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49);	 Catch:{ Exception -> 0x03e8 }
            r32 = r3;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqg.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = "snapchat.snapdoc.nano.Cr…component.componentBytes)";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x03e8 }
            r24 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqf.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = "creativeKit";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.b();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x019b;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x019d;	 Catch:{ Exception -> 0x03e8 }
            r3 = r22;	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            if (r2 == 0) goto L_0x01a5;	 Catch:{ Exception -> 0x03e8 }
            r23 = r2;	 Catch:{ Exception -> 0x03e8 }
            r22 = r3;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqo.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            if (r2 == 0) goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r3 = com.google.common.io.BaseEncoding.base64();	 Catch:{ Exception -> 0x03e8 }
            r2 = (com.google.protobuf.nano.MessageNano) r2;	 Catch:{ Exception -> 0x03e8 }
            r2 = com.google.protobuf.nano.MessageNano.toByteArray(r2);	 Catch:{ Exception -> 0x03e8 }
            r2 = r3.encode(r2);	 Catch:{ Exception -> 0x03e8 }
            r15 = r2;	 Catch:{ Exception -> 0x03e8 }
            r14 = r35;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0358;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqc.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = "snapchat.snapdoc.nano.At…component.componentBytes)";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r17 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqe.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0205;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            r16 = r3;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.b();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r3 = "context";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r19 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqr.b(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.b();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0245;	 Catch:{ Exception -> 0x03e8 }
            r3 = "unlockables";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r4 = "unlockables.encryptedGeoData";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r3, r4);	 Catch:{ Exception -> 0x03e8 }
            r4 = defpackage.akfp.a;	 Catch:{ Exception -> 0x03e8 }
            r14 = new java.lang.String;	 Catch:{ Exception -> 0x03e8 }
            r14.<init>(r3, r4);	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            if (r2 == 0) goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r21 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqh.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0268;	 Catch:{ Exception -> 0x03e8 }
            r2 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x03e8 }
            r12 = r2;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.b();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0282;	 Catch:{ Exception -> 0x03e8 }
            r3 = "duration";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.c();	 Catch:{ Exception -> 0x03e8 }
            r2 = (double) r2;	 Catch:{ Exception -> 0x03e8 }
            r2 = java.lang.Double.valueOf(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x03e8 }
            r13 = r2;	 Catch:{ Exception -> 0x03e8 }
            r12 = r3;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r2 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0265;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r2 = r6.d();	 Catch:{ Exception -> 0x03e8 }
            r2 = defpackage.alqk.a(r2);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.c();	 Catch:{ Exception -> 0x03e8 }
            r4 = "media";
            if (r3 == 0) goto L_0x02f1;
            defpackage.akcr.a(r2, r4);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.d();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x02ad;	 Catch:{ Exception -> 0x03e8 }
            r6 = r3.a();	 Catch:{ Exception -> 0x03e8 }
            r28 = r6;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x02af;	 Catch:{ Exception -> 0x03e8 }
            r28 = 0;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.d();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x02ef;	 Catch:{ Exception -> 0x03e8 }
            r3 = r3.a;	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x02ef;	 Catch:{ Exception -> 0x03e8 }
            r6 = new aesg;	 Catch:{ Exception -> 0x03e8 }
            r6.<init>();	 Catch:{ Exception -> 0x03e8 }
            r5 = r3.c();	 Catch:{ Exception -> 0x03e8 }
            if (r5 == 0) goto L_0x02d1;	 Catch:{ Exception -> 0x03e8 }
            r11 = 1;	 Catch:{ Exception -> 0x03e8 }
            if (r5 == r11) goto L_0x02ce;	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.affr.UNRECOGNIZED_VALUE;	 Catch:{ Exception -> 0x03e8 }
            r5 = r5.a();	 Catch:{ Exception -> 0x03e8 }
            goto L_0x02d4;	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.affr.S3;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x02c9;	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.affr.GCS;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x02c9;	 Catch:{ Exception -> 0x03e8 }
            r6.c = r5;	 Catch:{ Exception -> 0x03e8 }
            r5 = r3.d();	 Catch:{ Exception -> 0x03e8 }
            r6.d = r5;	 Catch:{ Exception -> 0x03e8 }
            r14 = r3.b();	 Catch:{ Exception -> 0x03e8 }
            r5 = java.lang.Long.valueOf(r14);	 Catch:{ Exception -> 0x03e8 }
            r6.b = r5;	 Catch:{ Exception -> 0x03e8 }
            r3 = r3.a();	 Catch:{ Exception -> 0x03e8 }
            r6.a = r3;	 Catch:{ Exception -> 0x03e8 }
            r27 = r6;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x02f1;	 Catch:{ Exception -> 0x03e8 }
            r27 = 0;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.b();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0302;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r4);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a();	 Catch:{ Exception -> 0x03e8 }
            r8 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0331;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r3, r0);	 Catch:{ Exception -> 0x03e8 }
            r3 = r3.a();	 Catch:{ Exception -> 0x03e8 }
            r5 = "media.encryptionInfo.key";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r3, r5);	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.akfp.a;	 Catch:{ Exception -> 0x03e8 }
            r6 = new java.lang.String;	 Catch:{ Exception -> 0x03e8 }
            r6.<init>(r3, r5);	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.a;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r3, r0);	 Catch:{ Exception -> 0x03e8 }
            r3 = r3.b();	 Catch:{ Exception -> 0x03e8 }
            r5 = "media.encryptionInfo.iv";	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r3, r5);	 Catch:{ Exception -> 0x03e8 }
            r5 = defpackage.akfp.a;	 Catch:{ Exception -> 0x03e8 }
            r11 = new java.lang.String;	 Catch:{ Exception -> 0x03e8 }
            r11.<init>(r3, r5);	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0335;	 Catch:{ Exception -> 0x03e8 }
            r6 = r29;	 Catch:{ Exception -> 0x03e8 }
            r11 = r30;	 Catch:{ Exception -> 0x03e8 }
            r3 = r2.f();	 Catch:{ Exception -> 0x03e8 }
            if (r3 == 0) goto L_0x0347;	 Catch:{ Exception -> 0x03e8 }
            defpackage.akcr.a(r2, r4);	 Catch:{ Exception -> 0x03e8 }
            r2 = r2.e();	 Catch:{ Exception -> 0x03e8 }
            r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x03e8 }
            r9 = r2;	 Catch:{ Exception -> 0x03e8 }
            r29 = r6;	 Catch:{ Exception -> 0x03e8 }
            r30 = r11;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0354;	 Catch:{ Exception -> 0x03e8 }
            r31 = r2;	 Catch:{ Exception -> 0x03e8 }
            r34 = r4;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            r14 = r35;	 Catch:{ Exception -> 0x03e8 }
            r15 = r36;	 Catch:{ Exception -> 0x03e8 }
            r7 = r7 + 1;	 Catch:{ Exception -> 0x03e8 }
            r3 = r50;	 Catch:{ Exception -> 0x03e8 }
            r2 = r31;	 Catch:{ Exception -> 0x03e8 }
            r4 = r34;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x003d;	 Catch:{ Exception -> 0x03e8 }
            r35 = r14;	 Catch:{ Exception -> 0x03e8 }
            r36 = r15;	 Catch:{ Exception -> 0x03e8 }
            if (r8 == 0) goto L_0x03d1;	 Catch:{ Exception -> 0x03e8 }
            r8 = (java.lang.Number) r8;	 Catch:{ Exception -> 0x03e8 }
            r0 = r8.intValue();	 Catch:{ Exception -> 0x03e8 }
            if (r9 == 0) goto L_0x0375;	 Catch:{ Exception -> 0x03e8 }
            r5 = r9.booleanValue();	 Catch:{ Exception -> 0x03e8 }
            goto L_0x0376;	 Catch:{ Exception -> 0x03e8 }
            r5 = 0;	 Catch:{ Exception -> 0x03e8 }
            if (r10 == 0) goto L_0x03ae;	 Catch:{ Exception -> 0x03e8 }
            r1 = r10.intValue();	 Catch:{ Exception -> 0x03e8 }
            if (r1 != 0) goto L_0x037f;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03ae;	 Catch:{ Exception -> 0x03e8 }
            r1 = r10.intValue();	 Catch:{ Exception -> 0x03e8 }
            r2 = 1;	 Catch:{ Exception -> 0x03e8 }
            if (r1 != r2) goto L_0x0396;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == 0) goto L_0x0393;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == r2) goto L_0x038b;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03b9;	 Catch:{ Exception -> 0x03e8 }
            if (r5 == 0) goto L_0x0390;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.LAGUNAHD_SOUND;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.LAGUNAHD_NO_SOUND;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.PSYCHOMANTIS;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r1 = r10.intValue();	 Catch:{ Exception -> 0x03e8 }
            r2 = 2;	 Catch:{ Exception -> 0x03e8 }
            if (r1 != r2) goto L_0x03b9;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == 0) goto L_0x03ab;	 Catch:{ Exception -> 0x03e8 }
            r1 = 1;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == r1) goto L_0x03a3;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03b9;	 Catch:{ Exception -> 0x03e8 }
            if (r5 == 0) goto L_0x03a8;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.MALIBU_SOUND;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.MALIBU_NO_SOUND;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.SCREAMINGMANTIS;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == 0) goto L_0x03cb;	 Catch:{ Exception -> 0x03e8 }
            r1 = 1;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == r1) goto L_0x03c3;	 Catch:{ Exception -> 0x03e8 }
            r1 = 2;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == r1) goto L_0x03c0;	 Catch:{ Exception -> 0x03e8 }
            r1 = 3;	 Catch:{ Exception -> 0x03e8 }
            if (r0 == r1) goto L_0x03bd;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.UNKNOWN;	 Catch:{ Exception -> 0x03e8 }
            r6 = r0;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03ce;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.AUDIO;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.GIF;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            if (r5 == 0) goto L_0x03c8;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.VIDEO;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.VIDEO_NO_SOUND;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r0 = defpackage.gcp.IMAGE;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03bb;	 Catch:{ Exception -> 0x03e8 }
            r31 = r6;	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03d3;	 Catch:{ Exception -> 0x03e8 }
            r31 = 0;	 Catch:{ Exception -> 0x03e8 }
            r0 = new pun;	 Catch:{ Exception -> 0x03e8 }
            r26 = new pse;	 Catch:{ Exception -> 0x03e8 }
            r11 = r26;	 Catch:{ Exception -> 0x03e8 }
            r14 = r35;	 Catch:{ Exception -> 0x03e8 }
            r15 = r36;	 Catch:{ Exception -> 0x03e8 }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ Exception -> 0x03e8 }
            r25 = r0;	 Catch:{ Exception -> 0x03e8 }
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33);	 Catch:{ Exception -> 0x03e8 }
            goto L_0x03ec;
            r0 = move-exception;
            goto L_0x03ed;
        L_0x03e8:
            r0 = defpackage.pun.a.b(r50);	 Catch:{ all -> 0x03e6 }
            return r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pun$a.a(byte[]):pun");
        }

        private static pun b(byte[] bArr) {
            String str = "media.encryptionInfo";
            Object o;
            try {
                String str2;
                alsb a;
                Object b = adrs.b(bArr);
                akcr.a(b, "content");
                adsd[] adsdArr = adsc.a(b.a()).a;
                akcr.a((Object) adsdArr, "snap.components");
                int length = adsdArr.length;
                int i = 0;
                String str3 = null;
                Boolean bool = null;
                Double d = null;
                String str4 = null;
                String str5 = null;
                aldz aldz = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                aesg aesg = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                gcp gcp = null;
                while (i < length) {
                    String str14;
                    adsd[] adsdArr2;
                    Object obj = adsdArr[i];
                    String str15 = "snapComponent";
                    Object c;
                    String str16;
                    if (obj.b()) {
                        Boolean bool2;
                        akcr.a(obj, str15);
                        if (obj.c().a()) {
                            bool2 = Boolean.TRUE;
                        } else if (obj.c().b()) {
                            c = obj.c();
                            akcr.a(c, "snapComponent.duration");
                            Double valueOf = Double.valueOf((double) c.c());
                            bool = Boolean.FALSE;
                            str14 = str;
                            adsdArr2 = adsdArr;
                            d = valueOf;
                        } else {
                            bool2 = Boolean.FALSE;
                        }
                        str14 = str;
                        adsdArr2 = adsdArr;
                        bool = bool2;
                    } else if (obj.d()) {
                        Object a2;
                        String str17;
                        akcr.a(obj, str15);
                        c = obj.e();
                        str16 = "unlockables";
                        if (c.b()) {
                            akcr.a(c, str16);
                            a2 = c.a();
                            akcr.a(a2, "unlockables.encryptedGeoData");
                            adsdArr2 = adsdArr;
                            str17 = new String(a2, akfp.a);
                        } else {
                            adsdArr2 = adsdArr;
                            str17 = str4;
                        }
                        if (c.c()) {
                            akcr.a(c, str16);
                            a2 = c.d();
                            akcr.a(a2, "unlockables.lensMetadata");
                            str5 = new String(a2, akfp.a);
                        }
                        if (c.f()) {
                            akcr.a(c, str16);
                            c = c.e();
                            akcr.a(c, "unlockables.unlockablesSnapInfo");
                            str14 = str;
                            str3 = new String(c, akfp.a);
                        } else {
                            str14 = str;
                        }
                        str4 = str17;
                    } else {
                        adsdArr2 = adsdArr;
                        if (obj.f()) {
                            akcr.a(obj, str15);
                            b = obj.g();
                            if (b.b()) {
                                akcr.a(b, "context");
                                str7 = b.a();
                            }
                            Any any = b.a;
                            if (any == null || !any.hasValue()) {
                                str14 = str;
                            } else {
                                aldz a3;
                                try {
                                    b = b.a;
                                    akcr.a(b, "context.contextHint");
                                    a3 = aldz.a(b.getValue());
                                } catch (Exception unused) {
                                    a3 = null;
                                }
                                str14 = str;
                                aldz = a3;
                            }
                        } else if (obj.h()) {
                            akcr.a(obj, str15);
                            b = obj.i();
                            akcr.a(b, "snapComponent.attachments");
                            str14 = str;
                            str6 = b.a();
                        } else if (obj.j()) {
                            akcr.a(obj, str15);
                            b = obj.k();
                            String str18 = "media";
                            if (b.d()) {
                                akcr.a(b, str18);
                                str11 = b.e();
                            }
                            if (b.c()) {
                                akcr.a(b, str18);
                                gcp = gcr.a(Integer.valueOf(b.b()), b.f());
                            }
                            if (b.a != null) {
                                c = b.a;
                                akcr.a(c, str);
                                c = c.a();
                                akcr.a(c, "media.encryptionInfo.key");
                                str16 = new String(c, akfp.a);
                                c = b.a;
                                akcr.a(c, str);
                                c = c.b();
                                akcr.a(c, "media.encryptionInfo.iv");
                                str14 = str;
                                str = new String(c, akfp.a);
                            } else {
                                str14 = str;
                                str16 = str12;
                                str = str13;
                            }
                            defpackage.adrb.a aVar = b.b;
                            if (aVar != null) {
                                affr affr;
                                aesg aesg2 = new aesg();
                                int c2 = aVar.c();
                                if (c2 != 0) {
                                    str12 = str;
                                    affr = c2 != 1 ? affr.UNRECOGNIZED_VALUE : affr.S3;
                                } else {
                                    str12 = str;
                                    affr = affr.GCS;
                                }
                                aesg2.c = affr.a();
                                aesg2.d = aVar.d();
                                str2 = str8;
                                str18 = str16;
                                aesg2.b = Long.valueOf((long) aVar.b());
                                aesg2.a = aVar.a();
                                aesg = aesg2;
                                str13 = str12;
                                str8 = str2;
                            } else {
                                str2 = str8;
                                str18 = str16;
                                str13 = str;
                            }
                            str12 = str18;
                        } else {
                            str14 = str;
                            str2 = str8;
                            if (obj.l()) {
                                akcr.a(obj, str15);
                                adrx m = obj.m();
                                if (m != null) {
                                    String[] strArr = m.a;
                                    if (strArr != null) {
                                        str15 = (String) ajyi.d(strArr);
                                        str8 = str15;
                                    }
                                }
                                str15 = null;
                                str8 = str15;
                            } else {
                                if (obj.n()) {
                                    akcr.a(obj, str15);
                                    o = obj.o();
                                    str15 = "creativeKitSourceApp";
                                    if (o.d()) {
                                        akcr.a(o, str15);
                                        str9 = o.c();
                                    }
                                    if (o.b()) {
                                        akcr.a(o, str15);
                                        str10 = o.a();
                                    }
                                }
                                str8 = str2;
                            }
                        }
                    }
                    i++;
                    adsdArr = adsdArr2;
                    str = str14;
                }
                str2 = str8;
                if (str3 != null) {
                    zrn zrn = new zrn();
                    a = zrn.a(str3);
                } else {
                    a = null;
                }
                return new pun(new pse(bool, d, str4, str5, aldz, str6, null, str7, str2, a, str9, str10, null), aesg, str11, str12, str13, gcp, null, 192);
            } catch (Exception unused2) {
                o = iha.a().a(new String(bArr, akfp.a), pun.class);
                if (o == null) {
                    akcr.a();
                }
                return (pun) o;
            }
        }
    }

    /* renamed from: pun$b */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;

        /* renamed from: pun$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static b a(String str, Integer num, Integer num2) {
                if (str == null && num == null && num2 == null) {
                    return null;
                }
                if (str != null && num != null && num2 != null) {
                    return new b(str, num.intValue(), num2.intValue());
                }
                throw new IllegalArgumentException("sessionId, segmentIndex, and segmentCount should be all null or all non-null");
            }
        }

        static {
            a aVar = new a();
        }

        /* JADX WARNING: Missing block: B:4:0x0021, code skipped:
            if (r2 <= r4) goto L_0x0024;
     */
        public b(java.lang.String r2, int r3, int r4) {
            /*
            r1 = this;
            r0 = "sessionId";
            defpackage.akcr.b(r2, r0);
            r1.<init>();
            r1.a = r2;
            r1.b = r3;
            r1.c = r4;
            r2 = r1.a;
            r2 = (java.lang.CharSequence) r2;
            r2 = defpackage.akgb.a(r2);
            r3 = 1;
            r2 = r2 ^ r3;
            if (r2 == 0) goto L_0x0024;
        L_0x001a:
            r2 = r1.c;
            r4 = r1.b;
            if (r4 >= 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0024;
        L_0x0021:
            if (r2 <= r4) goto L_0x0024;
        L_0x0023:
            goto L_0x0025;
        L_0x0024:
            r3 = 0;
        L_0x0025:
            if (r3 == 0) goto L_0x0028;
        L_0x0027:
            return;
        L_0x0028:
            r2 = new java.lang.StringBuilder;
            r3 = "invalid sessionId segmentIndex segmentCount value for multisnap: sessionId=";
            r2.<init>(r3);
            r3 = r1.a;
            r2.append(r3);
            r3 = "(length=";
            r2.append(r3);
            r3 = r1.a;
            r3 = r3.length();
            r2.append(r3);
            r3 = "), segmentIndex=";
            r2.append(r3);
            r3 = r1.b;
            r2.append(r3);
            r3 = ", segmentCount=";
            r2.append(r3);
            r3 = r1.c;
            r2.append(r3);
            r2 = r2.toString();
            r3 = new java.lang.IllegalStateException;
            r2 = r2.toString();
            r3.<init>(r2);
            r3 = (java.lang.Throwable) r3;
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pun$b.<init>(java.lang.String, int, int):void");
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a)) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.a;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MultiSnapMetadata(sessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", segmentIndex=");
            stringBuilder.append(this.b);
            stringBuilder.append(", segmentCount=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: pun$i */
    static final class i<T, R> implements ajfc<T, R> {
        private /* synthetic */ pun a;
        private /* synthetic */ aipn b;

        i(pun pun, aipn aipn) {
            this.a = pun;
            this.b = aipn;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:210:0x029b in {4, 5, 8, 9, 12, 14, 15, 17, 18, 20, 21, 25, 26, 28, 29, 31, 32, 34, 35, 38, 39, 44, 45, 46, 52, 53, 54, 56, 57, 69, 71, 72, 78, 80, 82, 84, 94, 95, 106, 114, 115, 116, 122, 123, 133, 134, 139, 140, 143, 144, 150, 151, 156, 157, 160, 161, 166, 174, 176, 178, 180, 185, 186, 192, 193, 197, 199, 200, 201, 202, 203, 205, 207, 209} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.pun a(defpackage.odx r36) {
            /*
            r35 = this;
            r1 = r35;
            r0 = "mediaPackageReader";
            r2 = r36;
            defpackage.akcr.b(r2, r0);
            r3 = r36.a();
            r3 = (java.io.Closeable) r3;
            r5 = r3;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r5 = (defpackage.odx) r5;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r6 = r36.c();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r2 = r36.b();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r7 = r2.e;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r7 = r7.u;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r7 == 0) goto L_0x0026;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r7.longValue();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r7 = (int) r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0027;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r7 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = (long) r7;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = defpackage.abqq.a(r9);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r7 = new pse;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x003a;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r11 = r6.q();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r11 = java.lang.Boolean.valueOf(r11);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r12 = r11;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x003b;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r12 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r13 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r11 <= 0) goto L_0x0047;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = java.lang.Double.valueOf(r9);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r13 = r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x004f;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x004e;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = defpackage.abyz.b(r6);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0041;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r13 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x0057;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r6.t();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r14 = r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0058;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r14 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x0060;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r6.m();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r15 = r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0061;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r15 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x006e;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r6.a();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x006e;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r9.g();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x006f;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x0076;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r10 = r6.s();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0077;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r10 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r6 == 0) goto L_0x007e;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r11 = r6.r();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x007f;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r11 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x008a;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r9.k();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = java.lang.Boolean.valueOf(r9);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x008b;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = java.lang.Boolean.TRUE;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = defpackage.akcr.a(r9, r4);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r4 == 0) goto L_0x0095;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = 1;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0096;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4 = defpackage.gcf.a(r4);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = "ContextHintUtils.fromBoo…ue || lensHasContextCard)";	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            defpackage.akcr.a(r4, r9);	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r10;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = (java.util.Collection) r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x00b1;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r9.isEmpty();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x00af;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x00b1;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x00b2;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 1;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x00cb;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r11;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = (java.util.Collection) r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x00c2;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = r9.isEmpty();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 == 0) goto L_0x00c0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x00c2;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x00c3;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = 1;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r9 != 0) goto L_0x00c6;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x00cb;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r26 = r0;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r25 = r3;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            goto L_0x0127;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = new aldx;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9.<init>();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r4.b = r9;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r9 = "null cannot be cast to non-null type kotlin.Array<T>";
            if (r10 == 0) goto L_0x00f8;
            r16 = r10.isEmpty();	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            if (r16 != 0) goto L_0x00f8;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r8 = r4.b;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r10 = (java.util.Collection) r10;	 Catch:{ Throwable -> 0x0292, all -> 0x028f }
            r26 = r0;
            r25 = r3;
            r3 = 0;
            r0 = new java.lang.String[r3];	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r10.toArray(r0);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x00f2;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = (java.lang.String[]) r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r8.b = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x00fc;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = new ajxt;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0.<init>(r9);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            throw r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r26 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r25 = r3;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r11 == 0) goto L_0x0127;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r11.isEmpty();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 != 0) goto L_0x0127;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r4.b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r11 = (java.util.Collection) r11;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r8 = new java.lang.String[r3];	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = r11.toArray(r8);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r3 == 0) goto L_0x0116;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = (java.lang.String[]) r3;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0.a = r3;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0127;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = new ajxt;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0.<init>(r9);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            throw r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = move-exception;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = r25;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0290;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = move-exception;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r4 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = r25;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0294;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.g();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.get(r3);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = (defpackage.abzf) r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r17 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x014d;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r17 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r18 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x016f;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x016f;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.n();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = 1;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 != r3) goto L_0x016f;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.m();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.b();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0188;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.f();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.q();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = 1;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 != r3) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.f();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x018b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.r();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r19 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x018d;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r19 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x01b8;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x01b8;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.c();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x01b8;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r27 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r27 = (java.lang.Iterable) r27;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = " | ";	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r28 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r28 = (java.lang.CharSequence) r28;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r29 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r30 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r31 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r32 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = defpackage.pux.a.a;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r33 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r33 = (defpackage.akbl) r33;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r34 = 30;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = defpackage.ajyu.a(r27, r28, r29, r30, r31, r32, r33, r34);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r20 = r0;
            goto L_0x01ba;
            r20 = 0;
            r0 = r1.b;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r0.get();	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r6 == 0) goto L_0x01d2;
            r0 = r6.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x01d2;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.g();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r0 == 0) goto L_0x01d2;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r0.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x01d3;
            r0 = 0;
            r3 = r2.e;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.w;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r3 == 0) goto L_0x01dc;
            r3 = r3.a;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x01dd;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x01e4;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r8 = r6.f();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x01e5;
            r8 = 0;
            r9 = r2.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r21 = defpackage.zrn.a(r0, r3, r8, r9);	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r0 = r1.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r0 = r0.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r0 == 0) goto L_0x01f6;
            r0 = r0.m;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r22 = r0;
            goto L_0x01f8;
            r22 = 0;
            r0 = r1.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r0 = r0.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r0 == 0) goto L_0x0203;
            r0 = r0.n;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r23 = r0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0205;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r23 = 0;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r6 == 0) goto L_0x0212;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = r6.C();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r24 = r0;
            goto L_0x0214;
            r24 = 0;
            r11 = r7;
            r16 = r4;
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r0 = new pun;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r13 = 0;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r26;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            defpackage.akcr.b(r5, r3);	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r5.b();	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.e;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r4 = defpackage.aesf.VIDEO;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r4 = r4.a();	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r3 != 0) goto L_0x0233;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            goto L_0x0255;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.intValue();	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r3 != r4) goto L_0x0255;
            r3 = r5.c();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r3 == 0) goto L_0x024d;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = r3.y();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r4 = 1;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            if (r3 != r4) goto L_0x024d;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = defpackage.aesf.VIDEO_NO_SOUND;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = r3.a();	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0250;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = defpackage.aesf.VIDEO;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x0248;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            goto L_0x025d;
            r3 = r5.b();	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.e;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r3.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r17 = defpackage.gcp.a.a(r3);	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r14 = r2.d;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r2.f;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r3 == 0) goto L_0x026b;
            r4 = r3.a;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r15 = r4;
            goto L_0x026c;
            r15 = 0;
            r2 = r2.f;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            if (r2 == 0) goto L_0x0275;
            r4 = r2.b;	 Catch:{ Throwable -> 0x0121, all -> 0x011c }
            r16 = r4;
            goto L_0x0277;
            r16 = 0;
            r2 = r1.a;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r2 = r2.i;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r19 = 66;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r11 = r0;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r12 = r7;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r18 = r2;	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ Throwable -> 0x028b, all -> 0x011c }
            r3 = r25;
            r2 = 0;
            defpackage.akax.a(r3, r2);
            return r0;
            r0 = move-exception;
            r3 = r25;
            goto L_0x0293;
            r0 = move-exception;
            r2 = 0;
            goto L_0x0297;
            r0 = move-exception;
            r4 = r0;
            throw r4;	 Catch:{ all -> 0x0295 }
            r0 = move-exception;
            r2 = r4;
            defpackage.akax.a(r3, r2);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pun$i.a(odx):pun");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((odx) obj);
        }
    }

    /* renamed from: pun$c */
    static final class c extends akcs implements akbk<alqe> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new alqe();
        }
    }

    /* renamed from: pun$d */
    static final class d extends akcs implements akbk<alqf> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new alqf();
        }
    }

    /* renamed from: pun$e */
    static final class e extends akcs implements akbk<alqr> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new alqr();
        }
    }

    /* renamed from: pun$f */
    static final class f extends akcs implements akbk<alqg> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new alqg();
        }
    }

    /* renamed from: pun$g */
    static final class g extends akcs implements akbk<a> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a();
        }
    }

    /* renamed from: pun$h */
    static final class h extends akcs implements akbk<alqk> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new alqk();
        }
    }

    static {
        a aVar = new a();
    }

    public pun() {
        this(null, null, null, null, null, null, null, 254);
    }

    public pun(pse pse, aesg aesg, String str, String str2, String str3, gcp gcp, prm prm, b bVar) {
        super(prm);
        this.a = pse;
        this.d = aesg;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = gcp;
        this.i = bVar;
    }

    public final ajdx<puj> a(List<abyi> list, aipn<odu> aipn, idd idd, aipn<zrn> aipn2) {
        akcr.b(list, "mediaPackages");
        akcr.b(aipn, "mediaPackageManager");
        akcr.b(idd, "attribution");
        akcr.b(aipn2, "unlockablesSnapInfoParser");
        Object f = ((odu) aipn.get()).c(idd, (abyi) ajyu.f((List) list)).f(new i(this, aipn2));
        akcr.a(f, "mediaPackageManager.get(…      }\n                }");
        return f;
    }

    public final String a() {
        Object a = aesq.SNAP.a();
        akcr.a(a, "MessageBodyType.SNAP.value()");
        return a;
    }

    public final ptp a(prm prm) {
        akcr.b(prm, "mediaItem");
        throw new ajxl("An operation is not implemented: ".concat("sending snap context replies is not currently supported"));
    }

    public final byte[] b() {
        List arrayList;
        ajxe a;
        String str;
        Object bytes;
        Object a2;
        int i;
        pse pse = this.a;
        String str2 = "null cannot be cast to non-null type java.lang.String";
        String str3 = "(this as java.lang.String).getBytes(charset)";
        if (pse != null) {
            alqh a3 = akcr.a(pse.c, Boolean.TRUE) ? new alqh().a(new Empty()) : pse.d != null ? new alqh().a((int) pse.d.doubleValue()) : new alqh().b(new Empty());
            arrayList = new ArrayList();
            Object a4 = new alqn().a(2).a(MessageNano.toByteArray(a3));
            akcr.a(a4, "SnapEnvelope()\n         …no.toByteArray(duration))");
            arrayList.add(a4);
            a = ajxh.a(e.a);
            str = pse.e;
            if (str != null) {
                alqr alqr = (alqr) a.b();
                Charset charset = akfp.a;
                if (str != null) {
                    bytes = str.getBytes(charset);
                    akcr.a(bytes, str3);
                    alqr.a(bytes);
                } else {
                    throw new ajxt(str2);
                }
            }
            alsb alsb = pse.l;
            if (alsb != null) {
                ((alqr) a.b()).a = alsb;
            }
            if (a.a()) {
                a4 = new alqn().a(4).a(MessageNano.toByteArray((MessageNano) a.b()));
                akcr.a(a4, "SnapEnvelope()\n         …Array(unlockables.value))");
                arrayList.add(a4);
            }
            String str4 = pse.f;
            str = "SnapEnvelope()\n         …sageNano.toByteArray(it))";
            if (str4 != null) {
                alqo alqo = new alqo();
                alqo.a = algd.a(BaseEncoding.base64().decode(str4));
                a4 = new alqn().a(7).a(MessageNano.toByteArray(alqo));
                akcr.a(a4, str);
                Boolean.valueOf(arrayList.add(a4));
            }
            a = ajxh.a(c.a);
            if (pse.g != null) {
                ((alqe) a.b()).a = pse.g;
            }
            String str5 = pse.j;
            if (str5 != null) {
                ((alqe) a.b()).a(str5);
            }
            if (a.a()) {
                a4 = new alqn().a(5).a(MessageNano.toByteArray((MessageNano) a.b()));
                akcr.a(a4, "SnapEnvelope()\n         …ByteArray(context.value))");
                arrayList.add(a4);
            }
            a = ajxh.a(d.a);
            str5 = pse.m;
            if (str5 != null) {
                ((alqf) a.b()).b(str5);
            }
            str5 = pse.n;
            if (str5 != null) {
                ((alqf) a.b()).a(str5);
            }
            if (a.a()) {
                a4 = new alqn().a(31).a(MessageNano.toByteArray((MessageNano) a.b()));
                akcr.a(a4, "SnapEnvelope()\n         …ativeKitSourceApp.value))");
                arrayList.add(a4);
            }
            str4 = pse.h;
            if (str4 != null) {
                a4 = new alqn().a(6).a(MessageNano.toByteArray(new alqc().a(str4)));
                akcr.a(a4, "SnapEnvelope()\n         ….toByteArray(attachment))");
                Boolean.valueOf(arrayList.add(a4));
            }
            alqi alqi = pse.i;
            if (alqi != null) {
                a4 = new alqn().a(38).a(MessageNano.toByteArray(alqi));
                akcr.a(a4, str);
                Boolean.valueOf(arrayList.add(a4));
            }
            String str6 = pse.k;
            if (str6 != null) {
                alqd alqd = new alqd();
                alqd.a(str6);
                a2 = new alqn().a(35).a(MessageNano.toByteArray(alqd));
                akcr.a(a2, "SnapEnvelope()\n         …ano.toByteArray(caption))");
                Boolean.valueOf(arrayList.add(a2));
            }
        } else {
            arrayList = new ArrayList();
        }
        ajxe a5 = ajxh.a(h.a);
        a = ajxh.a(g.a);
        aesg aesg = this.d;
        if (aesg != null) {
            a.a aVar = new a.a();
            String str7 = aesg.a;
            if (str7 != null) {
                aVar.a(str7);
            }
            str7 = aesg.d;
            if (str7 != null) {
                aVar.b(str7);
            }
            Long l = aesg.b;
            if (l != null) {
                aVar.a(l.longValue());
            }
            affr a6 = aesg.a();
            if (a6 != null) {
                i = puo.a[a6.ordinal()];
                i = i != 1 ? i != 2 ? 2 : 0 : 1;
                aVar.a(i);
            }
            ((a) a.b()).a = aVar;
        }
        str = this.e;
        if (str != null) {
            ((a) a.b()).a(str);
        }
        str = this.f;
        Integer num = null;
        if (str != null) {
            if (this.g != null) {
                alqk alqk = (alqk) a5.b();
                c cVar = new c();
                Charset charset2 = akfp.a;
                if (str != null) {
                    byte[] bytes2;
                    bytes = str.getBytes(charset2);
                    akcr.a(bytes, str3);
                    c a7 = cVar.a(bytes);
                    String str8 = this.g;
                    if (str8 != null) {
                        charset2 = akfp.a;
                        if (str8 != null) {
                            bytes2 = str8.getBytes(charset2);
                            akcr.a((Object) bytes2, str3);
                        } else {
                            throw new ajxt(str2);
                        }
                    }
                    bytes2 = null;
                    alqk.a = a7.b(bytes2);
                } else {
                    throw new ajxt(str2);
                }
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        gcp gcp = this.h;
        if (gcp != null) {
            alqk alqk2 = (alqk) a5.b();
            i = gcp.c() ? 0 : gcp.a() ? 1 : gcp.b() ? 2 : ((gcp) gcp) == gcp.AUDIO ? 3 : -1;
            alqk2.a(i);
            ((alqk) a5.b()).a(gcp.d());
        }
        if (a.a()) {
            ((alqk) a5.b()).a((a) a.b());
        }
        if (a5.a()) {
            a2 = new alqn().a(1).a(MessageNano.toByteArray((MessageNano) a5.b()));
            akcr.a(a2, "SnapEnvelope()\n         …toByteArray(media.value))");
            arrayList.add(a2);
        }
        prm prm = this.b;
        if (prm != null) {
            a2 = new alqn().a(37).a(new pun(null, prm.g, prm.a, prm.c, prm.d, gcp.a.a(prm.b), null, 128).b());
            akcr.a(a2, "SnapEnvelope()\n         ….setComponentBytes(bytes)");
            Boolean.valueOf(arrayList.add(a2));
        }
        gcp gcp2 = this.h;
        if (gcp2 != null) {
            if (gcp2.h()) {
                num = Integer.valueOf(1);
            } else if (gcp2.f()) {
                num = Integer.valueOf(2);
            }
            if (num != null) {
                int intValue = num.intValue();
                alqp alqp = new alqp();
                alqp.a(intValue);
                a2 = new alqn().a(34).a(MessageNano.toByteArray(alqp));
                akcr.a(a2, "SnapEnvelope()\n         ….toByteArray(spectacles))");
                Boolean.valueOf(arrayList.add(a2));
            }
        }
        b bVar = this.i;
        if (bVar != null) {
            Object fromString = UUID.fromString(bVar.a);
            alqn a8 = new alqn().a(33);
            alqj alqj = new alqj();
            aler aler = new aler();
            akcr.a(fromString, "javaUUID");
            alqj.a = aler.a(fromString.getMostSignificantBits()).b(fromString.getLeastSignificantBits());
            alqj.a(bVar.b);
            alqj.b(bVar.c);
            a2 = a8.a(MessageNano.toByteArray(alqj));
            akcr.a(a2, "SnapEnvelope()\n         …                      }))");
            Boolean.valueOf(arrayList.add(a2));
        }
        a5 = ajxh.a(f.a);
        pse pse2 = this.a;
        if (pse2 != null) {
            Boolean bool = pse2.o;
            if (bool != null) {
                ((alqg) a5.b()).a(bool.booleanValue());
            }
        }
        if (a5.a()) {
            a2 = new alqn().a(41).a(MessageNano.toByteArray((MessageNano) a5.b()));
            akcr.a(a2, "SnapEnvelope()\n         …iveToolsAnalytics.value))");
            arrayList.add(a2);
        }
        alqm alqm = new alqm();
        Object[] toArray = arrayList.toArray(new alqn[0]);
        if (toArray != null) {
            alqm.b = (alqn[]) toArray;
            a2 = MessageNano.toByteArray(alqm);
            akcr.a(a2, "MessageNano.toByteArray(snap)");
            return a2;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final List<prm> c() {
        throw new ajxl("GetMedia isn't implemented on SnapParcelContent");
    }
}
