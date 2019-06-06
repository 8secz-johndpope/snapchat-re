package com.snap.core.db.column;

import defpackage.akco;
import defpackage.akcr;
import defpackage.akgc;

public final class PreferencesColumnKey {
    public static final Companion Companion = new Companion();
    private static final String FEATURE_DELIMITER = "~";
    private final String feature;
    private final String key;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final PreferencesColumnKey parse(String str) {
            if (str == null) {
                return null;
            }
            int a = akgc.a((CharSequence) str, PreferencesColumnKey.FEATURE_DELIMITER, 0, false, 6);
            if (a < 0) {
                return null;
            }
            Object substring = str.substring(0, a);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            akcr.a(substring, str2);
            Object substring2 = str.substring(a + 1, str.length());
            akcr.a(substring2, str2);
            return new PreferencesColumnKey(substring, substring2);
        }
    }

    public PreferencesColumnKey(String str, String str2) {
        this.feature = str;
        this.key = str2;
    }

    public static /* synthetic */ PreferencesColumnKey copy$default(PreferencesColumnKey preferencesColumnKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferencesColumnKey.feature;
        }
        if ((i & 2) != 0) {
            str2 = preferencesColumnKey.key;
        }
        return preferencesColumnKey.copy(str, str2);
    }

    public static final PreferencesColumnKey parse(String str) {
        return Companion.parse(str);
    }

    public final String component1() {
        return this.feature;
    }

    public final String component2() {
        return this.key;
    }

    public final PreferencesColumnKey copy(String str, String str2) {
        return new PreferencesColumnKey(str, str2);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.key, r3.key) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.db.column.PreferencesColumnKey;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.core.db.column.PreferencesColumnKey) r3;
        r0 = r2.feature;
        r1 = r3.feature;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.key;
        r3 = r3.key;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.PreferencesColumnKey.equals(java.lang.Object):boolean");
    }

    public final String getFeature() {
        return this.feature;
    }

    public final String getKey() {
        return this.key;
    }

    public final int hashCode() {
        String str = this.feature;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.key;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.feature);
        stringBuilder.append(FEATURE_DELIMITER);
        stringBuilder.append(this.key);
        return stringBuilder.toString();
    }
}
