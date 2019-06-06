package com.snap.lenses.app.snappable;

import com.google.gson.annotations.SerializedName;
import defpackage.aedh;
import defpackage.ajdx;
import defpackage.akcr;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;

public interface SnappableMetadataHttpInterface {

    public static final class a extends aedh {
        @SerializedName("story_id")
        private final String a;

        public a(String str) {
            akcr.b(str, "storyId");
            this.a = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((com.snap.lenses.app.snappable.SnappableMetadataHttpInterface.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof com.snap.lenses.app.snappable.SnappableMetadataHttpInterface.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (com.snap.lenses.app.snappable.SnappableMetadataHttpInterface.a) r2;
            r0 = r1.a;
            r2 = r2.a;
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
            throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.app.snappable.SnappableMetadataHttpInterface$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Request(storyId=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    @akxy(a = "/lens/snappables/metadata/download")
    ajdx<akxa<akhw>> loadStorySnappableMetadata(@akxk a aVar);
}
