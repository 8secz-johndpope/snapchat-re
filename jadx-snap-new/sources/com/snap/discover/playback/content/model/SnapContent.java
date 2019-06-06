package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.ahkp;
import defpackage.akcr;

@Keep
public final class SnapContent {
    @SerializedName("background")
    private final String background;
    @SerializedName("background_type")
    private final String backgroundType;
    private final String docking;
    @SerializedName("interaction_zone")
    private final ahkp interactionZone;
    private final String mode;
    @SerializedName("video_first_frame")
    private final String videoFirstFrame;
    @SerializedName("video_rotation_enabled")
    private final Boolean videoRotationEnabled;

    public SnapContent(String str, Boolean bool, String str2, String str3, String str4, ahkp ahkp, String str5) {
        akcr.b(str2, "background");
        akcr.b(str4, "backgroundType");
        this.docking = str;
        this.videoRotationEnabled = bool;
        this.background = str2;
        this.videoFirstFrame = str3;
        this.backgroundType = str4;
        this.interactionZone = ahkp;
        this.mode = str5;
    }

    public static /* synthetic */ SnapContent copy$default(SnapContent snapContent, String str, Boolean bool, String str2, String str3, String str4, ahkp ahkp, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snapContent.docking;
        }
        if ((i & 2) != 0) {
            bool = snapContent.videoRotationEnabled;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str2 = snapContent.background;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = snapContent.videoFirstFrame;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = snapContent.backgroundType;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            ahkp = snapContent.interactionZone;
        }
        ahkp ahkp2 = ahkp;
        if ((i & 64) != 0) {
            str5 = snapContent.mode;
        }
        return snapContent.copy(str, bool2, str6, str7, str8, ahkp2, str5);
    }

    public final String component1() {
        return this.docking;
    }

    public final Boolean component2() {
        return this.videoRotationEnabled;
    }

    public final String component3() {
        return this.background;
    }

    public final String component4() {
        return this.videoFirstFrame;
    }

    public final String component5() {
        return this.backgroundType;
    }

    public final ahkp component6() {
        return this.interactionZone;
    }

    public final String component7() {
        return this.mode;
    }

    public final SnapContent copy(String str, Boolean bool, String str2, String str3, String str4, ahkp ahkp, String str5) {
        String str6 = str2;
        akcr.b(str2, "background");
        String str7 = str4;
        akcr.b(str4, "backgroundType");
        return new SnapContent(str, bool, str6, str3, str7, ahkp, str5);
    }

    /* JADX WARNING: Missing block: B:16:0x004c, code skipped:
            if (defpackage.akcr.a(r2.mode, r3.mode) != false) goto L_0x0051;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0051;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.SnapContent;
        if (r0 == 0) goto L_0x004f;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.SnapContent) r3;
        r0 = r2.docking;
        r1 = r3.docking;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0012:
        r0 = r2.videoRotationEnabled;
        r1 = r3.videoRotationEnabled;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x001c:
        r0 = r2.background;
        r1 = r3.background;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0026:
        r0 = r2.videoFirstFrame;
        r1 = r3.videoFirstFrame;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0030:
        r0 = r2.backgroundType;
        r1 = r3.backgroundType;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x003a:
        r0 = r2.interactionZone;
        r1 = r3.interactionZone;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0044:
        r0 = r2.mode;
        r3 = r3.mode;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r3 = 0;
        return r3;
    L_0x0051:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.SnapContent.equals(java.lang.Object):boolean");
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getBackgroundType() {
        return this.backgroundType;
    }

    public final String getDocking() {
        return this.docking;
    }

    public final ahkp getInteractionZone() {
        return this.interactionZone;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getVideoFirstFrame() {
        return this.videoFirstFrame;
    }

    public final Boolean getVideoRotationEnabled() {
        return this.videoRotationEnabled;
    }

    public final int hashCode() {
        String str = this.docking;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.videoRotationEnabled;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.background;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.videoFirstFrame;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.backgroundType;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ahkp ahkp = this.interactionZone;
        hashCode = (hashCode + (ahkp != null ? ahkp.hashCode() : 0)) * 31;
        str2 = this.mode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapContent(docking=");
        stringBuilder.append(this.docking);
        stringBuilder.append(", videoRotationEnabled=");
        stringBuilder.append(this.videoRotationEnabled);
        stringBuilder.append(", background=");
        stringBuilder.append(this.background);
        stringBuilder.append(", videoFirstFrame=");
        stringBuilder.append(this.videoFirstFrame);
        stringBuilder.append(", backgroundType=");
        stringBuilder.append(this.backgroundType);
        stringBuilder.append(", interactionZone=");
        stringBuilder.append(this.interactionZone);
        stringBuilder.append(", mode=");
        stringBuilder.append(this.mode);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
