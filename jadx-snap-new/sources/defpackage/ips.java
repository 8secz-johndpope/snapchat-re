package defpackage;

import com.snap.ui.avatar.AvatarsInfo;

/* renamed from: ips */
public final class ips {
    public final AvatarsInfo a;
    public final boolean b;
    private final boolean c;

    public ips(AvatarsInfo avatarsInfo, boolean z, boolean z2) {
        akcr.b(avatarsInfo, "avatarInfo");
        this.a = avatarsInfo;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ips) {
                ips ips = (ips) obj;
                if (akcr.a(this.a, ips.a)) {
                    if ((this.b == ips.b ? 1 : null) != null) {
                        if ((this.c == ips.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AvatarsInfo avatarsInfo = this.a;
        int hashCode = (avatarsInfo != null ? avatarsInfo.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HovaAvatarInfo(avatarInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isSending=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isFailed=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
