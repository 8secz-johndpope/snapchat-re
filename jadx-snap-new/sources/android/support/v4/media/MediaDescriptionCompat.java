package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import defpackage.ppy;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;

    public static final class a {
        String a;
        CharSequence b;
        CharSequence c;
        CharSequence d;
        Bitmap e;
        Uri f;
        Bundle g;
        Uri h;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e = (Bitmap) parcel.readParcelable(null);
        this.f = (Uri) parcel.readParcelable(null);
        this.g = parcel.readBundle();
        this.h = (Uri) parcel.readParcelable(null);
    }

    private MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r11) {
        /*
        r0 = 0;
        if (r11 == 0) goto L_0x0089;
    L_0x0003:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x0089;
    L_0x0009:
        r1 = new android.support.v4.media.MediaDescriptionCompat$a;
        r1.<init>();
        r2 = r11;
        r2 = (android.media.MediaDescription) r2;
        r3 = r2.getMediaId();
        r1.a = r3;
        r3 = r2.getTitle();
        r1.b = r3;
        r3 = r2.getSubtitle();
        r1.c = r3;
        r3 = r2.getDescription();
        r1.d = r3;
        r3 = r2.getIconBitmap();
        r1.e = r3;
        r3 = r2.getIconUri();
        r1.f = r3;
        r3 = r2.getExtras();
        r4 = "android.support.v4.media.description.MEDIA_URI";
        if (r3 != 0) goto L_0x003f;
    L_0x003d:
        r5 = r0;
        goto L_0x0045;
    L_0x003f:
        r5 = r3.getParcelable(r4);
        r5 = (android.net.Uri) r5;
    L_0x0045:
        if (r5 == 0) goto L_0x005d;
    L_0x0047:
        r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
        r7 = r3.containsKey(r6);
        if (r7 == 0) goto L_0x0057;
    L_0x004f:
        r7 = r3.size();
        r8 = 2;
        if (r7 != r8) goto L_0x0057;
    L_0x0056:
        goto L_0x005e;
    L_0x0057:
        r3.remove(r4);
        r3.remove(r6);
    L_0x005d:
        r0 = r3;
    L_0x005e:
        r1.g = r0;
        if (r5 == 0) goto L_0x0065;
    L_0x0062:
        r1.h = r5;
        goto L_0x0071;
    L_0x0065:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r0 < r3) goto L_0x0071;
    L_0x006b:
        r0 = r2.getMediaUri();
        r1.h = r0;
    L_0x0071:
        r0 = new android.support.v4.media.MediaDescriptionCompat;
        r3 = r1.a;
        r4 = r1.b;
        r5 = r1.c;
        r6 = r1.d;
        r7 = r1.e;
        r8 = r1.f;
        r9 = r1.g;
        r10 = r1.h;
        r2 = r0;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
        r0.i = r11;
    L_0x0089:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.c);
        stringBuilder.append(str);
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i);
            return;
        }
        if (this.i == null && VERSION.SDK_INT >= 21) {
            Builder builder = new Builder();
            builder.setMediaId(this.a);
            builder.setTitle(this.b);
            builder.setSubtitle(this.c);
            builder.setDescription(this.d);
            builder.setIconBitmap(this.e);
            builder.setIconUri(this.f);
            Bundle bundle = this.g;
            if (VERSION.SDK_INT < 23 && this.h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
            }
            builder.setExtras(bundle);
            if (VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.h);
            }
            this.i = builder.build();
        }
        ((MediaDescription) this.i).writeToParcel(parcel, i);
    }
}
