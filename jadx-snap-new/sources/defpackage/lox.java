package defpackage;

import defpackage.lrj.a;
import defpackage.lsa.d;
import defpackage.lsa.d.a.b;
import defpackage.mec.a.c;

/* renamed from: lox */
public final class lox implements mhi<mha> {
    final zfw a;
    final ajfb<Boolean> b;
    final ajfb<Boolean> c;
    final ajfb<lwo> d;
    final ajdp<lqf> e;
    final boolean f;
    private final lpj g;
    private final mhi<a> h;
    private final mhi<mdu> i;

    /* renamed from: lox$s */
    public static final class s implements mha {
        private /* synthetic */ a a;
        private /* synthetic */ mdu b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ ajdp e;
        private /* synthetic */ ajdp f;
        private /* synthetic */ mec g;
        private /* synthetic */ ajdp h;
        private /* synthetic */ lox i;

        s(a aVar, mdu mdu, lqh lqh, lsa lsa, ajdp ajdp, ajdp ajdp2, mec mec, ajdp ajdp3, lox lox) {
            this.a = aVar;
            this.b = mdu;
            this.c = lqh;
            this.d = lsa;
            this.e = ajdp;
            this.f = ajdp2;
            this.g = mec;
            this.h = ajdp3;
            this.i = lox;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0256 in {6, 7, 12, 14, 17, 20, 22, 23, 25, 27} preds:[]
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
        public final defpackage.ajej a() {
            /*
            r19 = this;
            r1 = r19;
            r0 = new ajei;	 Catch:{ all -> 0x0254 }
            r0.<init>();	 Catch:{ all -> 0x0254 }
            r2 = r1.a;	 Catch:{ all -> 0x0254 }
            if (r2 == 0) goto L_0x007e;	 Catch:{ all -> 0x0254 }
            r2 = r1.i;	 Catch:{ all -> 0x0254 }
            r3 = r1.c;	 Catch:{ all -> 0x0254 }
            r4 = r1.d;	 Catch:{ all -> 0x0254 }
            r5 = r1.e;	 Catch:{ all -> 0x0254 }
            r6 = new ajei;	 Catch:{ all -> 0x0254 }
            r6.<init>();	 Catch:{ all -> 0x0254 }
            r7 = r4.b();	 Catch:{ all -> 0x0254 }
            r7 = defpackage.lpc.a(r7, r3);	 Catch:{ all -> 0x0254 }
            r8 = defpackage.lsb.a;	 Catch:{ all -> 0x0254 }
            if (r8 == 0) goto L_0x002a;	 Catch:{ all -> 0x0254 }
            r9 = new lpd;	 Catch:{ all -> 0x0254 }
            r9.<init>(r8);	 Catch:{ all -> 0x0254 }
            r8 = r9;	 Catch:{ all -> 0x0254 }
            r8 = (defpackage.ajey) r8;	 Catch:{ all -> 0x0254 }
            r7 = r7.a(r8);	 Catch:{ all -> 0x0254 }
            r8 = defpackage.lox.f.a;	 Catch:{ all -> 0x0254 }
            r8 = (defpackage.ajfc) r8;	 Catch:{ all -> 0x0254 }
            r7 = r7.p(r8);	 Catch:{ all -> 0x0254 }
            r8 = "carouselUseCase.outputs\n…      }\n                }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r7, r8);	 Catch:{ all -> 0x0254 }
            r8 = "AttachCarouselAndSnappablesToCamera#attachCarousel:cameraUseCaseInputs";	 Catch:{ all -> 0x0254 }
            r7 = defpackage.mip.c(r7, r8);	 Catch:{ all -> 0x0254 }
            r8 = r3.a();	 Catch:{ all -> 0x0254 }
            r7 = r7.f(r8);	 Catch:{ all -> 0x0254 }
            r6.a(r7);	 Catch:{ all -> 0x0254 }
            r7 = defpackage.lpc.a(r5, r3);	 Catch:{ all -> 0x0254 }
            r8 = new lox$e;	 Catch:{ all -> 0x0254 }
            r8.<init>(r2, r4, r3, r5);	 Catch:{ all -> 0x0254 }
            r8 = (defpackage.ajfc) r8;	 Catch:{ all -> 0x0254 }
            r2 = r7.a(r8);	 Catch:{ all -> 0x0254 }
            r3 = defpackage.ajfu.a;	 Catch:{ all -> 0x0254 }
            r2 = r2.j(r3);	 Catch:{ all -> 0x0254 }
            r3 = "carouselUi\n             …  .distinctUntilChanged()";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0254 }
            r3 = "AttachCarouselAndSnappablesToCamera#attachCarousel:carouselUseCaseInputs";	 Catch:{ all -> 0x0254 }
            r2 = defpackage.mip.c(r2, r3);	 Catch:{ all -> 0x0254 }
            r3 = r4.a();	 Catch:{ all -> 0x0254 }
            r2 = r2.f(r3);	 Catch:{ all -> 0x0254 }
            r6.a(r2);	 Catch:{ all -> 0x0254 }
            r6 = (defpackage.ajej) r6;	 Catch:{ all -> 0x0254 }
            r0.a(r6);	 Catch:{ all -> 0x0254 }
            r2 = r1.b;	 Catch:{ all -> 0x0254 }
            if (r2 == 0) goto L_0x0251;	 Catch:{ all -> 0x0254 }
            r2 = r1.i;	 Catch:{ all -> 0x0254 }
            r11 = r1.c;	 Catch:{ all -> 0x0254 }
            r12 = r1.d;	 Catch:{ all -> 0x0254 }
            r13 = r1.f;	 Catch:{ all -> 0x0254 }
            r14 = r1.g;	 Catch:{ all -> 0x0254 }
            r15 = r1.h;	 Catch:{ all -> 0x0254 }
            r10 = new ajei;	 Catch:{ all -> 0x0254 }
            r10.<init>();	 Catch:{ all -> 0x0254 }
            r3 = r2.f;	 Catch:{ all -> 0x0254 }
            if (r3 == 0) goto L_0x009f;	 Catch:{ all -> 0x0254 }
            r3 = r15.l();	 Catch:{ all -> 0x0254 }
            r10.a(r3);	 Catch:{ all -> 0x0254 }
            goto L_0x00b9;	 Catch:{ all -> 0x0254 }
            r16 = new lox$g;	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r4 = r2;	 Catch:{ all -> 0x0254 }
            r5 = r15;	 Catch:{ all -> 0x0254 }
            r6 = r11;	 Catch:{ all -> 0x0254 }
            r7 = r12;	 Catch:{ all -> 0x0254 }
            r8 = r14;	 Catch:{ all -> 0x0254 }
            r9 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.akbk) r3;	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lpc.a(r11, r3);	 Catch:{ all -> 0x0254 }
            r3 = r3.l();	 Catch:{ all -> 0x0254 }
            goto L_0x009b;	 Catch:{ all -> 0x0254 }
            r3 = r12.b();	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lpc.a(r3, r11);	 Catch:{ all -> 0x0254 }
            r4 = defpackage.lsb.a;	 Catch:{ all -> 0x0254 }
            if (r4 == 0) goto L_0x00cb;	 Catch:{ all -> 0x0254 }
            r5 = new lpd;	 Catch:{ all -> 0x0254 }
            r5.<init>(r4);	 Catch:{ all -> 0x0254 }
            r4 = r5;	 Catch:{ all -> 0x0254 }
            r4 = (defpackage.ajey) r4;	 Catch:{ all -> 0x0254 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x0254 }
            r4 = defpackage.lox.q.a;	 Catch:{ all -> 0x0254 }
            r4 = (defpackage.ajfc) r4;	 Catch:{ all -> 0x0254 }
            r9 = r3.p(r4);	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lox.r.a;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajfl) r3;	 Catch:{ all -> 0x0254 }
            r8 = r9.a(r3);	 Catch:{ all -> 0x0254 }
            r3 = "isSnappableSelected";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r9, r3);	 Catch:{ all -> 0x0254 }
            r3 = r2.f;	 Catch:{ all -> 0x0254 }
            if (r3 == 0) goto L_0x00f6;	 Catch:{ all -> 0x0254 }
            r3 = defpackage.ajot.a;	 Catch:{ all -> 0x0254 }
            r3 = defpackage.ajvo.a(r3);	 Catch:{ all -> 0x0254 }
            r4 = "Observable.empty()";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            goto L_0x0101;	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lox.d.a;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x0254 }
            r3 = r9.p(r3);	 Catch:{ all -> 0x0254 }
            r4 = "snappableSelections\n    …                        }";	 Catch:{ all -> 0x0254 }
            goto L_0x00f2;	 Catch:{ all -> 0x0254 }
            r4 = r14.b();	 Catch:{ all -> 0x0254 }
            r5 = defpackage.lox.c.a;	 Catch:{ all -> 0x0254 }
            r5 = (defpackage.ajfc) r5;	 Catch:{ all -> 0x0254 }
            r4 = r4.u(r5);	 Catch:{ all -> 0x0254 }
            r5 = "snappablesUseCase.output…      }\n                }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0254 }
            r5 = r11.b();	 Catch:{ all -> 0x0254 }
            r6 = defpackage.lox.a.a;	 Catch:{ all -> 0x0254 }
            r6 = (defpackage.ajey) r6;	 Catch:{ all -> 0x0254 }
            r5 = r5.a(r6);	 Catch:{ all -> 0x0254 }
            r6 = "distinctUntilChanged { o…activated\n        }\n    }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x0254 }
            r6 = new lox$b;	 Catch:{ all -> 0x0254 }
            r6.<init>(r3, r4);	 Catch:{ all -> 0x0254 }
            r6 = (defpackage.ajfc) r6;	 Catch:{ all -> 0x0254 }
            r3 = r5.u(r6);	 Catch:{ all -> 0x0254 }
            r4 = "cameraUseCase.whenActiva…      }\n                }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r4 = r2.a;	 Catch:{ all -> 0x0254 }
            r4 = r4.l();	 Catch:{ all -> 0x0254 }
            r4 = (defpackage.zfr) r4;	 Catch:{ all -> 0x0254 }
            r4 = (defpackage.ajdw) r4;	 Catch:{ all -> 0x0254 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x0254 }
            r4 = "cameraUseCase.whenActiva…dSchedulers.mainThread())";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r4 = "AttachCarouselAndSnappablesToCamera#attachCaptureActionToSnappables:captureActionConsumer";	 Catch:{ all -> 0x0254 }
            r3 = defpackage.mip.c(r3, r4);	 Catch:{ all -> 0x0254 }
            r4 = r2.d;	 Catch:{ all -> 0x0254 }
            r3 = r3.f(r4);	 Catch:{ all -> 0x0254 }
            r4 = "cameraUseCase.whenActiva…be(captureActionConsumer)";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r10.a(r3);	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lox.m.a;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x0254 }
            r3 = r9.p(r3);	 Catch:{ all -> 0x0254 }
            r4 = "isSnappableSelected\n    …on.Hide\n                }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r4 = r14.a();	 Catch:{ all -> 0x0254 }
            r3 = r3.f(r4);	 Catch:{ all -> 0x0254 }
            r10.a(r3);	 Catch:{ all -> 0x0254 }
            r16 = new lox$h;	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r4 = r8;	 Catch:{ all -> 0x0254 }
            r5 = r2;	 Catch:{ all -> 0x0254 }
            r6 = r15;	 Catch:{ all -> 0x0254 }
            r7 = r11;	 Catch:{ all -> 0x0254 }
            r1 = r8;	 Catch:{ all -> 0x0254 }
            r8 = r12;	 Catch:{ all -> 0x0254 }
            r17 = r0;	 Catch:{ all -> 0x0254 }
            r0 = r9;	 Catch:{ all -> 0x0254 }
            r9 = r14;	 Catch:{ all -> 0x0254 }
            r18 = r10;	 Catch:{ all -> 0x0254 }
            r10 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.akbk) r3;	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lpc.a(r11, r3);	 Catch:{ all -> 0x0254 }
            r4 = defpackage.ajfu.a;	 Catch:{ all -> 0x0254 }
            r10 = r3.j(r4);	 Catch:{ all -> 0x0254 }
            r16 = new lox$i;	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r4 = r2;	 Catch:{ all -> 0x0254 }
            r5 = r15;	 Catch:{ all -> 0x0254 }
            r6 = r11;	 Catch:{ all -> 0x0254 }
            r7 = r12;	 Catch:{ all -> 0x0254 }
            r8 = r14;	 Catch:{ all -> 0x0254 }
            r9 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0254 }
            r3 = r16;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajev) r3;	 Catch:{ all -> 0x0254 }
            r3 = r10.b(r3);	 Catch:{ all -> 0x0254 }
            r4 = "cameraUseCase\n          …t(true)\n                }";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r4 = defpackage.lox.n.a;	 Catch:{ all -> 0x0254 }
            r4 = (defpackage.ajfl) r4;	 Catch:{ all -> 0x0254 }
            r0 = r0.a(r4);	 Catch:{ all -> 0x0254 }
            r0 = (defpackage.ajdt) r0;	 Catch:{ all -> 0x0254 }
            r0 = r3.j(r0);	 Catch:{ all -> 0x0254 }
            r3 = new lox$o;	 Catch:{ all -> 0x0254 }
            r3.<init>(r1);	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x0254 }
            r0 = r0.t(r3);	 Catch:{ all -> 0x0254 }
            r8 = r1;	 Catch:{ all -> 0x0254 }
            r8 = (defpackage.ajdt) r8;	 Catch:{ all -> 0x0254 }
            r0 = r0.d(r8);	 Catch:{ all -> 0x0254 }
            r1 = "cameraUseCase\n          …iption(snappableSelected)";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0254 }
            r1 = "AttachCarouselAndSnappablesToCamera#attachSnappables:startButtonHideSignalConsumer";	 Catch:{ all -> 0x0254 }
            r0 = defpackage.mip.c(r0, r1);	 Catch:{ all -> 0x0254 }
            r1 = r2.c;	 Catch:{ all -> 0x0254 }
            r0 = r0.f(r1);	 Catch:{ all -> 0x0254 }
            r1 = r18;	 Catch:{ all -> 0x0254 }
            r1.a(r0);	 Catch:{ all -> 0x0254 }
            r0 = new lox$j;	 Catch:{ all -> 0x0254 }
            r3 = r0;	 Catch:{ all -> 0x0254 }
            r4 = r2;	 Catch:{ all -> 0x0254 }
            r5 = r15;	 Catch:{ all -> 0x0254 }
            r6 = r11;	 Catch:{ all -> 0x0254 }
            r7 = r12;	 Catch:{ all -> 0x0254 }
            r8 = r14;	 Catch:{ all -> 0x0254 }
            r9 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0254 }
            r0 = (defpackage.akbk) r0;	 Catch:{ all -> 0x0254 }
            r0 = defpackage.lpc.a(r11, r0);	 Catch:{ all -> 0x0254 }
            r3 = r2.e;	 Catch:{ all -> 0x0254 }
            r4 = defpackage.lqf.b.a.class;	 Catch:{ all -> 0x0254 }
            r3 = r3.b(r4);	 Catch:{ all -> 0x0254 }
            r4 = "ofType(R::class.java)";	 Catch:{ all -> 0x0254 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajdt) r3;	 Catch:{ all -> 0x0254 }
            r0 = r0.j(r3);	 Catch:{ all -> 0x0254 }
            r10 = new lox$k;	 Catch:{ all -> 0x0254 }
            r3 = r10;	 Catch:{ all -> 0x0254 }
            r4 = r2;	 Catch:{ all -> 0x0254 }
            r5 = r15;	 Catch:{ all -> 0x0254 }
            r6 = r11;	 Catch:{ all -> 0x0254 }
            r7 = r12;	 Catch:{ all -> 0x0254 }
            r8 = r14;	 Catch:{ all -> 0x0254 }
            r9 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0254 }
            r10 = (defpackage.ajfc) r10;	 Catch:{ all -> 0x0254 }
            r0 = r0.t(r10);	 Catch:{ all -> 0x0254 }
            r3 = defpackage.lox.p.a;	 Catch:{ all -> 0x0254 }
            r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x0254 }
            r0 = r0.p(r3);	 Catch:{ all -> 0x0254 }
            r3 = r11.a();	 Catch:{ all -> 0x0254 }
            r0 = r0.f(r3);	 Catch:{ all -> 0x0254 }
            r1.a(r0);	 Catch:{ all -> 0x0254 }
            r0 = new lox$l;	 Catch:{ all -> 0x0254 }
            r3 = r0;	 Catch:{ all -> 0x0254 }
            r4 = r2;	 Catch:{ all -> 0x0254 }
            r5 = r15;	 Catch:{ all -> 0x0254 }
            r6 = r11;	 Catch:{ all -> 0x0254 }
            r7 = r12;	 Catch:{ all -> 0x0254 }
            r8 = r14;	 Catch:{ all -> 0x0254 }
            r9 = r13;	 Catch:{ all -> 0x0254 }
            r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0254 }
            r0 = (defpackage.akbk) r0;	 Catch:{ all -> 0x0254 }
            r0 = defpackage.lpc.a(r11, r0);	 Catch:{ all -> 0x0254 }
            r2 = r2.b;	 Catch:{ all -> 0x0254 }
            r0 = r0.f(r2);	 Catch:{ all -> 0x0254 }
            r1.a(r0);	 Catch:{ all -> 0x0254 }
            r10 = r1;	 Catch:{ all -> 0x0254 }
            r10 = (defpackage.ajej) r10;	 Catch:{ all -> 0x0254 }
            r0 = r17;	 Catch:{ all -> 0x0254 }
            r0.a(r10);	 Catch:{ all -> 0x0254 }
            r0 = (defpackage.ajej) r0;
            return r0;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lox$s.a():ajej");
        }

        public final ajdp<Object> b() {
            return mha.a.a(this);
        }
    }

    /* renamed from: lox$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0036 in {3, 6, 8, 11, 13} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.lsa.d) r5;
            r0 = "result";
            defpackage.akcr.b(r5, r0);
            r0 = r5 instanceof defpackage.lsa.d.a.b;
            r1 = "Carousel";
            if (r0 == 0) goto L_0x001c;
            r0 = new lqh$a$a$c;
            r5 = (defpackage.lsa.d.a.b) r5;
            r5 = r5.a;
            r2 = 0;
            r3 = 14;
            r0.<init>(r5, r2, r1, r3);
            r0 = (defpackage.lqh.a) r0;
            return r0;
            r0 = r5 instanceof defpackage.lsa.d.a.a;
            if (r0 == 0) goto L_0x0029;
            r5 = new lqh$a$a$a;
            r0 = 3;
            r5.<init>(r1, r0);
            r5 = (defpackage.lqh.a) r5;
            return r5;
            r5 = r5 instanceof defpackage.lsa.d.b;
            if (r5 == 0) goto L_0x0030;
            r5 = defpackage.lqh.a.b.a;
            goto L_0x0026;
            r5 = new ajxk;
            r5.<init>();
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lox$f.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lox$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lox a;
        private /* synthetic */ lsa b;
        private /* synthetic */ lqh c;
        private /* synthetic */ ajdp d;

        e(lox lox, lsa lsa, lqh lqh, ajdp ajdp) {
            this.a = lox;
            this.b = lsa;
            this.c = lqh;
            this.d = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            return myu.b(this.c.b(), this.a.e).u(loy.a);
        }
    }

    /* renamed from: lox$g */
    static final class g extends akcs implements akbk<ajdp<Object>> {
        private /* synthetic */ lox a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ mec e;
        private /* synthetic */ ajdp f;

        g(lox lox, ajdp ajdp, lqh lqh, lsa lsa, mec mec, ajdp ajdp2) {
            this.a = lox;
            this.b = ajdp;
            this.c = lqh;
            this.d = lsa;
            this.e = mec;
            this.f = ajdp2;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.b;
        }
    }

    /* renamed from: lox$q */
    static final class q<T, R> implements ajfc<T, R> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "result");
            boolean z = false;
            if (dVar instanceof b) {
                b bVar = (b) dVar;
                for (Object next : bVar.a()) {
                    if (akcr.a(((mux) next).a, bVar.a)) {
                        break;
                    }
                }
                Object next2 = null;
                mux mux = (mux) next2;
                if (mux != null ? mux.a() : false) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: lox$r */
    static final class r<T> implements ajfl<Boolean> {
        public static final r a = new r();

        r() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isSnappable");
            return bool.booleanValue();
        }
    }

    /* renamed from: lox$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isSnappable");
            return bool.booleanValue() ? lwo.a.a.a : lwo.a.b.a;
        }
    }

    /* renamed from: lox$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            obj = (defpackage.mec.c) obj;
            akcr.b(obj, "it");
            if (akcr.a(obj, defpackage.mec.c.a.a)) {
                obj = ajdp.b(lwo.a.b.a);
                str = "Observable.just(CameraCo…ptureAvailability.Enable)";
            } else if (obj instanceof defpackage.mec.c.b) {
                obj = ajdp.b(lwo.a.a.a);
                str = "Observable.just(CameraCo…tureAvailability.Disable)";
            } else {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lox$a */
    public static final class a<T1, T2> implements ajey<lqh.b, lqh.b> {
        public static final a a = new a();

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            lqh.b bVar = (lqh.b) obj;
            obj2 = (lqh.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(obj2, "new");
            if (bVar instanceof defpackage.lqh.b.a) {
                return obj2 instanceof defpackage.lqh.b.a;
            }
            if (bVar instanceof lqh.b.b) {
                return akcr.a(obj2, lqh.b.b.a);
            }
            throw new ajxk();
        }
    }

    /* renamed from: lox$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ajdp a;
        private /* synthetic */ ajdp b;

        b(ajdp ajdp, ajdp ajdp2) {
            this.a = ajdp;
            this.b = ajdp2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
            akcr.b(bVar, "result");
            return bVar instanceof defpackage.lqh.b.a ? ajdp.b((ajdt) this.a, (ajdt) this.b) : ajdp.b(defpackage.lwo.a.b.a);
        }
    }

    /* renamed from: lox$m */
    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isSnappable");
            return bool.booleanValue() ? mec.a.d.a.a : c.a;
        }
    }

    /* renamed from: lox$h */
    static final class h extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ ajdp a;
        private /* synthetic */ lox b;
        private /* synthetic */ ajdp c;
        private /* synthetic */ lqh d;
        private /* synthetic */ lsa e;
        private /* synthetic */ mec f;
        private /* synthetic */ ajdp g;

        h(ajdp ajdp, lox lox, ajdp ajdp2, lqh lqh, lsa lsa, mec mec, ajdp ajdp3) {
            this.a = ajdp;
            this.b = lox;
            this.c = ajdp2;
            this.d = lqh;
            this.e = lsa;
            this.f = mec;
            this.g = ajdp3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.g.a((ajdw) this.b.a.l()).u(loz.a).e((ajdt) this.a.p(lpa.a)).h(Boolean.FALSE);
        }
    }

    /* renamed from: lox$i */
    static final class i implements ajev {
        private /* synthetic */ lox a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ mec e;
        private /* synthetic */ ajdp f;

        i(lox lox, ajdp ajdp, lqh lqh, lsa lsa, mec mec, ajdp ajdp2) {
            this.a = lox;
            this.b = ajdp;
            this.c = lqh;
            this.d = lsa;
            this.e = mec;
            this.f = ajdp2;
        }

        public final void run() {
            this.a.c.accept(Boolean.TRUE);
        }
    }

    /* renamed from: lox$n */
    static final class n<T> implements ajfl<Boolean> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isSnabbale");
            return !bool.booleanValue();
        }
    }

    /* renamed from: lox$o */
    static final class o<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ ajdp a;

        o(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "it");
            return this.a;
        }
    }

    /* renamed from: lox$j */
    static final class j extends akcs implements akbk<ajdp<mec.c.b>> {
        private /* synthetic */ lox a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ mec e;
        private /* synthetic */ ajdp f;

        j(lox lox, ajdp ajdp, lqh lqh, lsa lsa, mec mec, ajdp ajdp2) {
            this.a = lox;
            this.b = ajdp;
            this.c = lqh;
            this.d = lsa;
            this.e = mec;
            this.f = ajdp2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.e.b().a((ajfl) lpb.a).a(mec.c.b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            return a;
        }
    }

    /* renamed from: lox$k */
    static final class k<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ lox a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ mec e;
        private /* synthetic */ ajdp f;

        k(lox lox, ajdp ajdp, lqh lqh, lsa lsa, mec mec, ajdp ajdp2) {
            this.a = lox;
            this.b = ajdp;
            this.c = lqh;
            this.d = lsa;
            this.e = mec;
            this.f = ajdp2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "it");
            obj = this.a.e.b(lqf.b.b.class);
            akcr.a(obj, "ofType(R::class.java)");
            return obj;
        }
    }

    /* renamed from: lox$p */
    static final class p<T, R> implements ajfc<T, R> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mec.c.b bVar = (mec.c.b) obj;
            akcr.b(bVar, "<name for destructuring parameter 0>");
            return new lqh.a.a.c(bVar.a, true, "Carousel", 12);
        }
    }

    /* renamed from: lox$l */
    static final class l extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ lox a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lqh c;
        private /* synthetic */ lsa d;
        private /* synthetic */ mec e;
        private /* synthetic */ ajdp f;

        l(lox lox, ajdp ajdp, lqh lqh, lsa lsa, mec mec, ajdp ajdp2) {
            this.a = lox;
            this.b = ajdp;
            this.c = lqh;
            this.d = lsa;
            this.e = mec;
            this.f = ajdp2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp b = this.e.b();
            akbl akbl = lpc.a;
            if (akbl != null) {
                akbl = new lpe(akbl);
            }
            return b.u((ajfc) akbl);
        }
    }

    public lox(lpj lpj, zfw zfw, mhi<a> mhi, mhi<mdu> mhi2, ajfb<Boolean> ajfb, ajfb<Boolean> ajfb2, ajfb<lwo> ajfb3, ajdp<lqf> ajdp, boolean z) {
        akcr.b(lpj, "cameraComponent");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajfb, "carouselHideSignalConsumer");
        akcr.b(ajfb2, "startButtonHideSignalConsumer");
        akcr.b(ajfb3, "captureActionConsumer");
        akcr.b(ajdp, "cameraLifecycle");
        this.g = lpj;
        this.a = zfw;
        this.h = mhi;
        this.i = mhi2;
        this.b = ajfb;
        this.c = ajfb2;
        this.d = ajfb3;
        this.e = ajdp;
        this.f = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x0096 in {3, 4, 7, 8, 13, 16, 23, 24, 27, 31, 32, 38, 39, 41, 43} preds:[]
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
    private defpackage.mha b() {
        /*
        r11 = this;
        r0 = r11.g;	 Catch:{ all -> 0x0094 }
        r4 = r0.c();	 Catch:{ all -> 0x0094 }
        r0 = r11.h;	 Catch:{ all -> 0x0094 }
        r1 = 0;	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x0013;	 Catch:{ all -> 0x0094 }
        r0 = r0.a();	 Catch:{ all -> 0x0094 }
        r0 = (defpackage.lrj.a) r0;	 Catch:{ all -> 0x0094 }
        r2 = r0;	 Catch:{ all -> 0x0094 }
        goto L_0x0014;	 Catch:{ all -> 0x0094 }
        r2 = r1;	 Catch:{ all -> 0x0094 }
        if (r2 == 0) goto L_0x001c;	 Catch:{ all -> 0x0094 }
        r0 = r2.c();	 Catch:{ all -> 0x0094 }
        if (r0 != 0) goto L_0x0020;	 Catch:{ all -> 0x0094 }
        r0 = defpackage.lsa.c.a;	 Catch:{ all -> 0x0094 }
        r0 = (defpackage.lsa) r0;	 Catch:{ all -> 0x0094 }
        r5 = r0;	 Catch:{ all -> 0x0094 }
        if (r2 == 0) goto L_0x002c;	 Catch:{ all -> 0x0094 }
        r0 = r2.e();	 Catch:{ all -> 0x0094 }
        if (r0 != 0) goto L_0x002a;	 Catch:{ all -> 0x0094 }
        goto L_0x002c;	 Catch:{ all -> 0x0094 }
        r7 = r0;	 Catch:{ all -> 0x0094 }
        goto L_0x0038;	 Catch:{ all -> 0x0094 }
        r0 = defpackage.lsd.c.a;	 Catch:{ all -> 0x0094 }
        r0 = defpackage.ajdp.b(r0);	 Catch:{ all -> 0x0094 }
        r3 = "Observable.just(CarouselView.Noop)";	 Catch:{ all -> 0x0094 }
        defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x0094 }
        goto L_0x002a;
        r0 = "empty()";
        if (r2 == 0) goto L_0x004c;
        r3 = r2.b();	 Catch:{ all -> 0x0094 }
        if (r3 == 0) goto L_0x004c;	 Catch:{ all -> 0x0094 }
        r3 = defpackage.ajpy.k(r3);	 Catch:{ all -> 0x0094 }
        r3 = r3.a();	 Catch:{ all -> 0x0094 }
        if (r3 != 0) goto L_0x0055;	 Catch:{ all -> 0x0094 }
        r3 = defpackage.ajot.a;	 Catch:{ all -> 0x0094 }
        r3 = defpackage.ajvo.a(r3);	 Catch:{ all -> 0x0094 }
        defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x0094 }
        r6 = r3;	 Catch:{ all -> 0x0094 }
        r3 = r11.i;	 Catch:{ all -> 0x0094 }
        if (r3 == 0) goto L_0x0060;	 Catch:{ all -> 0x0094 }
        r1 = r3.a();	 Catch:{ all -> 0x0094 }
        r1 = (defpackage.mdu) r1;	 Catch:{ all -> 0x0094 }
        r3 = r1;	 Catch:{ all -> 0x0094 }
        if (r3 == 0) goto L_0x0069;	 Catch:{ all -> 0x0094 }
        r1 = r3.i();	 Catch:{ all -> 0x0094 }
        if (r1 != 0) goto L_0x006d;	 Catch:{ all -> 0x0094 }
        r1 = defpackage.mec.b.a;	 Catch:{ all -> 0x0094 }
        r1 = (defpackage.mec) r1;	 Catch:{ all -> 0x0094 }
        r8 = r1;	 Catch:{ all -> 0x0094 }
        if (r3 == 0) goto L_0x0080;	 Catch:{ all -> 0x0094 }
        r1 = r3.b();	 Catch:{ all -> 0x0094 }
        if (r1 == 0) goto L_0x0080;	 Catch:{ all -> 0x0094 }
        r1 = defpackage.ajpy.k(r1);	 Catch:{ all -> 0x0094 }
        r1 = r1.a();	 Catch:{ all -> 0x0094 }
        if (r1 != 0) goto L_0x0089;	 Catch:{ all -> 0x0094 }
        r1 = defpackage.ajot.a;	 Catch:{ all -> 0x0094 }
        r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x0094 }
        defpackage.akcr.a(r1, r0);	 Catch:{ all -> 0x0094 }
        r9 = r1;	 Catch:{ all -> 0x0094 }
        r0 = new lox$s;	 Catch:{ all -> 0x0094 }
        r1 = r0;	 Catch:{ all -> 0x0094 }
        r10 = r11;	 Catch:{ all -> 0x0094 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0094 }
        r0 = (defpackage.mha) r0;	 Catch:{ all -> 0x0094 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lox.b():mha");
    }

    public final /* synthetic */ Object a() {
        return b();
    }
}
