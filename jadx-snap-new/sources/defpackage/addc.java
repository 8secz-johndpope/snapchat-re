package defpackage;

import android.net.Uri;

/* renamed from: addc */
public final class addc {
    static final Uri a;
    static final Uri b;
    static final Uri c;
    public static final Uri d;
    static final Uri e;
    public static final Uri f;

    /* renamed from: addc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        Object parse = Uri.parse("snapchat://map");
        akcr.a(parse, "Uri.parse(BASE_MAP_URL)");
        a = parse;
        parse = Uri.parse("snapchat://map/settings");
        akcr.a(parse, "Uri.parse(\"$BASE_MAP_URL/$PATH_SETTINGS\")");
        b = parse;
        parse = Uri.parse("snapchat://map/friend");
        akcr.a(parse, "Uri.parse(\"$BASE_MAP_URL/$PATH_FRIEND\")");
        c = parse;
        parse = Uri.parse("snapchat://map/group");
        akcr.a(parse, "Uri.parse(\"$BASE_MAP_URL/$PATH_GROUP\")");
        d = parse;
        akcr.a(Uri.parse("snapchat://map/coord"), "Uri.parse(\"$BASE_MAP_URL/$PATH_COORDINATES\")");
        akcr.a(Uri.parse("snapchat://map/poi"), "Uri.parse(\"$BASE_MAP_URL/$PATH_POI\")");
        parse = Uri.parse("snapchat://map/explore");
        akcr.a(parse, "Uri.parse(\"$BASE_MAP_URL/$PATH_EXPLORE\")");
        e = parse;
        parse = Uri.parse("snapchat://map/passport");
        akcr.a(parse, "Uri.parse(\"$BASE_MAP_URL/$PATH_PASSPORT\")");
        f = parse;
    }
}
