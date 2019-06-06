package defpackage;

/* renamed from: abja */
public enum abja {
    START,
    STOP,
    MISSED(true),
    CALL_JOINED(true),
    CALL_LEFT(true);
    
    public final boolean mShouldSendStatusMessage;

    private abja(boolean z) {
        this.mShouldSendStatusMessage = z;
    }
}
