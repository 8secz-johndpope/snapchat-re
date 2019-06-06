package com.snap.core.prefetch.impl;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.ajyl;
import defpackage.akcr;
import defpackage.goc;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.ilz;
import defpackage.iot;
import java.util.List;

@hwk(a = "BG_PREFETCH", b = goc.class)
public final class BackgroundPrefetchDurableJob extends hwg<goc> {
    static final List<Integer> a = ajyl.a(Integer.valueOf(2));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00fb in {4, 5, 8, 9, 13, 18, 19, 21, 23, 25, 27, 29} preds:[]
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
        public static com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob a(java.lang.String r19, java.lang.String r20, defpackage.gna r21, defpackage.ihh r22, defpackage.ihs r23, defpackage.ajwy<defpackage.ftl> r24) {
            /*
            r0 = r21;
            r1 = r23;
            r2 = "uniqueJobKey";
            r7 = r19;
            defpackage.akcr.b(r7, r2);
            r2 = "processorKey";
            r15 = r20;
            defpackage.akcr.b(r15, r2);
            r2 = "constraints";
            defpackage.akcr.b(r0, r2);
            r2 = "clock";
            r14 = r22;
            defpackage.akcr.b(r14, r2);
            r2 = "delayTimeUtils";
            defpackage.akcr.b(r1, r2);
            r2 = "compositeConfigurationProvider";
            r3 = r24;
            defpackage.akcr.b(r3, r2);
            r2 = r0.g;	 Catch:{ all -> 0x00f9 }
            r4 = 0;	 Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0043;	 Catch:{ all -> 0x00f9 }
            r5 = r2.a;	 Catch:{ all -> 0x00f9 }
            r6 = r2.c;	 Catch:{ all -> 0x00f9 }
            r5 = defpackage.ihs.a(r5, r6);	 Catch:{ all -> 0x00f9 }
            r2 = r2.b;	 Catch:{ all -> 0x00f9 }
            r1 = r1.a(r2);	 Catch:{ all -> 0x00f9 }
            r5 = r5 + r1;	 Catch:{ all -> 0x00f9 }
            r1 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x00f9 }
            goto L_0x0050;	 Catch:{ all -> 0x00f9 }
            r2 = r0.h;	 Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x00f9 }
            r2 = r2.a;	 Catch:{ all -> 0x00f9 }
            r5 = (long) r2;	 Catch:{ all -> 0x00f9 }
            r1 = r1.a(r4);	 Catch:{ all -> 0x00f9 }
            goto L_0x003d;	 Catch:{ all -> 0x00f9 }
            r1 = 0;	 Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x00ef;	 Catch:{ all -> 0x00f9 }
            r1 = r1.longValue();	 Catch:{ all -> 0x00f9 }
            r5 = r24.get();	 Catch:{ all -> 0x00f9 }
            r5 = (defpackage.ftl) r5;	 Catch:{ all -> 0x00f9 }
            r6 = defpackage.fxm.BACKGROUND_PREFETCH_NUM_RETRIES;	 Catch:{ all -> 0x00f9 }
            r6 = (defpackage.fth) r6;	 Catch:{ all -> 0x00f9 }
            r5 = r5.f(r6);	 Catch:{ all -> 0x00f9 }
            r6 = r0.e;	 Catch:{ all -> 0x00f9 }
            if (r6 < 0) goto L_0x006a;	 Catch:{ all -> 0x00f9 }
            r5 = r0.e;	 Catch:{ all -> 0x00f9 }
            r6 = r24.get();	 Catch:{ all -> 0x00f9 }
            r6 = (defpackage.ftl) r6;	 Catch:{ all -> 0x00f9 }
            r8 = defpackage.fxm.BACKGROUND_PREFETCH_USE_DEFAULT_WIFI_CONSTRAINT;	 Catch:{ all -> 0x00f9 }
            r8 = (defpackage.fth) r8;	 Catch:{ all -> 0x00f9 }
            r6 = r6.a(r8);	 Catch:{ all -> 0x00f9 }
            r3 = r24.get();	 Catch:{ all -> 0x00f9 }
            r3 = (defpackage.ftl) r3;	 Catch:{ all -> 0x00f9 }
            r8 = defpackage.fxm.BACKGROUND_PREFETCH_IS_RECURRING;	 Catch:{ all -> 0x00f9 }
            r8 = (defpackage.fth) r8;	 Catch:{ all -> 0x00f9 }
            r3 = r3.a(r8);	 Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x008f;	 Catch:{ all -> 0x00f9 }
            r3 = r0.f;	 Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x008f;	 Catch:{ all -> 0x00f9 }
            r3 = 1;	 Catch:{ all -> 0x00f9 }
            r11 = 1;	 Catch:{ all -> 0x00f9 }
            goto L_0x0090;	 Catch:{ all -> 0x00f9 }
            r11 = 0;	 Catch:{ all -> 0x00f9 }
            if (r6 == 0) goto L_0x0096;	 Catch:{ all -> 0x00f9 }
            r3 = com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob.a;	 Catch:{ all -> 0x00f9 }
            r6 = r3;	 Catch:{ all -> 0x00f9 }
            goto L_0x009b;	 Catch:{ all -> 0x00f9 }
            r3 = defpackage.ajyw.a;	 Catch:{ all -> 0x00f9 }
            r3 = (java.util.List) r3;	 Catch:{ all -> 0x00f9 }
            goto L_0x0094;	 Catch:{ all -> 0x00f9 }
            r8 = defpackage.hwi.REPLACE;	 Catch:{ all -> 0x00f9 }
            r9 = new hwq;	 Catch:{ all -> 0x00f9 }
            r3 = java.util.concurrent.TimeUnit.MINUTES;	 Catch:{ all -> 0x00f9 }
            r9.<init>(r1, r3);	 Catch:{ all -> 0x00f9 }
            r13 = new hwh;	 Catch:{ all -> 0x00f9 }
            r10 = 0;	 Catch:{ all -> 0x00f9 }
            r12 = 0;	 Catch:{ all -> 0x00f9 }
            r16 = 0;	 Catch:{ all -> 0x00f9 }
            r17 = 608; // 0x260 float:8.52E-43 double:3.004E-321;	 Catch:{ all -> 0x00f9 }
            r3 = r13;	 Catch:{ all -> 0x00f9 }
            r4 = r5;	 Catch:{ all -> 0x00f9 }
            r5 = r6;	 Catch:{ all -> 0x00f9 }
            r6 = r8;	 Catch:{ all -> 0x00f9 }
            r7 = r19;	 Catch:{ all -> 0x00f9 }
            r8 = r9;	 Catch:{ all -> 0x00f9 }
            r9 = r10;	 Catch:{ all -> 0x00f9 }
            r10 = r12;	 Catch:{ all -> 0x00f9 }
            r12 = r20;	 Catch:{ all -> 0x00f9 }
            r18 = r13;	 Catch:{ all -> 0x00f9 }
            r13 = r16;	 Catch:{ all -> 0x00f9 }
            r14 = r17;	 Catch:{ all -> 0x00f9 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x00f9 }
            r13 = new goc;	 Catch:{ all -> 0x00f9 }
            r5 = r0.a;	 Catch:{ all -> 0x00f9 }
            r3 = defpackage.iig.a();	 Catch:{ all -> 0x00f9 }
            r6 = r3.toString();	 Catch:{ all -> 0x00f9 }
            r3 = "UUIDGenerator.nonCryptoRandomUUID().toString()";	 Catch:{ all -> 0x00f9 }
            defpackage.akcr.a(r6, r3);	 Catch:{ all -> 0x00f9 }
            r7 = r0.b;	 Catch:{ all -> 0x00f9 }
            r8 = r0.c;	 Catch:{ all -> 0x00f9 }
            r9 = r22.a();	 Catch:{ all -> 0x00f9 }
            r11 = r0.d;	 Catch:{ all -> 0x00f9 }
            r0 = 0;	 Catch:{ all -> 0x00f9 }
            r3 = r13;	 Catch:{ all -> 0x00f9 }
            r4 = r20;	 Catch:{ all -> 0x00f9 }
            r14 = r11;	 Catch:{ all -> 0x00f9 }
            r11 = r1;	 Catch:{ all -> 0x00f9 }
            r1 = r13;	 Catch:{ all -> 0x00f9 }
            r13 = r14;	 Catch:{ all -> 0x00f9 }
            r15 = r0;	 Catch:{ all -> 0x00f9 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15);	 Catch:{ all -> 0x00f9 }
            r0 = new com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob;	 Catch:{ all -> 0x00f9 }
            r2 = r18;	 Catch:{ all -> 0x00f9 }
            r0.<init>(r2, r1);	 Catch:{ all -> 0x00f9 }
            return r0;	 Catch:{ all -> 0x00f9 }
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00f9 }
            r1 = "Job must have one constraint";	 Catch:{ all -> 0x00f9 }
            r0.<init>(r1);	 Catch:{ all -> 0x00f9 }
            r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x00f9 }
            throw r0;	 Catch:{ all -> 0x00f9 }
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob$a.a(java.lang.String, java.lang.String, gna, ihh, ihs, ajwy):com.snap.core.prefetch.impl.BackgroundPrefetchDurableJob");
        }

        public static ilz a(String str, String str2, String str3) {
            akcr.b(str, "processorKey");
            akcr.b(str2, "constraintName");
            String str4 = "event";
            akcr.b(str3, str4);
            return iot.BG_PREFETCH.a("processor_key", str).a("constraint_name", str2).a(str4, str3);
        }
    }

    static {
        a aVar = new a();
    }

    public BackgroundPrefetchDurableJob(hwh hwh, goc goc) {
        akcr.b(hwh, "jobConfig");
        akcr.b(goc, StorySyncStateModel.METADATA);
        super(hwh, goc);
    }
}
