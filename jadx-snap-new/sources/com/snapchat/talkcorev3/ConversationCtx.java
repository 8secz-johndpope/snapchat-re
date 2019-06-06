package com.snapchat.talkcorev3;

import java.util.HashMap;

public final class ConversationCtx {
    final String mMac;
    final String mScopeId;
    final String mToken;
    final HashMap<String, Long> mUsernameToUserId;
    final int mUsersWithBitmojiCount;

    public ConversationCtx(String str, String str2, String str3, HashMap<String, Long> hashMap, int i) {
        this.mScopeId = str;
        this.mMac = str2;
        this.mToken = str3;
        this.mUsernameToUserId = hashMap;
        this.mUsersWithBitmojiCount = i;
    }

    public final String getMac() {
        return this.mMac;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final String getToken() {
        return this.mToken;
    }

    public final HashMap<String, Long> getUsernameToUserId() {
        return this.mUsernameToUserId;
    }

    public final int getUsersWithBitmojiCount() {
        return this.mUsersWithBitmojiCount;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConversationCtx{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mMac=");
        stringBuilder.append(this.mMac);
        stringBuilder.append(",mToken=");
        stringBuilder.append(this.mToken);
        stringBuilder.append(",mUsernameToUserId=");
        stringBuilder.append(this.mUsernameToUserId);
        stringBuilder.append(",mUsersWithBitmojiCount=");
        stringBuilder.append(this.mUsersWithBitmojiCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
