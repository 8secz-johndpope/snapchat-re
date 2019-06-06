package org.chromium.base;

import android.annotation.SuppressLint;
import defpackage.akon;
import defpackage.akop;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.annotations.CalledByNative;

public class ApplicationStatus {
    static a a;
    public static final akop<a> b = new akop();
    private static final Object c = new Object();
    @SuppressLint({"SupportAnnotationUsage"})
    private static Integer d = Integer.valueOf(4);

    public interface a {
    }

    static {
        if ((ApplicationStatus.class.desiredAssertionStatus() ^ 1) == 0 && (akon.a().contains(":") ^ 1) == 0 && !akon.a().contains(":test")) {
            StringBuilder stringBuilder = new StringBuilder("Cannot use ApplicationState from process: ");
            stringBuilder.append(akon.a());
            throw new AssertionError(stringBuilder.toString());
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        akop akop = new akop();
        akop = new akop();
    }

    private ApplicationStatus() {
    }

    public static void a(a aVar) {
        b.a((Object) aVar);
    }

    @CalledByNative
    public static int getStateForApplication() {
        int intValue;
        synchronized (c) {
            intValue = d.intValue();
        }
        return intValue;
    }

    private static native void nativeOnApplicationStateChange(int i);

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        AnonymousClass1 anonymousClass1 = new Runnable() {
            public final void run() {
                if (ApplicationStatus.a == null) {
                    AnonymousClass1 anonymousClass1 = new a() {
                    };
                    ApplicationStatus.a = anonymousClass1;
                    ApplicationStatus.a(anonymousClass1);
                }
            }
        };
        if (ThreadUtils.b()) {
            anonymousClass1.run();
        } else {
            ThreadUtils.a().post(anonymousClass1);
        }
    }
}
