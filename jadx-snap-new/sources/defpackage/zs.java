package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: zs */
public final class zs implements zm<InputStream> {
    private static b a = new a();
    private final acj b;
    private final int c;
    private final b d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    /* renamed from: zs$b */
    interface b {
        HttpURLConnection a(URL url);
    }

    /* renamed from: zs$a */
    static class a implements b {
        a() {
        }

        public final HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public zs(acj acj, int i) {
        this(acj, i, a);
    }

    private zs(acj acj, int i, b bVar) {
        this.b = acj;
        this.c = i;
        this.d = bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x0116 in {6, 8, 10, 13, 17, 20, 21, 26, 29, 30, 32, 34, 38, 40, 44, 46, 48} preds:[]
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
    private java.io.InputStream a(java.net.URL r6, int r7, java.net.URL r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
        r5 = this;
        r0 = 5;
        if (r7 >= r0) goto L_0x010e;
        if (r8 == 0) goto L_0x001c;
        r0 = r6.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r8 = r8.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r8 = r0.equals(r8);	 Catch:{ URISyntaxException -> 0x001c }
        if (r8 != 0) goto L_0x0014;	 Catch:{ URISyntaxException -> 0x001c }
        goto L_0x001c;	 Catch:{ URISyntaxException -> 0x001c }
        r8 = new zb;	 Catch:{ URISyntaxException -> 0x001c }
        r0 = "In re-direct loop";	 Catch:{ URISyntaxException -> 0x001c }
        r8.<init>(r0);	 Catch:{ URISyntaxException -> 0x001c }
        throw r8;	 Catch:{ URISyntaxException -> 0x001c }
        r8 = r5.d;
        r8 = r8.a(r6);
        r5.e = r8;
        r8 = r9.entrySet();
        r8 = r8.iterator();
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x004a;
        r0 = r8.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r5.e;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r1.addRequestProperty(r2, r0);
        goto L_0x002c;
        r8 = r5.e;
        r0 = r5.c;
        r8.setConnectTimeout(r0);
        r8 = r5.e;
        r0 = r5.c;
        r8.setReadTimeout(r0);
        r8 = r5.e;
        r0 = 0;
        r8.setUseCaches(r0);
        r8 = r5.e;
        r1 = 1;
        r8.setDoInput(r1);
        r8 = r5.e;
        r8.setInstanceFollowRedirects(r0);
        r8 = r5.e;
        r8.connect();
        r8 = r5.e;
        r8 = r8.getInputStream();
        r5.f = r8;
        r8 = r5.g;
        if (r8 == 0) goto L_0x007c;
        r6 = 0;
        return r6;
        r8 = r5.e;
        r8 = r8.getResponseCode();
        r2 = r8 / 100;
        r3 = 2;
        if (r2 != r3) goto L_0x0089;
        r3 = 1;
        goto L_0x008a;
        r3 = 0;
        r4 = 3;
        if (r3 == 0) goto L_0x00d0;
        r6 = r5.e;
        r7 = r6.getContentEncoding();
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 == 0) goto L_0x00aa;
        r7 = r6.getContentLength();
        r6 = r6.getInputStream();
        r7 = (long) r7;
        r9 = new ahe;
        r9.<init>(r6, r7);
        r5.f = r9;
        goto L_0x00cd;
        r7 = "HttpUrlFetcher";
        r8 = android.util.Log.isLoggable(r7, r4);
        if (r8 == 0) goto L_0x00c7;
        r8 = new java.lang.StringBuilder;
        r9 = "Got non empty content encoding: ";
        r8.<init>(r9);
        r9 = r6.getContentEncoding();
        r8.append(r9);
        r8 = r8.toString();
        android.util.Log.d(r7, r8);
        r6 = r6.getInputStream();
        r5.f = r6;
        r6 = r5.f;
        return r6;
        if (r2 != r4) goto L_0x00d3;
        r0 = 1;
        if (r0 == 0) goto L_0x00f9;
        r8 = r5.e;
        r0 = "Location";
        r8 = r8.getHeaderField(r0);
        r0 = android.text.TextUtils.isEmpty(r8);
        if (r0 != 0) goto L_0x00f1;
        r0 = new java.net.URL;
        r0.<init>(r6, r8);
        r5.b();
        r7 = r7 + 1;
        r8 = r6;
        r6 = r0;
        goto L_0x0000;
        r6 = new zb;
        r7 = "Received empty or null redirect url";
        r6.<init>(r7);
        throw r6;
        r6 = -1;
        if (r8 != r6) goto L_0x0102;
        r6 = new zb;
        r6.<init>(r8);
        throw r6;
        r6 = new zb;
        r7 = r5.e;
        r7 = r7.getResponseMessage();
        r6.<init>(r7, r8);
        throw r6;
        r6 = new zb;
        r7 = "Too many (> 5) redirects!";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.a(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0080 in {4, 8, 10, 18, 22, 23, 26, 27} preds:[]
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
    public final void a(defpackage.yk r9, defpackage.zm.a<? super java.io.InputStream> r10) {
        /*
        r8 = this;
        r9 = "Finished http url fetcher fetch in ";
        r0 = "HttpUrlFetcher";
        r1 = defpackage.ahh.a();
        r3 = 2;
        r4 = r8.b;	 Catch:{ IOException -> 0x0049 }
        r5 = r4.c;	 Catch:{ IOException -> 0x0049 }
        if (r5 != 0) goto L_0x001a;	 Catch:{ IOException -> 0x0049 }
        r5 = new java.net.URL;	 Catch:{ IOException -> 0x0049 }
        r6 = r4.b();	 Catch:{ IOException -> 0x0049 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0049 }
        r4.c = r5;	 Catch:{ IOException -> 0x0049 }
        r4 = r4.c;	 Catch:{ IOException -> 0x0049 }
        r5 = 0;	 Catch:{ IOException -> 0x0049 }
        r6 = 0;	 Catch:{ IOException -> 0x0049 }
        r7 = r8.b;	 Catch:{ IOException -> 0x0049 }
        r7 = r7.b;	 Catch:{ IOException -> 0x0049 }
        r7 = r7.a();	 Catch:{ IOException -> 0x0049 }
        r4 = r8.a(r4, r5, r6, r7);	 Catch:{ IOException -> 0x0049 }
        r10.a(r4);	 Catch:{ IOException -> 0x0049 }
        r10 = android.util.Log.isLoggable(r0, r3);
        if (r10 == 0) goto L_0x0065;
        r10 = new java.lang.StringBuilder;
        r10.<init>(r9);
        r1 = defpackage.ahh.a(r1);
        r10.append(r1);
        r9 = r10.toString();
        android.util.Log.v(r0, r9);
        return;
        r10 = move-exception;
        goto L_0x0066;
        r4 = move-exception;
        r5 = 3;
        r5 = android.util.Log.isLoggable(r0, r5);	 Catch:{ all -> 0x0047 }
        if (r5 == 0) goto L_0x0056;	 Catch:{ all -> 0x0047 }
        r5 = "Failed to load data for url";	 Catch:{ all -> 0x0047 }
        android.util.Log.d(r0, r5, r4);	 Catch:{ all -> 0x0047 }
        r10.a(r4);	 Catch:{ all -> 0x0047 }
        r10 = android.util.Log.isLoggable(r0, r3);
        if (r10 == 0) goto L_0x0065;
        r10 = new java.lang.StringBuilder;
        r10.<init>(r9);
        goto L_0x0038;
        return;
        r3 = android.util.Log.isLoggable(r0, r3);
        if (r3 == 0) goto L_0x007f;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r9);
        r1 = defpackage.ahh.a(r1);
        r3.append(r1);
        r9 = r3.toString();
        android.util.Log.v(r0, r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.a(yk, zm$a):void");
    }

    public final void b() {
        InputStream inputStream = this.f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.e = null;
    }

    public final void c() {
        this.g = true;
    }

    public final yx d() {
        return yx.REMOTE;
    }
}
