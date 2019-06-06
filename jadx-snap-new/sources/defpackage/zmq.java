package defpackage;

import android.view.View;
import java.util.Locale;

/* renamed from: zmq */
public final class zmq<T extends zmy, D extends zmb> extends zmt<T> {
    private final zmd<T> b;

    /* renamed from: zmq$a */
    public static class a extends RuntimeException {
        private String a;

        public a(String str, Throwable th, String str2) {
            super(str, th);
            this.a = str2;
        }
    }

    zmq(View view, zmd<T> zmd) {
        super(view);
        this.b = zmd;
    }

    public final void a() {
        this.b.onRecycle();
        super.a();
    }

    public final void a(T t, zke zke, zmb zmb) {
        try {
            this.b.bind(t, this.a, zke);
            super.a(t, zke, zmb);
        } catch (RuntimeException e) {
            throw new a(String.format(Locale.US, "Failed to onBind view of type %s", new Object[]{this.b.getClass().getSimpleName()}), e, t.getDebugInfo());
        }
    }

    public final boolean b() {
        return this.b.onFailedToRecycleView();
    }

    public final String toString() {
        return String.format("BindingViewHolder{%s %s %s}", new Object[]{this.itemView, c(), super.toString()});
    }
}
