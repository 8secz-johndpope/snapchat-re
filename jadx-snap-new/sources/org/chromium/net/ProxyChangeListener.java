package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import defpackage.akon;
import defpackage.ppy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.UsedByReflection;

@UsedByReflection
public class ProxyChangeListener {
    static boolean a = true;
    private static /* synthetic */ boolean f = (ProxyChangeListener.class.desiredAssertionStatus() ^ 1);
    final Looper b = Looper.myLooper();
    final Handler c = new Handler(this.b);
    long d;
    ProxyReceiver e;

    @UsedByReflection
    class ProxyReceiver extends BroadcastReceiver {
        private ProxyReceiver() {
        }

        /* synthetic */ ProxyReceiver(ProxyChangeListener proxyChangeListener, byte b) {
            this();
        }

        static a a(Intent intent) {
            String str = "Using no proxy configuration due to exception:";
            String str2 = "ProxyChangeListener";
            try {
                String str3;
                String str4;
                if (VERSION.SDK_INT < 21) {
                    str3 = "android.net.ProxyProperties";
                    str4 = "proxy";
                } else {
                    str3 = "android.net.ProxyInfo";
                    str4 = "android.intent.extra.PROXY_INFO";
                }
                Object obj = intent.getExtras().get(str4);
                if (obj == null) {
                    return null;
                }
                Class cls = Class.forName(str3);
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                str4 = (String) declaredMethod.invoke(obj, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
                String[] split = VERSION.SDK_INT < 21 ? ((String) declaredMethod3.invoke(obj, new Object[0])).split(ppy.b) : (String[]) declaredMethod3.invoke(obj, new Object[0]);
                String str5 = "getPacFileUrl";
                if (VERSION.SDK_INT >= 19) {
                    if (VERSION.SDK_INT < 21) {
                        String str6 = (String) cls.getDeclaredMethod(str5, new Class[0]).invoke(obj, new Object[0]);
                        if (!TextUtils.isEmpty(str6)) {
                            return new a(str4, intValue, str6, split);
                        }
                        return new a(str4, intValue, null, split);
                    }
                }
                if (VERSION.SDK_INT >= 21) {
                    Uri uri = (Uri) cls.getDeclaredMethod(str5, new Class[0]).invoke(obj, new Object[0]);
                    if (!Uri.EMPTY.equals(uri)) {
                        return new a(str4, intValue, uri.toString(), split);
                    }
                }
                return new a(str4, intValue, null, split);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                Log.e(str2, str.concat(String.valueOf(e)));
                return null;
            }
        }

        @UsedByReflection
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                AnonymousClass1 anonymousClass1 = new Runnable() {
                    public final void run() {
                        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                        ProxyReceiver proxyReceiver = ProxyReceiver.this;
                        a a = ProxyReceiver.a(intent);
                        if (ProxyChangeListener.a && proxyReceiver == proxyChangeListener.e && proxyChangeListener.d != 0) {
                            if (a != null) {
                                proxyChangeListener.nativeProxySettingsChangedTo(proxyChangeListener.d, a.a, a.b, a.c, a.d);
                                return;
                            }
                            proxyChangeListener.nativeProxySettingsChanged(proxyChangeListener.d);
                        }
                    }
                };
                if ((proxyChangeListener.b == Looper.myLooper() ? 1 : null) != null) {
                    anonymousClass1.run();
                    return;
                }
                proxyChangeListener.c.post(anonymousClass1);
            }
        }
    }

    static class a {
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        public a(String str, int i, String str2, String[] strArr) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = strArr;
        }
    }

    private ProxyChangeListener() {
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public native void nativeProxySettingsChanged(long j);

    public native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    @CalledByNative
    public void start(long j) {
        if (f || this.d == 0) {
            this.d = j;
            if (this.e == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PROXY_CHANGE");
                this.e = new ProxyReceiver(this, (byte) 0);
                akon.a.registerReceiver(this.e, intentFilter);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @CalledByNative
    public void stop() {
        this.d = 0;
        if (this.e != null) {
            akon.a.unregisterReceiver(this.e);
            this.e = null;
        }
    }
}
