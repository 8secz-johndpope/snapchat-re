package defpackage;

import java.util.Locale;

/* renamed from: aeib */
public enum aeib {
    SEQUENCE_OUT_OF_SYNC("sequence_out_of_sync"),
    SEQUENCE_GAP_CHAT("sequence_gap_chat"),
    SEQUENCE_GAP_SNAP("sequence_gap_snap"),
    SEQUENCE_GAP_CHAT_STATE("sequence_gap_chat_state"),
    MISSING_CONVERSATION("missing_conversation"),
    MISSING_MESSAGE("missing_message"),
    FETCHING_SNAP("fetching_snap"),
    LOADING_HISTORY("loading_history"),
    NOTIFICATION("notification"),
    UNRECOGNIZED_VALUE(r11);
    
    private final String value;

    private aeib(String str) {
        this.value = str;
    }

    public static aeib a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeib.valueOf(str.toUpperCase(Locale.US));
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
