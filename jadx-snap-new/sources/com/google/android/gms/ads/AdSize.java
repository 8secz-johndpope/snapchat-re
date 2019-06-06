package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.search.v2.composer.SearchView;

public final class AdSize {
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(MapboxConstants.ANIMATION_DURATION, 250, "300x250_as");
    public static final AdSize SEARCH = new AdSize(-3, 0, SearchView.a);
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize zzals = new AdSize(50, 50, "50x50_mb");
    private final int zzalt;
    private final int zzalu;
    private final String zzalv;

    public AdSize(int i, int i2) {
        Object valueOf = i == -1 ? "FULL" : String.valueOf(i);
        Object valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("x");
        stringBuilder.append(valueOf2);
        stringBuilder.append("_as");
        this(i, i2, stringBuilder.toString());
    }

    AdSize(int i, int i2, String str) {
        StringBuilder stringBuilder;
        if (i < 0 && i != -1 && i != -3) {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid width for AdSize: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.zzalt = i;
            this.zzalu = i2;
            this.zzalv = str;
        } else {
            stringBuilder = new StringBuilder(38);
            stringBuilder.append("Invalid height for AdSize: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzalt == adSize.zzalt && this.zzalu == adSize.zzalu && this.zzalv.equals(adSize.zzalv);
    }

    public final int getHeight() {
        return this.zzalu;
    }

    public final int getHeightInPixels(Context context) {
        int i = this.zzalu;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzko.zzc(context.getResources().getDisplayMetrics());
        }
        zzlc.zzij();
        return zzako.zza(context, this.zzalu);
    }

    public final int getWidth() {
        return this.zzalt;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.zzalt;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -1) {
            return zzko.zzb(context.getResources().getDisplayMetrics());
        }
        zzlc.zzij();
        return zzako.zza(context, this.zzalt);
    }

    public final int hashCode() {
        return this.zzalv.hashCode();
    }

    public final boolean isFluid() {
        return this.zzalt == -3 && this.zzalu == -4;
    }

    public final String toString() {
        return this.zzalv;
    }
}
