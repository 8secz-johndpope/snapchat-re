package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import defpackage.im;
import java.util.ArrayList;

public final class MediaBrowserCompat {

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final int a;
        private final MediaDescriptionCompat b;

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }
    }

    public static abstract class a {
    }

    static class CustomActionResultReceiver extends im {
        private final Bundle a;
        private final a b;

        public final void a(int i, Bundle bundle) {
            if (!(this.b == null || i == -1 || i == 0 || i == 1)) {
                StringBuilder stringBuilder = new StringBuilder("Unknown result code: ");
                stringBuilder.append(i);
                stringBuilder.append(" (extras=");
                stringBuilder.append(this.a);
                stringBuilder.append(", resultData=");
                stringBuilder.append(bundle);
                stringBuilder.append(")");
                Log.w("MediaBrowserCompat", stringBuilder.toString());
            }
        }
    }

    static class ItemReceiver extends im {
        public final void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                String str = "media_item";
                if (bundle.containsKey(str)) {
                    bundle.getParcelable(str);
                }
            }
        }
    }

    static class SearchResultReceiver extends im {
        public final void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                String str = "search_results";
                if (bundle.containsKey(str)) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                    if (parcelableArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaItem) parcelable);
                        }
                    }
                }
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }
}
