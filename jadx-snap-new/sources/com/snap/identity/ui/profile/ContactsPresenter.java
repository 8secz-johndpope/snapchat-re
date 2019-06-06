package com.snap.identity.ui.profile;

import android.support.v7.widget.RecyclerView;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatModel;
import com.snap.core.db.query.ContactsOnSnapchatModel.SelectContactsOnSnapchatModel;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snap.identity.ui.profile.verifyphone.VerifyPhoneFragment;
import defpackage.abbd;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.acig;
import defpackage.acio;
import defpackage.acip;
import defpackage.aciv;
import defpackage.agze;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajcz;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.fth;
import defpackage.gpb;
import defpackage.ifs;
import defpackage.igs;
import defpackage.iqm;
import defpackage.iqs;
import defpackage.ira;
import defpackage.irc;
import defpackage.isj;
import defpackage.isr;
import defpackage.isw;
import defpackage.ite;
import defpackage.iue;
import defpackage.iyy;
import defpackage.j;
import defpackage.jic;
import defpackage.jkd;
import defpackage.jkd.n;
import defpackage.jkd.o;
import defpackage.jri;
import defpackage.jsf;
import defpackage.jsl;
import defpackage.jsy;
import defpackage.jsz;
import defpackage.jvo;
import defpackage.k;
import defpackage.s;
import defpackage.tnj;
import defpackage.usd;
import defpackage.usg;
import defpackage.usq;
import defpackage.ypo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zma;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zmy;
import defpackage.znh;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class ContactsPresenter extends zll<ContactsFragment> implements k {
    zmh a;
    zkf b;
    final zms c = new zms(jri.class);
    final zfw d = zgb.a(irc.t.callsite("ContactsPresenter"));
    iue e;
    boolean f;
    final jkd g;
    private final ajei h = new ajei();
    private ajwm i;
    private List<? extends zma> j;
    private final ajxe k;
    private final ajxe l;
    private final iqm m;
    private final iqs n;
    private final aipn<ifs> o;
    private final ira p;
    private final aipn<gpb> q;
    private final achb<zjm, zjk> r;
    private final tnj s;
    private final ajwy<usd> t;
    private final zhh u;
    private final ypo v;

    static final class e<V> implements Callable<Object> {
        private /* synthetic */ ContactsPresenter a;

        e(ContactsPresenter contactsPresenter) {
            this.a = contactsPresenter;
        }

        public final /* synthetic */ Object call() {
            ContactsPresenter contactsPresenter = this.a;
            zms zms = contactsPresenter.c;
            zkf zkf = this.a.b;
            if (zkf == null) {
                akcr.a("bus");
            }
            zke a = zkf.a();
            akcr.a((Object) a, "bus.eventDispatcher");
            ajdw b = this.a.d.b();
            ajdw a2 = ajef.a();
            akcr.a((Object) a2, "AndroidSchedulers.mainThread()");
            contactsPresenter.a = new zmh(zms, a, b, a2, ContactsPresenter.b(this.a), 32);
            ContactsPresenter contactsPresenter2 = this.a;
            return zln.bindTo$default(contactsPresenter2, ContactsPresenter.a(contactsPresenter2).e(), this.a, null, null, 6, null);
        }
    }

    static final class c<T> implements ajfb<agze> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            iyy iyy = new iyy();
            akcr.b(list, "viewModels");
            HashMap hashMap = new HashMap();
            int i = 0;
            for (Object next : list) {
                Object obj2;
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                zmy zmy = (zmy) next;
                if (zmy instanceof jsl) {
                    obj2 = AlphabeticScrollbar.b;
                } else {
                    if (zmy instanceof jsf) {
                        String str = ((jsf) zmy).a;
                        Character valueOf = str != null ? Character.valueOf(Character.toUpperCase(str.charAt(0))) : null;
                        if (valueOf != null && iyy.a(valueOf.charValue())) {
                            obj2 = String.valueOf(valueOf.charValue());
                        }
                    }
                    obj2 = AlphabeticScrollbar.e;
                }
                if (!hashMap.containsKey(obj2)) {
                    hashMap.put(obj2, Integer.valueOf(i2));
                }
                i = i2;
            }
            return hashMap;
        }
    }

    static final class g implements ajev {
        private /* synthetic */ ContactsPresenter a;

        g(ContactsPresenter contactsPresenter) {
            this.a = contactsPresenter;
        }

        public final void run() {
            ContactsFragment contactsFragment = (ContactsFragment) this.a.getTarget();
            RecyclerView recyclerView = null;
            RecyclerView a = contactsFragment != null ? contactsFragment.a() : null;
            if (a == null) {
                akcr.a();
            }
            a.setAdapter(ContactsPresenter.a(this.a));
            ContactsPresenter contactsPresenter = this.a;
            Object i = ajwl.i(ajyw.a);
            akcr.a(i, "BehaviorSubject.createDe…List<AdapterViewModel>())");
            Object p = i.a((ajdw) contactsPresenter.d.b()).p(f.a);
            iue iue = contactsPresenter.e;
            if (iue == null) {
                akcr.a("scrollBarController");
            }
            zmh zmh = contactsPresenter.a;
            if (zmh == null) {
                akcr.a("adapter");
            }
            akcr.a(p, "indexObservable");
            contactsFragment = (ContactsFragment) contactsPresenter.getTarget();
            if (contactsFragment != null) {
                recyclerView = contactsFragment.a();
            }
            iue.a(zmh, p, i, recyclerView);
        }
    }

    static final class a extends akcs implements akbk<ajdp<znh<SelectContactsNotOnSnapchatModel>>> {
        private /* synthetic */ ContactsPresenter a;

        a(ContactsPresenter contactsPresenter) {
            this.a = contactsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.g.d().b((ajdw) this.a.d.i()).a((ajdw) this.a.d.i()).p(AnonymousClass1.a);
        }
    }

    static final class b extends akcs implements akbk<ajdp<znh<SelectContactsOnSnapchatModel>>> {
        private /* synthetic */ ContactsPresenter a;

        b(ContactsPresenter contactsPresenter) {
            this.a = contactsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            jkd jkd = this.a.g;
            Object p = ajdp.a((Callable) new n(jkd)).b((ajdw) jkd.b().i()).p(o.a);
            akcr.a(p, "Observable\n             …     .map { it.toList() }");
            return p.b((ajdw) this.a.d.i()).a((ajdw) this.a.d.i()).p(AnonymousClass1.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ContactsPresenter.class), "contactsOnSnapchat", "getContactsOnSnapchat()Lio/reactivex/Observable;"), new akdc(akde.a(ContactsPresenter.class), "contactsNotOnSnapchat", "getContactsNotOnSnapchat()Lio/reactivex/Observable;")};
    }

    public ContactsPresenter(jkd jkd, zgb zgb, iqm iqm, iqs iqs, aipn<ifs> aipn, ira ira, aipn<gpb> aipn2, achb<zjm, zjk> achb, tnj tnj, ajwy<usd> ajwy, zhh zhh, ypo ypo) {
        akcr.b(jkd, "dataProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(iqm, "contactApi");
        akcr.b(iqs, "friendActionDispatcher");
        akcr.b(aipn, "permissionHelper");
        akcr.b(ira, "identityApi");
        akcr.b(aipn2, "userAuthStore");
        akcr.b(achb, "navigationHost");
        akcr.b(tnj, "prefs");
        akcr.b(ajwy, "unifiedProfileLauncher");
        akcr.b(zhh, "softKeyboardDetector");
        akcr.b(ypo, "publicUserStoriesSyncableSection");
        this.g = jkd;
        this.m = iqm;
        this.n = iqs;
        this.o = aipn;
        this.p = ira;
        this.q = aipn2;
        this.r = achb;
        this.s = tnj;
        this.t = ajwy;
        this.u = zhh;
        this.v = ypo;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.i = ajwm;
        this.j = ajyw.a;
        this.k = ajxh.a(new b(this));
        this.l = ajxh.a(new a(this));
    }

    /* JADX WARNING: Missing block: B:53:0x0151, code skipped:
            if (r2 == null) goto L_0x0153;
     */
    public static final /* synthetic */ java.util.List b(com.snap.identity.ui.profile.ContactsPresenter r22) {
        /*
        r0 = r22;
        r1 = r0.q;
        r1 = r1.get();
        r2 = "userAuthStore.get()";
        defpackage.akcr.a(r1, r2);
        r1 = (defpackage.gpb) r1;
        r1 = r1.a();
        r1 = r1.e;
        r1 = (java.lang.CharSequence) r1;
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x0024;
    L_0x001b:
        r1 = defpackage.akgb.a(r1);
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        r1 = 0;
        goto L_0x0025;
    L_0x0024:
        r1 = 1;
    L_0x0025:
        r5 = "bus.eventDispatcher";
        r6 = "permissionHelper.get()";
        r7 = "target!!.activity!!";
        r8 = "target!!";
        r9 = "bus";
        if (r1 == 0) goto L_0x0091;
    L_0x0031:
        r1 = new jvq;
        r11 = r0.p;
        r12 = r0.d;
        r2 = r0.b;
        if (r2 != 0) goto L_0x003e;
    L_0x003b:
        defpackage.akcr.a(r9);
    L_0x003e:
        r13 = r2.a();
        defpackage.akcr.a(r13, r5);
        r14 = r0.m;
        r2 = r0.o;
        r2 = r2.get();
        defpackage.akcr.a(r2, r6);
        r15 = r2;
        r15 = (defpackage.ifs) r15;
        r2 = r22.getTarget();
        r2 = (com.snap.identity.ui.profile.ContactsFragment) r2;
        if (r2 != 0) goto L_0x005e;
    L_0x005b:
        defpackage.akcr.a();
    L_0x005e:
        defpackage.akcr.a(r2, r8);
        r2 = r2.getActivity();
        if (r2 != 0) goto L_0x006a;
    L_0x0067:
        defpackage.akcr.a();
    L_0x006a:
        defpackage.akcr.a(r2, r7);
        r16 = r2;
        r16 = (android.app.Activity) r16;
        r2 = r0.u;
        r2 = r2.a();
        r3 = "softKeyboardDetector.keyboardHeightObservable";
        defpackage.akcr.a(r2, r3);
        r10 = r1;
        r17 = r2;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17);
        r0 = r0.b;
        if (r0 != 0) goto L_0x0089;
    L_0x0086:
        defpackage.akcr.a(r9);
    L_0x0089:
        r0.a(r1);
        r0 = defpackage.ajyl.a(r1);
        return r0;
    L_0x0091:
        r1 = r0.m;
        r1 = r1.d();
        if (r1 != 0) goto L_0x00fa;
    L_0x0099:
        r1 = new jtb;
        r11 = r0.n;
        r12 = r0.d;
        r3 = r0.o;
        r3 = r3.get();
        defpackage.akcr.a(r3, r6);
        r13 = r3;
        r13 = (defpackage.ifs) r13;
        r14 = r0.m;
        r3 = r22.getTarget();
        r3 = (com.snap.identity.ui.profile.ContactsFragment) r3;
        if (r3 != 0) goto L_0x00b8;
    L_0x00b5:
        defpackage.akcr.a();
    L_0x00b8:
        defpackage.akcr.a(r3, r8);
        r3 = r3.getActivity();
        if (r3 != 0) goto L_0x00c4;
    L_0x00c1:
        defpackage.akcr.a();
    L_0x00c4:
        defpackage.akcr.a(r3, r7);
        r15 = r3;
        r15 = (android.app.Activity) r15;
        r3 = r0.b;
        if (r3 != 0) goto L_0x00d1;
    L_0x00ce:
        defpackage.akcr.a(r9);
    L_0x00d1:
        r3 = r3.a();
        defpackage.akcr.a(r3, r5);
        r4 = r0.q;
        r4 = r4.get();
        defpackage.akcr.a(r4, r2);
        r17 = r4;
        r17 = (defpackage.gpb) r17;
        r10 = r1;
        r16 = r3;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17);
        r0 = r0.b;
        if (r0 != 0) goto L_0x00f2;
    L_0x00ef:
        defpackage.akcr.a(r9);
    L_0x00f2:
        r0.a(r1);
        r0 = defpackage.ajyl.a(r1);
        return r0;
    L_0x00fa:
        r1 = r0.m;
        r1 = r1.f();
        if (r1 == 0) goto L_0x0122;
    L_0x0102:
        r1 = r0.m;
        r2 = defpackage.agzc.a.UNSET;
        r1 = r1.a(r2, false, null, r3);
        r2 = com.snap.identity.ui.profile.ContactsPresenter.c.a;
        r2 = (defpackage.ajfb) r2;
        r5 = com.snap.identity.ui.profile.ContactsPresenter.d.a;
        r5 = (defpackage.ajfb) r5;
        r1 = r1.a(r2, r5);
        r2 = "contactApi.findFriends(\n…ge!\");}\n                )";
        defpackage.akcr.a(r1, r2);
        r2 = r0.h;
        r2 = (defpackage.ajfo) r2;
        defpackage.std.a(r1, r2);
    L_0x0122:
        r0.f = r4;
        r1 = r22.getTarget();
        r1 = (com.snap.identity.ui.profile.ContactsFragment) r1;
        if (r1 != 0) goto L_0x012f;
    L_0x012c:
        defpackage.akcr.a();
    L_0x012f:
        defpackage.akcr.a(r1, r8);
        r1 = r1.getActivity();
        if (r1 != 0) goto L_0x013b;
    L_0x0138:
        defpackage.akcr.a();
    L_0x013b:
        defpackage.akcr.a(r1, r7);
        r2 = r22.getTarget();
        r2 = (com.snap.identity.ui.profile.ContactsFragment) r2;
        r5 = r2 instanceof defpackage.itg;
        if (r5 != 0) goto L_0x0149;
    L_0x0148:
        r2 = 0;
    L_0x0149:
        r2 = (defpackage.itg) r2;
        if (r2 == 0) goto L_0x0153;
    L_0x014d:
        r2 = r2.b();
        if (r2 != 0) goto L_0x0155;
    L_0x0153:
        r2 = defpackage.ith.PROFILE;
    L_0x0155:
        r11 = r2;
        r2 = new jsm;
        r5 = r0.k;
        r5 = r5.b();
        r6 = r5;
        r6 = (defpackage.ajdp) r6;
        r7 = defpackage.irc.a;
        r5 = defpackage.irc.t;
        r8 = r5.getName();
        r5 = r1.getResources();
        r9 = 2131886988; // 0x7f12038c float:1.940857E38 double:1.0532921216E-314;
        r9 = r5.getString(r9);
        r10 = defpackage.iqt.PROFILE;
        r5 = r1.getResources();
        r12 = 2131887970; // 0x7f120762 float:1.9410562E38 double:1.053292607E-314;
        r12 = r5.getString(r12);
        r5 = r22.getTarget();
        r5 = (com.snap.identity.ui.profile.ContactsFragment) r5;
        if (r5 != 0) goto L_0x018c;
    L_0x0189:
        defpackage.akcr.a();
    L_0x018c:
        r5 = r5.s;
        r13 = r5;
        r13 = (defpackage.ajdp) r13;
        r14 = r0.v;
        r5 = r2;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r5 = new jsg;
        r6 = r0.l;
        r6 = r6.b();
        r16 = r6;
        r16 = (defpackage.ajdp) r16;
        r17 = defpackage.irc.a;
        r6 = defpackage.irc.t;
        r18 = r6.getName();
        r6 = r1.getResources();
        r7 = 2131886987; // 0x7f12038b float:1.9408568E38 double:1.053292121E-314;
        r19 = r6.getString(r7);
        r1 = r1.getResources();
        r6 = 2131887991; // 0x7f120777 float:1.9410605E38 double:1.053292617E-314;
        r20 = r1.getString(r6);
        r0 = r22.getTarget();
        r0 = (com.snap.identity.ui.profile.ContactsFragment) r0;
        if (r0 != 0) goto L_0x01cc;
    L_0x01c9:
        defpackage.akcr.a();
    L_0x01cc:
        r0 = r0.s;
        r21 = r0;
        r21 = (defpackage.ajdp) r21;
        r15 = r5;
        r15.<init>(r16, r17, r18, r19, r20, r21);
        r0 = 3;
        r0 = new defpackage.zma[r0];
        r1 = new jtl;
        r1.<init>();
        r1 = (defpackage.zma) r1;
        r0[r3] = r1;
        r2 = (defpackage.zma) r2;
        r0[r4] = r2;
        r1 = 2;
        r5 = (defpackage.zma) r5;
        r0[r1] = r5;
        r0 = defpackage.ajym.b(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.profile.ContactsPresenter.b(com.snap.identity.ui.profile.ContactsPresenter):java.util.List");
    }

    /* renamed from: a */
    public final void takeTarget(ContactsFragment contactsFragment) {
        akcr.b(contactsFragment, "target");
        super.takeTarget(contactsFragment);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.b = zkf;
        zkf = this.b;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
        contactsFragment.getLifecycle().a(this);
        this.e = new iue(contactsFragment.getContext(), this.d, this.h);
        ajcx b = ajcx.b((Callable) new e(this));
        akcr.a((Object) b, "Completable.fromCallable…ribe().bindTo(this)\n    }");
        igs.a(b, "initAdapterAsync").b((ajdw) this.d.h()).a((ajdw) this.d.l()).a((ajcz) this.i);
    }

    public final void dropTarget() {
        ContactsFragment contactsFragment = (ContactsFragment) getTarget();
        if (contactsFragment != null) {
            j lifecycle = contactsFragment.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        this.h.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.n.a(isj);
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        zln.bindTo$default(this, this.i.g(new g(this)), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendLongClickEvent(isr isr) {
        akcr.b(isr, "event");
        ((usd) this.t.get()).a(new usq(usg.FRIEND_PROFILE, isr.a, null, abbd.CONTACTS_PAGE, null, 20));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onGrantUserLevelContactAccess(jsy jsy) {
        akcr.b(jsy, "event");
        this.m.a(jsy.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onInviteFriendEvent(isw isw) {
        akcr.b(isw, "event");
        this.n.a(isw);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onMoveToContactSectionEvent(jsz jsz) {
        akcr.b(jsz, "event");
        zjf zjf = new zjf(irc.m, new ContactsFragment(), acgv.a().a(irc.p).a());
        List k = ajyu.k(this.r.g());
        achb achb = this.r;
        acig[] acigArr = new acig[2];
        Object obj = k.get(0);
        akcr.a(obj, "stackList[0]");
        acigArr[0] = new acio(((aciv) obj).e(), true, false);
        achb achb2 = this.r;
        achd achd = zjf;
        Object obj2 = irc.o;
        akcr.a(obj2, "IdentityFeature.PROFILE_…ENDS_PRESENT_NO_ANIMATION");
        acigArr[1] = new acip(achb2, achd, obj2);
        achb.b((acig) defpackage.acie.a.a(acigArr, null));
        ContactsFragment contactsFragment = (ContactsFragment) getTarget();
        if (contactsFragment != null) {
            contactsFragment.a(true);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onMoveToVerifyPhoneEvent(jvo jvo) {
        akcr.b(jvo, "event");
        this.s.b().a((fth) jic.INAPP_COUNTRY_CODE, jvo.b).a((fth) jic.INAPP_PHONE_NUMBER, jvo.a).b();
        zjf zjf = new zjf(irc.b, new VerifyPhoneFragment());
        achb achb = this.r;
        achd achd = zjf;
        acgu acgu = irc.c;
        akcr.a((Object) acgu, "IdentityFeature.PROFILE_…IFY_PHONE_PRESENT_DEFAULT");
        achb.a(achd, acgu, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartReplyCameraEvent(ite ite) {
        akcr.b(ite, "event");
        this.n.a(ite);
    }
}
