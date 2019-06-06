package defpackage;

import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import java.util.Locale;

/* renamed from: afnd */
public enum afnd {
    AUTHENTICATION(r2),
    ANALYTICS(r3),
    BITMOJI(r4),
    CALLING(r5),
    CAMERA(r6),
    CHAT(r7),
    CONTEXT(r8),
    CUSTOM_STICKERS(r8),
    DEBUG("DEBUG"),
    DISCOVER("DISCOVER"),
    GEOFILTER("GEOFILTER"),
    LENS("LENS"),
    REGISTRATION("REGISTRATION"),
    MAPS("MAPS"),
    MEMORIES("MEMORIES"),
    MUSIC("MUSIC"),
    NAVIGATION("NAVIGATION"),
    NOTIFICATIONS("NOTIFICATIONS"),
    PROFILE("PROFILE"),
    SEARCH(AlphabeticScrollbar.a),
    SPECTACLES("SPECTACLES"),
    SNAPADS("SNAPADS"),
    SNAPCODES("SNAPCODES"),
    SNAPCRAFT("SNAPCRAFT"),
    STICKERS("STICKERS"),
    STORIES("STORIES"),
    TROPHIES("TROPHIES"),
    UNKNOWN("UNKNOWN"),
    SNAPCASH("SNAPCASH"),
    CONFIGURATION("CONFIGURATION"),
    FRIENDS("FRIENDS"),
    MOBILE_ODG("MOBILE_ODG"),
    STARTUP("STARTUP"),
    DISK("DISK"),
    SNAP("SNAP"),
    NETWORK_INFRA("NETWORK_INFRA"),
    DDML("DDML"),
    OAUTH2("OAUTH2"),
    SNAP_TOKEN("SNAP_TOKEN"),
    FIDELIUS("FIDELIUS"),
    COMMERCE("COMMERCE"),
    SNAP_KIT("SNAP_KIT"),
    BOLT("BOLT"),
    COGNAC("COGNAC"),
    CHAT_GROUP_CREATE("CHAT_GROUP_CREATE"),
    CHAT_GROUP_HAMBURGER("CHAT_GROUP_HAMBURGER"),
    CHAT_HAMBURGER("CHAT_HAMBURGER"),
    CHAT_MEDIA("CHAT_MEDIA"),
    FRIENDS_FEED("FRIENDS_FEED"),
    SEND_TO("SEND_TO"),
    STICKERS_CHAT("STICKERS_CHAT"),
    STICKERS_PREVIEW("STICKERS_PREVIEW"),
    STICKERS_ODG("STICKERS_ODG"),
    STORIES_BITMOJI("STORIES_BITMOJI"),
    CHAT_AUTOSUGGEST("CHAT_AUTOSUGGEST"),
    COMMERCE_PLATFORM("COMMERCE_PLATFORM"),
    INTERNAL_TOOLS("INTERNAL_TOOLS"),
    PROFILE_PUBLIC("PROFILE_PUBLIC"),
    CHARMS("CHARMS"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afnd(String str) {
        this.value = str;
    }

    public static afnd a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afnd.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
