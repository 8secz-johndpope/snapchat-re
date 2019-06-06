package defpackage;

import defpackage.fth.a;

/* renamed from: nfg */
public enum nfg implements fth {
    NYC_SETTINGS_HAS_SET_GHOST_MODE(a.a(false)),
    NYC_SETTINGS_GHOST_MODE(a.a(true)),
    NYC_SETTINGS_HAS_GHOST_MODE_DURATION(a.a(false)),
    NYC_SETTINGS_AUDIENCE(a.a(nch.CUSTOM.toString())),
    NYC_SETTINGS_SYNC_TIMESTAMP(a.a(0)),
    NYC_SETTINGS_PENDING_SYNC(a.a(false)),
    NYC_SETTINGS_FETCHED_FROM_SERVER(a.a(false)),
    NYC_SETTINGS_GHOST_MODE_DURATION_TO_SET(a.a(0)),
    NYC_SETTINGS_HAS_PASSIVE(a.a(false)),
    NYC_HAS_ONBOARDED(a.a(false)),
    NYC_SHOW_DIALOG_LEAVING_GHOST_MODE(a.a(false)),
    NYC_LAST_LOCATION_LATITUDE(a.a(Float.MIN_VALUE)),
    NYC_LAST_LOCATION_LONGITUDE(a.a(Float.MIN_VALUE)),
    MUSHROOM_MIGRATOR_PERFORMED_MIGRATION(a.a(false)),
    ANDROID_ONLY_FUSED_LOCATION_PROVIDER(a.a(false));
    
    private final a<?> delegate;

    private nfg(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.INTERNAL_LOCATION;
    }
}
