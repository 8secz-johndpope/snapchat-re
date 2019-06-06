package com.snapchat.bridgeWebview;

import android.webkit.ValueCallback;
import com.samsung.android.sdk.camera.SCamera;

public class WebGLDetectionCallback implements ValueCallback<String> {
    private final a mCallback;

    public interface a {
        void onReceivedSupportLevel(WebGLSupportLevel webGLSupportLevel);
    }

    public WebGLDetectionCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void onReceiveValue(String str) {
        WebGLSupportLevel webGLSupportLevel = WebGLSupportLevel.UNKNOWN;
        if (str != null) {
            int i = -1;
            int hashCode = str.hashCode();
            if (hashCode != 48) {
                if (hashCode != 49) {
                    if (hashCode == 1444 && str.equals("-1")) {
                        i = 0;
                    }
                } else if (str.equals(SCamera.CAMERA_ID_FRONT)) {
                    i = 2;
                }
            } else if (str.equals("0")) {
                i = 1;
            }
            if (i == 0) {
                webGLSupportLevel = WebGLSupportLevel.NOT_SUPPORTED;
            } else if (i == 1) {
                webGLSupportLevel = WebGLSupportLevel.DISABLED;
            } else if (i == 2) {
                webGLSupportLevel = WebGLSupportLevel.ENABLED;
            }
        }
        this.mCallback.onReceivedSupportLevel(webGLSupportLevel);
    }
}
