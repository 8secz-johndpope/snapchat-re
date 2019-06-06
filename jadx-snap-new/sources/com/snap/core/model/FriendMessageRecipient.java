package com.snap.core.model;

import defpackage.akcr;
import defpackage.akgc;
import java.io.Serializable;
import java.util.Collection;

public final class FriendMessageRecipient implements MessageRecipient, Serializable {
    private final String conversationId;

    public FriendMessageRecipient(String str) {
        akcr.b(str, "conversationId");
        this.conversationId = str;
    }

    public static /* synthetic */ FriendMessageRecipient copy$default(FriendMessageRecipient friendMessageRecipient, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = friendMessageRecipient.conversationId;
        }
        return friendMessageRecipient.copy(str);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final FriendMessageRecipient copy(String str) {
        akcr.b(str, "conversationId");
        return new FriendMessageRecipient(str);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.conversationId, ((com.snap.core.model.FriendMessageRecipient) r2).conversationId) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.core.model.FriendMessageRecipient;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.core.model.FriendMessageRecipient) r2;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.model.FriendMessageRecipient.equals(java.lang.Object):boolean");
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

    public final String parseRecipientUsername(String str) {
        akcr.b(str, "sender");
        int i = 0;
        Iterable<Object> a = akgc.a((CharSequence) this.conversationId, new String[]{"~"}, 0, 6);
        if (!((a instanceof Collection) && ((Collection) a).isEmpty())) {
            for (Object a2 : a) {
                if (!akcr.a(a2, (Object) str)) {
                    break;
                }
            }
        }
        i = 1;
        if (i != 0) {
            return str;
        }
        for (Object next : a) {
            if ((akcr.a((String) next, (Object) str) ^ 1) != 0) {
                break;
            }
        }
        Object next2 = null;
        return (String) next2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendMessageRecipient(conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
