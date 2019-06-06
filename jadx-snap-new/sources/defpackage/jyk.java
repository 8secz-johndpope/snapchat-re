package defpackage;

import android.widget.ImageView;

/* renamed from: jyk */
public final class jyk implements jxk {
    private final ajwy<jwo> a;
    private final ajwy<jzg> b;
    private final ajwy<kaj> c;

    public jyk(ajwy<jwo> ajwy, ajwy<jzg> ajwy2, ajwy<kaj> ajwy3) {
        akcr.b(ajwy, "config");
        akcr.b(ajwy2, "glide3ViewFactory");
        akcr.b(ajwy3, "glide4ViewFactory");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final jxj a(ImageView imageView) {
        akcr.b(imageView, "hostView");
        this.a.get();
        return ((jzg) this.b.get()).a(imageView);
    }
}
