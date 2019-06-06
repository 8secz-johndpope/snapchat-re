package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.aelf.a;
import defpackage.ajxk;
import defpackage.akco;
import defpackage.akcr;

public enum FriendLinkType implements IntegerEnumColumn {
    MUTUAL(0),
    OUTGOING(1),
    BLOCKED(2),
    DELETED(3),
    FOLLOWING(4),
    SUGGESTED(5);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] iArr = new int[a.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[a.FRIEND.ordinal()] = 1;
                $EnumSwitchMapping$0[a.PENDING.ordinal()] = 2;
                $EnumSwitchMapping$0[a.BLOCKED.ordinal()] = 3;
                $EnumSwitchMapping$0[a.DELETED.ordinal()] = 4;
                $EnumSwitchMapping$0[a.FOLLOWING.ordinal()] = 5;
                $EnumSwitchMapping$0[a.UNKNOWN.ordinal()] = 6;
                $EnumSwitchMapping$0[a.INVITE_PLACEHOLDER.ordinal()] = 7;
                $EnumSwitchMapping$0[a.LOCKED_PLACEHOLDER.ordinal()] = 8;
                $EnumSwitchMapping$0[a.UNRECOGNIZED_VALUE.ordinal()] = 9;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final FriendLinkType from(a aVar) {
            akcr.b(aVar, "friendType");
            switch (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()]) {
                case 1:
                    return FriendLinkType.MUTUAL;
                case 2:
                    return FriendLinkType.OUTGOING;
                case 3:
                    return FriendLinkType.BLOCKED;
                case 4:
                    return FriendLinkType.DELETED;
                case 5:
                    return FriendLinkType.FOLLOWING;
                case 6:
                case 7:
                case 8:
                case 9:
                    return null;
                default:
                    throw new ajxk();
            }
        }
    }

    static {
        Companion = new Companion();
    }

    protected FriendLinkType(int i) {
        this.intValue = i;
    }

    public static final FriendLinkType from(a aVar) {
        return Companion.from(aVar);
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
