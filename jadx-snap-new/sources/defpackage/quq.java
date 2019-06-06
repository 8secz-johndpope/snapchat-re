package defpackage;

import com.brightcove.player.event.EventType;
import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.StoryNoteModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: quq */
public final class quq implements AllUpdatesProcessor {
    public final idd a = pry.a.callsite("GroupConversationProcessor");
    public final DbClient b = this.m.getDbClient(this.a);
    public final ConcurrentHashMap<String, a> c = new ConcurrentHashMap();
    boolean d;
    final pru e;
    final qvd f;
    public final quk g;
    public final ajwy<qux> h;
    public final ajwy<gqr> i;
    public final ajwy<qvo> j;
    private final zfw k = zgb.a(this.a);
    private final ajxe l;
    private final SnapDb m;
    private final adpm n;
    private final qum o;
    private final gpb p;
    private final qup q;
    private final ajwy<ftl> r;
    private final ajei s;

    /* renamed from: quq$c */
    static final class c extends akcs implements akbk<iqx> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqx) this.a.get();
        }
    }

    /* renamed from: quq$1 */
    static final class 1<T, R> implements ajfc<T, R> {
        private /* synthetic */ quq a;

        1(quq quq) {
            this.a = quq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            this.a.d = bool.booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: quq$f */
    public static final class f extends akcs implements akbl<DbTransaction, List<? extends psl>> {
        private /* synthetic */ quq a;
        private /* synthetic */ List b;

        public f(quq quq, List list) {
            this.a = quq;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object next;
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            Collection arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                ahaz ahaz = (ahaz) next;
                if (ahaz.a() == ahbc.FULL || ahaz.a() == ahbc.DELTA) {
                    obj2 = 1;
                }
                if (obj2 != null) {
                    arrayList.add(next);
                }
            }
            Collection arrayList2 = new ArrayList();
            for (Object next2 : (List) arrayList) {
                if ((((ahaz) next2).H != null ? 1 : null) != null) {
                    arrayList2.add(next2);
                }
            }
            Iterable<ahaz> iterable = (List) arrayList2;
            arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ahaz ahaz2 : iterable) {
                Set linkedHashSet = new LinkedHashSet();
                for (Entry entry : ahaz2.H.entrySet()) {
                    Object obj3 = (String) entry.getKey();
                    Map map = (Map) entry.getValue();
                    akcr.a(obj3, StoryNoteModel.VIEWER);
                    linkedHashSet.add(obj3);
                    linkedHashSet.addAll(map.keySet());
                }
                arrayList.add(new psl(this.a.f.a(ahaz2, dbTransaction), ahaz2, this.a.a().a((Collection) ajyu.k(linkedHashSet))));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: quq$g */
    public static final class g<T, R> implements ajfc<List<? extends psl>, ajdb> {
        private /* synthetic */ quq a;

        public g(quq quq) {
            this.a = quq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.e.a(list);
        }
    }

    /* renamed from: quq$d */
    public static final class d extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ quq a;
        private /* synthetic */ List b;

        public d(quq quq, List list) {
            this.a = quq;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            Collection arrayList = new ArrayList();
            for (Object next : this.b) {
                if (akcr.a(((ahaz) next).m, ahbc.NONE.a())) {
                    arrayList.add(next);
                }
            }
            Iterator it = ((List) arrayList).iterator();
            while (it.hasNext()) {
                String str;
                qvq qvq;
                Iterator it2;
                ahaz ahaz = (ahaz) it.next();
                quk quk = this.a.g;
                String str2 = ahaz.a;
                akcr.a((Object) str2, "group.mischiefId");
                long b = quk.b(str2);
                Map linkedHashMap = new LinkedHashMap();
                Object obj2 = ahaz.i;
                akcr.a(obj2, "group.latestSequenceNumbers");
                Iterator it3 = obj2.entrySet().iterator();
                while (true) {
                    str = "username";
                    if (!it3.hasNext()) {
                        break;
                    }
                    Long l;
                    qvq qvq2;
                    Entry entry = (Entry) it3.next();
                    String str3 = (String) entry.getKey();
                    Long l2 = (Long) entry.getValue();
                    akcr.a((Object) str3, str);
                    qvq = linkedHashMap.get(str3);
                    if (qvq == null) {
                        l = l2;
                        it2 = it;
                        String str4 = str3;
                        qvq = new qvq(b, str3, null, null, 124);
                        linkedHashMap.put(str4, qvq);
                    } else {
                        it2 = it;
                        l = l2;
                        qvq2 = qvq;
                    }
                    qvq2.e = l;
                    it = it2;
                }
                it2 = it;
                Object obj3 = ahaz.v;
                akcr.a(obj3, "group.earliestSequenceNumbers");
                it = obj3.entrySet().iterator();
                while (it.hasNext()) {
                    Iterator it4;
                    Entry entry2 = (Entry) it.next();
                    String str5 = (String) entry2.getKey();
                    Long l3 = (Long) entry2.getValue();
                    akcr.a((Object) str5, str);
                    obj2 = linkedHashMap.get(str5);
                    if (obj2 == null) {
                        it4 = it;
                        obj3 = qvq;
                        qvq = new qvq(b, str5, null, null, 124);
                        linkedHashMap.put(str5, obj3);
                    } else {
                        it4 = it;
                        obj3 = obj2;
                    }
                    ((qvq) obj3).f = l3;
                    it = it4;
                }
                ((qvo) this.a.j.get()).a(linkedHashMap.values(), dbTransaction);
                it = it2;
            }
            return ajxw.a;
        }
    }

    /* renamed from: quq$a */
    static final class a {
        final long a;
        final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* renamed from: quq$b */
    public static final class b {
        final Map<String, Long> a;
        final Map<String, Long> b;

        public b(Map<String, Long> map, Map<String, Long> map2) {
            akcr.b(map, "earliestSequenceNumbers");
            akcr.b(map2, "latestSequenceNumber");
            this.a = map;
            this.b = map2;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.quq.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.quq.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.quq$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Map map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Map map2 = this.b;
            if (map2 != null) {
                i = map2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ProcessedMessagesInfo(earliestSequenceNumbers=");
            stringBuilder.append(this.a);
            stringBuilder.append(", latestSequenceNumber=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: quq$e */
    static final class e extends akcs implements akbl<String, akbk<? extends qvq>> {
        final /* synthetic */ long a;

        e(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "username");
            return new akbk<qvq>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object invoke() {
                    return new qvq(this.a.a, str, null, null, 124);
                }
            };
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(quq.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;");
    }

    public quq(SnapDb snapDb, adpm adpm, pru pru, qum qum, qvd qvd, quk quk, ajwy<iqx> ajwy, gpb gpb, qup qup, ajwy<qux> ajwy2, ajwy<gqr> ajwy3, ajwy<qvo> ajwy4, ajwy<ftl> ajwy5, zgb zgb, ajei ajei) {
        SnapDb snapDb2 = snapDb;
        adpm adpm2 = adpm;
        pru pru2 = pru;
        qum qum2 = qum;
        qvd qvd2 = qvd;
        quk quk2 = quk;
        ajwy<iqx> ajwy6 = ajwy;
        gpb gpb2 = gpb;
        qup qup2 = qup;
        ajwy<qux> ajwy7 = ajwy2;
        ajwy<gqr> ajwy8 = ajwy3;
        ajwy<qvo> ajwy9 = ajwy4;
        ajwy<ftl> ajwy10 = ajwy5;
        ajei ajei2 = ajei;
        akcr.b(snapDb2, "snapDb");
        akcr.b(adpm2, "messageProcessors");
        akcr.b(pru2, "messageReleaseUpdatesProcessor");
        akcr.b(qum2, "feedRepository");
        akcr.b(qvd2, "messagingRepository");
        akcr.b(quk2, "conversationsRepository");
        akcr.b(ajwy6, "friendRepositoryProvider");
        akcr.b(gpb2, "userAuth");
        akcr.b(qup2, "friendsFeedSnapDbLogger");
        akcr.b(ajwy7, "messageCleaner");
        akcr.b(ajwy8, "exceptionTracker");
        akcr.b(ajwy9, "sequenceNumberRepository");
        akcr.b(ajwy10, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei2, "userSessionDisposable");
        this.m = snapDb2;
        this.n = adpm2;
        this.e = pru2;
        this.o = qum2;
        this.f = qvd2;
        this.g = quk2;
        this.p = gpb2;
        this.q = qup2;
        this.h = ajwy7;
        this.i = ajwy8;
        this.j = ajwy9;
        this.r = ajwy10;
        this.s = ajei2;
        this.l = ajxh.a(new c(ajwy));
        ajej c = ((ftl) this.r.get()).b((fth) qpy.UPDATE_SEQUENCE_NUMBERS_ON_GROUP_VERSION_CHANGE).b((ajdw) this.k.b()).f(new 1(this)).c();
        akcr.a((Object) c, "configProvider.get().get…             .subscribe()");
        ajvv.a(c, this.s);
    }

    private static List<aeie> a(ahaz ahaz) {
        List list = ahaz.o;
        if (list == null) {
            return ajyw.a;
        }
        Object obj;
        Object obj2;
        Object obj3;
        Map linkedHashMap = new LinkedHashMap();
        List<Object> list2 = ahaz.p;
        if (list2 != null) {
            for (Object obj22 : list2) {
                obj = obj22.a.e;
                if (akcr.a(obj, aesq.MISSED_AUDIO_CALL.a()) || akcr.a(obj, aesq.MISSED_VIDEO_CALL.a())) {
                    aeof aeof = obj22.i;
                    Object obj4 = ahaz.b.b;
                    akcr.a(obj4, "group.mischiefMetadata.participants");
                    Iterable<ahbl> iterable = (Iterable) obj4;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (ahbl ahbl : iterable) {
                        arrayList.add(ahbl.b);
                    }
                    Collection arrayList2 = new ArrayList();
                    for (Object next : (List) arrayList) {
                        if ((akcr.a((String) next, obj22.i.a) ^ 1) != 0) {
                            arrayList2.add(next);
                        }
                    }
                    aeof.b = (List) arrayList2;
                }
                obj = obj22.p;
                akcr.a(obj, "chatMessage.id");
                akcr.a(obj22, "chatMessage");
                linkedHashMap.put(obj, obj22);
            }
        }
        list2 = ahaz.q;
        if (list2 != null) {
            for (Object obj222 : list2) {
                obj = obj222.p;
                akcr.a(obj, "releaseMessage.id");
                akcr.a(obj222, "releaseMessage");
                linkedHashMap.put(obj, obj222);
            }
        }
        list2 = ahaz.w;
        if (list2 != null) {
            for (Object obj2222 : list2) {
                obj = obj2222.p;
                akcr.a(obj, "stateMessage.id");
                akcr.a(obj2222, "stateMessage");
                linkedHashMap.put(obj, obj2222);
            }
        }
        list2 = ahaz.r;
        if (list2 != null) {
            for (Object obj22222 : list2) {
                obj = obj22222.p;
                akcr.a(obj, "updateMessage.id");
                akcr.a(obj22222, "updateMessage");
                obj22222.s = ahaz.b;
                linkedHashMap.put(obj, obj22222);
            }
        }
        List<Object> list3 = ahaz.x;
        if (list3 != null) {
            for (Object obj32 : list3) {
                obj22222 = obj32.p;
                akcr.a(obj22222, "snapStateMessage.id");
                akcr.a(obj32, "snapStateMessage");
                linkedHashMap.put(obj22222, obj32);
            }
        }
        Collection arrayList3 = new ArrayList();
        for (Object obj322 : list) {
            if ((linkedHashMap.get((String) obj322) != null ? 1 : null) != null) {
                arrayList3.add(obj322);
            }
        }
        Iterable<String> iterable2 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
        for (String str : iterable2) {
            obj322 = linkedHashMap.get(str);
            if (obj322 == null) {
                akcr.a();
            }
            arrayList4.add((aeie) obj322);
        }
        return (List) arrayList4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    private defpackage.quq.b a(com.snap.core.db.api.DbTransaction r20, defpackage.ahaz r21, java.util.List<? extends defpackage.aeie> r22, java.util.Map<java.lang.String, defpackage.qvq> r23) {
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        r2 = r23;
        r3 = "tx";
        defpackage.akcr.b(r0, r3);
        r3 = "group";
        defpackage.akcr.b(r1, r3);
        r3 = "messages";
        r4 = r22;
        defpackage.akcr.b(r4, r3);
        r3 = "processedSequenceNumbers";
        defpackage.akcr.b(r2, r3);
        r3 = new java.util.LinkedHashMap;
        r3.<init>();
        r3 = (java.util.Map) r3;
        r5 = new java.util.LinkedHashMap;
        r5.<init>();
        r5 = (java.util.Map) r5;
        r6 = r1.u;
        r6 = r6.booleanValue();
        r7 = "seqNum";
        r8 = "username";
        if (r6 != 0) goto L_0x0067;
    L_0x0036:
        r6 = r1.v;
        r9 = "group.earliestSequenceNumbers";
        defpackage.akcr.a(r6, r9);
        r6 = r6.entrySet();
        r6 = r6.iterator();
    L_0x0045:
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x0067;
    L_0x004b:
        r9 = r6.next();
        r9 = (java.util.Map.Entry) r9;
        r10 = r9.getKey();
        r10 = (java.lang.String) r10;
        r9 = r9.getValue();
        r9 = (java.lang.Long) r9;
        defpackage.akcr.a(r10, r8);
        defpackage.akcr.a(r9, r7);
        r3.put(r10, r9);
        goto L_0x0045;
    L_0x0067:
        r6 = r1.y;
        r6 = r6.booleanValue();
        if (r6 != 0) goto L_0x00a0;
    L_0x006f:
        r1 = r1.B;
        r6 = "group.pageLatestSequenceNumbers";
        defpackage.akcr.a(r1, r6);
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x007e:
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x00a0;
    L_0x0084:
        r6 = r1.next();
        r6 = (java.util.Map.Entry) r6;
        r9 = r6.getKey();
        r9 = (java.lang.String) r9;
        r6 = r6.getValue();
        r6 = (java.lang.Long) r6;
        defpackage.akcr.a(r9, r8);
        defpackage.akcr.a(r6, r7);
        r5.put(r9, r6);
        goto L_0x007e;
    L_0x00a0:
        r1 = r22.iterator();
    L_0x00a4:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x0198;
    L_0x00aa:
        r4 = r1.next();
        r4 = (defpackage.aeie) r4;
        r6 = r4.i;
        r6 = r6.a;
        if (r6 != 0) goto L_0x00b9;
    L_0x00b6:
        defpackage.akcr.a();
    L_0x00b9:
        r7 = r2.get(r6);
        r7 = (defpackage.qvq) r7;
        r8 = 0;
        if (r7 == 0) goto L_0x00c5;
    L_0x00c2:
        r7 = r7.f;
        goto L_0x00c6;
    L_0x00c5:
        r7 = r8;
    L_0x00c6:
        r9 = r2.get(r6);
        r9 = (defpackage.qvq) r9;
        if (r9 == 0) goto L_0x00d0;
    L_0x00ce:
        r8 = r9.e;
    L_0x00d0:
        r9 = 1;
        r10 = 0;
        if (r7 == 0) goto L_0x00e5;
    L_0x00d4:
        r11 = r7;
        r11 = (java.lang.Number) r11;
        r11 = r11.longValue();
        r13 = defpackage.adox.c(r4);
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 > 0) goto L_0x00e5;
    L_0x00e3:
        r11 = 1;
        goto L_0x00e6;
    L_0x00e5:
        r11 = 0;
    L_0x00e6:
        if (r11 == 0) goto L_0x0100;
    L_0x00e8:
        if (r8 == 0) goto L_0x00fb;
    L_0x00ea:
        r11 = r8;
        r11 = (java.lang.Number) r11;
        r11 = r11.longValue();
        r13 = defpackage.adox.c(r4);
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 < 0) goto L_0x00fb;
    L_0x00f9:
        r11 = 1;
        goto L_0x00fc;
    L_0x00fb:
        r11 = 0;
    L_0x00fc:
        if (r11 == 0) goto L_0x0100;
    L_0x00fe:
        r11 = 1;
        goto L_0x0101;
    L_0x0100:
        r11 = 0;
    L_0x0101:
        if (r11 != 0) goto L_0x0194;
    L_0x0103:
        r11 = r19;
        r12 = r11.n;	 Catch:{ all -> 0x0192 }
        r12.a(r0, r4);	 Catch:{ all -> 0x0192 }
        r12 = 3;
        r13 = new java.lang.Long[r12];
        r14 = defpackage.adox.c(r4);
        r14 = java.lang.Long.valueOf(r14);
        r13[r10] = r14;
        r14 = r3.get(r6);
        r14 = (java.lang.Long) r14;
        r15 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r14 == 0) goto L_0x0129;
    L_0x0124:
        r17 = r14.longValue();
        goto L_0x012b;
    L_0x0129:
        r17 = r15;
    L_0x012b:
        r14 = java.lang.Long.valueOf(r17);
        r13[r9] = r14;
        if (r7 == 0) goto L_0x0137;
    L_0x0133:
        r15 = r7.longValue();
    L_0x0137:
        r7 = java.lang.Long.valueOf(r15);
        r14 = 2;
        r13[r14] = r7;
        r7 = defpackage.ajym.b(r13);
        r7 = (java.lang.Iterable) r7;
        r7 = defpackage.ajyu.s(r7);
        if (r7 != 0) goto L_0x014d;
    L_0x014a:
        defpackage.akcr.a();
    L_0x014d:
        r3.put(r6, r7);
        r7 = new java.lang.Long[r12];
        r12 = defpackage.adox.c(r4);
        r4 = java.lang.Long.valueOf(r12);
        r7[r10] = r4;
        r4 = r5.get(r6);
        r4 = (java.lang.Long) r4;
        r12 = -9223372036854775808;
        if (r4 == 0) goto L_0x016b;
    L_0x0166:
        r15 = r4.longValue();
        goto L_0x016c;
    L_0x016b:
        r15 = r12;
    L_0x016c:
        r4 = java.lang.Long.valueOf(r15);
        r7[r9] = r4;
        if (r8 == 0) goto L_0x0178;
    L_0x0174:
        r12 = r8.longValue();
    L_0x0178:
        r4 = java.lang.Long.valueOf(r12);
        r7[r14] = r4;
        r4 = defpackage.ajym.b(r7);
        r4 = (java.lang.Iterable) r4;
        r4 = defpackage.ajyu.r(r4);
        if (r4 != 0) goto L_0x018d;
    L_0x018a:
        defpackage.akcr.a();
    L_0x018d:
        r5.put(r6, r4);
        goto L_0x00a4;
    L_0x0192:
        r0 = move-exception;
        throw r0;
    L_0x0194:
        r11 = r19;
        goto L_0x00a4;
    L_0x0198:
        r11 = r19;
        r0 = new quq$b;
        r0.<init>(r3, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.a(com.snap.core.db.api.DbTransaction, ahaz, java.util.List, java.util.Map):quq$b");
    }

    private final void a(DbTransaction dbTransaction, List<? extends ahaz> list) {
        List k;
        if (list != null) {
            a((List) list);
        }
        if (list != null) {
            for (ahaz ahaz : list) {
                akcr.a(ahaz.m, "mischief.contentType");
                ahbc a = ahbc.a(ahaz.m);
                if (a != null) {
                    int i = qur.a[a.ordinal()];
                    if (i == 1 || i == 2) {
                        a(dbTransaction, ahaz, qvv.BATCHED_SERVER_RESPONSE);
                    }
                }
            }
        }
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((ahaz) next).m, ahbc.NONE.a())) {
                    arrayList.add(next);
                }
            }
            k = ajyu.k((List) arrayList);
        } else {
            k = null;
        }
        if (k != null && (1 ^ k.isEmpty()) != 0) {
            b(dbTransaction, k);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0063 in {4, 11, 13, 15, 16, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void a(java.util.List<? extends defpackage.ahaz> r3) {
        /*
        r2 = this;
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0061 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0061 }
        r1 = 10;	 Catch:{ all -> 0x0061 }
        r1 = defpackage.ajyn.a(r3, r1);	 Catch:{ all -> 0x0061 }
        r0.<init>(r1);	 Catch:{ all -> 0x0061 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0061 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0061 }
        r1 = r3.hasNext();	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x0061 }
        r1 = r3.next();	 Catch:{ all -> 0x0061 }
        r1 = (defpackage.ahaz) r1;	 Catch:{ all -> 0x0061 }
        r1 = r1.a;	 Catch:{ all -> 0x0061 }
        r0.add(r1);	 Catch:{ all -> 0x0061 }
        goto L_0x0013;	 Catch:{ all -> 0x0061 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0061 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0061 }
        r3 = defpackage.ajyu.k(r0);	 Catch:{ all -> 0x0061 }
        r0 = r3.size();	 Catch:{ all -> 0x0061 }
        r1 = 1;	 Catch:{ all -> 0x0061 }
        if (r0 <= r1) goto L_0x0060;	 Catch:{ all -> 0x0061 }
        r0 = r2.o;	 Catch:{ all -> 0x0061 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0061 }
        if (r3 == 0) goto L_0x0058;	 Catch:{ all -> 0x0061 }
        r1 = 0;	 Catch:{ all -> 0x0061 }
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x0061 }
        r3 = r3.toArray(r1);	 Catch:{ all -> 0x0061 }
        if (r3 == 0) goto L_0x0050;	 Catch:{ all -> 0x0061 }
        r3 = (java.lang.String[]) r3;	 Catch:{ all -> 0x0061 }
        r1 = r3.length;	 Catch:{ all -> 0x0061 }
        r3 = java.util.Arrays.copyOf(r3, r1);	 Catch:{ all -> 0x0061 }
        r3 = (java.lang.String[]) r3;	 Catch:{ all -> 0x0061 }
        r0.a(r3);	 Catch:{ all -> 0x0061 }
        goto L_0x0060;	 Catch:{ all -> 0x0061 }
        r3 = new ajxt;	 Catch:{ all -> 0x0061 }
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x0061 }
        r3.<init>(r0);	 Catch:{ all -> 0x0061 }
        throw r3;	 Catch:{ all -> 0x0061 }
        r3 = new ajxt;	 Catch:{ all -> 0x0061 }
        r0 = "null cannot be cast to non-null type java.util.Collection<T>";	 Catch:{ all -> 0x0061 }
        r3.<init>(r0);	 Catch:{ all -> 0x0061 }
        throw r3;	 Catch:{ all -> 0x0061 }
        return;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.a(java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0069 in {6, 11, 12, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void b(defpackage.ahaz r5, long r6, com.snap.core.db.api.DbTransaction r8) {
        /*
        r4 = this;
        r5 = r5.b;	 Catch:{ all -> 0x0067 }
        r5 = r5.b;	 Catch:{ all -> 0x0067 }
        r0 = "group.mischiefMetadata.participants";	 Catch:{ all -> 0x0067 }
        defpackage.akcr.a(r5, r0);	 Catch:{ all -> 0x0067 }
        r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x0067 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0067 }
        r0.<init>();	 Catch:{ all -> 0x0067 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0067 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0067 }
        r1 = r5.hasNext();	 Catch:{ all -> 0x0067 }
        if (r1 == 0) goto L_0x0035;	 Catch:{ all -> 0x0067 }
        r1 = r5.next();	 Catch:{ all -> 0x0067 }
        r2 = r1;	 Catch:{ all -> 0x0067 }
        r2 = (defpackage.ahbl) r2;	 Catch:{ all -> 0x0067 }
        r2 = r2.b;	 Catch:{ all -> 0x0067 }
        r3 = r4.p;	 Catch:{ all -> 0x0067 }
        r3 = r3.b();	 Catch:{ all -> 0x0067 }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0067 }
        if (r2 == 0) goto L_0x0016;	 Catch:{ all -> 0x0067 }
        r0.add(r1);	 Catch:{ all -> 0x0067 }
        goto L_0x0016;	 Catch:{ all -> 0x0067 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0067 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0067 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0067 }
        r1 = 10;	 Catch:{ all -> 0x0067 }
        r1 = defpackage.ajyn.a(r0, r1);	 Catch:{ all -> 0x0067 }
        r5.<init>(r1);	 Catch:{ all -> 0x0067 }
        r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0067 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0067 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0067 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ all -> 0x0067 }
        r1 = r0.next();	 Catch:{ all -> 0x0067 }
        r1 = (defpackage.ahbl) r1;	 Catch:{ all -> 0x0067 }
        r2 = r4.f;	 Catch:{ all -> 0x0067 }
        r1 = r1.e;	 Catch:{ all -> 0x0067 }
        r1 = r2.a(r6, r1, r8);	 Catch:{ all -> 0x0067 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0067 }
        r5.add(r1);	 Catch:{ all -> 0x0067 }
        goto L_0x004a;
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.b(ahaz, long, com.snap.core.db.api.DbTransaction):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00d4 in {4, 10, 16, 17, 20, 23, 24, 26, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void b(com.snap.core.db.api.DbTransaction r8, java.util.List<? extends defpackage.ahaz> r9) {
        /*
        r7 = this;
        r8.checkInTransaction();	 Catch:{ all -> 0x00d2 }
        r0 = r7.g;	 Catch:{ all -> 0x00d2 }
        r1 = r9;	 Catch:{ all -> 0x00d2 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x00d2 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x00d2 }
        r3 = 10;	 Catch:{ all -> 0x00d2 }
        r4 = defpackage.ajyn.a(r1, r3);	 Catch:{ all -> 0x00d2 }
        r2.<init>(r4);	 Catch:{ all -> 0x00d2 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x00d2 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00d2 }
        r4 = r1.hasNext();	 Catch:{ all -> 0x00d2 }
        if (r4 == 0) goto L_0x002b;	 Catch:{ all -> 0x00d2 }
        r4 = r1.next();	 Catch:{ all -> 0x00d2 }
        r4 = (defpackage.ahaz) r4;	 Catch:{ all -> 0x00d2 }
        r4 = r4.a;	 Catch:{ all -> 0x00d2 }
        r2.add(r4);	 Catch:{ all -> 0x00d2 }
        goto L_0x0019;	 Catch:{ all -> 0x00d2 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x00d2 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00d2 }
        r1 = defpackage.ajyu.k(r2);	 Catch:{ all -> 0x00d2 }
        r2 = "groups";	 Catch:{ all -> 0x00d2 }
        defpackage.akcr.b(r1, r2);	 Catch:{ all -> 0x00d2 }
        r0 = r0.a;	 Catch:{ all -> 0x00d2 }
        r2 = com.snap.core.db.record.FeedRecord.FACTORY;	 Catch:{ all -> 0x00d2 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00d2 }
        r4 = 0;	 Catch:{ all -> 0x00d2 }
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x00d2 }
        r1 = r1.toArray(r4);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x00ca;	 Catch:{ all -> 0x00d2 }
        r1 = (java.lang.String[]) r1;	 Catch:{ all -> 0x00d2 }
        r1 = r2.getGroupVersionsForKeys(r1);	 Catch:{ all -> 0x00d2 }
        r2 = "FeedRecord.FACTORY.getGr…ys(groups.toTypedArray())";	 Catch:{ all -> 0x00d2 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00d2 }
        r2 = com.snap.core.db.record.FeedRecord.GET_GROUP_VERSIONS;	 Catch:{ all -> 0x00d2 }
        r4 = "FeedRecord.GET_GROUP_VERSIONS";	 Catch:{ all -> 0x00d2 }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x00d2 }
        r0 = r0.query(r1, r2);	 Catch:{ all -> 0x00d2 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x00d2 }
        r1 = defpackage.ajyn.a(r0, r3);	 Catch:{ all -> 0x00d2 }
        r1 = defpackage.ajzm.a(r1);	 Catch:{ all -> 0x00d2 }
        r2 = 16;	 Catch:{ all -> 0x00d2 }
        r1 = defpackage.akef.b(r1, r2);	 Catch:{ all -> 0x00d2 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x00d2 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00d2 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x008d;	 Catch:{ all -> 0x00d2 }
        r1 = r0.next();	 Catch:{ all -> 0x00d2 }
        r3 = r1;	 Catch:{ all -> 0x00d2 }
        r3 = (com.snap.core.db.record.FeedRecord.GroupVersion) r3;	 Catch:{ all -> 0x00d2 }
        r3 = r3.key();	 Catch:{ all -> 0x00d2 }
        r2.put(r3, r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x0078;	 Catch:{ all -> 0x00d2 }
        r9 = (java.lang.Iterable) r9;	 Catch:{ all -> 0x00d2 }
        r9 = r9.iterator();	 Catch:{ all -> 0x00d2 }
        r0 = r9.hasNext();	 Catch:{ all -> 0x00d2 }
        if (r0 == 0) goto L_0x00c9;	 Catch:{ all -> 0x00d2 }
        r0 = r9.next();	 Catch:{ all -> 0x00d2 }
        r0 = (defpackage.ahaz) r0;	 Catch:{ all -> 0x00d2 }
        r1 = r0.a;	 Catch:{ all -> 0x00d2 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x00d2 }
        r1 = (com.snap.core.db.record.FeedRecord.GroupVersion) r1;	 Catch:{ all -> 0x00d2 }
        r3 = -1;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x00b0;	 Catch:{ all -> 0x00d2 }
        r5 = r1.groupVersion();	 Catch:{ all -> 0x00d2 }
        goto L_0x00b1;	 Catch:{ all -> 0x00d2 }
        r5 = r3;	 Catch:{ all -> 0x00d2 }
        r1 = r0.b;	 Catch:{ all -> 0x00d2 }
        r1 = r1.d;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x00bb;	 Catch:{ all -> 0x00d2 }
        r3 = r1.longValue();	 Catch:{ all -> 0x00d2 }
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ all -> 0x00d2 }
        if (r1 >= 0) goto L_0x0093;	 Catch:{ all -> 0x00d2 }
        r1 = r7.f;	 Catch:{ all -> 0x00d2 }
        r3 = r1.a(r0, r8);	 Catch:{ all -> 0x00d2 }
        r7.a(r0, r3, r8);	 Catch:{ all -> 0x00d2 }
        goto L_0x0093;	 Catch:{ all -> 0x00d2 }
        return;	 Catch:{ all -> 0x00d2 }
        r8 = new ajxt;	 Catch:{ all -> 0x00d2 }
        r9 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x00d2 }
        r8.<init>(r9);	 Catch:{ all -> 0x00d2 }
        throw r8;	 Catch:{ all -> 0x00d2 }
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.b(com.snap.core.db.api.DbTransaction, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x010a in {11, 12, 14, 15, 23, 24, 28, 31, 34, 36, 38, 40} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void c(defpackage.ahaz r22, long r23, com.snap.core.db.api.DbTransaction r25) {
        /*
        r21 = this;
        r1 = r21;
        r0 = r22;
        r2 = "ex.username";
        r3 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0108 }
        r3.<init>();	 Catch:{ all -> 0x0108 }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0108 }
        r4 = r0.b;	 Catch:{ all -> 0x0106 }
        r4 = r4.b;	 Catch:{ all -> 0x0106 }
        r5 = "group.mischiefMetadata.participants";	 Catch:{ all -> 0x0106 }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0106 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0106 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0106 }
        r6 = 10;	 Catch:{ all -> 0x0106 }
        r6 = defpackage.ajyn.a(r4, r6);	 Catch:{ all -> 0x0106 }
        r5.<init>(r6);	 Catch:{ all -> 0x0106 }
        r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0106 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0106 }
        r6 = r4.hasNext();	 Catch:{ all -> 0x0106 }
        r7 = 0;	 Catch:{ all -> 0x0106 }
        if (r6 == 0) goto L_0x0091;	 Catch:{ all -> 0x0106 }
        r6 = r4.next();	 Catch:{ all -> 0x0106 }
        r6 = (defpackage.ahbl) r6;	 Catch:{ all -> 0x0106 }
        r9 = r0.C;	 Catch:{ all -> 0x0106 }
        if (r9 == 0) goto L_0x004f;	 Catch:{ all -> 0x0106 }
        r10 = r6.b;	 Catch:{ all -> 0x0106 }
        r9 = r9.get(r10);	 Catch:{ all -> 0x0106 }
        r9 = (defpackage.aepm) r9;	 Catch:{ all -> 0x0106 }
        if (r9 == 0) goto L_0x0048;	 Catch:{ all -> 0x0106 }
        r9 = r9.b;	 Catch:{ all -> 0x0106 }
        goto L_0x0049;	 Catch:{ all -> 0x0106 }
        r9 = 0;	 Catch:{ all -> 0x0106 }
        if (r9 == 0) goto L_0x004f;	 Catch:{ all -> 0x0106 }
        r7 = r9.longValue();	 Catch:{ all -> 0x0106 }
        r9 = r21.a();	 Catch:{ all -> 0x0106 }
        r10 = "participant";	 Catch:{ all -> 0x0106 }
        defpackage.akcr.a(r6, r10);	 Catch:{ all -> 0x0106 }
        r10 = r25;	 Catch:{ all -> 0x0106 }
        r14 = r9.a(r6, r10);	 Catch:{ all -> 0x0106 }
        r9 = r6.b;	 Catch:{ all -> 0x0106 }
        r11 = "participant.username";	 Catch:{ all -> 0x0106 }
        defpackage.akcr.a(r9, r11);	 Catch:{ all -> 0x0106 }
        r11 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0106 }
        r3.put(r9, r11);	 Catch:{ all -> 0x0106 }
        r11 = r1.f;	 Catch:{ all -> 0x0106 }
        r16 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0106 }
        r7 = r6.e;	 Catch:{ all -> 0x0106 }
        r8 = r6.k;	 Catch:{ all -> 0x0106 }
        r9 = r6.f;	 Catch:{ all -> 0x0106 }
        r12 = r23;	 Catch:{ all -> 0x0106 }
        r17 = r7;	 Catch:{ all -> 0x0106 }
        r18 = r8;	 Catch:{ all -> 0x0106 }
        r19 = r9;	 Catch:{ all -> 0x0106 }
        r20 = r25;	 Catch:{ all -> 0x0106 }
        r11.a(r12, r14, r16, r17, r18, r19, r20);	 Catch:{ all -> 0x0106 }
        r7 = r6.a;	 Catch:{ all -> 0x0106 }
        r6 = r6.g;	 Catch:{ all -> 0x0106 }
        r6 = defpackage.ajxs.a(r7, r6);	 Catch:{ all -> 0x0106 }
        r5.add(r6);	 Catch:{ all -> 0x0106 }
        goto L_0x0029;	 Catch:{ all -> 0x0106 }
        r10 = r25;	 Catch:{ all -> 0x0106 }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x0106 }
        r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x0106 }
        r3 = defpackage.ajzm.a(r5);	 Catch:{ all -> 0x0106 }
        r4 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0104 }
        r4.<init>();	 Catch:{ all -> 0x0104 }
        r4 = (java.util.Map) r4;	 Catch:{ all -> 0x0104 }
        r0 = r0.b;	 Catch:{ all -> 0x0104 }
        r0 = r0.c;	 Catch:{ all -> 0x0104 }
        r5 = "group.mischiefMetadata.exParticipants";	 Catch:{ all -> 0x0104 }
        defpackage.akcr.a(r0, r5);	 Catch:{ all -> 0x0104 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0104 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0104 }
        r5 = r0.hasNext();	 Catch:{ all -> 0x0104 }
        if (r5 == 0) goto L_0x00fa;	 Catch:{ all -> 0x0104 }
        r5 = r0.next();	 Catch:{ all -> 0x0104 }
        r5 = (defpackage.ahbe) r5;	 Catch:{ all -> 0x0104 }
        r6 = r5.d;	 Catch:{ all -> 0x0104 }
        r11 = r6.longValue();	 Catch:{ all -> 0x0104 }
        r6 = r5.a;	 Catch:{ all -> 0x0104 }
        r6 = r3.get(r6);	 Catch:{ all -> 0x0104 }
        r6 = (java.lang.Long) r6;	 Catch:{ all -> 0x0104 }
        if (r6 == 0) goto L_0x00d2;	 Catch:{ all -> 0x0104 }
        r13 = r6.longValue();	 Catch:{ all -> 0x0104 }
        goto L_0x00d3;	 Catch:{ all -> 0x0104 }
        r13 = r7;	 Catch:{ all -> 0x0104 }
        r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));	 Catch:{ all -> 0x0104 }
        if (r6 <= 0) goto L_0x00b1;	 Catch:{ all -> 0x0104 }
        r6 = r21.a();	 Catch:{ all -> 0x0104 }
        r9 = r5.b;	 Catch:{ all -> 0x0104 }
        defpackage.akcr.a(r9, r2);	 Catch:{ all -> 0x0104 }
        r14 = r6.f(r9);	 Catch:{ all -> 0x0104 }
        r5 = r5.b;	 Catch:{ all -> 0x0104 }
        defpackage.akcr.a(r5, r2);	 Catch:{ all -> 0x0104 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0104 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0104 }
        r11 = r1.f;	 Catch:{ all -> 0x0104 }
        r12 = r23;	 Catch:{ all -> 0x0104 }
        r16 = r25;	 Catch:{ all -> 0x0104 }
        r11.a(r12, r14, r16);	 Catch:{ all -> 0x0104 }
        goto L_0x00b1;
        r0 = r1.f;	 Catch:{ all -> 0x0102 }
        r2 = r23;	 Catch:{ all -> 0x0102 }
        r0.j(r2);	 Catch:{ all -> 0x0102 }
        return;
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0108 }
        r0 = move-exception;	 Catch:{ all -> 0x0108 }
        throw r0;	 Catch:{ all -> 0x0108 }
        r0 = move-exception;	 Catch:{ all -> 0x0108 }
        throw r0;	 Catch:{ all -> 0x0108 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.c(ahaz, long, com.snap.core.db.api.DbTransaction):void");
    }

    public final long a(aetd aetd, DbTransaction dbTransaction) {
        ahaz ahaz = new ahaz();
        ahaz.a = aetd.i.c;
        ahbg ahbg = new ahbg();
        ahbg.d = aetd.s.d;
        ahbg.a = aetd.s.a;
        ahbg.b = aetd.s.b;
        ahbg.c = aetd.s.c;
        ahaz.b = ahbg;
        quk quk = this.g;
        String str = aetd.i.c;
        akcr.a((Object) str, "message.header.convId");
        long c = quk.c(str);
        if ((c != -1 ? 1 : null) != null) {
            a(ahaz, c, dbTransaction);
            return c;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:72:0x0251 in {2, 3, 6, 7, 9, 12, 17, 19, 20, 28, 29, 35, 36, 42, 43, 49, 50, 51, 56, 59, 60, 63, 64, 67, 68, 71} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public long a(com.snap.core.db.api.DbTransaction r19, defpackage.ahaz r20, defpackage.qvv r21) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r8 = r20;
        r2 = "tx";
        defpackage.akcr.b(r0, r2);
        r3 = "group";
        defpackage.akcr.b(r8, r3);
        r3 = "updateSource";
        r7 = r21;
        defpackage.akcr.b(r7, r3);
        r3 = r1.c;
        r4 = r8.a;
        r3 = r3.get(r4);
        r9 = r3;
        r9 = (defpackage.quq.a) r9;
        if (r9 == 0) goto L_0x0027;
        r3 = r9.a;
        goto L_0x002d;
        r3 = r1.f;
        r3 = r3.a(r8, r0);
        r10 = r3;
        r3 = new java.util.LinkedHashMap;
        r3.<init>();
        r3 = (java.util.Map) r3;
        r4 = defpackage.quq.a(r20);
        r5 = r8.m;
        r5 = defpackage.ahbc.a(r5);
        r6 = defpackage.ahbc.FULL;
        r12 = 1;
        if (r5 != r6) goto L_0x0046;
        r5 = 1;
        goto L_0x0047;
        r5 = 0;
        if (r5 != 0) goto L_0x0059;
        r2 = r1.j;
        r2 = r2.get();
        r2 = (defpackage.qvo) r2;
        r2 = r2.a(r10);
        r3.putAll(r2);
        goto L_0x00a4;
        r5 = r1.d;
        if (r5 == 0) goto L_0x00a4;
        r5 = r1.j;
        r5 = r5.get();
        r5 = (defpackage.qvo) r5;
        defpackage.akcr.b(r0, r2);
        r2 = r5.a();
        r2.throwIfNotDbScheduler();
        r2 = r5.d;
        r2.a(r10);
        r2 = r5.c();
        r2.bind(r10);
        r2 = r5.a();
        r6 = "dbClient";
        defpackage.akcr.a(r2, r6);
        r13 = r5.c();
        r13 = (defpackage.ainy) r13;
        com.snap.core.db.api.BriteDatabaseExtensionsKt.executeDelete(r2, r13, r0);
        r2 = r5.d();
        r2.bind(r10);
        r2 = r5.a();
        defpackage.akcr.a(r2, r6);
        r5 = r5.d();
        r5 = (defpackage.ainy) r5;
        com.snap.core.db.api.BriteDatabaseExtensionsKt.executeDelete(r2, r5, r0);
        r2 = r8.b;
        r13 = r2.d;
        if (r9 == 0) goto L_0x00b7;
        r5 = r9.b;
        if (r13 != 0) goto L_0x00af;
        goto L_0x00b7;
        r14 = r13.longValue();
        r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1));
        if (r2 == 0) goto L_0x00ba;
        r1.a(r8, r10, r0);
        r2 = r1.a(r0, r8, r4, r3);	 Catch:{ all -> 0x024e }
        r3 = new java.util.LinkedHashMap;
        r3.<init>();
        r3 = (java.util.Map) r3;
        r4 = new quq$e;
        r4.<init>(r10);
        r4 = (defpackage.akbl) r4;
        r5 = r2.b;
        r5 = r5.entrySet();
        r5 = r5.iterator();
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x0112;
        r6 = r5.next();
        r6 = (java.util.Map.Entry) r6;
        r14 = r6.getKey();
        r14 = (java.lang.String) r14;
        r6 = r6.getValue();
        r6 = (java.lang.Number) r6;
        r15 = r6.longValue();
        r6 = r4.invoke(r14);
        r6 = (defpackage.akbk) r6;
        r17 = r3.get(r14);
        if (r17 != 0) goto L_0x0107;
        r6 = r6.invoke();
        r3.put(r14, r6);
        r17 = r6;
        r6 = r17;
        r6 = (defpackage.qvq) r6;
        r14 = java.lang.Long.valueOf(r15);
        r6.e = r14;
        goto L_0x00d6;
        r2 = r2.a;
        r2 = r2.entrySet();
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x0158;
        r5 = r2.next();
        r5 = (java.util.Map.Entry) r5;
        r6 = r5.getKey();
        r6 = (java.lang.String) r6;
        r5 = r5.getValue();
        r5 = (java.lang.Number) r5;
        r14 = r5.longValue();
        r5 = r4.invoke(r6);
        r5 = (defpackage.akbk) r5;
        r16 = r3.get(r6);
        if (r16 != 0) goto L_0x014d;
        r5 = r5.invoke();
        r3.put(r6, r5);
        r16 = r5;
        r5 = r16;
        r5 = (defpackage.qvq) r5;
        r6 = java.lang.Long.valueOf(r14);
        r5.f = r6;
        goto L_0x011c;
        r2 = r8.i;
        r5 = "group.latestSequenceNumbers";
        defpackage.akcr.a(r2, r5);
        r2 = r2.entrySet();
        r2 = r2.iterator();
        r5 = r2.hasNext();
        r6 = "username";
        if (r5 == 0) goto L_0x019c;
        r5 = r2.next();
        r5 = (java.util.Map.Entry) r5;
        r14 = r5.getKey();
        r14 = (java.lang.String) r14;
        r5 = r5.getValue();
        r5 = (java.lang.Long) r5;
        defpackage.akcr.a(r14, r6);
        r6 = r4.invoke(r14);
        r6 = (defpackage.akbk) r6;
        r15 = r3.get(r14);
        if (r15 != 0) goto L_0x0197;
        r15 = r6.invoke();
        r3.put(r14, r15);
        r15 = (defpackage.qvq) r15;
        r15.c = r5;
        goto L_0x0167;
        r2 = r8.v;
        r5 = "group.earliestSequenceNumbers";
        defpackage.akcr.a(r2, r5);
        r2 = r2.entrySet();
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x01e1;
        r5 = r2.next();
        r5 = (java.util.Map.Entry) r5;
        r14 = r5.getKey();
        r14 = (java.lang.String) r14;
        r5 = r5.getValue();
        r5 = (java.lang.Long) r5;
        defpackage.akcr.a(r14, r6);
        r15 = r4.invoke(r14);
        r15 = (defpackage.akbk) r15;
        r16 = r3.get(r14);
        if (r16 != 0) goto L_0x01da;
        r15 = r15.invoke();
        r3.put(r14, r15);
        goto L_0x01dc;
        r15 = r16;
        r15 = (defpackage.qvq) r15;
        r15.d = r5;
        goto L_0x01ab;
        r2 = r1.j;
        r2 = r2.get();
        r2 = (defpackage.qvo) r2;
        r3 = r3.values();
        r2.a(r3, r0);
        r2 = r8.z;
        if (r2 == 0) goto L_0x0214;
        r3 = r1.f;
        r4 = r8.H;
        r5 = r1.p;
        r5 = r5.a();
        r5 = r5.b;
        if (r5 != 0) goto L_0x0205;
        defpackage.akcr.a();
        r4 = r4.get(r5);
        r4 = (java.util.Map) r4;
        if (r4 != 0) goto L_0x0211;
        r4 = defpackage.ajyx.a;
        r4 = (java.util.Map) r4;
        r3.a(r10, r2, r4);
        r2 = r1.e;
        r3 = r19;
        r4 = r10;
        r6 = r20;
        r7 = r21;
        r2.a(r3, r4, r6, r7);
        if (r9 == 0) goto L_0x0229;
        r2 = r9.b;
        r0 = java.lang.Long.valueOf(r2);
        goto L_0x022a;
        r0 = 0;
        r0 = defpackage.akcr.a(r0, r13);
        r0 = r0 ^ r12;
        if (r0 == 0) goto L_0x024d;
        r0 = r1.c;
        r0 = (java.util.Map) r0;
        r2 = r8.a;
        r3 = "group.mischiefId";
        defpackage.akcr.a(r2, r3);
        r3 = new quq$a;
        r4 = "groupVersionNumber";
        defpackage.akcr.a(r13, r4);
        r4 = r13.longValue();
        r3.<init>(r10, r4);
        r0.put(r2, r3);
        return r10;
        r0 = move-exception;
        r2 = r0;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quq.a(com.snap.core.db.api.DbTransaction, ahaz, qvv):long");
    }

    /* Access modifiers changed, original: final */
    public final iqx a() {
        return (iqx) this.l.b();
    }

    public final void a(aelz aelz, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aelz, EventType.RESPONSE);
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        aegb aegb = aelz.a;
        if (aegb != null) {
            List list = aegb.f;
            if (list != null) {
                a(dbTransaction, list);
            }
        }
    }

    public final void a(ahaz ahaz, long j, DbTransaction dbTransaction) {
        akcr.b(ahaz, "group");
        akcr.b(dbTransaction, "tx");
        b(ahaz, j, dbTransaction);
        long e = this.g.e(j);
        Long l = ahaz.b.d;
        long j2 = 0;
        if (e < (l != null ? l.longValue() : 0)) {
            c(ahaz, j, dbTransaction);
            quk quk = this.g;
            Long l2 = ahaz.b.d;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            quk.b(j, j2);
        }
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        List list = aecy.g;
        if (list != null) {
            a(dbTransaction, list);
        }
    }

    public final synchronized void b() {
        this.c.clear();
    }
}
