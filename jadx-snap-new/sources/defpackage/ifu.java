package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.ui.view.TakeSnapButton;

/* renamed from: ifu */
public enum ifu {
    MAIN_APP_START(TakeSnapButton.LONG_PRESS_TIME),
    CAMERA_VIDEO_RECORD_START(501),
    SAVE_TO_CAMERA_ROLL(503),
    MEMORIES_READ_CAMERA_ROLL(504),
    REG_DISPLAY_NAME(505),
    REG_PHONE_NUMBER(506),
    REG_PHONE_VERIFY(507),
    REG_EMAIL(508),
    REG_FIND_FRIENDS(509),
    IN_APP_FIND_FRIENDS(510),
    IN_APP_PHONE_NUMBER(511),
    IN_APP_PHONE_VERIFY(RasterSource.DEFAULT_TILE_SIZE),
    SPECTACLES_PAIR_START(513),
    MAP_LOCATION_OVERLAY(514),
    ODG_DRAW_GEOFENCE(515),
    REG_BLITZ(516),
    REG_SUPER_BLITZ(517),
    TALK_START_CALL(518),
    TALK_RECORD_NOTE(519),
    MAIN_APP_AFTER_CRITICAL_PERMISSIONS_GRANTED(520),
    NEW_GEO_STORY(521),
    FILTERS_LOCATION_CAROUSEL(522),
    PREVIEW_AFTER_TAKING_SNAP(523),
    SNAP_PREVIEW_ON_RESUME(524),
    SEARCH_LOCATION(525),
    GEO_LENS_LOCATION(526),
    GEO_FILTER_PASSPORT(527),
    STICKERS_LOCATION_INFO(528),
    SHARE_REQUEST_LOCATION(529),
    UNKNOWN(-500);
    
    final int mRequestCode;

    private ifu(int i) {
        this.mRequestCode = i;
    }

    public static ifu a(int i) {
        for (ifu ifu : ifu.values()) {
            if (ifu.mRequestCode == i) {
                return ifu;
            }
        }
        return UNKNOWN;
    }
}
