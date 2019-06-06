package com.snap.composer.jsmodules;

import android.content.Context;
import defpackage.ajxs;
import defpackage.ajzl;
import defpackage.akco;
import defpackage.akcr;

public final class ComposerDateFormattingModule extends ComposerBridgeModule {
    public static final Companion Companion = new Companion();
    private final Context a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public ComposerDateFormattingModule(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    /* JADX WARNING: Missing block: B:20:0x0038, code skipped:
            if (r7 == null) goto L_0x003a;
     */
    public static final /* synthetic */ java.lang.String access$formatDate(com.snap.composer.jsmodules.ComposerDateFormattingModule r6, java.lang.Object[] r7) {
        /*
        r0 = r7.length;
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = 1;
        goto L_0x0008;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        r3 = "";
        if (r0 != 0) goto L_0x00e5;
    L_0x000c:
        r0 = r7.length;
        r4 = 2;
        if (r0 <= r4) goto L_0x0012;
    L_0x0010:
        goto L_0x00e5;
    L_0x0012:
        r0 = r7[r2];
        r2 = r0 instanceof java.lang.Double;
        if (r2 == 0) goto L_0x0020;
    L_0x0018:
        r0 = (java.lang.Number) r0;
        r2 = r0.doubleValue();
        r2 = (long) r2;
        goto L_0x002a;
    L_0x0020:
        r2 = r0 instanceof java.lang.Long;
        if (r2 == 0) goto L_0x00e5;
    L_0x0024:
        r0 = (java.lang.Number) r0;
        r2 = r0.longValue();
    L_0x002a:
        r0 = r7.length;
        r5 = "MEDIUM";
        if (r0 < r4) goto L_0x003a;
    L_0x002f:
        r7 = r7[r1];
        r0 = r7 instanceof java.lang.String;
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        r7 = 0;
    L_0x0036:
        r7 = (java.lang.String) r7;
        if (r7 != 0) goto L_0x003b;
    L_0x003a:
        r7 = r5;
    L_0x003b:
        r0 = new java.util.Date;
        r0.<init>(r2);
        r1 = r7.hashCode();
        r2 = "DateFormat.getMediumDate…mat(context).format(date)";
        switch(r1) {
            case -2024701067: goto L_0x00c3;
            case 2342524: goto L_0x00ab;
            case 2575053: goto L_0x0093;
            case 78875740: goto L_0x007b;
            case 2074232729: goto L_0x004b;
            default: goto L_0x0049;
        };
    L_0x0049:
        goto L_0x00d7;
    L_0x004b:
        r1 = "DAY_OF_WEEK";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x00d7;
    L_0x0053:
        r7 = java.util.Calendar.getInstance();
        r1 = "calendar";
        defpackage.akcr.a(r7, r1);
        r7.setTime(r0);
        r0 = 7;
        r6 = r6.a;
        r6 = r6.getResources();
        r1 = "context.resources";
        defpackage.akcr.a(r6, r1);
        r6 = r6.getConfiguration();
        r6 = r6.locale;
        r6 = r7.getDisplayName(r0, r4, r6);
        r7 = "calendar.getDisplayName(…ces.configuration.locale)";
        defpackage.akcr.a(r6, r7);
        return r6;
    L_0x007b:
        r1 = "SHORT";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x00d7;
    L_0x0083:
        r6 = r6.a;
        r6 = android.text.format.DateFormat.getDateFormat(r6);
        r6 = r6.format(r0);
        r7 = "DateFormat.getDateFormat(context).format(date)";
        defpackage.akcr.a(r6, r7);
        return r6;
    L_0x0093:
        r1 = "TIME";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x00d7;
    L_0x009b:
        r6 = r6.a;
        r6 = android.text.format.DateFormat.getTimeFormat(r6);
        r6 = r6.format(r0);
        r7 = "DateFormat.getTimeFormat(context).format(date)";
        defpackage.akcr.a(r6, r7);
        return r6;
    L_0x00ab:
        r1 = "LONG";
        r7 = r7.equals(r1);
        if (r7 == 0) goto L_0x00d7;
    L_0x00b3:
        r6 = r6.a;
        r6 = android.text.format.DateFormat.getLongDateFormat(r6);
        r6 = r6.format(r0);
        r7 = "DateFormat.getLongDateFormat(context).format(date)";
        defpackage.akcr.a(r6, r7);
        return r6;
    L_0x00c3:
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x00d7;
    L_0x00c9:
        r6 = r6.a;
        r6 = android.text.format.DateFormat.getMediumDateFormat(r6);
        r6 = r6.format(r0);
        defpackage.akcr.a(r6, r2);
        return r6;
    L_0x00d7:
        r6 = r6.a;
        r6 = android.text.format.DateFormat.getMediumDateFormat(r6);
        r6 = r6.format(r0);
        defpackage.akcr.a(r6, r2);
        return r6;
    L_0x00e5:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.jsmodules.ComposerDateFormattingModule.access$formatDate(com.snap.composer.jsmodules.ComposerDateFormattingModule, java.lang.Object[]):java.lang.String");
    }

    public final Object loadModule() {
        return ajzl.a(ajxs.a("formatDate", new ComposerDateFormattingModule$loadModule$$inlined$makeBridgeMethod$1(this)));
    }
}
