package com.snap.identity.ui.settings.customemojis.skintone;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.snapchat.android.R;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.iqq;
import defpackage.iqr;
import defpackage.itx;
import defpackage.j;
import defpackage.jic;
import defpackage.jmj;
import defpackage.jmw;
import defpackage.jnf;
import defpackage.jng;
import defpackage.jnh;
import defpackage.jnk;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zmh;
import defpackage.zms;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class SkinTonePickerPresenter extends zll<jnh> implements k {
    final zfw a = zgb.a(itx.e, "SkinTonePickerPresenter");
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private ajei d;
    private String e;
    private zms f;
    private zkf g;
    private zmh h;
    private RecyclerView i;
    private final ajxe j;
    private final gpb k;
    private final Context l;
    private final aipn<ftl> m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class c extends SpanSizeLookup {
        c() {
        }

        public final int getSpanSize(int i) {
            return i == 0 ? 6 : 1;
        }
    }

    static final class b extends akcs implements akbk<ajdp<List<? extends String>>> {
        final /* synthetic */ aipn a;
        private /* synthetic */ SkinTonePickerPresenter b;

        /* renamed from: com.snap.identity.ui.settings.customemojis.skintone.SkinTonePickerPresenter$b$1 */
        static final class AnonymousClass1<V> implements Callable<T> {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object call() {
                Iterable<iqq> a = ((iqr) this.a.a.get()).a();
                Collection arrayList = new ArrayList(ajyn.a((Iterable) a, 10));
                for (iqq iqq : a) {
                    arrayList.add(iqq.unicodeString);
                }
                return ajyu.k((List) arrayList);
            }
        }

        b(SkinTonePickerPresenter skinTonePickerPresenter, aipn aipn) {
            this.b = skinTonePickerPresenter;
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdx.c((Callable) new AnonymousClass1(this)).b((ajdw) this.b.a.h()).i();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SkinTonePickerPresenter.class), "emojiSkinToneItems", "getEmojiSkinToneItems()Lio/reactivex/Observable;");
        a aVar = new a();
    }

    public SkinTonePickerPresenter(gpb gpb, Context context, aipn<iqr> aipn, zgb zgb, aipn<ftl> aipn2) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(aipn, "emojiSkinToneApi");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn2, "configProvider");
        this.k = gpb;
        this.l = context;
        this.m = aipn2;
        this.j = ajxh.a(new b(this, aipn));
    }

    /* renamed from: a */
    public final void takeTarget(jnh jnh) {
        akcr.b(jnh, "target");
        super.takeTarget(jnh);
        this.d = new ajei();
        jnh.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jnh) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        j lifecycle = obj.getLifecycle();
        if (lifecycle != null) {
            lifecycle.b(this);
        }
        super.dropTarget();
        ajei ajei = this.d;
        if (ajei == null) {
            akcr.a("disposables");
        }
        ajei.a();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.b.compareAndSet(false, true)) {
            jnh jnh = (jnh) getTarget();
            if (jnh != null) {
                this.i = jnh.a();
                this.g = new zkf();
                ajei ajei = this.d;
                String str = "disposables";
                if (ajei == null) {
                    akcr.a(str);
                }
                zkf zkf = this.g;
                String str2 = "bus";
                if (zkf == null) {
                    akcr.a(str2);
                }
                ajei.a((ajej) zkf);
                zkf zkf2 = this.g;
                if (zkf2 == null) {
                    akcr.a(str2);
                }
                zkf2.a(this);
                this.f = new zms(jnk.class);
                jmj jmj = new jmj(new jmw(jnk.SKIN_TONE_PICKER_TOP_ANCHOR, this.l.getString(R.string.settings_custom_emojis_skin_tone_picker)));
                gpb gpb = this.k;
                Object i = ((ftl) this.m.get()).k(jic.DEFAULT_EMOJI_SKIN_TONE).i();
                akcr.a(i, "configProvider.get().get…SKIN_TONE).toObservable()");
                Object of = ImmutableList.of(jmj, new jng(gpb, i, (ajdp) this.j.b()));
                akcr.a(of, "ImmutableList.of(\n      …   , emojiSkinToneItems))");
                zms zms = this.f;
                if (zms == null) {
                    akcr.a("viewFactory");
                }
                zkf zkf3 = this.g;
                if (zkf3 == null) {
                    akcr.a(str2);
                }
                zke a = zkf3.a();
                akcr.a((Object) a, "bus.eventDispatcher");
                this.h = new zmh(zms, a, (ajdw) this.a.b(), (ajdw) this.a.l(), ajyu.k((Iterable) of), 32);
                RecyclerView recyclerView = this.i;
                String str3 = "recyclerView";
                if (recyclerView == null) {
                    akcr.a(str3);
                }
                zmh zmh = this.h;
                String str4 = "adapter";
                if (zmh == null) {
                    akcr.a(str4);
                }
                recyclerView.setAdapter(zmh);
                recyclerView = this.i;
                if (recyclerView == null) {
                    akcr.a(str3);
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.l, 6);
                gridLayoutManager.setSpanSizeLookup(new c());
                recyclerView.setLayoutManager(gridLayoutManager);
                ajei = this.d;
                if (ajei == null) {
                    akcr.a(str);
                }
                zmh zmh2 = this.h;
                if (zmh2 == null) {
                    akcr.a(str4);
                }
                ajei.a(zmh2.e());
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSkinTonePickerClickedEvent(jnf jnf) {
        akcr.b(jnf, "itemClickedEvent");
        if (this.c.compareAndSet(false, true)) {
            this.e = jnf.a.a;
            this.c.set(false);
        }
    }
}
