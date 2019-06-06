package defpackage;

/* renamed from: gcn */
public enum gcn {
    CAMERA(abbd.CAMERA, abaw.CAMERA),
    CHAT(abbd.CHAT, abaw.IN_CHAT),
    FEED_DOUBLE_TAP(abbd.FEED, abaw.FEED),
    FEED_REPLY_BUTTON(abbd.FEED, abaw.FEED_SNAP_REPLY),
    SEND_TO(abbd.SEND_TO, null),
    DISCOVER(abbd.DISCOVER, abaw.DISCOVER),
    STORY(abbd.STORY, abaw.STORY),
    SHARE(abbd.SHARE, abaw.SHARE),
    LENS(abbd.LENS, null),
    LENS_FEED(abbd.LENS, abaw.FEED),
    LENS_STORY(abbd.LENS, abaw.STORY),
    GALLERY(abbd.GALLERY, abaw.GALLERY),
    CAMERA_ROLL(abbd.CAMERA_ROLL, abaw.CAMERA_ROLL),
    GALLERY_SEND_TO(abbd.GALLERY_SEND_TO, abaw.GALLERY_SEND_TO),
    MINI_PROFILE(abbd.MINI_PROFILE, abaw.MINI_PROFILE),
    SEARCH_CONTACT(abbd.SEARCH_CONTACT, abaw.SEARCH_CONTACT),
    SNAPCODE(abbd.SNAPCODE, null),
    SEARCH_NEW_FRIENDS(abbd.SEARCH_NEW_FRIENDS, null),
    STORY_MANAGEMENT(abbd.MY_STORY_SINGLE_SNAP, abaw.STORY_SETTINGS),
    PROFILE(abbd.PROFILE, abaw.PROFILE),
    MAP(abbd.MAP, null),
    MAP_SCREENSHOT(abbd.MAP, abaw.MAP_SCREENSHOT),
    MAP_EXPLORE(abbd.MAP_EXPLORE, null),
    MAP_REPLY(abbd.MAP, abaw.MAP_REPLY),
    CONTEXT_CARDS(abbd.CONTEXT_CARDS, null),
    SEARCH_UNSPECIFIED(abbd.SEARCH_UNSPECIFIED, null),
    SHAZAM(abbd.SHAZAM, null),
    SNAP_CONTEXT_REPLY(abbd.CONTEXT_CARDS, abaw.CONTEXT_REPLY),
    STORY_CONTEXT_REPLY(abbd.STORY, abaw.CONTEXT_REPLY),
    MAP_CONTEXT_REPLY(abbd.MAP, abaw.CONTEXT_REPLY);
    
    public static final a Companion = null;
    public final abaw snapSource;
    public final abbd sourceType;

    /* renamed from: gcn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static gcn a(abbd abbd, abaw abaw) {
            akcr.b(abbd, "sourceType");
            switch (gco.b[abbd.ordinal()]) {
                case 1:
                    return gcn.CAMERA;
                case 2:
                    return gcn.CHAT;
                case 3:
                    return abaw == abaw.FEED ? gcn.FEED_DOUBLE_TAP : gcn.FEED_REPLY_BUTTON;
                case 4:
                    return gcn.SEND_TO;
                case 5:
                    return gcn.DISCOVER;
                case 6:
                    return abaw == abaw.CONTEXT_REPLY ? gcn.STORY_CONTEXT_REPLY : gcn.STORY;
                case 7:
                    return gcn.SHARE;
                case 8:
                    if (abaw != null) {
                        int i = gco.a[abaw.ordinal()];
                        if (i == 1) {
                            return gcn.LENS_FEED;
                        }
                        if (i == 2) {
                            return gcn.LENS_STORY;
                        }
                    }
                    return gcn.LENS;
                case 9:
                    return gcn.GALLERY;
                case 10:
                    return gcn.CAMERA_ROLL;
                case 11:
                    return gcn.GALLERY_SEND_TO;
                case 12:
                    return gcn.STORY_MANAGEMENT;
                case 13:
                    return gcn.MINI_PROFILE;
                case 14:
                    return gcn.SEARCH_CONTACT;
                case 15:
                    return gcn.SNAPCODE;
                case 16:
                    return gcn.SHAZAM;
                case 17:
                    return gcn.SEARCH_NEW_FRIENDS;
                case 18:
                    return gcn.PROFILE;
                case 19:
                    return abaw == abaw.CONTEXT_REPLY ? gcn.MAP_CONTEXT_REPLY : gcn.MAP;
                case 20:
                    return gcn.MAP_EXPLORE;
                case 21:
                    return abaw == abaw.CONTEXT_REPLY ? gcn.SNAP_CONTEXT_REPLY : gcn.CONTEXT_CARDS;
                case 22:
                    return gcn.SEARCH_UNSPECIFIED;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unsupported source type ");
                    stringBuilder.append(abbd.name());
                    stringBuilder.append(" snap source ");
                    stringBuilder.append(abaw != null ? abaw.name() : null);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    static {
        Companion = new a();
    }

    private gcn(abbd abbd, abaw abaw) {
        this.sourceType = abbd;
        this.snapSource = abaw;
    }
}
