package defpackage;

import android.graphics.Bitmap;

/* renamed from: and */
public class and {
    public final ajn<amu> a;
    public final ajn<Bitmap> b;

    public and(ajn<Bitmap> ajn, ajn<amu> ajn2) {
        if (ajn != null && ajn2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (ajn == null && ajn2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.b = ajn;
            this.a = ajn2;
        }
    }
}
