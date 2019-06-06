package defpackage;

import java.util.Set;

/* renamed from: acbo */
public abstract class acbo {
    public final acbq mBridgeWebview;
    public final ajei mDisposable = new ajei();
    public final abst mGson = abst.a();

    public acbo(acbq acbq) {
        this.mBridgeWebview = acbq;
    }

    public void clear() {
        this.mDisposable.a();
    }

    public abstract Set<String> getMethods();
}
