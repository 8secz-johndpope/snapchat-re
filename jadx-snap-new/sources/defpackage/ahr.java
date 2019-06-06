package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: ahr */
public class ahr<ModelType> extends aht<ModelType, akr, and, amo> {
    ahr(Context context, Class<ModelType> cls, aoj<ModelType, akr, and, amo> aoj, ahx ahx, aob aob, anv anv) {
        super(context, cls, aoj, amo.class, ahx, aob, anv);
        super.a(new aos());
    }

    public final api<amo> a(ImageView imageView) {
        return super.a(imageView);
    }

    public final ahr<ModelType> b(ModelType modelType) {
        super.a((Object) modelType);
        return this;
    }

    public final /* bridge */ /* synthetic */ aht b(int i, int i2) {
        super.b(i, i2);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        super.b(this.c.k);
    }

    public final /* bridge */ /* synthetic */ aht c(Drawable drawable) {
        super.c(drawable);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        super.b(this.c.i);
    }

    public /* synthetic */ Object clone() {
        return (ahr) super.clone();
    }

    public final /* bridge */ /* synthetic */ aht d() {
        return (ahr) super.clone();
    }

    public final /* bridge */ /* synthetic */ aht e() {
        super.e();
        return this;
    }

    public final /* bridge */ /* synthetic */ aht e(int i) {
        super.e(i);
        return this;
    }
}
