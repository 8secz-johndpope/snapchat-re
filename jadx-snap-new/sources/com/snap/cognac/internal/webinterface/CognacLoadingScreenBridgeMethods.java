package com.snap.cognac.internal.webinterface;

import com.google.common.collect.ImmutableSet;
import com.snapchat.bridgeWebview.Message;
import defpackage.acbq;
import defpackage.ajdp;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.fgz;
import defpackage.fha.a;
import defpackage.fha.b;
import java.util.Map;
import java.util.Set;

public class CognacLoadingScreenBridgeMethods extends fgz {
    private static final String TAG = "CognacLoadingScreenBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("setLoadingProgress", "loadingComplete");
    private final ajws<Double> mProgressObservable = new ajwo();

    public CognacLoadingScreenBridgeMethods(acbq acbq) {
        super(acbq);
    }

    public Set<String> getMethods() {
        return methods;
    }

    public ajdp<Double> listenForLoadingProgress() {
        return this.mProgressObservable;
    }

    public void loadingComplete(Message message) {
        this.mProgressObservable.a();
    }

    public void setLoadingProgress(Message message) {
        Object obj = message.params;
        if (isValidParamsMap(obj)) {
            Double d = (Double) ((Map) obj).get("progress");
            if (d.doubleValue() < 0.0d || d.doubleValue() > 1.0d) {
                errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
                return;
            } else {
                this.mProgressObservable.a((Object) d);
                return;
            }
        }
        errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
    }
}
