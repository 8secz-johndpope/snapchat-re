package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: hnb */
public final class hnb {
    public final String a;
    public final aaua b;
    public final String c;
    public final int d;

    public hnb(String str, aaua aaua, String str2, int i) {
        akcr.b(str, "id");
        akcr.b(aaua, "pageType");
        akcr.b(str2, Event.LANGUAGES);
        this.a = str;
        this.b = aaua;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hnb) {
                hnb hnb = (hnb) obj;
                if (akcr.a(this.a, hnb.a) && akcr.a(this.b, hnb.b) && akcr.a(this.c, hnb.c)) {
                    if ((this.d == hnb.d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        aaua aaua = this.b;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryFeedSession(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pageType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", languages=");
        stringBuilder.append(this.c);
        stringBuilder.append(", reRankCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
