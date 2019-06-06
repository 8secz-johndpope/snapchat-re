package defpackage;

/* renamed from: dbn */
public class dbn extends das<dbn> {
    public long a;
    public long b;
    private boolean c;
    private jh<String, Long> d;

    public dbn() {
        this(false);
    }

    private dbn(boolean z) {
        this.d = new jh();
        this.c = z;
    }

    private dbn a(dbn dbn) {
        this.a = dbn.a;
        this.b = dbn.b;
        if (dbn.c && this.c) {
            this.d.clear();
            this.d.a(dbn.d);
        }
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dbn dbn = (dbn) das;
        dbn dbn2 = (dbn) das2;
        if (dbn2 == null) {
            dbn2 = new dbn(this.c);
        }
        if (dbn == null) {
            dbn2.a(this);
        } else {
            dbn2.a = this.a - dbn.a;
            dbn2.b = this.b - dbn.b;
            if (dbn2.c) {
                dbn2.d.clear();
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) this.d.b(i);
                    Long l = (Long) dbn.d.get(str);
                    long longValue = ((Long) this.d.c(i)).longValue() - (l == null ? 0 : l.longValue());
                    if (longValue != 0) {
                        dbn2.d.put(str, Long.valueOf(longValue));
                    }
                }
            }
        }
        return dbn2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dbn dbn = (dbn) das;
        dbn dbn2 = (dbn) das2;
        if (dbn2 == null) {
            dbn2 = new dbn(this.c);
        }
        if (dbn == null) {
            dbn2.a(this);
        } else {
            dbn2.a = this.a + dbn.a;
            dbn2.b = this.b + dbn.b;
            if (dbn2.c) {
                dbn2.d.clear();
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) this.d.b(i);
                    Long l = (Long) dbn.d.get(str);
                    dbn2.d.put(str, Long.valueOf(((Long) this.d.c(i)).longValue() + (l == null ? 0 : l.longValue())));
                }
                size = dbn.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = (String) dbn.d.b(i2);
                    if (this.d.get(str2) == null) {
                        dbn2.d.put(str2, dbn.d.c(i2));
                    }
                }
            }
        }
        return dbn2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dbn dbn = (dbn) obj;
            if (this.c == dbn.c && this.a == dbn.a && this.b == dbn.b) {
                return dau.a(this.d, dbn.d);
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.c * 31) + this.d.hashCode()) * 31;
        long j = this.a;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("WakeLockMetrics{isAttributionEnabled=");
        stringBuilder.append(this.c);
        stringBuilder.append(", tagTimeMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", heldTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", acquiredCount=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
