package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.record.ChatAttachmentsModel;
import defpackage.adpm.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: adpl */
public class adpl<T extends aeie> {
    private final String a = "MessageProcessor";
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private final ihh f;
    private final gpb g;
    private final ajwy<qvo> h;

    /* renamed from: adpl$d */
    static final class d extends akcq implements akbk<qvd> {
        d(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qvd) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpl$c */
    static final class c extends akcq implements akbk<iqx> {
        c(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iqx) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpl$a */
    static final class a extends akcq implements akbk<quk> {
        a(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (quk) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: adpl$b */
    static final class b extends akcq implements akbk<qup> {
        b(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (qup) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(adpl.class), "messagingRepository", "getMessagingRepository()Lcom/snap/messaging/db/MessagingRepository;"), new akdc(akde.a(adpl.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(adpl.class), "conversationsRepository", "getConversationsRepository()Lcom/snap/messaging/db/ConversationsRepository;"), new akdc(akde.a(adpl.class), "dbLogger", "getDbLogger()Lcom/snap/messaging/db/FriendsFeedSnapDbLogger;")};
    }

    public adpl(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqx> aipn3, aipn<qup> aipn4, ajwy<qvo> ajwy) {
        akcr.b(ihh, "clock");
        akcr.b(gpb, "userAuth");
        akcr.b(aipn, "messagingRepositoryLazy");
        akcr.b(aipn2, "conversationsRepositoryLazy");
        akcr.b(aipn3, "friendRepositoryLazy");
        akcr.b(aipn4, "friendsFeedSnapDbLoggerLazy");
        akcr.b(ajwy, "sequenceNumberRepository");
        this.f = ihh;
        this.g = gpb;
        this.h = ajwy;
        this.b = ajxh.a(new d(aipn));
        this.c = ajxh.a(new c(aipn3));
        this.d = ajxh.a(new a(aipn2));
        this.e = ajxh.a(new b(aipn4));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x00ce in {7, 8, 9, 10, 14, 18, 24, 26, 31, 33, 35, 37} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final defpackage.adpm.a a(com.snap.core.db.api.DbTransaction r14, defpackage.adph<? extends T> r15) {
        /*
        r13 = this;
        r0 = r13.a();
        r1 = r15.a;
        r0 = r0.f(r1);
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0080;
        r0 = r15.d;
        r0 = r0.i;
        r0 = r0.b;
        if (r0 == 0) goto L_0x005b;
        r0 = (java.util.Collection) r0;
        r1 = r15.d;
        r1 = r1.i;
        r1 = r1.a;
        r0 = defpackage.ajyu.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0052;
        r4 = r0.next();
        r4 = (java.lang.String) r4;
        r5 = r13.c();
        r6 = "it";
        defpackage.akcr.a(r4, r6);
        r4 = r5.f(r4);
        r4 = java.lang.Long.valueOf(r4);
        r1.add(r4);
        goto L_0x0031;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = defpackage.ajyu.m(r1);
        goto L_0x005c;
        r0 = 0;
        r7 = r0;
        r4 = r13.b();
        r6 = r15.a;
        r0 = r15.d;
        r0 = r0.n;
        r1 = "message.message.timestamp";
        defpackage.akcr.a(r0, r1);
        r8 = r0.longValue();
        r10 = 0;
        r11 = 0;
        r12 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r5 = r14;
        r0 = defpackage.quk.a(r4, r5, r6, r7, r8, r10, r11, r12);
        r4 = r13.a();
        r4.j(r0);
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x008a;
        r14 = new adpm$a;
        r14.<init>();
        return r14;
        r4 = r13.c();
        r5 = r15.c;
        r6 = "message.senderUsername";
        defpackage.akcr.a(r5, r6);
        r10 = r4.f(r5);
        r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x00a3;
        r14 = new adpm$a;
        r14.<init>();
        return r14;
        r2 = r15.d;
        r13.a(r2);
        r2 = r15.b;
        if (r2 == 0) goto L_0x00b7;
        r5 = r13;
        r6 = r14;
        r7 = r15;
        r8 = r0;
        r14 = r5.a(r6, r7, r8, r10);	 Catch:{ all -> 0x00b5 }
        goto L_0x00c4;
        r14 = move-exception;
        throw r14;
        r2 = r15.d;	 Catch:{ all -> 0x00cc }
        r13.a(r0, r2, r14);	 Catch:{ all -> 0x00cc }
        r5 = r13;
        r6 = r14;
        r7 = r15;
        r8 = r0;
        r14 = r5.b(r6, r7, r8, r10);	 Catch:{ all -> 0x00ca }
        r2 = new adpm$a;
        r2.<init>(r0, r14);
        return r2;
        r14 = move-exception;
        throw r14;
        r14 = move-exception;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpl.a(com.snap.core.db.api.DbTransaction, adph):adpm$a");
    }

    private final void a(long j, aeie aeie, DbTransaction dbTransaction) {
        if ((aeie instanceof aegj) || adox.b(aeie)) {
            Object obj = null;
            Map map = aeie.k;
            if (map != null) {
                Collection arrayList = new ArrayList(map.size());
                for (Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    akcr.a(key, "it.key");
                    arrayList.add(new qvq(j, (String) key, (Long) entry.getValue(), null, 120));
                }
                ((qvo) this.h.get()).a((Collection) (List) arrayList, dbTransaction);
                obj = 1;
            }
            if (obj == null) {
                Object obj2 = aeie.i.a;
                long c = adox.c(aeie);
                qvo qvo = (qvo) this.h.get();
                akcr.a(obj2, ChatAttachmentsModel.SENDERUSERNAME);
                qvo.a((Collection) ajyl.a(new qvq(j, obj2, Long.valueOf(c), null, 120)), dbTransaction);
            }
        }
    }

    private final void a(aeie aeie) {
        if (aeie instanceof aeyr) {
            long m = a().m(((aeyr) aeie).a);
            long a = this.f.a();
            aeyr aeyr = (aeyr) aeie;
            Object obj = aeyr.n;
            akcr.a(obj, "timestamp");
            long longValue = obj.longValue();
            if (m > longValue || a < longValue) {
                aeyr.n = Long.valueOf(a);
            }
        }
    }

    private iqx c() {
        return (iqx) this.c.b();
    }

    public long a(DbTransaction dbTransaction, adpd<? extends T> adpd, long j) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return -1;
    }

    public long a(DbTransaction dbTransaction, adpd<? extends T> adpd, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adpd, ErrorFields.MESSAGE);
        return -1;
    }

    public long a(DbTransaction dbTransaction, adph<? extends T> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return -1;
    }

    public final a a(DbTransaction dbTransaction, T t) {
        DbTransaction dbTransaction2 = dbTransaction;
        T t2 = t;
        akcr.b(dbTransaction2, "tx");
        akcr.b(t2, ErrorFields.MESSAGE);
        String str = this.g.a().b;
        String str2 = this.g.a().a;
        if (str == null || str2 == null) {
            return new a();
        }
        if (adox.b((aeie) t)) {
            return a(dbTransaction2, new adph(t2, str, str2));
        }
        adpd adpd = new adpd(t2, str);
        long a = quk.a(b(), adpd.c, null, null, false, 14);
        if (a == -1) {
            return new a();
        }
        iqx c = c();
        Object obj = adpd.b;
        akcr.a(obj, "message.senderUsername");
        long f = c.f(obj);
        if (f == -1) {
            return new a();
        }
        long a2;
        a(adpd.d);
        if (adpd.a) {
            a2 = a(dbTransaction2, adpd, f);
        } else {
            if (adpd.d instanceof aegj) {
                a(a, adpd.d, dbTransaction2);
            } else {
                aeie aeie = adpd.d;
                obj = (adox.b(aeie) || (aeie instanceof aegj)) ? null : 1;
                if (obj != null) {
                    String str3 = aeie.i.a;
                    akcr.a((Object) str3, "message.header.from");
                    ((qvo) this.h.get()).a((Collection) ajyl.a(new qvq(a, str3, null, aeie.m, 60)), dbTransaction2);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            a2 = a(dbTransaction, adpd, a, f);
        }
        return new a(a, a2);
    }

    /* Access modifiers changed, original: protected|final */
    public final qvd a() {
        return (qvd) this.b.b();
    }

    public long b(DbTransaction dbTransaction, adph<? extends T> adph, long j, long j2) {
        akcr.b(dbTransaction, "tx");
        akcr.b(adph, ErrorFields.MESSAGE);
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final quk b() {
        return (quk) this.d.b();
    }
}
