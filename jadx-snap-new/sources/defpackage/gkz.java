package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: gkz */
public enum gkz {
    DISCOVER_DSNAP("discover_publisher_snap"),
    DISCOVER_ICONS("discover_feed_thumbnail"),
    USER_PUBLIC_STORY_SNAP(r3),
    USER_PRIVATE_STORY_SNAP(r4),
    DISCOVER_STORIES(r3),
    BITMOJI("bitmoji"),
    FRIEND_STORIES(r4),
    GEOFILTER("external_geofilter"),
    STICKER_ASSET("snap_sticker"),
    CHAT_SNAP("snap"),
    LENS_ASSET("lens_content"),
    MEMORIES_SNAP("memories_media");
    
    public static final a Companion = null;
    static final ajxe contentTypeToMediaContextType$delegate = null;
    final String contentTypeName;

    /* renamed from: gkz$a */
    public static final class a {
        static {
            new aken[1][0] = new akdc(akde.a(a.class), "contentTypeToMediaContextType", "getContentTypeToMediaContextType()Ljava/util/Map;");
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static String a(String str) {
            akcr.b(str, "contentType");
            String str2 = (String) a.a().get(str);
            if (str2 != null) {
                return str2;
            }
            Object toUpperCase = str.toUpperCase();
            akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase()");
            return toUpperCase;
        }

        private static Map<String, String> a() {
            return (Map) gkz.contentTypeToMediaContextType$delegate.b();
        }
    }

    /* renamed from: gkz$b */
    static final class b extends akcs implements akbk<Map<String, ? extends String>> {
        public static final b a = null;

        static {
            a = new b();
        }

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            gkz[] values = gkz.values();
            Collection arrayList = new ArrayList(values.length);
            for (gkz gkz : values) {
                arrayList.add(ajxs.a(gkz.contentTypeName, gkz.toString()));
            }
            return ajzm.a((Iterable) (List) arrayList);
        }
    }

    static {
        Companion = new a();
        contentTypeToMediaContextType$delegate = ajxh.a(b.a);
    }

    private gkz(String str) {
        this.contentTypeName = str;
    }
}
