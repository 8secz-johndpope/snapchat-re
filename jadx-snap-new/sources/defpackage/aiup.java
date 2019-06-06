package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: aiup */
public final class aiup {
    public final aiuo a;
    public final aivw b;

    public aiup(aiuo aiuo, aivw aivw) {
        this.a = (aiuo) Preconditions.checkNotNull(aiuo, "state is null");
        this.b = (aivw) Preconditions.checkNotNull(aivw, "status is null");
    }

    public static aiup a(aiuo aiuo) {
        Preconditions.checkArgument(aiuo != aiuo.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new aiup(aiuo, aivw.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiup)) {
            return false;
        }
        aiup aiup = (aiup) obj;
        return this.a.equals(aiup.a) && this.b.equals(aiup.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.b()) {
            return this.a.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
