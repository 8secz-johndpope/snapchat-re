package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.shake2report.ui.Shake2ReportActivity;
import com.snapchat.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: wrn */
public final class wrn {
    final Context a;
    final zfw b;
    final abss c;
    final jwb d;
    final wtq e;
    final wrh f;
    final achb<zjm, zjk> g;
    final wub h;
    final wqp i;
    final hxs j;
    private ajei k = new ajei();
    private final ajxe l;
    private final wvl m;
    private final boolean n;

    /* renamed from: wrn$h */
    static final class h extends akcs implements akbk<wrl> {
        private /* synthetic */ wrn a;
        private /* synthetic */ wqz b;

        h(wrn wrn, wqz wqz) {
            this.a = wrn;
            this.b = wqz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new wrl(this.b, this.a.e, this.a.b, this.a.d);
        }
    }

    /* renamed from: wrn$a */
    static final class a implements Runnable {
        private /* synthetic */ wrn a;
        private /* synthetic */ String b;
        private /* synthetic */ WeakReference c;

        a(wrn wrn, String str, WeakReference weakReference) {
            this.a = wrn;
            this.b = str;
            this.c = weakReference;
        }

        public final void run() {
            this.a.e.a(this.b, this.a.f.a(), (Activity) this.c.get());
        }
    }

    /* renamed from: wrn$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ wrn a;

        d(wrn wrn) {
            this.a = wrn;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f.d());
        }
    }

    /* renamed from: wrn$f */
    static final class f<V> implements Callable<T> {
        private /* synthetic */ wrn a;

        f(wrn wrn) {
            this.a = wrn;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f.c());
        }
    }

    /* renamed from: wrn$b */
    static final class b implements ajev {
        final /* synthetic */ wrn a;
        final /* synthetic */ String b;
        final /* synthetic */ WeakReference c;
        private /* synthetic */ boolean d;

        /* renamed from: wrn$b$3 */
        static final class 3 extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ b a;

            3(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.j.a((fth) wrc.S2R_ENABLED, Boolean.FALSE);
                return ajxw.a;
            }
        }

        /* renamed from: wrn$b$4 */
        static final class 4 extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ b a;

            4(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i.a(this.a.b, aazr.POPOUT_DIALOG);
                wub wub = this.a.a.h;
                if (wub != null) {
                    wub.c();
                }
                return ajxw.a;
            }
        }

        b(wrn wrn, boolean z, String str, WeakReference weakReference) {
            this.a = wrn;
            this.d = z;
            this.b = str;
            this.c = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0054  */
        public final void run() {
            /*
            r17 = this;
            r0 = r17;
            r1 = r0.a;
            r1 = r1.g;
            r1 = r1.i();
            if (r1 == 0) goto L_0x001b;
        L_0x000c:
            r1 = r1.e();
            r1 = (defpackage.zjm) r1;
            if (r1 == 0) goto L_0x001b;
        L_0x0014:
            r1 = r1.d;
            if (r1 == 0) goto L_0x001b;
        L_0x0018:
            r1 = r1.d;
            goto L_0x001c;
        L_0x001b:
            r1 = 0;
        L_0x001c:
            r16 = new zjm;
            r2 = defpackage.wqv.g;
            r3 = r2;
            r3 = (defpackage.ide) r3;
            r5 = 0;
            r6 = 0;
            r7 = 1;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 4076; // 0xfec float:5.712E-42 double:2.014E-320;
            r4 = "s2r_prompt_dialog_external";
            r2 = r16;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
            r9 = new zgy$a;
            r2 = r0.a;
            r3 = r2.a;
            r2 = r0.a;
            r4 = r2.g;
            r7 = 0;
            r8 = 16;
            r2 = r9;
            r5 = r16;
            r2.<init>(r3, r4, r5, r6, r7, r8);
            r2 = 2131889279; // 0x7f120c7f float:1.9413217E38 double:1.0532932535E-314;
            r2 = r9.a(r2);
            r3 = r0.d;
            if (r3 == 0) goto L_0x005a;
        L_0x0054:
            r3 = 2131889152; // 0x7f120c00 float:1.941296E38 double:1.0532931907E-314;
            r2.b(r3);
        L_0x005a:
            r3 = 2131889161; // 0x7f120c09 float:1.9412978E38 double:1.053293195E-314;
            r4 = new wrn$b$1;
            r4.<init>(r0, r1);
            r4 = (defpackage.akbl) r4;
            r5 = 1;
            r3 = r2.a(r3, r4, r5);
            r4 = 2131889162; // 0x7f120c0a float:1.941298E38 double:1.0532931957E-314;
            r6 = new wrn$b$2;
            r6.<init>(r0, r1);
            r6 = (defpackage.akbl) r6;
            r1 = r3.a(r4, r6, r5);
            r3 = 2131889158; // 0x7f120c06 float:1.9412972E38 double:1.0532931937E-314;
            r4 = new wrn$b$3;
            r4.<init>(r0);
            r4 = (defpackage.akbl) r4;
            r6 = r1.a(r3, r4, r5);
            r1 = new wrn$b$4;
            r1.<init>(r0);
            r7 = r1;
            r7 = (defpackage.akbl) r7;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 30;
            defpackage.zgy.a.a(r6, r7, r8, r9, r10, r11, r12);
            r1 = r2.a();
            r2 = r0.a;
            r2 = r2.g;
            r3 = new acip;
            r4 = r0.a;
            r4 = r4.g;
            r5 = r1;
            r5 = (defpackage.achd) r5;
            r1 = r1.a;
            r3.<init>(r4, r5, r1);
            r3 = (defpackage.acig) r3;
            r2.b(r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wrn$b.run():void");
        }
    }

    /* renamed from: wrn$c */
    static final class c implements ajev {
        final /* synthetic */ wrn a;
        final /* synthetic */ String b;
        final /* synthetic */ WeakReference c;
        final /* synthetic */ boolean d;

        /* renamed from: wrn$c$1 */
        static final class 1 extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str = "it";
                akcr.b((View) obj, str);
                this.a.a.i.a(this.a.b, aazr.POPOUT_DIALOG);
                try {
                    obj = (Activity) this.a.c.get();
                    if (obj != null) {
                        Intent intent = new Intent("com.snapchat.DEVELOPER_TWEAKS_MUSHROOM");
                        akcr.a(obj, str);
                        intent.setPackage(obj.getPackageName());
                        intent.setFlags(335544320);
                        obj.startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                }
                return ajxw.a;
            }
        }

        /* renamed from: wrn$c$2 */
        static final class 2 extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i.a(this.a.b, aazr.POPOUT_DIALOG);
                wub wub = this.a.a.h;
                if (wub != null) {
                    wub.c();
                }
                return ajxw.a;
            }
        }

        /* renamed from: wrn$c$a */
        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ c a;
            private /* synthetic */ String b;

            a(c cVar, String str) {
                this.a = cVar;
                this.b = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i.a(ailz.PROBLEM);
                wrn.a(this.a.a, this.a.b, this.a.c, ailz.PROBLEM, true, this.a.d, null, this.b, 32);
                return ajxw.a;
            }
        }

        /* renamed from: wrn$c$b */
        static final class b extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ c a;
            private /* synthetic */ String b;

            b(c cVar, String str) {
                this.a = cVar;
                this.b = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.i.a(ailz.SUGGESTION);
                wrn.a(this.a.a, this.a.b, this.a.c, ailz.SUGGESTION, true, this.a.d, null, this.b, 32);
                return ajxw.a;
            }
        }

        c(wrn wrn, String str, WeakReference weakReference, boolean z) {
            this.a = wrn;
            this.b = str;
            this.c = weakReference;
            this.d = z;
        }

        /* JADX WARNING: Missing block: B:3:0x0018, code skipped:
            if (r1 == null) goto L_0x001a;
     */
        public final void run() {
            /*
            r17 = this;
            r0 = r17;
            r1 = r0.a;
            r1 = r1.g;
            r1 = r1.h();
            r1 = (defpackage.zjm) r1;
            if (r1 == 0) goto L_0x001a;
        L_0x000e:
            r1 = r1.d;
            r1 = r1.c;
            r1 = r1.getProject();
            r1 = r1.label;
            if (r1 != 0) goto L_0x001c;
        L_0x001a:
            r1 = "";
        L_0x001c:
            r16 = new zjm;
            r2 = defpackage.wqv.g;
            r3 = r2;
            r3 = (defpackage.ide) r3;
            r5 = 0;
            r6 = 0;
            r7 = 1;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 4076; // 0xfec float:5.712E-42 double:2.014E-320;
            r4 = "s2r_prompt_dialog_internal";
            r2 = r16;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
            r9 = new zgy$a;
            r2 = r0.a;
            r3 = r2.a;
            r2 = r0.a;
            r4 = r2.g;
            r7 = 0;
            r8 = 16;
            r2 = r9;
            r5 = r16;
            r2.<init>(r3, r4, r5, r6, r7, r8);
            r2 = 2131889279; // 0x7f120c7f float:1.9413217E38 double:1.0532932535E-314;
            r2 = r9.a(r2);
            r3 = 2131889160; // 0x7f120c08 float:1.9412976E38 double:1.0532931947E-314;
            r4 = new wrn$c$a;
            r4.<init>(r0, r1);
            r4 = (defpackage.akbl) r4;
            r5 = 1;
            r2 = r2.a(r3, r4, r5);
            r3 = 2131889159; // 0x7f120c07 float:1.9412974E38 double:1.053293194E-314;
            r4 = new wrn$c$b;
            r4.<init>(r0, r1);
            r4 = (defpackage.akbl) r4;
            r1 = r2.a(r3, r4, r5);
            r2 = r0.a;
            r2 = r2.c;
            r2 = r2.p();
            if (r2 == 0) goto L_0x0084;
        L_0x0077:
            r2 = 2131889163; // 0x7f120c0b float:1.9412982E38 double:1.053293196E-314;
            r3 = new wrn$c$1;
            r3.<init>(r0);
            r3 = (defpackage.akbl) r3;
            r1.a(r2, r3);
        L_0x0084:
            r2 = new wrn$c$2;
            r2.<init>(r0);
            r7 = r2;
            r7 = (defpackage.akbl) r7;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 30;
            r6 = r1;
            defpackage.zgy.a.a(r6, r7, r8, r9, r10, r11, r12);
            r1 = r1.a();
            r2 = r0.a;
            r2 = r2.g;
            r3 = new acip;
            r4 = r0.a;
            r4 = r4.g;
            r5 = r1;
            r5 = (defpackage.achd) r5;
            r1 = r1.a;
            r3.<init>(r4, r5, r1);
            r3 = (defpackage.acig) r3;
            r2.b(r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wrn$c.run():void");
        }
    }

    /* renamed from: wrn$e */
    static final class e<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ wrn a;
        private /* synthetic */ String b;
        private /* synthetic */ WeakReference c;

        e(wrn wrn, String str, WeakReference weakReference) {
            this.a = wrn;
            this.b = str;
            this.c = weakReference;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            obj = ajcx.a((ajev) new c(this.a, this.b, this.c, bool.booleanValue()));
            akcr.a(obj, "Completable.fromAction {…igationAction))\n        }");
            return obj;
        }
    }

    /* renamed from: wrn$g */
    static final class g<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ wrn a;
        private /* synthetic */ String b;
        private /* synthetic */ WeakReference c;

        g(wrn wrn, String str, WeakReference weakReference) {
            this.a = wrn;
            this.b = str;
            this.c = weakReference;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            obj = ajcx.a((ajev) new b(this.a, bool.booleanValue(), this.b, this.c));
            akcr.a(obj, "Completable.fromAction {…igationAction))\n        }");
            return obj;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wrn.class), "screenshotCapturer", "getScreenshotCapturer()Lcom/snap/shake2report/controller/ScreenshotCapturer;");
    }

    public wrn(Context context, zfw zfw, abss abss, jwb jwb, wtq wtq, wrh wrh, achb<zjm, zjk> achb, wub wub, wqp wqp, hxs hxs, wvl wvl, wqz wqz, boolean z) {
        akcr.b(context, "context");
        akcr.b(zfw, "schedulers");
        akcr.b(abss, "releaseManager");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(wtq, "fileManager");
        akcr.b(wrh, "configProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(wqp, "blizzardAnalyticsHelper");
        akcr.b(hxs, "featureConfiguration");
        akcr.b(wvl, "reportConfigProvider");
        akcr.b(wqz, "systemScreenshotTaker");
        this.a = context;
        this.b = zfw;
        this.c = abss;
        this.d = jwb;
        this.e = wtq;
        this.f = wrh;
        this.g = achb;
        this.h = wub;
        this.i = wqp;
        this.j = hxs;
        this.m = wvl;
        this.n = z;
        this.l = ajxh.a(new h(this, wqz));
    }

    static /* synthetic */ void a(wrn wrn, String str, WeakReference weakReference, ailz ailz, boolean z, boolean z2, String str2, String str3, int i) {
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        i = ailz == ailz.PROBLEM ? R.string.s2r_report_problem_title : R.string.s2r_suggest_improvement_title;
        wrn.m.a(str, ailz, aily.SHAKE_REPORT, z);
        wvl wvl = wrn.m;
        wvl.d = i;
        wvl.f = wrn.n;
        if (z) {
            wvl.j = str3;
        } else {
            wvl.g = Integer.valueOf(R.array.s2r_beta_features_list_v1);
        }
        wrn.m.k = str2;
        List arrayList = new ArrayList();
        arrayList.add(wvm.SCREENSHOT);
        if (z) {
            arrayList.add(wvm.LOG);
        }
        wrn.m.a(arrayList);
        wrn.m.n = z2;
        Object obj = weakReference.get();
        if (obj != null) {
            Activity activity = (Activity) obj;
            activity.startActivity(new Intent(activity, Shake2ReportActivity.class));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.app.Activity");
    }

    private final wrl b() {
        return (wrl) this.l.b();
    }

    public final void a() {
        this.k.a();
        b().a();
    }

    public final void a(WeakReference<Activity> weakReference) {
        Object e;
        akcr.b(weakReference, Event.ACTIVITY);
        String uuid = iig.a().toString();
        akcr.a((Object) uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        this.i.a(uuid);
        ajej a = this.b.f().a((Runnable) new a(this, uuid, weakReference));
        akcr.a((Object) a, "schedulers.io().schedule…ty.get(), null)\n        }");
        ajvv.a(a, this.k);
        a = b().a(uuid, (WeakReference) weakReference, this.g).b((ajdw) this.b.b()).e();
        akcr.a((Object) a, "screenshotCapturer.captu…             .subscribe()");
        ajvv.a(a, this.k);
        if (this.f.a()) {
            e = ajdx.c((Callable) new d(this)).b((ajdw) this.b.f()).a((ajdw) this.b.l()).e((ajfc) new e(this, uuid, weakReference));
            uuid = "Single.fromCallable { co…(shakeId, activity, it) }";
        } else {
            e = ajdx.c((Callable) new f(this)).b((ajdw) this.b.b()).a((ajdw) this.b.l()).e((ajfc) new g(this, uuid, weakReference));
            uuid = "Single.fromCallable { co…(it, shakeId, activity) }";
        }
        akcr.a(e, uuid);
        ajej e2 = e.b((ajdw) this.b.l()).e();
        akcr.a((Object) e2, "launchShake(shakeId, act…             .subscribe()");
        ajvv.a(e2, this.k);
    }
}
