package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.ahkl;
import java.util.List;

@Keep
public final class CommerceContent {
    @SerializedName("commerce_catalogs")
    private final List<ahkl> commerceCatalogs;

    public CommerceContent(List<? extends ahkl> list) {
        this.commerceCatalogs = list;
    }

    public static /* synthetic */ CommerceContent copy$default(CommerceContent commerceContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commerceContent.commerceCatalogs;
        }
        return commerceContent.copy(list);
    }

    public final List<ahkl> component1() {
        return this.commerceCatalogs;
    }

    public final CommerceContent copy(List<? extends ahkl> list) {
        return new CommerceContent(list);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.commerceCatalogs, ((com.snap.discover.playback.content.model.CommerceContent) r2).commerceCatalogs) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.discover.playback.content.model.CommerceContent;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.discover.playback.content.model.CommerceContent) r2;
        r0 = r1.commerceCatalogs;
        r2 = r2.commerceCatalogs;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.CommerceContent.equals(java.lang.Object):boolean");
    }

    public final List<ahkl> getCommerceCatalogs() {
        return this.commerceCatalogs;
    }

    public final int hashCode() {
        List list = this.commerceCatalogs;
        return list != null ? list.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CommerceContent(commerceCatalogs=");
        stringBuilder.append(this.commerceCatalogs);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
