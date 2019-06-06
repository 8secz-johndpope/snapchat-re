package defpackage;

/* renamed from: dia */
public enum dia {
    PERIODIC("Periodic", true, true),
    QUEUE_READY("QueueReady", false, false),
    ON_BACKGROUNDING("OnBackgrounding", false, true);
    
    public final boolean forceUpload;
    public final boolean recurring;
    final String subtag;

    private dia(String str, boolean z, boolean z2) {
        akcr.b(str, "subtag");
        this.subtag = str;
        this.recurring = z;
        this.forceUpload = z2;
    }
}
