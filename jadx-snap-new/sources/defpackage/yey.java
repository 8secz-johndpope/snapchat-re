package defpackage;

import java.io.File;

/* renamed from: yey */
public final class yey extends yeu {
    private final File[] a;

    public yey(File[] fileArr, long[] jArr) {
        super(jArr);
        this.a = fileArr;
    }

    public final File a(int i) {
        return this.a[i];
    }
}
