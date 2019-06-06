package com.snap.composer.attributes.impl.fonts;

import android.content.Context;
import android.graphics.Typeface;
import com.snap.composer.logger.Logger;
import defpackage.akcr;
import defpackage.akdd.e;
import defpackage.zfw;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class AsyncFontCache implements FontCache {
    private final Map<String, Typeface> a = new LinkedHashMap();
    private final Context b;
    private final zfw c;
    private final Logger d;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FontStyle.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[FontStyle.NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$0[FontStyle.ITALIC.ordinal()] = 2;
            iArr = new int[FontWeight.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[FontWeight.LIGHT.ordinal()] = 1;
            $EnumSwitchMapping$1[FontWeight.NORMAL.ordinal()] = 2;
            $EnumSwitchMapping$1[FontWeight.MEDIUM.ordinal()] = 3;
            $EnumSwitchMapping$1[FontWeight.DEMI_BOLD.ordinal()] = 4;
            $EnumSwitchMapping$1[FontWeight.BOLD.ordinal()] = 5;
            $EnumSwitchMapping$1[FontWeight.BLACK.ordinal()] = 6;
        }
    }

    static final class a implements Runnable {
        private /* synthetic */ AsyncFontCache a;
        private /* synthetic */ e b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ FontWeight e;
        private /* synthetic */ FontStyle f;
        private /* synthetic */ CountDownLatch g;

        a(AsyncFontCache asyncFontCache, e eVar, String str, String str2, FontWeight fontWeight, FontStyle fontStyle, CountDownLatch countDownLatch) {
            this.a = asyncFontCache;
            this.b = eVar;
            this.c = str;
            this.d = str2;
            this.e = fontWeight;
            this.f = fontStyle;
            this.g = countDownLatch;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0043 in {1, 3, 9, 11} preds:[]
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
        public final void run() {
            /*
            r6 = this;
            r0 = r6.b;	 Catch:{ Exception -> 0x001a }
            r1 = r6.a;	 Catch:{ Exception -> 0x001a }
            r2 = r6.c;	 Catch:{ Exception -> 0x001a }
            r3 = r6.d;	 Catch:{ Exception -> 0x001a }
            r4 = r6.e;	 Catch:{ Exception -> 0x001a }
            r5 = r6.f;	 Catch:{ Exception -> 0x001a }
            r1 = r1.a(r2, r3, r4, r5);	 Catch:{ Exception -> 0x001a }
            r0.a = r1;	 Catch:{ Exception -> 0x001a }
            r0 = r6.g;
            r0.countDown();
            return;
            r0 = move-exception;
            goto L_0x003d;
            r0 = move-exception;
            r1 = r6.a;	 Catch:{ all -> 0x0018 }
            r1 = r1.d;	 Catch:{ all -> 0x0018 }
            r2 = com.snap.composer.logger.LogLevel.Companion;	 Catch:{ all -> 0x0018 }
            r2 = r2.getERROR();	 Catch:{ all -> 0x0018 }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0018 }
            r4 = "Error getting typeface: ";	 Catch:{ all -> 0x0018 }
            r3.<init>(r4);	 Catch:{ all -> 0x0018 }
            r0 = r0.getMessage();	 Catch:{ all -> 0x0018 }
            r3.append(r0);	 Catch:{ all -> 0x0018 }
            r0 = r3.toString();	 Catch:{ all -> 0x0018 }
            r1.log(r2, r0);	 Catch:{ all -> 0x0018 }
            goto L_0x0012;
            r1 = r6.g;
            r1.countDown();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.fonts.AsyncFontCache$a.run():void");
        }
    }

    public AsyncFontCache(Context context, zfw zfw, Logger logger) {
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        this.b = context;
        this.c = zfw;
        this.d = logger;
    }

    /* JADX WARNING: Missing block: B:7:0x002f, code skipped:
            if (r8 == null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:8:0x0031, code skipped:
            defpackage.akcr.a();
     */
    /* JADX WARNING: Missing block: B:12:0x0043, code skipped:
            if (r8 == null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:14:0x004c, code skipped:
            if (r8.equals(com.brightcove.player.captioning.TTMLParser.Tags.BODY) != false) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:18:0x005d, code skipped:
            if (r8 == null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:23:0x0073, code skipped:
            if (r8.equals("title2") != false) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:25:0x007c, code skipped:
            if (r8.equals("title1") != false) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:26:0x007e, code skipped:
            r8 = android.graphics.Typeface.defaultFromStyle(0);
     */
    /* JADX WARNING: Missing block: B:30:0x0091, code skipped:
            if (r8 == null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:32:0x009e, code skipped:
            r9 = "when (name.toLowerCase()…sets, name)\n            }";
     */
    /* JADX WARNING: Missing block: B:48:0x00d2, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:49:0x00d4, code skipped:
            defpackage.akcr.a();
     */
    /* JADX WARNING: Missing block: B:51:0x00de, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:58:0x00fa, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:62:0x0109, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:64:0x0112, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:66:0x011b, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Missing block: B:68:0x0124, code skipped:
            if (r8 == null) goto L_0x00d4;
     */
    private final android.graphics.Typeface a(java.lang.String r8, java.lang.String r9, com.snap.composer.attributes.impl.fonts.FontWeight r10, com.snap.composer.attributes.impl.fonts.FontStyle r11) {
        /*
        r7 = this;
        r0 = 2131296260; // 0x7f090004 float:1.8210432E38 double:1.053000263E-314;
        r1 = 2131296258; // 0x7f090002 float:1.8210428E38 double:1.053000262E-314;
        r2 = 2131296261; // 0x7f090005 float:1.8210434E38 double:1.0530002637E-314;
        r3 = 2131296257; // 0x7f090001 float:1.8210426E38 double:1.0530002617E-314;
        r4 = 0;
        r5 = 1;
        if (r9 == 0) goto L_0x00a4;
    L_0x0010:
        r8 = r9.toLowerCase();
        r10 = "(this as java.lang.String).toLowerCase()";
        defpackage.akcr.a(r8, r10);
        r10 = r8.hashCode();
        switch(r10) {
            case -1330957384: goto L_0x0083;
            case -873453351: goto L_0x0076;
            case -873453350: goto L_0x006d;
            case -873453349: goto L_0x0060;
            case -51893867: goto L_0x004f;
            case 3029410: goto L_0x0046;
            case 1155663848: goto L_0x0035;
            case 1611511177: goto L_0x0021;
            default: goto L_0x0020;
        };
    L_0x0020:
        goto L_0x0094;
    L_0x0021:
        r10 = "avenirnext-regular";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x0029:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r2);
        if (r8 != 0) goto L_0x009e;
    L_0x0031:
        defpackage.akcr.a();
        goto L_0x009e;
    L_0x0035:
        r10 = "avenirnext-medium";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x003d:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r0);
        if (r8 != 0) goto L_0x009e;
    L_0x0045:
        goto L_0x0031;
    L_0x0046:
        r10 = "body";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x004e:
        goto L_0x007e;
    L_0x004f:
        r10 = "avenirnext-demibold";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x0057:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r1);
        if (r8 != 0) goto L_0x009e;
    L_0x005f:
        goto L_0x0031;
    L_0x0060:
        r10 = "title3";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x0068:
        r8 = android.graphics.Typeface.defaultFromStyle(r5);
        goto L_0x009e;
    L_0x006d:
        r10 = "title2";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x0075:
        goto L_0x007e;
    L_0x0076:
        r10 = "title1";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x007e:
        r8 = android.graphics.Typeface.defaultFromStyle(r4);
        goto L_0x009e;
    L_0x0083:
        r10 = "avenirnext-bold";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x0094;
    L_0x008b:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r3);
        if (r8 != 0) goto L_0x009e;
    L_0x0093:
        goto L_0x0031;
    L_0x0094:
        r8 = r7.b;
        r8 = r8.getAssets();
        r8 = android.graphics.Typeface.createFromAsset(r8, r9);
    L_0x009e:
        r9 = "when (name.toLowerCase()…sets, name)\n            }";
    L_0x00a0:
        defpackage.akcr.a(r8, r9);
        return r8;
    L_0x00a4:
        r9 = 2;
        if (r8 == 0) goto L_0x0127;
    L_0x00a7:
        r6 = "avenirnext";
        r6 = defpackage.akgb.a(r8, r6, r5);
        if (r6 != 0) goto L_0x00b7;
    L_0x00af:
        r6 = "avenir next";
        r8 = defpackage.akgb.a(r8, r6, r5);
        if (r8 == 0) goto L_0x0127;
    L_0x00b7:
        if (r10 != 0) goto L_0x00bb;
    L_0x00b9:
        r10 = com.snap.composer.attributes.impl.fonts.FontWeight.DEMI_BOLD;
    L_0x00bb:
        r8 = com.snap.composer.attributes.impl.fonts.AsyncFontCache.WhenMappings.$EnumSwitchMapping$1;
        r10 = r10.ordinal();
        r8 = r8[r10];
        switch(r8) {
            case 1: goto L_0x011e;
            case 2: goto L_0x0115;
            case 3: goto L_0x010c;
            case 4: goto L_0x00e1;
            case 5: goto L_0x00d8;
            case 6: goto L_0x00cc;
            default: goto L_0x00c6;
        };
    L_0x00c6:
        r8 = new ajxk;
        r8.<init>();
        throw r8;
    L_0x00cc:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r3);
        if (r8 != 0) goto L_0x014b;
    L_0x00d4:
        defpackage.akcr.a();
        goto L_0x014b;
    L_0x00d8:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r3);
        if (r8 != 0) goto L_0x014b;
    L_0x00e0:
        goto L_0x00d4;
    L_0x00e1:
        if (r11 != 0) goto L_0x00e5;
    L_0x00e3:
        r11 = com.snap.composer.attributes.impl.fonts.FontStyle.NORMAL;
    L_0x00e5:
        r8 = com.snap.composer.attributes.impl.fonts.AsyncFontCache.WhenMappings.$EnumSwitchMapping$0;
        r10 = r11.ordinal();
        r8 = r8[r10];
        if (r8 == r5) goto L_0x0103;
    L_0x00ef:
        if (r8 != r9) goto L_0x00fd;
    L_0x00f1:
        r8 = r7.b;
        r9 = 2131296259; // 0x7f090003 float:1.821043E38 double:1.0530002627E-314;
        r8 = defpackage.hh.a(r8, r9);
        if (r8 != 0) goto L_0x014b;
    L_0x00fc:
        goto L_0x00d4;
    L_0x00fd:
        r8 = new ajxk;
        r8.<init>();
        throw r8;
    L_0x0103:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r1);
        if (r8 != 0) goto L_0x014b;
    L_0x010b:
        goto L_0x00d4;
    L_0x010c:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r0);
        if (r8 != 0) goto L_0x014b;
    L_0x0114:
        goto L_0x00d4;
    L_0x0115:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r2);
        if (r8 != 0) goto L_0x014b;
    L_0x011d:
        goto L_0x00d4;
    L_0x011e:
        r8 = r7.b;
        r8 = defpackage.hh.a(r8, r2);
        if (r8 != 0) goto L_0x014b;
    L_0x0126:
        goto L_0x00d4;
    L_0x0127:
        r8 = com.snap.composer.attributes.impl.fonts.FontWeight.BOLD;
        if (r10 != r8) goto L_0x0135;
    L_0x012b:
        r8 = com.snap.composer.attributes.impl.fonts.FontStyle.ITALIC;
        if (r11 != r8) goto L_0x0135;
    L_0x012f:
        r8 = 3;
        r8 = android.graphics.Typeface.defaultFromStyle(r8);
        goto L_0x014b;
    L_0x0135:
        r8 = com.snap.composer.attributes.impl.fonts.FontWeight.BOLD;
        if (r10 != r8) goto L_0x013e;
    L_0x0139:
        r8 = android.graphics.Typeface.defaultFromStyle(r5);
        goto L_0x014b;
    L_0x013e:
        r8 = com.snap.composer.attributes.impl.fonts.FontStyle.ITALIC;
        if (r11 != r8) goto L_0x0147;
    L_0x0142:
        r8 = android.graphics.Typeface.defaultFromStyle(r9);
        goto L_0x014b;
    L_0x0147:
        r8 = android.graphics.Typeface.defaultFromStyle(r4);
    L_0x014b:
        r9 = "if (family != null && (f…ypeface.NORMAL)\n        }";
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.fonts.AsyncFontCache.a(java.lang.String, java.lang.String, com.snap.composer.attributes.impl.fonts.FontWeight, com.snap.composer.attributes.impl.fonts.FontStyle):android.graphics.Typeface");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    public final android.graphics.Typeface getTypeface(java.lang.String r15, java.lang.String r16, com.snap.composer.attributes.impl.fonts.FontWeight r17, com.snap.composer.attributes.impl.fonts.FontStyle r18) {
        /*
        r14 = this;
        r8 = r14;
        r0 = 0;
        if (r15 == 0) goto L_0x0018;
    L_0x0004:
        if (r15 == 0) goto L_0x0010;
    L_0x0006:
        r1 = r15.toLowerCase();
        r2 = "(this as java.lang.String).toLowerCase()";
        defpackage.akcr.a(r1, r2);
        goto L_0x0019;
    L_0x0010:
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type java.lang.String";
        r0.<init>(r1);
        throw r0;
    L_0x0018:
        r1 = r0;
    L_0x0019:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        if (r1 != 0) goto L_0x0023;
    L_0x0022:
        r1 = r3;
    L_0x0023:
        r2.append(r1);
        r1 = " ";
        r2.append(r1);
        if (r16 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0030;
    L_0x002e:
        r3 = r16;
    L_0x0030:
        r2.append(r3);
        r2.append(r1);
        r3 = 0;
        if (r17 == 0) goto L_0x003e;
    L_0x0039:
        r4 = r17.ordinal();
        goto L_0x003f;
    L_0x003e:
        r4 = 0;
    L_0x003f:
        r2.append(r4);
        r2.append(r1);
        if (r18 == 0) goto L_0x004b;
    L_0x0047:
        r3 = r18.ordinal();
    L_0x004b:
        r2.append(r3);
        r9 = r2.toString();
        r1 = "sb.toString()";
        defpackage.akcr.a(r9, r1);
        r10 = new akdd$e;
        r10.<init>();
        r1 = r8.a;
        r1 = r1.get(r9);
        r1 = (android.graphics.Typeface) r1;
        r10.a = r1;
        r1 = r10.a;
        r1 = (android.graphics.Typeface) r1;
        if (r1 != 0) goto L_0x00d4;
    L_0x006c:
        r1 = r8.c;
        if (r1 == 0) goto L_0x0076;
    L_0x0070:
        r0 = r1.h();
        r0 = (defpackage.ajdw) r0;
    L_0x0076:
        r11 = r0;
        if (r11 == 0) goto L_0x00af;
    L_0x0079:
        r0 = java.lang.Thread.currentThread();
        r1 = android.os.Looper.getMainLooper();
        r2 = "Looper.getMainLooper()";
        defpackage.akcr.a(r1, r2);
        r1 = r1.getThread();
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x00af;
    L_0x0090:
        r12 = new java.util.concurrent.CountDownLatch;
        r0 = 1;
        r12.<init>(r0);
        r13 = new com.snap.composer.attributes.impl.fonts.AsyncFontCache$a;
        r0 = r13;
        r1 = r14;
        r2 = r10;
        r3 = r15;
        r4 = r16;
        r5 = r17;
        r6 = r18;
        r7 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r13 = (java.lang.Runnable) r13;
        r11.a(r13);
        r12.await();
        goto L_0x00b5;
    L_0x00af:
        r0 = r14.a(r15, r16, r17, r18);
        r10.a = r0;
    L_0x00b5:
        r0 = r10.a;
        r0 = (android.graphics.Typeface) r0;
        if (r0 == 0) goto L_0x00ca;
    L_0x00bb:
        r0 = r8.a;
        r1 = r10.a;
        r1 = (android.graphics.Typeface) r1;
        if (r1 != 0) goto L_0x00c6;
    L_0x00c3:
        defpackage.akcr.a();
    L_0x00c6:
        r0.put(r9, r1);
        goto L_0x00d4;
    L_0x00ca:
        r0 = new com.snap.composer.exceptions.AttributeError;
        r1 = "Failed to load font";
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
    L_0x00d4:
        r0 = r10.a;
        r0 = (android.graphics.Typeface) r0;
        if (r0 != 0) goto L_0x00dd;
    L_0x00da:
        defpackage.akcr.a();
    L_0x00dd:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.fonts.AsyncFontCache.getTypeface(java.lang.String, java.lang.String, com.snap.composer.attributes.impl.fonts.FontWeight, com.snap.composer.attributes.impl.fonts.FontStyle):android.graphics.Typeface");
    }
}
