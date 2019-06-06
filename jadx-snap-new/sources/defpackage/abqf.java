package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

/* renamed from: abqf */
public enum abqf {
    NONE(r1, r1),
    LIGHT("🏻", "1f3fb"),
    MEDIUM_LIGHT("🏼", "1f3fc"),
    MEDIUM("🏽", "1f3fd"),
    MEDIUM_DARK("🏾", "1f3fe"),
    DARK("🏿", "1f3ff");
    
    private static Set<String> BASE_UNICODE_EMOJIS_WITH_SKIN_SUPPORT;
    public static List<abqf> SUPPORTED_EMOJI_SKIN_TONES;
    static List<abqf> SUPPORTED_EMOJI_SKIN_TONES_WITHOUT_NONE;
    final String mHexCodeString;
    final String mUnicodeString;

    static {
        SUPPORTED_EMOJI_SKIN_TONES = ImmutableList.of(r7, r8, r9, r10, r11, r12);
        SUPPORTED_EMOJI_SKIN_TONES_WITHOUT_NONE = ImmutableList.of(LIGHT, MEDIUM_LIGHT, MEDIUM, MEDIUM_DARK, DARK);
        BASE_UNICODE_EMOJIS_WITH_SKIN_SUPPORT = ImmutableSet.of("☝", "⛹", "✊", "✋", "✌", "✍", "🎅", "🏃", "🏄", "🏇", "🏊", "🏋", "🏌", "👂", "👃", "👆", "👇", "👈", "👉", "👊", "👋", "👌", "👍", "👎", "👏", "👐", "👦", "👧", "👨", "👩", "👮", "👰", "👱", "👲", "👳", "👴", "👵", "👶", "👷", "👸", "👼", "💁", "💂", "💃", "💅", "💆", "💇", "💪", "🕴", "🕵", "🕺", "🖐", "🖕", "🖖", "🙅", "🙆", "🙇", "🙋", "🙌", "🙍", "🙎", "🙏", "🚣", "🚴", "🚵", "🚶", "🛀", "🤘", "🤙", "🤚", "🤛", "🤜", "🤞", "🤦", "🤰", "🤳", "🤴", "🤵", "🤶", "🤷", "🤸", "🤹", "🤽", "🤾");
    }

    private abqf(String str, String str2) {
        this.mUnicodeString = str;
        this.mHexCodeString = str2;
    }

    public static boolean a(String str) {
        for (abqf abqf : SUPPORTED_EMOJI_SKIN_TONES_WITHOUT_NONE) {
            if (abqf.mUnicodeString.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static abqf b(String str) {
        for (abqf abqf : SUPPORTED_EMOJI_SKIN_TONES_WITHOUT_NONE) {
            if (str.contains(abqf.mUnicodeString)) {
                return abqf;
            }
        }
        return NONE;
    }
}
