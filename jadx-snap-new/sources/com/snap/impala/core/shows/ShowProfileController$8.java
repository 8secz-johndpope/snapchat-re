package com.snap.impala.core.shows;

import android.content.Intent;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.impala.showprofile.ShowProfileView.ActionHandler;
import com.snapchat.client.composer.utils.ComposerCPPAction;
import defpackage.aahb;
import defpackage.abbd;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.alez;
import defpackage.alrf;
import defpackage.hbj;
import defpackage.hit;
import defpackage.hox;
import defpackage.ide;
import defpackage.idl;
import defpackage.keq;
import defpackage.kev;
import defpackage.kgr;
import defpackage.khh;
import defpackage.kji;
import defpackage.vhp;
import defpackage.wln;
import defpackage.yue;
import defpackage.yuj;
import defpackage.yuo;
import defpackage.yus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ShowProfileController$8 implements ActionHandler {
    final /* synthetic */ keq a;
    private /* synthetic */ akbk b;
    private /* synthetic */ wln c;

    static final class a<T> implements ajfb<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c implements ajev {
        private /* synthetic */ ShowProfileController$8 a;

        c(ShowProfileController$8 showProfileController$8) {
            this.a = showProfileController$8;
        }

        public final void run() {
            this.a.a.c.set(false);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ ShowProfileController$8 a;

        d(ShowProfileController$8 showProfileController$8) {
            this.a = showProfileController$8;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.c.set(false);
        }
    }

    public static final class e implements idl {
        e() {
        }

        public final ide getFeature() {
            Object obj = kgr.a;
            akcr.a(obj, "ImpalaFeature.INSTANCE");
            return (ide) obj;
        }

        public final List<String> getHierarchy() {
            return ajym.b((Object[]) new String[]{"impala", "show_profile"});
        }
    }

    static final class f implements ajev {
        private /* synthetic */ ShowProfileController$8 a;
        private /* synthetic */ ComposerCPPAction b;
        private /* synthetic */ boolean c;

        f(ShowProfileController$8 showProfileController$8, ComposerCPPAction composerCPPAction, boolean z) {
            this.a = showProfileController$8;
            this.b = composerCPPAction;
            this.c = z;
        }

        public final void run() {
            this.b.perform(new Object[0]);
            if (this.c) {
                ((kev) this.a.a.j.get()).a();
            }
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ ComposerCPPAction a;

        g(ComposerCPPAction composerCPPAction) {
            this.a = composerCPPAction;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ComposerCPPAction composerCPPAction = this.a;
            String[] strArr = new String[1];
            StringBuilder stringBuilder = new StringBuilder("Error setting opt-in state ");
            stringBuilder.append(th.getMessage());
            strArr[0] = stringBuilder.toString();
            composerCPPAction.perform(strArr);
        }
    }

    public ShowProfileController$8(keq keq, akbk akbk, wln wln) {
        this.a = keq;
        this.b = akbk;
        this.c = wln;
    }

    @Keep
    public final void dismiss(Object[] objArr) {
        akcr.b(objArr, "parameters");
        this.b.invoke();
    }

    @Keep
    public final void hideShow(Object[] objArr) {
        akcr.b(objArr, "parameters");
        Object obj = objArr[0];
        if (obj != null) {
            ComposerAction composerAction = (ComposerAction) obj;
            Object a = hit.a(null, hbj.PUBLISHER_STORY_CARD, this.a.k.o(), null, null, Long.valueOf(this.a.k.i()), null, this.a.k.o(), false, null);
            akcr.a(a, "ClientActionableStoryKey…                    null)");
            this.a.i.a(new hox(a));
            composerAction.perform(new Object[0]);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.actions.ComposerAction");
    }

    @Keep
    public final void onSubscribedStateUpdate(Object[] objArr) {
        Object obj = objArr;
        akcr.b(obj, "parameters");
        try {
            obj = obj[0];
            if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                synchronized (this) {
                    this.a.k.a(booleanValue);
                }
                boolean j = this.a.k.j();
                String valueOf = String.valueOf(this.a.k.i());
                Object b = this.a.k.b();
                akcr.a(b, "info.name");
                yuj yuj = new yuj(false, j, valueOf, b, this.a.k.k(), hbj.PUBLISHER_STORY_CARD, yue.DF_ACTION_MENU);
                Object o = this.a.k.o();
                akcr.a(o, "info.publisherName");
                ajej a = this.a.g.a((yus) new yuo(o, this.a.k.i(), 0, booleanValue, yuj, false)).a((ajfb) a.a, (ajfb) b.a);
                akcr.a((Object) a, "subscriptionDataSource\n …                       })");
                ajvv.a(a, this.a.b);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
        }
    }

    public final void openURL(Object[] objArr) {
        akcr.b(objArr, "parameters");
        Object obj = objArr[0];
        if (obj != null) {
            obj = ((Map) obj).get("url");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                this.c.a(this.a.d, str);
                return;
            }
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
    }

    @Keep
    public final void playStoryDoc(Object[] objArr) {
        Object obj = objArr;
        akcr.b(obj, "parameters");
        int i = 1;
        if (this.a.c.compareAndSet(false, true)) {
            try {
                Object obj2 = obj[0];
                String str = "null cannot be cast to non-null type kotlin.Array<java.lang.Object>";
                if (obj2 != null) {
                    Object[] objArr2 = (Object[]) obj2;
                    Collection arrayList = new ArrayList(objArr2.length);
                    int length = objArr2.length;
                    int i2 = 0;
                    while (true) {
                        String str2 = "null cannot be cast to non-null type kotlin.ByteArray";
                        if (i2 < length) {
                            Object obj3 = objArr2[i2];
                            if (obj3 != null) {
                                arrayList.add(alrf.a((byte[]) obj3));
                                i2++;
                            } else {
                                throw new ajxt(str2);
                            }
                        }
                        ArrayList arrayList2 = (ArrayList) ((List) arrayList);
                        obj2 = obj[1];
                        if (obj2 != null) {
                            int doubleValue = (int) ((Double) obj2).doubleValue();
                            obj2 = obj[3];
                            if (obj2 != null) {
                                Object a = alez.a((byte[]) obj2);
                                obj2 = obj[4];
                                if (obj2 != null) {
                                    objArr2 = (Object[]) obj2;
                                    Collection arrayList3 = new ArrayList(objArr2.length);
                                    for (Object obj4 : objArr2) {
                                        Object obj42;
                                        if (!(obj42 instanceof View)) {
                                            obj42 = null;
                                        }
                                        arrayList3.add((View) obj42);
                                    }
                                    List list = (List) arrayList3;
                                    obj = obj[5];
                                    if (obj != null) {
                                        String str3 = (String) obj;
                                        obj2 = Locale.US;
                                        akcr.a(obj2, "Locale.US");
                                        if (str3 != null) {
                                            obj = str3.toUpperCase(obj2);
                                            akcr.a(obj, "(this as java.lang.String).toUpperCase(locale)");
                                            aahb valueOf = aahb.valueOf(obj);
                                            khh khh = new khh(kji.a);
                                            khh.a((idl) new e());
                                            khh.a(valueOf);
                                            khh.a(abbd.PUBLIC_PROFILE);
                                            vhp vhp = new vhp();
                                            akcr.a(a, "showMetadata");
                                            vhp.a(a.g());
                                            vhp.a(a.h());
                                            vhp.b(a.h());
                                            vhp.c(a.b());
                                            vhp.g(a.j());
                                            vhp.d(a.i());
                                            vhp.h(a.e());
                                            vhp.a(this.a.k.j());
                                            vhp.a(2);
                                            vhp.i(this.a.k.l());
                                            if (!this.a.k.n() || !this.a.k.m()) {
                                                i = 0;
                                            }
                                            vhp.b(i);
                                            ajej a2 = this.a.e.a(arrayList2, doubleValue, vhp, a, this.a.k.f(), this.a.k.g(), khh, list).b(500, TimeUnit.MILLISECONDS).a((ajev) new c(this), (ajfb) new d(this));
                                            akcr.a((Object) a2, "storyDocPlayer.playStory…                       })");
                                            ajvv.a(a2, this.a.b);
                                            return;
                                        }
                                        throw new ajxt("null cannot be cast to non-null type java.lang.String");
                                    }
                                    throw new ajxt("null cannot be cast to non-null type kotlin.String");
                                }
                                throw new ajxt(str);
                            }
                            throw new ajxt(str2);
                        }
                        throw new ajxt("null cannot be cast to non-null type kotlin.Double");
                    }
                }
                throw new ajxt(str);
            } catch (Exception unused) {
                this.a.c.set(false);
            }
        }
    }

    @Keep
    public final void shareUrl(Object[] objArr) {
        akcr.b(objArr, "parameters");
        try {
            Object obj = objArr[0];
            if (obj != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    this.a.d.startActivity(Intent.createChooser(intent, "Share"));
                    return;
                }
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }

    @Keep
    public final void updateNotificationsOptInState(Object[] objArr) {
        akcr.b(objArr, "parameters");
        try {
            Object obj = objArr[0];
            if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    ComposerCPPAction composerCPPAction = (ComposerCPPAction) obj2;
                    synchronized (this) {
                        this.a.k.b(booleanValue);
                    }
                    boolean z = !booleanValue;
                    boolean j = this.a.k.j();
                    String valueOf = String.valueOf(this.a.k.i());
                    Object b = this.a.k.b();
                    akcr.a(b, "info.name");
                    ajej a = this.a.h.a(new yuj(z, j, valueOf, b, this.a.k.k(), hbj.PUBLISHER_STORY_CARD, yue.DF_ACTION_MENU)).a((ajdw) this.a.a().l()).a((ajev) new f(this, composerCPPAction, booleanValue), (ajfb) new g(composerCPPAction));
                    akcr.a((Object) a, "optInNotificationDataSou…                       })");
                    ajvv.a(a, this.a.b);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snapchat.client.composer.utils.ComposerCPPAction");
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
        }
    }
}
