package com.snap.core.db.column;

import defpackage.ainu;

public class PreferencesKeyColumnAdapter implements ainu<PreferencesColumnKey, String> {
    public PreferencesColumnKey decode(String str) {
        PreferencesColumnKey parse = PreferencesColumnKey.parse(str);
        return parse != null ? parse : new PreferencesColumnKey(null, null);
    }

    public String encode(PreferencesColumnKey preferencesColumnKey) {
        return preferencesColumnKey.toString();
    }
}
