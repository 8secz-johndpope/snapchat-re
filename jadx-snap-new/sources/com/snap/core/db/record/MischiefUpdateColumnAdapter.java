package com.snap.core.db.record;

import com.snap.core.db.api.column.JsonEnumColumnAdapter;
import com.snap.core.db.column.MischiefUpdateMessageIntegerType;
import defpackage.aetf;
import defpackage.ajxk;
import defpackage.akcr;

final class MischiefUpdateColumnAdapter extends JsonEnumColumnAdapter<aetf, MischiefUpdateMessageIntegerType> {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[aetf.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[aetf.PARTICIPANT_JOINED.ordinal()] = 1;
            $EnumSwitchMapping$0[aetf.PARTICIPANT_LEFT.ordinal()] = 2;
            $EnumSwitchMapping$0[aetf.MISCHIEF_NAME_CHANGED.ordinal()] = 3;
            $EnumSwitchMapping$0[aetf.MISCHIEF_CREATED.ordinal()] = 4;
            $EnumSwitchMapping$0[aetf.INVITE_CREATED.ordinal()] = 5;
            $EnumSwitchMapping$0[aetf.INVITES_DELETED.ordinal()] = 6;
            $EnumSwitchMapping$0[aetf.PARTICIPANT_JOINED_BY_INVITE.ordinal()] = 7;
            $EnumSwitchMapping$0[aetf.UNRECOGNIZED_VALUE.ordinal()] = 8;
            iArr = new int[MischiefUpdateMessageIntegerType.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[MischiefUpdateMessageIntegerType.PARTICIPANT_JOINED.ordinal()] = 1;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.PARTICIPANT_LEFT.ordinal()] = 2;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.MISCHIEF_NAME_CHANGED.ordinal()] = 3;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.MISCHIEF_CREATED.ordinal()] = 4;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.INVITE_CREATED.ordinal()] = 5;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.INVITES_DELETED.ordinal()] = 6;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.PARTICIPANT_JOINED_BY_INVITE.ordinal()] = 7;
            $EnumSwitchMapping$1[MischiefUpdateMessageIntegerType.UNRECOGNIZED_VALUE.ordinal()] = 8;
        }
    }

    public MischiefUpdateColumnAdapter() {
        super(MischiefUpdateMessageIntegerType.class);
    }

    public final MischiefUpdateMessageIntegerType fromJson(aetf aetf) {
        akcr.b(aetf, "jsonEnum");
        switch (WhenMappings.$EnumSwitchMapping$0[aetf.ordinal()]) {
            case 1:
                return MischiefUpdateMessageIntegerType.PARTICIPANT_JOINED;
            case 2:
                return MischiefUpdateMessageIntegerType.PARTICIPANT_LEFT;
            case 3:
                return MischiefUpdateMessageIntegerType.MISCHIEF_NAME_CHANGED;
            case 4:
                return MischiefUpdateMessageIntegerType.MISCHIEF_CREATED;
            case 5:
                return MischiefUpdateMessageIntegerType.INVITE_CREATED;
            case 6:
                return MischiefUpdateMessageIntegerType.INVITES_DELETED;
            case 7:
                return MischiefUpdateMessageIntegerType.PARTICIPANT_JOINED_BY_INVITE;
            case 8:
                return MischiefUpdateMessageIntegerType.UNRECOGNIZED_VALUE;
            default:
                throw new ajxk();
        }
    }

    public final aetf toJson(MischiefUpdateMessageIntegerType mischiefUpdateMessageIntegerType) {
        akcr.b(mischiefUpdateMessageIntegerType, "integerEnum");
        switch (WhenMappings.$EnumSwitchMapping$1[mischiefUpdateMessageIntegerType.ordinal()]) {
            case 1:
                return aetf.PARTICIPANT_JOINED;
            case 2:
                return aetf.PARTICIPANT_LEFT;
            case 3:
                return aetf.MISCHIEF_NAME_CHANGED;
            case 4:
                return aetf.MISCHIEF_CREATED;
            case 5:
                return aetf.INVITE_CREATED;
            case 6:
                return aetf.INVITES_DELETED;
            case 7:
                return aetf.PARTICIPANT_JOINED_BY_INVITE;
            case 8:
                return aetf.UNRECOGNIZED_VALUE;
            default:
                throw new ajxk();
        }
    }
}
