package defpackage;

import android.net.Uri;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import defpackage.xun.b;
import java.util.Set;

@ftr(a = "sticker/#")
/* renamed from: xtg */
public final class xtg extends ggm {
    final String a;
    final dea b;
    final xss c;
    final xsz d;
    private final xup e;

    /* renamed from: xtg$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xtg a;
        private /* synthetic */ Set b;
        private /* synthetic */ boolean c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;

        a(xtg xtg, Set set, boolean z, Set set2, boolean z2) {
            this.a = xtg;
            this.b = set;
            this.c = z;
            this.d = set2;
            this.e = z2;
        }

        /* JADX WARNING: Missing block: B:22:0x00ab, code skipped:
            if (r7 == null) goto L_0x00ad;
     */
        /* JADX WARNING: Missing block: B:25:0x00bd, code skipped:
            if (r1 == null) goto L_0x00bf;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r18) {
            /*
            r17 = this;
            r0 = r17;
            r1 = r18;
            r1 = (defpackage.xvn) r1;
            r2 = "it";
            defpackage.akcr.b(r1, r2);
            r3 = r0.a;
            r4 = r0.b;
            r5 = r0.c;
            r6 = r0.d;
            r7 = r0.e;
            r8 = r1.type();
            r8 = defpackage.afax.a(r8);
            r9 = r1.packId();
            r10 = "Required value was null.";
            if (r9 == 0) goto L_0x00dd;
        L_0x0025:
            r1 = r1.stickerId();
            if (r1 == 0) goto L_0x00d1;
        L_0x002b:
            if (r8 != 0) goto L_0x002e;
        L_0x002d:
            goto L_0x0043;
        L_0x002e:
            r10 = defpackage.xth.a;
            r11 = r8.ordinal();
            r10 = r10[r11];
            r11 = 1;
            r12 = 0;
            if (r10 == r11) goto L_0x00c6;
        L_0x003a:
            r11 = 2;
            if (r10 == r11) goto L_0x00c6;
        L_0x003d:
            r11 = 3;
            if (r10 == r11) goto L_0x0080;
        L_0x0040:
            r2 = 4;
            if (r10 == r2) goto L_0x0064;
        L_0x0043:
            r2 = new java.lang.StringBuilder;
            r3 = "Unknown sticker ";
            r2.<init>(r3);
            r2.append(r8);
            r3 = 32;
            r2.append(r3);
            r2.append(r9);
            r2.append(r3);
            r2.append(r1);
            r1 = r2.toString();
            r1 = defpackage.xtg.a(r1);
            return r1;
        L_0x0064:
            r2 = r3.c;
            r7 = new java.lang.StringBuilder;
            r7.<init>();
            r3 = r3.a;
            r7.append(r3);
            r7.append(r1);
            r1 = r7.toString();
            r1 = defpackage.xte.a(r1, r12);
            r1 = r2.a(r1, r4, r5, r6);
            return r1;
        L_0x0080:
            r8 = new cga;
            r8.<init>(r9, r1, r7);
            r1 = r8.c();
            if (r1 == 0) goto L_0x00bf;
        L_0x008b:
            r3 = r3.b;
            defpackage.akcr.a(r1, r2);
            r2 = r8.b();
            r7 = "sticker.imageId";
            defpackage.akcr.a(r2, r7);
            r11 = r8.d();
            if (r11 == 0) goto L_0x00ad;
        L_0x009f:
            r13 = defpackage.afnd.STICKERS;
            r14 = 0;
            r15 = 0;
            r16 = 48;
            r10 = r1;
            r12 = r2;
            r7 = defpackage.dds.a(r10, r11, r12, r13, r14, r15, r16);
            if (r7 != 0) goto L_0x00b9;
        L_0x00ad:
            r12 = defpackage.afnd.STICKERS;
            r13 = 0;
            r14 = 0;
            r15 = 24;
            r10 = r1;
            r11 = r2;
            r7 = defpackage.dds.a(r10, r11, r12, r13, r14, r15);
        L_0x00b9:
            r1 = r3.a(r7, r4, r5, r6);
            if (r1 != 0) goto L_0x00c5;
        L_0x00bf:
            r1 = "Bitmoji sticker avatar id must not be null";
            r1 = defpackage.xtg.a(r1);
        L_0x00c5:
            return r1;
        L_0x00c6:
            r2 = r3.d;
            r1 = defpackage.xte.a(r9, r1, r12);
            r1 = r2.a(r1, r4, r5, r6);
            return r1;
        L_0x00d1:
            r1 = new java.lang.IllegalStateException;
            r2 = r10.toString();
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x00dd:
            r1 = new java.lang.IllegalStateException;
            r2 = r10.toString();
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xtg$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public xtg(dea dea, xss xss, xsz xsz, xup xup, Uri uri) {
        akcr.b(dea, "bitmojiUriHandler");
        akcr.b(xss, "externalStickerUriHandler");
        akcr.b(xsz, "snapStickerUriHandler");
        akcr.b(xup, "stickerRepository");
        akcr.b(uri, "baseUrl");
        this.b = dea;
        this.c = xss;
        this.d = xsz;
        this.e = xup;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.toString());
        stringBuilder.append("/stickers/get_custom_sticker_image/sticker_ids=");
        this.a = stringBuilder.toString();
    }

    static ajdx<gej> a(String str) {
        Object b = ajdx.b(a.a((Throwable) new IllegalArgumentException(str), null));
        akcr.a(b, "Single.just(FailedConten…ption(exceptionMessage)))");
        return b;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        long parseLong = Long.parseLong((String) obj);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("animated", false);
        xun xun = (xun) this.e.b.b();
        DbClient a = xun.a();
        obj = xvn.a.getSticker(parseLong);
        akcr.a(obj, "FACTORY.getSticker(payloadId)");
        Object b = a.queryAndMapToOne(obj, new b(xvn.b)).e().b(xun.a.scheduler());
        akcr.a(b, "dbClient.queryAndMapToOn…ibeOn(snapDb.scheduler())");
        b = b.a((ajfc) new a(this, set, z, set2, booleanQueryParameter));
        akcr.a(b, "stickerRepository.getSti…cessControls, animated) }");
        return b;
    }
}
