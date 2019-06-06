package defpackage;

import com.snapchat.android.framework.misc.AppContext;

/* renamed from: dqt */
public final class dqt {
    public static aipn<dqt> a;
    private final dpf b;

    public dqt(dpf dpf) {
        this.b = dpf;
    }

    public static dqt a() {
        return (dqt) a.get();
    }

    public final adhl b() {
        return !this.b.g() ? adhl.GLES20 : adhl.a(AppContext.get());
    }
}
