package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.Callable;

/* renamed from: aisw */
public final class aisw {
    private static b b = b.a;
    int a = 8192;
    private HttpURLConnection c = null;
    private URL d;
    private final String e;
    private e f;
    private boolean g;
    private boolean h = true;
    private boolean i = false;

    /* renamed from: aisw$b */
    public interface b {
        public static final b a = new 1();

        /* renamed from: aisw$b$1 */
        static class 1 implements b {
            1() {
            }

            public final HttpURLConnection a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        }

        HttpURLConnection a(URL url);
    }

    /* renamed from: aisw$c */
    public static class c extends RuntimeException {
        protected c(IOException iOException) {
            super(iOException);
        }

        public final /* bridge */ /* synthetic */ Throwable getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: aisw$a */
    public static abstract class a<V> extends d<V> {
        private final Closeable a;
        private final boolean b;

        protected a(Closeable closeable, boolean z) {
            this.a = closeable;
            this.b = z;
        }

        /* Access modifiers changed, original: protected|final */
        public final void b() {
            Closeable closeable = this.a;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.b) {
                try {
                    this.a.close();
                } catch (IOException unused) {
                }
            } else {
                this.a.close();
            }
        }
    }

    /* renamed from: aisw$d */
    public static abstract class d<V> implements Callable<V> {
        protected d() {
        }

        public abstract V a();

        public abstract void b();

        public V call() {
            Throwable th;
            Object obj = true;
            try {
                obj = a();
                try {
                    b();
                    return obj;
                } catch (IOException e) {
                    throw new c(e);
                }
            } catch (c e2) {
                throw e2;
            } catch (IOException e3) {
                throw new c(e3);
            } catch (Throwable th2) {
                th = th2;
                b();
                throw th;
            }
        }
    }

    /* renamed from: aisw$e */
    public static class e extends BufferedOutputStream {
        private final CharsetEncoder a;

        public e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.a = Charset.forName(aisw.a(str)).newEncoder();
        }

        public final e a(String str) {
            ByteBuffer encode = this.a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public aisw(CharSequence charSequence, String str) {
        try {
            this.d = new URL(charSequence.toString());
            this.e = str;
        } catch (MalformedURLException e) {
            throw new c(e);
        }
    }

    private aisw a(InputStream inputStream, OutputStream outputStream) {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (aisw) new a<aisw>(inputStream, this.h) {
            public final /* synthetic */ Object a() {
                byte[] bArr = new byte[aisw.this.a];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return aisw.this;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        }.call();
    }

    public static String a(CharSequence charSequence) {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(host);
                stringBuilder.append(':');
                stringBuilder.append(Integer.toString(port));
                host = stringBuilder.toString();
            }
            try {
                host = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = host.indexOf(63);
                if (indexOf <= 0) {
                    return host;
                }
                indexOf++;
                if (indexOf >= host.length()) {
                    return host;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(host.substring(0, indexOf));
                stringBuilder2.append(host.substring(indexOf).replace("+", "%2B"));
                return stringBuilder2.toString();
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new c(iOException);
            }
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    public static java.lang.String a(java.lang.CharSequence r3, java.util.Map<?, ?> r4) {
        /*
        r3 = r3.toString();
        if (r4 == 0) goto L_0x0069;
    L_0x0006:
        r0 = r4.isEmpty();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0069;
    L_0x000d:
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        defpackage.aisw.a(r3, r0);
        defpackage.aisw.b(r3, r0);
        r3 = r4.entrySet();
        r3 = r3.iterator();
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r1 = r4.getKey();
        r1 = r1.toString();
        r0.append(r1);
        r1 = 61;
        r0.append(r1);
        r4 = r4.getValue();
        if (r4 == 0) goto L_0x003f;
    L_0x003c:
        r0.append(r4);
    L_0x003f:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0065;
    L_0x0045:
        r4 = 38;
        r0.append(r4);
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r2 = r4.getKey();
        r2 = r2.toString();
        r0.append(r2);
        r0.append(r1);
        r4 = r4.getValue();
        if (r4 == 0) goto L_0x003f;
    L_0x0064:
        goto L_0x003c;
    L_0x0065:
        r3 = r0.toString();
    L_0x0069:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.a(java.lang.CharSequence, java.util.Map):java.lang.String");
    }

    static String a(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    private static StringBuilder a(String str, StringBuilder stringBuilder) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            stringBuilder.append('/');
        }
        return stringBuilder;
    }

    private aisw b(CharSequence charSequence) {
        try {
            j();
            this.f.a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new c(e);
        }
    }

    private aisw b(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(str);
        if (str2 != null) {
            stringBuilder.append("\"; filename=\"");
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        c("Content-Disposition", stringBuilder.toString());
        if (str3 != null) {
            c("Content-Type", str3);
        }
        return b((CharSequence) "\r\n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    private static java.lang.String b(java.lang.String r8, java.lang.String r9) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x006f;
    L_0x0003:
        r1 = r8.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x006f;
    L_0x000a:
        r1 = r8.length();
        r2 = 59;
        r3 = r8.indexOf(r2);
        r4 = 1;
        r3 = r3 + r4;
        if (r3 == 0) goto L_0x006f;
    L_0x0018:
        if (r3 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x006f;
    L_0x001b:
        r5 = r8.indexOf(r2, r3);
        r6 = -1;
        if (r5 != r6) goto L_0x0023;
    L_0x0022:
        r5 = r1;
    L_0x0023:
        if (r3 >= r5) goto L_0x006f;
    L_0x0025:
        r7 = 61;
        r7 = r8.indexOf(r7, r3);
        if (r7 == r6) goto L_0x0066;
    L_0x002d:
        if (r7 >= r5) goto L_0x0066;
    L_0x002f:
        r3 = r8.substring(r3, r7);
        r3 = r3.trim();
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0066;
    L_0x003d:
        r7 = r7 + 1;
        r3 = r8.substring(r7, r5);
        r3 = r3.trim();
        r7 = r3.length();
        if (r7 == 0) goto L_0x0066;
    L_0x004d:
        r8 = 2;
        if (r7 <= r8) goto L_0x0065;
    L_0x0050:
        r8 = 0;
        r8 = r3.charAt(r8);
        r9 = 34;
        if (r9 != r8) goto L_0x0065;
    L_0x0059:
        r7 = r7 - r4;
        r8 = r3.charAt(r7);
        if (r9 != r8) goto L_0x0065;
    L_0x0060:
        r8 = r3.substring(r4, r7);
        return r8;
    L_0x0065:
        return r3;
    L_0x0066:
        r3 = r5 + 1;
        r5 = r8.indexOf(r2, r3);
        if (r5 != r6) goto L_0x0023;
    L_0x006e:
        goto L_0x0022;
    L_0x006f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if (r4.charAt(r2) != '&') goto L_0x000f;
     */
    private static java.lang.StringBuilder b(java.lang.String r4, java.lang.StringBuilder r5) {
        /*
        r0 = 63;
        r1 = r4.indexOf(r0);
        r2 = r5.length();
        r2 = r2 + -1;
        r3 = -1;
        if (r1 != r3) goto L_0x0013;
    L_0x000f:
        r5.append(r0);
        goto L_0x001e;
    L_0x0013:
        if (r1 >= r2) goto L_0x001e;
    L_0x0015:
        r4 = r4.charAt(r2);
        r0 = 38;
        if (r4 == r0) goto L_0x001e;
    L_0x001d:
        goto L_0x000f;
    L_0x001e:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.b(java.lang.String, java.lang.StringBuilder):java.lang.StringBuilder");
    }

    private aisw c(String str, String str2) {
        return b((CharSequence) str).b((CharSequence) ": ").b((CharSequence) str2).b((CharSequence) "\r\n");
    }

    private String c(String str) {
        i();
        int headerFieldInt = a().getHeaderFieldInt("Content-Length", -1);
        OutputStream byteArrayOutputStream = headerFieldInt > 0 ? new ByteArrayOutputStream(headerFieldInt) : new ByteArrayOutputStream();
        try {
            a(new BufferedInputStream(g(), this.a), byteArrayOutputStream);
            return byteArrayOutputStream.toString(aisw.a(str));
        } catch (IOException e) {
            throw new c(e);
        }
    }

    private HttpURLConnection f() {
        try {
            HttpURLConnection a = b.a(this.d);
            a.setRequestMethod(this.e);
            return a;
        } catch (IOException e) {
            throw new c(e);
        }
    }

    private InputStream g() {
        if (b() < 400) {
            try {
                return a().getInputStream();
            } catch (IOException e) {
                throw new c(e);
            }
        }
        InputStream errorStream = a().getErrorStream();
        if (errorStream != null) {
            return errorStream;
        }
        try {
            return a().getInputStream();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private aisw h() {
        e eVar = this.f;
        if (eVar == null) {
            return this;
        }
        if (this.g) {
            eVar.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.h) {
            try {
                this.f.close();
            } catch (IOException unused) {
            }
        } else {
            this.f.close();
        }
        this.f = null;
        return this;
    }

    private aisw i() {
        try {
            return h();
        } catch (IOException e) {
            throw new c(e);
        }
    }

    private aisw j() {
        if (this.f != null) {
            return this;
        }
        a().setDoOutput(true);
        this.f = new e(a().getOutputStream(), aisw.b(a().getRequestProperty("Content-Type"), "charset"), this.a);
        return this;
    }

    private aisw k() {
        e eVar;
        String str;
        if (this.g) {
            eVar = this.f;
            str = "\r\n--00content0boundary00\r\n";
        } else {
            this.g = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").j();
            eVar = this.f;
            str = "--00content0boundary00\r\n";
        }
        eVar.a(str);
        return this;
    }

    public final aisw a(String str, Number number) {
        return a(str, null, number != null ? number.toString() : null);
    }

    public final aisw a(String str, String str2) {
        a().setRequestProperty(str, str2);
        return this;
    }

    public final aisw a(String str, String str2, String str3) {
        try {
            k();
            b(str, null, null);
            this.f.a(str3);
            return this;
        } catch (IOException e) {
            throw new c(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A:{SYNTHETIC, Splitter:B:19:0x0024} */
    public final defpackage.aisw a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
        r3 = this;
        r0 = 0;
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x001b }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x001b }
        r2.<init>(r7);	 Catch:{ IOException -> 0x001b }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001b }
        r4 = r3.a(r4, r5, r6, r1);	 Catch:{ IOException -> 0x0016, all -> 0x0013 }
        r1.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        return r4;
    L_0x0013:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0022;
    L_0x0016:
        r4 = move-exception;
        r0 = r1;
        goto L_0x001c;
    L_0x0019:
        r4 = move-exception;
        goto L_0x0022;
    L_0x001b:
        r4 = move-exception;
    L_0x001c:
        r5 = new aisw$c;	 Catch:{ all -> 0x0019 }
        r5.<init>(r4);	 Catch:{ all -> 0x0019 }
        throw r5;	 Catch:{ all -> 0x0019 }
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):aisw");
    }

    public final aisw a(String str, String str2, String str3, InputStream inputStream) {
        try {
            k();
            b(str, str2, str3);
            a(inputStream, this.f);
            return this;
        } catch (IOException e) {
            throw new c(e);
        }
    }

    public final HttpURLConnection a() {
        if (this.c == null) {
            this.c = f();
        }
        return this.c;
    }

    public final int b() {
        try {
            h();
            return a().getResponseCode();
        } catch (IOException e) {
            throw new c(e);
        }
    }

    public final String b(String str) {
        i();
        return a().getHeaderField(str);
    }

    public final String c() {
        return c(aisw.b(b("Content-Type"), "charset"));
    }

    public final aisw d() {
        a().setConnectTimeout(10000);
        return this;
    }

    public final aisw e() {
        a().setUseCaches(false);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a().getRequestMethod());
        stringBuilder.append(' ');
        stringBuilder.append(a().getURL());
        return stringBuilder.toString();
    }
}
