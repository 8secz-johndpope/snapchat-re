package defpackage;

/* renamed from: ede */
public final class ede {
    public final ebx a;
    public final String b;
    public final int c;
    public final Boolean d;

    public ede(ebx ebx, String str, int i, Boolean bool) {
        this.a = ebx;
        this.b = str;
        this.c = i;
        this.d = bool;
    }

    public final boolean a() {
        return this.a == ebx.FRONT_FACING;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraType : ");
        stringBuilder.append(this.a);
        stringBuilder.append(". Id : ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
