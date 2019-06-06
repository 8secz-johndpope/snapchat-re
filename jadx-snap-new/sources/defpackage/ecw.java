package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: ecw */
public enum ecw {
    MAIN,
    SCAN,
    VIDEO_CHAT_PREVIEW,
    ANDROID_VIDEO_RECORDER,
    SC_VIDEO_RECORDER,
    SCREENSHOT,
    SCREENSHOT_PLUS,
    ANDROID_ORIGINAL_VIDEO_RECORDER,
    CUSTOM;
    
    public static final Collection<ecw> values = null;

    static {
        values = ImmutableList.copyOf(ecw.values());
    }
}
