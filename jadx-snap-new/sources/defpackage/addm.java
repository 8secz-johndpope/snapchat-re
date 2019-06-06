package defpackage;

/* renamed from: addm */
public final class addm {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public /* synthetic */ addm(String str, boolean z, int i) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            z = true;
        }
        this(false, false, str, z);
    }

    public addm(boolean z, boolean z2, String str, boolean z3) {
        akcr.b(str, "gameId");
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof addm) {
                addm addm = (addm) obj;
                if ((this.a == addm.a ? 1 : null) != null) {
                    if ((this.b == addm.b ? 1 : null) != null && akcr.a(this.c, addm.c)) {
                        if ((this.d == addm.d ? 1 : null) != null) {
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
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        String str = this.c;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GameState(isOn=");
        stringBuilder.append(this.a);
        stringBuilder.append(", showUserScore=");
        stringBuilder.append(this.b);
        stringBuilder.append(", gameId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", enableLeaderboard=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
