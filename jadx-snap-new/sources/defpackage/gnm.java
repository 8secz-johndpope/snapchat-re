package defpackage;

/* renamed from: gnm */
public final class gnm {
    public final int a;
    public final int b;
    private final gnn c;

    public gnm(gnn gnn, int i) {
        akcr.b(gnn, "event");
        this.c = gnn;
        this.a = i;
        this.b = 0;
    }

    public /* synthetic */ gnm(gnn gnn, int i, byte b) {
        this(gnn, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gnm) {
                gnm gnm = (gnm) obj;
                if (akcr.a(this.c, gnm.c)) {
                    if ((this.a == gnm.a ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        gnn gnn = this.c;
        return (((gnn != null ? gnn.hashCode() : 0) * 31) + this.a) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LifecycleConstraints(event=");
        stringBuilder.append(this.c);
        stringBuilder.append(", delayInMinutes=");
        stringBuilder.append(this.a);
        stringBuilder.append(", jitterInMinutes=0");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
