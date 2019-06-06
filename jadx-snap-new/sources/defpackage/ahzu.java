package defpackage;

import java.util.Locale;

/* renamed from: ahzu */
public enum ahzu {
    LIVE_CAMERA(r2),
    PREVIEW(r3),
    MEMORIES(r4),
    VIDEO_CHAT(r5),
    REPLY_CAMERA(r6),
    PREVIEW_NO_FACE(r7),
    AD_TO_LENS(r8),
    SPECTACLES(r8),
    STORY_REPLY("STORY_REPLY"),
    REPLY_TO_SNAP("REPLY_TO_SNAP"),
    NEWPORT("NEWPORT"),
    SNAP_3D("SNAP_3D"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahzu(String str) {
        this.value = str;
    }

    public static ahzu a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahzu.valueOf(str.toUpperCase(Locale.US));
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
