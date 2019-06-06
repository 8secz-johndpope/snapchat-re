package defpackage;

/* renamed from: dlf */
public final class dlf extends dkz {
    public final dkt k;

    private dlf(String str, String str2, dkt dkt) {
        akcr.b(str, "queueName");
        akcr.b(str2, "serverUrl");
        akcr.b(dkt, "eventBatch");
        super(str, str2);
        this.k = dkt;
    }

    public dlf(String str, String str2, dkt dkt, long j) {
        akcr.b(str, "queueName");
        akcr.b(str2, "uploadUrl");
        akcr.b(dkt, "eventBatch");
        this(str, str2, dkt);
        this.e = j;
    }
}
