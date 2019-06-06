package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: adbs */
public final class adbs {
    public static final adbs a = new adbs();
    private static final AtomicInteger b = new AtomicInteger();
    private static final Map<String, File> c = new LinkedHashMap();

    private adbs() {
    }

    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            r4 = r4.getCacheDir();
            r1 = new java.lang.StringBuilder("map_style_");
            r1.append(b.incrementAndGet());
            r0 = new java.io.File(r4, r1.toString());
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r1 = r5;
            r2 = java.nio.charset.Charset.defaultCharset();
     */
    /* JADX WARNING: Missing block: B:13:0x0043, code skipped:
            if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Missing block: B:14:0x0045, code skipped:
            r1 = null;
     */
    /* JADX WARNING: Missing block: B:15:0x0047, code skipped:
            r1 = r1.toString();
     */
    /* JADX WARNING: Missing block: B:16:0x004b, code skipped:
            defpackage.akkz.a(r0, r1, r2);
     */
    /* JADX WARNING: Missing block: B:17:0x004e, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            c.put(r5, r0);
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:22:0x0055, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:26:0x0059, code skipped:
            r5 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x005a, code skipped:
            defpackage.adas.a(r5);
     */
    /* JADX WARNING: Missing block: B:28:0x005f, code skipped:
            return null;
     */
    public final java.io.File a(android.content.Context r4, java.lang.String r5) {
        /*
        r3 = this;
        r0 = "context";
        defpackage.akcr.b(r4, r0);
        r0 = "json";
        defpackage.akcr.b(r5, r0);
        monitor-enter(r3);
        r0 = c;	 Catch:{ all -> 0x0060 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0060 }
        r0 = (java.io.File) r0;	 Catch:{ all -> 0x0060 }
        if (r0 == 0) goto L_0x001d;
    L_0x0015:
        r1 = r0.exists();	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x001d;
    L_0x001b:
        monitor-exit(r3);
        return r0;
    L_0x001d:
        monitor-exit(r3);
        r0 = new java.io.File;
        r4 = r4.getCacheDir();
        r1 = new java.lang.StringBuilder;
        r2 = "map_style_";
        r1.<init>(r2);
        r2 = b;
        r2 = r2.incrementAndGet();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r4, r1);
        r4 = 0;
        r1 = r5;
        r1 = (java.lang.CharSequence) r1;	 Catch:{ IOException -> 0x0059 }
        r2 = java.nio.charset.Charset.defaultCharset();	 Catch:{ IOException -> 0x0059 }
        if (r1 != 0) goto L_0x0047;
    L_0x0045:
        r1 = r4;
        goto L_0x004b;
    L_0x0047:
        r1 = r1.toString();	 Catch:{ IOException -> 0x0059 }
    L_0x004b:
        defpackage.akkz.a(r0, r1, r2);	 Catch:{ IOException -> 0x0059 }
        monitor-enter(r3);	 Catch:{ IOException -> 0x0059 }
        r1 = c;	 Catch:{ all -> 0x0056 }
        r1.put(r5, r0);	 Catch:{ all -> 0x0056 }
        monitor-exit(r3);	 Catch:{ IOException -> 0x0059 }
        return r0;
    L_0x0056:
        r5 = move-exception;
        monitor-exit(r3);	 Catch:{ IOException -> 0x0059 }
        throw r5;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r5 = move-exception;
        r5 = (java.lang.Throwable) r5;
        defpackage.adas.a(r5);
        return r4;
    L_0x0060:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbs.a(android.content.Context, java.lang.String):java.io.File");
    }
}
