package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.ahkn;
import defpackage.akcr;

@Keep
public final class DeepLinkContent {
    @SerializedName("deep_link_attachment")
    private final ahkn deepLinkAttachment;

    public DeepLinkContent(ahkn ahkn) {
        akcr.b(ahkn, "deepLinkAttachment");
        this.deepLinkAttachment = ahkn;
    }

    public static /* synthetic */ DeepLinkContent copy$default(DeepLinkContent deepLinkContent, ahkn ahkn, int i, Object obj) {
        if ((i & 1) != 0) {
            ahkn = deepLinkContent.deepLinkAttachment;
        }
        return deepLinkContent.copy(ahkn);
    }

    public final ahkn component1() {
        return this.deepLinkAttachment;
    }

    public final DeepLinkContent copy(ahkn ahkn) {
        akcr.b(ahkn, "deepLinkAttachment");
        return new DeepLinkContent(ahkn);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.deepLinkAttachment, ((com.snap.discover.playback.content.model.DeepLinkContent) r2).deepLinkAttachment) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.discover.playback.content.model.DeepLinkContent;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.discover.playback.content.model.DeepLinkContent) r2;
        r0 = r1.deepLinkAttachment;
        r2 = r2.deepLinkAttachment;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.DeepLinkContent.equals(java.lang.Object):boolean");
    }

    public final ahkn getDeepLinkAttachment() {
        return this.deepLinkAttachment;
    }

    public final int hashCode() {
        ahkn ahkn = this.deepLinkAttachment;
        return ahkn != null ? ahkn.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeepLinkContent(deepLinkAttachment=");
        stringBuilder.append(this.deepLinkAttachment);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
