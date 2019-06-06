package defpackage;

import android.location.Location;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.List;

/* renamed from: mmj */
public interface mmj extends mhu<b, a> {

    /* renamed from: mmj$a */
    public static abstract class a {

        /* renamed from: mmj$a$a */
        public static abstract class a extends a {

            /* renamed from: mmj$a$a$a */
            public static final class a extends a {
                public final long a;
                public final float b;

                public a(long j, float f) {
                    super();
                    this.a = j;
                    this.b = f;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof a) {
                            a aVar = (a) obj;
                            if ((this.a == aVar.a ? 1 : null) == null || Float.compare(this.b, aVar.b) != 0) {
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
                    StringBuilder stringBuilder = new StringBuilder("StartUpdating(updateIntervalMillis=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", distanceFilterMeters=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mmj$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: mmj$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: mmj$b */
    public static abstract class b {

        /* renamed from: mmj$b$a */
        public static final class a extends b {
            final Location a;

            public a(Location location) {
                akcr.b(location, MapboxEvent.TYPE_LOCATION);
                super();
                this.a = location;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mmj.b.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mmj.b.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mmj.b.a) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mmj$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Location location = this.a;
                return location != null ? location.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("LocationData(location=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mmj$b$b */
        public static final class b extends b {
            final String a;
            final float b;
            final float c;
            final List<a> d;

            /* renamed from: mmj$b$b$a */
            public static final class a {
                final float a;
                final float b;
                final String c;
                final String d;
                final String e;

                public a(float f, float f2, String str, String str2, String str3) {
                    akcr.b(str, "weatherCondition");
                    akcr.b(str2, "localizedWeatherCondition");
                    akcr.b(str3, "displayTime");
                    this.a = f;
                    this.b = f2;
                    this.c = str;
                    this.d = str2;
                    this.e = str3;
                }

                /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x003d;
                L_0x0002:
                    r0 = r3 instanceof defpackage.mmj.b.b.a;
                    if (r0 == 0) goto L_0x003b;
                L_0x0006:
                    r3 = (defpackage.mmj.b.b.a) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = java.lang.Float.compare(r0, r1);
                    if (r0 != 0) goto L_0x003b;
                L_0x0012:
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = java.lang.Float.compare(r0, r1);
                    if (r0 != 0) goto L_0x003b;
                L_0x001c:
                    r0 = r2.c;
                    r1 = r3.c;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x0026:
                    r0 = r2.d;
                    r1 = r3.d;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x0030:
                    r0 = r2.e;
                    r3 = r3.e;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x003b;
                L_0x003a:
                    goto L_0x003d;
                L_0x003b:
                    r3 = 0;
                    return r3;
                L_0x003d:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mmj$b$b$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    int floatToIntBits = ((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31;
                    String str = this.c;
                    int i = 0;
                    floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
                    str = this.d;
                    floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
                    str = this.e;
                    if (str != null) {
                        i = str.hashCode();
                    }
                    return floatToIntBits + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Forecast(fahrenheit=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", celsius=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", weatherCondition=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", localizedWeatherCondition=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(", displayTime=");
                    stringBuilder.append(this.e);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            public b(String str, float f, float f2, List<a> list) {
                akcr.b(str, "locationName");
                akcr.b(list, "forecasts");
                super();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = list;
            }

            /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0033;
            L_0x0002:
                r0 = r3 instanceof defpackage.mmj.b.b;
                if (r0 == 0) goto L_0x0031;
            L_0x0006:
                r3 = (defpackage.mmj.b.b) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = java.lang.Float.compare(r0, r1);
                if (r0 != 0) goto L_0x0031;
            L_0x001c:
                r0 = r2.c;
                r1 = r3.c;
                r0 = java.lang.Float.compare(r0, r1);
                if (r0 != 0) goto L_0x0031;
            L_0x0026:
                r0 = r2.d;
                r3 = r3.d;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x0031;
            L_0x0030:
                goto L_0x0033;
            L_0x0031:
                r3 = 0;
                return r3;
            L_0x0033:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mmj$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31;
                List list = this.d;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("WeatherData(locationName=");
                stringBuilder.append(this.a);
                stringBuilder.append(", tempC=");
                stringBuilder.append(this.b);
                stringBuilder.append(", tempF=");
                stringBuilder.append(this.c);
                stringBuilder.append(", forecasts=");
                stringBuilder.append(this.d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }
}
