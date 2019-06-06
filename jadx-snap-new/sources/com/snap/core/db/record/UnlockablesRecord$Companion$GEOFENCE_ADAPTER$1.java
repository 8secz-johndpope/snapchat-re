package com.snap.core.db.record;

import com.snapchat.soju.android.Geofence;
import defpackage.ainu;
import defpackage.akcr;
import defpackage.iha;

public final class UnlockablesRecord$Companion$GEOFENCE_ADAPTER$1 implements ainu<Geofence, String> {
    private final iha GSON = iha.a();

    UnlockablesRecord$Companion$GEOFENCE_ADAPTER$1() {
    }

    public final Geofence decode(String str) {
        akcr.b(str, "s");
        Object a = this.GSON.a(str, Geofence.class);
        akcr.a(a, "GSON.fromJson(s, Geofence::class.java)");
        return (Geofence) a;
    }

    public final String encode(Geofence geofence) {
        akcr.b(geofence, "geofence");
        Object b = this.GSON.b(geofence);
        akcr.a(b, "GSON.toJsonString(geofence)");
        return b;
    }
}
