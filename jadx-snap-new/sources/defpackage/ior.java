package defpackage;

import defpackage.ily.a;

/* renamed from: ior */
public enum ior implements ily {
    OPERA_PAGE_RESOLVED,
    OPERA_PAGE_VIEW_STARTED,
    OPERA_PAGE_MINIMALLY_DISPLAYED,
    OPERA_PAGE_VIEW_SUCCEEDED,
    OPERA_PAGE_VIEW_FAILED,
    OPERA_PAGE_VIEW_COMPLETED,
    OPERA_PAGE_VIEW_ABANDONED,
    OPERA_PAGE_ATTACHMENT_RESOLVED,
    OPERA_PAGE_ATTACHMENT_FAILED,
    OPERA_GROUP_VIEW_COMPLETED,
    OPERA_SESSION_VIEW_COMPLETED,
    OPERA_PAGES_VIEWED_IN_GROUP,
    OPERA_PAGES_VIEWED_IN_SESSION,
    OPERA_GROUPS_VIEWED_IN_SESSION;

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
        return ink.OPERA;
    }

    public final ilz b() {
        return a.a(this);
    }
}
