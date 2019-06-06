package com.snap.commerce.lib.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip;
import com.snapchat.android.R;
import defpackage.fko;
import defpackage.frv;
import defpackage.frw;
import defpackage.fsb;
import defpackage.fsc;
import defpackage.fsd;
import defpackage.fse;
import defpackage.jz;
import defpackage.thx;
import defpackage.zke;
import defpackage.zkf;

public class StoreMainTabView extends LinearLayout {
    zke a;
    private ViewPager b;
    private PagerSlidingTabStrip c;

    public StoreMainTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.store_main_tab_view, this);
    }

    public final void a() {
        this.c.setVisibility(8);
    }

    public final void a(final fko fko) {
        this.b.a((jz) fko);
        this.c.setViewPager(this.b);
        this.c.setOnPageChangeListener(new e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                StoreMainTabView storeMainTabView = StoreMainTabView.this;
                fko fko = fko;
                thx a = fko.a(i);
                String str = a.a;
                if (storeMainTabView.a != null) {
                    storeMainTabView.a.a(fsb.a);
                    storeMainTabView.a.a(frv.a);
                    storeMainTabView.a.a(new frw(str, a.b, (long) i, (long) fko.b.k.size()));
                    storeMainTabView.a.a(fsc.a);
                    Long l = (Long) fko.d.get(str);
                    storeMainTabView.a.a(new fsd(str, l == null ? 0 : l.longValue()));
                }
                storeMainTabView = StoreMainTabView.this;
                fko = fko;
                a = fko.a(i);
                long findLastVisibleItemPosition = (long) (((GridLayoutManager) ((RecyclerView) fko.e.get(i)).getLayoutManager()).findLastVisibleItemPosition() / 2);
                if (storeMainTabView.a != null) {
                    storeMainTabView.a.a(new fse(a.a, findLastVisibleItemPosition));
                }
            }
        });
        this.c.notifyDataSetChanged();
    }

    public final void a(zkf zkf) {
        this.a = zkf.b;
    }

    public final void b() {
        this.c.setVisibility(0);
    }

    public final void c() {
        fko fko = (fko) this.b.b;
        if (fko != null) {
            ((RecyclerView) fko.e.get(this.b.b())).smoothScrollToPosition(0);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ViewPager) findViewById(R.id.marco_polo_store_main_view_pager);
        this.c = (PagerSlidingTabStrip) findViewById(R.id.marco_polo_store_tab_strip);
    }
}
