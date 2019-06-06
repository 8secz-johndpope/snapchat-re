package com.mapbox.mapboxsdk.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.BuildConfig;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akgx;
import defpackage.akgy;
import defpackage.akhm;
import defpackage.akhq;
import defpackage.akht.a;
import defpackage.akhv;
import defpackage.akib;
import defpackage.alsj;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;

public class HTTPRequest implements akgy, RequestReceiver {
    private static final int CONNECTION_ERROR = 0;
    private static final int PERMANENT_ERROR = 2;
    private static final int TEMPORARY_ERROR = 1;
    private static String USER_AGENT_STRING;
    private static akhq sClient;
    private static RequestMaker sImpl;
    private akgx mCall;
    private String mCancelKey;
    private ReentrantLock mLock = new ReentrantLock();
    private long mNativePtr = 0;

    private HTTPRequest(long j, String str, String str2, String str3) {
        this.mNativePtr = j;
        try {
            if (sImpl != null) {
                this.mCancelKey = sImpl.request(str, str2, str3, getUserAgent(), this);
                return;
            }
            akhm e = akhm.e(str);
            String toLowerCase = e.b.toLowerCase(MapboxConstants.MAPBOX_LOCALE);
            if (toLowerCase.equals("mapbox.com") || toLowerCase.endsWith(".mapbox.com") || toLowerCase.equals("mapbox.cn") || toLowerCase.endsWith(".mapbox.cn")) {
                StringBuilder stringBuilder;
                if ((e.e != null ? e.e.size() / 2 : 0) == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("?");
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("&");
                }
                String stringBuilder2 = stringBuilder.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("events=true");
                str = stringBuilder3.toString();
            }
            a a = new a().a(str);
            a.e = str.toLowerCase(MapboxConstants.MAPBOX_LOCALE);
            a = a.b("User-Agent", getUserAgent());
            if (str2.length() > 0) {
                a = a.b("If-None-Match", str2);
            } else if (str3.length() > 0) {
                a = a.b("If-Modified-Since", str3);
            }
            synchronized (HTTPRequest.class) {
                if (sClient == null) {
                    sClient = new akhq();
                }
            }
            this.mCall = sClient.newCall(a.a());
            this.mCall.a(this);
        } catch (Exception e2) {
            onFailure(e2);
        }
    }

    private static String getApplicationIdentifier() {
        try {
            Context applicationContext = Mapbox.getApplicationContext();
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            return String.format("%s/%s (%s)", new Object[]{applicationContext.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized String getUserAgent() {
        synchronized (HTTPRequest.class) {
            String a;
            if (USER_AGENT_STRING == null) {
                a = akib.a(String.format("%s %s (%s) Android/%s (%s)", new Object[]{getApplicationIdentifier(), BuildConfig.MAPBOX_VERSION_STRING, BuildConfig.GIT_REVISION_SHORT, Integer.valueOf(VERSION.SDK_INT), Build.CPU_ABI}));
                USER_AGENT_STRING = a;
                return a;
            }
            a = USER_AGENT_STRING;
            return a;
        }
    }

    private native void nativeOnFailure(int i, String str);

    private native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public static void setClient(akhq akhq) {
        sClient = akhq;
    }

    public static void setImpl(RequestMaker requestMaker) {
        sImpl = requestMaker;
    }

    public void cancel() {
        akgx akgx = this.mCall;
        if (akgx != null) {
            akgx.c();
        }
        RequestMaker requestMaker = sImpl;
        if (requestMaker != null) {
            String str = this.mCancelKey;
            if (str != null) {
                requestMaker.cancel(str);
            }
        }
        this.mLock.lock();
        this.mNativePtr = 0;
        this.mLock.unlock();
    }

    public void onFailure(akgx akgx, IOException iOException) {
        onFailure(iOException);
    }

    public void onFailure(Exception exception) {
        int i = ((exception instanceof NoRouteToHostException) || (exception instanceof UnknownHostException) || (exception instanceof SocketException) || (exception instanceof ProtocolException) || (exception instanceof SSLException)) ? 0 : exception instanceof InterruptedIOException ? 1 : 2;
        String message = exception.getMessage() != null ? exception.getMessage() : "Error processing the request";
        if (i == 1) {
            alsj.b(String.format(MapboxConstants.MAPBOX_LOCALE, "Request failed due to a temporary error: %s", new Object[]{message}), new Object[0]);
        } else if (i == 0) {
            alsj.b.c(String.format(MapboxConstants.MAPBOX_LOCALE, "Request failed due to a connection error: %s", new Object[]{message}), new Object[0]);
        } else {
            alsj.c(String.format(MapboxConstants.MAPBOX_LOCALE, "Request failed due to a permanent error: %s", new Object[]{message}), new Object[0]);
        }
        this.mLock.lock();
        if (this.mNativePtr != 0) {
            nativeOnFailure(i, message);
        }
        this.mLock.unlock();
    }

    public void onResponse(akgx akgx, akhv akhv) {
        try {
            if (akhv.c()) {
                alsj.a(String.format("[HTTP] Request was successful (code = %d).", new Object[]{Integer.valueOf(akhv.c)}), new Object[0]);
            } else {
                String str = !TextUtils.isEmpty(akhv.d) ? akhv.d : "No additional information";
                alsj.b(String.format("[HTTP] Request with response code = %d: %s", new Object[]{Integer.valueOf(akhv.c), str}), new Object[0]);
            }
            try {
                byte[] e = akhv.g.e();
                akhv.g.close();
                this.mLock.lock();
                if (this.mNativePtr != 0) {
                    onSuccess(akhv.c, akhv.b("ETag"), akhv.b("Last-Modified"), akhv.b("Cache-Control"), akhv.b("Expires"), akhv.b("Retry-After"), akhv.b("x-rate-limit-reset"), e);
                }
                this.mLock.unlock();
                akhv.close();
            } catch (IOException e2) {
                onFailure(e2);
                akhv.g.close();
                akhv.close();
            }
        } catch (Throwable th) {
            akhv.close();
        }
    }

    public void onSuccess(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.mLock.lock();
        if (this.mNativePtr != 0) {
            nativeOnResponse(i, str, str2, str3, str4, str5, str6, bArr);
        }
        this.mLock.unlock();
    }
}
