package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import defpackage.iv;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    private static iv<String, Integer> b;
    public Object a;
    private Bundle c;

    static {
        iv ivVar = new iv();
        b = ivVar;
        Integer valueOf = Integer.valueOf(1);
        ivVar.put("android.media.metadata.TITLE", valueOf);
        b.put("android.media.metadata.ARTIST", valueOf);
        ivVar = b;
        Integer valueOf2 = Integer.valueOf(0);
        ivVar.put("android.media.metadata.DURATION", valueOf2);
        b.put("android.media.metadata.ALBUM", valueOf);
        b.put("android.media.metadata.AUTHOR", valueOf);
        b.put("android.media.metadata.WRITER", valueOf);
        b.put("android.media.metadata.COMPOSER", valueOf);
        b.put("android.media.metadata.COMPILATION", valueOf);
        b.put("android.media.metadata.DATE", valueOf);
        b.put("android.media.metadata.YEAR", valueOf2);
        b.put("android.media.metadata.GENRE", valueOf);
        b.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        b.put("android.media.metadata.NUM_TRACKS", valueOf2);
        b.put("android.media.metadata.DISC_NUMBER", valueOf2);
        b.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        ivVar = b;
        Integer valueOf3 = Integer.valueOf(2);
        String str = "android.media.metadata.ART";
        ivVar.put(str, valueOf3);
        String str2 = "android.media.metadata.ART_URI";
        b.put(str2, valueOf);
        String str3 = "android.media.metadata.ALBUM_ART";
        b.put(str3, valueOf3);
        String str4 = "android.media.metadata.ALBUM_ART_URI";
        b.put(str4, valueOf);
        ivVar = b;
        Integer valueOf4 = Integer.valueOf(3);
        ivVar.put("android.media.metadata.USER_RATING", valueOf4);
        b.put("android.media.metadata.RATING", valueOf4);
        b.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        b.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        b.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        String str5 = "android.media.metadata.DISPLAY_ICON";
        b.put(str5, valueOf3);
        String str6 = "android.media.metadata.DISPLAY_ICON_URI";
        b.put(str6, valueOf);
        b.put("android.media.metadata.MEDIA_ID", valueOf);
        b.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        b.put("android.media.metadata.MEDIA_URI", valueOf);
        b.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        b.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        new String[]{str5, str, str3};
        new String[]{str6, str2, str4};
    }

    MediaMetadataCompat(Parcel parcel) {
        this.c = parcel.readBundle();
        this.c.setClassLoader(MediaMetadataCompat.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.c);
    }
}
