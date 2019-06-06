package com.brightcove.player.video360;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class Sphere {
    public static final int FLOAT_SIZE = 4;
    public static final int SHORT_SIZE = 2;
    private FloatBuffer a;
    private ShortBuffer[] b;
    private int[] c;
    private int d;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x017d in {5, 8, 13, 14, 21, 22, 23, 26, 27, 29} preds:[]
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
    public Sphere(int r19, float r20, float r21, float r22, float r23, int r24) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r24;
        r18.<init>();
        r3 = r1 + 1;
        r4 = r3 * r3;
        r5 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r4 > r5) goto L_0x0163;
        r5 = r1 * r1;
        r5 = r5 * 6;
        r0.d = r5;
        r5 = 1078530011; // 0x40490fdb float:3.1415927 double:5.328646264E-315;
        r6 = (float) r1;
        r5 = r5 / r6;
        r7 = 1086918619; // 0x40c90fdb float:6.2831855 double:5.370091495E-315;
        r7 = r7 / r6;
        r4 = r4 * 5;
        r4 = r4 << 2;
        r4 = java.nio.ByteBuffer.allocateDirect(r4);
        r8 = java.nio.ByteOrder.nativeOrder();
        r4 = r4.order(r8);
        r4 = r4.asFloatBuffer();
        r0.a = r4;
        r4 = new java.nio.ShortBuffer[r2];
        r0.b = r4;
        r4 = new int[r2];
        r0.c = r4;
        r4 = r0.d;
        r4 = r4 / r2;
        r4 = r4 / 6;
        r4 = r4 * 6;
        r9 = 0;
        r10 = r2 + -1;
        if (r9 >= r10) goto L_0x0051;
        r10 = r0.c;
        r10[r9] = r4;
        r9 = r9 + 1;
        goto L_0x0046;
        r9 = r0.c;
        r11 = r0.d;
        r4 = r4 * r10;
        r11 = r11 - r4;
        r9[r10] = r11;
        r4 = 0;
        if (r4 >= r2) goto L_0x0079;
        r9 = r0.b;
        r10 = r0.c;
        r10 = r10[r4];
        r10 = r10 << 1;
        r10 = java.nio.ByteBuffer.allocateDirect(r10);
        r11 = java.nio.ByteOrder.nativeOrder();
        r10 = r10.order(r11);
        r10 = r10.asShortBuffer();
        r9[r4] = r10;
        r4 = r4 + 1;
        goto L_0x005a;
        r4 = r3 * 5;
        r4 = new float[r4];
        r9 = 0;
        if (r9 >= r3) goto L_0x00e9;
        r10 = 0;
        if (r10 >= r3) goto L_0x00d5;
        r11 = r10 * 5;
        r12 = (float) r9;
        r13 = r5 * r12;
        r13 = (double) r13;
        r16 = r9;
        r8 = java.lang.Math.sin(r13);
        r8 = (float) r8;
        r9 = (float) r10;
        r15 = r7 * r9;
        r17 = r3;
        r2 = (double) r15;
        r0 = java.lang.Math.sin(r2);
        r0 = (float) r0;
        r13 = java.lang.Math.cos(r13);
        r1 = (float) r13;
        r2 = java.lang.Math.cos(r2);
        r2 = (float) r2;
        r3 = r23 * r8;
        r0 = r0 * r3;
        r0 = r20 + r0;
        r4[r11] = r0;
        r0 = r11 + 1;
        r3 = r3 * r2;
        r2 = r21 + r3;
        r4[r0] = r2;
        r0 = r11 + 2;
        r1 = r1 * r23;
        r1 = r22 + r1;
        r4[r0] = r1;
        r0 = r11 + 3;
        r9 = r9 / r6;
        r4[r0] = r9;
        r11 = r11 + 4;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0 - r12;
        r0 = r0 / r6;
        r4[r11] = r0;
        r10 = r10 + 1;
        r0 = r18;
        r1 = r19;
        r2 = r24;
        r9 = r16;
        r3 = r17;
        goto L_0x0081;
        r17 = r3;
        r16 = r9;
        r1 = r0.a;
        r2 = r4.length;
        r3 = 0;
        r1.put(r4, r3, r2);
        r9 = r16 + 1;
        r1 = r19;
        r2 = r24;
        r3 = r17;
        goto L_0x007e;
        r17 = r3;
        r1 = r0.c;
        r1 = a(r1);
        r1 = new short[r1];
        r2 = r19;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        if (r3 >= r2) goto L_0x0142;
        r6 = r5;
        r5 = r4;
        r4 = 0;
        if (r4 >= r2) goto L_0x013d;
        r7 = r3 + 1;
        r8 = r4 + 1;
        r9 = r0.c;
        r10 = r9[r5];
        if (r6 < r10) goto L_0x0116;
        r6 = r0.b;
        r6 = r6[r5];
        r9 = r9[r5];
        r10 = 0;
        r6.put(r1, r10, r9);
        r5 = r5 + 1;
        r6 = 0;
        r9 = r6 + 1;
        r10 = r3 * r17;
        r11 = r10 + r4;
        r11 = (short) r11;
        r1[r6] = r11;
        r6 = r9 + 1;
        r7 = r7 * r17;
        r4 = r4 + r7;
        r4 = (short) r4;
        r1[r9] = r4;
        r4 = r6 + 1;
        r7 = r7 + r8;
        r7 = (short) r7;
        r1[r6] = r7;
        r6 = r4 + 1;
        r1[r4] = r11;
        r4 = r6 + 1;
        r1[r6] = r7;
        r6 = r4 + 1;
        r10 = r10 + r8;
        r7 = (short) r10;
        r1[r4] = r7;
        r4 = r8;
        goto L_0x00fd;
        r3 = r3 + 1;
        r4 = r5;
        r5 = r6;
        goto L_0x00f8;
        r2 = r0.b;
        r2 = r2[r4];
        r3 = r0.c;
        r3 = r3[r4];
        r4 = 0;
        r2.put(r1, r4, r3);
        r1 = r0.a;
        r1.position(r4);
        r1 = r24;
        r2 = 0;
        if (r2 >= r1) goto L_0x0162;
        r3 = r0.b;
        r3 = r3[r2];
        r3.position(r4);
        r2 = r2 + 1;
        goto L_0x0156;
        return;
        r2 = r1;
        r1 = new java.lang.RuntimeException;
        r3 = new java.lang.StringBuilder;
        r4 = "nSlices ";
        r3.<init>(r4);
        r3.append(r2);
        r2 = " too big for vertex";
        r3.append(r2);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.video360.Sphere.<init>(int, float, float, float, float, int):void");
    }

    private static int a(int[] iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public void draw() {
        int i = 0;
        while (true) {
            ShortBuffer[] shortBufferArr = this.b;
            if (i < shortBufferArr.length) {
                GLES20.glDrawElements(4, this.c[i], 5123, shortBufferArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public FloatBuffer getVertices() {
        return this.a;
    }

    public int getVerticesStride() {
        return 20;
    }
}
