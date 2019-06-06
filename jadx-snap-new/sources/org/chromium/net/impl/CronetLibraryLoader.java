package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.akon;
import defpackage.akoo;
import defpackage.akpg;
import defpackage.akqg;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifier;

public class CronetLibraryLoader {
    private static final Object a = new Object();
    private static final String b = "cronet.69.0.3497.100";
    private static final String c = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread d = new HandlerThread("CronetInit");
    private static volatile boolean e = false;
    private static volatile boolean f = false;
    private static final ConditionVariable g = new ConditionVariable();
    private static /* synthetic */ boolean h = (CronetLibraryLoader.class.desiredAssertionStatus() ^ 1);

    static void a() {
        if (!h && !b()) {
            throw new AssertionError();
        } else if (!f) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.a().a(true, new akpg());
            g.block();
            if (h || e) {
                nativeCronetInitOnInitThread();
                f = true;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void a(Context context) {
        synchronized (a) {
            if (!f) {
                if (akon.a != null) {
                    if (akon.a != context) {
                        throw new RuntimeException("Attempting to set multiple global application contexts.");
                    }
                }
                if (context != null) {
                    akon.a = context;
                    if (!d.isAlive()) {
                        d.start();
                    }
                    a(new Runnable() {
                        public final void run() {
                            CronetLibraryLoader.a();
                        }
                    });
                } else {
                    throw new RuntimeException("Global application context cannot be set to null.");
                }
            }
            if (!e) {
                System.loadLibrary(b);
                if ("69.0.3497.100".equals(nativeGetCronetVersion())) {
                    akoo.a(c, "Cronet version: %s, arch: %s", "69.0.3497.100", System.getProperty("os.arch"));
                    e = true;
                    g.open();
                } else {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[]{"69.0.3497.100", nativeGetCronetVersion()}));
                }
            }
        }
    }

    public static void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            new Handler(d.getLooper()).post(runnable);
        }
    }

    private static boolean b() {
        return d.getLooper() == Looper.myLooper();
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        synchronized (a) {
            e = true;
            g.open();
        }
        Context context = akon.a;
        if (h || context != null) {
            a(context);
            return;
        }
        throw new AssertionError();
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return akqg.a(akon.a);
    }

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();
}
