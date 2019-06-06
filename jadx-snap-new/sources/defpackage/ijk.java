package defpackage;

import defpackage.ghx.a;

@ftr(a = "geofilter")
/* renamed from: ijk */
public final class ijk extends ggm {
    private final ije a;
    private final gee b;
    private final dea c;

    public ijk(ije ije, gee gee, dea dea) {
        akcr.b(ije, "geofilterContentType");
        akcr.b(gee, "contentManager");
        akcr.b(dea, "bitmojiUriHandler");
        this.a = ije;
        this.b = gee;
        this.c = dea;
    }

    private static ajdx<gej> a(String str) {
        Object b = ajdx.b(a.a((Throwable) new IllegalArgumentException(str), null));
        akcr.a(b, "Single.just(FailedConten…ption(exceptionMessage)))");
        return b;
    }

    /* JADX WARNING: Missing block: B:23:0x0095, code skipped:
            if (r4 == null) goto L_0x0097;
     */
    public final defpackage.ajdx<defpackage.gej> a(android.net.Uri r19, java.util.Set<defpackage.rzg> r20, boolean r21, java.util.Set<? extends defpackage.gdy> r22) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r7 = r20;
        r10 = r21;
        r8 = r22;
        r2 = "uri";
        defpackage.akcr.b(r1, r2);
        r3 = "schedulingContexts";
        defpackage.akcr.b(r7, r3);
        r4 = "cacheAccessControls";
        defpackage.akcr.b(r8, r4);
        r5 = "content_type";
        r5 = r1.getQueryParameter(r5);
        r6 = "category";
        r6 = r1.getQueryParameter(r6);
        r9 = "unlockableCategory";
        defpackage.akcr.a(r6, r9);
        r6 = java.lang.Integer.parseInt(r6);
        r9 = defpackage.aica.FRIEND_FILTER;
        r9 = r9.ordinal();
        if (r6 != r9) goto L_0x0038;
    L_0x0036:
        r6 = 1;
        goto L_0x0039;
    L_0x0038:
        r6 = 0;
    L_0x0039:
        r9 = "unlockableContentType";
        defpackage.akcr.a(r5, r9);
        r5 = java.lang.Integer.parseInt(r5);
        r9 = defpackage.afdr.BITMOJI_FILTER;
        r9 = r9.ordinal();
        if (r5 != r9) goto L_0x00a8;
    L_0x004a:
        defpackage.akcr.b(r1, r2);
        defpackage.akcr.b(r7, r3);
        defpackage.akcr.b(r8, r4);
        r2 = "bitmoji_avatar_id";
        r2 = r1.getQueryParameter(r2);
        if (r2 != 0) goto L_0x0062;
    L_0x005b:
        r1 = "Avatar id must be present for bitmoji filter";
        r1 = defpackage.ijk.a(r1);
        return r1;
    L_0x0062:
        r3 = "bitmoji_image_id";
        r3 = r1.getQueryParameter(r3);
        if (r3 != 0) goto L_0x0071;
    L_0x006a:
        r1 = "Bitmoji filter must have a present image/comic id.";
        r1 = defpackage.ijk.a(r1);
        return r1;
    L_0x0071:
        if (r6 == 0) goto L_0x0082;
    L_0x0073:
        r4 = "friend_bitmoji_avatar_id";
        r1 = r1.getQueryParameter(r4);
        if (r1 != 0) goto L_0x0083;
    L_0x007b:
        r1 = "Friendmoji filter must have friend avatar id.";
        r1 = defpackage.ijk.a(r1);
        return r1;
    L_0x0082:
        r1 = 0;
    L_0x0083:
        r12 = r1;
        r1 = r0.c;
        if (r12 == 0) goto L_0x0097;
    L_0x0088:
        r14 = defpackage.afnd.GEOFILTER;
        r15 = 0;
        r16 = 0;
        r17 = 48;
        r11 = r2;
        r13 = r3;
        r4 = defpackage.dds.a(r11, r12, r13, r14, r15, r16, r17);
        if (r4 != 0) goto L_0x00a3;
    L_0x0097:
        r13 = defpackage.afnd.GEOFILTER;
        r14 = 0;
        r15 = 0;
        r16 = 24;
        r11 = r2;
        r12 = r3;
        r4 = defpackage.dds.a(r11, r12, r13, r14, r15, r16);
    L_0x00a3:
        r1 = r1.a(r4, r7, r10, r8);
        return r1;
    L_0x00a8:
        defpackage.akcr.b(r1, r2);
        defpackage.akcr.b(r7, r3);
        defpackage.akcr.b(r8, r4);
        r2 = "url";
        r3 = r1.getQueryParameter(r2);
        r11 = r0.b;
        r12 = new gew;
        defpackage.akcr.a(r3, r2);
        r1 = new sbm$a;
        r2 = defpackage.sac.GET;
        r1.<init>(r3, r2);
        r1 = r1.e();
        r4 = r1;
        r4 = (defpackage.sak) r4;
        r5 = 0;
        r1 = defpackage.gii.a;
        r6 = r1;
        r6 = (defpackage.gfl) r6;
        r1 = r0.a;
        r9 = r1;
        r9 = (defpackage.geo) r9;
        r13 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r1 = r12;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r9;
        r7 = r20;
        r8 = r22;
        r9 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r12 = (defpackage.geg) r12;
        r1 = r11.a(r12);
        r1 = r1.a(r10);
        r2 = "contentManager.submit(De…tResult(closeOnTerminate)";
        defpackage.akcr.a(r1, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijk.a(android.net.Uri, java.util.Set, boolean, java.util.Set):ajdx");
    }
}
