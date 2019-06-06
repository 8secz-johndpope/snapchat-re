package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.ui.deck.MainPageFragment;
import defpackage.pqn.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: qvx */
public final class qvx implements gvn {
    final zjw a;
    final achb<zjm, zjk> b;
    final pqn c;
    final eyo d;
    private final List<String> e;

    /* renamed from: qvx$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ qvx a;
        private /* synthetic */ Uri b;

        a(qvx qvx, Uri uri) {
            this.a = qvx;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            zjw.a(this.a.a, qxo.a, false, null, null, 12);
            return ajxw.a;
        }
    }

    /* renamed from: qvx$b */
    static final class b<V> implements Callable<Object> {
        private /* synthetic */ qvx a;
        private /* synthetic */ pqh b;
        private /* synthetic */ pqf c;

        b(qvx qvx, pqh pqh, pqf pqf) {
            this.a = qvx;
            this.b = pqh;
            this.c = pqf;
        }

        public final Object call() {
            if (this.a.b.c) {
                if (akcr.a((zjm) this.a.b.h(), pql.a)) {
                    aciv i = this.a.b.i();
                    zjk zjk = i != null ? (zjk) i.d() : null;
                    if (!(zjk instanceof zjf)) {
                        zjk = null;
                    }
                    zjf zjf = (zjf) zjk;
                    MainPageFragment b = zjf != null ? zjf.c() : null;
                    if (!(b instanceof pqk)) {
                        b = null;
                    }
                    pqk pqk = (pqk) b;
                    if (pqk != null) {
                        pqh b2 = pqk.b();
                        if (b2 != null && b2.a == this.b.a) {
                            return ajvo.a(ajhn.a);
                        }
                    }
                }
                acig a = a.a(this.a.c, this.b, null, abbd.EXTERNAL, 2);
                acik acik = new acik(qxo.a);
                this.a.a.a((acig) acie.a.a(new acig[]{acik, a}, new pqj(this.b, this.c)));
                return ajxw.a;
            }
            zjw.a(this.a.a, pql.a, false, null, new pqj(this.b, this.c), 6);
            return ajxw.a;
        }
    }

    /* renamed from: qvx$c */
    static final class c<V> implements Callable<Object> {
        private /* synthetic */ qvx a;
        private /* synthetic */ pqh b;
        private /* synthetic */ pqf c = null;

        c(qvx qvx, pqh pqh) {
            this.a = qvx;
            this.b = pqh;
        }

        public final /* synthetic */ Object call() {
            this.a.a.a(qxo.a, false, a.a(this.a.c, this.b, null, null, 4), new pqj(this.b, null));
            return ajxw.a;
        }
    }

    /* renamed from: qvx$d */
    static final class d<V> implements Callable<Object> {
        private /* synthetic */ qvx a;
        private /* synthetic */ pqh b;
        private /* synthetic */ pqf c = null;

        d(qvx qvx, pqh pqh) {
            this.a = qvx;
            this.b = pqh;
        }

        public final /* synthetic */ Object call() {
            zjw zjw;
            acig acig;
            qvx qvx = this.a;
            pqh pqh = this.b;
            akcr.b(pqh, "chatContext");
            Object obj = (zjm) qvx.b.h();
            String str = "toChat";
            if (akcr.a(obj, pql.a)) {
                aciv i = qvx.b.i();
                zjk zjk = i != null ? (zjk) i.d() : null;
                if (!(zjk instanceof zjf)) {
                    zjk = null;
                }
                zjf zjf = (zjf) zjk;
                MainPageFragment b = zjf != null ? zjf.c() : null;
                if (!(b instanceof pqk)) {
                    b = null;
                }
                pqk pqk = (pqk) b;
                if (pqk != null) {
                    pqh b2 = pqk.b();
                    if (b2 != null) {
                        akcr.b(obj, "fromChatPageType");
                        akcr.b(b2, "fromChat");
                        akcr.b(pqh, str);
                        boolean a = akcr.a(obj, pql.a);
                        if (!ajxy.a || a) {
                            if (b2.a != pqh.a) {
                                List arrayList = new ArrayList();
                                for (Object next : qvx.b.g()) {
                                    Object obj2 = (aciv) next;
                                    akcr.a(obj2, "it");
                                    if ((akcr.a((zjm) obj2.e(), pql.a) ^ 1) != 0) {
                                        break;
                                    }
                                }
                                Object next2 = null;
                                aciv aciv = (aciv) next2;
                                if (aciv != null) {
                                    arrayList.add(new acin(aciv.f()));
                                }
                                arrayList.add(a.a(qvx.c, pqh, null, null, 6));
                                acih pqj = new pqj(pqh, null);
                                Object[] toArray = arrayList.toArray(new acig[0]);
                                if (toArray != null) {
                                    acig[] acigArr = (acig[]) toArray;
                                    acie a2 = acie.a.a((acig[]) Arrays.copyOf(acigArr, acigArr.length), pqj);
                                    zjw = qvx.a;
                                    acig = a2;
                                } else {
                                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                            return ajxw.a;
                        }
                        throw new AssertionError("Assertion failed");
                    }
                }
                Object[] objArr = new Object[]{Long.valueOf(pqh.a), pqh.b};
                return ajxw.a;
            }
            akcr.b(pqh, str);
            acig = a.a(qvx.c, pqh, null, null, 4);
            zjw = qvx.a;
            zjw.a(acig);
            return ajxw.a;
        }
    }

    /* renamed from: qvx$e */
    static final class e implements ajdb {
        private /* synthetic */ qvx a;
        private /* synthetic */ String b;
        private /* synthetic */ pqh c;
        private /* synthetic */ long d;

        e(qvx qvx, String str, pqh pqh, long j) {
            this.a = qvx;
            this.b = str;
            this.c = pqh;
            this.d = j;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            this.a.d.a(this.b, this.c.b, this.d);
        }
    }

    public qvx(zjw zjw, achb<zjm, zjk> achb, pqn pqn, eyo eyo) {
        akcr.b(zjw, "deepLinkNavigator");
        akcr.b(achb, "navigationHost");
        akcr.b(pqn, "chatLauncher");
        akcr.b(eyo, "cognacFragmentService");
        this.a = zjw;
        this.b = achb;
        this.c = pqn;
        this.d = eyo;
        Object of = ImmutableList.of("snapchat://notification/chat_on_friendsfeed/.*", "snapchat://notification/answer_audio_call/.*", "snapchat://notification/answer_video_call/.*", "snapchat://cognacNotification/cognac.*");
        akcr.a(of, "ImmutableList.of(\n      …FICATION_URI + \".*\"\n    )");
        this.e = (List) of;
    }

    public final List<String> a() {
        return this.e;
    }

    /* JADX WARNING: Missing block: B:7:0x002f, code skipped:
            if (r0.equals(r2) != false) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:9:0x0038, code skipped:
            if (r0.equals("chat_on_friendsfeed") != false) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:11:0x003f, code skipped:
            if (r0.equals(r3) != false) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:12:0x0041, code skipped:
            if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:13:0x0044, code skipped:
            r8 = r0.hashCode();
     */
    /* JADX WARNING: Missing block: B:14:0x004b, code skipped:
            if (r8 == -55508920) goto L_0x005c;
     */
    /* JADX WARNING: Missing block: B:16:0x0050, code skipped:
            if (r8 == 1072244419) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            if (r0.equals(r2) == false) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:19:0x0059, code skipped:
            r8 = defpackage.pqf.ANSWER_VIDEO_CALL;
     */
    /* JADX WARNING: Missing block: B:21:0x0060, code skipped:
            if (r0.equals(r3) == false) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:22:0x0062, code skipped:
            r8 = defpackage.pqf.ANSWER_AUDIO_CALL;
     */
    /* JADX WARNING: Missing block: B:23:0x0065, code skipped:
            r8 = null;
     */
    /* JADX WARNING: Missing block: B:24:0x0066, code skipped:
            r8 = defpackage.ajcx.b((java.util.concurrent.Callable) new defpackage.qvx.b(r7, r4, r8));
            r0 = "Completable.fromCallable…          }\n            }";
     */
    public final defpackage.ajcx c(android.net.Uri r8) {
        /*
        r7 = this;
        r0 = "uri";
        defpackage.akcr.b(r8, r0);
        r4 = defpackage.qvz.b(r8);
        if (r4 == 0) goto L_0x00d1;
    L_0x000b:
        r0 = r8.getPathSegments();
        r1 = "uri.pathSegments";
        defpackage.akcr.a(r0, r1);
        r0 = defpackage.ajyu.g(r0);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        goto L_0x00c8;
    L_0x001e:
        r1 = r0.hashCode();
        r2 = "answer_video_call";
        r3 = "answer_audio_call";
        switch(r1) {
            case -1354993227: goto L_0x0077;
            case -55508920: goto L_0x003b;
            case 490713626: goto L_0x0032;
            case 1072244419: goto L_0x002b;
            default: goto L_0x0029;
        };
    L_0x0029:
        goto L_0x00c8;
    L_0x002b:
        r8 = r0.equals(r2);
        if (r8 == 0) goto L_0x00c8;
    L_0x0031:
        goto L_0x0041;
    L_0x0032:
        r8 = "chat_on_friendsfeed";
        r8 = r0.equals(r8);
        if (r8 == 0) goto L_0x00c8;
    L_0x003a:
        goto L_0x0041;
    L_0x003b:
        r8 = r0.equals(r3);
        if (r8 == 0) goto L_0x00c8;
    L_0x0041:
        if (r0 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0065;
    L_0x0044:
        r8 = r0.hashCode();
        r1 = -55508920; // 0xfffffffffcb10048 float:-7.352338E36 double:NaN;
        if (r8 == r1) goto L_0x005c;
    L_0x004d:
        r1 = 1072244419; // 0x3fe926c3 float:1.8214954 double:5.297591314E-315;
        if (r8 == r1) goto L_0x0053;
    L_0x0052:
        goto L_0x0065;
    L_0x0053:
        r8 = r0.equals(r2);
        if (r8 == 0) goto L_0x0065;
    L_0x0059:
        r8 = defpackage.pqf.ANSWER_VIDEO_CALL;
        goto L_0x0066;
    L_0x005c:
        r8 = r0.equals(r3);
        if (r8 == 0) goto L_0x0065;
    L_0x0062:
        r8 = defpackage.pqf.ANSWER_AUDIO_CALL;
        goto L_0x0066;
    L_0x0065:
        r8 = 0;
    L_0x0066:
        r0 = new qvx$b;
        r0.<init>(r7, r4, r8);
        r0 = (java.util.concurrent.Callable) r0;
        r8 = defpackage.ajcx.b(r0);
        r0 = "Completable.fromCallable…          }\n            }";
    L_0x0073:
        defpackage.akcr.a(r8, r0);
        return r8;
    L_0x0077:
        r1 = "cognac";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00c8;
    L_0x007f:
        r0 = "cognac_sent_timestamp";
        r0 = r8.getQueryParameter(r0);
        r1 = "uri.getQueryParameter(Co…C_NOTIFICATION_TIMESTAMP)";
        defpackage.akcr.a(r0, r1);
        r5 = java.lang.Long.parseLong(r0);
        r0 = "cognac_payload";
        r3 = r8.getQueryParameter(r0);
        r8 = r7.b;
        r8 = r8.c;
        if (r8 == 0) goto L_0x00a8;
    L_0x009a:
        r8 = new qvx$d;
        r8.<init>(r7, r4);
        r8 = (java.util.concurrent.Callable) r8;
        r8 = defpackage.ajcx.b(r8);
        r0 = "Completable.fromCallable…xt, action)\n            }";
        goto L_0x00b5;
    L_0x00a8:
        r8 = new qvx$c;
        r8.<init>(r7, r4);
        r8 = (java.util.concurrent.Callable) r8;
        r8 = defpackage.ajcx.b(r8);
        r0 = "Completable.fromCallable…t, action))\n            }";
    L_0x00b5:
        defpackage.akcr.a(r8, r0);
        r0 = new qvx$e;
        r1 = r0;
        r2 = r7;
        r1.<init>(r2, r3, r4, r5);
        r0 = (defpackage.ajdb) r0;
        r8 = r8.b(r0);
        r0 = "handleChatUri(chatContex…ationId, sentTimestamp) }";
        goto L_0x0073;
    L_0x00c8:
        r8 = defpackage.ajhn.a;
        r8 = defpackage.ajvo.a(r8);
        r0 = "Completable.complete().a…=$uri\")\n                }";
        goto L_0x0073;
    L_0x00d1:
        r0 = new qvx$a;
        r0.<init>(r7, r8);
        r0 = (java.util.concurrent.Callable) r0;
        r8 = defpackage.ajcx.b(r0);
        r0 = "Completable.fromCallable…YPE, false)\n            }";
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvx.c(android.net.Uri):ajcx");
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
