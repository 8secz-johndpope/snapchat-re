package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.StorySnapDownload;
import defpackage.gcp;

final class AutoValue_StorySnapRecord_StorySnapDownload extends StorySnapDownload {
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final String ruleFileParams;
    private final String snapId;
    private final gcp snapType;

    AutoValue_StorySnapRecord_StorySnapDownload(String str, String str2, gcp gcp, String str3, String str4, String str5, String str6) {
        if (str != null) {
            this.snapId = str;
            this.mediaId = str2;
            if (gcp != null) {
                this.snapType = gcp;
                this.mediaKey = str3;
                this.mediaIv = str4;
                this.mediaUrl = str5;
                this.ruleFileParams = str6;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySnapDownload) {
            StorySnapDownload storySnapDownload = (StorySnapDownload) obj;
            if (this.snapId.equals(storySnapDownload.snapId())) {
                String str = this.mediaId;
                if (str != null ? !str.equals(storySnapDownload.mediaId()) : storySnapDownload.mediaId() != null) {
                    if (this.snapType.equals(storySnapDownload.snapType())) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(storySnapDownload.mediaKey()) : storySnapDownload.mediaKey() != null) {
                            str = this.mediaIv;
                            if (str != null ? !str.equals(storySnapDownload.mediaIv()) : storySnapDownload.mediaIv() != null) {
                                str = this.mediaUrl;
                                if (str != null ? !str.equals(storySnapDownload.mediaUrl()) : storySnapDownload.mediaUrl() != null) {
                                    str = this.ruleFileParams;
                                    return str != null ? !str.equals(storySnapDownload.ruleFileParams()) : storySnapDownload.ruleFileParams() != null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        String str = this.mediaId;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.mediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.ruleFileParams;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String mediaIv() {
        return this.mediaIv;
    }

    public final String mediaKey() {
        return this.mediaKey;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String ruleFileParams() {
        return this.ruleFileParams;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySnapDownload{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", ruleFileParams=");
        stringBuilder.append(this.ruleFileParams);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
