package defpackage;

import com.snap.mushroom.MainActivity;
import com.snap.mushroom.base.MainActivityInjector;
import defpackage.rvj.a.a;

/* renamed from: rvh */
public final class rvh implements MainActivityInjector {
    private final a a;

    public rvh(a aVar) {
        this.a = aVar;
    }

    public final void inject(MainActivity mainActivity) {
        this.a.a(mainActivity).a().a(mainActivity);
    }
}
