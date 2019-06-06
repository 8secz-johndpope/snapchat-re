package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.RemoteAssetType;
import com.looksery.sdk.listener.RemoteAssetsListener;
import defpackage.mhn.a;
import defpackage.miq.c;
import defpackage.miq.e;
import defpackage.miq.f;
import defpackage.mmi.c.a.d;
import defpackage.mny.b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mlj */
public final class mlj implements RemoteAssetsListener, mny {
    final mhn a = new mhn();
    final ConcurrentHashMap<mjg, e> b = new ConcurrentHashMap();
    final ajwo<b> c;
    final mka d;
    private final mkx e;
    private final akbk<String> f;
    private final lnr g;
    private final ajdp<Boolean> h;

    /* renamed from: mlj$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mlj a;

        a(mlj mlj) {
            this.a = mlj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setRemoteAssetsListener(this.a);
            return ajxw.a;
        }
    }

    /* renamed from: mlj$b */
    static final class b implements ajev {
        private /* synthetic */ mlj a;

        b(mlj mlj) {
            this.a = mlj;
        }

        public final void run() {
            this.a.a.a((akbl) a.a);
            this.a.b.clear();
        }
    }

    /* renamed from: mlj$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mkx a;

        /* renamed from: mlj$d$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.mmi.c.a.d;
            }
        }

        d(mkx mkx) {
            this.a = mkx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "retainAssets");
            if (bool.booleanValue()) {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            } else {
                obj = this.a.a().b().a((ajfl) a.a).a(defpackage.mmi.c.a.d.class);
                str = "this.filter { it is R }.cast(R::class.java)";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: mlj$c */
    static final class c<T> implements ajfb<d> {
        private /* synthetic */ mlj a;

        c(mlj mlj) {
            this.a = mlj;
        }

        public final /* synthetic */ void accept(Object obj) {
            final d dVar = (d) obj;
            this.a.a.a((akbl) new akbl<String, Boolean>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    obj = (String) obj;
                    akcr.b(obj, "it");
                    return Boolean.valueOf(akcr.a(obj, dVar.a.a) ^ 1);
                }
            });
        }
    }

    /* renamed from: mlj$h */
    static final class h<T> implements ajfl<Boolean> {
        private /* synthetic */ mjg a;
        private /* synthetic */ lny b;
        private /* synthetic */ mhs.b c;
        private /* synthetic */ mhs d;
        private /* synthetic */ mhs.b e;
        private /* synthetic */ mlj f;
        private /* synthetic */ String g;
        private /* synthetic */ String h;
        private /* synthetic */ String i;
        private /* synthetic */ RemoteAssetType j;
        private /* synthetic */ f.b k;
        private /* synthetic */ byte[] l;
        private /* synthetic */ byte[] m;

        h(mjg mjg, lny lny, mhs.b bVar, mhs mhs, mhs.b bVar2, mlj mlj, String str, String str2, String str3, RemoteAssetType remoteAssetType, f.b bVar3, byte[] bArr, byte[] bArr2) {
            this.a = mjg;
            this.b = lny;
            this.c = bVar;
            this.d = mhs;
            this.e = bVar2;
            this.f = mlj;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = remoteAssetType;
            this.k = bVar3;
            this.l = bArr;
            this.m = bArr2;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "retainAssets");
            e eVar = (e) this.f.b.get(this.a);
            if (!bool.booleanValue() || eVar == null) {
                return true;
            }
            this.f.a().accept(new mny.a(this.b, this.c, this.d, this.e, eVar));
            return false;
        }
    }

    /* renamed from: mlj$i */
    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ lny a;
        private /* synthetic */ mhs.b b;
        private /* synthetic */ mhs.b c;
        private /* synthetic */ mhs d;
        private /* synthetic */ mlj e;
        private /* synthetic */ String f;
        private /* synthetic */ String g;
        private /* synthetic */ String h;
        private /* synthetic */ RemoteAssetType i;
        private /* synthetic */ f.b j;
        private /* synthetic */ byte[] k;
        private /* synthetic */ byte[] l;

        i(lny lny, mhs.b bVar, mhs.b bVar2, mhs mhs, mlj mlj, String str, String str2, String str3, RemoteAssetType remoteAssetType, f.b bVar3, byte[] bArr, byte[] bArr2) {
            this.a = lny;
            this.b = bVar;
            this.c = bVar2;
            this.d = mhs;
            this.e = mlj;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = remoteAssetType;
            this.j = bVar3;
            this.k = bArr;
            this.l = bArr2;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.e.c.a((Object) new b(this.a, this.b, this.d, this.c, this.k, this.l));
        }
    }

    /* renamed from: mlj$g */
    static final class g<T> implements ajfb<ajej> {
        private /* synthetic */ String a;
        private /* synthetic */ mlj b;
        private /* synthetic */ mny.a c;

        g(String str, mlj mlj, mny.a aVar) {
            this.a = str;
            this.b = mlj;
            this.c = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajej ajej = (ajej) obj;
            mhn mhn = this.b.a;
            String str = this.a;
            akcr.a((Object) ajej, "resourceDisposable");
            mhn.a(str, ajej);
            this.b.a(this.c);
        }
    }

    /* renamed from: mlj$f */
    static final class f extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mny.a a;

        f(mny.a aVar) {
            this.a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.provideRemoteAsset(this.a.b.a, this.a.d.a, this.a.e.a());
            return ajxw.a;
        }
    }

    /* renamed from: mlj$e */
    static final class e extends akcq implements akbl<mny.a, ajxw> {
        e(mlj mlj) {
            super(1, mlj);
        }

        public final String getName() {
            return "processResult";
        }

        public final akej getOwner() {
            return akde.a(mlj.class);
        }

        public final String getSignature() {
            return "processResult(Lcom/snap/lenses/core/RemoteAssetsProcessor$RemoteAssetDescriptor;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mny.a aVar = (mny.a) obj;
            akcr.b(aVar, "p1");
            mlj mlj = (mlj) this.receiver;
            mlj.b.put(new mjg(aVar.b, aVar.a, aVar.c), aVar.e);
            defpackage.miq.e eVar = aVar.e;
            if (!(eVar instanceof miq.d.a)) {
                eVar = null;
            }
            miq.d.a aVar2 = (miq.d.a) eVar;
            if (aVar2 != null) {
                String str = aVar.d.a;
                mhn mhn = mlj.a;
                ajej e = mlj.d.a(aVar2).e((ajfb) new g(str, mlj, aVar));
                akcr.a((Object) e, "coreResourceManager.upda…  }\n                    }");
                mhn.a(str, e);
            } else {
                mlj.a(aVar);
            }
            return ajxw.a;
        }
    }

    /* renamed from: mlj$j */
    static final class j implements ajev {
        public static final j a = new j();

        j() {
        }

        public final void run() {
        }
    }

    /* renamed from: mlj$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public mlj(mkx mkx, mka mka, akbk<String> akbk, lnr lnr, ajdp<Boolean> ajdp) {
        akcr.b(mkx, "lensCore");
        akcr.b(mka, "coreResourceManager");
        akcr.b(akbk, "uuidGenerator");
        akcr.b(lnr, "assetUploader");
        akcr.b(ajdp, "retainAssets");
        this.e = mkx;
        this.d = mka;
        this.f = akbk;
        this.g = lnr;
        this.h = ajdp;
        mkx = this.e;
        mkx.c(new a(this));
        ajej a = ajek.a((ajev) new b(this));
        akcr.a((Object) a, "Disposables.fromAction {…ris.clear()\n            }");
        mkx.a(a);
        a = this.h.u(new d(mkx)).f((ajfb) new c(this));
        akcr.a((Object) a, "retainAssets\n           …e }\n                    }");
        mkx.a(a);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Re…sor.RemoteAssetRequest>()");
        this.c = ajwo;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x00b0 in {9, 11, 13, 14, 16, 18, 20} preds:[]
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
    private final void a(java.lang.String r22, com.looksery.sdk.domain.RemoteAssetType r23, java.lang.String r24, java.lang.String r25, byte[] r26, byte[] r27, defpackage.miq.f.b r28) {
        /*
        r21 = this;
        r15 = r21;
        r0 = r25;
        r14 = r28;
        r13 = new mhs$b;	 Catch:{ all -> 0x00ae }
        r12 = r22;	 Catch:{ all -> 0x00ae }
        r13.<init>(r12);	 Catch:{ all -> 0x00ae }
        r11 = new mhs$b;	 Catch:{ all -> 0x00ae }
        r11.<init>(r0);	 Catch:{ all -> 0x00ae }
        r10 = defpackage.mhs.a.a(r24);	 Catch:{ all -> 0x00ae }
        r1 = defpackage.mlk.a;	 Catch:{ all -> 0x00ae }
        r2 = r23.ordinal();	 Catch:{ all -> 0x00ae }
        r1 = r1[r2];	 Catch:{ all -> 0x00ae }
        r2 = 1;	 Catch:{ all -> 0x00ae }
        if (r1 == r2) goto L_0x0044;	 Catch:{ all -> 0x00ae }
        r2 = 2;	 Catch:{ all -> 0x00ae }
        if (r1 == r2) goto L_0x003f;	 Catch:{ all -> 0x00ae }
        r2 = 3;	 Catch:{ all -> 0x00ae }
        if (r1 != r2) goto L_0x0039;	 Catch:{ all -> 0x00ae }
        if (r14 == 0) goto L_0x002f;	 Catch:{ all -> 0x00ae }
        r1 = new lny$a$a;	 Catch:{ all -> 0x00ae }
        r1.<init>(r14);	 Catch:{ all -> 0x00ae }
        goto L_0x0041;	 Catch:{ all -> 0x00ae }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00ae }
        r1 = "URL asset type has empty URL!";	 Catch:{ all -> 0x00ae }
        r0.<init>(r1);	 Catch:{ all -> 0x00ae }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x00ae }
        throw r0;	 Catch:{ all -> 0x00ae }
        r0 = new ajxk;	 Catch:{ all -> 0x00ae }
        r0.<init>();	 Catch:{ all -> 0x00ae }
        throw r0;	 Catch:{ all -> 0x00ae }
        r1 = defpackage.lny.b.a;	 Catch:{ all -> 0x00ae }
        r1 = (defpackage.lny) r1;	 Catch:{ all -> 0x00ae }
        goto L_0x0047;	 Catch:{ all -> 0x00ae }
        r1 = defpackage.lny.a.b.a;	 Catch:{ all -> 0x00ae }
        goto L_0x0041;	 Catch:{ all -> 0x00ae }
        r9 = r1;	 Catch:{ all -> 0x00ae }
        r2 = new mjg;	 Catch:{ all -> 0x00ae }
        r2.<init>(r13, r9, r10);	 Catch:{ all -> 0x00ae }
        r8 = r15.a;	 Catch:{ all -> 0x00ae }
        r7 = r15.h;	 Catch:{ all -> 0x00ae }
        r16 = new mlj$h;	 Catch:{ all -> 0x00ae }
        r1 = r16;	 Catch:{ all -> 0x00ae }
        r3 = r9;	 Catch:{ all -> 0x00ae }
        r4 = r13;	 Catch:{ all -> 0x00ae }
        r5 = r10;	 Catch:{ all -> 0x00ae }
        r6 = r11;	 Catch:{ all -> 0x00ae }
        r15 = r7;	 Catch:{ all -> 0x00ae }
        r7 = r21;	 Catch:{ all -> 0x00ae }
        r0 = r8;	 Catch:{ all -> 0x00ae }
        r8 = r22;	 Catch:{ all -> 0x00ae }
        r17 = r9;	 Catch:{ all -> 0x00ae }
        r9 = r25;	 Catch:{ all -> 0x00ae }
        r18 = r10;	 Catch:{ all -> 0x00ae }
        r10 = r24;	 Catch:{ all -> 0x00ae }
        r19 = r11;	 Catch:{ all -> 0x00ae }
        r11 = r23;	 Catch:{ all -> 0x00ae }
        r12 = r28;	 Catch:{ all -> 0x00ae }
        r20 = r13;	 Catch:{ all -> 0x00ae }
        r13 = r26;	 Catch:{ all -> 0x00ae }
        r14 = r27;	 Catch:{ all -> 0x00ae }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x00ae }
        r1 = r16;	 Catch:{ all -> 0x00ae }
        r1 = (defpackage.ajfl) r1;	 Catch:{ all -> 0x00ae }
        r14 = r15.a(r1);	 Catch:{ all -> 0x00ae }
        r15 = new mlj$i;	 Catch:{ all -> 0x00ae }
        r1 = r15;	 Catch:{ all -> 0x00ae }
        r2 = r17;	 Catch:{ all -> 0x00ae }
        r3 = r20;	 Catch:{ all -> 0x00ae }
        r4 = r19;	 Catch:{ all -> 0x00ae }
        r5 = r18;	 Catch:{ all -> 0x00ae }
        r6 = r21;	 Catch:{ all -> 0x00ae }
        r7 = r22;	 Catch:{ all -> 0x00ae }
        r8 = r25;	 Catch:{ all -> 0x00ae }
        r9 = r24;	 Catch:{ all -> 0x00ae }
        r10 = r23;	 Catch:{ all -> 0x00ae }
        r11 = r28;	 Catch:{ all -> 0x00ae }
        r12 = r26;	 Catch:{ all -> 0x00ae }
        r13 = r27;	 Catch:{ all -> 0x00ae }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ all -> 0x00ae }
        r15 = (defpackage.ajfb) r15;	 Catch:{ all -> 0x00ae }
        r1 = r14.f(r15);	 Catch:{ all -> 0x00ae }
        r2 = "retainAssets\n           …st)\n                    }";	 Catch:{ all -> 0x00ae }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00ae }
        r2 = r0;	 Catch:{ all -> 0x00ae }
        r0 = r25;	 Catch:{ all -> 0x00ae }
        r2.a(r0, r1);	 Catch:{ all -> 0x00ae }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlj.a(java.lang.String, com.looksery.sdk.domain.RemoteAssetType, java.lang.String, java.lang.String, byte[], byte[], miq$f$b):void");
    }

    public final ajfb<mny.a> a() {
        return new mll(new e(this));
    }

    /* Access modifiers changed, original: final */
    public final void a(mny.a aVar) {
        this.e.b(new f(aVar));
    }

    public final /* bridge */ /* synthetic */ ajdp b() {
        return this.c;
    }

    public final String requestEncryptAndUploadAsset(String str, String str2, byte[] bArr, byte[] bArr2, boolean z) {
        akcr.b(str, "path");
        akcr.b(str2, "effectId");
        akcr.b(bArr, "encryptionKey");
        akcr.b(bArr2, "encryptionIv");
        try {
            c.a a = miq.a.a(str);
            str = (String) this.f.invoke();
            ajej a2 = this.g.a(new lnr.b(str, a, bArr, bArr2, z)).a((ajev) j.a, (ajfb) k.a);
            mhn mhn = this.a;
            akcr.a((Object) a2, "it");
            mhn.a(str2, a2);
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void requestEncryptedRemoteAsset(String str, RemoteAssetType remoteAssetType, String str2, String str3, byte[] bArr, byte[] bArr2) {
        akcr.b(str, "assetId");
        akcr.b(remoteAssetType, "type");
        akcr.b(str2, "avatarId");
        akcr.b(str3, "effectId");
        a(str, remoteAssetType, str2, str3, bArr, bArr2, null);
    }

    public final void requestRemoteAsset(String str, RemoteAssetType remoteAssetType, String str2, String str3) {
        akcr.b(str, "assetId");
        akcr.b(remoteAssetType, "type");
        akcr.b(str2, "avatarId");
        akcr.b(str3, "effectId");
        a(str, remoteAssetType, str2, str3, null, null, null);
    }

    public final void requestRemoteAssetByUrl(String str, RemoteAssetType remoteAssetType, String str2, String str3) {
        akcr.b(str, "assetId");
        akcr.b(remoteAssetType, "assetType");
        akcr.b(str2, "effectId");
        akcr.b(str3, "url");
        if (remoteAssetType == RemoteAssetType.URL) {
            miq b = miq.a.b(str3);
            if (!(b instanceof f.b)) {
                b = null;
            }
            f.b bVar = (f.b) b;
            if (bVar != null) {
                a(str, remoteAssetType, "", str2, null, null, bVar);
            }
        }
    }

    public final String requestUploadAsset(String str, String str2, boolean z) {
        akcr.b(str, "p0");
        akcr.b(str2, "p1");
        return "";
    }
}
