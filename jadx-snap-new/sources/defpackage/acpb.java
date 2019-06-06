package defpackage;

import com.brightcove.player.event.Event;
import com.snapchat.map.feature.effect.WorldEffectJsonPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: acpb */
public final class acpb {
    private static final idd f = adcw.b.callsite("MapEffectsAssetDownloaderKt");
    final aczt a;
    final String b;
    final actz c;
    private final iha d;
    private final jwe e;

    /* renamed from: acpb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acpb$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ acpb a;
        private /* synthetic */ acld b;

        b(acpb acpb, acld acld) {
            this.a = acpb;
            this.b = acld;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "it");
            return new acpj(this.b, kaz);
        }
    }

    /* renamed from: acpb$c */
    static final class c<T, R> implements ajfc<Object[], R> {
        private /* synthetic */ acpb a;
        private /* synthetic */ WorldEffectJsonPayload b;

        c(acpb acpb, WorldEffectJsonPayload worldEffectJsonPayload) {
            this.a = acpb;
            this.b = worldEffectJsonPayload;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0075 in {6, 10, 12, 14, 17, 18, 22, 24} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (java.lang.Object[]) r7;
            r0 = "uploadedEntry";
            defpackage.akcr.b(r7, r0);
            r0 = new java.util.ArrayList;
            r1 = r7.length;
            r0.<init>(r1);
            r0 = (java.util.Collection) r0;
            r1 = r7.length;
            r2 = 0;
            r3 = 0;
            if (r3 >= r1) goto L_0x0044;
            r4 = r7[r3];
            if (r4 == 0) goto L_0x003c;
            r4 = (defpackage.acps) r4;
            r5 = r4 instanceof defpackage.acpq;
            if (r5 == 0) goto L_0x0026;
            r4 = (defpackage.acpq) r4;
            r0.add(r4);
            r3 = r3 + 1;
            goto L_0x0012;
            r7 = r4 instanceof defpackage.acpr;
            if (r7 == 0) goto L_0x0036;
            r7 = new acpn;
            r4 = (defpackage.acpr) r4;
            r0 = r4.a;
            r7.<init>(r0, r2);
            r7 = (defpackage.acpu) r7;
            return r7;
            r7 = new ajxk;
            r7.<init>();
            throw r7;
            r7 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snapchat.map.feature.effect.WorldEffectParamResult";
            r7.<init>(r0);
            throw r7;
            r0 = (java.util.List) r0;
            r7 = r6.a;
            r7 = r7.b;
            r1 = r6.b;
            r1 = r1.getDuration();
            if (r1 == 0) goto L_0x0057;
            r3 = r1.doubleValue();
            goto L_0x0059;
            r3 = 0;
            r0 = (java.util.Collection) r0;
            r1 = new defpackage.acpq[r2];
            r0 = r0.toArray(r1);
            if (r0 == 0) goto L_0x006d;
            r0 = (defpackage.acpq[]) r0;
            r1 = new acpm;
            r1.<init>(r7, r3, r0);
            r1 = (defpackage.acpu) r1;
            return r1;
            r7 = new ajxt;
            r0 = "null cannot be cast to non-null type kotlin.Array<T>";
            r7.<init>(r0);
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acpb$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acpb$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acpb a;

        /* renamed from: acpb$d$a */
        static final class a extends akcq implements akbw<acld, gej, ajdx<? extends acpl>> {
            a(acpb acpb) {
                super(2, acpb);
            }

            public final String getName() {
                return "decodeFromDisk";
            }

            public final akej getOwner() {
                return akde.a(acpb.class);
            }

            public final String getSignature() {
                return "decodeFromDisk(Lcom/snapchat/map/ParticleSimulationParams;Lcom/snap/core/net/content/api/ContentResult;)Lio/reactivex/Single;";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                acld acld = (acld) obj;
                gej gej = (gej) obj2;
                akcr.b(acld, "p1");
                akcr.b(gej, "p2");
                return ((acpb) this.receiver).a(acld, gej);
            }
        }

        /* renamed from: acpb$d$b */
        static final class b extends akcq implements akbw<acld, acpl, ajdx<acps>> {
            b(acpb acpb) {
                super(2, acpb);
            }

            public final String getName() {
                return "uploadToGPU";
            }

            public final akej getOwner() {
                return akde.a(acpb.class);
            }

            public final String getSignature() {
                return "uploadToGPU(Lcom/snapchat/map/ParticleSimulationParams;Lcom/snapchat/map/feature/effect/ParticleSimulationParamsAssetResult;)Lio/reactivex/Single;";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                acld acld = (acld) obj;
                acpl acpl = (acpl) obj2;
                akcr.b(acld, "p1");
                akcr.b(acpl, "p2");
                acpb acpb = (acpb) this.receiver;
                akcr.b(acld, "params");
                akcr.b(acpl, "input");
                obj = ajdx.a((ajea) new e(acpb, acpl, acld));
                akcr.a(obj, "Single.create<WorldEffec…}\n            }\n        }");
                return obj;
            }
        }

        d(acpb acpb) {
            this.a = acpb;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x00b2 in {5, 6, 8, 11, 13} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.gej) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r7.a;
            r8 = r0.a(r8);
            r0 = r8 instanceof com.snapchat.map.feature.effect.WorldEffectJsonPayload;
            if (r0 == 0) goto L_0x0097;
            r0 = r7.a;
            r8 = (com.snapchat.map.feature.effect.WorldEffectJsonPayload) r8;
            r1 = r8.getParticles();
            r1 = defpackage.ajyi.f(r1);
            r1 = (java.lang.Iterable) r1;
            r2 = new java.util.ArrayList;
            r3 = 10;
            r3 = defpackage.ajyn.a(r1, r3);
            r2.<init>(r3);
            r2 = (java.util.Collection) r2;
            r1 = r1.iterator();
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x0082;
            r3 = r1.next();
            r3 = (com.snapchat.map.ParticleSimulationPayload) r3;
            r3 = r3.withDefaults();
            r4 = r7.a;
            r4 = r4.a;
            r5 = r7.a;
            r5 = r5.b;
            r6 = r3.z;
            r4 = r4.a(r5, r6);
            r5 = new acpb$d$a;
            r6 = r7.a;
            r5.<init>(r6);
            r5 = (defpackage.akbw) r5;
            r5 = defpackage.ihw.a(r5, r3);
            r6 = new acpd;
            r6.<init>(r5);
            r6 = (defpackage.ajfc) r6;
            r4 = r4.a(r6);
            r5 = new acpb$d$b;
            r6 = r7.a;
            r5.<init>(r6);
            r5 = (defpackage.akbw) r5;
            r3 = defpackage.ihw.a(r5, r3);
            r5 = new acpd;
            r5.<init>(r3);
            r5 = (defpackage.ajfc) r5;
            r3 = r4.a(r5);
            r2.add(r3);
            goto L_0x0030;
            r2 = (java.util.List) r2;
            r2 = (java.lang.Iterable) r2;
            r1 = new acpb$c;
            r1.<init>(r0, r8);
            r1 = (defpackage.ajfc) r1;
            r8 = defpackage.ajdx.a(r2, r1);
            r0 = "Single.zip<WorldEffectPa…toTypedArray())\n        }";
            defpackage.akcr.a(r8, r0);
            return r8;
            r0 = r8 instanceof defpackage.acpo;
            if (r0 == 0) goto L_0x00ac;
            r0 = new acpn;
            r8 = (defpackage.acpo) r8;
            r8 = r8.a;
            r1 = 0;
            r0.<init>(r8, r1);
            r8 = defpackage.ajdx.b(r0);
            r0 = "Single.just(WorldEffectError(payload.exception))";
            goto L_0x0093;
            r8 = new ajxk;
            r8.<init>();
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acpb$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acpb$e */
    static final class e<T> implements ajea<T> {
        final /* synthetic */ acld a;
        private /* synthetic */ acpb b;
        private /* synthetic */ acpl c;

        e(acpb acpb, acpl acpl, acld acld) {
            this.b = acpb;
            this.c = acpl;
            this.a = acld;
        }

        public final void subscribe(final ajdy<acps> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            acpl acpl = this.c;
            if (acpl instanceof acpj) {
                this.b.c.a(((acpj) this.c).a, "MapEffectsAssetDownloaderKt", (acus) new acus(this) {
                    private /* synthetic */ e a;

                    public final void onTextureUploaded(acxn acxn) {
                        Object obj = ajdy;
                        akcr.a(obj, Event.EMITTER);
                        if (!obj.isDisposed()) {
                            ajdy ajdy;
                            Object acpr;
                            if (acxn == null || !acxn.a()) {
                                ajdy = ajdy;
                                acpr = new acpr(new IllegalStateException("TextureEntry was not valid ".concat(String.valueOf(acxn))));
                            } else {
                                ajdy = ajdy;
                                acpr = new acpq(this.a.a, acxn);
                            }
                            ajdy.a(acpr);
                        }
                    }
                });
                ((acpj) this.c).a.dispose();
                return;
            }
            if ((acpl instanceof acpk) && !ajdy.isDisposed()) {
                ajdy.a(new acpr(((acpk) this.c).b, ((acpk) this.c).a));
            }
        }
    }

    static {
        a aVar = new a();
    }

    public acpb(aczt aczt, iha iha, jwe jwe, String str, actz actz) {
        akcr.b(aczt, "downloader");
        akcr.b(iha, "serializationHelper");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(str, "effectUrl");
        akcr.b(actz, "glThread");
        this.a = aczt;
        this.d = iha;
        this.e = jwe;
        this.b = str;
        this.c = actz;
    }

    public final acpp a(gej gej) {
        String str = "Failed to parse json.";
        akcr.b(gej, "contentResult");
        if (gej instanceof ghx) {
            return new acpo(((ghx) gej).e().c());
        }
        Closeable closeable;
        acpp acpp;
        try {
            Object c = gej.c();
            akcr.a(c, "contentResult.assets");
            gdt gdt = (gdt) ajyu.a((List) c, 0);
            if (gdt != null) {
                c = gdt.b();
                if (c != null) {
                    akcr.a(c, "contentResult.assets.get… returned had no items.\")");
                    closeable = (Closeable) c;
                    String a = aklc.a((InputStream) closeable, Charset.forName("UTF-8"));
                    akax.a(closeable, null);
                    WorldEffectJsonPayload worldEffectJsonPayload = (WorldEffectJsonPayload) this.d.a(a, WorldEffectJsonPayload.class);
                    if (worldEffectJsonPayload == null) {
                        return new acpo(str);
                    }
                    acpp = worldEffectJsonPayload;
                    return acpp;
                }
            }
            return new acpo("Asset returned had no items.");
        } catch (Exception e) {
            acpp = new acpo((Throwable) new IOException(str, e));
        } catch (Throwable th) {
            akax.a(closeable, r1);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x008c, code skipped:
            if (r7 == null) goto L_0x00b4;
     */
    public final defpackage.ajdx<? extends defpackage.acpl> a(defpackage.acld r7, defpackage.gej r8) {
        /*
        r6 = this;
        r0 = "params";
        defpackage.akcr.b(r7, r0);
        r0 = "contentResult";
        defpackage.akcr.b(r8, r0);
        r0 = r8 instanceof defpackage.ghx;
        if (r0 == 0) goto L_0x0027;
    L_0x000e:
        r7 = new acpk;
        r8 = (defpackage.ghx) r8;
        r8 = r8.e();
        r8 = r8.c();
        r7.<init>(r8);
        r7 = defpackage.ajdx.b(r7);
        r8 = "Single.just(ParticleSimu…ult.failureReason.error))";
        defpackage.akcr.a(r7, r8);
        return r7;
    L_0x0027:
        r8 = r8.c();
        r0 = "contentResult.assets";
        defpackage.akcr.a(r8, r0);
        r0 = 0;
        r8 = defpackage.ajyu.a(r8, r0);
        r8 = (defpackage.gdt) r8;
        if (r8 == 0) goto L_0x00b4;
    L_0x0039:
        r8 = r8.b();
        if (r8 == 0) goto L_0x00b4;
    L_0x003f:
        r8 = (java.io.Closeable) r8;
        r0 = 0;
        r1 = r8;
        r1 = (java.io.InputStream) r1;	 Catch:{ Throwable -> 0x00ad }
        r2 = r1.available();	 Catch:{ Throwable -> 0x00ad }
        r2 = new byte[r2];	 Catch:{ Throwable -> 0x00ad }
        r3 = r2.length;	 Catch:{ Throwable -> 0x00ad }
        r1 = defpackage.aklc.a(r1, r2, r3);	 Catch:{ Throwable -> 0x00ad }
        if (r1 != r3) goto L_0x008f;
    L_0x0052:
        r1 = r6.e;	 Catch:{ Throwable -> 0x00ad }
        r1 = r1.a();	 Catch:{ Throwable -> 0x00ad }
        r3 = new jwf;	 Catch:{ Throwable -> 0x00ad }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ad }
        r4.<init>();	 Catch:{ Throwable -> 0x00ad }
        r5 = r6.b;	 Catch:{ Throwable -> 0x00ad }
        r4.append(r5);	 Catch:{ Throwable -> 0x00ad }
        r5 = r7.z;	 Catch:{ Throwable -> 0x00ad }
        r4.append(r5);	 Catch:{ Throwable -> 0x00ad }
        r4 = r4.toString();	 Catch:{ Throwable -> 0x00ad }
        r5 = new java.io.ByteArrayInputStream;	 Catch:{ Throwable -> 0x00ad }
        r5.<init>(r2);	 Catch:{ Throwable -> 0x00ad }
        r5 = (java.io.InputStream) r5;	 Catch:{ Throwable -> 0x00ad }
        r2 = 1;
        r3.<init>(r4, r5, r2);	 Catch:{ Throwable -> 0x00ad }
        r2 = f;	 Catch:{ Throwable -> 0x00ad }
        r1 = r1.a(r3, r2);	 Catch:{ Throwable -> 0x00ad }
        r2 = new acpb$b;	 Catch:{ Throwable -> 0x00ad }
        r2.<init>(r6, r7);	 Catch:{ Throwable -> 0x00ad }
        r2 = (defpackage.ajfc) r2;	 Catch:{ Throwable -> 0x00ad }
        r7 = r1.f(r2);	 Catch:{ Throwable -> 0x00ad }
        defpackage.akax.a(r8, r0);
        if (r7 != 0) goto L_0x00c4;
    L_0x008e:
        goto L_0x00b4;
    L_0x008f:
        r7 = new java.io.EOFException;	 Catch:{ Throwable -> 0x00ad }
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ad }
        r4 = "Length to read: ";
        r2.<init>(r4);	 Catch:{ Throwable -> 0x00ad }
        r2.append(r3);	 Catch:{ Throwable -> 0x00ad }
        r3 = " actual: ";
        r2.append(r3);	 Catch:{ Throwable -> 0x00ad }
        r2.append(r1);	 Catch:{ Throwable -> 0x00ad }
        r1 = r2.toString();	 Catch:{ Throwable -> 0x00ad }
        r7.<init>(r1);	 Catch:{ Throwable -> 0x00ad }
        throw r7;	 Catch:{ Throwable -> 0x00ad }
    L_0x00ab:
        r7 = move-exception;
        goto L_0x00b0;
    L_0x00ad:
        r7 = move-exception;
        r0 = r7;
        throw r0;	 Catch:{ all -> 0x00ab }
    L_0x00b0:
        defpackage.akax.a(r8, r0);
        throw r7;
    L_0x00b4:
        r7 = new acpk;
        r8 = "Empty assets were returned.";
        r7.<init>(r8);
        r7 = defpackage.ajdx.b(r7);
        r8 = "Single.just(ParticleSimu… assets were returned.\"))";
        defpackage.akcr.a(r7, r8);
    L_0x00c4:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpb.a(acld, gej):ajdx");
    }
}
