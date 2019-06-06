package com.snap.impala.core.publishers;

import android.content.Intent;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.impala.publisherprofile.PublisherProfileView.ActionHandler;
import com.snapchat.client.composer.utils.ComposerCPPAction;
import defpackage.aahb;
import defpackage.abbd;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajyl;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.aley;
import defpackage.alrf;
import defpackage.hbj;
import defpackage.hit;
import defpackage.hox;
import defpackage.ide;
import defpackage.idl;
import defpackage.kdy;
import defpackage.kgr;
import defpackage.khh;
import defpackage.kjf;
import defpackage.vhp;
import defpackage.wkr;
import defpackage.wln;
import defpackage.yue;
import defpackage.yuj;
import defpackage.yuo;
import defpackage.yus;
import defpackage.zjm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class PublisherProfileController$6 implements ActionHandler {
    final /* synthetic */ kdy a;
    private /* synthetic */ akbk b;

    static final class a implements ajev {
        private /* synthetic */ PublisherProfileController$6 a;

        a(PublisherProfileController$6 publisherProfileController$6) {
            this.a = publisherProfileController$6;
        }

        public final void run() {
            this.a.a.d.set(false);
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ PublisherProfileController$6 a;

        b(PublisherProfileController$6 publisherProfileController$6) {
            this.a = publisherProfileController$6;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.d.set(false);
        }
    }

    public static final class c implements idl {
        c() {
        }

        public final ide getFeature() {
            Object obj = kgr.a;
            akcr.a(obj, "ImpalaFeature.INSTANCE");
            return (ide) obj;
        }

        public final List<String> getHierarchy() {
            return ajyl.a("impala");
        }
    }

    static final class d implements ajev {
        private /* synthetic */ ComposerCPPAction a;

        d(ComposerCPPAction composerCPPAction) {
            this.a = composerCPPAction;
        }

        public final void run() {
            this.a.perform(new Object[0]);
        }
    }

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ ComposerCPPAction a;

        e(ComposerCPPAction composerCPPAction) {
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

    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ ComposerCPPAction a;

        f(ComposerCPPAction composerCPPAction) {
            this.a = composerCPPAction;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.perform(new Object[0]);
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
            StringBuilder stringBuilder = new StringBuilder("Error setting subscribe state ");
            stringBuilder.append(th.getMessage());
            strArr[0] = stringBuilder.toString();
            composerCPPAction.perform(strArr);
        }
    }

    public PublisherProfileController$6(kdy kdy, akbk akbk) {
        this.a = kdy;
        this.b = akbk;
    }

    public final void dismiss(Object[] objArr) {
        akcr.b(objArr, "parameters");
        this.b.invoke();
    }

    @Keep
    public final void hidePublisher(Object[] objArr) {
        akcr.b(objArr, "parameters");
        Object obj = objArr[0];
        if (obj != null) {
            ComposerAction composerAction = (ComposerAction) obj;
            hbj hbj = hbj.PUBLISHER_STORY_CARD;
            String b = this.a.l.b();
            Object a = this.a.l.a();
            akcr.a(a, "info.publisherId");
            a = hit.a(null, hbj, b, null, null, Long.valueOf(Long.parseLong(a)), null, this.a.l.b(), false, null);
            akcr.a(a, "ClientActionableStoryKey…                    null)");
            this.a.k.a(new hox(a));
            composerAction.perform(new Object[0]);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.actions.ComposerAction");
    }

    @Keep
    public final void openURL(Object[] objArr) {
        Object obj = objArr;
        akcr.b(obj, "parameters");
        if (((obj.length == 0 ? 1 : 0) ^ 1) != 0) {
            obj = obj[0];
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map != null) {
                obj = map.get("url");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str != null) {
                    wln wln = (wln) this.a.o.get();
                    wkr wkr = (wkr) this.a.p.get();
                    zjm zjm = r5;
                    zjm zjm2 = new zjm(kjf.a, "PublisherProfileController", false, false, false, false, null, false, false, false, false, null, 4092);
                    wln.a(str, false, wkr.a(zjm, this.a.c));
                }
            }
        }
    }

    @Keep
    public final void playStoryDoc(Object[] objArr) {
        Object obj = objArr;
        String str = "launchInfo.metadata";
        akcr.b(obj, "parameters");
        if (this.a.d.compareAndSet(false, true)) {
            try {
                Object obj2 = obj[0];
                String str2 = "null cannot be cast to non-null type kotlin.Array<java.lang.Object>";
                if (obj2 != null) {
                    Object[] objArr2 = (Object[]) obj2;
                    Collection arrayList = new ArrayList(objArr2.length);
                    int length = objArr2.length;
                    int i = 0;
                    while (true) {
                        String str3 = "null cannot be cast to non-null type kotlin.ByteArray";
                        if (i < length) {
                            Object obj3 = objArr2[i];
                            if (obj3 != null) {
                                arrayList.add(alrf.a((byte[]) obj3));
                                i++;
                            } else {
                                throw new ajxt(str3);
                            }
                        }
                        ArrayList arrayList2 = (ArrayList) ((List) arrayList);
                        obj2 = obj[1];
                        if (obj2 != null) {
                            int doubleValue = (int) ((Double) obj2).doubleValue();
                            obj2 = obj[2];
                            if (obj2 != null) {
                                obj2 = aley.a((byte[]) obj2);
                                Object obj4 = obj[3];
                                if (obj4 != null) {
                                    Object[] objArr3 = (Object[]) obj4;
                                    Collection arrayList3 = new ArrayList(objArr3.length);
                                    for (Object obj5 : objArr3) {
                                        Object obj52;
                                        if (!(obj52 instanceof View)) {
                                            obj52 = null;
                                        }
                                        arrayList3.add((View) obj52);
                                    }
                                    List list = (List) arrayList3;
                                    obj = obj[4];
                                    if (obj != null) {
                                        String str4 = (String) obj;
                                        Object obj6 = Locale.US;
                                        akcr.a(obj6, "Locale.US");
                                        if (str4 != null) {
                                            obj = str4.toUpperCase(obj6);
                                            akcr.a(obj, "(this as java.lang.String).toUpperCase(locale)");
                                            aahb valueOf = aahb.valueOf(obj);
                                            khh khh = new khh(kjf.a);
                                            khh.a((idl) new c());
                                            khh.a(valueOf);
                                            khh.a(abbd.PUBLIC_PROFILE);
                                            vhp vhp = new vhp();
                                            akcr.a(obj2, "launchInfo");
                                            obj = obj2.a();
                                            akcr.a(obj, "launchInfo.publisherId");
                                            vhp.a(Long.parseLong(obj));
                                            vhp.a(obj2.b());
                                            vhp.b(obj2.b());
                                            obj = obj2.a;
                                            akcr.a(obj, str);
                                            vhp.i(obj.c());
                                            obj = obj2.a;
                                            akcr.a(obj, str);
                                            vhp.c(obj.a());
                                            obj = obj2.a;
                                            akcr.a(obj, str);
                                            vhp.g(obj.b());
                                            vhp.d(obj2.e());
                                            obj = obj2.a;
                                            akcr.a(obj, str);
                                            vhp.h(obj.d());
                                            vhp.a(this.a.e);
                                            vhp.a(1);
                                            ajej a = this.a.g.a(arrayList2, doubleValue, vhp, null, obj2.c(), obj2.d(), khh, list).b(500, TimeUnit.MILLISECONDS).a((ajev) new a(this), (ajfb) new b(this));
                                            akcr.a((Object) a, "storyDocPlayer.playStory…                       })");
                                            ajvv.a(a, this.a.c);
                                            return;
                                        }
                                        throw new ajxt("null cannot be cast to non-null type java.lang.String");
                                    }
                                    throw new ajxt("null cannot be cast to non-null type kotlin.String");
                                }
                                throw new ajxt(str2);
                            }
                            throw new ajxt(str3);
                        }
                        throw new ajxt("null cannot be cast to non-null type kotlin.Double");
                    }
                }
                throw new ajxt(str2);
            } catch (Exception unused) {
                this.a.d.set(false);
            }
        }
    }

    @Keep
    public final void setNotificationsState(Object[] objArr) {
        akcr.b(objArr, "parameters");
        try {
            Object obj = objArr[0];
            if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = objArr[2];
                if (obj2 != null) {
                    ComposerCPPAction composerCPPAction = (ComposerCPPAction) obj2;
                    synchronized (this) {
                        this.a.l.b(booleanValue);
                    }
                    boolean z = !booleanValue;
                    boolean z2 = this.a.e;
                    String str = this.a.l.a().toString();
                    Object obj3 = this.a.l.a;
                    akcr.a(obj3, "info.metadata");
                    Object a = obj3.a();
                    akcr.a(a, "info.metadata.publisherFormalDisplayName");
                    obj3 = this.a.l.a;
                    akcr.a(obj3, "info.metadata");
                    ajej a2 = this.a.j.a(new yuj(z, z2, str, a, obj3.d(), hbj.PUBLISHER_STORY_CARD, yue.DF_ACTION_MENU)).a((ajev) new d(composerCPPAction), (ajfb) new e(composerCPPAction));
                    akcr.a((Object) a2, "optInNotificationDataSou…                       })");
                    ajvv.a(a2, this.a.c);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snapchat.client.composer.utils.ComposerCPPAction");
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
        }
    }

    @Keep
    public final void setSubscribeState(Object[] objArr) {
        Object obj = objArr;
        akcr.b(obj, "parameters");
        try {
            Object obj2 = obj[0];
            if (obj2 != null) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                obj = obj[2];
                if (obj != null) {
                    yuj yuj;
                    yuj yuj2;
                    ComposerCPPAction composerCPPAction = (ComposerCPPAction) obj;
                    synchronized (this) {
                        this.a.l.a(booleanValue);
                    }
                    if (this.a.l.a != null) {
                        boolean z = this.a.e;
                        String str = this.a.l.a().toString();
                        Object obj3 = this.a.l.a;
                        akcr.a(obj3, "info.metadata");
                        Object a = obj3.a();
                        akcr.a(a, "info.metadata.publisherFormalDisplayName");
                        obj3 = this.a.l.a;
                        akcr.a(obj3, "info.metadata");
                        yuj = new yuj(false, z, str, a, obj3.b(), hbj.PUBLISHER_STORY_CARD, yue.DF_ACTION_MENU);
                    } else {
                        yuj2 = null;
                    }
                    yuj = yuj2;
                    Object b = this.a.l.b();
                    akcr.a(b, "info.publisherNameId");
                    obj2 = this.a.l.a();
                    akcr.a(obj2, "info.publisherId");
                    ajej a2 = this.a.i.a((yus) new yuo(b, Long.parseLong(obj2), 0, booleanValue, yuj, true)).a((ajfb) new f(composerCPPAction), (ajfb) new g(composerCPPAction));
                    akcr.a((Object) a2, "subscriptionDataSource\n …                       })");
                    ajvv.a(a2, this.a.c);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snapchat.client.composer.utils.ComposerCPPAction");
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
        }
    }

    @Keep
    public final void shareURL(Object[] objArr) {
        akcr.b(objArr, "parameters");
        try {
            Object obj = objArr[0];
            if (obj != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    this.a.f.startActivity(Intent.createChooser(intent, "Share"));
                    return;
                }
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }
}
