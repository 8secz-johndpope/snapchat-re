package defpackage;

import com.google.common.base.Optional;

/* renamed from: sdm */
public final class sdm implements sdn {
    private final Optional<sdn> a;

    public sdm(Optional<sdn> optional) {
        akcr.b(optional, "inAppNotificationPolicySetter");
        this.a = optional;
    }

    public final void a(zjm zjm) {
        akcr.b(zjm, "mainPageType");
        if (this.a.isPresent()) {
            ((sdn) this.a.get()).a(zjm);
        }
    }

    public final void a(zjm zjm, sdl sdl) {
        akcr.b(zjm, "mainPageType");
        akcr.b(sdl, "inAppNotificationPolicy");
        if (this.a.isPresent()) {
            ((sdn) this.a.get()).a(zjm, sdl);
        }
    }
}
