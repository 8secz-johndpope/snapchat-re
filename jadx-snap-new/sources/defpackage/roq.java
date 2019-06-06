package defpackage;

import android.net.NetworkInfo;
import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Optional;
import com.snap.core.model.FriendMessageRecipient;
import com.snap.core.model.GroupMessageRecipient;
import com.snap.messaging.talk.TalkHttpInterface;
import defpackage.psm.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: roq */
public final class roq implements abji, prr {
    final ajxe a;
    final ajxe b;
    abjh c;
    final aipn<psm> d;
    final rpb e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final igw i;
    private final boolean j = false;
    private final aipn<pwc> k;
    private final aipn<pqt> l;
    private final ajdx<TalkHttpInterface> m;
    private final ajei n;

    /* renamed from: roq$a */
    static final class a extends akcq implements akbk<pwg> {
        a(ajwy ajwy) {
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
            return (pwg) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: roq$c */
    static final class c extends akcq implements akbk<rrv> {
        c(ajwy ajwy) {
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
            return (rrv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: roq$j */
    static final class j extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ acbn b;

        j(zgb zgb, acbn acbn) {
            this.a = zgb;
            this.b = acbn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("ChatTransportServices"));
        }
    }

    /* renamed from: roq$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ aipn a;

        b(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "userAuthLazy.get()");
            String b = ((gpb) obj).b();
            if (b == null) {
                akcr.a();
            }
            return b;
        }
    }

    /* renamed from: roq$d */
    static final class d extends akcs implements akbk<rpf> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rpf) this.a.get();
        }
    }

    /* renamed from: roq$1 */
    static final class 1<T> implements ajfb<Optional<NetworkInfo>> {
        private /* synthetic */ roq a;

        1(roq roq) {
            this.a = roq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            abjh abjh = this.a.c;
            if (abjh != null) {
                boolean z;
                akcr.a(obj, "it");
                if (obj.isPresent()) {
                    obj = obj.get();
                    akcr.a(obj, "it.get()");
                    if (((NetworkInfo) obj).isConnected()) {
                        z = true;
                        abjh.a(z);
                    }
                }
                z = false;
                abjh.a(z);
            }
        }
    }

    /* renamed from: roq$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ roq a;
        private /* synthetic */ aesm b;

        e(roq roq, aesm aesm) {
            this.a = roq;
            this.b = aesm;
        }

        public final /* synthetic */ Object call() {
            pwg pwg = (pwg) this.a.a.b();
            aesm aesm = this.b;
            if (aesm != null) {
                return Boolean.valueOf(pwg.b((aeie) aesm));
            }
            throw new ajxt("null cannot be cast to non-null type com.snapchat.soju.android.ConversationMessage");
        }
    }

    /* renamed from: roq$f */
    static final class f<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ roq a;
        private /* synthetic */ aesm b;

        f(roq roq, aesm aesm) {
            this.a = roq;
            this.b = aesm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.e.a().h();
        }
    }

    /* renamed from: roq$h */
    static final class h<T> implements ajfl<Boolean> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: roq$k */
    public static final class k<T, R> implements ajfc<T, R> {
        private /* synthetic */ roq a;
        private /* synthetic */ abjb b;

        public k(roq roq, abjb abjb) {
            this.a = roq;
            this.b = abjb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqv pqv = (pqv) obj;
            akcr.b(pqv, "it");
            rpf b = ((rpf) this.a.h.b());
            Object b2 = this.b.b();
            akcr.a(b2, "callRequest.talkCorePayload");
            akcr.b(pqv, "conversation");
            akcr.b(b2, "talkCorePayload");
            afgh afgh = (afgh) b.a(akde.a(afgh.class), pqv, pqv.b(b.a()));
            afgh.a = b2;
            return afgh;
        }
    }

    /* renamed from: roq$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ roq a;
        private /* synthetic */ abjb b;

        n(roq roq, abjb abjb) {
            this.a = roq;
            this.b = abjb;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (com.snap.messaging.talk.TalkHttpInterface) r6;
            r0 = "api";
            defpackage.akcr.b(r6, r0);
            r0 = new afdd;
            r0.<init>();
            r1 = r5.b;
            r1 = r1.a();
            r0.a = r1;
            r1 = r5.b;
            r1 = r1.c();
            r2 = 2;
            r3 = 1;
            if (r1 != 0) goto L_0x001f;
        L_0x001e:
            goto L_0x0034;
        L_0x001f:
            r4 = defpackage.ror.a;
            r1 = r1.ordinal();
            r1 = r4[r1];
            if (r1 == r3) goto L_0x003d;
        L_0x0029:
            if (r1 == r2) goto L_0x003a;
        L_0x002b:
            r4 = 3;
            if (r1 == r4) goto L_0x003a;
        L_0x002e:
            r4 = 4;
            if (r1 == r4) goto L_0x0037;
        L_0x0031:
            r4 = 5;
            if (r1 == r4) goto L_0x0037;
        L_0x0034:
            r1 = defpackage.afdd.a.UNRECOGNIZED_VALUE;
            goto L_0x003f;
        L_0x0037:
            r1 = defpackage.afdd.a.CALL_UPDATED;
            goto L_0x003f;
        L_0x003a:
            r1 = defpackage.afdd.a.ABANDONED;
            goto L_0x003f;
        L_0x003d:
            r1 = defpackage.afdd.a.INITIATED;
        L_0x003f:
            r1 = r1.a();
            r0.b = r1;
            r1 = r5.b;
            r1 = r1.d();
            r4 = "callRequest.callingMedia";
            defpackage.akcr.a(r1, r4);
            r4 = defpackage.ror.b;
            r1 = r1.ordinal();
            r1 = r4[r1];
            if (r1 == r3) goto L_0x0062;
        L_0x005a:
            if (r1 == r2) goto L_0x005f;
        L_0x005c:
            r1 = defpackage.afdd.b.UNRECOGNIZED_VALUE;
            goto L_0x0064;
        L_0x005f:
            r1 = defpackage.afdd.b.VIDEO;
            goto L_0x0064;
        L_0x0062:
            r1 = defpackage.afdd.b.AUDIO;
        L_0x0064:
            r1 = r1.a();
            r0.c = r1;
            r1 = r5.b;
            r1 = r1.b();
            r0.d = r1;
            r6 = r6.sendCallingRequest(r0);
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.roq$n.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: roq$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            afdf afdf = (afdf) obj;
            akcr.b(afdf, "it");
            return afdf.a;
        }
    }

    /* renamed from: roq$p */
    static final class p<T, R> implements ajfc<T, R> {
        private /* synthetic */ roq a;
        private /* synthetic */ abja b;
        private /* synthetic */ abjc c;

        p(roq roq, abja abja, abjc abjc) {
            this.a = roq;
            this.b = abja;
            this.c = abjc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aesq aesq;
            pqv pqv = (pqv) obj;
            akcr.b(pqv, "conversation");
            if (this.b == abja.CALL_JOINED) {
                aesq = aesq.JOINED_CALL;
            } else if (this.b == abja.CALL_LEFT) {
                aesq = aesq.LEFT_CALL;
            } else if (this.b == abja.MISSED && this.c == abjc.AUDIO) {
                aesq = aesq.MISSED_AUDIO_CALL;
            } else if (this.b == abja.MISSED && this.c == abjc.VIDEO) {
                aesq = aesq.MISSED_VIDEO_CALL;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Invalid input - callAction: ");
                stringBuilder.append(this.b);
                stringBuilder.append(" callingMedia: ");
                stringBuilder.append(this.c);
                throw new IllegalStateException(stringBuilder.toString());
            }
            List b = pqv.b(((String) this.a.g.b()));
            Object a = aesq.a();
            akcr.a(a, "type.value()");
            return ajxs.a(new ptn(a, pqv.c, ((String) this.a.g.b()), b), ajyl.a(pqv.c ? new GroupMessageRecipient(pqv.a) : new FriendMessageRecipient(pqv.a)));
        }
    }

    /* renamed from: roq$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ roq a;

        q(roq roq) {
            this.a = roq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return a.a((psm) this.a.d.get(), (List) ajxm.b, (ptn) ajxm.a, new pth(gcn.CHAT, null, null, 0, null, null, null, 16382), null, 24);
        }
    }

    /* renamed from: roq$s */
    public static final class s<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final s a = new s();

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (aeie) ajxm.a;
            pqs pqs = (pqs) ajxm.b;
            akcr.a(obj2, ErrorFields.MESSAGE);
            return pqs.a(obj2);
        }
    }

    /* renamed from: roq$u */
    public static final class u<T, R> implements ajfc<T, R> {
        private /* synthetic */ roq a;
        private /* synthetic */ List b;
        private /* synthetic */ Map c;
        private /* synthetic */ Map d;
        private /* synthetic */ Map e;

        public u(roq roq, List list, Map map, Map map2, Map map3) {
            this.a = roq;
            this.b = list;
            this.c = map;
            this.d = map2;
            this.e = map3;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqv pqv = (pqv) obj;
            akcr.b(pqv, "it");
            Collection arrayList = new ArrayList();
            for (Object next : this.b) {
                if ((akcr.a((String) next, ((String) this.a.g.b())) ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            rpf b = ((rpf) this.a.h.b());
            Map map = this.c;
            Map map2 = this.d;
            Map map3 = this.e;
            akcr.b(pqv, "conversation");
            akcr.b(list, "recipients");
            akcr.b(map, "legacyPresences");
            akcr.b(map2, "extendedPresences");
            akcr.b(map3, "presencesMetadata");
            aeuw aeuw = (aeuw) b.a(akde.a(aeuw.class), pqv, list);
            aeuw.f = map3;
            aeuw.a = map;
            if (map2.get(b.a()) != null) {
                aeuw.e = map2;
            } else {
                acbm.a c = acbm.b().c();
                new StringBuilder("Not sending extended presences as the sender is not included: ").append(map2);
                c.a("TalkMessageFactory");
            }
            return aeuw;
        }
    }

    /* renamed from: roq$g */
    static final class g extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ abjh a;
        private /* synthetic */ roq b;
        private /* synthetic */ aesm c;

        g(abjh abjh, roq roq, aesm aesm) {
            this.a = abjh;
            this.b = roq;
            this.c = aesm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Boolean) obj;
            aesm aesm = this.c;
            if (aesm instanceof aeuw) {
                this.a.a((abjf) new rpe((aeuw) aesm));
            } else if (aesm instanceof afgh) {
                boolean z;
                boolean b = ((rrv) this.b.b.b()).b();
                abjh abjh = this.a;
                abjb rom = new rom((afgh) this.c);
                String str = ((afgh) this.c).i.a;
                if (b) {
                    akcr.a(obj, "isLockScreenEnabled");
                    if (obj.booleanValue()) {
                        z = true;
                        abjh.a(rom, str, z);
                    }
                }
                z = false;
                abjh.a(rom, str, z);
            }
            return ajxw.a;
        }
    }

    /* renamed from: roq$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            acbm.a(th).a("ChatTransportServices");
            return ajxw.a;
        }
    }

    /* renamed from: roq$l */
    static final class l extends akcs implements akbl<List<? extends String>, ajxw> {
        private /* synthetic */ roq a;
        private /* synthetic */ abjb b;

        l(roq roq, abjb abjb) {
            this.a = roq;
            this.b = abjb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "incompatibleRecipients");
            if ((list.isEmpty() ^ 1) != 0 && this.b.c() == abja.START) {
                new Object[1][0] = list;
                abjh abjh = this.a.c;
                if (abjh != null) {
                    abjh.a(this.b.a(), list);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: roq$m */
    static final class m extends akcs implements akbl<Throwable, ajxw> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            acbm.a(th).a("ChatTransportServices");
            return ajxw.a;
        }
    }

    /* renamed from: roq$r */
    static final class r extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ String a;

        r(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            acbm.a a = acbm.a(th);
            new StringBuilder("Error sending call status message to conversation: ").append(this.a);
            a.a("ChatTransportServices");
            return ajxw.a;
        }
    }

    /* renamed from: roq$t */
    public static final class t extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ String a;

        public t(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            acbm.a a = acbm.a(th);
            new StringBuilder("Error sending non durable message to conversation: ").append(this.a);
            a.a("ChatTransportServices");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(roq.class), "qualifiedSchedulers", "getQualifiedSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(roq.class), "localUsername", "getLocalUsername()Ljava/lang/String;"), new akdc(akde.a(roq.class), "messageFactory", "getMessageFactory()Lcom/snap/messaging/talk/binding/TalkMessageFactory;"), new akdc(akde.a(roq.class), "incomingMessageHandler", "getIncomingMessageHandler()Lcom/snap/messaging/chat/conversation/IncomingMessageHandler;"), new akdc(akde.a(roq.class), "lockScreenController", "getLockScreenController()Lcom/snap/messaging/talk/notifications/LockScreenNotificationController;")};
    }

    public roq(aipn<pwc> aipn, aipn<psm> aipn2, aipn<pqt> aipn3, rpb rpb, ajdx<TalkHttpInterface> ajdx, ajei ajei, aipn<gpb> aipn4, aipn<rpf> aipn5, aipn<ifa> aipn6, acbn acbn, zgb zgb, ajwy<pwg> ajwy, ajwy<rrv> ajwy2) {
        akcr.b(aipn, "conversationManager");
        akcr.b(aipn2, "sendMessageApi");
        akcr.b(aipn3, "chatSessionController");
        akcr.b(rpb, "talkExperiments");
        akcr.b(ajdx, "talkHttpInterface");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(aipn4, "userAuthLazy");
        akcr.b(aipn5, "messageFactoryLazy");
        akcr.b(aipn6, "networkStatusManager");
        akcr.b(acbn, "feature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "incomingMessageHandlerProvider");
        akcr.b(ajwy2, "lockScreenControllerProvider");
        this.k = aipn;
        this.d = aipn2;
        this.l = aipn3;
        this.e = rpb;
        this.m = ajdx;
        this.n = ajei;
        this.f = ajxh.a(new j(zgb, acbn));
        this.g = ajxh.a(new b(aipn4));
        this.h = ajxh.a(new d(aipn5));
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new c(ajwy2));
        igw igw = new igw();
        ajvv.a((ajej) igw, this.n);
        this.i = igw;
        ajej f = ((ifa) aipn6.get()).e().f((ajfb) new 1(this));
        akcr.a((Object) f, "networkStatusManager.get…nected)\n                }");
        ajvv.a(f, this.n);
    }

    private final ajdx<pqv> a(String str) {
        Object b = ((pwc) this.k.get()).a(str, akgc.a((CharSequence) str, (CharSequence) "~", false) ^ 1).b((ajdw) a().f());
        akcr.a(b, "conversationManager.get(…qualifiedSchedulers.io())");
        return b;
    }

    private final zfw a() {
        return (zfw) this.f.b();
    }

    public final void a(abjb abjb) {
        akcr.b(abjb, "callRequest");
        String a = abjb.a();
        akcr.a((Object) a, "callRequest.convoId");
        Object f = a(a).f(new k(this, abjb));
        akcr.a(f, "getConversation(conversa…map { createMessage(it) }");
        ajdx a2 = ajwd.a(f, ((pqt) this.l.get()).a()).a((ajdw) a().g()).a((ajfc) s.a);
        akcr.a((Object) a2, "getConversation(conversa…atSession.send(message) }");
        igk.a(ajwe.a(a2, (akbl) new t(a), null, 2), this.i);
        if (abjb.c() != null) {
            ajdx b = this.m.a((ajfc) new n(this, abjb)).f(o.a).b((ajdw) a().g());
            akcr.a((Object) b, "talkHttpInterface\n      …fiedSchedulers.network())");
            igk.a(ajwe.a(b, (akbl) m.a, (akbl) new l(this, abjb)), this.i);
        }
    }

    public final void a(abjh abjh) {
        this.c = abjh;
    }

    public final void a(aesm aesm) {
        akcr.b(aesm, ErrorFields.MESSAGE);
        Object obj = ((aesm instanceof aeuw) || (aesm instanceof afgh)) ? 1 : null;
        if (obj == null) {
            new StringBuilder("Non talk message received: ").append(aesm.o);
            return;
        }
        abjh abjh = this.c;
        if (abjh != null) {
            ajdj b = ajdx.c((Callable) new e(this, aesm)).a((ajfl) h.a).a((ajfc) new f(this, aesm)).b((ajdw) a().i());
            akcr.a((Object) b, "Single.fromCallable {\n  …fiedSchedulers.queries())");
            ajwe.a(b, (akbl) i.a, ajwe.a, (akbl) new g(abjh, this, aesm));
        }
    }

    public final void a(String str, abja abja, abjc abjc) {
        akcr.b(str, "conversationId");
        akcr.b(abja, "callAction");
        akcr.b(abjc, "callingMedia");
        ajdx a = a(str).f(new p(this, abja, abjc)).a((ajfc) new q(this));
        akcr.a((Object) a, "getConversation(conversa…urce.CHAT))\n            }");
        igk.a(ajwe.a(a, (akbl) new r(str), null, 2), this.i);
    }

    public final void a(String str, abjc abjc) {
        akcr.b(str, "conversationId");
        akcr.b(abjc, "media");
    }

    public final void a(String str, List<String> list, Map<String, Boolean> map, Map<String, Integer> map2, Map<String, ? extends List<String>> map3) {
        akcr.b(str, "conversationId");
        akcr.b(list, "recipients");
        akcr.b(map, "legacyPresences");
        akcr.b(map2, "extendedPresences");
        akcr.b(map3, "presencesMetadata");
        Object f = a(str).f(new u(this, list, map, map2, map3));
        akcr.a(f, "getConversation(conversa…map { createMessage(it) }");
        ajdx a = ajwd.a(f, ((pqt) this.l.get()).a()).a((ajdw) a().g()).a((ajfc) s.a);
        akcr.a((Object) a, "getConversation(conversa…atSession.send(message) }");
        igk.a(ajwe.a(a, (akbl) new t(str), null, 2), this.i);
    }
}
