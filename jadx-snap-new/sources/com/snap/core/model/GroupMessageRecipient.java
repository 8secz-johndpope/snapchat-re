package com.snap.core.model;

import defpackage.akcr;
import java.io.Serializable;

public final class GroupMessageRecipient implements MessageRecipient, Serializable {
    private final String conversationId;

    public GroupMessageRecipient(String str) {
        akcr.b(str, "conversationId");
        this.conversationId = str;
    }

    public static /* synthetic */ GroupMessageRecipient copy$default(GroupMessageRecipient groupMessageRecipient, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupMessageRecipient.conversationId;
        }
        return groupMessageRecipient.copy(str);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final GroupMessageRecipient copy(String str) {
        akcr.b(str, "conversationId");
        return new GroupMessageRecipient(str);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.conversationId, ((com.snap.core.model.GroupMessageRecipient) r2).conversationId) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.core.model.GroupMessageRecipient;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.core.model.GroupMessageRecipient) r2;
        r0 = r1.conversationId;
        r2 = r2.conversationId;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.model.GroupMessageRecipient.equals(java.lang.Object):boolean");
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getId() {
        return this.conversationId;
    }

    public final int hashCode() {
        String str = this.conversationId;
        return str != null ? str.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupMessageRecipient(conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
