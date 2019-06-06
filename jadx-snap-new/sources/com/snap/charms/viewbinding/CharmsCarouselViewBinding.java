package com.snap.charms.viewbinding;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.akcr;
import defpackage.euz;
import defpackage.std;
import defpackage.zlz;
import defpackage.zna;

public final class CharmsCarouselViewBinding extends zlz {
    private final ajei a = new ajei();

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ CharmsCarouselViewBinding a;

        c(CharmsCarouselViewBinding charmsCarouselViewBinding) {
            this.a = charmsCarouselViewBinding;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            Object a = this.a.a();
            String str = "backingRecyclerView";
            akcr.a(a, str);
            float alpha = a.getAlpha();
            String str2 = "it";
            float f = MapboxConstants.MINIMUM_ZOOM;
            if (alpha != 1.0f || obj.booleanValue()) {
                if (alpha == MapboxConstants.MINIMUM_ZOOM) {
                    akcr.a(obj, str2);
                    if (!obj.booleanValue()) {
                        return;
                    }
                }
                return;
            }
            akcr.a(obj, str2);
            if (obj.booleanValue()) {
                f = 1.0f;
            }
            obj = this.a.a();
            akcr.a(obj, str);
            obj.setAlpha(f);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class e<T> implements ajfb<Integer> {
        private /* synthetic */ CharmsCarouselViewBinding a;

        e(CharmsCarouselViewBinding charmsCarouselViewBinding) {
            this.a = charmsCarouselViewBinding;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            RecyclerView a = this.a.a();
            akcr.a(obj, "it");
            a.smoothScrollToPosition(obj.intValue());
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class CenterLayoutManager extends LinearLayoutManager {
        public CenterLayoutManager(Context context) {
            akcr.b(context, "context");
            super(context, 0, false);
        }

        public final void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
            akcr.b(recyclerView, "recyclerView");
            Object context = recyclerView.getContext();
            akcr.a(context, "recyclerView.getContext()");
            a aVar = new a(context);
            aVar.setTargetPosition(i);
            startSmoothScroll(aVar);
        }
    }

    public static final class a extends LinearSmoothScroller {
        public a(Context context) {
            akcr.b(context, "context");
            super(context);
        }

        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    static {
        b bVar = new b();
    }

    /* renamed from: a */
    public final void onBind(zna<?> zna, zna<?> zna2) {
        super.onBind(zna, zna2);
        if ((zna instanceof euz) && !akcr.a((Object) zna, (Object) zna2)) {
            if ((akcr.a((Object) zna, (Object) zna2) ^ 1) != 0) {
                this.a.a();
            }
            euz euz = (euz) zna;
            Object l = euz.a.j(ajfu.a).d((ajfb) new c(this)).c((ajfb) d.a).l();
            akcr.a(l, "model.recyclerViewVisibl…             .subscribe()");
            std.a(l, this.a);
            Object l2 = euz.b.d((ajfb) new e(this)).c((ajfb) f.a).l();
            akcr.a(l2, "model.recyclerViewPositi…            .subscribe ()");
            std.a(l2, this.a);
        }
    }

    public final void onCreate(View view) {
        akcr.b(view, "itemView");
        super.onCreate(view);
        Object a = a();
        akcr.a(a, "backingRecyclerView");
        Object context = view.getContext();
        akcr.a(context, "itemView.context");
        a.setLayoutManager(new CenterLayoutManager(context));
    }

    public final void onRecycle() {
        super.onRecycle();
        this.a.dispose();
    }
}
