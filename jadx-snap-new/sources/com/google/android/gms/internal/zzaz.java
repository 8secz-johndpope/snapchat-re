package com.google.android.gms.internal;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;

public final class zzaz {
    public static int zzd(int i) {
        if (i == 0 || i == 1 || i == 2 || i == MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
