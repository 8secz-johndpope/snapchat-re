package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public final class VideoViewContent {
    @SerializedName("bitmoji_remote_video_id")
    private final String bitmojiRemoteVideoId;
    @SerializedName("video_first_frame")
    private final String videoFirstFrame;
    @SerializedName("video_id")
    private final String videoId;

    public VideoViewContent(String str, String str2, String str3) {
        this.videoId = str;
        this.videoFirstFrame = str2;
        this.bitmojiRemoteVideoId = str3;
    }

    public static /* synthetic */ VideoViewContent copy$default(VideoViewContent videoViewContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoViewContent.videoId;
        }
        if ((i & 2) != 0) {
            str2 = videoViewContent.videoFirstFrame;
        }
        if ((i & 4) != 0) {
            str3 = videoViewContent.bitmojiRemoteVideoId;
        }
        return videoViewContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.videoId;
    }

    public final String component2() {
        return this.videoFirstFrame;
    }

    public final String component3() {
        return this.bitmojiRemoteVideoId;
    }

    public final VideoViewContent copy(String str, String str2, String str3) {
        return new VideoViewContent(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.bitmojiRemoteVideoId, r3.bitmojiRemoteVideoId) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.VideoViewContent;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.VideoViewContent) r3;
        r0 = r2.videoId;
        r1 = r3.videoId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.videoFirstFrame;
        r1 = r3.videoFirstFrame;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bitmojiRemoteVideoId;
        r3 = r3.bitmojiRemoteVideoId;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.VideoViewContent.equals(java.lang.Object):boolean");
    }

    public final String getBitmojiRemoteVideoId() {
        return this.bitmojiRemoteVideoId;
    }

    public final String getVideoFirstFrame() {
        return this.videoFirstFrame;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final int hashCode() {
        String str = this.videoId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.videoFirstFrame;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bitmojiRemoteVideoId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VideoViewContent(videoId=");
        stringBuilder.append(this.videoId);
        stringBuilder.append(", videoFirstFrame=");
        stringBuilder.append(this.videoFirstFrame);
        stringBuilder.append(", bitmojiRemoteVideoId=");
        stringBuilder.append(this.bitmojiRemoteVideoId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
