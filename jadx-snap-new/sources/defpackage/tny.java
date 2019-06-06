package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.PreferencesColumnKey;
import com.snap.core.db.record.PreferencesModel.DeleteAllByType;
import com.snap.core.db.record.PreferencesModel.DeleteFeature;
import com.snap.core.db.record.PreferencesModel.DeleteFeatureByType;
import com.snap.core.db.record.PreferencesModel.DeleteKey;
import com.snap.core.db.record.PreferencesModel.DeleteKeyByType;
import com.snap.core.db.record.PreferencesModel.Factory;
import com.snap.core.db.record.PreferencesModel.Mapper;
import com.snap.core.db.record.PreferencesModel.SetBoolean;
import com.snap.core.db.record.PreferencesModel.SetDouble;
import com.snap.core.db.record.PreferencesModel.SetFeatureBoolean;
import com.snap.core.db.record.PreferencesModel.SetFeatureDouble;
import com.snap.core.db.record.PreferencesModel.SetFeatureFloat;
import com.snap.core.db.record.PreferencesModel.SetFeatureInteger;
import com.snap.core.db.record.PreferencesModel.SetFeatureLong;
import com.snap.core.db.record.PreferencesModel.SetFeatureString;
import com.snap.core.db.record.PreferencesModel.SetFloat;
import com.snap.core.db.record.PreferencesModel.SetInteger;
import com.snap.core.db.record.PreferencesModel.SetLong;
import com.snap.core.db.record.PreferencesModel.SetString;
import com.snap.core.db.record.PreferencesRecord;
import defpackage.tnx.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tny */
public final class tny extends tnx {
    final SnapDb d;
    final toa e;
    final tnc f;
    private final a g = new a();
    private final zfw h = zgb.a(new toa().callsite("PreferencesRepositoryImpl"));
    private final zgb i;

    /* renamed from: tny$a */
    public final class a extends defpackage.tnx.a {
        private final ajxe b = ajxh.a(new a(this));
        private final ajxe c = ajxh.a(new h(this));
        private final ajxe d = ajxh.a(new q(this));
        private final ajxe e = ajxh.a(new r(this));
        private final ajxe f = ajxh.a(new p(this));
        private final ajxe g = ajxh.a(new i(this));
        private final ajxe h = ajxh.a(new s(this));
        private final ajxe i = ajxh.a(new j(this));
        private final ajxe j = ajxh.a(new m(this));
        private final ajxe k = ajxh.a(new n(this));
        private final ajxe l = ajxh.a(new l(this));
        private final ajxe m = ajxh.a(new k(this));
        private final ajxe n = ajxh.a(new o(this));
        private final ajxe o = ajxh.a(new e(this));
        private final ajxe p = ajxh.a(new f(this));
        private final ajxe q = ajxh.a(new c(this));
        private final ajxe r = ajxh.a(new d(this));
        private final ajxe s = ajxh.a(new b(this));
        private final tno[] t = ((tno[]) tno.class.getEnumConstants());

        /* renamed from: tny$a$g */
        static final class g extends akcs implements akbl<PreferencesRecord, ajxw> {
            private /* synthetic */ a a;
            private /* synthetic */ ainx b;
            private /* synthetic */ Mapper c;
            private /* synthetic */ ArrayList d;

            g(a aVar, ainx ainx, Mapper mapper, ArrayList arrayList) {
                this.a = aVar;
                this.b = ainx;
                this.c = mapper;
                this.d = arrayList;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                PreferencesRecord preferencesRecord = (PreferencesRecord) obj;
                PreferencesColumnKey parse = PreferencesColumnKey.Companion.parse(preferencesRecord.key());
                if (parse != null) {
                    this.d.add(new ajxm(parse, preferencesRecord));
                }
                return ajxw.a;
            }
        }

        /* renamed from: tny$a$a */
        static final class a extends akcs implements akbk<DbClient> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return tny.this.d.getDbClient((ide) tny.this.e);
            }
        }

        /* renamed from: tny$a$h */
        static final class h extends akcs implements akbk<SetBoolean> {
            private /* synthetic */ a a;

            h(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetBoolean(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$q */
        static final class q extends akcs implements akbk<SetInteger> {
            private /* synthetic */ a a;

            q(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetInteger(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$r */
        static final class r extends akcs implements akbk<SetLong> {
            private /* synthetic */ a a;

            r(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetLong(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$p */
        static final class p extends akcs implements akbk<SetFloat> {
            private /* synthetic */ a a;

            p(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFloat(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$i */
        static final class i extends akcs implements akbk<SetDouble> {
            private /* synthetic */ a a;

            i(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetDouble(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$s */
        static final class s extends akcs implements akbk<SetString> {
            private /* synthetic */ a a;

            s(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetString(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$j */
        static final class j extends akcs implements akbk<SetFeatureBoolean> {
            private /* synthetic */ a a;

            j(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureBoolean(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$m */
        static final class m extends akcs implements akbk<SetFeatureInteger> {
            private /* synthetic */ a a;

            m(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureInteger(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$n */
        static final class n extends akcs implements akbk<SetFeatureLong> {
            private /* synthetic */ a a;

            n(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureLong(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$l */
        static final class l extends akcs implements akbk<SetFeatureFloat> {
            private /* synthetic */ a a;

            l(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureFloat(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$k */
        static final class k extends akcs implements akbk<SetFeatureDouble> {
            private /* synthetic */ a a;

            k(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureDouble(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$o */
        static final class o extends akcs implements akbk<SetFeatureString> {
            private /* synthetic */ a a;

            o(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new SetFeatureString(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$e */
        static final class e extends akcs implements akbk<DeleteKey> {
            private /* synthetic */ a a;

            e(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new DeleteKey(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$f */
        static final class f extends akcs implements akbk<DeleteKeyByType> {
            private /* synthetic */ a a;

            f(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new DeleteKeyByType(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$c */
        static final class c extends akcs implements akbk<DeleteFeature> {
            private /* synthetic */ a a;

            c(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new DeleteFeature(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$d */
        static final class d extends akcs implements akbk<DeleteFeatureByType> {
            private /* synthetic */ a a;

            d(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new DeleteFeatureByType(this.a.b().getWritableDatabase());
            }
        }

        /* renamed from: tny$a$b */
        static final class b extends akcs implements akbk<DeleteAllByType> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new DeleteAllByType(this.a.b().getWritableDatabase());
            }
        }

        static {
            aken[] akenArr = new aken[]{new akdc(akde.a(a.class), "briteDatabase", "getBriteDatabase()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(a.class), "setBoolean", "getSetBoolean()Lcom/snap/core/db/record/PreferencesModel$SetBoolean;"), new akdc(akde.a(a.class), "setInteger", "getSetInteger()Lcom/snap/core/db/record/PreferencesModel$SetInteger;"), new akdc(akde.a(a.class), "setLong", "getSetLong()Lcom/snap/core/db/record/PreferencesModel$SetLong;"), new akdc(akde.a(a.class), "setFloat", "getSetFloat()Lcom/snap/core/db/record/PreferencesModel$SetFloat;"), new akdc(akde.a(a.class), "setDouble", "getSetDouble()Lcom/snap/core/db/record/PreferencesModel$SetDouble;"), new akdc(akde.a(a.class), "setString", "getSetString()Lcom/snap/core/db/record/PreferencesModel$SetString;"), new akdc(akde.a(a.class), "setFeatureBoolean", "getSetFeatureBoolean()Lcom/snap/core/db/record/PreferencesModel$SetFeatureBoolean;"), new akdc(akde.a(a.class), "setFeatureInteger", "getSetFeatureInteger()Lcom/snap/core/db/record/PreferencesModel$SetFeatureInteger;"), new akdc(akde.a(a.class), "setFeatureLong", "getSetFeatureLong()Lcom/snap/core/db/record/PreferencesModel$SetFeatureLong;"), new akdc(akde.a(a.class), "setFeatureFloat", "getSetFeatureFloat()Lcom/snap/core/db/record/PreferencesModel$SetFeatureFloat;"), new akdc(akde.a(a.class), "setFeatureDouble", "getSetFeatureDouble()Lcom/snap/core/db/record/PreferencesModel$SetFeatureDouble;"), new akdc(akde.a(a.class), "setFeatureString", "getSetFeatureString()Lcom/snap/core/db/record/PreferencesModel$SetFeatureString;"), new akdc(akde.a(a.class), "deleteKey", "getDeleteKey()Lcom/snap/core/db/record/PreferencesModel$DeleteKey;"), new akdc(akde.a(a.class), "deleteKeyByType", "getDeleteKeyByType()Lcom/snap/core/db/record/PreferencesModel$DeleteKeyByType;"), new akdc(akde.a(a.class), "deleteFeature", "getDeleteFeature()Lcom/snap/core/db/record/PreferencesModel$DeleteFeature;"), new akdc(akde.a(a.class), "deleteFeatureByType", "getDeleteFeatureByType()Lcom/snap/core/db/record/PreferencesModel$DeleteFeatureByType;"), new akdc(akde.a(a.class), "deleteAllByType", "getDeleteAllByType()Lcom/snap/core/db/record/PreferencesModel$DeleteAllByType;")};
        }

        public a() {
            super();
        }

        private static PreferencesColumnKey a(fth fth) {
            return new PreferencesColumnKey(fth.b().name(), fth.name());
        }

        private static PreferencesColumnKey a(tnm tnm) {
            return new PreferencesColumnKey(tnm.a.name(), tnm.b);
        }

        private final PreferencesRecord a(PreferencesColumnKey preferencesColumnKey, tno tno) {
            Object selectByKey = PreferencesRecord.FACTORY.selectByKey(preferencesColumnKey.toString(), tno.ordinal());
            akcr.a(selectByKey, "PreferencesRecord.FACTOR…toString(), type.ordinal)");
            Object selectByKeyMapper = PreferencesRecord.FACTORY.selectByKeyMapper();
            akcr.a(selectByKeyMapper, "PreferencesRecord.FACTORY.selectByKeyMapper()");
            return (PreferencesRecord) b().queryFirst(selectByKey, (ainw) selectByKeyMapper);
        }

        private static Object a(PreferencesRecord preferencesRecord) {
            return preferencesRecord != null ? preferencesRecord.booleanValue() != null ? preferencesRecord.booleanValue() : preferencesRecord.longValue() != null ? preferencesRecord.longValue() : preferencesRecord.intValue() != null ? preferencesRecord.intValue() : preferencesRecord.floatValue() != null ? preferencesRecord.floatValue() : preferencesRecord.doubleValue() != null ? preferencesRecord.doubleValue() : preferencesRecord.stringValue() : null;
        }

        private final List<ajxm<PreferencesColumnKey, PreferencesRecord>> a(ainx ainx, Mapper<PreferencesRecord> mapper) {
            Object newArrayList = Lists.newArrayList();
            b().query(ainx, mapper, new g(this, ainx, mapper, newArrayList));
            akcr.a(newArrayList, "results");
            return (List) newArrayList;
        }

        private final List<ajxm<PreferencesColumnKey, PreferencesRecord>> a(PreferencesColumnKey[] preferencesColumnKeyArr) {
            Factory factory = PreferencesRecord.FACTORY;
            String[] strArr = new String[preferencesColumnKeyArr.length];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = preferencesColumnKeyArr[i].toString();
            }
            ainx selectAllByKeys = factory.selectAllByKeys(strArr);
            akcr.a((Object) selectAllByKeys, "PreferencesRecord.FACTOR…-> keys[x].toString() }))");
            Mapper selectAllByKeysMapper = PreferencesRecord.FACTORY.selectAllByKeysMapper();
            akcr.a((Object) selectAllByKeysMapper, "PreferencesRecord.FACTORY.selectAllByKeysMapper()");
            return a(selectAllByKeys, selectAllByKeysMapper);
        }

        private final List<ajxm<PreferencesColumnKey, PreferencesRecord>> a(PreferencesColumnKey[] preferencesColumnKeyArr, tno tno) {
            Factory factory = PreferencesRecord.FACTORY;
            int ordinal = tno.ordinal();
            String[] strArr = new String[preferencesColumnKeyArr.length];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = preferencesColumnKeyArr[i].toString();
            }
            ainx selectByKeys = factory.selectByKeys(ordinal, strArr);
            akcr.a((Object) selectByKeys, "PreferencesRecord.FACTOR…-> keys[x].toString() }))");
            Mapper selectByKeysMapper = PreferencesRecord.FACTORY.selectByKeysMapper();
            akcr.a((Object) selectByKeysMapper, "PreferencesRecord.FACTORY.selectByKeysMapper()");
            return a(selectByKeys, selectByKeysMapper);
        }

        private final DbClient b() {
            return (DbClient) this.b.b();
        }

        private final SetBoolean c() {
            return (SetBoolean) this.c.b();
        }

        private final SetInteger d() {
            return (SetInteger) this.d.b();
        }

        private final SetLong e() {
            return (SetLong) this.e.b();
        }

        private final SetFloat f() {
            return (SetFloat) this.f.b();
        }

        private final SetDouble g() {
            return (SetDouble) this.g.b();
        }

        private final SetString h() {
            return (SetString) this.h.b();
        }

        private final SetFeatureBoolean i() {
            return (SetFeatureBoolean) this.i.b();
        }

        private final SetFeatureInteger j() {
            return (SetFeatureInteger) this.j.b();
        }

        private final SetFeatureLong k() {
            return (SetFeatureLong) this.k.b();
        }

        private final SetFeatureFloat l() {
            return (SetFeatureFloat) this.l.b();
        }

        private final SetFeatureDouble m() {
            return (SetFeatureDouble) this.m.b();
        }

        private final SetFeatureString n() {
            return (SetFeatureString) this.n.b();
        }

        private final DeleteKeyByType o() {
            return (DeleteKeyByType) this.p.b();
        }

        private final DeleteFeatureByType p() {
            return (DeleteFeatureByType) this.r.b();
        }

        public final int a(ftg ftg, tno tno) {
            akcr.b(ftg, "feature");
            akcr.b(tno, "type");
            String name = ftg.name();
            tny.this.d.throwIfNotDbScheduler();
            p().bind(name, tno.ordinal());
            return b().executeUpdateDelete(p());
        }

        public final ajcx a(String str, ajfb<DbTransaction> ajfb) {
            akcr.b(str, "queryTag");
            akcr.b(ajfb, "consumer");
            return b().runInTransactionCompat(str, ajfb);
        }

        public final Object a(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            return a.a(a(a.a(tnm), tno));
        }

        public final Map<tno, Map<tnm, Object>> a(List<tnm> list) {
            akcr.b(list, "keys");
            Object of = ImmutableMap.of(tno.TWEAK, new HashMap(), tno.SERVER, new HashMap(), tno.EXPERIMENT, new HashMap(), tno.SETTING, new HashMap(), tno.FEATURE, new HashMap());
            akcr.a(of, "ImmutableMap.of(\n       …sType.FEATURE, HashMap())");
            HashMap hashMap = new HashMap();
            int size = list.size();
            PreferencesColumnKey[] preferencesColumnKeyArr = new PreferencesColumnKey[size];
            for (int i = 0; i < size; i++) {
                PreferencesColumnKey a = a.a((tnm) list.get(i));
                hashMap.put(a, list.get(i));
                preferencesColumnKeyArr[i] = a;
            }
            for (ajxm ajxm : a(preferencesColumnKeyArr)) {
                PreferencesColumnKey preferencesColumnKey = (PreferencesColumnKey) ajxm.a;
                PreferencesRecord preferencesRecord = (PreferencesRecord) ajxm.b;
                ftg a2 = tny.this.f.a(preferencesColumnKey.getFeature());
                tno tno = tno.values()[preferencesRecord.type()];
                if (a2 == null) {
                    StringBuilder stringBuilder = new StringBuilder("Feature parsing (feature = ");
                    stringBuilder.append(a2);
                    stringBuilder.append(") failed for key: ");
                    stringBuilder.append(preferencesColumnKey);
                    stringBuilder.append(", for type: ");
                    stringBuilder.append(tno);
                    stringBuilder.append(". db PreferencesRecord: ");
                    stringBuilder.append(preferencesRecord);
                    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                } else {
                    tnm tnm = new tnm(a2, preferencesColumnKey.getKey());
                    Object obj = of.get(tno);
                    if (obj == null) {
                        akcr.a();
                    }
                    Map map = (Map) obj;
                    if (tno == tno.FEATURE) {
                        Object a3 = a.a(preferencesRecord);
                        Boolean needSync = preferencesRecord.needSync();
                        if (needSync == null) {
                            needSync = Boolean.FALSE;
                        }
                        boolean booleanValue = needSync.booleanValue();
                        Long version = preferencesRecord.version();
                        if (version == null) {
                            version = Long.valueOf(0);
                        }
                        map.put(tnm, new hxp(a3, booleanValue, version.longValue()));
                    } else {
                        map.put(tnm, a.a(preferencesRecord));
                    }
                }
            }
            return (Map) of;
        }

        public final Map<tnm, Object> a(List<tnm> list, tno tno) {
            akcr.b(list, "keys");
            akcr.b(tno, "type");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = list.size();
            PreferencesColumnKey[] preferencesColumnKeyArr = new PreferencesColumnKey[size];
            for (int i = 0; i < size; i++) {
                PreferencesColumnKey a = a.a((tnm) list.get(i));
                hashMap2.put(a, list.get(i));
                preferencesColumnKeyArr[i] = a;
            }
            for (ajxm ajxm : a(preferencesColumnKeyArr, tno)) {
                PreferencesColumnKey preferencesColumnKey = (PreferencesColumnKey) ajxm.a;
                PreferencesRecord preferencesRecord = (PreferencesRecord) ajxm.b;
                tnm tnm = (tnm) hashMap2.get(preferencesColumnKey);
                if (tnm != null) {
                    hashMap.put(tnm, a.a(preferencesRecord));
                }
            }
            return hashMap;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00c1 in {7, 12, 15, 16, 18, 20, 22} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final java.util.Map<defpackage.tnm, java.lang.Object> a(defpackage.tno r10) {
            /*
            r9 = this;
            r0 = "type";
            defpackage.akcr.b(r10, r0);
            r0 = new java.util.HashMap;
            r0.<init>();
            r1 = com.snap.core.db.record.PreferencesRecord.FACTORY;
            r2 = r10.ordinal();
            r1 = r1.selectAllByType(r2);
            r2 = "PreferencesRecord.FACTOR…ctAllByType(type.ordinal)";
            defpackage.akcr.a(r1, r2);
            r2 = com.snap.core.db.record.PreferencesRecord.FACTORY;
            r2 = r2.selectAllByTypeMapper();
            r3 = "PreferencesRecord.FACTORY.selectAllByTypeMapper()";
            defpackage.akcr.a(r2, r3);
            r1 = r9.a(r1, r2);
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x00bf }
            r1 = r1.iterator();	 Catch:{ all -> 0x00bf }
            r2 = r1.hasNext();	 Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00bc;	 Catch:{ all -> 0x00bf }
            r2 = r1.next();	 Catch:{ all -> 0x00bf }
            r2 = (defpackage.ajxm) r2;	 Catch:{ all -> 0x00bf }
            r3 = r2.a;	 Catch:{ all -> 0x00bf }
            r3 = (com.snap.core.db.column.PreferencesColumnKey) r3;	 Catch:{ all -> 0x00bf }
            r2 = r2.b;	 Catch:{ all -> 0x00bf }
            r2 = (com.snap.core.db.record.PreferencesRecord) r2;	 Catch:{ all -> 0x00bf }
            r4 = defpackage.tny.this;	 Catch:{ all -> 0x00bf }
            r4 = r4.f;	 Catch:{ all -> 0x00bf }
            r5 = r3.getFeature();	 Catch:{ all -> 0x00bf }
            r4 = r4.a(r5);	 Catch:{ all -> 0x00bf }
            if (r4 != 0) goto L_0x007c;	 Catch:{ all -> 0x00bf }
            r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00bf }
            r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bf }
            r7 = "Feature parsing (feature = ";	 Catch:{ all -> 0x00bf }
            r6.<init>(r7);	 Catch:{ all -> 0x00bf }
            r6.append(r4);	 Catch:{ all -> 0x00bf }
            r4 = ") failed for key: ";	 Catch:{ all -> 0x00bf }
            r6.append(r4);	 Catch:{ all -> 0x00bf }
            r6.append(r3);	 Catch:{ all -> 0x00bf }
            r3 = ", for type: ";	 Catch:{ all -> 0x00bf }
            r6.append(r3);	 Catch:{ all -> 0x00bf }
            r6.append(r10);	 Catch:{ all -> 0x00bf }
            r3 = ". db PreferencesRecord: ";	 Catch:{ all -> 0x00bf }
            r6.append(r3);	 Catch:{ all -> 0x00bf }
            r6.append(r2);	 Catch:{ all -> 0x00bf }
            r2 = r6.toString();	 Catch:{ all -> 0x00bf }
            r5.<init>(r2);	 Catch:{ all -> 0x00bf }
            goto L_0x002e;	 Catch:{ all -> 0x00bf }
            r5 = new tnm;	 Catch:{ all -> 0x00bf }
            r3 = r3.getKey();	 Catch:{ all -> 0x00bf }
            r5.<init>(r4, r3);	 Catch:{ all -> 0x00bf }
            r3 = defpackage.tno.FEATURE;	 Catch:{ all -> 0x00bf }
            if (r10 != r3) goto L_0x00b3;	 Catch:{ all -> 0x00bf }
            r3 = new hxp;	 Catch:{ all -> 0x00bf }
            r4 = defpackage.tny.a.a(r2);	 Catch:{ all -> 0x00bf }
            r6 = r2.needSync();	 Catch:{ all -> 0x00bf }
            if (r6 != 0) goto L_0x0097;	 Catch:{ all -> 0x00bf }
            r6 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00bf }
            r6 = r6.booleanValue();	 Catch:{ all -> 0x00bf }
            r2 = r2.version();	 Catch:{ all -> 0x00bf }
            if (r2 != 0) goto L_0x00a7;	 Catch:{ all -> 0x00bf }
            r7 = 0;	 Catch:{ all -> 0x00bf }
            r2 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x00bf }
            r7 = r2.longValue();	 Catch:{ all -> 0x00bf }
            r3.<init>(r4, r6, r7);	 Catch:{ all -> 0x00bf }
            r0.put(r5, r3);	 Catch:{ all -> 0x00bf }
            goto L_0x002e;	 Catch:{ all -> 0x00bf }
            r2 = defpackage.tny.a.a(r2);	 Catch:{ all -> 0x00bf }
            r0.put(r5, r2);	 Catch:{ all -> 0x00bf }
            goto L_0x002e;
            r0 = (java.util.Map) r0;
            return r0;
            r10 = move-exception;
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tny$a.a(tno):java.util.Map");
        }

        public final void a() {
            tny.this.d.throwIfNotDbScheduler();
        }

        public final void a(Map<tnm, ? extends Object> map, tno tno, DbTransaction dbTransaction) {
            akcr.b(map, "values");
            String str = "type";
            akcr.b(tno, str);
            String str2 = "tx";
            akcr.b(dbTransaction, str2);
            for (Entry entry : map.entrySet()) {
                DbClient b;
                SetBoolean c;
                tnm tnm = (tnm) entry.getKey();
                Object value = entry.getValue();
                String str3 = "key";
                akcr.b(tnm, str3);
                akcr.b(tno, str);
                String str4 = "value";
                akcr.b(value, str4);
                akcr.b(dbTransaction, str2);
                PreferencesColumnKey a;
                PreferencesColumnKey a2;
                if (value instanceof Boolean) {
                    boolean booleanValue = ((Boolean) value).booleanValue();
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(dbTransaction, str2);
                    a = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    c().bind(a.toString(), tno.ordinal(), Boolean.valueOf(booleanValue));
                    b = b();
                    c = c();
                } else if (value instanceof Long) {
                    long longValue = ((Number) value).longValue();
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(dbTransaction, str2);
                    a2 = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    e().bind(a2.toString(), tno.ordinal(), Long.valueOf(longValue));
                    b = b();
                    c = e();
                } else if (value instanceof Integer) {
                    int intValue = ((Number) value).intValue();
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(dbTransaction, str2);
                    a = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    d().bind(a.toString(), tno.ordinal(), Integer.valueOf(intValue));
                    b = b();
                    c = d();
                } else if (value instanceof Float) {
                    float floatValue = ((Number) value).floatValue();
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(dbTransaction, str2);
                    a = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    f().bind(a.toString(), tno.ordinal(), Float.valueOf(floatValue));
                    b = b();
                    c = f();
                } else if (value instanceof Double) {
                    double doubleValue = ((Number) value).doubleValue();
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(dbTransaction, str2);
                    a2 = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    g().bind(a2.toString(), tno.ordinal(), Double.valueOf(doubleValue));
                    b = b();
                    c = g();
                } else if (value instanceof String) {
                    String str5 = (String) value;
                    akcr.b(tnm, str3);
                    akcr.b(tno, str);
                    akcr.b(str5, str4);
                    akcr.b(dbTransaction, str2);
                    a = a.a(tnm);
                    tny.this.d.throwIfNotDbScheduler();
                    h().bind(a.toString(), tno.ordinal(), str5);
                    b = b();
                    c = h();
                }
                b.executeInsert(c, dbTransaction);
            }
        }

        public final int b(List<tnm> list, tno tno) {
            akcr.b(list, "keys");
            String str = "type";
            akcr.b(tno, str);
            int i = 0;
            for (tnm tnm : list) {
                akcr.b(tnm, "key");
                akcr.b(tno, str);
                PreferencesColumnKey a = a.a(tnm);
                tny.this.d.throwIfNotDbScheduler();
                o().bind(a.toString(), tno.ordinal());
                i += b().executeUpdateDelete(o());
            }
            return i;
        }

        public final ajcx b(String str, ajfb<DbTransaction> ajfb) {
            akcr.b(str, "queryTag");
            akcr.b(ajfb, "consumer");
            Object scheduleRunInTransaction = tny.this.d.scheduleRunInTransaction(str, ajfb);
            akcr.a(scheduleRunInTransaction, "snapDb.scheduleRunInTran…ction(queryTag, consumer)");
            return scheduleRunInTransaction;
        }

        public final Boolean b(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.booleanValue() : null;
        }

        public final Map<fth, Long> b(Map<fth, ? extends hxp> map, tno tno, DbTransaction dbTransaction) {
            tno tno2 = tno;
            DbTransaction dbTransaction2 = dbTransaction;
            akcr.b(map, "values");
            String str = "type";
            akcr.b(tno2, str);
            String str2 = "tx";
            akcr.b(dbTransaction2, str2);
            HashMap hashMap = new HashMap();
            for (Entry entry : map.entrySet()) {
                DbClient b;
                SetFeatureString i;
                fth fth = (fth) entry.getKey();
                hxp hxp = (hxp) entry.getValue();
                Map map2 = hashMap;
                String str3 = "key";
                akcr.b(fth, str3);
                akcr.b(tno2, str);
                String str4 = "value";
                akcr.b(hxp, str4);
                akcr.b(dbTransaction2, str2);
                Object a = fth.a();
                akcr.a(a, "key.delegate");
                PreferencesColumnKey a2;
                boolean z;
                long j;
                switch (tnz.a[a.a().ordinal()]) {
                    case 1:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        Boolean bool = (Boolean) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        i().bind(a2.toString(), tno.ordinal(), bool, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = i();
                        break;
                    case 2:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        Long l = (Long) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        k().bind(a2.toString(), tno.ordinal(), l, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = k();
                        break;
                    case 3:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        Integer num = (Integer) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        j().bind(a2.toString(), tno.ordinal(), num, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = j();
                        break;
                    case 4:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        Float f = (Float) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        l().bind(a2.toString(), tno.ordinal(), f, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = l();
                        break;
                    case 5:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        Double d = (Double) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        m().bind(a2.toString(), tno.ordinal(), d, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = m();
                        break;
                    case 6:
                        akcr.b(fth, str3);
                        akcr.b(tno2, str);
                        akcr.b(hxp, str4);
                        akcr.b(dbTransaction2, str2);
                        a2 = a.a(fth);
                        String str5 = (String) hxp.a;
                        z = hxp.b;
                        j = hxp.c;
                        tny.this.d.throwIfNotDbScheduler();
                        n().bind(a2.toString(), tno.ordinal(), str5, Boolean.valueOf(z), Long.valueOf(j));
                        b = b();
                        i = n();
                        break;
                    default:
                        throw new ajxk();
                }
                map2.put(fth, Long.valueOf(b.executeInsert(i, dbTransaction2)));
            }
            return hashMap;
        }

        public final Long c(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.longValue() : null;
        }

        public final Integer d(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.intValue() : null;
        }

        public final Float e(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.floatValue() : null;
        }

        public final Double f(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.doubleValue() : null;
        }

        public final String g(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            return a != null ? a.stringValue() : null;
        }

        public final hxp h(tnm tnm, tno tno) {
            akcr.b(tnm, "key");
            akcr.b(tno, "type");
            PreferencesRecord a = a(a.a(tnm), tno);
            if (a == null) {
                return null;
            }
            Object a2 = a.a(a);
            Boolean needSync = a.needSync();
            if (needSync == null) {
                needSync = Boolean.FALSE;
            }
            boolean booleanValue = needSync.booleanValue();
            Long version = a.version();
            if (version == null) {
                version = Long.valueOf(0);
            }
            return new hxp(a2, booleanValue, version.longValue());
        }
    }

    public tny(SnapDb snapDb, toa toa, zgb zgb, tnc tnc) {
        akcr.b(snapDb, "snapDb");
        akcr.b(toa, "feature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tnc, "parser");
        this.d = snapDb;
        this.e = toa;
        this.i = zgb;
        this.f = tnc;
    }

    public final /* bridge */ /* synthetic */ a a() {
        return this.g;
    }
}
