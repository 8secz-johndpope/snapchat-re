package com.snap.composer.api.ui.page;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.common.base.Predicate;
import com.snap.composer.IComposerViewLoader;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.api.ui.ComposerNavigationUtil;
import com.snap.composer.api.ui.ComposerNavigationUtil.Direction;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.views.ComposerView;
import defpackage.acgv;
import defpackage.acgx;
import defpackage.achb;
import defpackage.achg;
import defpackage.achq;
import defpackage.acig;
import defpackage.acip;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akco;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.ide;
import defpackage.zgy;
import defpackage.zja;
import defpackage.zjk;
import defpackage.zjm;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ComposerPage<T> extends zja implements acgx {
    public static final Companion Companion = new Companion();
    private static final AtomicInteger l = new AtomicInteger();
    private final ComposerNavigationUtil a;
    private ComposerPageController b;
    private final ajxe c;
    private final Context d;
    private final IComposerViewLoader e;
    private final zjm f;
    private final zjm g;
    private final achb<zjm, zjk> h;
    private final T i;
    private final ComposerPageControllerFactory<T> j;
    private final int k;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    static final class b implements ajev {
        private /* synthetic */ ComposerPageController a;

        b(ComposerPageController composerPageController) {
            this.a = composerPageController;
        }

        public final void run() {
            this.a.getView().destroy();
        }
    }

    static final class a extends akcs implements akbk<FrameLayout> {
        private /* synthetic */ ComposerPage a;

        a(ComposerPage composerPage) {
            this.a = composerPage;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new FrameLayout(this.a.d);
        }
    }

    static final class d extends akcs implements akbl<ComposerContext, ajxw> {
        final /* synthetic */ ComposerPage a;

        /* renamed from: com.snap.composer.api.ui.page.ComposerPage$d$1 */
        static final class AnonymousClass1 implements ComposerAction {
            private /* synthetic */ d a;

            AnonymousClass1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object perform(Object[] objArr) {
                akcr.a((Object) objArr, "parameters");
                boolean z = true;
                if ((objArr.length == 0 ? 1 : null) == null) {
                    Object obj = objArr[0];
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    Boolean bool = (Boolean) obj;
                    z = bool != null ? bool.booleanValue() : false;
                }
                this.a.a.h.a(z);
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.composer.api.ui.page.ComposerPage$d$2 */
        static final class AnonymousClass2 implements ComposerAction {
            private /* synthetic */ d a;

            AnonymousClass2(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object perform(Object[] objArr) {
                boolean z;
                akcr.a((Object) objArr, "parameters");
                if ((objArr.length == 0 ? 1 : null) != null) {
                    z = true;
                } else {
                    Object obj = objArr[0];
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    Boolean bool = (Boolean) obj;
                    z = bool != null ? bool.booleanValue() : false;
                }
                this.a.a.h.a((achg) this.a.a.f, true, z, null);
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.composer.api.ui.page.ComposerPage$d$3 */
        static final class AnonymousClass3 implements ComposerAction {
            private /* synthetic */ d a;

            AnonymousClass3(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object perform(Object[] objArr) {
                ComposerPage composerPage = this.a.a;
                akcr.a((Object) objArr, "parameters");
                composerPage.a(objArr, this.a.a.f);
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.composer.api.ui.page.ComposerPage$d$4 */
        static final class AnonymousClass4 implements ComposerAction {
            private /* synthetic */ d a;

            AnonymousClass4(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object perform(Object[] objArr) {
                ComposerPage composerPage = this.a.a;
                akcr.a((Object) objArr, "parameters");
                composerPage.a(objArr, null);
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.composer.api.ui.page.ComposerPage$d$5 */
        static final class AnonymousClass5 implements ComposerAction {
            private /* synthetic */ d a;

            AnonymousClass5(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object perform(Object[] objArr) {
                Object obj = objArr;
                akcr.a(obj, "args");
                if ((obj.length == 0 ? 1 : null) == null) {
                    obj = obj[0];
                    if (obj instanceof Map) {
                        int incrementAndGet = ComposerPage.l.incrementAndGet();
                        ide ide = this.a.a.g.d.c;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(ide.getName());
                        String str = ":dialog-";
                        stringBuilder.append(str);
                        stringBuilder.append(incrementAndGet);
                        ComposerPage$onPageAdded$3$5$feature$1 composerPage$onPageAdded$3$5$feature$1 = new ComposerPage$onPageAdded$3$5$feature$1(ide, incrementAndGet, stringBuilder.toString(), ide.getProject());
                        Context access$getContext$p = this.a.a.d;
                        achb access$getNavigationHost$p = this.a.a.h;
                        ide ide2 = composerPage$onPageAdded$3$5$feature$1;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(this.a.a.g.b());
                        stringBuilder2.append(str);
                        stringBuilder2.append(incrementAndGet);
                        defpackage.zgy.a aVar = new defpackage.zgy.a(access$getContext$p, access$getNavigationHost$p, new zjm(ide2, stringBuilder2.toString(), false, false, true, false, null, false, false, false, false, null, 4076), true, null, 16);
                        Map map = (Map) obj;
                        Object obj2 = map.get("title");
                        if (!(obj2 instanceof String)) {
                            obj2 = null;
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            aVar.a(str2);
                        }
                        obj2 = map.get("description");
                        if (!(obj2 instanceof String)) {
                            obj2 = null;
                        }
                        str2 = (String) obj2;
                        if (str2 != null) {
                            aVar.b(str2);
                        }
                        obj2 = map.get("callback");
                        if (!(obj2 instanceof ComposerAction)) {
                            obj2 = null;
                        }
                        final ComposerAction composerAction = (ComposerAction) obj2;
                        Object obj3 = map.get("buttonText");
                        if (!(obj3 instanceof String)) {
                            obj3 = null;
                        }
                        String str3 = (String) obj3;
                        if (str3 != null) {
                            aVar.a(str3, (akbl) new akbl<View, ajxw>() {
                                public final /* synthetic */ Object invoke(Object obj) {
                                    akcr.b((View) obj, "it");
                                    ComposerAction composerAction = composerAction;
                                    if (composerAction != null) {
                                        composerAction.perform(new Boolean[]{Boolean.TRUE});
                                    }
                                    return ajxw.a;
                                }
                            }, true);
                        }
                        obj = map.get("cancelButtonText");
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        if (((String) obj) != null) {
                            defpackage.zgy.a.a(aVar, (akbl) new akbl<View, ajxw>() {
                                public final /* synthetic */ Object invoke(Object obj) {
                                    akcr.b((View) obj, "it");
                                    ComposerAction composerAction = composerAction;
                                    if (composerAction != null) {
                                        composerAction.perform(new Boolean[]{Boolean.FALSE});
                                    }
                                    return ajxw.a;
                                }
                            }, false, null, null, null, 30);
                        }
                        zgy a = aVar.a();
                        this.a.a.h.b((acig) new acip(this.a.a.h, a, a.a));
                    }
                }
                return ajxw.a;
            }
        }

        d(ComposerPage composerPage) {
            this.a = composerPage;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            Map actionByName = composerContext.getActions().getActionByName();
            actionByName.put("back", new AnonymousClass1(this));
            actionByName.put("dismiss", new AnonymousClass2(this));
            actionByName.put("push", new AnonymousClass3(this));
            actionByName.put("present", new AnonymousClass4(this));
            actionByName.put("displayAlert", new AnonymousClass5(this));
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbw<ComposerView, MotionEvent, ajxw> {
        c(ComposerNavigationUtil composerNavigationUtil) {
            super(2, composerNavigationUtil);
        }

        public final String getName() {
            return "rootViewTouchListener";
        }

        public final akej getOwner() {
            return akde.a(ComposerNavigationUtil.class);
        }

        public final String getSignature() {
            return "rootViewTouchListener(Lcom/snap/composer/views/ComposerView;Landroid/view/MotionEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ComposerView composerView = (ComposerView) obj;
            MotionEvent motionEvent = (MotionEvent) obj2;
            akcr.b(composerView, "p1");
            akcr.b(motionEvent, "p2");
            ((ComposerNavigationUtil) this.receiver).rootViewTouchListener(composerView, motionEvent);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ComposerPage.class), "contentView", "getContentView()Landroid/view/ViewGroup;");
    }

    public ComposerPage(Context context, IComposerViewLoader iComposerViewLoader, zjm zjm, zjm zjm2, achb<zjm, zjk> achb, acgv<zjm> acgv, T t, ComposerPageControllerFactory<T> composerPageControllerFactory, int i) {
        Context context2 = context;
        IComposerViewLoader iComposerViewLoader2 = iComposerViewLoader;
        zjm zjm3 = zjm;
        zjm zjm4 = zjm2;
        achb<zjm, zjk> achb2 = achb;
        ComposerPageControllerFactory<T> composerPageControllerFactory2 = composerPageControllerFactory;
        akcr.b(context, "context");
        akcr.b(iComposerViewLoader, "viewLoader");
        akcr.b(zjm3, "rootPageType");
        akcr.b(zjm4, "mainPageType");
        akcr.b(achb2, "navigationHost");
        acgv<zjm> acgv2 = acgv;
        akcr.b(acgv2, "navigationActionSpec");
        akcr.b(composerPageControllerFactory2, "controllerFactory");
        super(zjm2, acgv2, null, 4, null);
        this.d = context2;
        this.e = iComposerViewLoader2;
        this.f = zjm3;
        this.g = zjm4;
        this.h = achb2;
        this.i = t;
        this.j = composerPageControllerFactory2;
        this.k = i;
        this.a = new ComposerNavigationUtil(Direction.LEFT);
        this.c = ajxh.a(new a(this));
    }

    public /* synthetic */ ComposerPage(Context context, IComposerViewLoader iComposerViewLoader, zjm zjm, zjm zjm2, achb achb, acgv acgv, Object obj, ComposerPageControllerFactory composerPageControllerFactory, int i, int i2, akco akco) {
        this(context, iComposerViewLoader, zjm, zjm2, achb, acgv, obj, composerPageControllerFactory, (i2 & 256) != 0 ? 0 : i);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    public final void a(java.lang.Object[] r31, defpackage.zjm r32) {
        /*
        r30 = this;
        r0 = r30;
        r1 = r31;
        r2 = r1.length;
        r3 = 1;
        if (r2 == r3) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r2 = 0;
        r1 = r1[r2];
        r4 = r1 instanceof java.util.Map;
        r5 = 0;
        if (r4 != 0) goto L_0x0012;
    L_0x0011:
        r1 = r5;
    L_0x0012:
        r1 = (java.util.Map) r1;
        if (r1 != 0) goto L_0x0017;
    L_0x0016:
        return;
    L_0x0017:
        r4 = "bundleName";
        r4 = r1.get(r4);
        r6 = r4 instanceof java.lang.String;
        if (r6 != 0) goto L_0x0022;
    L_0x0021:
        r4 = r5;
    L_0x0022:
        r4 = (java.lang.String) r4;
        if (r4 != 0) goto L_0x003c;
    L_0x0026:
        r4 = r0.b;
        if (r4 == 0) goto L_0x003b;
    L_0x002a:
        r4 = r4.getView();
        if (r4 == 0) goto L_0x003b;
    L_0x0030:
        r4 = r4.getComposerContext();
        if (r4 == 0) goto L_0x003b;
    L_0x0036:
        r4 = r4.getBundleName();
        goto L_0x003c;
    L_0x003b:
        r4 = r5;
    L_0x003c:
        if (r4 != 0) goto L_0x003f;
    L_0x003e:
        return;
    L_0x003f:
        r6 = "composerPath";
        r6 = r1.get(r6);
        r7 = r6 instanceof java.lang.String;
        if (r7 != 0) goto L_0x004a;
    L_0x0049:
        r6 = r5;
    L_0x004a:
        r6 = (java.lang.String) r6;
        if (r6 != 0) goto L_0x004f;
    L_0x004e:
        return;
    L_0x004f:
        r7 = "viewModel";
        r15 = r1.get(r7);
        r7 = "animated";
        r7 = r1.get(r7);
        r8 = r7 instanceof java.lang.Boolean;
        if (r8 != 0) goto L_0x0060;
    L_0x005f:
        r7 = r5;
    L_0x0060:
        r7 = (java.lang.Boolean) r7;
        if (r7 == 0) goto L_0x0069;
    L_0x0064:
        r7 = r7.booleanValue();
        goto L_0x006a;
    L_0x0069:
        r7 = 0;
    L_0x006a:
        r8 = "context";
        r1 = r1.get(r8);
        r8 = new com.snap.composer.api.ui.page.BundleViewControllerFactory;
        r9 = r0.b;
        if (r9 == 0) goto L_0x0087;
    L_0x0076:
        r9 = r9.getView();
        if (r9 == 0) goto L_0x0087;
    L_0x007c:
        r9 = r9.getComposerContext();
        if (r9 == 0) goto L_0x0087;
    L_0x0082:
        r9 = r9.getActionHandler();
        goto L_0x0088;
    L_0x0087:
        r9 = r5;
    L_0x0088:
        r8.<init>(r4, r6, r9, r1);
        r1 = r0.g;
        r1 = r1.d;
        r1 = r1.c;
        r4 = new com.snap.composer.api.ui.page.ComposerPage$navigate$feature$1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = r1.getName();
        r9.append(r10);
        r10 = 58;
        r9.append(r10);
        r9.append(r6);
        r9 = r9.toString();
        r11 = r1.getProject();
        r4.<init>(r1, r6, r9, r11);
        r1 = new zjm;
        r17 = r4;
        r17 = (defpackage.ide) r17;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r9 = r0.g;
        r9 = r9.b();
        r4.append(r9);
        r4.append(r10);
        r4.append(r6);
        r18 = r4.toString();
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r29 = 4092; // 0xffc float:5.734E-42 double:2.0217E-320;
        r16 = r1;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
        r4 = defpackage.achr.RIGHT_TO_LEFT;
        r6 = 2;
        r6 = new defpackage.acis[r6];
        r9 = defpackage.acis.b;
        r6[r2] = r9;
        r2 = new aciq;
        r9 = 1711276032; // 0x66000000 float:1.5111573E23 double:8.45482698E-315;
        r2.<init>(r9);
        r2 = (defpackage.acis) r2;
        r6[r3] = r2;
        r2 = defpackage.acir.a(r6);
        r2 = (defpackage.acis) r2;
        r3 = r1;
        r3 = (defpackage.achg) r3;
        r2 = defpackage.acgu.a(r4, r2, r3, r7);
        r3 = defpackage.acgv.a();
        r4 = r2.j();
        r3 = r3.a(r4);
        r14 = r3.a();
        r3 = new com.snap.composer.api.ui.page.ComposerPage;
        r9 = r0.d;
        r10 = r0.e;
        if (r32 != 0) goto L_0x0126;
    L_0x0124:
        r11 = r1;
        goto L_0x0128;
    L_0x0126:
        r11 = r32;
    L_0x0128:
        r13 = r0.h;
        r4 = "navigationActionSpec";
        defpackage.akcr.a(r14, r4);
        r16 = r8;
        r16 = (com.snap.composer.api.ui.page.ComposerPageControllerFactory) r16;
        r17 = 0;
        r18 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r19 = 0;
        r8 = r3;
        r12 = r1;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r1 = r0.h;
        r3 = (defpackage.achd) r3;
        r4 = "navigationAction";
        defpackage.akcr.a(r2, r4);
        r1.a(r3, r2, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.api.ui.page.ComposerPage.a(java.lang.Object[], zjm):void");
    }

    public ViewGroup getContentView() {
        return (ViewGroup) this.c.b();
    }

    public void onPageAdded() {
        super.onPageAdded();
        ComposerPageController controller = this.j.getController(this.e, this.i, getDisposable(), this.g);
        getDisposable().a(ajek.a((ajev) new b(controller)));
        ComposerView view = controller.getView();
        if (VERSION.SDK_INT >= 21) {
            ViewGroup contentView = getContentView();
            float f = (float) this.k;
            Object resources = this.d.getResources();
            akcr.a(resources, "context.resources");
            contentView.setElevation(f * resources.getDisplayMetrics().density);
            getContentView().setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        achg achg = this.g;
        Predicate navigationEnabledPredicate = this.a.getNavigationEnabledPredicate();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.g.b());
        stringBuilder.append(":onPageAdded");
        this.h.a(new achq(achg, null, navigationEnabledPredicate, stringBuilder.toString()));
        view.setRootViewTouchListener(new c(this.a));
        view.getComposerContext(new d(this));
        getContentView().addView(view);
        this.b = controller;
    }

    public void onPageRemoved() {
        super.onPageRemoved();
        this.h.a(this.a.getNavigationEnabledPredicate());
    }
}
