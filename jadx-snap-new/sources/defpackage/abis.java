package defpackage;

/* renamed from: abis */
public enum abis {
    INCOMING(true),
    INCOMING_BEST_FRIEND(true),
    OUTGOING(false),
    OUTGOING_BEST_FRIEND(false);
    
    private final boolean mIncoming;

    private abis(boolean z) {
        this.mIncoming = z;
    }
}
