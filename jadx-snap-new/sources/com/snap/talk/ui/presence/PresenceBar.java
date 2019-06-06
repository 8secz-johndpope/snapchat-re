package com.snap.talk.ui.presence;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.common.base.Objects;
import com.google.common.base.Supplier;
import com.snapchat.android.R;
import com.snapchat.talkcorev3.SpeechActivity;
import defpackage.abiy;
import defpackage.abjg;
import defpackage.abji;
import defpackage.abjv;
import defpackage.acbm;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akef;
import defpackage.aken;
import defpackage.iho;
import defpackage.jwa;
import defpackage.yww;
import defpackage.yxx;
import defpackage.yyo;
import defpackage.yys;
import defpackage.yyu;
import defpackage.yyv;
import defpackage.zai;
import defpackage.zap;
import defpackage.zdb;
import defpackage.zdm;
import defpackage.zdu;
import defpackage.zdw;
import defpackage.zeb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PresenceBar extends zeb<zdm, zdb> implements defpackage.abjg.c, yyo<zdm> {
    abjg a;
    boolean b;
    String c;
    private abji j;
    private yyu k;
    private Supplier<jwa> l;
    private final ajxe<ImageView> m;
    private final ajxe n;
    private final ajxe o;
    private boolean p;
    private boolean q;
    private String r;
    private yys s;
    private zap t;

    static final class b implements Runnable {
        final /* synthetic */ PresenceBar a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;
        private /* synthetic */ zdb d;

        public static final class a extends AnimatorListenerAdapter {
            private /* synthetic */ b a;

            public a(b bVar) {
                this.a = bVar;
            }

            public final void onAnimationEnd(Animator animator) {
                akcr.b(animator, "animation");
                this.a.a.m();
                abjg abjg = this.a.a.a;
                if (abjg == null) {
                    akcr.a("chatServices");
                }
                abjg.a(this.a.b, this.a.c, this.a.a.b, this.a.a);
            }
        }

        b(PresenceBar presenceBar, zdb zdb, String str, boolean z) {
            this.a = presenceBar;
            this.d = zdb;
            this.b = str;
            this.c = z;
        }

        public final void run() {
            if (this.d.b()) {
                this.a.m();
                return;
            }
            Animator a = this.d.a(true);
            if (a != null) {
                a.addListener(new a(this));
                a.start();
                return;
            }
            this.a.m();
        }
    }

    static final class a extends akcs implements akbk<ajxw> {
        final /* synthetic */ PresenceBar a;
        final /* synthetic */ zdb b;

        /* renamed from: com.snap.talk.ui.presence.PresenceBar$a$1 */
        static final class AnonymousClass1 implements Runnable {
            final /* synthetic */ a a;

            public static final class a extends AnimatorListenerAdapter {
                private /* synthetic */ AnonymousClass1 a;

                public a(AnonymousClass1 anonymousClass1) {
                    this.a = anonymousClass1;
                }

                public final void onAnimationEnd(Animator animator) {
                    akcr.b(animator, "animation");
                    this.a.a.a.m();
                    this.a.a.a.c = null;
                }
            }

            AnonymousClass1(a aVar) {
                this.a = aVar;
            }

            public final void run() {
                Animator a = this.a.b.a(false);
                if (a != null) {
                    a.addListener(new a(this));
                    a.start();
                    StringBuilder stringBuilder = new StringBuilder("Running deselect animation on ");
                    Object h = this.a.b.h();
                    akcr.a(h, "pill.user");
                    stringBuilder.append(h.a());
                    return;
                }
                this.a.a.m();
            }
        }

        a(PresenceBar presenceBar, zdb zdb) {
            this.a = presenceBar;
            this.b = zdb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.b.a(false) != null) {
                this.a.a((Runnable) new AnonymousClass1(this));
            } else {
                this.a.c = null;
            }
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<ImageView> {
        private /* synthetic */ PresenceBar a;
        private /* synthetic */ Context b;

        c(PresenceBar presenceBar, Context context) {
            this.a = presenceBar;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ImageView imageView = new ImageView(this.b);
            imageView.setImageResource(R.drawable.group_presence_bar_gradient_background);
            LayoutParams layoutParams = new LayoutParams(-1, this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_height) + this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_margin_vert));
            layoutParams.gravity = 80;
            imageView.setLayoutParams(layoutParams);
            this.a.addView(imageView, 0);
            return imageView;
        }
    }

    static final class d extends akcs implements akbk<Integer> {
        private /* synthetic */ PresenceBar a;
        private /* synthetic */ Context b;

        d(PresenceBar presenceBar, Context context) {
            this.a = presenceBar;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((this.b.getResources().getDimensionPixelSize(R.dimen.presence_circle_diameter) + (this.a.b ? this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_height) : 0)) + (this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_margin_vert) << 1));
        }
    }

    static final class e extends akcs implements akbk<Integer> {
        private /* synthetic */ PresenceBar a;
        private /* synthetic */ Context b;

        e(PresenceBar presenceBar, Context context) {
            this.a = presenceBar;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_height);
            int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.presence_pill_margin_vert);
            if (this.a.b) {
                dimensionPixelSize = (dimensionPixelSize * 2) + dimensionPixelSize2;
            }
            return Integer.valueOf(dimensionPixelSize + dimensionPixelSize2);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(PresenceBar.class), "inCallOffset", "getInCallOffset()I"), new akdc(akde.a(PresenceBar.class), "noCallOffset", "getNoCallOffset()I")};
    }

    public /* synthetic */ PresenceBar(Context context) {
        this(context, null);
    }

    public PresenceBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.m = ajxh.a(new c(this, context));
        this.n = ajxh.a(new d(this, context));
        this.o = ajxh.a(new e(this, context));
        setOverScrollMode(0);
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
    }

    private final int o() {
        return ((Number) this.n.b()).intValue();
    }

    private final int p() {
        return ((Number) this.o.b()).intValue();
    }

    private final void q() {
        if (!this.b || this.p) {
            if (this.m.a()) {
                ((ImageView) this.m.b()).setVisibility(8);
            }
            return;
        }
        ((ImageView) this.m.b()).setVisibility(0);
    }

    private final void r() {
        zap zap = this.t;
        if (zap == null) {
            akcr.a("messageListOffsetController");
        }
        zap.a(this.p ? o() : p(), defpackage.zap.a.PRESENCE_BAR);
    }

    private final List<zdb> s() {
        Object a;
        Iterable<abjv> k = k();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) k, 10));
        for (abjv a2 : k) {
            a = a2.a();
            akcr.a(a, "it.username");
            arrayList.add((zdb) a((String) a));
        }
        Collection arrayList2 = new ArrayList();
        for (Object a3 : (List) arrayList) {
            Object obj = (zdm) ((zdb) a3).p();
            akcr.a(obj, "it.state");
            if (obj.h()) {
                arrayList2.add(a3);
            }
        }
        return (List) arrayList2;
    }

    public final /* synthetic */ zdw a() {
        GroupCallingPresencePill groupCallingPresencePill;
        String str = "context";
        Object context;
        if (this.b) {
            context = getContext();
            akcr.a(context, str);
            groupCallingPresencePill = new GroupCallingPresencePill(context);
        } else {
            context = getContext();
            akcr.a(context, str);
            groupCallingPresencePill = new OneOnOneCallingPresencePill(context);
        }
        return groupCallingPresencePill;
    }

    public final void a(abjg abjg, String str, abji abji, yyu yyu, yys yys, zap zap, Supplier<jwa> supplier, boolean z) {
        akcr.b(abjg, "chatServices");
        akcr.b(str, "conversationId");
        akcr.b(abji, "chatTransportServices");
        akcr.b(yyu, "talkVideoManager");
        akcr.b(yys, "stateOfTheWorldController");
        akcr.b(zap, "messageListOffsetController");
        akcr.b(supplier, "bitmapFactory");
        super.a((yyv) yys);
        this.r = str;
        this.s = yys;
        this.t = zap;
        this.a = abjg;
        this.j = abji;
        this.k = yyu;
        this.l = supplier;
        this.b = z;
        q();
        r();
    }

    public final void a(abjv abjv, abiy abiy, zdb zdb, zdm zdm) {
        akcr.b(abjv, "participant");
        akcr.b(zdm, "pillState");
        yxx yxx = new yxx(abjv);
        yxx.a(zdm.d());
        Map map = this.e;
        Object a = yxx.a();
        akcr.a(a, "user.username");
        map.put(a, yxx);
        n().a(yxx, abiy, zdb, zdm);
    }

    public final void a(Iterable<SpeechActivity> iterable) {
        akcr.b(iterable, "speechActivityList");
        for (SpeechActivity speechActivity : iterable) {
            defpackage.zeb.a n = n();
            Object username = speechActivity.getUsername();
            akcr.a(username, "speechActivity.username");
            zdb zdb = (zdb) n.b(username);
            if (zdb != null) {
                zdb.a(speechActivity.getActivity());
            }
        }
    }

    public final void a(String str, boolean z) {
        akcr.b(str, "username");
        defpackage.acbm.a a = acbm.a();
        StringBuilder stringBuilder = new StringBuilder("Pill for user ");
        stringBuilder.append(str);
        stringBuilder.append(" selected, longPress? ");
        stringBuilder.append(z);
        String str2 = "PresenceBar";
        a.a(str2);
        zdb zdb = (zdb) a(str);
        Object obj = (zdm) zdb.p();
        akcr.a(obj, "pill.state");
        defpackage.acbm.a a2;
        StringBuilder stringBuilder2;
        if ((this.b || obj.d()) && !obj.f() && obj.l() && this.c == null) {
            Animator a3 = zdb.a(true);
            this.c = str;
            if (a3 == null) {
                abjg abjg = this.a;
                if (abjg == null) {
                    akcr.a("chatServices");
                }
                abjg.a(str, z, this.b, this);
                return;
            }
            a((Runnable) new b(this, zdb, str, z));
        } else if (z || !obj.h()) {
            a2 = acbm.a();
            stringBuilder2 = new StringBuilder("Ignoring selection on ");
            stringBuilder2.append(str);
            stringBuilder2.append(" with state ");
            stringBuilder2.append(obj);
            stringBuilder2.append(", current selected user is ");
            stringBuilder2.append(this.c);
            a2.a(str2);
        } else {
            a2 = acbm.a();
            stringBuilder2 = new StringBuilder("Simple tap detected on ");
            stringBuilder2.append(str);
            stringBuilder2.append(" which is in Video mode, will request Fullscreen");
            a2.a(str2);
            yys yys = this.s;
            String str3 = "stateOfTheWorldController";
            if (yys == null) {
                akcr.a(str3);
            }
            yys.a(true);
            yys = this.s;
            if (yys == null) {
                akcr.a(str3);
            }
            yys.ag_();
        }
    }

    public final void a(Collection<String> collection) {
        akcr.b(collection, "leavingUsers");
        this.e.keySet().removeAll(collection);
        this.g = null;
        for (String str : collection) {
            if (this.d.containsKey(str)) {
                d(str);
            }
            c(str);
        }
    }

    public final void a(boolean z) {
        zdb zdb = (zdb) n().a.get(this.c);
        if (zdb != null) {
            StringBuilder stringBuilder = new StringBuilder("Called deselect method for ");
            Object h = zdb.h();
            akcr.a(h, "pill.user");
            stringBuilder.append(h.a());
            akbk aVar = new a(this, zdb);
            if (z || this.b) {
                postOnAnimation(new zdu(aVar));
            } else {
                postOnAnimationDelayed(new zdu(aVar), 1500);
            }
        }
    }

    public final boolean a(abjv abjv) {
        akcr.b(abjv, "participant");
        yxx yxx = (yxx) this.e.get(abjv.a());
        if (yxx == null || !yxx.a(abjv)) {
            return false;
        }
        Object a = yxx.a();
        akcr.a(a, "user.username");
        ((zdb) a((String) a)).b((abjv) yxx);
        return true;
    }

    public final <T extends abjv> T b(String str) {
        akcr.b(str, "username");
        return (abjv) this.e.get(str);
    }

    public final Set<String> b() {
        Object keySet = this.e.keySet();
        akcr.a(keySet, "userByUsername.keys");
        return ajyu.m((Iterable) keySet);
    }

    public final void b(boolean z) {
        this.p = z;
        q();
        r();
    }

    public final boolean b(abjv abjv) {
        akcr.b(abjv, "participant");
        Object a = abjv.a();
        int containsKey = this.e.containsKey(a) ^ 1;
        if (containsKey != 0) {
            yxx yxx = new yxx(abjv);
            yxx.a(false);
            Map map = this.e;
            akcr.a(a, "username");
            map.put(a, yxx);
            this.g = null;
        }
        return containsKey;
    }

    public final void c(boolean z) {
        this.q = z;
    }

    public final boolean c() {
        return this.p;
    }

    public final void d() {
        List e = e();
        if (Objects.equal(e, this.g)) {
            n().requestLayout();
            return;
        }
        this.g = e;
        n().b();
    }

    public final List<yxx> e() {
        Object values = this.e.values();
        akcr.a(values, "userByUsername.values");
        return ajyu.a((Iterable) ajyu.k((Iterable) values), (Comparator) new yww());
    }

    public final boolean f() {
        return this.q;
    }

    public final <T extends View> List<T> g() {
        Iterable<zdb> s = s();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) s, 10));
        for (zdb c : s) {
            arrayList.add(c.c());
        }
        return (List) arrayList;
    }

    public final <T extends View> Map<T, Rect> h() {
        int i = iho.a((View) this, new Rect()).bottom;
        Iterable<zdb> s = s();
        Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) s, 10)), 16));
        int i2 = 0;
        for (zdb zdb : s) {
            View c = zdb.c();
            Rect a = zdb.a(i2, i);
            int i3 = a.right;
            ajxm a2 = ajxs.a(c, a);
            linkedHashMap.put(a2.a, a2.b);
            i2 = i3;
        }
        return linkedHashMap;
    }

    public final void i() {
        String str;
        Object next;
        Object values = n().a.values();
        akcr.a(values, "pillsLayout.pillViews.values");
        Collection arrayList = new ArrayList();
        Iterator it = ((Iterable) values).iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            Object obj = (zdb) next;
            akcr.a(obj, str);
            Object obj2 = (zdm) obj.p();
            akcr.a(obj2, "it.state");
            if (obj2.h()) {
                arrayList.add(next);
            }
        }
        for (Object obj3 : (List) arrayList) {
            ((zai) iho.b(obj3.c())).e();
            akcr.a(obj3, str);
            next = obj3.g();
            akcr.a(next, "it.view");
            next.setVisibility(0);
            obj3.a((Object) ((zdm) obj3.p()).d(false));
        }
    }

    public final /* bridge */ /* synthetic */ View j() {
        return this;
    }

    public final boolean l() {
        return !this.p;
    }
}
