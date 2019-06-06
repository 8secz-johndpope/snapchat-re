package com.snap.ui.avatar;

import defpackage.akcr;
import java.util.List;

final class FeedAvatarCacheItem {
    private final List<Avatar> avatars;
    private final Long lastInteractionTimestamp;

    public FeedAvatarCacheItem(Long l, List<Avatar> list) {
        akcr.b(list, "avatars");
        this.lastInteractionTimestamp = l;
        this.avatars = list;
    }

    public static /* synthetic */ FeedAvatarCacheItem copy$default(FeedAvatarCacheItem feedAvatarCacheItem, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = feedAvatarCacheItem.lastInteractionTimestamp;
        }
        if ((i & 2) != 0) {
            list = feedAvatarCacheItem.avatars;
        }
        return feedAvatarCacheItem.copy(l, list);
    }

    public final Long component1() {
        return this.lastInteractionTimestamp;
    }

    public final List<Avatar> component2() {
        return this.avatars;
    }

    public final FeedAvatarCacheItem copy(Long l, List<Avatar> list) {
        akcr.b(list, "avatars");
        return new FeedAvatarCacheItem(l, list);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.avatars, r3.avatars) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.ui.avatar.FeedAvatarCacheItem;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.ui.avatar.FeedAvatarCacheItem) r3;
        r0 = r2.lastInteractionTimestamp;
        r1 = r3.lastInteractionTimestamp;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.avatars;
        r3 = r3.avatars;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.avatar.FeedAvatarCacheItem.equals(java.lang.Object):boolean");
    }

    public final List<Avatar> getAvatars() {
        return this.avatars;
    }

    public final Long getLastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final int hashCode() {
        Long l = this.lastInteractionTimestamp;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        List list = this.avatars;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedAvatarCacheItem(lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", avatars=");
        stringBuilder.append(this.avatars);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
