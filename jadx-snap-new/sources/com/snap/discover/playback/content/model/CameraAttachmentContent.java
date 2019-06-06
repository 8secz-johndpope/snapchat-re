package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.ahkz;
import defpackage.akcr;
import java.util.List;

@Keep
public final class CameraAttachmentContent {
    @SerializedName("add_to_our_story")
    private final boolean addToOurStory;
    @SerializedName("lenses")
    private final List<ahkz> lenses;

    public CameraAttachmentContent(List<? extends ahkz> list, boolean z) {
        akcr.b(list, "lenses");
        this.lenses = list;
        this.addToOurStory = z;
    }

    public static /* synthetic */ CameraAttachmentContent copy$default(CameraAttachmentContent cameraAttachmentContent, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cameraAttachmentContent.lenses;
        }
        if ((i & 2) != 0) {
            z = cameraAttachmentContent.addToOurStory;
        }
        return cameraAttachmentContent.copy(list, z);
    }

    public final List<ahkz> component1() {
        return this.lenses;
    }

    public final boolean component2() {
        return this.addToOurStory;
    }

    public final CameraAttachmentContent copy(List<? extends ahkz> list, boolean z) {
        akcr.b(list, "lenses");
        return new CameraAttachmentContent(list, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraAttachmentContent) {
                CameraAttachmentContent cameraAttachmentContent = (CameraAttachmentContent) obj;
                if (akcr.a(this.lenses, cameraAttachmentContent.lenses)) {
                    if ((this.addToOurStory == cameraAttachmentContent.addToOurStory ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getAddToOurStory() {
        return this.addToOurStory;
    }

    public final List<ahkz> getLenses() {
        return this.lenses;
    }

    public final int hashCode() {
        List list = this.lenses;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i = this.addToOurStory;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraAttachmentContent(lenses=");
        stringBuilder.append(this.lenses);
        stringBuilder.append(", addToOurStory=");
        stringBuilder.append(this.addToOurStory);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
