package com.google.android.gms.internal;

import com.google.android.gms.ads.AdSize;

@zzabh
public final class zzkr {
    private final String zzapp;
    private final AdSize[] zzbig;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0064 in {3, 7, 10, 12, 15, 17} preds:[]
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
    public zzkr(android.content.Context r4, android.util.AttributeSet r5) {
        /*
        r3 = this;
        r3.<init>();
        r4 = r4.getResources();
        r0 = com.google.android.gms.R.styleable.AdsAttrs;
        r4 = r4.obtainAttributes(r5, r0);
        r5 = com.google.android.gms.R.styleable.AdsAttrs_adSize;
        r5 = r4.getString(r5);
        r0 = com.google.android.gms.R.styleable.AdsAttrs_adSizes;
        r0 = r4.getString(r0);
        r1 = android.text.TextUtils.isEmpty(r5);
        r1 = r1 ^ 1;
        r2 = android.text.TextUtils.isEmpty(r0);
        r2 = r2 ^ 1;
        if (r1 == 0) goto L_0x0030;
        if (r2 != 0) goto L_0x0030;
        r5 = zzac(r5);
        r3.zzbig = r5;
        goto L_0x0039;
        if (r1 != 0) goto L_0x0052;
        if (r2 == 0) goto L_0x0052;
        r5 = zzac(r0);
        goto L_0x002d;
        r5 = com.google.android.gms.R.styleable.AdsAttrs_adUnitId;
        r4 = r4.getString(r5);
        r3.zzapp = r4;
        r4 = r3.zzapp;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x004a;
        return;
        r4 = new java.lang.IllegalArgumentException;
        r5 = "Required XML attribute \"adUnitId\" was missing.";
        r4.<init>(r5);
        throw r4;
        if (r1 == 0) goto L_0x005c;
        r4 = new java.lang.IllegalArgumentException;
        r5 = "Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.";
        r4.<init>(r5);
        throw r4;
        r4 = new java.lang.IllegalArgumentException;
        r5 = "Required XML attribute \"adSize\" was missing.";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzkr.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private static AdSize[] zzac(String str) {
        String valueOf;
        String[] split = str.split("\\s*,\\s*");
        AdSize[] adSizeArr = new AdSize[split.length];
        int i = 0;
        while (true) {
            String str2 = "Could not parse XML attribute \"adSize\": ";
            if (i < split.length) {
                String trim = split[i].trim();
                if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                    String[] split2 = trim.split("[xX]");
                    split2[0] = split2[0].trim();
                    split2[1] = split2[1].trim();
                    try {
                        adSizeArr[i] = new AdSize("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                    } catch (NumberFormatException unused) {
                        valueOf = String.valueOf(trim);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                } else if ("BANNER".equals(trim)) {
                    adSizeArr[i] = AdSize.BANNER;
                } else if ("LARGE_BANNER".equals(trim)) {
                    adSizeArr[i] = AdSize.LARGE_BANNER;
                } else if ("FULL_BANNER".equals(trim)) {
                    adSizeArr[i] = AdSize.FULL_BANNER;
                } else if ("LEADERBOARD".equals(trim)) {
                    adSizeArr[i] = AdSize.LEADERBOARD;
                } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                    adSizeArr[i] = AdSize.MEDIUM_RECTANGLE;
                } else if ("SMART_BANNER".equals(trim)) {
                    adSizeArr[i] = AdSize.SMART_BANNER;
                } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                    adSizeArr[i] = AdSize.WIDE_SKYSCRAPER;
                } else if ("FLUID".equals(trim)) {
                    adSizeArr[i] = AdSize.FLUID;
                } else if ("ICON".equals(trim)) {
                    adSizeArr[i] = AdSize.zzals;
                } else {
                    valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                i++;
            } else if (adSizeArr.length != 0) {
                return adSizeArr;
            } else {
                str = String.valueOf(str);
                throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
        }
    }

    public final String getAdUnitId() {
        return this.zzapp;
    }

    public final AdSize[] zzi(boolean z) {
        if (z || this.zzbig.length == 1) {
            return this.zzbig;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
