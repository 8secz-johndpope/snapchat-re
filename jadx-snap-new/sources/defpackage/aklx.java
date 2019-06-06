package defpackage;

import java.io.Writer;
import org.opencv.imgproc.Imgproc;

/* renamed from: aklx */
public final class aklx {
    public static final akmj a;

    /* renamed from: aklx$a */
    static class a extends akmj {
        private static final String a = "\"";
        private static final char[] b = new char[]{',', '\"', 13, 10};

        a() {
        }

        public final int a(CharSequence charSequence, int i, Writer writer) {
            if (i == 0) {
                if (akly.b(charSequence.toString(), b)) {
                    writer.write(charSequence.toString());
                } else {
                    writer.write(34);
                    String charSequence2 = charSequence.toString();
                    String str = a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a);
                    stringBuilder.append(a);
                    writer.write(akly.a(charSequence2, str, stringBuilder.toString()));
                    writer.write(34);
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
    }

    /* renamed from: aklx$b */
    static class b extends akmj {
        private static final String a = "\"";
        private static final char[] b = new char[]{',', '\"', 13, 10};

        b() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0065 in {5, 8, 9, 11, 12, 15} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final int a(java.lang.CharSequence r4, int r5, java.io.Writer r6) {
            /*
            r3 = this;
            if (r5 != 0) goto L_0x005d;
            r5 = 0;
            r0 = r4.charAt(r5);
            r1 = 34;
            if (r0 != r1) goto L_0x0055;
            r0 = r4.length();
            r2 = 1;
            r0 = r0 - r2;
            r0 = r4.charAt(r0);
            if (r0 == r1) goto L_0x0018;
            goto L_0x0055;
            r0 = r4.length();
            r0 = r0 - r2;
            r0 = r4.subSequence(r2, r0);
            r0 = r0.toString();
            r1 = b;
            r1 = defpackage.akly.a(r0, r1);
            if (r1 == 0) goto L_0x0047;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = a;
            r1.append(r2);
            r2 = a;
            r1.append(r2);
            r1 = r1.toString();
            r2 = a;
            r0 = defpackage.akly.a(r0, r1, r2);
            goto L_0x0059;
            r0 = r4.toString();
            goto L_0x0059;
            r6 = r4.length();
            r4 = java.lang.Character.codePointCount(r4, r5, r6);
            return r4;
            r0 = r4.toString();
            r6.write(r0);
            goto L_0x004c;
            r4 = new java.lang.IllegalStateException;
            r5 = "CsvUnescaper should never reach the [1] index";
            r4.<init>(r5);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aklx$b.a(java.lang.CharSequence, int, java.io.Writer):int");
        }
    }

    static {
        String[][] strArr = new String[2][];
        String str = "\\\"";
        String str2 = "\"";
        strArr[0] = new String[]{str2, str};
        String str3 = "\\\\";
        String str4 = "\\";
        strArr[1] = new String[]{str4, str3};
        new akmn(strArr).a(new akmn(akml.i())).a(new akmm());
        akmj[] akmjArr = new akmj[3];
        r12 = new String[4][];
        r12[0] = new String[]{r14, "\\'"};
        r12[1] = new String[]{str2, str};
        r12[2] = new String[]{str4, str3};
        r12[3] = new String[]{"/", "\\/"};
        akmjArr[0] = new akmn(r12);
        akmjArr[1] = new akmn(akml.i());
        akmjArr[2] = new akmm();
        akmi akmi = new akmi(akmjArr);
        akmjArr = new akmj[3];
        akmjArr[0] = new akmn(new String[]{str2, str}, new String[]{str4, str3}, new String[]{"/", "\\/"});
        akmjArr[1] = new akmn(akml.i());
        akmjArr[2] = new akmm();
        akmi = new akmi(akmjArr);
        akmi = new akmi(new akmn(akml.e()), new akmn(akml.g()));
        r10 = new akmj[6];
        r12 = new String[31][];
        String str5 = "";
        r12[0] = new String[]{"\u0000", str5};
        r12[1] = new String[]{"\u0001", str5};
        r12[2] = new String[]{"\u0002", str5};
        r12[3] = new String[]{"\u0003", str5};
        r12[4] = new String[]{"\u0004", str5};
        r12[5] = new String[]{"\u0005", str5};
        r12[6] = new String[]{"\u0006", str5};
        r12[7] = new String[]{"\u0007", str5};
        r12[8] = new String[]{"\b", str5};
        r12[9] = new String[]{"\u000b", str5};
        r12[10] = new String[]{"\f", str5};
        r12[11] = new String[]{"\u000e", str5};
        r12[12] = new String[]{"\u000f", str5};
        r12[13] = new String[]{"\u0010", str5};
        r12[14] = new String[]{"\u0011", str5};
        r12[15] = new String[]{"\u0012", str5};
        r12[16] = new String[]{"\u0013", str5};
        r12[17] = new String[]{"\u0014", str5};
        r12[18] = new String[]{"\u0015", str5};
        r12[19] = new String[]{"\u0016", str5};
        r12[20] = new String[]{"\u0017", str5};
        r12[21] = new String[]{"\u0018", str5};
        r12[22] = new String[]{"\u0019", str5};
        r12[23] = new String[]{"\u001a", str5};
        r12[24] = new String[]{"\u001b", str5};
        r12[25] = new String[]{"\u001c", str5};
        r12[26] = new String[]{"\u001d", str5};
        r12[27] = new String[]{"\u001e", str5};
        r12[28] = new String[]{"\u001f", str5};
        r12[29] = new String[]{"￾", str5};
        r12[30] = new String[]{"￿", str5};
        r10[2] = new akmn(r12);
        r10[3] = akmo.a(127, (int) Imgproc.COLOR_BGR2YUV_YV12);
        r10[4] = akmo.a((int) Imgproc.COLOR_BGRA2YUV_YV12, 159);
        r10[5] = new akmt();
        akmi = new akmi(r10);
        akmjArr = new akmj[8];
        akmjArr[2] = new akmn(new String[]{"\u0000", str5}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"￾", str5}, new String[]{"￿", str5});
        akmjArr[3] = akmo.a(1, 8);
        akmjArr[4] = akmo.a(14, 31);
        akmjArr[5] = akmo.a(127, (int) Imgproc.COLOR_BGR2YUV_YV12);
        akmjArr[6] = akmo.a((int) Imgproc.COLOR_BGRA2YUV_YV12, 159);
        akmjArr[7] = new akmt();
        akmi = new akmi(akmjArr);
        akmi = new akmi(new akmn(akml.e()), new akmn(akml.a()));
        akmi = new akmi(new akmn(akml.e()), new akmn(akml.a()), new akmn(akml.c()));
        a aVar = new a();
        akmjArr = new akmj[4];
        akmjArr[0] = new akmq();
        akmjArr[1] = new akms();
        akmjArr[2] = new akmn(akml.j());
        akmjArr[3] = new akmn(new String[]{str3, str4}, new String[]{str, str2}, new String[]{"\\'", "'"}, new String[]{str4, str5});
        a = new akmi(akmjArr);
        akmi = new akmi(new akmn(akml.f()), new akmn(akml.b()), new akmp());
        akmi = new akmi(new akmn(akml.f()), new akmn(akml.b()), new akmn(akml.d()), new akmp());
        akmi = new akmi(new akmn(akml.f()), new akmn(akml.h()), new akmp());
        b bVar = new b();
    }
}
