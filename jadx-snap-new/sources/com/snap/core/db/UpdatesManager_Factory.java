package com.snap.core.db;

import com.snap.core.db.api.SnapDb;
import defpackage.aiqc;
import defpackage.ajwy;
import java.util.Set;

public final class UpdatesManager_Factory implements aiqc<UpdatesManager> {
    private final ajwy<Set<AllUpdatesProcessor>> allUpdatesProcessorsProvider;
    private final ajwy<Set<LocDataUpdatesProcessor>> locDataUpdatesProcessorsProvider;
    private final ajwy<SnapDb> snapDbProvider;

    public UpdatesManager_Factory(ajwy<SnapDb> ajwy, ajwy<Set<AllUpdatesProcessor>> ajwy2, ajwy<Set<LocDataUpdatesProcessor>> ajwy3) {
        this.snapDbProvider = ajwy;
        this.allUpdatesProcessorsProvider = ajwy2;
        this.locDataUpdatesProcessorsProvider = ajwy3;
    }

    public static UpdatesManager_Factory create(ajwy<SnapDb> ajwy, ajwy<Set<AllUpdatesProcessor>> ajwy2, ajwy<Set<LocDataUpdatesProcessor>> ajwy3) {
        return new UpdatesManager_Factory(ajwy, ajwy2, ajwy3);
    }

    public static UpdatesManager newUpdatesManager(ajwy<SnapDb> ajwy, ajwy<Set<AllUpdatesProcessor>> ajwy2, ajwy<Set<LocDataUpdatesProcessor>> ajwy3) {
        return new UpdatesManager(ajwy, ajwy2, ajwy3);
    }

    public static UpdatesManager provideInstance(ajwy<SnapDb> ajwy, ajwy<Set<AllUpdatesProcessor>> ajwy2, ajwy<Set<LocDataUpdatesProcessor>> ajwy3) {
        return new UpdatesManager(ajwy, ajwy2, ajwy3);
    }

    public final UpdatesManager get() {
        return provideInstance(this.snapDbProvider, this.allUpdatesProcessorsProvider, this.locDataUpdatesProcessorsProvider);
    }
}
