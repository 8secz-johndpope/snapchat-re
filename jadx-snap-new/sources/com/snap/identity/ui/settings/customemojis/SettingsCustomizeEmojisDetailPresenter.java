package com.snap.identity.ui.settings.customemojis;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import defpackage.abqg;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyl;
import defpackage.ajyu;
import defpackage.ajzt;
import defpackage.akbk;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akqq;
import defpackage.gpb;
import defpackage.itx;
import defpackage.j;
import defpackage.jmh;
import defpackage.jmi;
import defpackage.jmj;
import defpackage.jmt;
import defpackage.jmw;
import defpackage.jmy;
import defpackage.jmz;
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
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class SettingsCustomizeEmojisDetailPresenter extends zll<jmz> implements k {
    static final Set<String> g = ajzt.a((Object[]) new String[]{"👻", "🌺", "💯", "👽", "🤖", "⌛️", "\u0000231B", "⏳", "📲"});
    final zfw a = zgb.a(itx.e, "SettingsCustomizeEmojisDetailPresenter");
    ajwl<jmh> b;
    String c;
    String d;
    String e;
    String f;
    private final ajxe h;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final ajwl<String> k;
    private ajei l;
    private String m;
    private zms n;
    private zkf o;
    private zmh p;
    private TextView q;
    private RecyclerView r;
    private final ajxe s;
    private final gpb t;
    private final Context u;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class d extends ItemDecoration {
        d() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            akcr.b(rect, "outRect");
            akcr.b(view, "view");
            akcr.b(recyclerView, "parent");
            akcr.b(state, "state");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != 0) {
                childAdapterPosition = (childAdapterPosition - 1) % 5;
                int width = (int) (((float) recyclerView.getWidth()) * 0.05f);
                int i = width / 6;
                width /= 5;
                if (childAdapterPosition == 0) {
                    rect.left = i;
                    width -= i;
                } else if (childAdapterPosition == 4) {
                    rect.left = width - i;
                    rect.right = i;
                    rect.bottom = i;
                } else {
                    width /= 2;
                    rect.left = width;
                }
                rect.right = width;
                rect.bottom = i;
            }
        }
    }

    public static final class e extends SpanSizeLookup {
        e() {
        }

        public final int getSpanSize(int i) {
            return i == 0 ? 5 : 1;
        }
    }

    static final class c extends akcs implements akbk<ajdp<List<? extends String>>> {
        final /* synthetic */ SettingsCustomizeEmojisDetailPresenter a;

        /* renamed from: com.snap.identity.ui.settings.customemojis.SettingsCustomizeEmojisDetailPresenter$c$1 */
        static final class AnonymousClass1<V> implements Callable<T> {
            private /* synthetic */ c a;

            AnonymousClass1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object call() {
                String str = "emojiCodes";
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object a = abqg.a();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object b = abqg.b();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object c = abqg.c();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object d = abqg.d();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object e = abqg.e();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object f = abqg.f();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object g = abqg.g();
                akcr.a(((abqg) this.a.a.h.b()), str);
                Object h = abqg.h();
                akcr.a(a, "peopleEmoji");
                Collection collection = (Collection) a;
                akcr.a(b, "animalAndNatureEmoji");
                collection = ajyu.d(collection, (Iterable) b);
                akcr.a(c, "foodAndDrinkEmoji");
                collection = ajyu.d(collection, (Iterable) c);
                akcr.a(d, "activityEmoji");
                collection = ajyu.d(collection, (Iterable) d);
                akcr.a(e, "travelEmoji");
                collection = ajyu.d(collection, (Iterable) e);
                akcr.a(f, "objEmoji");
                collection = ajyu.d(collection, (Iterable) f);
                akcr.a(g, "symbolEmoji");
                collection = ajyu.d(collection, (Iterable) g);
                akcr.a(h, "flagEmoji");
                List d2 = ajyu.d(collection, (Iterable) h);
                Collection a2 = ajyl.a(SettingsCustomizeEmojisDetailPresenter.b(this.a.a));
                Collection arrayList = new ArrayList();
                for (Object c2 : d2) {
                    d = (String) c2;
                    int i = 1;
                    if ((akcr.a(d, SettingsCustomizeEmojisDetailPresenter.b(this.a.a)) ^ 1) == 0 || SettingsCustomizeEmojisDetailPresenter.g.contains(d)) {
                        i = 0;
                    }
                    if (i != 0) {
                        arrayList.add(c2);
                    }
                }
                return ajyu.d(a2, (Iterable) (List) arrayList);
            }
        }

        c(SettingsCustomizeEmojisDetailPresenter settingsCustomizeEmojisDetailPresenter) {
            this.a = settingsCustomizeEmojisDetailPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdx.c((Callable) new AnonymousClass1(this)).b((ajdw) this.a.a.h()).i();
        }
    }

    static final class b extends akcq implements akbk<abqg> {
        b(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (abqg) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SettingsCustomizeEmojisDetailPresenter.class), "emojiCodes", "getEmojiCodes()Lcom/snapchat/android/framework/misc/emoji/EmojiUnicodes10;"), new akdc(akde.a(SettingsCustomizeEmojisDetailPresenter.class), "friendmojiItems", "getFriendmojiItems()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public SettingsCustomizeEmojisDetailPresenter(gpb gpb, Context context, aipn<abqg> aipn, zgb zgb) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(aipn, "emojiUnicodes");
        akcr.b(zgb, "schedulersProvider");
        this.t = gpb;
        this.u = context;
        this.h = ajxh.a(new b(aipn));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.k = ajwl;
        this.s = ajxh.a(new c(this));
    }

    public static final /* synthetic */ String b(SettingsCustomizeEmojisDetailPresenter settingsCustomizeEmojisDetailPresenter) {
        String str = settingsCustomizeEmojisDetailPresenter.f;
        if (str == null) {
            akcr.a("defaultEmojiUnicode");
        }
        return str;
    }

    /* renamed from: a */
    public final void takeTarget(jmz jmz) {
        akcr.b(jmz, "target");
        super.takeTarget(jmz);
        this.l = new ajei();
        jmz.getLifecycle().a(this);
    }

    public final void dropTarget() {
        jmz jmz = (jmz) getTarget();
        if (jmz != null) {
            j lifecycle = jmz.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        ajei ajei = this.l;
        if (ajei == null) {
            akcr.a("disposables");
        }
        ajei.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCustomEmojiDetailItemClickedEvent(jmi jmi) {
        akcr.b(jmi, "itemClickedEvent");
        if (this.j.compareAndSet(false, true)) {
            this.k.a(jmi.a.a);
            TextView textView = this.q;
            if (textView == null) {
                akcr.a("headerTextView");
            }
            textView.setText(jmi.a.a);
            this.e = jmi.a.a;
            this.j.set(false);
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onFragmentPause() {
        Object obj = this.e;
        if (obj == null) {
            akcr.a("currentSelectedEmojiUnicode");
        }
        Object obj2 = this.m;
        if (obj2 == null) {
            akcr.a("firstSelectedEmojiUnicode");
        }
        if ((akcr.a(obj, obj2) ^ 1) != 0) {
            ajwl ajwl = this.b;
            if (ajwl == null) {
                akcr.a("updateEmojiSubject");
            }
            String str = this.c;
            if (str == null) {
                akcr.a("emojiCategory");
            }
            ajwl.a(new jmh(str, obj));
        }
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.i.compareAndSet(false, true)) {
            jmz jmz = (jmz) getTarget();
            if (jmz != null) {
                this.r = jmz.b();
                this.q = jmz.a();
                TextView textView = this.q;
                if (textView == null) {
                    akcr.a("headerTextView");
                }
                String str = this.e;
                String str2 = "currentSelectedEmojiUnicode";
                if (str == null) {
                    akcr.a(str2);
                }
                textView.setText(str);
                String str3 = this.e;
                if (str3 == null) {
                    akcr.a(str2);
                }
                this.m = str3;
                ajwl ajwl = this.k;
                Object obj = this.e;
                if (obj == null) {
                    akcr.a(str2);
                }
                ajwl.a(obj);
                this.o = new zkf();
                ajei ajei = this.l;
                str = "disposables";
                if (ajei == null) {
                    akcr.a(str);
                }
                zkf zkf = this.o;
                String str4 = "bus";
                if (zkf == null) {
                    akcr.a(str4);
                }
                ajei.a((ajej) zkf);
                zkf zkf2 = this.o;
                if (zkf2 == null) {
                    akcr.a(str4);
                }
                zkf2.a(this);
                this.n = new zms(jmy.class);
                jmj jmj = new jmj(new jmw(jmy.CUSTOM_EMOJIS_DETAIL_TOP_ANCHOR, this.d));
                gpb gpb = this.t;
                String str5 = this.c;
                if (str5 == null) {
                    akcr.a("emojiCategory");
                }
                Object of = ImmutableList.of(jmj, new jmt(gpb, str5, this.k, (ajdp) this.s.b()));
                akcr.a(of, "ImmutableList.of(\n      …ubject, friendmojiItems))");
                zms zms = this.n;
                if (zms == null) {
                    akcr.a("viewFactory");
                }
                zkf zkf3 = this.o;
                if (zkf3 == null) {
                    akcr.a(str4);
                }
                zke a = zkf3.a();
                akcr.a((Object) a, "bus.eventDispatcher");
                this.p = new zmh(zms, a, (ajdw) this.a.b(), (ajdw) this.a.l(), ajyu.k((Iterable) of), 32);
                RecyclerView recyclerView = this.r;
                str2 = "recyclerView";
                if (recyclerView == null) {
                    akcr.a(str2);
                }
                zmh zmh = this.p;
                String str6 = "adapter";
                if (zmh == null) {
                    akcr.a(str6);
                }
                recyclerView.setAdapter(zmh);
                recyclerView = this.r;
                if (recyclerView == null) {
                    akcr.a(str2);
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.u, 5);
                gridLayoutManager.setSpanSizeLookup(new e());
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.r;
                if (recyclerView == null) {
                    akcr.a(str2);
                }
                recyclerView.addItemDecoration(new d());
                ajei = this.l;
                if (ajei == null) {
                    akcr.a(str);
                }
                zmh zmh2 = this.p;
                if (zmh2 == null) {
                    akcr.a(str6);
                }
                ajei.a(zmh2.e());
            }
        }
    }
}
