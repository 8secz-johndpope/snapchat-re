package com.looksery.sdk.listener;

import android.graphics.Rect;
import com.looksery.sdk.domain.ClientInterfaceData;

public interface ClientInterfaceListener {

    public enum InterfaceControl {
        TOGGLE_CAMERA_BUTTON,
        IMAGE_PICKER,
        HINT,
        MODAL,
        LINK_BITMOJI_CALL_TO_ACTION,
        SNAP_BUTTON,
        PLAY_BUTTON,
        ALL,
        EXIT_FULL_SCREEN_BUTTON,
        MEMORIES_BUTTON,
        LENS_ATTACHMENT_BUTTON
    }

    public enum InterfaceAction {
        ENABLE_HIGHLIGHT,
        DISABLE_HIGHLIGHT,
        TRIGGER,
        SHOW,
        HIDE
    }

    public enum SystemInterfaceElement {
        SOFT_NAVIGATION_BAR
    }

    Rect getRect(SystemInterfaceElement systemInterfaceElement);

    void requestPerformAction(String str, InterfaceControl interfaceControl, InterfaceAction interfaceAction, ClientInterfaceData clientInterfaceData);

    void requestScreenDimmingEnabled(String str, boolean z);

    void requestShowPopUpHint(String str, InterfaceControl interfaceControl, String str2);
}
