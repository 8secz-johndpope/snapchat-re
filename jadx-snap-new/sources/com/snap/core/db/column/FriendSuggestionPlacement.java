package com.snap.core.db.column;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.akcr;

public enum FriendSuggestionPlacement implements IntegerEnumColumn {
    STORIES_PAGE(0, "Stories"),
    SENDTO_PAGE(1, "Send-to"),
    ADD_FRIENDS_FOOTER(2, "Add Friends"),
    FEED_PAGE(3, "Chat"),
    SEARCH_PAGE(4, LensTextInputConstants.RETURN_KEY_TYPE_SEARCH),
    SEARCH_RESULT_SECTION(5, "Search-result-section"),
    FULL_PAGE(6, "Full-Page-Quick-Add"),
    STORIES_VIEW_ALL(7, "Stories-Full-Page"),
    REG_FIND_FRIENDS_SNAPCHATTERS(8, "Reg-Find-Friends-Snapchatters"),
    FEED_PAGE_HORIZONTAL(9, "friends"),
    ADD_FRIENDS_BUTTON(10, "Add Friends Button"),
    RECIPROCATION_TAKEOVER_FEED(11, "Reciprocation Take Over Feed");
    
    private final int intValue;
    private final String location;

    protected FriendSuggestionPlacement(int i, String str) {
        akcr.b(str, MapboxEvent.TYPE_LOCATION);
        this.intValue = i;
        this.location = str;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final String getLocation() {
        return this.location;
    }
}
