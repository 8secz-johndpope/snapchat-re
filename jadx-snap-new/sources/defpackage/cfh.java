package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: cfh */
final class cfh extends cfi {
    private final RecyclerView a;
    private final int b;
    private final int c;

    cfh(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView != null) {
            this.a = recyclerView;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public final RecyclerView a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfi) {
            cfi cfi = (cfi) obj;
            return this.a.equals(cfi.a()) && this.b == cfi.b() && this.c == cfi.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RecyclerViewScrollEvent{view=");
        stringBuilder.append(this.a);
        stringBuilder.append(", dx=");
        stringBuilder.append(this.b);
        stringBuilder.append(", dy=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
