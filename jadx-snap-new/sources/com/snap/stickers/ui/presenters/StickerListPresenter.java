package com.snap.stickers.ui.presenters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import defpackage.ajcw;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajef;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajwo;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.iha;
import defpackage.k;
import defpackage.xsd;
import defpackage.xyx;
import defpackage.xyz;
import defpackage.xze;
import defpackage.yad;
import defpackage.yah;
import defpackage.ybj;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zlx;
import defpackage.zmf;
import defpackage.zms;
import defpackage.zmy;
import defpackage.znh;
import java.util.concurrent.TimeUnit;

public final class StickerListPresenter extends zll<ybj> implements k {
    private zms a;
    private final zgb b;
    private final ajwy<ajdx<iha>> c;

    static final class a<T> implements ajfb<yad> {
        private /* synthetic */ ybj a;
        private /* synthetic */ zmf b;

        a(ybj ybj, zmf zmf) {
            this.a = ybj;
            this.b = zmf;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.notifyItemChanged(this.a.g().getChildAdapterPosition(((yad) obj).b));
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements ajfb<znh<zmy>> {
        private /* synthetic */ zmf a;

        c(zmf zmf) {
            this.a = zmf;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((znh) obj);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class e implements ajev {
        private /* synthetic */ RecyclerView a;

        e(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        public final void run() {
            this.a.setAdapter(null);
        }
    }

    public StickerListPresenter(zgb zgb, ajwy<ajdx<iha>> ajwy) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "serializationHelper");
        this.b = zgb;
        this.c = ajwy;
        zfw a = zgb.a(xsd.a.callsite("StickerListPresenter"));
        Object obj = this.c.get();
        akcr.a(obj, "serializationHelper.get()");
        this.a = new zms((zlx) new xyz(a, (ajdx) obj), xze.class);
    }

    /* renamed from: a */
    public final void takeTarget(ybj ybj) {
        akcr.b(ybj, "target");
        super.takeTarget(ybj);
        zkf h = ybj.h();
        zln zln = this;
        zln.bindTo$default(this, h, zln, null, null, 6, null);
        xyx f = ybj.f();
        zmf zmf = new zmf(this.a, h.a());
        if (f != null) {
            zln.bindTo$default(this, h.a(f), zln, null, null, 6, null);
            ajwo ajwo = (ajwo) f.b().get();
            if (ajwo != null) {
                ajej a = ajwo.a((ajfb) new a(ybj, zmf), (ajfb) b.a);
                if (a != null) {
                    zln.bindTo$default(this, a, zln, null, null, 6, null);
                }
            }
        }
        zln zln2 = zln;
        zln.bindTo$default(this, ybj.e().b((ajdw) ybj.d().b()).d(30, TimeUnit.MILLISECONDS).a(ajcw.LATEST).a(ajef.a()).a((ajfb) new c(zmf), (ajfb) d.a), zln2, null, null, 6, null);
        RecyclerView g = ybj.g();
        g.setAdapter(zmf);
        zln.bindTo$default(this, ajek.a((ajev) new e(g)), zln2, null, null, 6, null);
        g.getRecycledViewPool().setMaxRecycledViews(this.a.getViewTypeId(xze.EMOJI_STICKER_LIST_ITEM), 25);
        g.getRecycledViewPool().setMaxRecycledViews(this.a.getViewTypeId(xze.BITMOJI_STICKER_LIST_ITEM), 25);
        g.getRecycledViewPool().setMaxRecycledViews(this.a.getViewTypeId(xze.EMOJI_STICKER_LIST_ITEM), 25);
        while (g.getItemDecorationCount() > 0) {
            g.removeItemDecorationAt(0);
        }
        Context context = g.getContext();
        akcr.a((Object) context, "recycler.context");
        g.addItemDecoration(new yah(context));
    }
}
