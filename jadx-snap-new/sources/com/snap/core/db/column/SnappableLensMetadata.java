package com.snap.core.db.column;

import defpackage.aeyn;
import defpackage.akco;

public final class SnappableLensMetadata {
    public static final Companion Companion = new Companion();
    private static final SnappableLensMetadata Noop = new SnappableLensMetadata(null, null, 3, null);
    private final String lensId;
    private final String lensMetadata;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final SnappableLensMetadata fromSnapMetadata(aeyn aeyn) {
            return aeyn != null ? new SnappableLensMetadata(aeyn.f, aeyn.q) : null;
        }

        public final SnappableLensMetadata getNoop() {
            return SnappableLensMetadata.Noop;
        }
    }

    public SnappableLensMetadata() {
        this(null, null, 3, null);
    }

    public SnappableLensMetadata(String str, String str2) {
        this.lensId = str;
        this.lensMetadata = str2;
    }

    public /* synthetic */ SnappableLensMetadata(String str, String str2, int i, akco akco) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }

    public static /* synthetic */ SnappableLensMetadata copy$default(SnappableLensMetadata snappableLensMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snappableLensMetadata.lensId;
        }
        if ((i & 2) != 0) {
            str2 = snappableLensMetadata.lensMetadata;
        }
        return snappableLensMetadata.copy(str, str2);
    }

    public static final SnappableLensMetadata fromSnapMetadata(aeyn aeyn) {
        return Companion.fromSnapMetadata(aeyn);
    }

    public final String component1() {
        return this.lensId;
    }

    public final String component2() {
        return this.lensMetadata;
    }

    public final SnappableLensMetadata copy(String str, String str2) {
        return new SnappableLensMetadata(str, str2);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.lensMetadata, r3.lensMetadata) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.db.column.SnappableLensMetadata;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.core.db.column.SnappableLensMetadata) r3;
        r0 = r2.lensId;
        r1 = r3.lensId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.lensMetadata;
        r3 = r3.lensMetadata;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.SnappableLensMetadata.equals(java.lang.Object):boolean");
    }

    public final String getLensId() {
        return this.lensId;
    }

    public final String getLensMetadata() {
        return this.lensMetadata;
    }

    public final int hashCode() {
        String str = this.lensId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lensMetadata;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnappableLensMetadata(lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", lensMetadata=");
        stringBuilder.append(this.lensMetadata);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
