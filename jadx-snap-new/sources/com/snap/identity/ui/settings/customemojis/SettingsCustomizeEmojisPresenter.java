package com.snap.identity.ui.settings.customemojis;

import android.content.Context;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.brightcove.player.event.Event;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiForType;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.aejy;
import defpackage.aeka;
import defpackage.aekb;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.ajyu;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akef;
import defpackage.aken;
import defpackage.akqq;
import defpackage.akxa;
import defpackage.fst;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.ilv;
import defpackage.ily;
import defpackage.ind;
import defpackage.iqz;
import defpackage.ira;
import defpackage.irc;
import defpackage.itx;
import defpackage.j;
import defpackage.jic;
import defpackage.jjh;
import defpackage.jmg;
import defpackage.jmh;
import defpackage.jmj;
import defpackage.jmk;
import defpackage.jmm;
import defpackage.jmn;
import defpackage.jmr;
import defpackage.jms;
import defpackage.jna;
import defpackage.jnb;
import defpackage.jnc;
import defpackage.k;
import defpackage.s;
import defpackage.std;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmh;
import defpackage.zms;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class SettingsCustomizeEmojisPresenter extends zll<jna> implements k {
    final zfw a = zgb.a(itx.e, "SettingsCustomizeEmojisPresenter");
    final ajei b = new ajei();
    final AtomicBoolean c = new AtomicBoolean(false);
    final Context d;
    final aipn<ira> e;
    final aipn<iqz> f;
    final aipn<ilv> g;
    private final AtomicBoolean h = new AtomicBoolean();
    private zms i;
    private zkf j;
    private zmh k;
    private RecyclerView l;
    private final ajxe m = ajxh.a(e.a);
    private final ajxe n = ajxh.a(new f(this));
    private final gpb o;
    private final aipn<achb<zjm, zjk>> p;
    private final jjh q;
    private final ajwy<ftl> r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "result");
            return (aekb) fst.a(akxa);
        }
    }

    static final class c<T> implements ajfb<aekb> {
        private /* synthetic */ SettingsCustomizeEmojisPresenter a;

        c(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter) {
            this.a = settingsCustomizeEmojisPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            aekb aekb = (aekb) obj;
            SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter = this.a;
            obj = aekb.b;
            akcr.a(obj, "it.friendmojiDictionary");
            SettingsCustomizeEmojisPresenter.a(settingsCustomizeEmojisPresenter, obj);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsCustomizeEmojisPresenter a;

        d(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter) {
            this.a = settingsCustomizeEmojisPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((ilv) this.a.g.get()).c((ily) ind.FRIENDMOJI_UPDATE_FAILED, 1);
            Toast.makeText(this.a.d, R.string.settings_custom_emojis_failure_message, 0).show();
        }
    }

    static final class g<T> implements ajfb<jmh> {
        private /* synthetic */ SettingsCustomizeEmojisPresenter a;

        g(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter) {
            this.a = settingsCustomizeEmojisPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jmh) obj;
            SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter = this.a;
            akcr.a(obj, "it");
            akcr.b(obj, "categoryItemUpdateData");
            if (settingsCustomizeEmojisPresenter.c.compareAndSet(false, true)) {
                settingsCustomizeEmojisPresenter.a().put(obj.a, obj.b);
                ((ilv) settingsCustomizeEmojisPresenter.g.get()).c(ind.FRIENDMOJI_UPDATE.a("category", obj.a), 1);
                obj = ((ira) settingsCustomizeEmojisPresenter.e.get()).a(obj.a, aeka.UNICODE, obj.b).b((ajdw) settingsCustomizeEmojisPresenter.a.g()).f(b.a).a((ajdw) settingsCustomizeEmojisPresenter.a.l()).a((ajfb) new c(settingsCustomizeEmojisPresenter), (ajfb) new d(settingsCustomizeEmojisPresenter));
                akcr.a(obj, "identityApi.get().update…age}\")\n                })");
                std.a(obj, settingsCustomizeEmojisPresenter.b);
                settingsCustomizeEmojisPresenter.c.set(false);
            }
        }
    }

    static final class e extends akcs implements akbk<Map<String, String>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FriendmojiCategory[] values = FriendmojiCategory.values();
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(values.length), 16));
            for (FriendmojiCategory friendmojiCategory : values) {
                linkedHashMap.put(friendmojiCategory.getCategory(), friendmojiCategory.getEmoji());
            }
            return ajzm.d(linkedHashMap);
        }
    }

    static final class f extends akcs implements akbk<ajdp<Map<String, ? extends aejy>>> {
        final /* synthetic */ SettingsCustomizeEmojisPresenter a;

        /* renamed from: com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisPresenter$f$1 */
        static final class AnonymousClass1<T, R> implements ajfc<T, R> {
            private /* synthetic */ f a;

            AnonymousClass1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List<FriendmojiForType> list = (List) obj;
                akcr.b(list, Event.LIST);
                Map linkedHashMap = new LinkedHashMap();
                for (FriendmojiForType friendmojiForType : list) {
                    aejy aejy = new aejy();
                    aejy.b = (String) this.a.a.a().get(friendmojiForType.category());
                    aejy.d = friendmojiForType.description();
                    aejy.e = friendmojiForType.pickerDescription();
                    Long rank = friendmojiForType.rank();
                    aejy.h = rank != null ? Integer.valueOf((int) rank.longValue()) : null;
                    aejy.c = friendmojiForType.title();
                    aejy.g = (String) this.a.a.a().get(friendmojiForType.category());
                    if (friendmojiForType.emoji() != null) {
                        aejy.b = friendmojiForType.emoji();
                    }
                    if (!(friendmojiForType.category().equals("group") || aejy.g == null)) {
                        Object category = friendmojiForType.category();
                        akcr.a(category, "it.category()");
                        linkedHashMap.put(category, aejy);
                    }
                }
                return ajzm.c(linkedHashMap);
            }
        }

        f(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter) {
            this.a = settingsCustomizeEmojisPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((iqz) this.a.f.get()).a(FriendmojiType.MUTABLE).b((ajdw) this.a.a.i()).p(new AnonymousClass1(this));
        }
    }

    static final class h extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ SettingsCustomizeEmojisPresenter a;

        /* renamed from: com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisPresenter$h$2 */
        static final class AnonymousClass2<T> implements ajfb<aekb> {
            private /* synthetic */ h a;

            AnonymousClass2(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                aekb aekb = (aekb) obj;
                SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter = this.a.a;
                obj = aekb.b;
                akcr.a(obj, "it.friendmojiDictionary");
                SettingsCustomizeEmojisPresenter.a(settingsCustomizeEmojisPresenter, obj);
            }
        }

        /* renamed from: com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisPresenter$h$3 */
        static final class AnonymousClass3<T> implements ajfb<Throwable> {
            private /* synthetic */ h a;

            AnonymousClass3(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Toast.makeText(this.a.a.d, R.string.settings_custom_emojis_failure_message, 0).show();
            }
        }

        h(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter) {
            this.a = settingsCustomizeEmojisPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((ilv) this.a.g.get()).c((ily) ind.FRIENDMOJI_RESET_ACCEPT, 1);
            obj = ((ira) this.a.e.get()).r().b((ajdw) this.a.a.g()).f(AnonymousClass1.a).a((ajdw) this.a.a.l()).a((ajfb) new AnonymousClass2(this), (ajfb) new AnonymousClass3(this));
            akcr.a(obj, "identityApi.get().resetF…                       })");
            std.a(obj, this.a.b);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SettingsCustomizeEmojisPresenter.class), "defaultFriendMojiMap", "getDefaultFriendMojiMap()Ljava/util/Map;"), new akdc(akde.a(SettingsCustomizeEmojisPresenter.class), "friendmojiMap", "getFriendmojiMap()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public SettingsCustomizeEmojisPresenter(gpb gpb, Context context, aipn<ira> aipn, aipn<iqz> aipn2, aipn<achb<zjm, zjk>> aipn3, jjh jjh, zgb zgb, aipn<ilv> aipn4, ajwy<ftl> ajwy) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(aipn, "identityApi");
        akcr.b(aipn2, "friendmojiApi");
        akcr.b(aipn3, "navigationHost");
        akcr.b(jjh, "identityFragmentFactory");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn4, "graphene");
        akcr.b(ajwy, "configProvider");
        this.o = gpb;
        this.d = context;
        this.e = aipn;
        this.f = aipn2;
        this.p = aipn3;
        this.q = jjh;
        this.g = aipn4;
        this.r = ajwy;
    }

    public static final /* synthetic */ void a(SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter, Map map) {
        ((ilv) settingsCustomizeEmojisPresenter.g.get()).c((ily) ind.FRIENDMOJI_UPDATE_COMPLETED, 1);
        if (settingsCustomizeEmojisPresenter.k == null) {
            akcr.a("adapter");
        }
        Object e = ((iqz) settingsCustomizeEmojisPresenter.f.get()).a(map).e();
        akcr.a(e, "friendmojiApi.get().appl…             .subscribe()");
        std.a(e, settingsCustomizeEmojisPresenter.b);
    }

    /* Access modifiers changed, original: final */
    public final Map<String, String> a() {
        return (Map) this.m.b();
    }

    /* renamed from: a */
    public final void takeTarget(jna jna) {
        akcr.b(jna, "target");
        super.takeTarget(jna);
        jna.getLifecycle().a(this);
    }

    public final void dropTarget() {
        jna jna = (jna) getTarget();
        if (jna != null) {
            j lifecycle = jna.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        this.b.dispose();
        super.dropTarget();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCustomEmojiCategoryItemClickedEvent(jmg jmg) {
        akcr.b(jmg, "itemClickedEvent");
        if (this.c.compareAndSet(false, true)) {
            ((ilv) this.g.get()).c(ind.FRIENDMOJI_PICKER_SHOW.a("category", jmg.a.a), 1);
            MainPageFragment a = this.q.a(jmg.a.a, jmg.a.d, jmg.a.e, jmg.a.f);
            Object f = ((SettingsCustomizeEmojisDetailFragment) a).f.f((ajfb) new g(this));
            akcr.a(f, "(fragment as SettingsCus…mojiCategoryChanged(it) }");
            std.a(f, this.b);
            zjf zjf = new zjf(itx.a, a, acgv.a().a(itx.d).a());
            achb achb = (achb) this.p.get();
            achd achd = zjf;
            acgu acgu = itx.c;
            akcr.a((Object) acgu, "SettingsCustomizeEmojisF…ZE_EMOJIS_PRESENT_DEFAULT");
            achb.a(achd, acgu, null);
            this.c.set(false);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCustomEmojisCategoryFooterClickedEvent(jmk jmk) {
        akcr.b(jmk, "itemClickedEvent");
        if (this.c.compareAndSet(false, true)) {
            ((ilv) this.g.get()).c((ily) ind.FRIENDMOJI_RESET_SHOW, 1);
            zjm zjm = new zjm(irc.t, "choose_request_verify_code_method", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = this.d;
            Object obj = this.p.get();
            akcr.a(obj, "navigationHost.get()");
            defpackage.zgy.a aVar = new defpackage.zgy.a(context, (achb) obj, zjm, false, null, 24);
            String string = this.d.getString(R.string.settings_custom_emojis_reset_message);
            akcr.a((Object) string, "context.getString(R.stri…tom_emojis_reset_message)");
            zgy a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.settings_custom_emojis_reset_message_confirm, (akbl) new h(this), true), null, false, null, null, null, 31).a();
            ((achb) this.p.get()).a((achd) a, a.a, null);
            this.c.set(false);
        }
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.h.compareAndSet(false, true)) {
            jna jna = (jna) getTarget();
            if (jna != null) {
                this.l = jna.a();
                this.j = new zkf();
                zkf zkf = this.j;
                String str = "bus";
                if (zkf == null) {
                    akcr.a(str);
                }
                zkf.a(this);
                this.i = new zms(jms.class);
                jmj jmj = new jmj(new jmr());
                jmn jmn = new jmn(this.o, (ajdp) this.n.b());
                Object b = ((ftl) this.r.get()).b((fth) jic.EMOJI_SKIN_TONE_PICKER_ENABLED);
                akcr.a(b, "configProvider.get().get…SKIN_TONE_PICKER_ENABLED)");
                b = b.i();
                akcr.a(b, "isEmojiSkinToneEnabled().toObservable()");
                Object k = ((ftl) this.r.get()).k(jic.DEFAULT_EMOJI_SKIN_TONE);
                akcr.a(k, "configProvider.get().get….DEFAULT_EMOJI_SKIN_TONE)");
                k = k.i();
                akcr.a(k, "defaultEmojiSkinTone().toObservable()");
                Object of = ImmutableList.of(jmj, jmn, new jnc(b, k), new jmj(new jmm()));
                akcr.a(of, "ImmutableList.of(\n      …tegoryFooterViewModel()))");
                zms zms = this.i;
                if (zms == null) {
                    akcr.a("viewFactory");
                }
                zkf zkf2 = this.j;
                if (zkf2 == null) {
                    akcr.a(str);
                }
                zke a = zkf2.a();
                akcr.a((Object) a, "bus.eventDispatcher");
                this.k = new zmh(zms, a, (ajdw) this.a.b(), (ajdw) this.a.l(), ajyu.k((Iterable) of), 32);
                RecyclerView recyclerView = this.l;
                str = "recyclerView";
                if (recyclerView == null) {
                    akcr.a(str);
                }
                zmh zmh = this.k;
                String str2 = "adapter";
                if (zmh == null) {
                    akcr.a(str2);
                }
                recyclerView.setAdapter(zmh);
                recyclerView = this.l;
                if (recyclerView == null) {
                    akcr.a(str);
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(this.d, 1, false));
                recyclerView = this.l;
                if (recyclerView == null) {
                    akcr.a(str);
                }
                recyclerView.addItemDecoration(new DividerItemDecoration(this.d, 1));
                zmh zmh2 = this.k;
                if (zmh2 == null) {
                    akcr.a(str2);
                }
                zln.bindTo$default(this, zmh2.e(), this, null, null, 6, null);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSkinToneCategoryClickedEvent(jnb jnb) {
        akcr.b(jnb, "itemClickedEvent");
        if (this.c.compareAndSet(false, true)) {
            ((ilv) this.g.get()).c((ily) ind.FRIENDMOJI_PICKER_SHOW, 1);
            zjf zjf = new zjf(itx.a, this.q.i(), acgv.a().a(itx.d).a());
            achb achb = (achb) this.p.get();
            achd achd = zjf;
            acgu acgu = itx.c;
            akcr.a((Object) acgu, "SettingsCustomizeEmojisF…ZE_EMOJIS_PRESENT_DEFAULT");
            achb.a(achd, acgu, null);
            this.c.set(false);
        }
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onTargetCreate() {
        ((ilv) this.g.get()).c((ily) ind.FRIENDMOJI_SHOW, 1);
    }
}
