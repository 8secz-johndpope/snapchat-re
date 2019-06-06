package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum InteractionMessageType implements IntegerEnumColumn {
    WAITING_TO_SEND(0),
    FAILED_TO_SEND(1),
    RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND(2),
    RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND(3),
    RECEIVED_VIEWED_SNAP(4),
    RECEIVED_NOT_VIEWED_CHAT(5),
    RECEIVED_VIEWED_CHAT(6),
    RECEIVED_NOT_VIEWED_UPDATE_MESSAGE(7),
    SENT_NOT_VIEWED_SNAP(8),
    SENT_VIEWED_SNAP(9),
    SENT_NOT_VIEWED_CHAT(10),
    SENT_VIEWED_CHAT(11),
    SENDING(12);
    
    private final int intValue;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[InteractionMessageType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[InteractionMessageType.SENDING.ordinal()] = 1;
            $EnumSwitchMapping$0[InteractionMessageType.WAITING_TO_SEND.ordinal()] = 2;
            $EnumSwitchMapping$0[InteractionMessageType.FAILED_TO_SEND.ordinal()] = 3;
            $EnumSwitchMapping$0[InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND.ordinal()] = 4;
            $EnumSwitchMapping$0[InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND.ordinal()] = 5;
            $EnumSwitchMapping$0[InteractionMessageType.RECEIVED_NOT_VIEWED_CHAT.ordinal()] = 6;
            $EnumSwitchMapping$0[InteractionMessageType.RECEIVED_NOT_VIEWED_UPDATE_MESSAGE.ordinal()] = 7;
            $EnumSwitchMapping$0[InteractionMessageType.SENT_NOT_VIEWED_SNAP.ordinal()] = 8;
            $EnumSwitchMapping$0[InteractionMessageType.SENT_NOT_VIEWED_CHAT.ordinal()] = 9;
        }
    }

    protected InteractionMessageType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final boolean isNotViewed() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }
}
