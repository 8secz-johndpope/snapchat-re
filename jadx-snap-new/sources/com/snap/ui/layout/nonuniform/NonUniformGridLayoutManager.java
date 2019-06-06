package com.snap.ui.layout.nonuniform;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewParent;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.zkt;
import defpackage.zmh;
import defpackage.zmt;
import defpackage.zmy;

public final class NonUniformGridLayoutManager extends GridLayoutManager {
    final Context a;
    final zmh b;
    final int c;
    final int d;
    private final ajxe e = ajxh.a(new a(this));
    private final c f = new c(this);
    private final ajxe g;
    private final int h;

    public static final class c extends SpanSizeLookup {
        private /* synthetic */ NonUniformGridLayoutManager a;

        c(NonUniformGridLayoutManager nonUniformGridLayoutManager) {
            this.a = nonUniformGridLayoutManager;
        }

        public final int getSpanSize(int i) {
            zmy a = this.a.b.a(i);
            return (a instanceof zkt ? (zkt) a : null) != null ? 0 : this.a.c;
        }
    }

    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ NonUniformGridLayoutManager a;

        a(NonUniformGridLayoutManager nonUniformGridLayoutManager) {
            this.a = nonUniformGridLayoutManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.a.getResources();
            akcr.a(resources, "context.resources");
            resources = resources.getConfiguration();
            akcr.a(resources, "context.resources.configuration");
            boolean z = true;
            if (resources.getLayoutDirection() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends akcs implements akbk<AnonymousClass1> {
        final /* synthetic */ NonUniformGridLayoutManager a;

        /* renamed from: com.snap.ui.layout.nonuniform.NonUniformGridLayoutManager$b$1 */
        public static final class AnonymousClass1 extends ItemDecoration {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
                int i;
                akcr.b(rect, "outRect");
                akcr.b(view, "view");
                akcr.b(recyclerView, "parent");
                akcr.b(state, "state");
                ViewParent parent = view.getParent();
                zkt zkt = null;
                if (parent instanceof RecyclerView) {
                    ViewHolder childViewHolder = ((RecyclerView) parent).getChildViewHolder(view);
                    if (childViewHolder instanceof zmt) {
                        zmy c = ((zmt) childViewHolder).c();
                        if (c instanceof zkt) {
                            zkt = (zkt) c;
                        }
                    }
                }
                if (zkt == null) {
                    rect.top = this.a.a.d;
                    rect.bottom = this.a.a.d;
                    rect.right = this.a.a.d;
                    i = this.a.a.d;
                } else {
                    rect.top = zkt.a.top;
                    rect.bottom = zkt.a.bottom;
                    rect.right = ((Boolean) this.a.a.e.b()).booleanValue() ? zkt.a.left : zkt.a.right;
                    i = ((Boolean) this.a.a.e.b()).booleanValue() ? zkt.a.right : zkt.a.left;
                }
                rect.left = i;
            }
        }

        b(NonUniformGridLayoutManager nonUniformGridLayoutManager) {
            this.a = nonUniformGridLayoutManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AnonymousClass1(this);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(NonUniformGridLayoutManager.class), "isRtlLayout", "isRtlLayout()Z"), new akdc(akde.a(NonUniformGridLayoutManager.class), "itemDecoration", "getItemDecoration()Landroid/support/v7/widget/RecyclerView$ItemDecoration;")};
    }

    public NonUniformGridLayoutManager(Context context, zmh zmh, int i, int i2, int i3) {
        akcr.b(context, "context");
        akcr.b(zmh, "adapter");
        super(context, i);
        this.a = context;
        this.b = zmh;
        this.c = i;
        this.h = i2;
        this.d = i3;
        if ((this.c > 0 ? 1 : null) != null) {
            setSpanSizeLookup(this.f);
            this.g = ajxh.a(new b(this));
            return;
        }
        throw new IllegalStateException("Must provide positive width".toString());
    }
}
