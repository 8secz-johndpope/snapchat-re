package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: zrl */
public final class zrl {

    /* renamed from: zrl$c */
    static final class c extends akcs implements akbk<byte[]> {
        private /* synthetic */ adzo a;

        c(adzo adzo) {
            this.a = adzo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object toByteArray = MessageNano.toByteArray(this.a);
            akcr.a(toByteArray, "MessageNano.toByteArray(geofilterResponse)");
            return toByteArray;
        }
    }

    /* renamed from: zrl$a */
    public static final class a extends akcs implements akbk<Optional<adzo>> {
        private /* synthetic */ zso a;

        public a(zso zso) {
            this.a = zso;
            super(0);
        }

        private Optional<adzo> a() {
            Object of;
            try {
                of = Optional.of(adzo.a(this.a.e));
                akcr.a(of, "Optional.of(com.snapchat…rom(this.serializedData))");
                return of;
            } catch (Exception unused) {
                of = Optional.absent();
                akcr.a(of, "Optional.absent()");
                return of;
            }
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: zrl$b */
    public static final class b extends akcs implements akbk<Optional<aenr>> {
        private /* synthetic */ zso a;
        private /* synthetic */ iha b;

        public b(zso zso, iha iha) {
            this.a = zso;
            this.b = iha;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object fromNullable = Optional.fromNullable(this.b.a((InputStream) new ByteArrayInputStream(this.a.e), aenr.class));
            akcr.a(fromNullable, "Optional.fromNullable(se…terResponse::class.java))");
            return fromNullable;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:45:0x0135 in {14, 17, 18, 19, 20, 21, 28, 30, 31, 34, 35, 37, 38, 39, 41, 42, 44} preds:[]
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
    public static final java.util.List<defpackage.zso> a(defpackage.zsu r29, defpackage.ilv r30) {
        /*
        r0 = r29;
        r1 = r30;
        r2 = "receiver$0";
        defpackage.akcr.b(r0, r2);
        r3 = "graphene";
        defpackage.akcr.b(r1, r3);
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0133 }
        r3.<init>();	 Catch:{ all -> 0x0133 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0133 }
        r4 = com.snap.core.db.column.PersistableUnlockableType.values();	 Catch:{ all -> 0x0133 }
        r5 = r4.length;	 Catch:{ all -> 0x0133 }
        r7 = 0;	 Catch:{ all -> 0x0133 }
        if (r7 >= r5) goto L_0x0132;	 Catch:{ all -> 0x0133 }
        r22 = r4[r7];	 Catch:{ all -> 0x0133 }
        r8 = defpackage.zrm.a;	 Catch:{ all -> 0x0133 }
        r9 = r22.ordinal();	 Catch:{ all -> 0x0133 }
        r8 = r8[r9];	 Catch:{ all -> 0x0133 }
        r15 = 1;	 Catch:{ all -> 0x0133 }
        if (r8 == r15) goto L_0x004a;	 Catch:{ all -> 0x0133 }
        r9 = 2;	 Catch:{ all -> 0x0133 }
        if (r8 == r9) goto L_0x0047;	 Catch:{ all -> 0x0133 }
        r9 = 3;	 Catch:{ all -> 0x0133 }
        if (r8 == r9) goto L_0x0044;	 Catch:{ all -> 0x0133 }
        r9 = 4;	 Catch:{ all -> 0x0133 }
        if (r8 == r9) goto L_0x0041;	 Catch:{ all -> 0x0133 }
        r9 = 5;	 Catch:{ all -> 0x0133 }
        if (r8 != r9) goto L_0x003b;	 Catch:{ all -> 0x0133 }
        r8 = r0.l;	 Catch:{ all -> 0x0133 }
        r8 = (java.util.Collection) r8;	 Catch:{ all -> 0x0133 }
        goto L_0x0057;	 Catch:{ all -> 0x0133 }
        r0 = new ajxk;	 Catch:{ all -> 0x0133 }
        r0.<init>();	 Catch:{ all -> 0x0133 }
        throw r0;	 Catch:{ all -> 0x0133 }
        r8 = r0.k;	 Catch:{ all -> 0x0133 }
        goto L_0x0038;	 Catch:{ all -> 0x0133 }
        r8 = r0.j;	 Catch:{ all -> 0x0133 }
        goto L_0x0038;	 Catch:{ all -> 0x0133 }
        r8 = r0.i;	 Catch:{ all -> 0x0133 }
        goto L_0x0038;	 Catch:{ all -> 0x0133 }
        r8 = r0.g;	 Catch:{ all -> 0x0133 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0133 }
        r9 = r0.h;	 Catch:{ all -> 0x0133 }
        r9 = (java.lang.Iterable) r9;	 Catch:{ all -> 0x0133 }
        r8 = defpackage.ajyu.d(r8, r9);	 Catch:{ all -> 0x0133 }
        goto L_0x0038;	 Catch:{ all -> 0x0133 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0133 }
        r8 = defpackage.ajyu.k(r8);	 Catch:{ all -> 0x0133 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0133 }
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x0133 }
        r10 = 10;	 Catch:{ all -> 0x0133 }
        r10 = defpackage.ajyn.a(r8, r10);	 Catch:{ all -> 0x0133 }
        r9.<init>(r10);	 Catch:{ all -> 0x0133 }
        r13 = r9;	 Catch:{ all -> 0x0133 }
        r13 = (java.util.Collection) r13;	 Catch:{ all -> 0x0133 }
        r23 = r8.iterator();	 Catch:{ all -> 0x0133 }
        r8 = r23.hasNext();	 Catch:{ all -> 0x0133 }
        if (r8 == 0) goto L_0x0121;	 Catch:{ all -> 0x0133 }
        r8 = r23.next();	 Catch:{ all -> 0x0133 }
        r8 = (defpackage.adzo) r8;	 Catch:{ all -> 0x0133 }
        r9 = "LOW";	 Catch:{ all -> 0x0133 }
        r10 = r8.aa;	 Catch:{ all -> 0x0133 }
        if (r10 == 0) goto L_0x0097;	 Catch:{ all -> 0x0133 }
        if (r10 == 0) goto L_0x008f;	 Catch:{ all -> 0x0133 }
        r10 = r10.toUpperCase();	 Catch:{ all -> 0x0133 }
        r12 = "(this as java.lang.String).toUpperCase()";	 Catch:{ all -> 0x0133 }
        defpackage.akcr.a(r10, r12);	 Catch:{ all -> 0x0133 }
        goto L_0x0098;	 Catch:{ all -> 0x0133 }
        r0 = new ajxt;	 Catch:{ all -> 0x0133 }
        r1 = "null cannot be cast to non-null type java.lang.String";	 Catch:{ all -> 0x0133 }
        r0.<init>(r1);	 Catch:{ all -> 0x0133 }
        throw r0;	 Catch:{ all -> 0x0133 }
        r10 = 0;	 Catch:{ all -> 0x0133 }
        r19 = defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x0133 }
        r9 = r8.a;	 Catch:{ all -> 0x0133 }
        r10 = "it.filterId";	 Catch:{ all -> 0x0133 }
        defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x0133 }
        r9 = java.lang.Long.parseLong(r9);	 Catch:{ all -> 0x0133 }
        r12 = com.snap.core.db.column.UnlockMechanism.LOCATION;	 Catch:{ all -> 0x0133 }
        r24 = r7;	 Catch:{ all -> 0x0133 }
        r6 = r0.b;	 Catch:{ all -> 0x0133 }
        defpackage.akcr.b(r8, r2);	 Catch:{ all -> 0x0133 }
        r16 = r12;	 Catch:{ all -> 0x0133 }
        r11 = r8.o;	 Catch:{ all -> 0x0133 }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0133 }
        r6 = defpackage.zsp.a(r11, r6);	 Catch:{ all -> 0x0133 }
        r11 = defpackage.ipg.DATABASE_MODEL_SERIALIZATION;	 Catch:{ all -> 0x0133 }
        r12 = "parse_type";	 Catch:{ all -> 0x0133 }
        r14 = "protobuf";	 Catch:{ all -> 0x0133 }
        r11 = r11.a(r12, r14);	 Catch:{ all -> 0x0133 }
        r12 = "UnlockablesResponse:serializeProtoGeofilterResponse";	 Catch:{ all -> 0x0133 }
        r14 = new zrl$c;	 Catch:{ all -> 0x0133 }
        r14.<init>(r8);	 Catch:{ all -> 0x0133 }
        r14 = (defpackage.akbk) r14;	 Catch:{ all -> 0x0133 }
        r11 = defpackage.imn.a(r1, r11, r12, r14);	 Catch:{ all -> 0x0133 }
        r12 = "graphene.addTimerWithTra…rray(geofilterResponse) }";	 Catch:{ all -> 0x0133 }
        defpackage.akcr.a(r11, r12);	 Catch:{ all -> 0x0133 }
        r18 = r11;	 Catch:{ all -> 0x0133 }
        r18 = (byte[]) r18;	 Catch:{ all -> 0x0133 }
        r11 = defpackage.zsn.PROTO_VERSION;	 Catch:{ all -> 0x0133 }
        r11 = r11.value;	 Catch:{ all -> 0x0133 }
        r14 = r8.g;	 Catch:{ all -> 0x0133 }
        if (r14 == 0) goto L_0x00eb;	 Catch:{ all -> 0x0133 }
        r14 = defpackage.aeng.a(r14);	 Catch:{ all -> 0x0133 }
        r20 = r14;	 Catch:{ all -> 0x0133 }
        goto L_0x00ed;	 Catch:{ all -> 0x0133 }
        r20 = 0;	 Catch:{ all -> 0x0133 }
        if (r19 != 0) goto L_0x00f2;	 Catch:{ all -> 0x0133 }
        r21 = 1;	 Catch:{ all -> 0x0133 }
        goto L_0x00f4;	 Catch:{ all -> 0x0133 }
        r21 = 0;	 Catch:{ all -> 0x0133 }
        r14 = r8.ar;	 Catch:{ all -> 0x0133 }
        r8 = new zso;	 Catch:{ all -> 0x0133 }
        r25 = r8;	 Catch:{ all -> 0x0133 }
        r8 = r25;	 Catch:{ all -> 0x0133 }
        r26 = r11;	 Catch:{ all -> 0x0133 }
        r11 = r22;	 Catch:{ all -> 0x0133 }
        r12 = r16;	 Catch:{ all -> 0x0133 }
        r0 = r13;	 Catch:{ all -> 0x0133 }
        r28 = r14;	 Catch:{ all -> 0x0133 }
        r13 = r6;	 Catch:{ all -> 0x0133 }
        r6 = 1;	 Catch:{ all -> 0x0133 }
        r15 = r18;	 Catch:{ all -> 0x0133 }
        r16 = r26;	 Catch:{ all -> 0x0133 }
        r18 = r20;	 Catch:{ all -> 0x0133 }
        r20 = r21;	 Catch:{ all -> 0x0133 }
        r21 = r28;	 Catch:{ all -> 0x0133 }
        r8.<init>(r9, r11, r12, r13, r15, r16, r18, r19, r20, r21);	 Catch:{ all -> 0x0133 }
        r7 = r25;	 Catch:{ all -> 0x0133 }
        r0.add(r7);	 Catch:{ all -> 0x0133 }
        r15 = 1;	 Catch:{ all -> 0x0133 }
        r13 = r0;	 Catch:{ all -> 0x0133 }
        r7 = r24;	 Catch:{ all -> 0x0133 }
        r0 = r29;	 Catch:{ all -> 0x0133 }
        goto L_0x0071;	 Catch:{ all -> 0x0133 }
        r24 = r7;	 Catch:{ all -> 0x0133 }
        r0 = r13;	 Catch:{ all -> 0x0133 }
        r13 = r0;	 Catch:{ all -> 0x0133 }
        r13 = (java.util.List) r13;	 Catch:{ all -> 0x0133 }
        r13 = (java.util.Collection) r13;	 Catch:{ all -> 0x0133 }
        r3.addAll(r13);	 Catch:{ all -> 0x0133 }
        r7 = r24 + 1;
        r0 = r29;
        goto L_0x001b;
        return r3;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrl.a(zsu, ilv):java.util.List");
    }
}
