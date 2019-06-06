package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.igd.b;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: acbj */
public final class acbj implements acbl {
    private static final Supplier<ExecutorService> a = Suppliers.memoize(new 1());
    private final acbk b;
    private final igd c;
    private final ExecutorService d;

    /* renamed from: acbj$1 */
    static class 1 implements Supplier<ExecutorService> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return Executors.newSingleThreadExecutor(new abmp("AndroidVideoMetadataFetcher-SerialExecutor"));
        }
    }

    static {
        Suppliers.ofInstance(Boolean.FALSE);
    }

    public acbj() {
        this(new acbk(), b.a);
    }

    private acbj(acbk acbk, igd igd) {
        this.b = acbk;
        this.c = igd;
        this.d = (ExecutorService) a.get();
    }

    private int a(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            int b = acbj.b(fileInputStream.getFD(), 9);
            fileInputStream.close();
            return b;
        } catch (IOException unused) {
            return 0;
        } catch (Throwable th) {
            r4.addSuppressed(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001d  */
    private static java.lang.String a(java.io.FileDescriptor r1, int r2) {
        /*
        r0 = 0;
        r1 = defpackage.acbk.a(r1);	 Catch:{ Exception -> 0x0021, all -> 0x0019 }
        if (r1 != 0) goto L_0x000d;
    L_0x0007:
        if (r1 == 0) goto L_0x000c;
    L_0x0009:
        r1.release();
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = r1.extractMetadata(r2);	 Catch:{ Exception -> 0x0022, all -> 0x0017 }
        if (r1 == 0) goto L_0x0016;
    L_0x0013:
        r1.release();
    L_0x0016:
        return r2;
    L_0x0017:
        r2 = move-exception;
        goto L_0x001b;
    L_0x0019:
        r2 = move-exception;
        r1 = r0;
    L_0x001b:
        if (r1 == 0) goto L_0x0020;
    L_0x001d:
        r1.release();
    L_0x0020:
        throw r2;
    L_0x0021:
        r1 = r0;
    L_0x0022:
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        r1.release();
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbj.a(java.io.FileDescriptor, int):java.lang.String");
    }

    private static int b(FileDescriptor fileDescriptor, int i) {
        return acbj.e(acbj.a(fileDescriptor, i));
    }

    private abtl b(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            FileDescriptor fd = fileInputStream.getFD();
            abtl abtl = new abtl(acbj.b(fd, 18), acbj.b(fd, 19));
            fileInputStream.close();
            return abtl;
        } catch (IOException unused) {
            return new abtl(0, 0);
        } catch (Throwable th) {
            r5.addSuppressed(th);
        }
    }

    public static boolean b(FileDescriptor fileDescriptor) {
        return acbj.a(fileDescriptor, 16) != null;
    }

    private int c(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            int b = acbj.b(fileInputStream.getFD(), 24);
            fileInputStream.close();
            return b;
        } catch (IOException unused) {
            return 0;
        } catch (Throwable th) {
            r4.addSuppressed(th);
        }
    }

    private boolean d(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            boolean b = acbj.b(fileInputStream.getFD());
            fileInputStream.close();
            return b;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            r3.addSuppressed(th);
        }
    }

    private static int e(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final int a(Uri uri) {
        return a(uri.getPath());
    }

    public final int a(FileDescriptor fileDescriptor) {
        return acbj.b(fileDescriptor, 24);
    }

    public final abtl b(Uri uri) {
        return b(uri.getPath());
    }

    public final int c(Uri uri) {
        return c(uri.getPath());
    }

    public final boolean d(Uri uri) {
        return d(uri.getPath());
    }
}
