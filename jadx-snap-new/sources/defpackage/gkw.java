package defpackage;

import com.google.common.base.Optional;
import defpackage.gla.e;
import defpackage.ryx.a;
import defpackage.ryx.b;
import defpackage.ryx.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: gkw */
public final class gkw implements ifj {
    final String a;
    final ajwy<gkn> b;
    final gla c;
    final ablp d;
    private final ajwl<ajxm<aasw, aata>> e;
    private final Optional<ajwy<rym>> f;

    /* renamed from: gkw$b */
    static final class b extends akcq implements akbl<iff<d>, ajxw> {
        b(gkw gkw) {
            super(1, gkw);
        }

        public final String getName() {
            return "onRequestReceived";
        }

        public final akej getOwner() {
            return akde.a(gkw.class);
        }

        public final String getSignature() {
            return "onRequestReceived(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:52:0x01c4 in {5, 6, 11, 14, 24, 26, 27, 28, 29, 30, 33, 34, 39, 40, 45, 49, 51} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
            /*
            r17 = this;
            r0 = r18;
            r0 = (defpackage.iff) r0;
            r1 = "p1";
            defpackage.akcr.b(r0, r1);
            r1 = r17;
            r2 = r1.receiver;
            r2 = (defpackage.gkw) r2;
            r3 = r0.b;
            r4 = new gkw$a;
            r4.<init>();
            r5 = 2;
            r6 = new defpackage.aasr[r5];
            r7 = r4.a;
            r7 = (defpackage.aasr) r7;
            r8 = 0;
            r6[r8] = r7;
            r7 = r4.b;
            r7 = (defpackage.aasr) r7;
            r9 = 1;
            r6[r9] = r7;
            r7 = 0;
            if (r8 >= r5) goto L_0x00db;
            r10 = r6[r8];
            r11 = r2.b;
            r11 = r11.get();
            r12 = "appStateProvider.get()";
            defpackage.akcr.a(r11, r12);
            r11 = (defpackage.gkn) r11;
            r12 = r0.c;
            r13 = r2.a;
            r14 = r0.a;
            r14 = (defpackage.ryx.d) r14;
            r14 = r14.a;
            r15 = r0.a;
            r15 = (defpackage.ryx.d) r15;
            r15 = r15.b;
            r11 = r11.a();
            r11 = (defpackage.gdl) r11;
            r10.a(r13);
            r13 = r11.a;
            r16 = defpackage.gky.c;
            r13 = r13.ordinal();
            r13 = r16[r13];
            if (r13 == r9) goto L_0x0061;
            r13 = defpackage.aabc.IN_BACKGROUND;
            goto L_0x0063;
            r13 = defpackage.aabc.ACTIVE_FOREGROUND;
            r10.a(r13);
            r11 = r11.b;
            r11 = r12.a(r11);
            r11 = java.lang.Long.valueOf(r11);
            r10.a(r11);
            r11 = r14;
            r11 = (defpackage.sak) r11;
            r12 = r11.m();
            if (r12 == 0) goto L_0x0088;
            r13 = "__xsc_local__:capture_media_id";
            r12 = r12.get(r13);
            if (r12 == 0) goto L_0x0088;
            r7 = r12.toString();
            r12 = defpackage.sap.a(r11);
            if (r7 != 0) goto L_0x008f;
            r7 = r12;
            r10.b(r7);
            r10.c(r15);
            r7 = r14.b();
            r12 = "networkRequest.type";
            defpackage.akcr.a(r7, r12);
            r12 = defpackage.gky.a;
            r7 = r7.ordinal();
            r7 = r12[r7];
            if (r7 == r9) goto L_0x00c5;
            if (r7 == r5) goto L_0x00c2;
            r12 = 3;
            if (r7 == r12) goto L_0x00bf;
            r12 = 4;
            if (r7 == r12) goto L_0x00bc;
            r12 = 5;
            if (r7 != r12) goto L_0x00b6;
            r7 = defpackage.aatc.STREAMING;
            goto L_0x00c7;
            r0 = new ajxk;
            r0.<init>();
            throw r0;
            r7 = defpackage.aatc.UPLOAD;
            goto L_0x00c7;
            r7 = defpackage.aatc.LARGE_MEDIA_DOWNLOAD;
            goto L_0x00c7;
            r7 = defpackage.aatc.SMALL_MEDIA_DOWNLOAD;
            goto L_0x00c7;
            r7 = defpackage.aatc.METADATA;
            r10.a(r7);
            r7 = defpackage.sap.b(r11);
            if (r7 == 0) goto L_0x00d7;
            r7 = defpackage.gkz.a.a(r7);
            r10.d(r7);
            r8 = r8 + 1;
            goto L_0x0027;
            r5 = r4.a;
            r6 = r2.d;
            r8 = r0.c;
            r8 = r8.b;
            r10 = r6.a();
            r8 = r8 - r10;
            r6 = java.lang.Long.valueOf(r8);
            r5.b(r6);
            r6 = "warm_start";
            r5.e(r6);
            r5 = r4.a;
            r6 = r0.a;
            r6 = (defpackage.ryx.d) r6;
            r6 = r6.c;
            r8 = defpackage.gkx.b(r6);
            r5.a(r8);
            r8 = r6.d;
            r8 = java.lang.Long.valueOf(r8);
            r5.c(r8);
            r8 = defpackage.gkx.a(r6);
            r5.f(r8);
            r8 = r6.a;
            r5.h(r8);
            r6 = r6.b;
            r5.i(r6);
            r5 = r4.a;
            r6 = r0.a;
            r6 = (defpackage.ryx.d) r6;
            r6 = r6.a;
            r8 = r6.i();
            r5.j(r8);
            r6 = r6.c();
            r8 = "request.schedulingContexts";
            defpackage.akcr.a(r6, r8);
            r6 = defpackage.rzh.a(r6);
            r6 = defpackage.gkd.a(r6);
            r5.k(r6);
            r5 = r4.b;
            r6 = r0.a;
            r6 = (defpackage.ryx.d) r6;
            r6 = r6.a;
            r6 = (defpackage.sak) r6;
            r6 = r6.m();
            if (r6 == 0) goto L_0x015d;
            r8 = "__xsc_local__:media_orchestration_attempt_id";
            r6 = r6.get(r8);
            if (r6 == 0) goto L_0x015d;
            r6 = r6.toString();
            goto L_0x015e;
            r6 = r7;
            r5.m(r6);
            r5 = r4.b;
            r6 = r0.a;
            r6 = (defpackage.ryx.d) r6;
            r6 = r6.a;
            r6 = (defpackage.sak) r6;
            r6 = r6.m();
            if (r6 == 0) goto L_0x017d;
            r8 = "__xsc_local__:send_message_attempt_id";
            r6 = r6.get(r8);
            if (r6 == 0) goto L_0x017d;
            r7 = r6.toString();
            r5.n(r7);
            r5 = "value";
            defpackage.akcr.b(r4, r5);
            r5 = r4.getClass();
            r3 = r3.a;
            r3 = r3.putIfAbsent(r5, r4);
            if (r3 != 0) goto L_0x01a5;
            r2 = r2.c;
            r3 = "event";
            defpackage.akcr.b(r0, r3);
            r3 = new gla$f;
            r3.<init>(r2, r0);
            r3 = (defpackage.akbk) r3;
            defpackage.gkv.a(r0, r3);
            r0 = defpackage.ajxw.a;
            return r0;
            r0 = new java.lang.IllegalArgumentException;
            r2 = new java.lang.StringBuilder;
            r3 = "Key: ";
            r2.<init>(r3);
            r3 = r5.getCanonicalName();
            r2.append(r3);
            r3 = " already existed";
            r2.append(r3);
            r2 = r2.toString();
            r0.<init>(r2);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkw$b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: gkw$c */
    static final class c extends akcq implements akbl<iff<a>, ajxw> {
        c(gkw gkw) {
            super(1, gkw);
        }

        public final String getName() {
            return "onRequestExecuting";
        }

        public final akej getOwner() {
            return akde.a(gkw.class);
        }

        public final String getSignature() {
            return "onRequestExecuting(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkw gkw = (gkw) this.receiver;
            a aVar = (a) iff.b.a(a.class);
            if (aVar != null) {
                aasw aasw = aVar.b;
                rxk rxk = ((a) iff.a).b;
                aasw.a(gkx.b(rxk));
                aasw.b(Long.valueOf(rxk.d));
                aasw.e(gkx.a(rxk));
                aasw.c(Long.valueOf(rxk.f));
                aasw.f(rxk.g.toString());
                aasw.g(rxk.a);
                aasw.h(rxk.b);
                aasw aasw2 = aVar.b;
                ryz ryz = ((a) iff.a).a;
                Map l = ryz.l();
                String str = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>";
                if (l != null) {
                    String b = sbc.b(l, "Content-Type");
                    String str2 = "N/A";
                    if (b == null) {
                        b = str2;
                    }
                    Map l2 = ryz.l();
                    if (l2 != null) {
                        str = sbc.b(l2, "Content-Encoding");
                        if (str == null) {
                            str = str2;
                        }
                        aasw2.s(gkx.a(b, str));
                        l = ryz.m();
                        if (l != null) {
                            Object obj2 = l.get("__xsc_local__:capture_media_id");
                            if (obj2 != null) {
                                aasw2.b(obj2.toString());
                            }
                        }
                        Object c = ryz.c();
                        akcr.a(c, "request.schedulingContexts");
                        Iterable<rzg> iterable = (Iterable) c;
                        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (rzg rzg : iterable) {
                            arrayList.add(rzg.e);
                        }
                        String str3 = (String) ajyu.g((List) arrayList);
                        if (str3 != null) {
                            aasw2.b(str3);
                        }
                    } else {
                        throw new ajxt(str);
                    }
                }
                throw new ajxt(str);
            }
            gla gla = gkw.c;
            akcr.b(iff, "event");
            gkv.a(iff, (akbk) new e(gla, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gkw$d */
    static final class d extends akcq implements akbl<iff<b>, ajxw> {
        d(gkw gkw) {
            super(1, gkw);
        }

        public final String getName() {
            return "onRequestFinishedInfo";
        }

        public final akej getOwner() {
            return akde.a(gkw.class);
        }

        public final String getSignature() {
            return "onRequestFinishedInfo(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        /* JADX WARNING: Removed duplicated region for block: B:87:0x036c  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0221  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x026d  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x027f  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x036c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0221  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x026d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x027f  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x036c  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
            /*
            r18 = this;
            r0 = r19;
            r0 = (defpackage.iff) r0;
            r1 = "p1";
            defpackage.akcr.b(r0, r1);
            r1 = r18;
            r2 = r1.receiver;
            r2 = (defpackage.gkw) r2;
            r3 = r0.b;
            r4 = defpackage.gkw.a.class;
            r3 = r3.a(r4);
            r3 = (defpackage.gkw.a) r3;
            if (r3 == 0) goto L_0x0398;
        L_0x001b:
            r4 = r3.a;
            r5 = r0.a;
            r5 = (defpackage.ryx.b) r5;
            r5 = r5.d;
            r6 = defpackage.gkx.b(r5);
            r4.b(r6);
            r6 = r5.d;
            r6 = java.lang.Long.valueOf(r6);
            r4.d(r6);
            r5 = defpackage.gkx.a(r5);
            r4.g(r5);
            r4 = r3.b;
            r5 = r0.a;
            r5 = (defpackage.ryx.b) r5;
            r5 = r5.a;
            r5 = r5.c();
            r6 = "request.schedulingContexts";
            defpackage.akcr.a(r5, r6);
            r5 = defpackage.gkv.a(r5);
            r6 = 0;
            if (r5 == 0) goto L_0x0073;
        L_0x0052:
            r5 = r5.b;
            if (r5 == 0) goto L_0x0073;
        L_0x0056:
            r7 = defpackage.gky.e;
            r5 = r5.ordinal();
            r5 = r7[r5];
            switch(r5) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x006d;
                case 5: goto L_0x006a;
                case 6: goto L_0x0067;
                default: goto L_0x0061;
            };
        L_0x0061:
            r0 = new ajxk;
            r0.<init>();
            throw r0;
        L_0x0067:
            r5 = defpackage.aasz.BACKGROUND_PREFETCH;
            goto L_0x0074;
        L_0x006a:
            r5 = defpackage.aasz.FOREGROUND_PREFETCH;
            goto L_0x0074;
        L_0x006d:
            r5 = defpackage.aasz.PREFETCH;
            goto L_0x0074;
        L_0x0070:
            r5 = defpackage.aasz.USER_INITIATED;
            goto L_0x0074;
        L_0x0073:
            r5 = r6;
        L_0x0074:
            r4.a(r5);
            r4 = r3.a;
            r5 = r0.a;
            r5 = (defpackage.ryx.b) r5;
            r5 = r5.c;
            r7 = r5.a();
            r7 = java.lang.Boolean.valueOf(r7);
            r4.a(r7);
            r7 = r5.a();
            if (r7 == 0) goto L_0x0092;
        L_0x0090:
            r7 = r6;
            goto L_0x00aa;
        L_0x0092:
            r7 = defpackage.sam.CANCELLED;
            r7 = defpackage.gkx.a(r5, r7);
            if (r7 == 0) goto L_0x009d;
        L_0x009a:
            r7 = defpackage.aatb.CANCELLED;
            goto L_0x00aa;
        L_0x009d:
            r7 = defpackage.sam.TIMEOUT;
            r7 = defpackage.gkx.a(r5, r7);
            if (r7 == 0) goto L_0x00a8;
        L_0x00a5:
            r7 = defpackage.aatb.TIMEOUT;
            goto L_0x00aa;
        L_0x00a8:
            r7 = defpackage.aatb.BAD_TASK;
        L_0x00aa:
            r4.a(r7);
            r7 = 0;
            r9 = java.lang.Long.valueOf(r7);
            r4.e(r9);
            r9 = r5.d;
            if (r9 != 0) goto L_0x00c4;
        L_0x00ba:
            r9 = r5.b;
            if (r9 == 0) goto L_0x00c3;
        L_0x00be:
            r9 = r9.getMessage();
            goto L_0x00c4;
        L_0x00c3:
            r9 = r6;
        L_0x00c4:
            r4.l(r9);
            r9 = r5.e;
            r10 = r9.h;
            r9 = r9.d;
            r9 = r10.a(r9);
            r11 = -1;
            r9 = java.lang.Math.max(r9, r11);
            r9 = java.lang.Long.valueOf(r9);
            r4.f(r9);
            r9 = r5.e;
            r9 = r9.a();
            r9 = java.lang.Long.valueOf(r9);
            r4.h(r9);
            r9 = r5.e;
            r9 = r9.b();
            r9 = java.lang.Long.valueOf(r9);
            r4.g(r9);
            r9 = r5.e;
            r9 = r9.c();
            r4.j(r9);
            r5 = r5.e;
            r5 = r5.d();
            r4.i(r5);
            r4 = r3.b;
            r5 = r0.a;
            r5 = (defpackage.ryx.b) r5;
            r5 = r5.b;
            r9 = r0.a;
            r9 = (defpackage.ryx.b) r9;
            r9 = r9.c;
            r10 = r5.a();
            r13 = "result.response";
            defpackage.akcr.a(r10, r13);
            r10 = r10.i();
            r14 = 1;
            if (r10 != 0) goto L_0x0129;
        L_0x0128:
            goto L_0x0133;
        L_0x0129:
            r15 = defpackage.gky.d;
            r10 = r10 - r14;
            r10 = r15[r10];
            if (r10 == r14) goto L_0x0138;
        L_0x0130:
            r15 = 2;
            if (r10 == r15) goto L_0x0135;
        L_0x0133:
            r10 = r6;
            goto L_0x013a;
        L_0x0135:
            r10 = defpackage.aasy.OKHTTP;
            goto L_0x013a;
        L_0x0138:
            r10 = defpackage.aasy.CRONET;
        L_0x013a:
            r4.a(r10);
            r10 = r5.a();
            defpackage.akcr.a(r10, r13);
            r10 = r10.j();
            r4.i(r10);
            r10 = r5.b();
            r15 = "result.request";
            defpackage.akcr.a(r10, r15);
            r10 = r10.l();
            r10 = defpackage.sbc.c(r10);
            r4.l(r10);
            r10 = r5.b();
            defpackage.akcr.a(r10, r15);
            r10 = r10.k();
            r10 = r10.toString();
            r4.r(r10);
            r10 = r5.b();
            defpackage.akcr.a(r10, r15);
            r10 = r10.n();
            r10 = (defpackage.sai) r10;
            if (r10 == 0) goto L_0x0185;
        L_0x0180:
            r16 = r10.d();
            goto L_0x0187;
        L_0x0185:
            r16 = r7;
        L_0x0187:
            r10 = java.lang.Long.valueOf(r16);
            r4.k(r10);
            r10 = r5.b();
            defpackage.akcr.a(r10, r15);
            r10 = r10.n();
            r10 = (defpackage.sai) r10;
            if (r10 == 0) goto L_0x01a1;
        L_0x019d:
            r7 = r10.c();
        L_0x01a1:
            r7 = java.lang.Long.valueOf(r7);
            r4.l(r7);
            r7 = r9.e;
            r8 = r7.e;
            r8 = r8.a;
            r8 = r8.b();
            r8 = (java.lang.Number) r8;
            r11 = r8.longValue();
            r10 = (double) r11;
            r8 = java.lang.Double.valueOf(r10);
            r4.a(r8);
            r8 = java.lang.Boolean.FALSE;
            r4.c(r8);
            r8 = java.lang.Boolean.FALSE;
            r4.f(r8);
            r8 = java.lang.Boolean.FALSE;
            r4.g(r8);
            r8 = r7.g;
            r10 = defpackage.sas.a;
            r8 = defpackage.akcr.a(r8, r10);
            r8 = r8 ^ r14;
            r8 = java.lang.Boolean.valueOf(r8);
            r4.e(r8);
            r8 = r4.d();
            r10 = "isRedirected";
            defpackage.akcr.a(r8, r10);
            r8 = r8.booleanValue();
            if (r8 == 0) goto L_0x020c;
        L_0x01ee:
            r8 = r7.g;
            r10 = r7.e;
            r10 = r8.a(r10);
            r14 = -1;
            r10 = java.lang.Math.max(r10, r14);
            r8 = java.lang.Long.valueOf(r10);
            r4.v(r8);
            r8 = r7.i;
            r8 = defpackage.gkx.a(r8);
            r4.t(r8);
        L_0x020c:
            r8 = r5.a();
            defpackage.akcr.a(r8, r13);
            r8 = r8.h();
            r10 = "Content-Type";
            r8 = defpackage.sbc.b(r8, r10);
            r10 = "N/A";
            if (r8 != 0) goto L_0x0222;
        L_0x0221:
            r8 = r10;
        L_0x0222:
            r11 = r5.a();
            defpackage.akcr.a(r11, r13);
            r11 = r11.h();
            r12 = "Content-Encoding";
            r11 = defpackage.sbc.b(r11, r12);
            if (r11 != 0) goto L_0x0236;
        L_0x0235:
            goto L_0x0237;
        L_0x0236:
            r10 = r11;
        L_0x0237:
            r8 = defpackage.gkx.a(r8, r10);
            r4.u(r8);
            r10 = r7.a();
            r8 = java.lang.Long.valueOf(r10);
            r4.d(r8);
            r10 = r7.b();
            r8 = java.lang.Long.valueOf(r10);
            r4.r(r8);
            r8 = r9.a();
            r8 = java.lang.Boolean.valueOf(r8);
            r4.d(r8);
            r8 = r9.a;
            r10 = (long) r8;
            r8 = java.lang.Long.valueOf(r10);
            r4.n(r8);
            r8 = r9.c;
            if (r8 == 0) goto L_0x0275;
        L_0x026d:
            r8 = r8.b;
            r10 = (long) r8;
            r8 = java.lang.Long.valueOf(r10);
            goto L_0x0276;
        L_0x0275:
            r8 = r6;
        L_0x0276:
            r4.o(r8);
            r8 = r9.a();
            if (r8 != 0) goto L_0x02bf;
        L_0x027f:
            r8 = r9.a;
            if (r8 <= 0) goto L_0x028d;
        L_0x0283:
            r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            if (r8 < r10) goto L_0x028b;
        L_0x0287:
            r10 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
            if (r8 < r10) goto L_0x028d;
        L_0x028b:
            r14 = 1;
            goto L_0x028e;
        L_0x028d:
            r14 = 0;
        L_0x028e:
            if (r14 == 0) goto L_0x0293;
        L_0x0290:
            r8 = defpackage.aasx.SERVER_ERROR;
            goto L_0x02c0;
        L_0x0293:
            r8 = defpackage.sam.DNS_ERROR;
            r8 = defpackage.gkx.a(r9, r8);
            if (r8 == 0) goto L_0x029e;
        L_0x029b:
            r8 = defpackage.aasx.DNS_ERROR;
            goto L_0x02c0;
        L_0x029e:
            r8 = defpackage.sam.CONNECTION_ERROR;
            r8 = defpackage.gkx.a(r9, r8);
            if (r8 == 0) goto L_0x02a9;
        L_0x02a6:
            r8 = defpackage.aasx.CONNECTION_ERROR;
            goto L_0x02c0;
        L_0x02a9:
            r8 = defpackage.sam.CANCELLED;
            r8 = defpackage.gkx.a(r9, r8);
            if (r8 == 0) goto L_0x02b4;
        L_0x02b1:
            r8 = defpackage.aasx.CANCELLED;
            goto L_0x02c0;
        L_0x02b4:
            r8 = defpackage.sam.TIMEOUT;
            r8 = defpackage.gkx.a(r9, r8);
            if (r8 == 0) goto L_0x02bf;
        L_0x02bc:
            r8 = defpackage.aasx.TIMEOUT;
            goto L_0x02c0;
        L_0x02bf:
            r8 = r6;
        L_0x02c0:
            r4.a(r8);
            r10 = r9.h;
            r8 = java.lang.Long.valueOf(r10);
            r4.x(r8);
            r10 = r9.g;
            r8 = java.lang.Long.valueOf(r10);
            r4.y(r8);
            r10 = r9.f;
            r8 = java.lang.Long.valueOf(r10);
            r4.z(r8);
            r8 = r7.c();
            r4.e(r8);
            r7 = r7.d();
            r4.w(r7);
            defpackage.gkx.a(r4, r5);
            r7 = r9.i;
            r8 = r7.a;
            r8 = java.lang.Long.valueOf(r8);
            r4.m(r8);
            r8 = r7.b;
            r8 = java.lang.Long.valueOf(r8);
            r4.f(r8);
            r8 = r7.c;
            r8 = java.lang.Long.valueOf(r8);
            r4.g(r8);
            r8 = r7.d;
            r8 = java.lang.Boolean.valueOf(r8);
            r4.a(r8);
            r8 = r7.e;
            r8 = java.lang.Long.valueOf(r8);
            r4.h(r8);
            r8 = r7.f;
            r8 = java.lang.Long.valueOf(r8);
            r4.i(r8);
            r8 = r7.g;
            r8 = java.lang.Long.valueOf(r8);
            r4.t(r8);
            r8 = r7.h;
            r8 = java.lang.Long.valueOf(r8);
            r4.u(r8);
            r8 = r4.b();
            r4.p(r8);
            r8 = r4.c();
            r4.q(r8);
            r7 = r7.i;
            r7 = java.lang.Long.valueOf(r7);
            r4.s(r7);
            r5 = r5.a();
            defpackage.akcr.a(r5, r13);
            r7 = r5.h();
            r7 = defpackage.sbc.c(r7);
            r4.j(r7);
            r7 = r5.h();
            r7 = defpackage.sbc.d(r7);
            if (r7 == 0) goto L_0x0374;
        L_0x036c:
            r6 = java.lang.Long.parseLong(r7);
            r6 = java.lang.Long.valueOf(r6);
        L_0x0374:
            r4.j(r6);
            r6 = r5.h();
            r6 = defpackage.sbc.e(r6);
            r4.k(r6);
            r5 = r5.h();
            r5 = defpackage.sbc.f(r5);
            r5 = java.lang.Boolean.valueOf(r5);
            r4.b(r5);
            r4 = r3.b;
            r3 = r3.a;
            r2.a(r4, r3);
        L_0x0398:
            r2 = r2.c;
            r3 = "event";
            defpackage.akcr.b(r0, r3);
            r3 = new gla$d;
            r3.<init>(r2, r0);
            r3 = (defpackage.akbk) r3;
            defpackage.gkv.a(r0, r3);
            r3 = r2.a;
            r3 = r3.b();
            r3 = (java.lang.Boolean) r3;
            r4 = "expEnabled";
            defpackage.akcr.a(r3, r4);
            r3 = r3.booleanValue();
            if (r3 == 0) goto L_0x03f4;
        L_0x03bc:
            r3 = new gla$b;
            r4 = r2.f;
            r4 = r4.get();
            r4 = (defpackage.fwt) r4;
            r3.<init>(r4);
            r3 = (defpackage.akbl) r3;
            r4 = new gla$c;
            r4.<init>(r2, r0);
            r4 = (defpackage.akbk) r4;
            r0 = "canLog";
            defpackage.akcr.b(r3, r0);
            r0 = "run";
            defpackage.akcr.b(r4, r0);
            r5 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
            r0 = java.lang.Double.valueOf(r5);
            r0 = r3.invoke(r0);
            r0 = (java.lang.Boolean) r0;
            r0 = r0.booleanValue();
            if (r0 == 0) goto L_0x03f4;
        L_0x03f1:
            r4.invoke();
        L_0x03f4:
            r0 = defpackage.ajxw.a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkw$d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: gkw$e */
    static final class e extends akcq implements akbl<iff<defpackage.ryx.e>, ajxw> {
        e(gkw gkw) {
            super(1, gkw);
        }

        public final String getName() {
            return "onRequestRejected";
        }

        public final akej getOwner() {
            return akde.a(gkw.class);
        }

        public final String getSignature() {
            return "onRequestRejected(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkw gkw = (gkw) this.receiver;
            a aVar = (a) iff.b.a(a.class);
            if (aVar != null) {
                String message;
                aasw aasw = aVar.b;
                sat sat = ((defpackage.ryx.e) iff.a).b;
                aasw.d(Boolean.FALSE);
                aasw.n(Long.valueOf(0));
                aasw.a(aasx.CLIENT_REJECTED);
                Object b = sat.b();
                akcr.a(b, "result.request");
                aasw.l(sbc.c(b.l()));
                aasw.d(sat.c().e());
                gkx.a(aasw, sat);
                aata aata = aVar.a;
                ryz ryz = ((defpackage.ryx.e) iff.a).a;
                sat sat2 = ((defpackage.ryx.e) iff.a).b;
                aata.a(Boolean.FALSE);
                aata.a(aatb.CLIENT_REJECTED);
                aata.e(Long.valueOf(0));
                saq a = sat2.a();
                if (a != null) {
                    Throwable d = a.d();
                    if (d != null) {
                        message = d.getMessage();
                        aata.l(message);
                        aata.j(ryz.i());
                        aata.h(sat2.c().e());
                        gkw.a(aVar.b, aVar.a);
                    }
                }
                message = null;
                aata.l(message);
                aata.j(ryz.i());
                aata.h(sat2.c().e());
                gkw.a(aVar.b, aVar.a);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gkw$a */
    public static final class a {
        final aata a = new aata();
        final aasw b = new aasw();
    }

    public gkw(Optional<ajwy<rym>> optional, ajwy<gkn> ajwy, gla gla, ablp ablp) {
        akcr.b(optional, "eventLogger");
        akcr.b(ajwy, "appStateProvider");
        akcr.b(gla, "networkManagerGrapheneEventEmitter");
        akcr.b(ablp, "startupContext");
        this.f = optional;
        this.b = ajwy;
        this.c = gla;
        this.d = ablp;
        Object uuid = UUID.randomUUID().toString();
        akcr.a(uuid, "UUID.randomUUID().toString()");
        this.a = uuid;
        uuid = new ajwl();
        akcr.a(uuid, "BehaviorSubject.create()");
        this.e = uuid;
    }

    public final void a(aasw aasw, aata aata) {
        akcr.b(aasw, "requestEvent");
        akcr.b(aata, "taskEvent");
        ajwy ajwy = (ajwy) this.f.orNull();
        if (ajwy != null) {
            this.e.a(new ajxm(aasw, aata));
            ((rym) ajwy.get()).log(aata);
            ((rym) ajwy.get()).log(aasw);
        }
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "eventBus");
        gkw gkw = this;
        ifh.a(ifg, d.class, new b(gkw));
        ifh.a(ifg, a.class, new c(gkw));
        ifh.a(ifg, b.class, new d(gkw));
        ifh.a(ifg, ryx.e.class, new e(gkw));
    }
}
