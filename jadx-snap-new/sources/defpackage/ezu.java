package defpackage;

import com.google.gson.reflect.TypeToken;
import com.snapchat.bridgeWebview.WebGLSupportLevel;
import defpackage.fth.a;
import java.util.Set;

/* renamed from: ezu */
public enum ezu implements fth {
    WEBGL_STATUS(a.a(WebGLSupportLevel.UNKNOWN.getSupportLevel())),
    HAS_CHECKED_WEBGL(a.a(false)),
    PLAYED_APP_LIST(a.a(new 1().getType(), "[]")),
    HAS_SEEN_CHAT_DOCK_TOOLTIP(a.a(false)),
    HAS_SEEN_VPL_TOOLTIP(a.a(false)),
    HAS_ENABLED_VPL(a.a(false)),
    HAS_SEEN_RING_TOOLTIP(a.a(false)),
    HAS_ENABLED_RING(a.a(false)),
    HAS_SEEN_DRAWER_DIALOG(a.a(false)),
    HAS_SEEN_DRAWER_TOOLTIP(a.a(false)),
    HAS_OPENED_DRAWER(a.a(false)),
    LAST_LOAD_APP_LIST_TIMESTAMP(a.a(0)),
    ENABLE_COGNAC(a.a(true)),
    ENABLE_COGNAC_APP_1(a.a(false)),
    ENABLE_WEBVIEW_DEBUG(a.a(false)),
    DISABLE_RATE_LIMIT(a.a(false)),
    CHOOSE_ORGANIZATION(a.a(ezx.NONE)),
    CACHE_APP_LIST(a.a(ezd.a.DISABLE)),
    COGNAC_DOCK_ZONE_DISTANCE(a.a(80.0f)),
    COGNAC_DOCK_RESISTANCE(a.a(0.6f)),
    ENABLE_APP_PROFILE(a.a(false)),
    ENABLE_APP_PERFORMANCE_LOGGING(a.a(false)),
    ENABLE_COGNAC_AD_TOAST_MESSAGE(a.a(false)),
    COGNAC_GATING_ENABLED(a.a(false)),
    COGNAC_RV_RATE_LIMIT(a.a(Long.MAX_VALUE)),
    COGNAC_BACKGROUND_PRELOAD(a.a(false)),
    COGNAC_PRELOAD_ON_FEED(a.a(false)),
    INACTIVE_DAYS_THRESHOLD(a.a(0)),
    COGNAC_BACKGROUND_PRELOAD_COUNT(a.a(0)),
    COGNAC_NOTIFICATION_EXPIRATION_THRESHOLD(a.a(120)),
    COGNAC_AD_COUNT(a.a(0)),
    COGNAC_AD_CAP_SEC(a.a(0)),
    COGNAC_AD_ENABLED(a.a(false)),
    COGNAC_AD_DURATION_SEC(a.a(0)),
    COGNAC_APPLIST_EXPIRATION_IN_SECONDS(a.a(0));
    
    private final a<?> delegate;

    /* renamed from: ezu$1 */
    static class 1 extends TypeToken<Set<String>> {
        1() {
        }
    }

    private ezu(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.COGNAC;
    }
}
