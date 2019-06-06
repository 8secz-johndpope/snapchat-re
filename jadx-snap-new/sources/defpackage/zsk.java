package defpackage;

import java.util.List;

/* renamed from: zsk */
public abstract class zsk {

    /* renamed from: zsk$a */
    public static final class a extends zsk {
        public final List<aenr> a;
        public final List<aenr> b;
        public final List<aenr> c;
        public final List<aenr> d;
        public final long e;

        /* renamed from: zsk$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: zsk$a$b */
        static final class b extends akcs implements akbk<byte[]> {
            private /* synthetic */ iha a;
            private /* synthetic */ aenr b;

            b(iha iha, aenr aenr) {
                this.a = iha;
                this.b = aenr;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object a = this.a.a(this.b);
                akcr.a(a, "serializationHelper.toJson(geofilterResponse)");
                return a;
            }
        }

        static {
            a aVar = new a();
        }

        public a(List<? extends aenr> list, List<? extends aenr> list2, List<? extends aenr> list3, List<? extends aenr> list4, long j) {
            akcr.b(list, "unlockedFilters");
            akcr.b(list2, "unlockedLenses");
            akcr.b(list3, "unlockedStickerPacks");
            akcr.b(list4, "unlockedCaptionStyles");
            super();
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
            this.e = j;
        }

        public /* synthetic */ a(List list, List list2, List list3, List list4, long j, int i) {
            if ((i & 1) != 0) {
                list = ajyw.a;
            }
            List list5 = list;
            if ((i & 2) != 0) {
                list2 = ajyw.a;
            }
            List list6 = list2;
            if ((i & 4) != 0) {
                list3 = ajyw.a;
            }
            List list7 = list3;
            if ((i & 8) != 0) {
                list4 = ajyw.a;
            }
            this(list5, list6, list7, list4, j);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00ec in {14, 16, 17, 18, 19, 20, 24, 26, 27, 29} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final java.util.List<defpackage.zso> a(defpackage.ilv r23, defpackage.iha r24) {
            /*
            r22 = this;
            r1 = r22;
            r0 = r23;
            r2 = r24;
            r3 = "graphene";
            defpackage.akcr.b(r0, r3);
            r3 = "serializationHelper";
            defpackage.akcr.b(r2, r3);
            r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00ea }
            r3.<init>();	 Catch:{ all -> 0x00ea }
            r3 = (java.util.List) r3;	 Catch:{ all -> 0x00ea }
            r4 = com.snap.core.db.column.PersistableUnlockableType.values();	 Catch:{ all -> 0x00ea }
            r5 = r4.length;	 Catch:{ all -> 0x00ea }
            r6 = 0;	 Catch:{ all -> 0x00ea }
            if (r6 >= r5) goto L_0x00e9;	 Catch:{ all -> 0x00ea }
            r15 = r4[r6];	 Catch:{ all -> 0x00ea }
            r7 = "type";	 Catch:{ all -> 0x00ea }
            defpackage.akcr.b(r15, r7);	 Catch:{ all -> 0x00ea }
            r7 = defpackage.zsl.a;	 Catch:{ all -> 0x00ea }
            r8 = r15.ordinal();	 Catch:{ all -> 0x00ea }
            r7 = r7[r8];	 Catch:{ all -> 0x00ea }
            r8 = 1;	 Catch:{ all -> 0x00ea }
            if (r7 == r8) goto L_0x0051;	 Catch:{ all -> 0x00ea }
            r8 = 2;	 Catch:{ all -> 0x00ea }
            if (r7 == r8) goto L_0x004e;	 Catch:{ all -> 0x00ea }
            r8 = 3;	 Catch:{ all -> 0x00ea }
            if (r7 == r8) goto L_0x004b;	 Catch:{ all -> 0x00ea }
            r8 = 4;	 Catch:{ all -> 0x00ea }
            if (r7 == r8) goto L_0x0048;	 Catch:{ all -> 0x00ea }
            r8 = 5;	 Catch:{ all -> 0x00ea }
            if (r7 != r8) goto L_0x0042;	 Catch:{ all -> 0x00ea }
            r7 = defpackage.ajyw.a;	 Catch:{ all -> 0x00ea }
            r7 = (java.util.List) r7;	 Catch:{ all -> 0x00ea }
            goto L_0x0053;	 Catch:{ all -> 0x00ea }
            r0 = new ajxk;	 Catch:{ all -> 0x00ea }
            r0.<init>();	 Catch:{ all -> 0x00ea }
            throw r0;	 Catch:{ all -> 0x00ea }
            r7 = r1.d;	 Catch:{ all -> 0x00ea }
            goto L_0x0053;	 Catch:{ all -> 0x00ea }
            r7 = r1.c;	 Catch:{ all -> 0x00ea }
            goto L_0x0053;	 Catch:{ all -> 0x00ea }
            r7 = r1.b;	 Catch:{ all -> 0x00ea }
            goto L_0x0053;	 Catch:{ all -> 0x00ea }
            r7 = r1.a;	 Catch:{ all -> 0x00ea }
            r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x00ea }
            r7 = defpackage.ajyu.k(r7);	 Catch:{ all -> 0x00ea }
            r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x00ea }
            r8 = new java.util.ArrayList;	 Catch:{ all -> 0x00ea }
            r9 = 10;	 Catch:{ all -> 0x00ea }
            r9 = defpackage.ajyn.a(r7, r9);	 Catch:{ all -> 0x00ea }
            r8.<init>(r9);	 Catch:{ all -> 0x00ea }
            r14 = r8;	 Catch:{ all -> 0x00ea }
            r14 = (java.util.Collection) r14;	 Catch:{ all -> 0x00ea }
            r18 = r7.iterator();	 Catch:{ all -> 0x00ea }
            r7 = r18.hasNext();	 Catch:{ all -> 0x00ea }
            if (r7 == 0) goto L_0x00d0;	 Catch:{ all -> 0x00ea }
            r7 = r18.next();	 Catch:{ all -> 0x00ea }
            r7 = (defpackage.aenr) r7;	 Catch:{ all -> 0x00ea }
            r8 = r7.a;	 Catch:{ all -> 0x00ea }
            r9 = "it.filterId";	 Catch:{ all -> 0x00ea }
            defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x00ea }
            r8 = java.lang.Long.parseLong(r8);	 Catch:{ all -> 0x00ea }
            r11 = com.snap.core.db.column.UnlockMechanism.SNAP_CODE;	 Catch:{ all -> 0x00ea }
            r12 = r1.e;	 Catch:{ all -> 0x00ea }
            r12 = defpackage.zsp.a(r7, r12);	 Catch:{ all -> 0x00ea }
            r10 = defpackage.ipg.DATABASE_MODEL_SERIALIZATION;	 Catch:{ all -> 0x00ea }
            r10 = defpackage.ily.a.a(r10);	 Catch:{ all -> 0x00ea }
            r1 = "LocIndependentUnlockablesResponse:serializeDataModel";	 Catch:{ all -> 0x00ea }
            r19 = r4;	 Catch:{ all -> 0x00ea }
            r4 = new zsk$a$b;	 Catch:{ all -> 0x00ea }
            r4.<init>(r2, r7);	 Catch:{ all -> 0x00ea }
            r4 = (defpackage.akbk) r4;	 Catch:{ all -> 0x00ea }
            r1 = defpackage.imn.a(r0, r10, r1, r4);	 Catch:{ all -> 0x00ea }
            r4 = "graphene.addTimerWithTra…Json(geofilterResponse) }";	 Catch:{ all -> 0x00ea }
            defpackage.akcr.a(r1, r4);	 Catch:{ all -> 0x00ea }
            r1 = (byte[]) r1;	 Catch:{ all -> 0x00ea }
            r4 = defpackage.zsn.JSON_VERSION;	 Catch:{ all -> 0x00ea }
            r20 = r5;	 Catch:{ all -> 0x00ea }
            r4 = r4.value;	 Catch:{ all -> 0x00ea }
            r10 = r7.ar;	 Catch:{ all -> 0x00ea }
            r7 = new zso;	 Catch:{ all -> 0x00ea }
            r21 = r7;	 Catch:{ all -> 0x00ea }
            r7 = r21;	 Catch:{ all -> 0x00ea }
            r17 = r10;	 Catch:{ all -> 0x00ea }
            r10 = r15;	 Catch:{ all -> 0x00ea }
            r0 = r14;	 Catch:{ all -> 0x00ea }
            r14 = r1;	 Catch:{ all -> 0x00ea }
            r1 = r15;	 Catch:{ all -> 0x00ea }
            r15 = r4;	 Catch:{ all -> 0x00ea }
            r7.<init>(r8, r10, r11, r12, r14, r15, r17);	 Catch:{ all -> 0x00ea }
            r4 = r21;	 Catch:{ all -> 0x00ea }
            r0.add(r4);	 Catch:{ all -> 0x00ea }
            r14 = r0;	 Catch:{ all -> 0x00ea }
            r15 = r1;	 Catch:{ all -> 0x00ea }
            r4 = r19;	 Catch:{ all -> 0x00ea }
            r5 = r20;	 Catch:{ all -> 0x00ea }
            r1 = r22;	 Catch:{ all -> 0x00ea }
            r0 = r23;	 Catch:{ all -> 0x00ea }
            goto L_0x006d;	 Catch:{ all -> 0x00ea }
            r19 = r4;	 Catch:{ all -> 0x00ea }
            r20 = r5;	 Catch:{ all -> 0x00ea }
            r0 = r14;	 Catch:{ all -> 0x00ea }
            r14 = r0;	 Catch:{ all -> 0x00ea }
            r14 = (java.util.List) r14;	 Catch:{ all -> 0x00ea }
            r14 = (java.util.Collection) r14;	 Catch:{ all -> 0x00ea }
            r3.addAll(r14);	 Catch:{ all -> 0x00ea }
            r6 = r6 + 1;
            r1 = r22;
            r0 = r23;
            r4 = r19;
            r5 = r20;
            goto L_0x001d;
            return r3;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zsk$a.a(ilv, iha):java.util.List");
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a) && akcr.a(this.b, aVar.b) && akcr.a(this.c, aVar.c) && akcr.a(this.d, aVar.d)) {
                        if ((this.e == aVar.e ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List list2 = this.b;
            hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            list2 = this.c;
            hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            list2 = this.d;
            if (list2 != null) {
                i = list2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.e;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SyncAll(unlockedFilters=");
            stringBuilder.append(this.a);
            stringBuilder.append(", unlockedLenses=");
            stringBuilder.append(this.b);
            stringBuilder.append(", unlockedStickerPacks=");
            stringBuilder.append(this.c);
            stringBuilder.append(", unlockedCaptionStyles=");
            stringBuilder.append(this.d);
            stringBuilder.append(", responseTimeMs=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: zsk$b */
    public static abstract class b extends zsk {

        /* renamed from: zsk$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: zsk$b$b */
        public static final class b extends b {
            private final afag a;

            public b(afag afag) {
                akcr.b(afag, "stickerPack");
                super();
                this.a = afag;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.zsk.b.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.zsk.b.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.zsk.b.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zsk$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                afag afag = this.a;
                return afag != null ? afag.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("StickerPack(stickerPack=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
            super();
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    private zsk() {
    }

    public /* synthetic */ zsk(byte b) {
        this();
    }
}
