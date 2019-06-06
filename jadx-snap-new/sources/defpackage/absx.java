package defpackage;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import com.snap.core.db.record.CharmsModel;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: absx */
public final class absx {

    /* renamed from: absx$a */
    public enum a {
        ADS("Ads"),
        AD_CONTENT("Ad Content"),
        AD_FREQUENCY("Ad Frequency"),
        AD_RELEVANCE("Ad Relevance"),
        APP_EXTENSION("App Extension"),
        APP_NAVIGATION("App Navigation"),
        APP_STARTUP("App Startup"),
        BATTERY("Battery"),
        BITMOJI("Bitmoji", b.BITMOJI),
        BLACK_CAMERA("Black Camera"),
        BLACK_SNAPS("Black Snaps"),
        CALLING("Calling"),
        CAMERA("Camera"),
        CHARMS(CharmsModel.TABLE_NAME),
        CHAT("Chat"),
        COGNAC("Cognac"),
        COMMERCE("Commerce"),
        CONNECTED_APPS("Connected Apps"),
        CONTEXT("Context"),
        DISCOVER_FEED("Discover Feed", b.DISCOVER_FEED),
        FILTERS("Filters"),
        FRIENDING("Friending"),
        FRIENDS_FEED("Friends Feed", b.FRIENDS_FEED),
        IMPALA("Impala"),
        INTERACTIVE_SHOW("Interactive Show"),
        LENS("Lens"),
        LOGIN("Login"),
        MAP("Map"),
        MEDIA_QUALITY("Media Quality"),
        MEMORIES("Memories"),
        MUSIC("Music"),
        NETWORK("Network"),
        NOTIFICATIONS("Notifications"),
        ON_DEMAND("On Demand Geofilter"),
        ONBOARDING("Onboarding"),
        PAYMENTS("Payments"),
        PAYMENTS_V2("Payments V2"),
        PLAYBACK("Playback"),
        PRESENCE("Presence"),
        PROFILE("Profile", b.PROFILE),
        REGISTRATION("Registration"),
        SCAN("Scan"),
        SEARCH(LensTextInputConstants.RETURN_KEY_TYPE_SEARCH, b.SEARCH),
        SECURITY("Security"),
        SELF_SERVE("Self Serve Ads"),
        SENDING("Sending"),
        SEND_TO("Send To"),
        SETTINGS("Settings"),
        SHAKE_TO("Shake To Report"),
        SNAP_EDITING("Snap Editing"),
        SNAPS("Snaps"),
        SPECTACLES("Spectacles"),
        STICKERS("Stickers"),
        STORAGE("Storage"),
        STORIES("Stories", b.STORIES),
        TOOLS("Tools"),
        UI_STICKINESS("UI Stickiness");
        
        private final String projectName;
        private final b subProjects;

        private a(String str) {
            this.projectName = str;
            this.subProjects = b.EMPTY;
        }

        private a(String str, b bVar) {
            this.projectName = str;
            this.subProjects = bVar;
        }

        public static Set<String> a() {
            TreeSet treeSet = new TreeSet();
            for (a aVar : a.values()) {
                treeSet.add(aVar.projectName);
            }
            return treeSet;
        }
    }

    /* renamed from: absx$b */
    enum b {
        BITMOJI("3D Bitmoji", "Content", "Friends", "Identity", "ODG Mobile", "Presence", "Profile", "Stickers"),
        SEARCH("Google Quality", "Hero Card", "Location", "Location - Around Me", "Location - Current Place", "More/Other Stories", "Search Quality", "Visual Product Search"),
        FRIENDS_FEED("Friends Screen", "Friend Rankings", "Group Story", "Mushroom", "Stories", "Tabs"),
        DISCOVER_FEED("Barracuda"),
        STORIES("Ads", "Custom Stories", "Maps", r1, "Story Management"),
        PROFILE("Friends", r1, "Snapcode"),
        EMPTY(new String[0]);
        
        private final String[] subprojects;

        private b(String... strArr) {
            this.subprojects = strArr;
        }
    }
}
