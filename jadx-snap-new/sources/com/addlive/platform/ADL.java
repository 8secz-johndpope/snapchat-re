package com.addlive.platform;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.addlive.Constants;
import com.addlive.djinni.LogicError;
import com.addlive.djinni.Service;
import com.addlive.djinni.VoidResponder;
import org.webrtc.ContextUtils;

public class ADL {
    private static boolean librariesLoaded;

    private static VoidResponder getUiThreadResponderWrapper(final VoidResponder voidResponder, Context context) {
        final Handler handler = new Handler(context.getMainLooper());
        return new VoidResponder() {
            public final void onCompletion() {
                handler.post(new Runnable() {
                    public void run() {
                        voidResponder.onCompletion();
                    }
                });
            }

            public final void onError(final int i, final String str) {
                handler.post(new Runnable() {
                    public void run() {
                        voidResponder.onError(i, str);
                    }
                });
            }
        };
    }

    private static synchronized void loadLibraries(Context context) {
        synchronized (ADL.class) {
            if (librariesLoaded) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder("AddLive");
            stringBuilder.append(Constants.SDK_VERSION());
            String stringBuilder2 = stringBuilder.toString();
            System.loadLibrary("protobuf");
            System.loadLibrary(stringBuilder2);
            stringBuilder2 = Constants.LOG_TAG;
            StringBuilder stringBuilder3 = new StringBuilder("Addlive loading took ");
            stringBuilder3.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuilder3.append("ms");
            Log.v(stringBuilder2, stringBuilder3.toString());
            ContextUtils.initialize(context);
            Service.androidInit(context);
            librariesLoaded = true;
        }
    }

    private static synchronized void loadLibrariesAsync(final VoidResponder voidResponder, final Context context) {
        synchronized (ADL.class) {
            if (librariesLoaded) {
                voidResponder.onCompletion();
                return;
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        ADL.loadLibraries(context);
                        voidResponder.onCompletion();
                    } catch (UnsatisfiedLinkError e) {
                        StringBuilder stringBuilder = new StringBuilder("Cannot initialize the AddLive SDK as the native components are not available. Error message: ");
                        stringBuilder.append(e.toString());
                        Log.v(Constants.LOG_TAG, stringBuilder.toString());
                        voidResponder.onError(LogicError.PLATFORM_INIT_FAILED, "Failed to load the AddLive native components");
                    }
                }
            }).start();
        }
    }

    public static void preloadLibraries(VoidResponder voidResponder, Context context) {
        loadLibrariesAsync(getUiThreadResponderWrapper(voidResponder, context), context);
    }
}
