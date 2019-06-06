package com.snap.core.db.column;

import android.text.TextUtils;
import defpackage.aeyn;
import defpackage.akco;

public final class GeofilterMetadata {
    public static final Companion Companion = new Companion();
    private final String encGeoData;
    private final String filterId;
    private final String lensId;
    private final String unlockablesSnapInfo;
    private final String venueId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final GeofilterMetadata fromSnapMetadata(aeyn aeyn) {
            return aeyn != null ? new GeofilterMetadata(aeyn.e, aeyn.f, aeyn.j, aeyn.t, aeyn.g) : null;
        }
    }

    public GeofilterMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public GeofilterMetadata(String str, String str2, String str3, String str4, String str5) {
        this.filterId = str;
        this.lensId = str2;
        this.venueId = str3;
        this.unlockablesSnapInfo = str4;
        this.encGeoData = str5;
    }

    public /* synthetic */ GeofilterMetadata(String str, String str2, String str3, String str4, String str5, int i, akco akco) {
        String str6 = (i & 1) != 0 ? null : str;
        this(str6, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ GeofilterMetadata copy$default(GeofilterMetadata geofilterMetadata, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geofilterMetadata.filterId;
        }
        if ((i & 2) != 0) {
            str2 = geofilterMetadata.lensId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = geofilterMetadata.venueId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = geofilterMetadata.unlockablesSnapInfo;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = geofilterMetadata.encGeoData;
        }
        return geofilterMetadata.copy(str, str6, str7, str8, str5);
    }

    public static final GeofilterMetadata fromSnapMetadata(aeyn aeyn) {
        return Companion.fromSnapMetadata(aeyn);
    }

    public final String component1() {
        return this.filterId;
    }

    public final String component2() {
        return this.lensId;
    }

    public final String component3() {
        return this.venueId;
    }

    public final String component4() {
        return this.unlockablesSnapInfo;
    }

    public final String component5() {
        return this.encGeoData;
    }

    public final boolean containsGeofilterInformation() {
        return (TextUtils.isEmpty((CharSequence) this.encGeoData) && TextUtils.isEmpty(this.unlockablesSnapInfo) && TextUtils.isEmpty(this.venueId)) ? false : true;
    }

    public final GeofilterMetadata copy(String str, String str2, String str3, String str4, String str5) {
        return new GeofilterMetadata(str, str2, str3, str4, str5);
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.encGeoData, r3.encGeoData) != false) goto L_0x003d;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.db.column.GeofilterMetadata;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.snap.core.db.column.GeofilterMetadata) r3;
        r0 = r2.filterId;
        r1 = r3.filterId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.lensId;
        r1 = r3.lensId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.venueId;
        r1 = r3.venueId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.unlockablesSnapInfo;
        r1 = r3.unlockablesSnapInfo;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.encGeoData;
        r3 = r3.encGeoData;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.GeofilterMetadata.equals(java.lang.Object):boolean");
    }

    public final String getEncGeoData() {
        return this.encGeoData;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final String getLensId() {
        return this.lensId;
    }

    public final String getUnlockablesSnapInfo() {
        return this.unlockablesSnapInfo;
    }

    public final String getVenueId() {
        return this.venueId;
    }

    public final int hashCode() {
        String str = this.filterId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lensId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.venueId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.unlockablesSnapInfo;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.encGeoData;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GeofilterMetadata(filterId=");
        stringBuilder.append(this.filterId);
        stringBuilder.append(", lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", venueId=");
        stringBuilder.append(this.venueId);
        stringBuilder.append(", unlockablesSnapInfo=");
        stringBuilder.append(this.unlockablesSnapInfo);
        stringBuilder.append(", encGeoData=");
        stringBuilder.append(this.encGeoData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
