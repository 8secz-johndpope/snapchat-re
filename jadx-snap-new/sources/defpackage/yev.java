package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: yev */
public final class yev {
    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final void a(File file) {
        akcr.b(file, "file");
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void a(File file, File file2, boolean z) {
        akcr.b(file, "from");
        akcr.b(file2, "to");
        if (z) {
            yev.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x004d in {6, 9, 11, 12, 14} preds:[]
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
    public static final void b(java.io.File r4) {
        /*
        r0 = "dir";
        defpackage.akcr.b(r4, r0);
        r0 = r4.listFiles();
        if (r0 == 0) goto L_0x003b;
        r4 = r0.length;
        r1 = 0;
        if (r1 >= r4) goto L_0x003a;
        r2 = r0[r1];
        r3 = "file";
        defpackage.akcr.a(r2, r3);
        r3 = r2.isDirectory();
        if (r3 == 0) goto L_0x001f;
        defpackage.yev.b(r2);
        r3 = r2.delete();
        if (r3 == 0) goto L_0x0028;
        r1 = r1 + 1;
        goto L_0x000d;
        r4 = new java.io.IOException;
        r0 = java.lang.String.valueOf(r2);
        r1 = "failed to delete file: ";
        r0 = r1.concat(r0);
        r4.<init>(r0);
        r4 = (java.lang.Throwable) r4;
        throw r4;
        return;
        r0 = new java.io.IOException;
        r4 = java.lang.String.valueOf(r4);
        r1 = "not a readable directory: ";
        r4 = r1.concat(r4);
        r0.<init>(r4);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yev.b(java.io.File):void");
    }

    public static final AssetFileDescriptor c(File file) {
        akcr.b(file, "file");
        return new AssetFileDescriptor(ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY), 0, -1);
    }
}
