package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;

/* renamed from: dn */
final class dn {

    /* renamed from: dn$a */
    static class a {
        long a;
        long b;

        a() {
        }
    }

    static long a(File file) {
        long j = "r";
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, j);
        try {
            j = dn.a(randomAccessFile, dn.a(randomAccessFile));
            return j;
        } finally {
            randomAccessFile.close();
        }
    }

    private static long a(RandomAccessFile randomAccessFile, a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.b;
        randomAccessFile.seek(aVar.a);
        int min = (int) Math.min(16384, j);
        byte[] bArr = new byte[16384];
        while (true) {
            min = randomAccessFile.read(bArr, 0, min);
            if (min == -1) {
                break;
            }
            crc32.update(bArr, 0, min);
            j -= (long) min;
            if (j == 0) {
                break;
            }
            min = (int) Math.min(16384, j);
        }
        return crc32.getValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0080 in {4, 5, 11, 13, 15, 17} preds:[]
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
    private static defpackage.dn.a a(java.io.RandomAccessFile r7) {
        /*
        r0 = r7.length();
        r2 = 22;
        r0 = r0 - r2;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x0068;
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = r0 - r4;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 >= 0) goto L_0x0017;
        goto L_0x0018;
        r2 = r4;
        r4 = 101010256; // 0x6054b50 float:2.506985E-35 double:4.99056974E-316;
        r4 = java.lang.Integer.reverseBytes(r4);
        r7.seek(r0);
        r5 = r7.readInt();
        if (r5 == r4) goto L_0x0038;
        r5 = 1;
        r0 = r0 - r5;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 < 0) goto L_0x0030;
        goto L_0x001f;
        r7 = new java.util.zip.ZipException;
        r0 = "End Of Central Directory signature not found";
        r7.<init>(r0);
        throw r7;
        r0 = 2;
        r7.skipBytes(r0);
        r7.skipBytes(r0);
        r7.skipBytes(r0);
        r7.skipBytes(r0);
        r0 = new dn$a;
        r0.<init>();
        r1 = r7.readInt();
        r1 = java.lang.Integer.reverseBytes(r1);
        r1 = (long) r1;
        r3 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r1 = r1 & r3;
        r0.b = r1;
        r7 = r7.readInt();
        r7 = java.lang.Integer.reverseBytes(r7);
        r1 = (long) r7;
        r1 = r1 & r3;
        r0.a = r1;
        return r0;
        r0 = new java.util.zip.ZipException;
        r1 = new java.lang.StringBuilder;
        r2 = "File too short to be a zip file: ";
        r1.<init>(r2);
        r2 = r7.length();
        r1.append(r2);
        r7 = r1.toString();
        r0.<init>(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.a(java.io.RandomAccessFile):dn$a");
    }
}
