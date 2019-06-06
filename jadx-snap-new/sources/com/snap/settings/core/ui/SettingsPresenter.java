package com.snap.settings.core.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.framework.channel.ChannelInfoStore;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.abss;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.ajyn;
import defpackage.ajzy;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.dbq;
import defpackage.evg;
import defpackage.ihm;
import defpackage.ilv;
import defpackage.wnr;
import defpackage.wns;
import defpackage.wnw;
import defpackage.wnx;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import defpackage.zln;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SettingsPresenter extends zll<wnw> implements defpackage.k {
    final Context a;
    final ajwy<wnx> b;
    final ajwy<ihm> c;
    final ajwy<ChannelInfoStore> d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final ajxe f = ajxh.a(a.a);
    private final ajxe g = ajxh.a(new m(this));
    private final ajxe h;
    private View i;
    private final ajxe j;
    private final ajxe k;
    private final Set<wns> l;
    private final abss m;
    private final ilv n;
    private final ajwy<evg> o;
    private final ajwy<dbq> p;

    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((wns) t).a().ItemGroupOrder), Integer.valueOf(((wns) t2).a().ItemGroupOrder));
        }
    }

    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((defpackage.wns.b) t).ItemGroupOrder), Integer.valueOf(((defpackage.wns.b) t2).ItemGroupOrder));
        }
    }

    public static final class d<T> implements Comparator<T> {
        private /* synthetic */ Comparator a;

        public d(Comparator comparator) {
            this.a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.a.compare(t, t2);
            return compare != 0 ? compare : ajzy.a(Integer.valueOf(((wns) t).c()), Integer.valueOf(((wns) t2).c()));
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SettingsPresenter a;

        e(SettingsPresenter settingsPresenter) {
            this.a = settingsPresenter;
        }

        public final void onClick(View view) {
            try {
                Intent intent = new Intent("com.snapchat.DEVELOPER_TWEAKS_MUSHROOM");
                intent.setPackage(this.a.a.getPackageName());
                intent.setFlags(335544320);
                this.a.a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    static final class f<T> implements ajfl<List<Object>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list.size() >= 10;
        }
    }

    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ SettingsPresenter a;

        /* renamed from: com.snap.settings.core.ui.SettingsPresenter$g$1 */
        static final class AnonymousClass1<V> implements Callable<T> {
            private /* synthetic */ g a;

            AnonymousClass1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object call() {
                return ((ChannelInfoStore) this.a.a.d.get()).a();
            }
        }

        g(SettingsPresenter settingsPresenter) {
            this.a = settingsPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((List) obj, "it");
            return ajdp.b((Callable) new AnonymousClass1(this));
        }
    }

    static final class h<T> implements ajfb<String> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ void accept(Object obj) {
            CharSequence charSequence = (String) obj;
            if (!TextUtils.isEmpty(charSequence)) {
                Toast.makeText(AppContext.get(), charSequence, 0).show();
            }
        }
    }

    static final class i<T, R> implements ajfc<Object[], R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            akcr.b(objArr, "it");
            boolean z = false;
            for (Object obj2 : objArr) {
                Object obj22 = ((obj22 instanceof Boolean) && ((Boolean) obj22).booleanValue()) ? 1 : null;
                if (obj22 != null) {
                    z = true;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ TextView a;

        j(TextView textView) {
            this.a = textView;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            TextView textView = this.a;
            akcr.a(obj, Property.VISIBLE);
            textView.setVisibility(obj.booleanValue() ? 0 : 8);
        }
    }

    static final class n<T> implements ajfb<String> {
        private /* synthetic */ TextView a;

        n(TextView textView) {
            this.a = textView;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            if (str != null) {
                TextView textView = this.a;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(str);
                }
            }
        }
    }

    static final class o<T> implements ajfb<Integer> {
        private /* synthetic */ TextView a;

        o(TextView textView) {
            this.a = textView;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            TextView textView = this.a;
            if (textView != null) {
                Context context = textView.getContext();
                if (obj != null && obj.intValue() == -1) {
                    obj = Integer.valueOf(R.color.off_black);
                }
                akcr.a(obj, "if (it == SettingsItem.D…                  else it");
                textView.setTextColor(ContextCompat.getColor(context, obj.intValue()));
            }
        }
    }

    static final class p<T> implements ajfb<Integer> {
        private /* synthetic */ TextView a;

        p(TextView textView) {
            this.a = textView;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            TextView textView = this.a;
            if (textView != null) {
                Context context = textView.getContext();
                if (obj != null && obj.intValue() == -1) {
                    obj = Integer.valueOf(R.color.light_charcoal);
                }
                akcr.a(obj, "if (it == SettingsItem.D…                  else it");
                textView.setTextColor(ContextCompat.getColor(context, obj.intValue()));
            }
        }
    }

    static final class q<T> implements ajfb<Integer> {
        private /* synthetic */ ImageView a;

        q(ImageView imageView) {
            this.a = imageView;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            ImageView imageView = this.a;
            if (imageView != null) {
                if (obj != null && obj.intValue() == -1) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                akcr.a(obj, "it");
                imageView.setImageResource(obj.intValue());
            }
        }
    }

    static final class r<T> implements ajfb<Boolean> {
        private /* synthetic */ View a;

        r(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            View view = this.a;
            akcr.a(obj, Property.VISIBLE);
            view.setVisibility(obj.booleanValue() ? 0 : 8);
        }
    }

    static final class s<T, R> implements ajfc<T, R> {
        private /* synthetic */ wns a;

        s(wns wns) {
            this.a = wns;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "value");
            return new ajxm(this.a, bool);
        }
    }

    static final class t<T> implements ajfb<ajxm<wns, ? extends Boolean>> {
        private /* synthetic */ SettingsPresenter a;

        t(SettingsPresenter settingsPresenter) {
            this.a = settingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            this.a.a().put(ajxm.a, ajxm.b);
        }
    }

    static final class u<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsPresenter a;
        private /* synthetic */ LinearLayout b;

        u(SettingsPresenter settingsPresenter, LinearLayout linearLayout) {
            this.a = settingsPresenter;
            this.b = linearLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(this.b);
        }
    }

    static final class v implements ajev {
        private /* synthetic */ SettingsPresenter a;
        private /* synthetic */ LinearLayout b;

        v(SettingsPresenter settingsPresenter, LinearLayout linearLayout) {
            this.a = settingsPresenter;
            this.b = linearLayout;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    static final class a extends akcs implements akbk<ajei> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        k(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wnr.d.callsite("SettingsPresenter"));
        }
    }

    static final class l extends akcs implements akbk<ConcurrentHashMap<wns, Boolean>> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class m extends akcs implements akbk<wnx> {
        private /* synthetic */ SettingsPresenter a;

        m(SettingsPresenter settingsPresenter) {
            this.a = settingsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (wnx) this.a.b.get();
        }
    }

    static final class w extends akcs implements akbk<ihm> {
        private /* synthetic */ SettingsPresenter a;

        w(SettingsPresenter settingsPresenter) {
            this.a = settingsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihm) this.a.c.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SettingsPresenter.class), "disposables", "getDisposables()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(SettingsPresenter.class), "settingsService", "getSettingsService()Lcom/snap/settings/api/SettingsSyncService;"), new akdc(akde.a(SettingsPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SettingsPresenter.class), "settingItemsEnablingFlagMap", "getSettingItemsEnablingFlagMap()Ljava/util/concurrent/ConcurrentHashMap;"), new akdc(akde.a(SettingsPresenter.class), "stopwatch", "getStopwatch()Lcom/snap/framework/time/Stopwatch;")};
    }

    public SettingsPresenter(Set<wns> set, Context context, abss abss, ajwy<wnx> ajwy, zgb zgb, ilv ilv, ajwy<ihm> ajwy2, ajwy<evg> ajwy3, ajwy<dbq> ajwy4, ajwy<ChannelInfoStore> ajwy5) {
        akcr.b(set, "settings");
        akcr.b(context, "context");
        akcr.b(abss, "releaseManager");
        akcr.b(ajwy, "settingsSyncService");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ilv, "graphene");
        akcr.b(ajwy2, "stopwatchProvider");
        akcr.b(ajwy3, "circumstanceEngineProvider");
        akcr.b(ajwy4, "benchmarksApiProvider");
        akcr.b(ajwy5, "channelInfoStore");
        this.l = set;
        this.a = context;
        this.m = abss;
        this.b = ajwy;
        this.n = ilv;
        this.c = ajwy2;
        this.o = ajwy3;
        this.p = ajwy4;
        this.d = ajwy5;
        this.h = ajxh.a(new k(zgb));
        this.j = ajxh.a(l.a);
        this.k = ajxh.a(new w(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0074 in {5, 7, 9} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void a(defpackage.wns.b r8, java.util.List<? extends defpackage.wns> r9, android.widget.LinearLayout r10, android.view.LayoutInflater r11) {
        /*
        r7 = this;
        r0 = r10;
        r0 = (android.view.ViewGroup) r0;
        r1 = 2131559349; // 0x7f0d03b5 float:1.874404E38 double:1.0531302464E-314;
        r2 = 0;
        r11 = r11.inflate(r1, r0, r2);
        if (r11 == 0) goto L_0x006c;
        r11 = (android.widget.TextView) r11;
        r8 = r8.headerResourceId;
        r11.setText(r8);
        r8 = r11;
        r8 = (android.view.View) r8;
        r10.addView(r8);
        r9 = (java.lang.Iterable) r9;
        r8 = new java.util.ArrayList;
        r10 = 10;
        r10 = defpackage.ajyn.a(r9, r10);
        r8.<init>(r10);
        r8 = (java.util.Collection) r8;
        r9 = r9.iterator();
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x0041;
        r10 = r9.next();
        r10 = (defpackage.wns) r10;
        r10 = r10.l();
        r8.add(r10);
        goto L_0x002d;
        r8 = (java.util.List) r8;
        r8 = (java.lang.Iterable) r8;
        r9 = com.snap.settings.core.ui.SettingsPresenter.i.a;
        r9 = (defpackage.ajfc) r9;
        r8 = defpackage.ajdp.a(r8, r9);
        r9 = defpackage.ajef.a();
        r8 = r8.a(r9);
        r9 = new com.snap.settings.core.ui.SettingsPresenter$j;
        r9.<init>(r11);
        r9 = (defpackage.ajfb) r9;
        r1 = r8.f(r9);
        r2 = r7;
        r2 = (defpackage.zln) r2;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r7;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        return;
        r8 = new ajxt;
        r9 = "null cannot be cast to non-null type android.widget.TextView";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.settings.core.ui.SettingsPresenter.a(wns$b, java.util.List, android.widget.LinearLayout, android.view.LayoutInflater):void");
    }

    private final ajei b() {
        return (ajei) this.f.b();
    }

    private final wnx c() {
        return (wnx) this.g.b();
    }

    private final zfw d() {
        return (zfw) this.h.b();
    }

    private final ihm e() {
        return (ihm) this.k.b();
    }

    /* Access modifiers changed, original: final */
    public final ConcurrentHashMap<wns, Boolean> a() {
        return (ConcurrentHashMap) this.j.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:102:0x03bc in {2, 12, 13, 15, 16, 18, 24, 25, 38, 45, 46, 51, 58, 65, 69, 76, 79, 82, 83, 84, 91, 93, 96, 97, 99, 101} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final void a(android.widget.LinearLayout r25) {
        /*
        r24 = this;
        r7 = r24;
        r8 = r25;
        r0 = r7.n;
        r1 = defpackage.ipa.MAIN_PAGE_FLAG_LOADING;
        r1 = (defpackage.ily) r1;
        r2 = r24.e();
        r2 = r2.c();
        r0.a(r1, r2);
        r0 = r7.i;
        if (r0 == 0) goto L_0x001e;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r7.l;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        r10 = 0;
        if (r2 == 0) goto L_0x006b;
        r2 = r0.next();
        r3 = r2;
        r3 = (defpackage.wns) r3;
        r4 = r3.e();
        if (r4 == 0) goto L_0x0064;
        r4 = r24.a();
        r3 = r4.get(r3);
        if (r3 == 0) goto L_0x0056;
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0054;
        goto L_0x0064;
        r9 = 0;
        goto L_0x0065;
        r0 = new java.lang.IllegalStateException;
        r1 = "Required value was null.";
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        r9 = 1;
        if (r9 == 0) goto L_0x002d;
        r1.add(r2);
        goto L_0x002d;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new com.snap.settings.core.ui.SettingsPresenter$b;
        r0.<init>();
        r0 = (java.util.Comparator) r0;
        r2 = new com.snap.settings.core.ui.SettingsPresenter$d;
        r2.<init>(r0);
        r2 = (java.util.Comparator) r2;
        r0 = defpackage.ajyu.a(r1, r2);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.LinkedHashMap;
        r1.<init>();
        r1 = (java.util.Map) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x00b3;
        r2 = r0.next();
        r3 = r2;
        r3 = (defpackage.wns) r3;
        r3 = r3.a();
        r4 = r1.get(r3);
        if (r4 != 0) goto L_0x00ad;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r1.put(r3, r4);
        r4 = (java.util.List) r4;
        r4.add(r2);
        goto L_0x008e;
        r0 = new com.snap.settings.core.ui.SettingsPresenter$c;
        r0.<init>();
        r0 = (java.util.Comparator) r0;
        r11 = defpackage.ajzl.a(r1, r0);
        r0 = r7.a;
        r1 = "layout_inflater";
        r0 = r0.getSystemService(r1);
        if (r0 == 0) goto L_0x03b4;
        r12 = r0;
        r12 = (android.view.LayoutInflater) r12;
        r0 = r11.keySet();
        r13 = r0.iterator();
        r0 = r13.hasNext();
        if (r0 == 0) goto L_0x0294;
        r0 = r13.next();
        r0 = (defpackage.wns.b) r0;
        r1 = r11.get(r0);
        r14 = r1;
        r14 = (java.util.List) r14;
        if (r14 == 0) goto L_0x0291;
        r1 = "itemGroup";
        defpackage.akcr.a(r0, r1);
        r7.a(r0, r14, r8, r12);
        r15 = r14.iterator();
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x0291;
        r0 = r15.next();
        r6 = r0;
        r6 = (defpackage.wns) r6;
        r0 = 2131559348; // 0x7f0d03b4 float:1.8744038E38 double:1.053130246E-314;
        r5 = r8;
        r5 = (android.view.ViewGroup) r5;
        r4 = r12.inflate(r0, r5, r10);
        r0 = "inflater.inflate(com.sna…      itemsLayout, false)";
        defpackage.akcr.a(r4, r0);
        r0 = 2131430140; // 0x7f0b0afc float:1.8481973E38 double:1.0530664087E-314;
        r0 = r4.findViewById(r0);
        r3 = r0;
        r3 = (android.widget.TextView) r3;
        r0 = 2131430142; // 0x7f0b0afe float:1.8481977E38 double:1.0530664097E-314;
        r0 = r4.findViewById(r0);
        r2 = r0;
        r2 = (android.widget.TextView) r2;
        r0 = 2131430141; // 0x7f0b0afd float:1.8481975E38 double:1.053066409E-314;
        r0 = r4.findViewById(r0);
        r1 = r0;
        r1 = (android.widget.ImageView) r1;
        if (r3 == 0) goto L_0x013a;
        r3.setVisibility(r10);
        r0 = r6.b();
        r3.setText(r0);
        r0 = r6.f();
        if (r0 == 0) goto L_0x017e;
        r9 = defpackage.ajef.a();
        r0 = r0.a(r9);
        if (r0 == 0) goto L_0x017e;
        r9 = new com.snap.settings.core.ui.SettingsPresenter$n;
        r9.<init>(r2);
        r9 = (defpackage.ajfb) r9;
        r9 = r0.f(r9);
        if (r9 == 0) goto L_0x017e;
        r16 = r7;
        r16 = (defpackage.zln) r16;
        r17 = 0;
        r18 = 0;
        r19 = 6;
        r20 = 0;
        r0 = r24;
        r10 = r1;
        r1 = r9;
        r9 = r2;
        r2 = r16;
        r21 = r3;
        r3 = r17;
        r22 = r4;
        r4 = r18;
        r23 = r5;
        r5 = r19;
        r16 = r6;
        r6 = r20;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x0188;
        r10 = r1;
        r9 = r2;
        r21 = r3;
        r22 = r4;
        r23 = r5;
        r16 = r6;
        r0 = r16.m();
        if (r0 == 0) goto L_0x019d;
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        if (r10 == 0) goto L_0x019d;
        r1 = 0;
        r10.setVisibility(r1);
        r10.setImageResource(r0);
        r0 = r16.h();
        if (r0 == 0) goto L_0x01c8;
        r1 = defpackage.ajef.a();
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x01c8;
        r1 = new com.snap.settings.core.ui.SettingsPresenter$o;
        r2 = r21;
        r1.<init>(r2);
        r1 = (defpackage.ajfb) r1;
        r1 = r0.f(r1);
        if (r1 == 0) goto L_0x01c8;
        r2 = r7;
        r2 = (defpackage.zln) r2;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = r16.g();
        if (r0 == 0) goto L_0x01f1;
        r1 = defpackage.ajef.a();
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x01f1;
        r1 = new com.snap.settings.core.ui.SettingsPresenter$p;
        r1.<init>(r9);
        r1 = (defpackage.ajfb) r1;
        r1 = r0.f(r1);
        if (r1 == 0) goto L_0x01f1;
        r2 = r7;
        r2 = (defpackage.zln) r2;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = r16.k();
        if (r0 == 0) goto L_0x01fd;
        if (r9 == 0) goto L_0x01fd;
        r0 = 3;
        r9.setTextDirection(r0);
        r0 = r16.i();
        if (r0 == 0) goto L_0x0226;
        r1 = defpackage.ajef.a();
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x0226;
        r1 = new com.snap.settings.core.ui.SettingsPresenter$q;
        r1.<init>(r10);
        r1 = (defpackage.ajfb) r1;
        r1 = r0.f(r1);
        if (r1 == 0) goto L_0x0226;
        r2 = r7;
        r2 = (defpackage.zln) r2;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = r16.l();
        r1 = defpackage.ajef.a();
        r0 = r0.a(r1);
        r1 = new com.snap.settings.core.ui.SettingsPresenter$r;
        r9 = r22;
        r1.<init>(r9);
        r1 = (defpackage.ajfb) r1;
        r1 = r0.f(r1);
        r10 = r7;
        r10 = (defpackage.zln) r10;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        r2 = r10;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r1 = r16.j();
        if (r1 == 0) goto L_0x025c;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        r2 = r10;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r0 = r16.d();
        r9.setOnClickListener(r0);
        r8.addView(r9);
        r0 = defpackage.ajyu.h(r14);
        r0 = (defpackage.wns) r0;
        r1 = r16;
        r0 = defpackage.akcr.a(r1, r0);
        r2 = 1;
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x027e;
        r0 = 2131558958; // 0x7f0d022e float:1.8743246E38 double:1.053130053E-314;
        r3 = r23;
        r12.inflate(r0, r3, r2);
        r0 = r24.c();
        r2 = "settingsService";
        defpackage.akcr.a(r0, r2);
        r2 = r24.b();
        r1.a(r0, r2);
        r10 = 0;
        goto L_0x00f4;
        r10 = 0;
        goto L_0x00d3;
        r9 = r8;
        r9 = (android.view.ViewGroup) r9;
        r10 = 2131559361; // 0x7f0d03c1 float:1.8744064E38 double:1.0531302523E-314;
        r0 = 0;
        r1 = r12.inflate(r10, r9, r0);
        r11 = "null cannot be cast to non-null type android.widget.TextView";
        if (r1 == 0) goto L_0x03ae;
        r1 = (android.widget.TextView) r1;
        r2 = r7.a;
        r2 = r2.getPackageManager();
        r3 = r7.a;
        r3 = r3.getPackageName();
        r2 = r2.getPackageInfo(r3, r0);
        r2 = r2.versionName;
        r3 = r7.a;
        r4 = 2131890381; // 0x7f1210cd float:1.9415452E38 double:1.053293798E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r5[r0] = r2;
        r0 = r3.getString(r4, r5);
        r0 = (java.lang.CharSequence) r0;
        r1.setText(r0);
        r13 = r1;
        r13 = (android.view.View) r13;
        r0 = defpackage.cfl.c(r13);
        r0 = defpackage.ajpy.k(r0);
        r0 = r0.a();
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r1 = r0.d(r1, r3);
        r1 = (defpackage.ajdt) r1;
        r0 = r0.b(r1);
        r1 = com.snap.settings.core.ui.SettingsPresenter.f.a;
        r1 = (defpackage.ajfl) r1;
        r0 = r0.a(r1);
        r1 = r24.d();
        r1 = r1.f();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = new com.snap.settings.core.ui.SettingsPresenter$g;
        r1.<init>(r7);
        r1 = (defpackage.ajfc) r1;
        r0 = r0.k(r1);
        r1 = r24.d();
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = com.snap.settings.core.ui.SettingsPresenter.h.a;
        r1 = (defpackage.ajfb) r1;
        r1 = r0.f(r1);
        r2 = r7;
        r2 = (defpackage.zln) r2;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r0 = r24;
        defpackage.zln.bindTo$default(r0, r1, r2, r3, r4, r5, r6);
        r8.addView(r13);
        r0 = r7.m;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0384;
        r0 = 0;
        r1 = r12.inflate(r10, r9, r0);
        if (r1 == 0) goto L_0x037e;
        r1 = (android.widget.TextView) r1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = new java.lang.StringBuilder;
        r3 = "\nVersion Code: ";
        r2.<init>(r3);
        r3 = r7.a;
        r3 = r3.getPackageManager();
        r4 = r7.a;
        r4 = r4.getPackageName();
        r5 = 0;
        r3 = r3.getPackageInfo(r4, r5);
        r3 = r3.versionCode;
        r2.append(r3);
        r2 = r2.toString();
        r0.append(r2);
        r0 = (java.lang.CharSequence) r0;
        r1.setText(r0);
        r0 = new com.snap.settings.core.ui.SettingsPresenter$e;
        r0.<init>(r7);
        r0 = (android.view.View.OnClickListener) r0;
        r1.setOnClickListener(r0);
        r1 = (android.view.View) r1;
        r8.addView(r1);
        goto L_0x0384;
        r0 = new ajxt;
        r0.<init>(r11);
        throw r0;
        r0 = r7.o;
        r0 = r0.get();
        r0 = (defpackage.evg) r0;
        r0.c();
        r0 = r7.p;
        r0 = r0.get();
        r0 = (defpackage.dbq) r0;
        r0 = r0.a();
        r1 = r24.b();
        defpackage.ajvv.a(r0, r1);
        r0 = r24.getTarget();
        r0 = (defpackage.wnw) r0;
        if (r0 == 0) goto L_0x03ad;
        r0.a();
        return;
        r0 = new ajxt;
        r0.<init>(r11);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type android.view.LayoutInflater";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.settings.core.ui.SettingsPresenter.a(android.widget.LinearLayout):void");
    }

    /* renamed from: a */
    public final void takeTarget(wnw wnw) {
        akcr.b(wnw, "target");
        super.takeTarget(wnw);
        wnw.getLifecycle().a(this);
    }

    public final void dropTarget() {
        wnw wnw = (wnw) getTarget();
        if (wnw != null) {
            defpackage.j lifecycle = wnw.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.e.compareAndSet(false, true)) {
            wnw wnw = (wnw) getTarget();
            if (wnw != null) {
                View a = wnw.a(R.id.settings_items_layout);
                if (a != null) {
                    LinearLayout linearLayout = (LinearLayout) a;
                    this.i = wnw.a(R.id.settings_main_page_flag_loading_view);
                    e().a();
                    Collection arrayList = new ArrayList();
                    for (Object next : this.l) {
                        if ((((wns) next).e() != null ? 1 : null) != null) {
                            arrayList.add(next);
                        }
                    }
                    List list = (List) arrayList;
                    if ((list.isEmpty() ^ 1) != 0) {
                        View view = this.i;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        Iterable<wns> iterable = list;
                        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (wns wns : iterable) {
                            a().put(wns, Boolean.FALSE);
                            ajdx e = wns.e();
                            if (e != null) {
                                arrayList2.add(e.f(new s(wns)).i());
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        ajej a2 = ajdp.a((Iterable) (List) arrayList2).b((ajdw) d().h()).a((ajdw) d().l()).a((ajfb) new t(this), (ajfb) new u(this, linearLayout), (ajev) new v(this, linearLayout));
                        akcr.a((Object) a2, "Observable.concat(flagCo…t)\n                    })");
                        ajvv.a(a2, b());
                    } else {
                        a(linearLayout);
                    }
                    zln.bindTo$default(this, c(), this, null, null, 6, null);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        b().a();
        a().clear();
    }
}
