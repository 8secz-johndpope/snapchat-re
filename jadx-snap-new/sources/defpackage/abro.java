package defpackage;

@Deprecated
/* renamed from: abro */
public enum abro implements abrl {
    HAS_GIVEN_ACCESS_TO_CONTACTS("has_given_access_to_contacts", abrq.BOOLEAN, true),
    APP_APPLICATION_OPEN_CLIENT_TS("app_application_open_client_ts", abrq.LONG, true),
    DAILY_CLIENT_ID("daily_client_id", abrq.STRING, true),
    DAILY_CLIENT_ID_TIMESTAMP("daily_client_id_timestamp", abrq.LONG, true),
    IS_USER_SPECIFIC_LOCATION_PERMISSION_MODE_ACTIVATED("is_user_specific_location_permission_mode_activated_v_10_29", abrq.BOOLEAN, true),
    LAST_SUCCESSFUL_LOGIN_USERNAME("lastSuccessfulLoginUsername", abrq.STRING, true),
    APP_INSTALL_LOGGED("app_install_logged", abrq.BOOLEAN, true),
    APP_DEEPLINK_INSTALL_LOGGED("app_deeplink_install_logged", abrq.BOOLEAN, true),
    APP_INSTALL_DEVICE_HISTORY_LOGGED("app_install_device_history_logged", abrq.BOOLEAN, true),
    HAS_VISITED_SPLASH_BEFORE("has_visited_splash_before", abrq.BOOLEAN, true),
    PERSISTED_CUSTOM_STICKERS("persisted_custom_stickers", abrq.STRING, false);
    
    final String mKey;
    final boolean mShouldPersistOnLogout;
    final abrq mType;

    private abro(String str, abrq abrq, boolean z) {
        this.mKey = str;
        this.mType = abrq;
        this.mShouldPersistOnLogout = z;
    }

    public final String a() {
        return this.mKey;
    }

    public final abrq b() {
        return this.mType;
    }
}
