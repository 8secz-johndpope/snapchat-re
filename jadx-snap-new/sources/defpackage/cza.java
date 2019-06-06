package defpackage;

/* renamed from: cza */
public final class cza implements ablk {
    private final ajwy<dib> a;
    private final ajwy<abss> b;

    public cza(ajwy<dib> ajwy, ajwy<abss> ajwy2) {
        akcr.b(ajwy, "blizzardEventLogger");
        akcr.b(ajwy2, "releaseManager");
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final boolean a(aajt aajt) {
        akcr.b(aajt, "event");
        Object obj = this.b.get();
        akcr.a(obj, "releaseManager.get()");
        return (((abss) obj).l() || ((abss) this.b.get()).h() || ((abss) this.b.get()).i()) ? true : ((dib) this.a.get()).b(aajt);
    }

    public final ajdx<Boolean> b(aajt aajt) {
        Object b;
        String str;
        akcr.b(aajt, "event");
        Object obj = this.b.get();
        akcr.a(obj, "releaseManager.get()");
        if (((abss) obj).l() || ((abss) this.b.get()).h() || ((abss) this.b.get()).i()) {
            b = ajdx.b(Boolean.TRUE);
            str = "Single.just(true)";
        } else {
            b = ((dib) this.a.get()).c(aajt);
            str = "blizzardEventLogger.get(…ouldLogEventSingle(event)";
        }
        akcr.a(b, str);
        return b;
    }
}
