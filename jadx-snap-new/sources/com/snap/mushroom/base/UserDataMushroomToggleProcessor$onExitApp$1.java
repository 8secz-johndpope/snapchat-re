package com.snap.mushroom.base;

import defpackage.aasi;
import defpackage.ajev;

final class UserDataMushroomToggleProcessor$onExitApp$1 implements ajev {
    final /* synthetic */ aasi $toggleSource;
    final /* synthetic */ UserDataMushroomToggleProcessor this$0;

    UserDataMushroomToggleProcessor$onExitApp$1(UserDataMushroomToggleProcessor userDataMushroomToggleProcessor, aasi aasi) {
        this.this$0 = userDataMushroomToggleProcessor;
        this.$toggleSource = aasi;
    }

    public final void run() {
        this.this$0.logOptOutMetrics(this.$toggleSource);
    }
}
