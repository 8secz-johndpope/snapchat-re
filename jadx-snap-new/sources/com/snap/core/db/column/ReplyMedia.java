package com.snap.core.db.column;

import com.snap.core.db.record.MessageModel;
import defpackage.aerv;
import defpackage.akco;
import defpackage.akcr;

public final class ReplyMedia {
    public static final Companion Companion = new Companion();
    private final String cryptoIv;
    private final String cryptoKey;
    private final String id;
    private final String type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ReplyMedia fromSoju(aerv aerv) {
            akcr.b(aerv, "sojuMedia");
            Object obj = aerv.a;
            akcr.a(obj, "sojuMedia.mediaId");
            Object obj2 = aerv.b;
            akcr.a(obj2, "sojuMedia.mediaType");
            Object obj3 = aerv.e;
            akcr.a(obj3, "sojuMedia.key");
            Object obj4 = aerv.f;
            akcr.a(obj4, "sojuMedia.iv");
            return new ReplyMedia(obj, obj2, obj3, obj4);
        }
    }

    public ReplyMedia(String str, String str2, String str3, String str4) {
        akcr.b(str, "id");
        akcr.b(str2, "type");
        akcr.b(str3, MessageModel.CRYPTOKEY);
        akcr.b(str4, "cryptoIv");
        this.id = str;
        this.type = str2;
        this.cryptoKey = str3;
        this.cryptoIv = str4;
    }

    public static /* synthetic */ ReplyMedia copy$default(ReplyMedia replyMedia, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyMedia.id;
        }
        if ((i & 2) != 0) {
            str2 = replyMedia.type;
        }
        if ((i & 4) != 0) {
            str3 = replyMedia.cryptoKey;
        }
        if ((i & 8) != 0) {
            str4 = replyMedia.cryptoIv;
        }
        return replyMedia.copy(str, str2, str3, str4);
    }

    public static final ReplyMedia fromSoju(aerv aerv) {
        return Companion.fromSoju(aerv);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.cryptoKey;
    }

    public final String component4() {
        return this.cryptoIv;
    }

    public final ReplyMedia copy(String str, String str2, String str3, String str4) {
        akcr.b(str, "id");
        akcr.b(str2, "type");
        akcr.b(str3, MessageModel.CRYPTOKEY);
        akcr.b(str4, "cryptoIv");
        return new ReplyMedia(str, str2, str3, str4);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.cryptoIv, r3.cryptoIv) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.db.column.ReplyMedia;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.core.db.column.ReplyMedia) r3;
        r0 = r2.id;
        r1 = r3.id;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.type;
        r1 = r3.type;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.cryptoKey;
        r1 = r3.cryptoKey;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.cryptoIv;
        r3 = r3.cryptoIv;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.ReplyMedia.equals(java.lang.Object):boolean");
    }

    public final String getCryptoIv() {
        return this.cryptoIv;
    }

    public final String getCryptoKey() {
        return this.cryptoKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.cryptoKey;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.cryptoIv;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReplyMedia(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", cryptoKey=");
        stringBuilder.append(this.cryptoKey);
        stringBuilder.append(", cryptoIv=");
        stringBuilder.append(this.cryptoIv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
