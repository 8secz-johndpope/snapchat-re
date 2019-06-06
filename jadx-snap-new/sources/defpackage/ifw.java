package defpackage;

/* renamed from: ifw */
public final class ifw {
    public final boolean a;
    public final boolean b;
    private String c;

    public ifw(String str, boolean z, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PermissionState{permission='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", shouldShowRequestPermissionRationale=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isGranted=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
