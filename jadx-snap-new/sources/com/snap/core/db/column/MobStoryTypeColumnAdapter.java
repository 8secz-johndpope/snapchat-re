package com.snap.core.db.column;

import com.snap.core.db.api.column.JsonEnumColumnAdapter;
import defpackage.ageb;
import defpackage.ajxk;
import defpackage.akcr;

public final class MobStoryTypeColumnAdapter extends JsonEnumColumnAdapter<ageb, GroupStoryType> {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ageb.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ageb.CUSTOM.ordinal()] = 1;
            $EnumSwitchMapping$0[ageb.GEOFENCE.ordinal()] = 2;
            $EnumSwitchMapping$0[ageb.PRIVATE.ordinal()] = 3;
            $EnumSwitchMapping$0[ageb.GROUP_CHAT.ordinal()] = 4;
            $EnumSwitchMapping$0[ageb.UNRECOGNIZED_VALUE.ordinal()] = 5;
            iArr = new int[GroupStoryType.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[GroupStoryType.CUSTOM.ordinal()] = 1;
            $EnumSwitchMapping$1[GroupStoryType.GEOFENCE.ordinal()] = 2;
            $EnumSwitchMapping$1[GroupStoryType.PRIVATE.ordinal()] = 3;
            $EnumSwitchMapping$1[GroupStoryType.MISCHIEF.ordinal()] = 4;
        }
    }

    public MobStoryTypeColumnAdapter() {
        super(GroupStoryType.class);
    }

    public final GroupStoryType fromJson(ageb ageb) {
        akcr.b(ageb, "jsonEnum");
        int i = WhenMappings.$EnumSwitchMapping$0[ageb.ordinal()];
        if (i == 1) {
            return GroupStoryType.CUSTOM;
        }
        if (i == 2) {
            return GroupStoryType.GEOFENCE;
        }
        if (i == 3) {
            return GroupStoryType.PRIVATE;
        }
        if (i == 4) {
            return GroupStoryType.MISCHIEF;
        }
        if (i != 5) {
            throw new ajxk();
        }
        throw new IllegalArgumentException("UNRECOGNIZED_VALUE not supported");
    }

    public final ageb toJson(GroupStoryType groupStoryType) {
        akcr.b(groupStoryType, "integerEnum");
        int i = WhenMappings.$EnumSwitchMapping$1[groupStoryType.ordinal()];
        if (i == 1) {
            return ageb.CUSTOM;
        }
        if (i == 2) {
            return ageb.GEOFENCE;
        }
        if (i == 3) {
            return ageb.PRIVATE;
        }
        if (i == 4) {
            return ageb.GROUP_CHAT;
        }
        throw new ajxk();
    }
}
