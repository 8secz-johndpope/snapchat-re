package defpackage;

import java.io.IOException;

/* renamed from: zb */
public final class zb extends IOException {
    private final int a;

    public zb(int i) {
        this("Http request failed with status code: ".concat(String.valueOf(i)), i);
    }

    public zb(String str) {
        this(str, -1);
    }

    public zb(String str, int i) {
        this(str, i, (byte) 0);
    }

    private zb(String str, int i, byte b) {
        super(str, null);
        this.a = i;
    }
}
