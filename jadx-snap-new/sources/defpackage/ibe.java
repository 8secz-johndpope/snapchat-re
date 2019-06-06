package defpackage;

/* renamed from: ibe */
public final class ibe implements hyv {
    private final ajwy<icp> a;
    private final ajwy<hyk> b;

    ibe(ajwy<icp> ajwy, ajwy<hyk> ajwy2) {
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final void a(String str, boolean z, String str2) {
        long parseLong = Long.parseLong(ics.a(str));
        ((hyk) this.b.get()).i(str2);
        ahqt ahqt = new ahqt();
        ahqt.a = Long.valueOf(parseLong);
        ahqt.b = Boolean.valueOf(z);
        ((icp) this.a.get()).a((Object) ahqt);
    }
}
