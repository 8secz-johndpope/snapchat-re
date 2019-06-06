package defpackage;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: hm */
class hm extends hp {
    hm() {
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder stringBuilder = new StringBuilder("/proc/self/fd/");
            stringBuilder.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(stringBuilder.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x005a A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0015} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:42:0x005a, code skipped:
            r4 = th;
     */
    /* JADX WARNING: Missing block: B:43:0x005b, code skipped:
            r6 = null;
     */
    /* JADX WARNING: Missing block: B:47:0x005f, code skipped:
            r6 = move-exception;
     */
    /* JADX WARNING: Missing block: B:48:0x0060, code skipped:
            r2 = r6;
            r6 = r4;
            r4 = r2;
     */
    public android.graphics.Typeface a(android.content.Context r4, defpackage.ip.b[] r5, int r6) {
        /*
        r3 = this;
        r0 = r5.length;
        r1 = 0;
        if (r0 > 0) goto L_0x0005;
    L_0x0004:
        return r1;
    L_0x0005:
        r5 = r3.a(r5, r6);
        r6 = r4.getContentResolver();
        r5 = r5.a;	 Catch:{ IOException -> 0x0074 }
        r0 = "r";
        r5 = r6.openFileDescriptor(r5, r0, r1);	 Catch:{ IOException -> 0x0074 }
        r6 = defpackage.hm.a(r5);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r6 == 0) goto L_0x002c;
    L_0x001b:
        r0 = r6.canRead();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x002c;
    L_0x0022:
        r4 = android.graphics.Typeface.createFromFile(r6);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r5 == 0) goto L_0x002b;
    L_0x0028:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x002b:
        return r4;
    L_0x002c:
        r6 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r0 = r5.getFileDescriptor();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r6.<init>(r0);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r4 = defpackage.hp.a(r4, r6);	 Catch:{ Throwable -> 0x0045, all -> 0x0042 }
        r6.close();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r5 == 0) goto L_0x0041;
    L_0x003e:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0041:
        return r4;
    L_0x0042:
        r4 = move-exception;
        r0 = r1;
        goto L_0x004b;
    L_0x0045:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        r2 = r0;
        r0 = r4;
        r4 = r2;
    L_0x004b:
        if (r0 == 0) goto L_0x0056;
    L_0x004d:
        r6.close();	 Catch:{ Throwable -> 0x0051, all -> 0x005a }
        goto L_0x0059;
    L_0x0051:
        r6 = move-exception;
        r0.addSuppressed(r6);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        goto L_0x0059;
    L_0x0056:
        r6.close();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x0059:
        throw r4;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x005a:
        r4 = move-exception;
        r6 = r1;
        goto L_0x0063;
    L_0x005d:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r6 = move-exception;
        r2 = r6;
        r6 = r4;
        r4 = r2;
    L_0x0063:
        if (r5 == 0) goto L_0x0073;
    L_0x0065:
        if (r6 == 0) goto L_0x0070;
    L_0x0067:
        r5.close();	 Catch:{ Throwable -> 0x006b }
        goto L_0x0073;
    L_0x006b:
        r5 = move-exception;
        r6.addSuppressed(r5);	 Catch:{ IOException -> 0x0074 }
        goto L_0x0073;
    L_0x0070:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0073:
        throw r4;	 Catch:{ IOException -> 0x0074 }
    L_0x0074:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm.a(android.content.Context, ip$b[], int):android.graphics.Typeface");
    }
}
