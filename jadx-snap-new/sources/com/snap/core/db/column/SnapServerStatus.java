package com.snap.core.db.column;

import com.google.common.collect.Sets;
import defpackage.aenb;
import java.util.HashMap;
import java.util.Map;

public enum SnapServerStatus {
    NONE(-1),
    SENT(0),
    DELIVERED(1),
    VIEWED(2),
    SCREENSHOT(3),
    PENDING(4);
    
    public static final SnapServerStatus[] SNAP_SERVER_STATUS_NOT_VIEWED = null;
    public static final SnapServerStatus[] SNAP_SERVER_STATUS_VIEWED = null;
    private static Map<Integer, SnapServerStatus> VALUES_MAP;
    private final int value;

    /* renamed from: com.snap.core.db.column.SnapServerStatus$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$snap$core$db$column$SnapServerStatus = null;

        static {
            $SwitchMap$com$snap$core$db$column$SnapServerStatus = new int[SnapServerStatus.values().length];
            try {
                $SwitchMap$com$snap$core$db$column$SnapServerStatus[SnapServerStatus.SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        SNAP_SERVER_STATUS_VIEWED = new SnapServerStatus[]{r9, r10};
        SNAP_SERVER_STATUS_NOT_VIEWED = new SnapServerStatus[]{r7, r8, r5};
        VALUES_MAP = new HashMap();
        SnapServerStatus[] values = values();
        int length = values.length;
        int i;
        while (i < length) {
            SnapServerStatus snapServerStatus = values[i];
            VALUES_MAP.put(Integer.valueOf(snapServerStatus.value), snapServerStatus);
            i++;
        }
    }

    private SnapServerStatus(int i) {
        this.value = i;
    }

    public static boolean hasBeenOpened(SnapServerStatus snapServerStatus) {
        return Sets.newHashSet(SNAP_SERVER_STATUS_VIEWED).contains(snapServerStatus);
    }

    public static boolean isSendingSnapFurtherInProcess(SnapServerStatus snapServerStatus, SnapServerStatus snapServerStatus2) {
        return snapServerStatus.getValue() > snapServerStatus2.getValue();
    }

    public static boolean isSentAndOpened(SnapServerStatus snapServerStatus) {
        return AnonymousClass1.$SwitchMap$com$snap$core$db$column$SnapServerStatus[snapServerStatus.ordinal()] == 1;
    }

    public static SnapServerStatus parseFromInt(Integer num) {
        return (num == null || !VALUES_MAP.containsKey(num)) ? NONE : (SnapServerStatus) VALUES_MAP.get(num);
    }

    public static SnapServerStatus parseFromSnap(aenb aenb) {
        return (aenb.q == null || !aenb.q.booleanValue()) ? parseFromInt(aenb.P) : PENDING;
    }

    public final int getValue() {
        return this.value;
    }
}
