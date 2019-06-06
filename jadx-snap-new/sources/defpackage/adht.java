package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: adht */
public final class adht {
    public static final adht a = new adht();
    private final adhk b;

    private adht() {
        this(adhk.a);
    }

    private adht(adhk adhk) {
        this.b = adhk;
    }

    public static int a(int i) {
        boolean z = i >= 0 && i <= 31;
        Preconditions.checkArgument(z);
        return i + 33984;
    }

    public static int a(int i, String str) {
        i = adhk.a(i);
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        adhk.a(i, iArr);
        if (iArr[0] != 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to compile shader: ");
        stringBuilder.append(GLES20.glGetShaderInfoLog(i));
        str = stringBuilder.toString();
        GLES20.glDeleteShader(i);
        throw new adkd(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0046 in {6, 7, 9, 11} preds:[]
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
    public static java.lang.String a(java.lang.String r7, java.lang.String[] r8) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>(r7);
        r1 = "#version";
        r1 = r7.indexOf(r1);
        r2 = -1;
        if (r1 == r2) goto L_0x003e;
        r2 = "\n";
        r7 = r7.indexOf(r2, r1);
        r7 = r7 + 1;
        r1 = r8.length;
        r3 = 0;
        if (r3 >= r1) goto L_0x0039;
        r4 = r8[r3];
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x0036;
        r5 = new java.lang.StringBuilder;
        r6 = "#define ";
        r5.<init>(r6);
        r5.append(r4);
        r5.append(r2);
        r4 = r5.toString();
        r0.insert(r7, r4);
        r3 = r3 + 1;
        goto L_0x0018;
        r7 = r0.toString();
        return r7;
        r7 = new adkd;
        r8 = "Missing #version in shader code";
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adht.a(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }
}
