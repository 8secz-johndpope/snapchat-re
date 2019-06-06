package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: adca */
public final class adca implements Parcelable {
    public static final Creator<adca> CREATOR = new 1();
    private final String a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    /* renamed from: adca$1 */
    static class 1 implements Creator<adca> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new adca(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new adca[i];
        }
    }

    public adca(double d, double d2, double d3, double d4, double d5) {
        this.a = null;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
    }

    protected adca(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
    }

    public static String a(String str, adca adca) {
        if (!str.equals("https://www.mapbox.com/about/maps/s/?referrer=snapchat")) {
            return str;
        }
        if (!(str.contains("#") || adca == null)) {
            StringBuilder stringBuilder = new StringBuilder(str.toLowerCase(Locale.getDefault()));
            if (adca.a != null) {
                stringBuilder.append("&place_name=");
                stringBuilder.append(Uri.encode(adca.a));
            }
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            stringBuilder.append(adcb.a("#/{}/{}/{}/{}/{}", new Object[]{decimalFormat.format(adca.c), decimalFormat.format(adca.b), decimalFormat.format(adca.d), Integer.valueOf((int) adca.e), Integer.valueOf((int) adca.f)}).a);
            str = stringBuilder.toString();
        }
        return str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
    }
}
