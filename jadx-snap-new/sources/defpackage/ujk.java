package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.query.LegacySendToQueries.PostableStory;
import com.snap.core.model.StorySnapRecipient;
import com.snap.preview.shared.ui.SendToBottomPanelView;
import com.snapchat.android.R;
import defpackage.zgy.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: ujk */
public final class ujk extends ugh {
    private final ajxe A;
    private final ajxe B;
    private final ajwy<ugi> C;
    private final ajwy<tof> D;
    final ajxe a;
    ViewGroup b;
    RecyclerView c;
    SendToBottomPanelView d;
    zmh e;
    boolean f;
    aauu g;
    final String h;
    final toc i;
    final tvd j;
    final ftl k;
    final tnj l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w = ajxh.a(w.a);
    private final ajxe x = ajxh.a(p.a);
    private final ajxe y = ajxh.a(q.a);
    private final ajxe z;

    /* renamed from: ujk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ujk$d */
    static final class d implements OnClickListener {
        private /* synthetic */ ujk a;

        d(ujk ujk) {
            this.a = ujk;
        }

        public final void onClick(View view) {
            ujk ujk = this.a;
            if ((ujk.q().isEmpty() ^ 1) != 0) {
                ujk.a(ajyu.k(ujk.q()));
                return;
            }
            twd.a(ujk.J(), twb.ENTER_SEND_TO_PAGE_GESTURE, null, 6);
            ujk.g = aauu.SEND_TO;
            ajej e = ujk.j.f().e((ajfc) new j(ujk)).e();
            akcr.a((Object) e, "previewDataSource.mediaP…            .subscribe ()");
            ajvv.a(e, ujk.v());
        }
    }

    /* renamed from: ujk$f */
    public static final class f extends SimpleOnGestureListener {
        private /* synthetic */ ujk a;

        f(ujk ujk) {
            this.a = ujk;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ViewGroup viewGroup = this.a.b;
            if (viewGroup == null) {
                akcr.a("postToolPopupView");
            }
            if (viewGroup.getVisibility() == 0) {
                ujk.a(this.a);
            }
            return false;
        }
    }

    /* renamed from: ujk$z */
    static final class z<V> implements Callable<T> {
        private /* synthetic */ ujk a;

        z(ujk ujk) {
            this.a = ujk;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((uav) this.a.A.b()).a(uaj.POST_STORY_DIALOG));
        }
    }

    /* renamed from: ujk$aa */
    static final class aa<T, R> implements ajfc<T, R> {
        private /* synthetic */ boolean a;

        aa(boolean z) {
            this.a = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            boolean z = !((Boolean) ajxm.a).booleanValue() || (this.a && !((Boolean) ajxm.b).booleanValue());
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ujk$ad */
    static final class ad<T> implements ajfl<tzw> {
        private /* synthetic */ ujk a;

        ad(ujk ujk) {
            this.a = ujk;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((tzw) obj, "it");
            return !this.a.o;
        }
    }

    /* renamed from: ujk$ae */
    static final class ae<T> implements ajfb<Throwable> {
        public static final ae a = new ae();

        ae() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ujk$af */
    static final class af<T> implements ajfb<tzw> {
        private /* synthetic */ ujk a;

        af(ujk ujk) {
            this.a = ujk;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (tzw) obj;
            if (obj.a && akcr.a(obj.b, (Object) "post_tool")) {
                ujk.a(this.a);
                return;
            }
            ujk ujk = this.a;
            akcr.a(obj, "it");
            akcr.b(obj, "event");
            ujk.q = true;
            ajej e = ujk.o().e().a((ajfc) new h(ujk, obj)).a((ajdw) ujk.b().l()).e((ajfb) new i(ujk, obj));
            akcr.a((Object) e, "postRecipientsObservable…      }\n                }");
            ajvv.a(e, ujk.v());
            twd.a(ujk.J(), twb.PREVIEW_TOOL_READY, null, 6);
        }
    }

    /* renamed from: ujk$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ ujk a;
        private /* synthetic */ uac b;

        c(ujk ujk, uac uac) {
            this.a = ujk;
            this.b = uac;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ujk ujk = this.a;
            akcr.a(obj, "longPressEnabled");
            ujk.f = obj.booleanValue();
            if (obj.booleanValue()) {
                this.b.d();
            }
        }
    }

    /* renamed from: ujk$e */
    static final class e<T> implements ajfb<MotionEvent> {
        private /* synthetic */ GestureDetector a;

        e(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.onTouchEvent((MotionEvent) obj);
        }
    }

    /* renamed from: ujk$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ujk a;
        private /* synthetic */ tzw b;

        h(ujk ujk, tzw tzw) {
            this.a = ujk;
            this.b = tzw;
        }

        /* JADX WARNING: Missing block: B:18:0x0045, code skipped:
            if (r0 != null) goto L_0x004e;
     */
        /* JADX WARNING: Missing block: B:20:0x004c, code skipped:
            if (r6.size() > 1) goto L_0x004e;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (java.util.List) r6;
            r0 = "postableStories";
            defpackage.akcr.b(r6, r0);
            r0 = r5.a;
            r0 = r0.f;
            r1 = 0;
            r2 = 1;
            if (r0 == 0) goto L_0x0048;
        L_0x000f:
            r0 = r5.b;
            r0 = r0.d;
            if (r0 != 0) goto L_0x004e;
        L_0x0015:
            r0 = r6;
            r0 = (java.lang.Iterable) r0;
            r3 = r0 instanceof java.util.Collection;
            if (r3 == 0) goto L_0x0025;
        L_0x001c:
            r3 = r0;
            r3 = (java.util.Collection) r3;
            r3 = r3.isEmpty();
            if (r3 != 0) goto L_0x0044;
        L_0x0025:
            r0 = r0.iterator();
        L_0x0029:
            r3 = r0.hasNext();
            if (r3 == 0) goto L_0x0044;
        L_0x002f:
            r3 = r0.next();
            r3 = (com.snap.core.db.query.LegacySendToQueries.PostableStory) r3;
            r3 = r3.groupStoryType();
            r4 = com.snap.core.db.column.GroupStoryType.PRIVATE;
            if (r3 != r4) goto L_0x003f;
        L_0x003d:
            r3 = 1;
            goto L_0x0040;
        L_0x003f:
            r3 = 0;
        L_0x0040:
            if (r3 == 0) goto L_0x0029;
        L_0x0042:
            r0 = 1;
            goto L_0x0045;
        L_0x0044:
            r0 = 0;
        L_0x0045:
            if (r0 == 0) goto L_0x004f;
        L_0x0047:
            goto L_0x004e;
        L_0x0048:
            r0 = r6.size();
            if (r0 <= r2) goto L_0x004f;
        L_0x004e:
            r1 = 1;
        L_0x004f:
            r0 = r5.a;
            r2 = r1 ^ 1;
            r3 = new ujk$z;
            r3.<init>(r0);
            r3 = (java.util.concurrent.Callable) r3;
            r3 = defpackage.ajdx.c(r3);
            r4 = r0.b();
            r4 = r4.f();
            r4 = (defpackage.ajdw) r4;
            r3 = r3.b(r4);
            r4 = "Single.fromCallable {\n  …scribeOn(schedulers.io())";
            defpackage.akcr.a(r3, r4);
            r0 = r0.k;
            r4 = defpackage.tum.HAS_SEEN_DIRECT_POST_STORY_WARNING;
            r4 = (defpackage.fth) r4;
            r0 = r0.b(r4);
            r4 = "configurationProvider.ge…IRECT_POST_STORY_WARNING)";
            defpackage.akcr.a(r0, r4);
            r0 = (defpackage.ajeb) r0;
            r0 = defpackage.ajwd.a(r3, r0);
            r3 = new ujk$aa;
            r3.<init>(r2);
            r3 = (defpackage.ajfc) r3;
            r0 = r0.f(r3);
            r2 = "Single.fromCallable {\n  …ctPost)\n                }";
            defpackage.akcr.a(r0, r2);
            r2 = new ujk$h$1;
            r2.<init>(r6, r1);
            r2 = (defpackage.ajfc) r2;
            r6 = r0.f(r2);
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ujk$h.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ujk$i */
    static final class i<T> implements ajfb<ajxr<? extends List<? extends PostableStory>, ? extends Boolean, ? extends Boolean>> {
        final /* synthetic */ ujk a;
        private /* synthetic */ tzw b;

        /* renamed from: ujk$i$a */
        static final class a extends akcs implements akbk<ajxw> {
            private /* synthetic */ i a;

            a(i iVar) {
                this.a = iVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ajej a;
                ViewGroup viewGroup;
                ujk ujk = this.a.a;
                String str = "postToolPopupView";
                if (!ujk.p.get()) {
                    a = ujk.p().a(ujk);
                    akcr.a((Object) a, "rxBus.subscribe(this@PostTool)");
                    ajvv.a(a, ujk.v());
                    ajvv.a((ajej) ujk.p(), ujk.v());
                    View inflate = LayoutInflater.from(ujk.z().getContext()).inflate(R.layout.post_tool, ujk.z(), false);
                    if (inflate != null) {
                        ujk.b = (ViewGroup) inflate;
                        viewGroup = ujk.b;
                        if (viewGroup == null) {
                            akcr.a(str);
                        }
                        Object findViewById = viewGroup.findViewById(R.id.post_story_recipient_recycler_view);
                        akcr.a(findViewById, "postToolPopupView.findVi…_recipient_recycler_view)");
                        ujk.c = (RecyclerView) findViewById;
                        viewGroup = ujk.b;
                        if (viewGroup == null) {
                            akcr.a(str);
                        }
                        findViewById = viewGroup.findViewById(R.id.post_bottom_panel);
                        SendToBottomPanelView sendToBottomPanelView = (SendToBottomPanelView) findViewById;
                        sendToBottomPanelView.a((OnClickListener) new d(ujk));
                        akcr.a(findViewById, "postToolPopupView.findVi…ttonClicked() }\n        }");
                        ujk.d = sendToBottomPanelView;
                        FrameLayout z = ujk.z();
                        ViewGroup viewGroup2 = ujk.b;
                        if (viewGroup2 == null) {
                            akcr.a(str);
                        }
                        z.addView(viewGroup2);
                        a = ujk.E().f((ajfb) new e(new GestureDetector(ujk.z().getContext(), new f(ujk))));
                        akcr.a((Object) a, "previewTouchObservable\n …tector.onTouchEvent(it) }");
                        ajvv.a(a, ujk.v());
                        zms zms = new zms(ujr.class);
                        zke a2 = ujk.p().a();
                        akcr.a((Object) a2, "rxBus.eventDispatcher");
                        ajdw b = ujk.b().b();
                        ajdw l = ujk.b().l();
                        ajdp o = ujk.o();
                        Object H = ujk.H();
                        akcr.a(H, "postToRecipientsSubject");
                        ujk.e = new zmh(zms, a2, b, l, ajyl.a(new ujo(o, (ajdp) H)), 32);
                        RecyclerView recyclerView = ujk.c;
                        String str2 = "storyRecipientRecyclerView";
                        if (recyclerView == null) {
                            akcr.a(str2);
                        }
                        RecyclerView recyclerView2 = ujk.c;
                        if (recyclerView2 == null) {
                            akcr.a(str2);
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
                        zmh zmh = ujk.e;
                        String str3 = "adapter";
                        if (zmh == null) {
                            akcr.a(str3);
                        }
                        recyclerView.setAdapter(zmh);
                        recyclerView.setItemAnimator(null);
                        zmh zmh2 = ujk.e;
                        if (zmh2 == null) {
                            akcr.a(str3);
                        }
                        ajvv.a(zmh2.e(), ujk.v());
                        ujk.p.set(true);
                    } else {
                        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                ujk = this.a.a;
                viewGroup = ujk.b;
                if (viewGroup == null) {
                    akcr.a(str);
                }
                viewGroup.setVisibility(0);
                ujk.r().a((Object) new tzh(ujk.h, defpackage.tzh.a.START, false, false, false, true, false, false, 216));
                viewGroup = ujk.b;
                if (viewGroup == null) {
                    akcr.a(str);
                }
                viewGroup.bringToFront();
                if (ujk.q().isEmpty()) {
                    a = ujk.o().e().a((ajdw) ujk.b().l()).e((ajfb) new n(ujk));
                    akcr.a((Object) a, "postRecipientsObservable…d()\n                    }");
                    ajvv.a(a, ujk.v());
                }
                return ajxw.a;
            }
        }

        /* renamed from: ujk$i$b */
        static final class b extends akcs implements akbk<ajxw> {
            private /* synthetic */ i a;
            private /* synthetic */ List b;

            b(i iVar, List list) {
                this.a = iVar;
                this.b = list;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object obj = this.b;
                akcr.a(obj, "postableStories");
                for (Object next : (Iterable) obj) {
                    Object obj2;
                    if (((PostableStory) next).kind() == StoryKind.MY) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 != null) {
                        break;
                    }
                }
                Object next2 = null;
                PostableStory postableStory = (PostableStory) next2;
                if (postableStory != null) {
                    this.a.a.a(ajyl.a(postableStory));
                }
                return ajxw.a;
            }
        }

        i(ujk ujk, tzw tzw) {
            this.a = ujk;
            this.b = tzw;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxr ajxr = (ajxr) obj;
            List list = (List) ajxr.a;
            boolean booleanValue = ((Boolean) ajxr.b).booleanValue();
            Object obj2 = (Boolean) ajxr.c;
            Object aVar = booleanValue ? new a(this) : new b(this, list);
            boolean z = false;
            Object obj3 = (this.a.f && this.b.d) ? 1 : null;
            akcr.a(obj2, "shouldShowWarning");
            if (obj2.booleanValue() && obj3 == null) {
                ujk ujk = this.a;
                int i = booleanValue ^ 1;
                akcr.b(aVar, "actionOnConfirm");
                Object context = ujk.z().getContext();
                akcr.a(context, "toolLayout.context");
                Object I = ujk.I();
                akcr.a(I, "navigationHost");
                a b = new a(context, I, (zjm) ujk.a.b(), false, null, 24).a((int) R.string.add_to_your_story).b((int) R.string.add_to_your_story_explanation);
                akbl abVar = new ab(ujk, i, aVar);
                if (i == 0) {
                    z = true;
                }
                zgy a = a.a(b.a((int) R.string.add, abVar, z), null, false, null, null, null, 31).a();
                ujk.I().a((achd) a, a.a, null);
            } else {
                aVar.invoke();
            }
            twd J = this.a.J();
            if (obj3 != null) {
                J.e(this.a.h);
            } else {
                J.d(this.a.h);
            }
        }
    }

    /* renamed from: ujk$j */
    static final class j<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        final /* synthetic */ ujk a;

        j(ujk ujk) {
            this.a = ujk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "it");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ j a;

                /* renamed from: ujk$j$1$1 */
                static final class 1<T, R> implements ajfc<T, R> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        tye.a aVar = (tye.a) obj;
                        akcr.b(aVar, "it");
                        return aVar.a;
                    }
                }

                public final void run() {
                    tye d = ((tye) this.a.a.u.b());
                    Object obj = list;
                    akcr.a(obj, "it");
                    ajdx a = d.a(obj, false).a();
                    ajwo s = this.a.a.s();
                    Object f = a.f(1.a);
                    akcr.a(f, "sendingPackage.map { it.mediaPackages }");
                    s.a(new tzv(f, (abll) ajyu.f(this.a.a.J().b(twb.SENDTO_LOADING_FINISH))));
                }
            });
        }
    }

    /* renamed from: ujk$n */
    static final class n<T> implements ajfb<List<? extends PostableStory>> {
        private /* synthetic */ ujk a;

        n(ujk ujk) {
            this.a = ujk;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            LinkedHashSet q = this.a.q();
            akcr.a(obj, "postableStories");
            Collection arrayList = new ArrayList();
            for (Object next : (Iterable) obj) {
                if ((((PostableStory) next).kind() == StoryKind.MY ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            q.addAll((List) arrayList);
            this.a.L();
        }
    }

    /* renamed from: ujk$r */
    static final class r implements ajev {
        private /* synthetic */ ujk a;

        r(ujk ujk) {
            this.a = ujk;
        }

        public final void run() {
            this.a.w().d.setEnabled(false);
        }
    }

    /* renamed from: ujk$s */
    static final class s<T> implements ajfb<List<? extends abyi>> {
        private /* synthetic */ ujk a;

        s(ujk ujk) {
            this.a = ujk;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.g = aauu.DIRECT_STORY_POST;
        }
    }

    /* renamed from: ujk$t */
    static final class t<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        final /* synthetic */ ujk a;
        final /* synthetic */ List b;

        t(ujk ujk, List list) {
            this.a = ujk;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "it");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ t a;

                /* renamed from: ujk$t$1$1 */
                static final class 1<T, R> implements ajfc<T, R> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        tye.a aVar = (tye.a) obj;
                        akcr.b(aVar, "it");
                        return aVar.a;
                    }
                }

                public final void run() {
                    tye d = ((tye) this.a.a.u.b());
                    Object obj = list;
                    akcr.a(obj, "it");
                    ajdx a = d.a(obj, true).a();
                    ajwo t = this.a.a.t();
                    Object f = a.f(1.a);
                    akcr.a(f, "sendingPackage.map { it.mediaPackages }");
                    t.a(new tzu(f, this.a.b));
                }
            });
        }
    }

    /* renamed from: ujk$ab */
    static final class ab extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ujk a;
        private /* synthetic */ boolean b;
        private /* synthetic */ akbk c;

        ab(ujk ujk, boolean z, akbk akbk) {
            this.a = ujk;
            this.b = z;
            this.c = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((uav) this.a.A.b()).b(uaj.POST_STORY_DIALOG);
            if (this.b) {
                ajej b = this.a.l.b().a((fth) tum.HAS_SEEN_DIRECT_POST_STORY_WARNING, Boolean.TRUE).b();
                akcr.a((Object) b, "preferences.edit()\n     …                 .apply()");
                ajvv.a(b, this.a.v());
            }
            this.c.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: ujk$b */
    static final class b extends akcs implements akbk<zjm> {
        private /* synthetic */ ujk a;

        b(ujk ujk) {
            this.a = ujk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zjm(this.a.i, "add_to_my_story", false, false, true, false, null, false, false, false, false, null, 4076);
        }
    }

    /* renamed from: ujk$g */
    static final class g extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: ujk$k */
    static final class k extends akcs implements akbl<PostableStory, Boolean> {
        private /* synthetic */ ujn a;

        k(ujn ujn) {
            this.a = ujn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (PostableStory) obj;
            akcr.b(obj, "it");
            boolean z = true;
            if (!obj.isMyStory() || (akcr.a(obj, this.a.a) ^ 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ujk$l */
    static final class l extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ujk a;
        private /* synthetic */ ujn b;

        l(ujk ujk, ujn ujn) {
            this.a = ujk;
            this.b = ujn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ujk.a(this.a, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: ujk$m */
    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ujk a;
        private /* synthetic */ ujn b;

        m(ujk ujk, ujn ujn) {
            this.a = ujk;
            this.b = ujn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ujk.a(this.a, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: ujk$o */
    static final class o extends akcs implements akbk<ajdp<List<? extends PostableStory>>> {
        private /* synthetic */ ajwy a;

        o(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((riy) this.a.get()).h();
        }
    }

    /* renamed from: ujk$p */
    static final class p extends akcs implements akbk<LinkedHashSet<PostableStory>> {
        public static final p a = new p();

        p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: ujk$q */
    static final class q extends akcs implements akbk<ajwl<Set<? extends PostableStory>>> {
        public static final q a = new q();

        q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(new HashSet());
        }
    }

    /* renamed from: ujk$u */
    static final class u extends akcs implements akbk<twd> {
        private /* synthetic */ ajwy a;

        u(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (twd) this.a.get();
        }
    }

    /* renamed from: ujk$v */
    static final class v extends akcs implements akbk<uav> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uav) this.a.get();
        }
    }

    /* renamed from: ujk$w */
    static final class w extends akcs implements akbk<zkf> {
        public static final w a = new w();

        w() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zkf();
        }
    }

    /* renamed from: ujk$x */
    static final class x extends akcs implements akbk<zfw> {
        private /* synthetic */ ujk a;
        private /* synthetic */ zgb b;

        x(ujk ujk, zgb zgb) {
            this.a = ujk;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.i.callsite("PostTool"));
        }
    }

    /* renamed from: ujk$y */
    static final class y extends akcs implements akbk<tye> {
        private /* synthetic */ ajwy a;

        y(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tye) this.a.get();
        }
    }

    /* renamed from: ujk$ac */
    static final class ac extends akcq implements akbk<ypp> {
        ac(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ypp) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ujk.class), "storiesPrivacyDialogLauncher", "getStoriesPrivacyDialogLauncher()Lcom/snap/stories/ui/StoriesPrivacyDialogLauncher;"), new akdc(akde.a(ujk.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ujk.class), "sendingController", "getSendingController()Lcom/snap/preview/sending/SendingController;"), new akdc(akde.a(ujk.class), "postRecipientsObservable", "getPostRecipientsObservable()Lio/reactivex/Observable;"), new akdc(akde.a(ujk.class), "rxBus", "getRxBus()Lcom/snap/ui/event/RxBus;"), new akdc(akde.a(ujk.class), "postToRecipients", "getPostToRecipients()Ljava/util/LinkedHashSet;"), new akdc(akde.a(ujk.class), "postToRecipientsSubject", "getPostToRecipientsSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(ujk.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(ujk.class), "previewTooltipRepository", "getPreviewTooltipRepository()Lcom/snap/preview/tooltips/PreviewTooltipRepository;"), new akdc(akde.a(ujk.class), "addToMyStoryDialogType", "getAddToMyStoryDialogType()Lcom/snap/ui/deck/MainPageType;"), new akdc(akde.a(ujk.class), "previewMetricsPlugin", "getPreviewMetricsPlugin()Lcom/snap/preview/metrics/PreviewMetricsPlugin;")};
        a aVar = new a();
    }

    public ujk(toc toc, zgb zgb, ajwy<ugi> ajwy, tvd tvd, ajwy<tof> ajwy2, ajwy<twd> ajwy3, ftl ftl, tnj tnj, ajwy<tye> ajwy4, ajwy<riy> ajwy5, ajwy<uav> ajwy6, ajwy<ypp> ajwy7, ajwy<achb<zjm, zjk>> ajwy8) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "icon");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy2, "analyticsComposer");
        akcr.b(ajwy3, "metricsPluginProvider");
        akcr.b(ftl, "configurationProvider");
        akcr.b(tnj, "preferences");
        akcr.b(ajwy4, "sendingControllerProvider");
        akcr.b(ajwy5, "sendToDataProvider");
        akcr.b(ajwy6, "previewTooltipRepository");
        akcr.b(ajwy7, "storiesPrivacyDialogLauncher");
        akcr.b(ajwy8, "navigationHost");
        this.i = toc;
        this.C = ajwy;
        this.j = tvd;
        this.D = ajwy2;
        this.k = ftl;
        this.l = tnj;
        this.m = ajxh.a(new ac(ajwy7));
        this.n = ajxh.a(new x(this, zgb));
        this.u = ajxh.a(new y(ajwy4));
        this.v = ajxh.a(new o(ajwy5));
        this.z = ajxh.a(new g(ajwy8));
        this.A = ajxh.a(new v(ajwy6));
        this.a = ajxh.a(new b(this));
        this.B = ajxh.a(new u(ajwy3));
        this.h = "post_tool";
    }

    private final ypp K() {
        return (ypp) this.m.b();
    }

    private final void L() {
        SendToBottomPanelView sendToBottomPanelView = this.d;
        if (sendToBottomPanelView == null) {
            akcr.a("sendToBottomPanelView");
        }
        Iterable<PostableStory> q = q();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) q, 10));
        for (PostableStory postableStory : q) {
            Object stringBuilder;
            if (postableStory.kind() == StoryKind.MY_OVERRIDDEN_PRIVACY) {
                CharSequence subtext = postableStory.subtext();
                Object obj = (subtext == null || subtext.length() == 0) ? 1 : null;
                if (obj == null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(postableStory.displayName());
                    stringBuilder2.append(" (");
                    stringBuilder2.append(postableStory.subtext());
                    stringBuilder2.append(')');
                    stringBuilder = stringBuilder2.toString();
                    arrayList.add(stringBuilder);
                }
            }
            stringBuilder = postableStory.displayName();
            arrayList.add(stringBuilder);
        }
        sendToBottomPanelView.a(ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.d, null, null, 0, null, null, 62));
        H().a(q());
    }

    /* Access modifiers changed, original: final */
    public final ajwl<Set<PostableStory>> H() {
        return (ajwl) this.y.b();
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> I() {
        return (achb) this.z.b();
    }

    /* Access modifiers changed, original: final */
    public final twd J() {
        return (twd) this.B.b();
    }

    public final String Z_() {
        return this.h;
    }

    public final ajej a(ajdp<tzw> ajdp) {
        akcr.b(ajdp, "observable");
        Object f = ajdp.a((ajfl) new ad(this)).c((ajfb) ae.a).f((ajfb) new af(this));
        akcr.a(f, "observable\n             …      }\n                }");
        return f;
    }

    public final uac a(Context context, tzj tzj, tzx tzx) {
        akcr.b(context, "context");
        akcr.b(tzj, "loadedDataForActivation");
        akcr.b(tzx, "clickDelegate");
        uac a = super.a(context, tzj, tzx);
        ajej e = this.k.b((fth) tum.TOOL_BUTTON_LONG_PRESS_ENABLED).b((ajdw) b().f()).e((ajfb) new c(this, a));
        akcr.a((Object) e, "configurationProvider.ge…Press()\n                }");
        ajvv.a(e, v());
        return a;
    }

    public final void a(aaim aaim, akez<? extends aaim> akez) {
        boolean z;
        akcr.b(aaim, "directSnapPreview");
        akcr.b(akez, "segmentEvents");
        aaim aaim2 = (aaim) akfh.b(akez);
        aaim.a(aaim2 != null ? aaim2.c() : null);
        for (aaim aaim22 : akez) {
            if (akcr.a(aaim22.aK(), Boolean.TRUE)) {
                z = true;
                break;
            }
        }
        z = false;
        aaim.D(Boolean.valueOf(z));
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
        aauu aauu = this.g;
        if (aauu != null) {
            for (aaim a : iip.a()) {
                a.a(aauu);
            }
        }
        for (aaim D : iip.a()) {
            D.D(Boolean.valueOf(this.q));
        }
    }

    public final void a(List<? extends PostableStory> list) {
        akcr.b(list, "postableStories");
        ((tof) this.D.get()).a(new tpk(null, null, null, null, 0, 0, false, true, 895));
        Iterable<PostableStory> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (PostableStory postableStory : iterable) {
            rjd rjd = new rjd(postableStory);
            Object e = rjd.e();
            akcr.a(e, "storyId");
            Object w = rjd.w();
            akcr.a(w, "storyKind");
            arrayList.add(new StorySnapRecipient(e, w, postableStory.displayName(), new gct(rjd.t(), rjd.y())));
        }
        ajej e2 = ajcx.a((ajev) new r(this)).b((ajdw) b().l()).a((ajdw) b().f()).b((ajeb) this.j.f()).c((ajfb) new s(this)).e((ajfc) new t(this, (List) arrayList)).e();
        akcr.a((Object) e2, "Completable.fromAction {…             .subscribe()");
        ajvv.a(e2, v());
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.n.b();
    }

    public final Set<tyv> c() {
        return ajzt.c(tyv.PHOTO, tyv.VIDEO);
    }

    public final /* synthetic */ tzl d() {
        return (ugi) this.C.get();
    }

    public final boolean h() {
        return true;
    }

    public final void i() {
        v().dispose();
    }

    /* Access modifiers changed, original: final */
    public final ajdp<List<PostableStory>> o() {
        return (ajdp) this.v.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStoryRecipientItemClickedEvent(ujn ujn) {
        akcr.b(ujn, "event");
        if (ujn.b) {
            q().add(ujn.a);
            if (ujn.a.isMyStory()) {
                ajyr.a((Iterable) q(), (akbl) new k(ujn));
            }
            if (ujn.a.isOurStory()) {
                ajvv.a(K().b(toc.d, new l(this, ujn)), v());
            }
            if (ujn.a.isGeoGroupStory()) {
                ypp K = K();
                Object storyId = ujn.a.storyId();
                akcr.a(storyId, "event.postableStory.storyId()");
                ajvv.a(K.a(storyId, toc.d, new m(this, ujn)), v());
            }
        } else {
            q().remove(ujn.a);
        }
        L();
    }

    /* Access modifiers changed, original: final */
    public final zkf p() {
        return (zkf) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final LinkedHashSet<PostableStory> q() {
        return (LinkedHashSet) this.x.b();
    }
}
