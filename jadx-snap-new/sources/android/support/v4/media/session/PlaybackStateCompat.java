package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    Object a;
    private int b;
    private long c;
    private long d;
    private float e;
    private long f;
    private int g;
    private CharSequence h;
    private long i;
    private List<CustomAction> j;
    private long k;
    private Bundle l;

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        Object a;
        private final String b;
        private final CharSequence c;
        private final int d;
        private final Bundle e;

        CustomAction(Parcel parcel) {
            this.b = parcel.readString();
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt();
            this.e = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.b = str;
            this.c = charSequence;
            this.d = i;
            this.e = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Action:mName='");
            stringBuilder.append(this.c);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.d);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.e);
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d);
            parcel.writeBundle(this.e);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = j3;
        this.g = 0;
        this.h = charSequence;
        this.i = j4;
        this.j = new ArrayList(list);
        this.k = j5;
        this.l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.e = parcel.readFloat();
        this.i = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k = parcel.readLong();
        this.l = parcel.readBundle();
        this.g = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.b);
        stringBuilder.append(", position=");
        stringBuilder.append(this.c);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.d);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.e);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.i);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.f);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.g);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.h);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.j);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.k);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.e);
        parcel.writeLong(this.i);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.g);
    }
}
