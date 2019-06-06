package defpackage;

/* renamed from: ncp */
public final class ncp {
    public final alkf a;
    public final nbr b;
    public final long c;

    public ncp(alkf alkf, nbr nbr) {
        this.a = alkf;
        this.b = nbr;
        this.c = nbr.a();
    }

    public final alkf a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("shareLocationPreferences: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" ghostModeTimerData: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}
