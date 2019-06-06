package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: izg */
public enum izg {
    LIST(Event.LIST),
    UPDATE("update"),
    SEEN("seen"),
    HIDE("hide"),
    HIDE_UNIT("hide_unit"),
    NONE(null);
    
    final String mServerActionName;

    private izg(String str) {
        this.mServerActionName = str;
    }
}
