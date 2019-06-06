package defpackage;

import defpackage.ily.a;

/* renamed from: inx */
public enum inx implements ily {
    FETCH_MODEL_SUCCESS,
    FETCH_MODEL_FAILURE,
    LOCAL_TRAINING,
    UPDATE_MODEL_SUCCESS,
    UPDATE_MODEL_FAILURE;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.DDML;
    }

    public final ilz b() {
        return a.a(this);
    }
}
