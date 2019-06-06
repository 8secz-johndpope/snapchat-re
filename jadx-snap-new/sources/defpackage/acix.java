package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: acix */
public final class acix {
    b a = b.UNADDED;

    /* renamed from: acix$b */
    public enum b {
        UNADDED(0),
        ADDED(1),
        STACKED(2),
        PARTIALLY_VISIBLE(3),
        VISIBLE(3);
        
        final int mGraphValue;

        private b(int i) {
            this.mGraphValue = i;
        }
    }

    /* renamed from: acix$a */
    public enum a {
        ON_ADDED(b.UNADDED, b.ADDED),
        ON_STACKED(b.ADDED, b.STACKED),
        ON_VISIBLE(b.STACKED, b.VISIBLE),
        ON_PARTIALLY_VISIBLE(b.STACKED, b.PARTIALLY_VISIBLE),
        ON_VISIBLE_FROM_PARTIALLY_VISIBLE(b.PARTIALLY_VISIBLE, b.VISIBLE),
        ON_PARTIALLY_HIDDEN(b.VISIBLE, b.PARTIALLY_VISIBLE),
        ON_HIDDEN_FROM_PARTIALLY_VISIBLE(b.PARTIALLY_VISIBLE, b.STACKED),
        ON_HIDDEN(b.VISIBLE, b.STACKED),
        ON_UNSTACKED(b.STACKED, b.ADDED),
        ON_REMOVED(b.ADDED, b.UNADDED);
        
        final b mEnd;
        final b mStart;

        private a(b bVar, b bVar2) {
            boolean z = true;
            if (bVar == bVar2 || Math.abs(bVar2.mGraphValue - bVar.mGraphValue) > 1) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid PageState transition from ");
            stringBuilder.append(bVar2.name());
            stringBuilder.append(" to ");
            stringBuilder.append(bVar.name());
            Preconditions.checkArgument(z, stringBuilder.toString());
            this.mStart = bVar;
            this.mEnd = bVar2;
        }
    }

    acix() {
    }
}
