package com.snap.composer.people;

import com.snap.core.db.record.FriendModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class FriendmojiRenderRequest implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final List<Friendmoji> a;
    private final double b;
    private final String c;
    private final String d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x008d in {3, 8, 13, 15, 17, 19} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final com.snap.composer.people.FriendmojiRenderRequest fromJavaScript(java.lang.Object r11) {
            /*
            r10 = this;
            r0 = r11 instanceof com.snap.composer.people.FriendmojiRenderRequest;
            if (r0 == 0) goto L_0x0007;
            r11 = (com.snap.composer.people.FriendmojiRenderRequest) r11;
            return r11;
            r0 = r11 instanceof java.util.Map;
            if (r0 == 0) goto L_0x0083;
            r11 = (java.util.Map) r11;
            r0 = "friendmojis";
            r1 = r11.get(r0);
            r2 = r1 instanceof java.lang.Object[];
            if (r2 != 0) goto L_0x0018;
            r1 = 0;
            r1 = (java.lang.Object[]) r1;
            if (r1 == 0) goto L_0x0064;
            r0 = new java.util.ArrayList;
            r2 = r1.length;
            r0.<init>(r2);
            r0 = (java.util.Collection) r0;
            r2 = r1.length;
            r3 = 0;
            if (r3 >= r2) goto L_0x0036;
            r4 = r1[r3];
            r5 = com.snap.composer.people.Friendmoji.Companion;
            r4 = r5.fromJavaScript(r4);
            r0.add(r4);
            r3 = r3 + 1;
            goto L_0x0026;
            r5 = r0;
            r5 = (java.util.List) r5;
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "streakLength";
            r1 = r11.get(r1);
            r6 = r0.asDouble(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "userId";
            r1 = r11.get(r1);
            r8 = r0.asString(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "username";
            r11 = r11.get(r1);
            r9 = r0.asString(r11);
            r11 = new com.snap.composer.people.FriendmojiRenderRequest;
            r4 = r11;
            r4.<init>(r5, r6, r8, r9);
            return r11;
            r1 = new java.lang.StringBuilder;
            r2 = "Cannot cast ";
            r1.<init>(r2);
            r11 = r11.get(r0);
            r1.append(r11);
            r11 = " to Array<*>";
            r1.append(r11);
            r11 = r1.toString();
            r0 = new com.snap.composer.exceptions.AttributeError;
            r0.<init>(r11);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r11 = new com.snap.composer.exceptions.AttributeError;
            r0 = "Could not cast jsInstance to Map";
            r11.<init>(r0);
            r11 = (java.lang.Throwable) r11;
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.FriendmojiRenderRequest$Companion.fromJavaScript(java.lang.Object):com.snap.composer.people.FriendmojiRenderRequest");
        }

        public final Map<String, Object> toJavaScript(FriendmojiRenderRequest friendmojiRenderRequest) {
            akcr.b(friendmojiRenderRequest, "instance");
            Map linkedHashMap = new LinkedHashMap();
            List friendmojis = friendmojiRenderRequest.getFriendmojis();
            int size = friendmojis.size();
            Friendmoji[] friendmojiArr = new Friendmoji[size];
            for (int i = 0; i < size; i++) {
                friendmojiArr[i] = (Friendmoji) friendmojis.get(i);
            }
            linkedHashMap.put(FriendModel.FRIENDMOJIS, friendmojiArr);
            linkedHashMap.put(FriendModel.STREAKLENGTH, Double.valueOf(friendmojiRenderRequest.getStreakLength()));
            linkedHashMap.put("userId", friendmojiRenderRequest.getUserId());
            linkedHashMap.put("username", friendmojiRenderRequest.getUsername());
            return linkedHashMap;
        }
    }

    public FriendmojiRenderRequest(List<Friendmoji> list, double d, String str, String str2) {
        akcr.b(list, FriendModel.FRIENDMOJIS);
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        this.a = list;
        this.b = d;
        this.c = str;
        this.d = str2;
    }

    public static /* synthetic */ FriendmojiRenderRequest copy$default(FriendmojiRenderRequest friendmojiRenderRequest, List list, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = friendmojiRenderRequest.a;
        }
        if ((i & 2) != 0) {
            d = friendmojiRenderRequest.b;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str = friendmojiRenderRequest.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = friendmojiRenderRequest.d;
        }
        return friendmojiRenderRequest.copy(list, d2, str3, str2);
    }

    public final List<Friendmoji> component1() {
        return this.a;
    }

    public final double component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final FriendmojiRenderRequest copy(List<Friendmoji> list, double d, String str, String str2) {
        akcr.b(list, FriendModel.FRIENDMOJIS);
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        return new FriendmojiRenderRequest(list, d, str, str2);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r4.d, r5.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0033;
    L_0x0002:
        r0 = r5 instanceof com.snap.composer.people.FriendmojiRenderRequest;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r5 = (com.snap.composer.people.FriendmojiRenderRequest) r5;
        r0 = r4.a;
        r1 = r5.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r4.b;
        r2 = r5.b;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0031;
    L_0x001c:
        r0 = r4.c;
        r1 = r5.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r4.d;
        r5 = r5.d;
        r5 = defpackage.akcr.a(r0, r5);
        if (r5 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r5 = 0;
        return r5;
    L_0x0033:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.FriendmojiRenderRequest.equals(java.lang.Object):boolean");
    }

    public final List<Friendmoji> getFriendmojis() {
        return this.a;
    }

    public final double getStreakLength() {
        return this.b;
    }

    public final String getUserId() {
        return this.c;
    }

    public final String getUsername() {
        return this.d;
    }

    public final int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendmojiRenderRequest(friendmojis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.b);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", username=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
