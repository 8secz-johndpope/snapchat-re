package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.RoundedFrameLayout;
import com.snapchat.android.framework.ui.views.RoundedImageView;
import defpackage.tbg.a;
import defpackage.tbg.b;
import defpackage.tbg.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tbf */
public final class tbf extends Adapter<tbg> {
    public final List<tbh> a = new CopyOnWriteArrayList();
    public siw b;
    public a c;
    private final LayoutInflater d;

    public tbf(LayoutInflater layoutInflater) {
        akcr.b(layoutInflater, "layoutInflater");
        this.d = layoutInflater;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        tbg tbg = (tbg) viewHolder;
        akcr.b(tbg, "holder");
        tbh tbh = (tbh) this.a.get(i);
        akcr.b(tbh, "viewModel");
        tbg.h = tbh;
        View view = tbg.itemView;
        view.setLayoutParams(new LayoutParams(tbh.b.a(), tbh.b.b()));
        view.setOnTouchListener(new b(tbg, tbh));
        View view2 = tbg.itemView;
        if (view2 != null) {
            ((RoundedFrameLayout) view2).a((float) tbh.i);
            view.setBackgroundColor(tbh.k);
            FrameLayout frameLayout = tbg.a;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(tbh.d.a(), tbh.d.b()));
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).setMargins(tbh.j, tbh.j, tbh.j, tbh.j);
                RoundedImageView roundedImageView = tbg.c;
                roundedImageView.a((float) tbh.i);
                Object a = tbg.i.a(tbh.c.b(), null, roundedImageView, new c(tbg, tbh));
                sjc sjc = tbg.g;
                akcr.a(a, "it");
                sjc.a(a);
                tbg.b.setPadding(0, 0, tbh.j, 0);
                String str = tbh.f;
                Object obj = tbg.d;
                akcr.a(obj, "overlayTextView");
                tbg.a(str, obj);
                str = tbh.g;
                obj = tbg.e;
                akcr.a(obj, "titleTextView");
                tbg.a(str, obj);
                String str2 = tbh.h;
                Object obj2 = tbg.f;
                akcr.a(obj2, "detailTextView");
                tbg.a(str2, obj2);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.android.framework.ui.views.RoundedFrameLayout");
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        akcr.b(viewGroup, "parent");
        View inflate = this.d.inflate(R.layout.interaction_zone_item_view, viewGroup, false);
        if (inflate != null) {
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) inflate;
            siw siw = this.b;
            if (siw == null) {
                akcr.a("bitmapProvider");
            }
            a aVar = this.c;
            if (aVar == null) {
                akcr.a("actionListener");
            }
            return new tbg(roundedFrameLayout, siw, aVar);
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.android.framework.ui.views.RoundedFrameLayout");
    }

    public final /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        tbg tbg = (tbg) viewHolder;
        akcr.b(tbg, "holder");
        super.onViewRecycled(tbg);
        tbg.g.b();
    }
}
