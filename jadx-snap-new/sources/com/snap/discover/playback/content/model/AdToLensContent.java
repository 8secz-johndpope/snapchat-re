package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.ahjz;
import defpackage.akcr;

@Keep
public final class AdToLensContent {
    @SerializedName("ad_to_lens")
    private final ahjz adToLens;

    public AdToLensContent(ahjz ahjz) {
        akcr.b(ahjz, "adToLens");
        this.adToLens = ahjz;
    }

    public static /* synthetic */ AdToLensContent copy$default(AdToLensContent adToLensContent, ahjz ahjz, int i, Object obj) {
        if ((i & 1) != 0) {
            ahjz = adToLensContent.adToLens;
        }
        return adToLensContent.copy(ahjz);
    }

    public final ahjz component1() {
        return this.adToLens;
    }

    public final AdToLensContent copy(ahjz ahjz) {
        akcr.b(ahjz, "adToLens");
        return new AdToLensContent(ahjz);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.adToLens, ((com.snap.discover.playback.content.model.AdToLensContent) r2).adToLens) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.discover.playback.content.model.AdToLensContent;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.discover.playback.content.model.AdToLensContent) r2;
        r0 = r1.adToLens;
        r2 = r2.adToLens;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.AdToLensContent.equals(java.lang.Object):boolean");
    }

    public final ahjz getAdToLens() {
        return this.adToLens;
    }

    public final int hashCode() {
        ahjz ahjz = this.adToLens;
        return ahjz != null ? ahjz.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdToLensContent(adToLens=");
        stringBuilder.append(this.adToLens);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
