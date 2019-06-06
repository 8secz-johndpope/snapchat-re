package defpackage;

import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;

/* renamed from: qwo */
public final /* synthetic */ class qwo {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[aetf.values().length];
        a = iArr;
        iArr[aetf.PARTICIPANT_JOINED.ordinal()] = 1;
        a[aetf.MISCHIEF_CREATED.ordinal()] = 2;
        a[aetf.MISCHIEF_NAME_CHANGED.ordinal()] = 3;
        iArr = new int[LocalMessageBodyType.values().length];
        b = iArr;
        iArr[LocalMessageBodyType.MISSED_AUDIO_CALL.ordinal()] = 1;
        b[LocalMessageBodyType.MISSED_VIDEO_CALL.ordinal()] = 2;
        b[LocalMessageBodyType.SCREENSHOT.ordinal()] = 3;
        b[LocalMessageBodyType.MEDIA_SAVE.ordinal()] = 4;
        b[LocalMessageBodyType.UPDATE_MESSAGE.ordinal()] = 5;
        iArr = new int[MessageClientStatus.values().length];
        c = iArr;
        iArr[MessageClientStatus.SENDING.ordinal()] = 1;
        c[MessageClientStatus.QUEUED.ordinal()] = 2;
        c[MessageClientStatus.PENDING.ordinal()] = 3;
        c[MessageClientStatus.FAILED.ordinal()] = 4;
        c[MessageClientStatus.FAILED_NON_RECOVERABLE.ordinal()] = 5;
        c[MessageClientStatus.OK.ordinal()] = 6;
    }
}
