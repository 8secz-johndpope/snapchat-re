package defpackage;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snap.commerce.lib.recyclerview.layoutmanager.StoreGridLayoutManager;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fko */
public final class fko extends jz {
    final zke a;
    public final thy b;
    final List<thx> c;
    public final Map<String, Long> d = new HashMap();
    public final SparseArray<RecyclerView> e = new SparseArray();
    private final Activity f;
    private final zkf g;
    private final List<String> h;
    private final fok i;
    private final SparseArray<RelativeLayout> j = new SparseArray();
    private final SparseArray<TextView> k = new SparseArray();

    public fko(Activity activity, zkf zkf, thy thy, fok fok) {
        this.f = activity;
        this.g = zkf;
        this.a = this.g.b;
        this.b = thy;
        this.c = thy.k;
        this.h = new ArrayList(this.c.size());
        for (thx thx : this.c) {
            List list;
            Object obj = thx.b;
            if (obj == null || obj.length() <= 15) {
                list = this.h;
            } else {
                list = this.h;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(obj.substring(0, 15));
                stringBuilder.append("...");
                obj = stringBuilder.toString();
            }
            list.add(obj);
        }
        this.i = fok;
        a();
    }

    private void a() {
        for (int i = 0; i < this.c.size(); i++) {
            RelativeLayout relativeLayout = (RelativeLayout) View.inflate(this.f, R.layout.store_page_item_grid_view_layout, null);
            final RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(R.id.marco_polo_store_grid_recycler_view);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.marco_polo_store_empty_text_view);
            final zmf zmf = new zmf(new zms(this.i, fol.class), this.g.b);
            recyclerView.setAdapter(zmf);
            StoreGridLayoutManager storeGridLayoutManager = new StoreGridLayoutManager(this.f, 2);
            storeGridLayoutManager.setSpanSizeLookup(new SpanSizeLookup() {
                public final int getSpanSize(int i) {
                    zlv b = zmf.b(i);
                    return (b == fol.STORE_PROGRESS_BAR_VIEW || b == fol.STORE_PRODUCTS_ERROR_VIEW) ? 2 : 1;
                }
            });
            recyclerView.setLayoutManager(storeGridLayoutManager);
            recyclerView.addOnChildAttachStateChangeListener(new OnChildAttachStateChangeListener() {
                public final void onChildViewAttachedToWindow(View view) {
                    ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(view);
                    if (findContainingViewHolder instanceof zmq) {
                        zmy c = ((zmq) findContainingViewHolder).c();
                        if (c instanceof fpg) {
                            fko.this.a.a(new fse(((thx) fko.this.c.get(i)).a, ((fpg) c).b));
                        }
                    }
                }

                public final void onChildViewDetachedFromWindow(View view) {
                }
            });
            recyclerView.addOnScrollListener(new fps(this.a, this.b.a, i));
            this.j.put(i, relativeLayout);
            this.e.put(i, recyclerView);
            this.k.put(i, textView);
        }
    }

    public final thx a(int i) {
        return (thx) this.b.k.get(i);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int getCount() {
        return !this.b.f() ? 1 : this.c.size();
    }

    public final CharSequence getPageTitle(int i) {
        return i >= this.c.size() ? "" : (CharSequence) this.h.get(i);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        RelativeLayout relativeLayout = (RelativeLayout) this.j.get(i);
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLoadProductList(fql fql) {
        int i = fql.a;
        ((RecyclerView) this.e.get(i)).setVisibility(0);
        ((RecyclerView) this.e.get(i)).setTag(fql.b);
        zmf zmf = (zmf) ((RecyclerView) this.e.get(i)).getAdapter();
        znh znh = fql.c;
        zmf.a(znh);
        if (znh.a() == 0) {
            ((TextView) this.k.get(i)).setVisibility(0);
            return;
        }
        long a = ((long) znh.a()) / 2;
        this.d.put(((thx) this.c.get(i)).a, Long.valueOf(a));
        this.a.a(new fsd(((thx) this.c.get(i)).a, a));
        ((TextView) this.k.get(i)).setVisibility(8);
    }
}
