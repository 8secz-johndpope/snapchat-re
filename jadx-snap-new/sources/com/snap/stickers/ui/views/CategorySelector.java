package com.snap.stickers.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.snapchat.android.R;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvs;
import defpackage.ajym;
import defpackage.akcr;
import defpackage.akdp;
import defpackage.ybc;
import defpackage.ydy;
import defpackage.ydz;
import defpackage.yea;
import java.util.ArrayList;
import java.util.List;

public final class CategorySelector extends ydy implements ajej {
    public final ViewGroup a;
    public final ajei b = new ajei();
    public ajvs<yea> c = new ajvs();
    public ArrayList<yea> d;
    public yea e;
    public List<? extends ybc> f;
    private int g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements ajev {
        private /* synthetic */ CategorySelector a;

        public b(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.f = null;
        }
    }

    public static final class c implements ajev {
        private /* synthetic */ CategorySelector a;

        public c(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.c = null;
        }
    }

    public static final class d implements ajev {
        private /* synthetic */ ydz a;

        public d(ydz ydz) {
            this.a = ydz;
        }

        public final void run() {
            this.a.setOnClickListener(null);
        }
    }

    public static final class e implements ajev {
        private /* synthetic */ CategorySelector a;

        public e(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.a.removeAllViews();
        }
    }

    public static final class f implements ajev {
        private /* synthetic */ CategorySelector a;

        public f(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            ArrayList arrayList = this.a.d;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.a.d = null;
        }
    }

    public static final class g implements ajev {
        private /* synthetic */ CategorySelector a;

        public g(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.e = null;
        }
    }

    public static final class h implements ajev {
        private /* synthetic */ CategorySelector a;

        public h(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.f = null;
        }
    }

    public static final class i implements ajev {
        private /* synthetic */ CategorySelector a;

        public i(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final void run() {
            this.a.removeAllViews();
        }
    }

    public static final class j<T> implements ajfb<yea> {
        private /* synthetic */ CategorySelector a;
        private /* synthetic */ ajvs b;

        public j(CategorySelector categorySelector, ajvs ajvs) {
            this.a = categorySelector;
            this.b = ajvs;
        }

        public final /* synthetic */ void accept(Object obj) {
            yea yea = (yea) obj;
            CategorySelector categorySelector = this.a;
            akcr.a((Object) yea, "button");
            CategorySelector.a(categorySelector, yea);
            ajvs ajvs = this.b;
            ArrayList arrayList = this.a.d;
            int i = -1;
            if (arrayList != null) {
                int i2 = 0;
                for (Object next : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ajym.a();
                    }
                    if (((yea) next) == yea) {
                        i = i2;
                    }
                    i2 = i3;
                }
            }
            ajvs.a(Integer.valueOf(i));
        }
    }

    public static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class l<T, R> implements ajfc<T, R> {
        private /* synthetic */ CategorySelector a;

        public l(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "it");
            ArrayList arrayList = this.a.d;
            return arrayList != null ? (yea) arrayList.get(num.intValue()) : null;
        }
    }

    public static final class m<T> implements ajfb<yea> {
        private /* synthetic */ CategorySelector a;

        public m(CategorySelector categorySelector) {
            this.a = categorySelector;
        }

        public final /* synthetic */ void accept(Object obj) {
            yea yea = (yea) obj;
            if (yea != null) {
                CategorySelector.a(this.a, yea);
                this.a.a(yea);
            }
        }
    }

    public static final class n<T> implements ajfb<Throwable> {
        public static final n a = new n();

        n() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public CategorySelector(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        Object findViewById = HorizontalScrollView.inflate(getContext(), R.layout.stickers_sticker_picker_category_selector, this).findViewById(R.id.category_button_container);
        akcr.a(findViewById, "view.findViewById(R.id.category_button_container)");
        this.a = (ViewGroup) findViewById;
    }

    public static final /* synthetic */ void a(CategorySelector categorySelector, yea yea) {
        yea yea2 = categorySelector.e;
        if (!(yea == yea2 || yea2 == null)) {
            yea2.b(true);
        }
        yea.a(true);
        categorySelector.e = yea;
    }

    /* Access modifiers changed, original: final */
    public final void a(yea yea) {
        if (!(yea instanceof View)) {
            yea = null;
        }
        View view = (View) yea;
        if (view != null) {
            Object obj = 1;
            Object obj2 = this.g - view.getLeft() <= 0 ? 1 : null;
            int scrollX = getScrollX();
            double width = (double) getWidth();
            Double.isNaN(width);
            width *= 0.75d;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            width2 *= 0.25d;
            double left = (double) (view.getLeft() + view.getWidth());
            double d = (double) scrollX;
            Double.isNaN(d);
            Object obj3 = left > d + width ? 1 : null;
            left = (double) view.getLeft();
            Double.isNaN(d);
            if (left >= d + width2) {
                obj = null;
            }
            if (!(obj3 == null && obj == null)) {
                smoothScrollTo(view.getLeft() - (obj2 != null ? akdp.a(width) : akdp.a(width2)), 0);
            }
            this.g = view.getLeft();
        }
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        yea yea = this.e;
        if (yea != null) {
            a(yea);
        }
    }
}
