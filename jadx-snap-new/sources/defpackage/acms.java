package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: acms */
public final class acms extends acmr {
    public final String a;
    public final String b;
    public final String c;
    private final int d;
    private final String e;

    public acms(int i, String str, String str2, String str3, String str4) {
        akcr.b(str, "json");
        akcr.b(str2, "accessToken");
        akcr.b(str3, Event.REQUEST_TOKEN);
        super();
        this.d = i;
        this.a = str;
        this.b = str2;
        this.e = str3;
        this.c = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acms) {
                acms acms = (acms) obj;
                if (!((this.d == acms.d ? 1 : null) != null && akcr.a(this.a, acms.a) && akcr.a(this.b, acms.b) && akcr.a(this.e, acms.e) && akcr.a(this.c, acms.c))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.d * 31;
        String str = this.a;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapStyleUpdatedEvent(styleId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", json=");
        stringBuilder.append(this.a);
        stringBuilder.append(", accessToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", requestToken=");
        stringBuilder.append(this.e);
        stringBuilder.append(", borderJson=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
