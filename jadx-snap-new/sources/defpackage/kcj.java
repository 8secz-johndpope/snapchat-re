package defpackage;

import defpackage.fth.a;

/* renamed from: kcj */
public enum kcj implements fth {
    FORCE_SHOW_INSIGHTS(a.a(false)),
    IS_POPULAR_USER(a.a(false)),
    IS_OFFICIAL_USER(a.a(false)),
    IS_OFFICIAL_COLLABORATOR(a.a(false)),
    SNAP_PRO_MANAGEMENT_ENABLED(a.a(false)),
    SNAP_PRO_COMPOSER_MANAGEMENT_ENABLED(a.a(false)),
    COMPOSER_MEGAPROFILE_ENABLED(a.a(false)),
    SNAP_PRO_PUBLISHER_PROFILE_ENABLED(a.a(false)),
    STAGING_ACCOUNT_SERVICE(a.a(false)),
    STAGING_STORY_SERVICE(a.a(false)),
    DEV_SHOWS_SERVICE(a.a(false)),
    STAGING_INSIGHTS_SERVICE(a.a(false)),
    STAGING_LENS_SERVICE(a.a(false)),
    LENS_PROFILE_ENABLED(a.a(false)),
    FRIENDSHIP_PROFILE_PUBLIC_PROFILE_ENTRY_POINT_ENABLED(a.a(false));
    
    private final a<?> delegate;

    private kcj(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SNAP_PRO;
    }
}
