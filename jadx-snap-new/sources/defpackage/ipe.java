package defpackage;

import defpackage.ily.a;

/* renamed from: ipe */
public enum ipe implements ily {
    ;

    private ipe(String str) {
    }

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
        return ink.STORY_PLAYBACK;
    }

    public final ilz b() {
        return a.a(this);
    }
}
