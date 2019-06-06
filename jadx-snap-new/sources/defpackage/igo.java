package defpackage;

import com.google.common.base.Predicate;

/* renamed from: igo */
public final class igo {
    final Predicate<Throwable> a;
    final int b;
    final int c;
    final int d;
    final ajdw e;

    public igo() {
        this(null, 0, 0, 0, null, 31);
    }

    public igo(Predicate<Throwable> predicate, int i, int i2, int i3, ajdw ajdw) {
        akcr.b(ajdw, "scheduler");
        this.a = predicate;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ajdw;
    }

    public /* synthetic */ igo(Predicate predicate, int i, int i2, int i3, ajdw ajdw, int i4) {
        if ((i4 & 1) != 0) {
            predicate = null;
        }
        Predicate predicate2 = predicate;
        int i5 = (i4 & 2) != 0 ? 2 : i;
        int i6 = (i4 & 4) != 0 ? 2 : i2;
        int i7 = (i4 & 8) != 0 ? 60 : i3;
        if ((i4 & 16) != 0) {
            ajdw = ajwh.b;
            akcr.a((Object) ajdw, "Schedulers.computation()");
        }
        this(predicate2, i5, i6, i7, ajdw);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof igo) {
                igo igo = (igo) obj;
                if (akcr.a(this.a, igo.a)) {
                    if ((this.b == igo.b ? 1 : null) != null) {
                        if ((this.c == igo.c ? 1 : null) != null) {
                            if ((this.d == igo.d ? 1 : null) == null || !akcr.a(this.e, igo.e)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Predicate predicate = this.a;
        int i = 0;
        int hashCode = (((((((predicate != null ? predicate.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
        ajdw ajdw = this.e;
        if (ajdw != null) {
            i = ajdw.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkRequestRetryConfiguration(retryPredicate=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numberOfRetries=");
        stringBuilder.append(this.b);
        stringBuilder.append(", minBackoffJitter=");
        stringBuilder.append(this.c);
        stringBuilder.append(", maxBackoffJitter=");
        stringBuilder.append(this.d);
        stringBuilder.append(", scheduler=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
