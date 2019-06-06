package defpackage;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;

/* renamed from: idi */
// Project
public enum idi {
    APP_PLATFORM("APP"),
    MEDIA_DELIVERY_PLATFORM("MDP"),
    DATA_PLATFORM("DATP"),
    OPERA(r2, "Playback"),
    SECURITY("SEC", "Security"),
    APP_INSIGHTS("APPINS"),
    RESEARCH("RES"),
    BITMOJI("BM", "Bitmoji"),
    BROADCAST("BRO"),
    COGNAC("COG"),
    CORE_CAMERA("CCAM", "Camera"),
    USER_FRIENDS("IDT"),
    CAMERA_PLATFORM("LOOK"),
    COMMUNICATIONS("CONVO", "Chat"),
    CREATIVE_TOOLS("CREATE", "Snap Editing"),
    MEMORIES("MEM", "Memories"),
    RANKING(AlphabeticScrollbar.a, LensTextInputConstants.RETURN_KEY_TYPE_SEARCH),
    SNAP_ADS("ADS", "Ads"),
    ADD_LIVE("ADL"),
    MAPS("MAPS", "Map"),
    SPONSORED_CREATIVE_TOOLS("SCT"),
    COMMERCE("PROEXP"),
    SPECTACLES("SPECENG", "Spectacles"),
    SNAPKIT("SNAPKIT"),
    PRODUCT_EXPERIENCE("PROEXP", "Profile"),
    IMPALA("IMPALA", "Impala"),
    DISCOVER_FEED("DF", "Discover Feed"),
    FRIENDS_FEED("FF", "Friends Feed"),
    WEB("WEB", "Web"),
    STORIES("STORIES");

    public final String label;
    public final String projectName;

    private idi(String str, String str2) {
        akcr.b(str, "projectName");
        this.projectName = str;
        this.label = str2;
    }
}
