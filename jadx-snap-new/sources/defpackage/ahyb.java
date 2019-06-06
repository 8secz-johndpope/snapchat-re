package defpackage;

import java.util.Locale;

/* renamed from: ahyb */
public enum ahyb {
    UNKNOWN_CTA(r2),
    APP_STORE(r3),
    APPLY(r4),
    APPLY_NOW(r5),
    BOOK_NOW(r6),
    BUY_TICKETS(r7),
    CHAT(r8),
    DOWNLOAD(r8),
    EDIT_SEND("EDIT_SEND"),
    EXPLORE("EXPLORE"),
    FIND_OUT("FIND_OUT"),
    GET_NOW("GET_NOW"),
    INSTALL_NOW("INSTALL_NOW"),
    LEARN_MORE("LEARN_MORE"),
    LISTEN("LISTEN"),
    MORE("MORE"),
    NOTIFY_ME("NOTIFY_ME"),
    OPEN_LINK("OPEN_LINK"),
    ORDER("ORDER"),
    ORDER_NOW("ORDER_NOW"),
    PLAY("PLAY"),
    PLAY_GAME("PLAY_GAME"),
    PLAY_STORE("PLAY_STORE"),
    READ("READ"),
    RESPOND("RESPOND"),
    SHOP("SHOP"),
    SHOP_NOW("SHOP_NOW"),
    SHOW("SHOW"),
    SHOWTIMES("SHOWTIMES"),
    SIGN_UP("SIGN_UP"),
    SUBSCRIBE("SUBSCRIBE"),
    SWIPE_UP("SWIPE_UP"),
    TAKE_POLL("TAKE_POLL"),
    TAKE_QUIZ("TAKE_QUIZ"),
    TRY("TRY"),
    TRY_NOW("TRY_NOW"),
    USE_APP("USE_APP"),
    VIEW("VIEW"),
    VIEW_MORE("VIEW_MORE"),
    VOTE("VOTE"),
    VOTE_NOW("VOTE_NOW"),
    WATCH("WATCH"),
    WATCH_EPISODE("WATCH_EPISODE"),
    WATCH_MORE("WATCH_MORE"),
    WATCH_TRAILER("WATCH_TRAILER"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahyb(String str) {
        this.value = str;
    }

    public static ahyb a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahyb.valueOf(str.toUpperCase(Locale.US));
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
