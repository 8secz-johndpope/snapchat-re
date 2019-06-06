package defpackage;

import android.view.KeyEvent.Callback;
import com.snap.mushroom.MainActivity;

/* renamed from: rul */
public final class rul implements aiqc<Callback> {
    private final ajwy<zhb> a;
    private final ajwy<MainActivity> b;
    private final ajwy<achb<zjm, zjk>> c;
    private final ajwy<zkq> d;
    private final ajwy<ajei> e;

    public static Callback a(zhb zhb, MainActivity mainActivity, achb<zjm, zjk> achb, zkq zkq, ajei ajei) {
        return (Callback) aiqf.a(rtw.a(zhb, mainActivity, (achb) achb, zkq, ajei), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return rul.a((zhb) this.a.get(), (MainActivity) this.b.get(), (achb) this.c.get(), (zkq) this.d.get(), (ajei) this.e.get());
    }
}
