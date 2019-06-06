package com.snap.spectacles.lib.fragments.recyclerview;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.xnv;
import defpackage.zml;

public final class SpectaclesSettingsLayoutManager extends LinearLayoutManager {
    public final ajxe a = ajxh.a(new b(this));
    final int b;
    private final Context c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<AnonymousClass1> {
        final /* synthetic */ SpectaclesSettingsLayoutManager a;

        /* renamed from: com.snap.spectacles.lib.fragments.recyclerview.SpectaclesSettingsLayoutManager$b$1 */
        public static final class AnonymousClass1 extends ItemDecoration {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
                akcr.b(rect, "outRect");
                akcr.b(view, "view");
                akcr.b(recyclerView, "parent");
                akcr.b(state, "state");
                Adapter adapter = recyclerView.getAdapter();
                if (!(adapter instanceof zml)) {
                    adapter = null;
                }
                zml zml = (zml) adapter;
                if (zml != null) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition != -1 && childAdapterPosition < zml.getItemCount() && (zml.a(childAdapterPosition) instanceof xnv)) {
                        childAdapterPosition++;
                        if (childAdapterPosition < zml.getItemCount() - 1 && !(zml.a(childAdapterPosition) instanceof xnv)) {
                            rect.bottom = this.a.a.b;
                        }
                        rect.top = this.a.a.b;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Adapter must implement ViewModelAdapter");
            }
        }

        b(SpectaclesSettingsLayoutManager spectaclesSettingsLayoutManager) {
            this.a = spectaclesSettingsLayoutManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AnonymousClass1(this);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesSettingsLayoutManager.class), "itemDecoration", "getItemDecoration()Landroid/support/v7/widget/RecyclerView$ItemDecoration;");
        a aVar = new a();
    }

    public SpectaclesSettingsLayoutManager(Context context, int i) {
        akcr.b(context, "context");
        super(context);
        this.c = context;
        this.b = i;
    }
}
