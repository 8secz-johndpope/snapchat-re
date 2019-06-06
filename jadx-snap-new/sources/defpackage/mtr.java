package defpackage;

import android.location.Location;

/* renamed from: mtr */
public interface mtr {

    /* renamed from: mtr$a */
    public static final class a implements mtr {
        public static final a a = new a();

        private a() {
        }

        public final ajdp<Location> a(b bVar) {
            akcr.b(bVar, "trackingParameters");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "empty<Location>()");
            return a;
        }
    }

    /* renamed from: mtr$b */
    public static final class b {
        public final long a;
        public final float b;

        public b(long j, float f) {
            this.a = j;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) == null || Float.compare(this.b, bVar.b) != 0) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            return (((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TrackingParameters(updateIntervalMillis=");
            stringBuilder.append(this.a);
            stringBuilder.append(", distanceFilterMeters=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdp<Location> a(b bVar);
}
