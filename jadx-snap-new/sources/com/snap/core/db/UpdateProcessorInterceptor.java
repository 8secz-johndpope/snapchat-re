package com.snap.core.db;

import defpackage.aecy;
import defpackage.aerc;
import defpackage.aert;
import defpackage.akcr;
import defpackage.gjy;
import defpackage.idd;

public final class UpdateProcessorInterceptor implements gjy {
    private final idd callsite = SnapDbInternalFeature.INSTANCE.callsite("UpdateProcessorInterceptor");
    private UpdatesManager updatesManager;

    public final void intercept(Object obj) {
        akcr.b(obj, "o");
        UpdatesManager updatesManager = this.updatesManager;
        if (updatesManager != null) {
            if ((obj instanceof aecy) && !(obj instanceof aert)) {
                updatesManager.applyUpdates((aecy) obj, this.callsite).e();
            } else if (obj instanceof aerc) {
                updatesManager.applyUpdates((aerc) obj, this.callsite).e();
            }
        }
    }

    public final void setUpdatesManager(UpdatesManager updatesManager) {
        akcr.b(updatesManager, "updatesManager");
        this.updatesManager = updatesManager;
    }
}
