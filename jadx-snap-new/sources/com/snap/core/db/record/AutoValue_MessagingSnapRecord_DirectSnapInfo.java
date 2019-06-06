package com.snap.core.db.record;

import com.snap.core.db.record.MessagingSnapRecord.DirectSnapInfo;
import defpackage.aesg;

final class AutoValue_MessagingSnapRecord_DirectSnapInfo extends DirectSnapInfo {
    private final aesg directDownloadUrl;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String snapId;

    AutoValue_MessagingSnapRecord_DirectSnapInfo(String str, String str2, String str3, String str4, aesg aesg) {
        if (str != null) {
            this.snapId = str;
            this.mediaId = str2;
            this.mediaIv = str3;
            this.mediaKey = str4;
            this.directDownloadUrl = aesg;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final aesg directDownloadUrl() {
        return this.directDownloadUrl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DirectSnapInfo) {
            DirectSnapInfo directSnapInfo = (DirectSnapInfo) obj;
            if (this.snapId.equals(directSnapInfo.snapId())) {
                String str = this.mediaId;
                if (str != null ? !str.equals(directSnapInfo.mediaId()) : directSnapInfo.mediaId() != null) {
                    str = this.mediaIv;
                    if (str != null ? !str.equals(directSnapInfo.mediaIv()) : directSnapInfo.mediaIv() != null) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(directSnapInfo.mediaKey()) : directSnapInfo.mediaKey() != null) {
                            aesg aesg = this.directDownloadUrl;
                            return aesg != null ? !aesg.equals(directSnapInfo.directDownloadUrl()) : directSnapInfo.directDownloadUrl() != null;
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
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        aesg aesg = this.directDownloadUrl;
        if (aesg != null) {
            i = aesg.hashCode();
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

    public final String snapId() {
        return this.snapId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DirectSnapInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", directDownloadUrl=");
        stringBuilder.append(this.directDownloadUrl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
