package com.brightcove.player.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class HttpService {
    public static final int DEFAULT_CONNECT_TIMEOUT = 10000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;
    public static final String TAG = "HttpService";
    private int a = 10000;
    private int b = 10000;

    enum a {
        GET,
        POST
    }

    public HttpService(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private static int a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("calculateInSampleSize: height = ");
        stringBuilder.append(i3);
        stringBuilder.append(", width = ");
        stringBuilder.append(i4);
        stringBuilder.append(", maxWidth = ");
        stringBuilder.append(i);
        String str2 = ", maxHeight = ";
        stringBuilder.append(str2);
        stringBuilder.append(i2);
        Log.v(str, stringBuilder.toString());
        int i5 = i4 * i2;
        int i6 = i * i3;
        if (i5 > i6) {
            i2 = i6 / i4;
        } else if (i5 < i6) {
            i = i5 / i3;
        }
        str = TAG;
        stringBuilder = new StringBuilder("calculateInSampleSize: maxWidth = ");
        stringBuilder.append(i);
        stringBuilder.append(str2);
        stringBuilder.append(i2);
        Log.v(str, stringBuilder.toString());
        i5 = 1;
        if (i3 > i2 || i4 > i) {
            i3 /= 2;
            i4 /= 2;
            while (i3 / i5 > i2 && i4 / i5 > i) {
                i5 <<= 1;
            }
        }
        return i5;
    }

    private Bitmap a(URL url, int i, int i2) {
        Throwable th;
        Options options = new Options();
        URLConnection openConnection;
        try {
            openConnection = url.openConnection();
            try {
                openConnection.setConnectTimeout(this.a);
                openConnection.setReadTimeout(this.b);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openConnection.getInputStream(), null, options);
                options.inSampleSize = a(options, i, i2);
                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                    ((HttpURLConnection) openConnection).disconnect();
                }
                String str = TAG;
                String str2 = "decodeSampledBitmap: total memory = ";
                StringBuilder stringBuilder = new StringBuilder(str2);
                stringBuilder.append(Runtime.getRuntime().totalMemory());
                Log.v(str, stringBuilder.toString());
                try {
                    openConnection = url.openConnection();
                    openConnection.setConnectTimeout(this.a);
                    openConnection.setReadTimeout(this.b);
                    options.inJustDecodeBounds = false;
                    Bitmap decodeStream = BitmapFactory.decodeStream(openConnection.getInputStream(), null, options);
                    str = TAG;
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(Runtime.getRuntime().totalMemory());
                    Log.v(str, stringBuilder.toString());
                    return decodeStream;
                } finally {
                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                        ((HttpURLConnection) openConnection).disconnect();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                    ((HttpURLConnection) openConnection).disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openConnection = null;
            ((HttpURLConnection) openConnection).disconnect();
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x0137 in {10, 18, 21, 25, 26, 28, 30, 32, 34, 41, 42, 46, 47, 49, 53, 54, 56, 58} preds:[]
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
    private java.lang.String a(com.brightcove.player.media.HttpService.a r5, java.net.URI r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        r4 = this;
        if (r6 == 0) goto L_0x012b;
        if (r7 == 0) goto L_0x011f;
        r6 = r6.toURL();
        r0 = TAG;
        r1 = new java.lang.StringBuilder;
        r2 = "issuing ";
        r1.<init>(r2);
        r1.append(r5);
        r2 = " request: ";
        r1.append(r2);
        r2 = r6.toString();
        r1.append(r2);
        r2 = ", headers: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        r0 = 0;
        r6 = r6.openConnection();	 Catch:{ IOException -> 0x00f1 }
        r1 = r4.a;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r6.setConnectTimeout(r1);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = r4.b;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r6.setReadTimeout(r1);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = r6 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r1 == 0) goto L_0x008e;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = r6;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = com.brightcove.player.media.HttpService.a.POST;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r5.equals(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r5 == 0) goto L_0x0052;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = "POST";	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.setRequestMethod(r5);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r7.entrySet();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r5.iterator();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = r5.hasNext();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r7 == 0) goto L_0x008e;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = r5.next();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = (java.util.Map.Entry) r7;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = r7.getKey();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = (java.lang.String) r2;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = com.brightcove.player.util.StringUtil.isEmpty(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r2 != 0) goto L_0x005a;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = r7.getValue();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = (java.lang.String) r2;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = com.brightcove.player.util.StringUtil.isEmpty(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r2 != 0) goto L_0x005a;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = r7.getKey();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = (java.lang.String) r2;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = r7.getValue();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = (java.lang.String) r7;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.setRequestProperty(r2, r7);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        goto L_0x005a;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r6.getInputStream();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r0 = inputStreamToString(r5);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = TAG;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = "response: ";	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = r7.concat(r1);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        android.util.Log.d(r5, r7);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r6 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r5 == 0) goto L_0x00da;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r6;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = (java.net.HttpURLConnection) r5;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = TAG;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = "code: ";	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = r5.getResponseCode();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.append(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        android.util.Log.d(r7, r1);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r7 = TAG;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r2 = "message: ";	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r5.getResponseMessage();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r1.append(r5);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        r5 = r1.toString();	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        android.util.Log.d(r7, r5);	 Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
        if (r6 == 0) goto L_0x00e5;
        r5 = r6 instanceof java.net.HttpURLConnection;
        if (r5 == 0) goto L_0x00e5;
        r6 = (java.net.HttpURLConnection) r6;
        r6.disconnect();
        r5 = r0;
        goto L_0x0111;
        r5 = move-exception;
        goto L_0x0113;
        r5 = move-exception;
        r3 = r0;
        r0 = r6;
        r6 = r3;
        goto L_0x00f3;
        r5 = move-exception;
        r6 = r0;
        goto L_0x0113;
        r5 = move-exception;
        r6 = r0;
        r7 = r0 instanceof java.net.HttpURLConnection;	 Catch:{ all -> 0x00ee }
        if (r7 == 0) goto L_0x0112;	 Catch:{ all -> 0x00ee }
        r5 = r0;	 Catch:{ all -> 0x00ee }
        r5 = (java.net.HttpURLConnection) r5;	 Catch:{ all -> 0x00ee }
        r5 = r5.getErrorStream();	 Catch:{ all -> 0x00ee }
        if (r5 == 0) goto L_0x0105;	 Catch:{ all -> 0x00ee }
        r5 = inputStreamToString(r5);	 Catch:{ all -> 0x00ee }
        goto L_0x0106;
        r5 = r6;
        if (r0 == 0) goto L_0x0111;
        r6 = r0 instanceof java.net.HttpURLConnection;
        if (r6 == 0) goto L_0x0111;
        r0 = (java.net.HttpURLConnection) r0;
        r0.disconnect();
        return r5;
        throw r5;	 Catch:{ all -> 0x00ee }
        if (r6 == 0) goto L_0x011e;
        r7 = r6 instanceof java.net.HttpURLConnection;
        if (r7 == 0) goto L_0x011e;
        r6 = (java.net.HttpURLConnection) r6;
        r6.disconnect();
        throw r5;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "headersRequired";
        r6 = com.brightcove.player.util.ErrorUtil.getMessage(r6);
        r5.<init>(r6);
        throw r5;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "uriRequired";
        r6 = com.brightcove.player.util.ErrorUtil.getMessage(r6);
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.HttpService.a(com.brightcove.player.media.HttpService$a, java.net.URI, java.util.Map):java.lang.String");
    }

    private JSONObject b(a aVar, URI uri, Map<String, String> map) {
        String a = a(aVar, uri, (Map) map);
        if (a == null || a.trim().isEmpty() || a.equals("null")) {
            return null;
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "JSON response:\n".concat(String.valueOf(a)));
        }
        if (a.startsWith("[") && a.endsWith("]")) {
            a = a.substring(1, a.length() - 1);
        }
        return parseToJSONObject(a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0090 in {5, 8, 9, 21, 23, 25, 27} preds:[]
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
    public static java.net.URI buildURIWithQueryParameters(java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
        if (r4 == 0) goto L_0x0084;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r4);
        if (r5 == 0) goto L_0x007a;
        r1 = r5.size();
        if (r1 != 0) goto L_0x0010;
        goto L_0x007a;
        r1 = "?";
        r4 = r4.contains(r1);
        r2 = "&";
        if (r4 == 0) goto L_0x001e;
        r0.append(r2);
        goto L_0x0021;
        r0.append(r1);
        r4 = r5.entrySet();
        r4 = r4.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0070;
        r5 = r4.next();
        r5 = (java.util.Map.Entry) r5;
        if (r5 == 0) goto L_0x0029;
        r1 = r5.getKey();
        if (r1 == 0) goto L_0x0029;
        r1 = r5.getValue();
        if (r1 == 0) goto L_0x0029;
        r1 = r5.getKey();
        r1 = (java.lang.String) r1;
        r3 = "UTF-8";
        r1 = java.net.URLEncoder.encode(r1, r3);
        r0.append(r1);
        r1 = "=";
        r0.append(r1);
        r5 = r5.getValue();
        r5 = r5.toString();
        r5 = java.net.URLEncoder.encode(r5, r3);
        r0.append(r5);
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0029;
        r0.append(r2);
        goto L_0x0029;
        r4 = new java.net.URI;
        r5 = r0.toString();
        r4.<init>(r5);
        return r4;
        r4 = new java.net.URI;
        r5 = r0.toString();
        r4.<init>(r5);
        return r4;
        r4 = new java.lang.IllegalArgumentException;
        r5 = "baseURLRequired";
        r5 = com.brightcove.player.util.ErrorUtil.getMessage(r5);
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.HttpService.buildURIWithQueryParameters(java.lang.String, java.util.Map):java.net.URI");
    }

    public static String inputStreamToString(InputStream inputStream) {
        return readerToString(new InputStreamReader(inputStream));
    }

    public static JSONObject parseToJSONObject(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.JSON_REQUIRED));
        }
        Object nextValue = new JSONTokener(str).nextValue();
        if (nextValue instanceof JSONObject) {
            return (JSONObject) nextValue;
        }
        if (nextValue instanceof JSONArray) {
            throw new JSONException(ErrorUtil.getMessage(ErrorUtil.JSON_ARRAY));
        }
        throw new JSONException(String.format(ErrorUtil.getMessage(ErrorUtil.UNEXPECTED_TYPE), new Object[]{nextValue.getClass().getName()}));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0021 in {5, 7, 10} preds:[]
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
    public static java.lang.String readerToString(java.io.Reader r2) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = new java.io.BufferedReader;
        r1.<init>(r2);
        r2 = r1.readLine();	 Catch:{ all -> 0x001c }
        if (r2 == 0) goto L_0x0014;	 Catch:{ all -> 0x001c }
        r0.append(r2);	 Catch:{ all -> 0x001c }
        goto L_0x000a;
        r1.close();
        r2 = r0.toString();
        return r2;
        r2 = move-exception;
        r1.close();
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.HttpService.readerToString(java.io.Reader):java.lang.String");
    }

    public String doGetRequest(URI uri) {
        return doGetRequest(uri, new HashMap());
    }

    public String doGetRequest(URI uri, Map<String, String> map) {
        return a(a.GET, uri, (Map) map);
    }

    public Bitmap doImageGetRequest(URI uri) {
        if (uri != null) {
            URL toURL = uri.toURL();
            URLConnection uRLConnection = null;
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("issuing GET request: ");
            stringBuilder.append(toURL.toString());
            Log.d(str, stringBuilder.toString());
            try {
                uRLConnection = toURL.openConnection();
                uRLConnection.setConnectTimeout(this.a);
                uRLConnection.setReadTimeout(this.b);
                Bitmap decodeStream = BitmapFactory.decodeStream(uRLConnection.getInputStream());
                String str2 = TAG;
                StringBuilder stringBuilder2 = new StringBuilder("doImageGetRequest: total memory = ");
                stringBuilder2.append(Runtime.getRuntime().totalMemory());
                Log.v(str2, stringBuilder2.toString());
                return decodeStream;
            } finally {
                if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
            }
        } else {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URI_REQUIRED));
        }
    }

    public Bitmap doImageGetRequest(URI uri, int i, int i2) {
        if (uri != null) {
            return a(uri.toURL(), i, i2);
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URI_REQUIRED));
    }

    public JSONObject doJSONGetRequest(URI uri) {
        return doJSONGetRequest(uri, new HashMap());
    }

    public JSONObject doJSONGetRequest(URI uri, Map<String, String> map) {
        return b(a.GET, uri, map);
    }

    public JSONObject doJSONPostRequest(URI uri) {
        return doJSONPostRequest(uri, new HashMap());
    }

    public JSONObject doJSONPostRequest(URI uri, Map<String, String> map) {
        return b(a.POST, uri, map);
    }

    public String doPostRequest(URI uri) {
        return doPostRequest(uri, new HashMap());
    }

    public String doPostRequest(URI uri, Map<String, String> map) {
        return a(a.POST, uri, (Map) map);
    }

    public int getConnectTimeout() {
        return this.a;
    }

    public int getReadTimeout() {
        return this.b;
    }
}
