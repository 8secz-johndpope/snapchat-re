package defpackage;

import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: uzo */
public final class uzo {
    private final Map<Class<? extends uqh>, Set<urv>> a;

    public uzo(Map<Class<? extends uqh>, ? extends Set<? extends urv>> map) {
        akcr.b(map, "dispatchers");
        this.a = map;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUnifiedProfileEvent(uqh uqh) {
        akcr.b(uqh, "event");
        Set<urv> set = (Set) this.a.get(uqh.getClass());
        if (set != null) {
            for (urv a : set) {
                a.a(uqh);
            }
        }
    }
}
