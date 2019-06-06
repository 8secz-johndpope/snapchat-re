package com.snap.composer.jsmodules;

import android.content.Context;
import defpackage.ajxs;
import defpackage.ajzl;
import defpackage.akcr;

public final class ComposerNumberFormattingModule extends ComposerBridgeModule {
    private final Context a;

    public ComposerNumberFormattingModule(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055  */
    public static final /* synthetic */ java.lang.String access$formatNumber(com.snap.composer.jsmodules.ComposerNumberFormattingModule r6, java.lang.Object[] r7) {
        /*
        r6 = r7.length;
        r0 = 0;
        r1 = 1;
        if (r6 != 0) goto L_0x0007;
    L_0x0005:
        r6 = 1;
        goto L_0x0008;
    L_0x0007:
        r6 = 0;
    L_0x0008:
        r2 = "";
        if (r6 != 0) goto L_0x0065;
    L_0x000c:
        r6 = r7.length;
        r3 = 2;
        if (r6 <= r3) goto L_0x0011;
    L_0x0010:
        goto L_0x0065;
    L_0x0011:
        r6 = r7[r0];
        r0 = r6 instanceof java.lang.Double;
        if (r0 == 0) goto L_0x001e;
    L_0x0017:
        r6 = (java.lang.Number) r6;
        r4 = r6.doubleValue();
        goto L_0x0029;
    L_0x001e:
        r0 = r6 instanceof java.lang.Long;
        if (r0 == 0) goto L_0x0065;
    L_0x0022:
        r6 = (java.lang.Number) r6;
        r4 = r6.longValue();
        r4 = (double) r4;
    L_0x0029:
        r6 = r7.length;
        if (r6 < r3) goto L_0x003c;
    L_0x002c:
        r6 = r7[r1];
        r7 = r6 instanceof java.lang.Double;
        if (r7 != 0) goto L_0x0033;
    L_0x0032:
        r6 = 0;
    L_0x0033:
        r6 = (java.lang.Double) r6;
        if (r6 == 0) goto L_0x003c;
    L_0x0037:
        r6 = r6.doubleValue();
        goto L_0x003e;
    L_0x003c:
        r6 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
    L_0x003e:
        r6 = (int) r6;
        if (r6 <= 0) goto L_0x0046;
    L_0x0041:
        r7 = java.text.DecimalFormat.getInstance();
        goto L_0x004a;
    L_0x0046:
        r7 = java.text.NumberFormat.getInstance();
    L_0x004a:
        r0 = "format";
        defpackage.akcr.a(r7, r0);
        r7.setGroupingUsed(r1);
        r0 = -1;
        if (r6 == r0) goto L_0x005b;
    L_0x0055:
        r7.setMinimumFractionDigits(r6);
        r7.setMaximumFractionDigits(r6);
    L_0x005b:
        r6 = r7.format(r4);
        r7 = "format.format(value)";
        defpackage.akcr.a(r6, r7);
        return r6;
    L_0x0065:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.jsmodules.ComposerNumberFormattingModule.access$formatNumber(com.snap.composer.jsmodules.ComposerNumberFormattingModule, java.lang.Object[]):java.lang.String");
    }

    public final Object loadModule() {
        return ajzl.a(ajxs.a("formatNumber", new ComposerNumberFormattingModule$loadModule$$inlined$makeBridgeMethod$1(this)));
    }
}
