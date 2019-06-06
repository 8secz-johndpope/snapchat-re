package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

/* renamed from: zmt */
public class zmt<TModel extends zmy> extends ViewHolder {
    protected TModel a;
    private zmb b;
    private boolean c;

    public zmt(View view) {
        super(view);
    }

    public void a() {
        zmb zmb = this.b;
        if (zmb != null) {
            zmb.a(this.itemView, this.a);
            this.b = null;
        }
        this.a = null;
    }

    public void a(TModel tModel, zke zke, zmb zmb) {
        this.itemView.setContentDescription(tModel.getContentDescription());
        this.a = tModel;
        this.b = zmb;
        zmb zmb2 = this.b;
        if (zmb2 != null) {
            zmb2.b(this.itemView, this.a);
        }
        this.c = true;
    }

    public boolean b() {
        return false;
    }

    public final zmy c() {
        return this.a;
    }

    public String toString() {
        return String.format("ViewModelViewHolder{%s %s %s}", new Object[]{this.itemView, this.a, super.toString()});
    }
}
