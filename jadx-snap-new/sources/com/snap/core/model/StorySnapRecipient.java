package com.snap.core.model;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import defpackage.akco;
import defpackage.akcr;
import defpackage.gct;
import java.io.Serializable;

public final class StorySnapRecipient implements MessageRecipient, Serializable {
    private final GroupStoryType groupStoryType;
    private final PrivacyType myStoryOverridePrivacy;
    private final String storyDisplayName;
    private final String storyId;
    private final StoryKind storyKind;
    private final gct storyPostMetadata;

    public StorySnapRecipient(String str, StoryKind storyKind, String str2, gct gct) {
        akcr.b(str, "storyId");
        akcr.b(storyKind, "storyKind");
        this.storyId = str;
        this.storyKind = storyKind;
        this.storyDisplayName = str2;
        this.storyPostMetadata = gct;
        gct gct2 = this.storyPostMetadata;
        GroupStoryType groupStoryType = null;
        this.myStoryOverridePrivacy = gct2 != null ? gct2.a : null;
        gct2 = this.storyPostMetadata;
        if (gct2 != null) {
            groupStoryType = gct2.b;
        }
        this.groupStoryType = groupStoryType;
    }

    public /* synthetic */ StorySnapRecipient(String str, StoryKind storyKind, String str2, gct gct, int i, akco akco) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            gct = null;
        }
        this(str, storyKind, str2, gct);
    }

    public static /* synthetic */ StorySnapRecipient copy$default(StorySnapRecipient storySnapRecipient, String str, StoryKind storyKind, String str2, gct gct, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storySnapRecipient.storyId;
        }
        if ((i & 2) != 0) {
            storyKind = storySnapRecipient.storyKind;
        }
        if ((i & 4) != 0) {
            str2 = storySnapRecipient.storyDisplayName;
        }
        if ((i & 8) != 0) {
            gct = storySnapRecipient.storyPostMetadata;
        }
        return storySnapRecipient.copy(str, storyKind, str2, gct);
    }

    public final String component1() {
        return this.storyId;
    }

    public final StoryKind component2() {
        return this.storyKind;
    }

    public final String component3() {
        return this.storyDisplayName;
    }

    public final gct component4() {
        return this.storyPostMetadata;
    }

    public final StorySnapRecipient copy(String str, StoryKind storyKind, String str2, gct gct) {
        akcr.b(str, "storyId");
        akcr.b(storyKind, "storyKind");
        return new StorySnapRecipient(str, storyKind, str2, gct);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.storyPostMetadata, r3.storyPostMetadata) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.model.StorySnapRecipient;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.core.model.StorySnapRecipient) r3;
        r0 = r2.storyId;
        r1 = r3.storyId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.storyKind;
        r1 = r3.storyKind;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.storyDisplayName;
        r1 = r3.storyDisplayName;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.storyPostMetadata;
        r3 = r3.storyPostMetadata;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.model.StorySnapRecipient.equals(java.lang.Object):boolean");
    }

    public final GroupStoryType getGroupStoryType() {
        return this.groupStoryType;
    }

    public final String getId() {
        return this.storyId;
    }

    public final PrivacyType getMyStoryOverridePrivacy() {
        return this.myStoryOverridePrivacy;
    }

    public final String getStoryDisplayName() {
        return this.storyDisplayName;
    }

    public final String getStoryId() {
        return this.storyId;
    }

    public final StoryKind getStoryKind() {
        return this.storyKind;
    }

    public final gct getStoryPostMetadata() {
        return this.storyPostMetadata;
    }

    public final int hashCode() {
        String str = this.storyId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        StoryKind storyKind = this.storyKind;
        hashCode = (hashCode + (storyKind != null ? storyKind.hashCode() : 0)) * 31;
        String str2 = this.storyDisplayName;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        gct gct = this.storyPostMetadata;
        if (gct != null) {
            i = gct.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySnapRecipient(storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyKind=");
        stringBuilder.append(this.storyKind);
        stringBuilder.append(", storyDisplayName=");
        stringBuilder.append(this.storyDisplayName);
        stringBuilder.append(", storyPostMetadata=");
        stringBuilder.append(this.storyPostMetadata);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
