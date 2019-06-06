package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.common.base.Predicate;

/* renamed from: spg */
public class spg extends spf {
    public static final Predicate<sqh> c = new 1();

    /* renamed from: spg$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            sqh sqh = (sqh) obj;
            return (sqh.a(sqh.ca, false) || spe.d.apply(sqh)) ? false : true;
        }
    }

    public spg(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ohz ohz) {
        if (ohz.d() != null) {
            this.b.setImageBitmap(((jwj) ohz.d().c.a()).a());
        }
        a(b(ohz));
    }

    /* Access modifiers changed, original: protected|final */
    public final abtl b(ohz ohz) {
        Bitmap a = ohz.d() != null ? ((jwj) ohz.d().c.a()).a() : null;
        return a == null ? null : new abtl(a.getWidth(), a.getHeight());
    }

    public final String f() {
        return "OVERLAY_BLOB_STATIC_MEDIA_OVERLAY_IMAGE";
    }

    /* Access modifiers changed, original: protected|final */
    public final void o() {
        z().m();
    }
}
