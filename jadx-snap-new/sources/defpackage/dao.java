package defpackage;

import java.util.Objects;

/* renamed from: dao */
public final class dao extends das<dao> {
    public long a;
    public long b;
    public long c;

    dao() {
        this(0, 0, 0);
    }

    private dao(long j, long j2, long j3) {
        this.a = j;
        this.c = j2;
        this.b = j3;
    }

    private dao a(dao dao) {
        this.c = dao.c;
        this.a = dao.a;
        this.b = dao.b;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dao dao = (dao) das;
        dao dao2 = (dao) das2;
        if (dao2 == null) {
            dao2 = new dao();
        }
        if (dao == null) {
            dao2.a(this);
        } else {
            dao2.a(new dao(this.a - dao.a, this.c - dao.c, this.b - dao.b));
        }
        return dao2;
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        this.a += j;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dao dao = (dao) das;
        dao dao2 = (dao) das2;
        if (dao2 == null) {
            dao2 = new dao();
        }
        if (dao == null) {
            dao2.a(this);
        } else {
            dao2.a(new dao(dao.a + this.a, dao.c + this.c, dao.b + this.b));
        }
        return dao2;
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        this.c += j;
    }

    /* Access modifiers changed, original: final */
    public final void c(long j) {
        this.b += j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dao dao = (dao) obj;
            return this.a == dao.a && this.c == dao.c && this.b == dao.b;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.c), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraOpenMetricsForCallsite{cameraVisibleTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cameraOpenTimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cameraOpenTimeWithStartupTimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
