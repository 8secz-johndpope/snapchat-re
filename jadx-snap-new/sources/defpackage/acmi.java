package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: acmi */
public final class acmi implements Parcelable {
    public static final a CREATOR = new a();
    public final cgi a;
    public final double b;

    /* renamed from: acmi$a */
    public static final class a implements Creator<acmi> {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            akcr.b(parcel, "parcel");
            return new acmi(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new acmi[i];
        }
    }

    public acmi(Parcel parcel) {
        akcr.b(parcel, "parcel");
        Object readParcelable = parcel.readParcelable(cgi.class.getClassLoader());
        akcr.a(readParcelable, "parcel.readParcelable(La…::class.java.classLoader)");
        this((cgi) readParcelable, parcel.readDouble());
    }

    public acmi(cgi cgi, double d) {
        akcr.b(cgi, "target");
        this.a = cgi;
        this.b = d;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Double.compare(r4.b, r5.b) == 0) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x001f;
    L_0x0002:
        r0 = r5 instanceof defpackage.acmi;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r5 = (defpackage.acmi) r5;
        r0 = r4.a;
        r1 = r5.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r4.b;
        r2 = r5.b;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r5 = 0;
        return r5;
    L_0x001f:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        cgi cgi = this.a;
        int hashCode = (cgi != null ? cgi.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LatLngZoom(target=");
        stringBuilder.append(this.a);
        stringBuilder.append(", zoom=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        akcr.b(parcel, "parcel");
        parcel.writeParcelable(this.a, i);
        parcel.writeDouble(this.b);
    }
}
