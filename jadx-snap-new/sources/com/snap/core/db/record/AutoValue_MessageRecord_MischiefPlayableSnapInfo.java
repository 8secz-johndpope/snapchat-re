package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.MischiefPlayableSnapInfo;
import defpackage.aesg;
import defpackage.gcp;

final class AutoValue_MessageRecord_MischiefPlayableSnapInfo extends MischiefPlayableSnapInfo {
    private final String conversationId;
    private final String cryptoIV;
    private final String cryptoKey;
    private final aesg directDownloadUrl;
    private final String key;
    private final String mediaId;
    private final String senderId;
    private final gcp snapType;

    AutoValue_MessageRecord_MischiefPlayableSnapInfo(String str, String str2, String str3, String str4, String str5, String str6, aesg aesg, gcp gcp) {
        if (str != null) {
            this.conversationId = str;
            this.mediaId = str2;
            if (str3 != null) {
                this.key = str3;
                this.cryptoKey = str4;
                this.cryptoIV = str5;
                if (str6 != null) {
                    this.senderId = str6;
                    this.directDownloadUrl = aesg;
                    if (gcp != null) {
                        this.snapType = gcp;
                        return;
                    }
                    throw new NullPointerException("Null snapType");
                }
                throw new NullPointerException("Null senderId");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null conversationId");
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final String cryptoIV() {
        return this.cryptoIV;
    }

    public final String cryptoKey() {
        return this.cryptoKey;
    }

    public final aesg directDownloadUrl() {
        return this.directDownloadUrl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MischiefPlayableSnapInfo) {
            MischiefPlayableSnapInfo mischiefPlayableSnapInfo = (MischiefPlayableSnapInfo) obj;
            if (this.conversationId.equals(mischiefPlayableSnapInfo.conversationId())) {
                String str = this.mediaId;
                if (str != null ? !str.equals(mischiefPlayableSnapInfo.mediaId()) : mischiefPlayableSnapInfo.mediaId() != null) {
                    if (this.key.equals(mischiefPlayableSnapInfo.key())) {
                        str = this.cryptoKey;
                        if (str != null ? !str.equals(mischiefPlayableSnapInfo.cryptoKey()) : mischiefPlayableSnapInfo.cryptoKey() != null) {
                            str = this.cryptoIV;
                            if (str != null ? !str.equals(mischiefPlayableSnapInfo.cryptoIV()) : mischiefPlayableSnapInfo.cryptoIV() != null) {
                                if (this.senderId.equals(mischiefPlayableSnapInfo.senderId())) {
                                    aesg aesg = this.directDownloadUrl;
                                    if (aesg != null ? !aesg.equals(mischiefPlayableSnapInfo.directDownloadUrl()) : mischiefPlayableSnapInfo.directDownloadUrl() != null) {
                                        if (this.snapType.equals(mischiefPlayableSnapInfo.snapType())) {
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
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.conversationId.hashCode() ^ 1000003) * 1000003;
        String str = this.mediaId;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.key.hashCode()) * 1000003;
        str = this.cryptoKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.cryptoIV;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.senderId.hashCode()) * 1000003;
        aesg aesg = this.directDownloadUrl;
        if (aesg != null) {
            i = aesg.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.snapType.hashCode();
    }

    public final String key() {
        return this.key;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String senderId() {
        return this.senderId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MischiefPlayableSnapInfo{conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", cryptoKey=");
        stringBuilder.append(this.cryptoKey);
        stringBuilder.append(", cryptoIV=");
        stringBuilder.append(this.cryptoIV);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", directDownloadUrl=");
        stringBuilder.append(this.directDownloadUrl);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
