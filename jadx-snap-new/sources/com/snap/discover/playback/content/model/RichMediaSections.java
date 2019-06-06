package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import defpackage.akcr;
import java.util.List;

@Keep
public final class RichMediaSections {
    private final List<RichMediaItem> sections;

    public RichMediaSections(List<RichMediaItem> list) {
        akcr.b(list, "sections");
        this.sections = list;
    }

    public static /* synthetic */ RichMediaSections copy$default(RichMediaSections richMediaSections, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = richMediaSections.sections;
        }
        return richMediaSections.copy(list);
    }

    public final List<RichMediaItem> component1() {
        return this.sections;
    }

    public final RichMediaSections copy(List<RichMediaItem> list) {
        akcr.b(list, "sections");
        return new RichMediaSections(list);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.sections, ((com.snap.discover.playback.content.model.RichMediaSections) r2).sections) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.discover.playback.content.model.RichMediaSections;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.discover.playback.content.model.RichMediaSections) r2;
        r0 = r1.sections;
        r2 = r2.sections;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.RichMediaSections.equals(java.lang.Object):boolean");
    }

    public final List<RichMediaItem> getSections() {
        return this.sections;
    }

    public final int hashCode() {
        List list = this.sections;
        return list != null ? list.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RichMediaSections(sections=");
        stringBuilder.append(this.sections);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
