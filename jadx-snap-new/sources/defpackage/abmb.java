package defpackage;

import defpackage.abln.d;

/* renamed from: abmb */
public enum abmb implements d {
    PROCESS_CREATED,
    CAMERA_OPEN_TRIGGERED,
    CAMERA_OPENED,
    SHARED_SURFACE_CREATED,
    FIRST_UI_RENDERED,
    START_PREVIEW_TRIGGERED,
    START_PREVIEW_BG_THREAD_COMPLETE,
    FIRST_PREVIEW_FRAME_RECEIVED,
    FIRST_PREVIEW_FRAME_RENDERED,
    START_PREVIEW_UI_THREAD_COMPLETE;

    public final String a() {
        return name();
    }
}
