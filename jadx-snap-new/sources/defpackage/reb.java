package defpackage;

import defpackage.yic.a;

/* renamed from: reb */
public final class reb {
    final boolean a;
    final a b;
    final prl c;
    final qwj d;

    public reb(boolean z, a aVar, prl prl, qwj qwj) {
        akcr.b(aVar, "storyLoadingState");
        akcr.b(prl, "snapLoadingState");
        akcr.b(qwj, "feedViewState");
        this.a = z;
        this.b = aVar;
        this.c = prl;
        this.d = qwj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof reb) {
                reb reb = (reb) obj;
                if (!((this.a == reb.a ? 1 : null) != null && akcr.a(this.b, reb.b) && akcr.a(this.c, reb.c) && akcr.a(this.d, reb.d))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        a aVar = this.b;
        int i2 = 0;
        i = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        prl prl = this.c;
        i = (i + (prl != null ? prl.hashCode() : 0)) * 31;
        qwj qwj = this.d;
        if (qwj != null) {
            i2 = qwj.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaLoadingState(latestUserInitiatedStory=");
        stringBuilder.append(this.a);
        stringBuilder.append(", storyLoadingState=");
        stringBuilder.append(this.b);
        stringBuilder.append(", snapLoadingState=");
        stringBuilder.append(this.c);
        stringBuilder.append(", feedViewState=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
