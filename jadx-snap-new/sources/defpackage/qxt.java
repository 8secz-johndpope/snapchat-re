package defpackage;

/* renamed from: qxt */
public enum qxt {
    FORCE_FULL_SYNC(r2, true),
    PULL_TO_REFRESH(r2, true),
    COLD_START(r2, true),
    WARM_START(r2, true),
    SINGLE_UPDATE(r2, false),
    BATCH_UPDATE(r2, false),
    PAGINATION(r2, false),
    LOGIN(r5, true),
    GROUP_ONLY_SYNC(r5, false);
    
    public final String callOriginationType;
    private final boolean isFirstPageUpdate;

    private qxt(String str, boolean z) {
        akcr.b(str, "type");
        this.callOriginationType = str;
        this.isFirstPageUpdate = z;
    }

    public final boolean a() {
        return akcr.a(this.callOriginationType, (Object) "APP_OPEN");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedUpdateType callOriginationType = ");
        stringBuilder.append(this.callOriginationType);
        stringBuilder.append(", isFirstPageUpdate = ");
        stringBuilder.append(this.isFirstPageUpdate);
        return stringBuilder.toString();
    }
}
