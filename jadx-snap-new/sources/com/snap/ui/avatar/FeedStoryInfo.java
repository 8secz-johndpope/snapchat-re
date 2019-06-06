package com.snap.ui.avatar;

import android.net.Uri;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.akco;
import defpackage.akcr;

public final class FeedStoryInfo {
    private final boolean isEmptyStory;
    private final boolean isLastViewedStory;
    private final boolean isStoryExpired;
    private final boolean isStoryFailed;
    private final boolean isStoryLoading;
    private final boolean isStoryMuted;
    private final boolean isStoryViewCompleted;
    private final boolean isStoryViewedInLastViewingSession;
    private final boolean shouldForceShowViewedStory;
    private final Uri thumbnailUri;

    public FeedStoryInfo(Uri uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        akcr.b(uri, "thumbnailUri");
        this.thumbnailUri = uri;
        this.isStoryExpired = z;
        this.isStoryLoading = z2;
        this.isStoryMuted = z3;
        this.shouldForceShowViewedStory = z4;
        this.isStoryViewedInLastViewingSession = z5;
        this.isStoryViewCompleted = z6;
        this.isLastViewedStory = z7;
        this.isStoryFailed = z8;
        this.isEmptyStory = z9;
    }

    public /* synthetic */ FeedStoryInfo(Uri uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, akco akco) {
        int i2 = i;
        boolean z10 = false;
        boolean z11 = (i2 & 2) != 0 ? false : z;
        boolean z12 = (i2 & 4) != 0 ? false : z2;
        boolean z13 = (i2 & 8) != 0 ? false : z3;
        boolean z14 = (i2 & 16) != 0 ? false : z4;
        boolean z15 = (i2 & 32) != 0 ? false : z5;
        boolean z16 = (i2 & 64) != 0 ? false : z6;
        boolean z17 = (i2 & 128) != 0 ? false : z7;
        boolean z18 = (i2 & 256) != 0 ? false : z8;
        if ((i2 & RasterSource.DEFAULT_TILE_SIZE) == 0) {
            z10 = z9;
        }
        this(uri, z11, z12, z13, z14, z15, z16, z17, z18, z10);
    }

    private final boolean component2() {
        return this.isStoryExpired;
    }

    private final boolean component5() {
        return this.shouldForceShowViewedStory;
    }

    public static /* synthetic */ FeedStoryInfo copy$default(FeedStoryInfo feedStoryInfo, Uri uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        FeedStoryInfo feedStoryInfo2 = feedStoryInfo;
        int i2 = i;
        return feedStoryInfo.copy((i2 & 1) != 0 ? feedStoryInfo2.thumbnailUri : uri, (i2 & 2) != 0 ? feedStoryInfo2.isStoryExpired : z, (i2 & 4) != 0 ? feedStoryInfo2.isStoryLoading : z2, (i2 & 8) != 0 ? feedStoryInfo2.isStoryMuted : z3, (i2 & 16) != 0 ? feedStoryInfo2.shouldForceShowViewedStory : z4, (i2 & 32) != 0 ? feedStoryInfo2.isStoryViewedInLastViewingSession : z5, (i2 & 64) != 0 ? feedStoryInfo2.isStoryViewCompleted : z6, (i2 & 128) != 0 ? feedStoryInfo2.isLastViewedStory : z7, (i2 & 256) != 0 ? feedStoryInfo2.isStoryFailed : z8, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? feedStoryInfo2.isEmptyStory : z9);
    }

    public final Uri component1() {
        return this.thumbnailUri;
    }

    public final boolean component10() {
        return this.isEmptyStory;
    }

    public final boolean component3() {
        return this.isStoryLoading;
    }

    public final boolean component4() {
        return this.isStoryMuted;
    }

    public final boolean component6() {
        return this.isStoryViewedInLastViewingSession;
    }

    public final boolean component7() {
        return this.isStoryViewCompleted;
    }

    public final boolean component8() {
        return this.isLastViewedStory;
    }

    public final boolean component9() {
        return this.isStoryFailed;
    }

    public final FeedStoryInfo copy(Uri uri, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        Uri uri2 = uri;
        akcr.b(uri, "thumbnailUri");
        return new FeedStoryInfo(uri2, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedStoryInfo) {
                FeedStoryInfo feedStoryInfo = (FeedStoryInfo) obj;
                if (akcr.a(this.thumbnailUri, feedStoryInfo.thumbnailUri)) {
                    if ((this.isStoryExpired == feedStoryInfo.isStoryExpired ? 1 : null) != null) {
                        if ((this.isStoryLoading == feedStoryInfo.isStoryLoading ? 1 : null) != null) {
                            if ((this.isStoryMuted == feedStoryInfo.isStoryMuted ? 1 : null) != null) {
                                if ((this.shouldForceShowViewedStory == feedStoryInfo.shouldForceShowViewedStory ? 1 : null) != null) {
                                    if ((this.isStoryViewedInLastViewingSession == feedStoryInfo.isStoryViewedInLastViewingSession ? 1 : null) != null) {
                                        if ((this.isStoryViewCompleted == feedStoryInfo.isStoryViewCompleted ? 1 : null) != null) {
                                            if ((this.isLastViewedStory == feedStoryInfo.isLastViewedStory ? 1 : null) != null) {
                                                if ((this.isStoryFailed == feedStoryInfo.isStoryFailed ? 1 : null) != null) {
                                                    if ((this.isEmptyStory == feedStoryInfo.isEmptyStory ? 1 : null) != null) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Uri getThumbnailUri() {
        return this.thumbnailUri;
    }

    public final int hashCode() {
        Uri uri = this.thumbnailUri;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        int i = this.isStoryExpired;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStoryLoading;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStoryMuted;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.shouldForceShowViewedStory;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStoryViewedInLastViewingSession;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStoryViewCompleted;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isLastViewedStory;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStoryFailed;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isEmptyStory;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isEmptyStory() {
        return this.isEmptyStory;
    }

    public final boolean isLastViewedStory() {
        return this.isLastViewedStory;
    }

    public final boolean isStoryFailed() {
        return this.isStoryFailed;
    }

    public final boolean isStoryLoading() {
        return this.isStoryLoading;
    }

    public final boolean isStoryMuted() {
        return this.isStoryMuted;
    }

    public final boolean isStoryViewCompleted() {
        return this.isStoryViewCompleted;
    }

    public final boolean isStoryViewedInLastViewingSession() {
        return this.isStoryViewedInLastViewingSession;
    }

    public final boolean isStoryViewedLast() {
        return !this.isStoryExpired && (this.isLastViewedStory || this.isStoryViewedInLastViewingSession || !this.isStoryViewCompleted);
    }

    public final boolean shouldShowStory() {
        return !this.isStoryExpired && (this.shouldForceShowViewedStory || isStoryViewedLast());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedStoryInfo(thumbnailUri=");
        stringBuilder.append(this.thumbnailUri);
        stringBuilder.append(", isStoryExpired=");
        stringBuilder.append(this.isStoryExpired);
        stringBuilder.append(", isStoryLoading=");
        stringBuilder.append(this.isStoryLoading);
        stringBuilder.append(", isStoryMuted=");
        stringBuilder.append(this.isStoryMuted);
        stringBuilder.append(", shouldForceShowViewedStory=");
        stringBuilder.append(this.shouldForceShowViewedStory);
        stringBuilder.append(", isStoryViewedInLastViewingSession=");
        stringBuilder.append(this.isStoryViewedInLastViewingSession);
        stringBuilder.append(", isStoryViewCompleted=");
        stringBuilder.append(this.isStoryViewCompleted);
        stringBuilder.append(", isLastViewedStory=");
        stringBuilder.append(this.isLastViewedStory);
        stringBuilder.append(", isStoryFailed=");
        stringBuilder.append(this.isStoryFailed);
        stringBuilder.append(", isEmptyStory=");
        stringBuilder.append(this.isEmptyStory);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
