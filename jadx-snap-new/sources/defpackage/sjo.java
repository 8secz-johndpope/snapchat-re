package defpackage;

/* renamed from: sjo */
public enum sjo {
    PREPARED,
    STARTED,
    PAUSED,
    STOPPING_GRACEFULLY,
    STOPPED,
    DESTROYED;

    public final boolean a() {
        return this == PREPARED || this == STARTED || this == PAUSED || this == STOPPED;
    }
}
