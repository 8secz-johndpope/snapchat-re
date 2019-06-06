package defpackage;

import defpackage.abln.a;

/* renamed from: qxi */
public enum qxi implements a {
    SOURCE_LOGIN("login"),
    SOURCE_COLD_START("cold_start"),
    SOURCE_WARM_START("warm_start"),
    SOURCE_UNKNOWN("unknown");
    
    private final String name;

    private qxi(String str) {
        this.name = str;
    }

    public final String toString() {
        return this.name;
    }
}
