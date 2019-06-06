package defpackage;

import android.view.View;

/* renamed from: zly */
public abstract class zly<TBindingContext extends zlx, TData extends zmy> extends zmd<TData> {
    private TBindingContext a;
    private zms b;

    public abstract void a(TBindingContext tBindingContext, View view);

    public final void a(TBindingContext tBindingContext, zms zms, View view) {
        akcr.b(tBindingContext, "bindingContext");
        akcr.b(zms, "viewFactory");
        akcr.b(view, "itemView");
        super.create(view);
        this.a = tBindingContext;
        this.b = zms;
        a(tBindingContext, view);
    }

    public void create(View view) {
        akcr.b(view, "itemView");
        throw new UnsupportedOperationException("must call create(bindingContext, itemView)");
    }

    public final TBindingContext e() {
        zlx zlx = this.a;
        if (zlx == null) {
            akcr.a("_bindingContext");
        }
        return zlx;
    }

    public final zms f() {
        zms zms = this.b;
        if (zms == null) {
            akcr.a("_viewFactory");
        }
        return zms;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(View view) {
        akcr.b(view, "itemView");
    }
}
