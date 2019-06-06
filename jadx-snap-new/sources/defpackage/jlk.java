package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.snap.core.db.record.CharmsModel;
import com.snap.core.db.record.FriendModel;
import defpackage.iyn.a;
import defpackage.jkd.s;
import defpackage.jkd.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: jlk */
public final class jlk implements ajej {
    static final List<c> l = ajym.b((Object[]) new c[]{c.REGISTER_TO_VOTE, c.SYNC_CONTACTS, c.ENABLE_PUSH_NOTIFICATION, c.VERIFY_PHONE_NUMBER, c.GROUPS, c.VERIFY_EMAIL_ADDRESS, c.BIRTHDAY});
    static final c[] m = new c[]{c.REGISTER_TO_VOTE};
    public final ajwl<Optional<c>> a;
    final zfw b;
    Set<c> c;
    final Set<c> d;
    final List<ajdp<b>> e;
    final Context f;
    final ftl g;
    final tnj h;
    final ajwy<jkd> i;
    final gpb j;
    final iqm k;
    private final ajei n = new ajei();
    private final ajft o;

    /* renamed from: jlk$c */
    public enum c {
        ENABLE_PUSH_NOTIFICATION(jic.HAS_SEEN_ENABLE_PUSH_NOTIFICATION_PROMPT, jic.IS_NEW_CARD_ENABLE_PUSH_NOTIFICATION_PROMPT, jic.HAS_DISMISSED_ENABLE_PUSH_NOTIFICATION_PROMPT, zyu.ENABLE_PUSH),
        VERIFY_PHONE_NUMBER(jic.HAS_SEEN_VERIFY_PHONE_NUMBER_PROMPT, jic.IS_NEW_CARD_VERIFY_PHONE_NUMBER_PROMPT, jic.HAS_DISMISSED_VERIFY_PHONE_NUMBER_PROMPT, zyu.PHONE_VERIFY),
        SYNC_CONTACTS(jic.HAS_SEEN_SYNC_CONTACT_PROMPT, jic.IS_NEW_CARD_SYNC_CONTACT_PROMPT, jic.HAS_DISMISSED_SYNC_CONTACT_PROMPT, zyu.CONTACT_SYNC),
        VERIFY_EMAIL_ADDRESS(jic.HAS_SEEN_VERIFY_EMAIL_ADDRESS_PROMPT, jic.IS_NEW_CARD_VERIFY_EMAIL_ADDRESS_PROMPT, jic.HAS_DISMISSED_VERIFY_EMAIL_ADDRESS_PROMPT, zyu.EMAIL_VERIFY),
        BIRTHDAY(jic.HAS_SEEN_CARD_BIRTHDAY_PROMPT, jic.IS_NEW_CARD_BIRTHDAY_PROMPT, jic.HAS_DISMISSED_BIRTHDAY_PROMPT, zyu.ENTER_BIRTHDAY),
        GROUPS(jic.HAS_SEEN_CARD_GROUPS_PROMPT, jic.IS_NEW_CARD_GROUPS_PROMPT, jic.HAS_DISMISSED_GROUPS_PROMPT, zyu.CREATE_GROUP),
        REGISTER_TO_VOTE(jic.HAS_SEEN_CARD_REGISTER_TO_VOTE_PROMPT, jic.IS_NEW_CARD_REGISTER_TO_VOTE_PROMPT, jic.HAS_DISMISSED_REGISTER_TO_VOTE_PROMPT, zyu.REGISTER_TO_VOTE);
        
        public final zyu actionCardType;
        public final jic hasDismissedKey;
        public final jic hasSeenKey;
        public final jic newCardKey;

        private c(jic jic, jic jic2, jic jic3, zyu zyu) {
            akcr.b(jic, "hasSeenKey");
            akcr.b(jic2, "newCardKey");
            akcr.b(jic3, "hasDismissedKey");
            akcr.b(zyu, "actionCardType");
            this.hasSeenKey = jic;
            this.newCardKey = jic2;
            this.hasDismissedKey = jic3;
            this.actionCardType = zyu;
        }
    }

    /* renamed from: jlk$f */
    static final class f extends akcq implements akbk<ajdp<Boolean>> {
        f(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowPushNotification";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowPushNotification()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            Object a = gr.a(((jlk) this.receiver).f);
            akcr.a(a, "NotificationManagerCompat.from(context)");
            a = ajdx.c((Callable) new q(a)).i();
            akcr.a(a, "Single.fromCallable { !n…          .toObservable()");
            return a;
        }
    }

    /* renamed from: jlk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: jlk$1 */
    static final class 1<T> implements ajfl<Boolean> {
        public static final 1 a = new 1();

        1() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: jlk$2 */
    static final class 2<T> implements ajfb<Boolean> {
        private /* synthetic */ jlk a;

        2(jlk jlk) {
            this.a = jlk;
        }

        public final /* synthetic */ void accept(Object obj) {
            jlk jlk = this.a;
            Set linkedHashSet = new LinkedHashSet();
            ajyr.a((Collection) linkedHashSet, (Object[]) c.values());
            jlk.c = linkedHashSet;
            this.a.h.b().a((fth) c.SYNC_CONTACTS.hasSeenKey, Boolean.FALSE).a((fth) c.VERIFY_EMAIL_ADDRESS.hasSeenKey, Boolean.FALSE).b();
        }
    }

    /* renamed from: jlk$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ jlk a;

        e(jlk jlk) {
            this.a = jlk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            jlk jlk;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            this.a.d.clear();
            this.a.e.clear();
            jlk jlk2 = this.a;
            jlk jlk3 = jlk2;
            jlk2.a(c.ENABLE_PUSH_NOTIFICATION, new f(jlk3));
            jlk2.a(c.SYNC_CONTACTS, new g(jlk3));
            jlk2.a(c.VERIFY_PHONE_NUMBER, new h(jlk3));
            jlk2.a(c.VERIFY_EMAIL_ADDRESS, new i(jlk3));
            if (bool.booleanValue()) {
                jlk = this.a;
                jlk jlk4 = jlk;
                jlk.a(c.BIRTHDAY, new j(jlk4));
                jlk.a(c.GROUPS, new k(jlk4));
                jlk.a(c.REGISTER_TO_VOTE, new l(jlk4));
            }
            jlk = this.a;
            return ajdp.a((Iterable) jlk.e, (ajfc) v.a).a((ajdw) jlk.b.b()).p(new w(jlk));
        }
    }

    /* renamed from: jlk$q */
    static final class q<V> implements Callable<T> {
        private /* synthetic */ gr a;

        q(gr grVar) {
            this.a = grVar;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.b() ^ 1);
        }
    }

    /* renamed from: jlk$d */
    public static final class d<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        private /* synthetic */ c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            boolean booleanValue = ((Boolean) t3).booleanValue();
            Object obj = (Boolean) t2;
            Object obj2 = (Boolean) t1;
            c cVar = this.a;
            akcr.a(obj2, "hasSeen");
            boolean booleanValue2 = obj2.booleanValue();
            akcr.a(obj, "hasDismissed");
            return new b(cVar, booleanValue2, obj.booleanValue(), booleanValue);
        }
    }

    /* renamed from: jlk$g */
    static final class g extends akcq implements akbk<ajdp<Boolean>> {
        g(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowSyncContactItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowSyncContactItem()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            Object p = ((jlk) this.receiver).k.e().p(s.a);
            akcr.a(p, "contactApi.hasAccessToCo…sObservable().map { !it }");
            return p;
        }
    }

    /* renamed from: jlk$h */
    static final class h extends akcq implements akbk<ajdp<Boolean>> {
        h(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowVerifyPhoneNumberItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowVerifyPhoneNumberItem()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            Object p = ((jlk) this.receiver).j.c().p(u.a);
            akcr.a(p, "userAuthStore.observeUse…Utils.isEmpty(it.phone) }");
            return p;
        }
    }

    /* renamed from: jlk$i */
    static final class i extends akcq implements akbk<ajdp<Boolean>> {
        i(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowVerifyEmailItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowVerifyEmailItem()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            Object p = ((jlk) this.receiver).g.p(jic.IS_EMAIL_VERIFIED).p(t.a);
            akcr.a(p, "configProvider.observeBo…AIL_VERIFIED).map { !it }");
            return p;
        }
    }

    /* renamed from: jlk$s */
    static final class s<T, R> implements ajfc<T, R> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return Boolean.valueOf(bool.booleanValue() ^ 1);
        }
    }

    /* renamed from: jlk$u */
    static final class u<T, R> implements ajfc<T, R> {
        public static final u a = new u();

        u() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return Boolean.valueOf(TextUtils.isEmpty(abkq.e));
        }
    }

    /* renamed from: jlk$t */
    static final class t<T, R> implements ajfc<T, R> {
        public static final t a = new t();

        t() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return Boolean.valueOf(bool.booleanValue() ^ 1);
        }
    }

    /* renamed from: jlk$v */
    static final class v<T, R> implements ajfc<Object[], R> {
        public static final v a = new v();

        v() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            akcr.b(objArr, "it");
            return objArr;
        }
    }

    /* renamed from: jlk$w */
    static final class w<T, R> implements ajfc<T, R> {
        private /* synthetic */ jlk a;

        w(jlk jlk) {
            this.a = jlk;
        }

        /* JADX WARNING: Missing block: B:15:0x003c, code skipped:
            if (r5 != null) goto L_0x003e;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (java.lang.Object[]) r9;
            r0 = "itemDataArray";
            defpackage.akcr.b(r9, r0);
            r0 = r9.length;
            r1 = 0;
            r2 = 0;
        L_0x000a:
            if (r2 >= r0) goto L_0x0058;
        L_0x000c:
            r3 = r9[r2];
            r4 = r8.a;
            if (r3 == 0) goto L_0x0050;
        L_0x0012:
            r3 = (defpackage.jlk.b) r3;
            r5 = "item";
            defpackage.akcr.b(r3, r5);
            r5 = r3.d;
            if (r5 == 0) goto L_0x0046;
        L_0x001d:
            r5 = r4.c;
            r6 = r3.a;
            r5 = r5.remove(r6);
            if (r5 != 0) goto L_0x003e;
        L_0x0027:
            r5 = r3.a;
            r6 = r3.b;
            r7 = r3.c;
            if (r7 != 0) goto L_0x003b;
        L_0x002f:
            if (r6 == 0) goto L_0x0039;
        L_0x0031:
            r6 = defpackage.jlk.m;
            r5 = defpackage.ajyi.a(r6, r5);
            if (r5 != 0) goto L_0x003b;
        L_0x0039:
            r5 = 1;
            goto L_0x003c;
        L_0x003b:
            r5 = 0;
        L_0x003c:
            if (r5 == 0) goto L_0x0046;
        L_0x003e:
            r4 = r4.d;
            r3 = r3.a;
            r4.add(r3);
            goto L_0x004d;
        L_0x0046:
            r4 = r4.d;
            r3 = r3.a;
            r4.remove(r3);
        L_0x004d:
            r2 = r2 + 1;
            goto L_0x000a;
        L_0x0050:
            r9 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.identity.ui.profile.unifiedprofile.viewsection.UserIdentityItemProvider.IdentityItemData";
            r9.<init>(r0);
            throw r9;
        L_0x0058:
            r9 = r8.a;
            r9 = r9.d;
            r0 = defpackage.jlk.l;
            r0 = r0.iterator();
        L_0x0062:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0075;
        L_0x0068:
            r1 = r0.next();
            r1 = (defpackage.jlk.c) r1;
            r2 = r9.contains(r1);
            if (r2 == 0) goto L_0x0062;
        L_0x0074:
            goto L_0x0076;
        L_0x0075:
            r1 = 0;
        L_0x0076:
            r9 = r8.a;
            r9 = r9.a;
            r0 = com.google.common.base.Optional.fromNullable(r1);
            r9.a(r0);
            r9 = defpackage.ajxw.a;
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jlk$w.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jlk$b */
    public static final class b {
        final c a;
        final boolean b;
        final boolean c;
        final boolean d;

        public b(c cVar, boolean z, boolean z2, boolean z3) {
            akcr.b(cVar, "type");
            this.a = cVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a)) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                if ((this.d == bVar.d ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            c cVar = this.a;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            int i = this.b;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.c;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.d;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("IdentityItemData(type=");
            stringBuilder.append(this.a);
            stringBuilder.append(", hasSeen=");
            stringBuilder.append(this.b);
            stringBuilder.append(", hasDismissed=");
            stringBuilder.append(this.c);
            stringBuilder.append(", shouldShow=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: jlk$m */
    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return Boolean.valueOf(abkq.h == null);
        }
    }

    /* renamed from: jlk$n */
    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return Boolean.valueOf(l.longValue() == 0);
        }
    }

    /* renamed from: jlk$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return Boolean.valueOf(l.longValue() >= 5);
        }
    }

    /* renamed from: jlk$p */
    static final class p<T, R> implements ajfc<T, R> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            Object obj2 = ajxm.a;
            akcr.a(obj2, "it.first");
            if (((Boolean) obj2).booleanValue()) {
                obj = ajxm.b;
                akcr.a(obj, "it.second");
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: jlk$r */
    static final class r<T, R> implements ajfc<T, R> {
        private /* synthetic */ jlk a;

        r(jlk jlk) {
            this.a = jlk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "session");
            Long l = abkq.h;
            boolean z = false;
            if (l != null) {
                akrl akrl = new akrl(l.longValue());
                Object akrl2 = new akrl();
                akcr.a(akrl2, "LocalDate.now()");
                Object obj2 = Locale.getDefault();
                akcr.a(obj2, "Locale.getDefault()");
                akcr.b(akrl, FriendModel.BIRTHDAY);
                akcr.b(akrl2, "today");
                akcr.b(obj2, CharmsModel.LOCALE);
                int c = akrl2.c();
                akcr.b(akrl, "birthdate");
                c -= akrl.c();
                Object a = c == 0 ? akrl : akrl.a(akrl.b.D().a(akrl.a, c));
                akcr.a(a, "birthdate.plusYears(year - birthdate.year)");
                obj2 = obj2.getCountry();
                Object obj3 = Locale.US;
                akcr.a(obj3, "Locale.US");
                if (akcr.a(obj2, obj3.getCountry()) && a.a(akrl, akrl2) == 18) {
                    akrx akrx = (akrx) a;
                    obj = akrd.a(akrb.a(akrx.b()).s().b(((akrl) ((akrx) akrl2)).a, ((akrl) akrx).a));
                    akcr.a(obj, "Days.daysBetween(birthdayThisYear, today)");
                    if (obj.c() < 7) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: jlk$j */
    static final class j extends akcq implements akbk<ajdp<Boolean>> {
        j(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowBirthdayItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowBirthdayItem()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            Object p = ((jlk) this.receiver).j.c().p(m.a);
            akcr.a(p, "userAuthStore.observeUse…p { it.birthday == null }");
            return p;
        }
    }

    /* renamed from: jlk$k */
    static final class k extends akcq implements akbk<ajdp<Boolean>> {
        k(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowGroupsItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowGroupsItem$identity_release()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            jlk jlk = (jlk) this.receiver;
            jkd jkd = (jkd) jlk.i.get();
            Object b = ajdp.a((Callable) new s(jkd)).b((ajdw) jkd.b().i());
            String str = "Observable\n             …eOn(schedulers.queries())";
            akcr.a(b, str);
            b = b.p(n.a);
            akcr.a(b, "friendsDataProvider.get(…pCount().map { it == 0L }");
            jkd jkd2 = (jkd) jlk.i.get();
            Object b2 = ajdp.a((Callable) new t(jkd2)).b((ajdw) jkd2.b().i());
            akcr.a(b2, str);
            b2 = b2.p(o.a);
            akcr.a(b2, "friendsDataProvider.get(…_FRIENDS_TO_SHOW_GROUPS }");
            b2 = ajwa.a(b, b2).p(p.a);
            akcr.a(b2, "Observables.combineLates…{ it.first && it.second }");
            return b2;
        }
    }

    /* renamed from: jlk$l */
    static final class l extends akcq implements akbk<ajdp<Boolean>> {
        l(jlk jlk) {
            super(0, jlk);
        }

        public final String getName() {
            return "shouldShowRegisterToVoteItem";
        }

        public final akej getOwner() {
            return akde.a(jlk.class);
        }

        public final String getSignature() {
            return "shouldShowRegisterToVoteItem$identity_release()Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke() {
            jlk jlk = (jlk) this.receiver;
            Object p = jlk.j.c().p(new r(jlk));
            akcr.a(p, "userAuthStore.observeUse…   ?: false\n            }");
            return p;
        }
    }

    static {
        a aVar = new a();
    }

    public jlk(zgb zgb, Context context, ftl ftl, tnj tnj, ajwy<jkd> ajwy, gpb gpb, iqm iqm) {
        akcr.b(zgb, "schedulerProvider");
        akcr.b(context, "context");
        akcr.b(ftl, "configProvider");
        akcr.b(tnj, "preferences");
        akcr.b(ajwy, "friendsDataProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(iqm, "contactApi");
        this.f = context;
        this.g = ftl;
        this.h = tnj;
        this.i = ajwy;
        this.j = gpb;
        this.k = iqm;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.a = ajwl;
        this.b = zgb.a(upp.h.callsite("UserIdentityItemProvider"));
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new ArrayList();
        this.o = new ajft();
        ajej d = this.g.p(jic.FORCE_SHOW_ALL_PROFILE_PROMPT).b((ajdw) this.b.h()).e().a((ajfl) 1.a).d((ajfb) new 2(this));
        akcr.a((Object) d, "configProvider.observeBo…apply()\n                }");
        ajvv.a(d, this.n);
        ajfp.a(this.o, this.g.p(jic.NEW_PROFILE_ACTIVITY_CARDS).b((ajdw) this.b.h()).u(new e(this)).l());
        this.n.a((ajej) this.o);
    }

    /* Access modifiers changed, original: final */
    public final void a(c cVar, akbk<? extends ajdp<Boolean>> akbk) {
        List list = this.e;
        Object p = this.g.p(cVar.hasSeenKey);
        akcr.a(p, "configProvider.observeBoolean(itemType.hasSeenKey)");
        Object p2 = this.g.p(cVar.hasDismissedKey);
        akcr.a(p2, "configProvider.observeBo…itemType.hasDismissedKey)");
        ajdp a = ajdp.a((ajdt) p, (ajdt) p2, (ajdt) (ajdp) akbk.invoke(), (ajfd) new d(cVar));
        if (a == null) {
            akcr.a();
        }
        Object j = a.j(ajfu.a);
        akcr.a(j, "Observables.combineLates…  .distinctUntilChanged()");
        list.add(j);
    }

    public final void dispose() {
        this.n.a();
    }

    public final boolean isDisposed() {
        return this.n.isDisposed();
    }
}
