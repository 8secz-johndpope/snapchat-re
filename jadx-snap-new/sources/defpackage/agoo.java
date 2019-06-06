package defpackage;

/* renamed from: agoo */
public enum agoo {
    UNKNOWN(0),
    GROUP_CUSTOM_STORY(1),
    GROUP_GEOFENCED_STORY(2),
    GROUP_PRIVATE_STORY(3),
    FEATURED(4),
    FEATURED_STORY_YEAR_END_STORY(5),
    SPECTACLES_SERVER_CREATED_STORY(6),
    FEATURED_STORY_FLASHBACK(7),
    FEATURED_STORY_TRIP(8),
    FEATURED_STORY_MONTHLY_REVIEW(9),
    GROUP_CHAT_STORY(10),
    PUBLISHER_STORY(11),
    FEATURED_STORY_SPECS(12),
    OTHER_SNAPCHATTERS(13),
    FEATURED_STORY_SPECS_HIGHLIGHT(14),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agoo(int i) {
        this.intValue = i;
    }

    public static agoo a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agoo[] values = agoo.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].intValue == num.intValue()) {
                return values[i];
            }
        }
        return UNRECOGNIZED_VALUE;
    }

    public final int a() {
        return this.intValue;
    }
}
