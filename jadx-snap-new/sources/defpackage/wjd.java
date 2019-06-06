package defpackage;

import com.google.common.base.Optional;

/* renamed from: wjd */
public enum wjd {
    LOCATION_SPRINKLER("https://auth.snapchat.com/snap_token/api/location-sprinkler"),
    STORIES_MIXER("https://auth.snapchat.com/snap_token/api/stories-mixer"),
    INSTANT_LOGGER("https://auth.snapchat.com/snap_token/api/instant-logger"),
    GTQ_UNLOCKABLES("https://auth.snapchat.com/snap_token/api/gtq-unlockables"),
    BUSINESS_ACCOUNTS("https://auth.snapchat.com/snap_token/api/business-accounts"),
    SERIALIZED_SHOWS("https://auth.snapchat.com/snap_token/api/serialized-shows"),
    MAP_GAMES("https://auth.snapchat.com/snap_token/api/map-games"),
    PUPPY("https://auth.snapchat.com/snap_token/api/puppy-cms"),
    COGNAC("https://auth.snapchat.com/snap_token/api/cognac"),
    TIGER("https://auth.snapchat.com/snap_token/api/tiger"),
    COBRA("https://auth.snapchat.com/snap_token/api/cobra"),
    API_GATEWAY("https://auth.snapchat.com/snap_token/api/api-gateway"),
    SNAP_KIT("https://auth.snapchat.com/snap_token/api/snap-connect-snap-kit"),
    LOGIN_KIT("https://auth.snapchat.com/snap_token/api/snap-connect-login-kit"),
    ORANGE_INTERACTIVE("https://auth.snapchat.com/snap_token/api/interactive-shows"),
    EAGLE("https://auth.snapchat.com/snap_token/api/eagle"),
    DDML("https://auth.snapchat.com/snap_token/api/ddml"),
    EXPLORE("https://auth.snapchat.com/snap_token/api/map-explore");
    
    public final String mServerSideScopeName;

    private wjd(String str) {
        this.mServerSideScopeName = str;
    }

    public static Optional<wjd> a(String str) {
        for (wjd wjd : wjd.values()) {
            if (wjd.mServerSideScopeName.equals(str)) {
                return Optional.of(wjd);
            }
        }
        return Optional.absent();
    }

    public final String a() {
        return this.mServerSideScopeName;
    }
}
