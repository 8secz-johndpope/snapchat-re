package com.snap.composer.people;

import com.snap.core.db.record.FriendModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Friend implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final User a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final double e;
    private final double f;
    private final List<Friendmoji> g;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00b1 in {3, 8, 13, 15, 17, 19} preds:[]
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
        public final com.snap.composer.people.Friend fromJavaScript(java.lang.Object r14) {
            /*
            r13 = this;
            r0 = r14 instanceof com.snap.composer.people.Friend;
            if (r0 == 0) goto L_0x0007;
            r14 = (com.snap.composer.people.Friend) r14;
            return r14;
            r0 = r14 instanceof java.util.Map;
            if (r0 == 0) goto L_0x00a7;
            r0 = com.snap.composer.people.User.Companion;
            r14 = (java.util.Map) r14;
            r1 = "user";
            r1 = r14.get(r1);
            r3 = r0.fromJavaScript(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "isBestFriend";
            r1 = r14.get(r1);
            r4 = r0.asBoolean(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "isMutual";
            r1 = r14.get(r1);
            r5 = r0.asBoolean(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "isBirthday";
            r1 = r14.get(r1);
            r6 = r0.asBoolean(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "lastInteractionTimestamp";
            r1 = r14.get(r1);
            r7 = r0.asDouble(r1);
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "snapStreakCount";
            r1 = r14.get(r1);
            r9 = r0.asDouble(r1);
            r0 = "friendmojis";
            r1 = r14.get(r0);
            r2 = r1 instanceof java.lang.Object[];
            if (r2 != 0) goto L_0x0060;
            r1 = 0;
            r1 = (java.lang.Object[]) r1;
            if (r1 == 0) goto L_0x0088;
            r14 = new java.util.ArrayList;
            r0 = r1.length;
            r14.<init>(r0);
            r14 = (java.util.Collection) r14;
            r0 = r1.length;
            r2 = 0;
            if (r2 >= r0) goto L_0x007e;
            r11 = r1[r2];
            r12 = com.snap.composer.people.Friendmoji.Companion;
            r11 = r12.fromJavaScript(r11);
            r14.add(r11);
            r2 = r2 + 1;
            goto L_0x006e;
            r11 = r14;
            r11 = (java.util.List) r11;
            r14 = new com.snap.composer.people.Friend;
            r2 = r14;
            r2.<init>(r3, r4, r5, r6, r7, r9, r11);
            return r14;
            r1 = new java.lang.StringBuilder;
            r2 = "Cannot cast ";
            r1.<init>(r2);
            r14 = r14.get(r0);
            r1.append(r14);
            r14 = " to Array<*>";
            r1.append(r14);
            r14 = r1.toString();
            r0 = new com.snap.composer.exceptions.AttributeError;
            r0.<init>(r14);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r14 = new com.snap.composer.exceptions.AttributeError;
            r0 = "Could not cast jsInstance to Map";
            r14.<init>(r0);
            r14 = (java.lang.Throwable) r14;
            throw r14;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.Friend$Companion.fromJavaScript(java.lang.Object):com.snap.composer.people.Friend");
        }

        public final Map<String, Object> toJavaScript(Friend friend) {
            akcr.b(friend, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("user", friend.getUser());
            linkedHashMap.put("isBestFriend", Boolean.valueOf(friend.isBestFriend()));
            linkedHashMap.put("isMutual", Boolean.valueOf(friend.isMutual()));
            linkedHashMap.put("isBirthday", Boolean.valueOf(friend.isBirthday()));
            linkedHashMap.put("lastInteractionTimestamp", Double.valueOf(friend.getLastInteractionTimestamp()));
            linkedHashMap.put("snapStreakCount", Double.valueOf(friend.getSnapStreakCount()));
            List friendmojis = friend.getFriendmojis();
            int size = friendmojis.size();
            Friendmoji[] friendmojiArr = new Friendmoji[size];
            for (int i = 0; i < size; i++) {
                friendmojiArr[i] = (Friendmoji) friendmojis.get(i);
            }
            linkedHashMap.put(FriendModel.FRIENDMOJIS, friendmojiArr);
            return linkedHashMap;
        }
    }

    public Friend(User user, boolean z, boolean z2, boolean z3, double d, double d2, List<Friendmoji> list) {
        akcr.b(user, "user");
        akcr.b(list, FriendModel.FRIENDMOJIS);
        this.a = user;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = d;
        this.f = d2;
        this.g = list;
    }

    public static /* synthetic */ Friend copy$default(Friend friend, User user, boolean z, boolean z2, boolean z3, double d, double d2, List list, int i, Object obj) {
        Friend friend2 = friend;
        return friend.copy((i & 1) != 0 ? friend2.a : user, (i & 2) != 0 ? friend2.b : z, (i & 4) != 0 ? friend2.c : z2, (i & 8) != 0 ? friend2.d : z3, (i & 16) != 0 ? friend2.e : d, (i & 32) != 0 ? friend2.f : d2, (i & 64) != 0 ? friend2.g : list);
    }

    public final User component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final double component5() {
        return this.e;
    }

    public final double component6() {
        return this.f;
    }

    public final List<Friendmoji> component7() {
        return this.g;
    }

    public final Friend copy(User user, boolean z, boolean z2, boolean z3, double d, double d2, List<Friendmoji> list) {
        User user2 = user;
        akcr.b(user, "user");
        List<Friendmoji> list2 = list;
        akcr.b(list2, FriendModel.FRIENDMOJIS);
        return new Friend(user2, z, z2, z3, d, d2, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Friend) {
                Friend friend = (Friend) obj;
                if (akcr.a(this.a, friend.a)) {
                    if ((this.b == friend.b ? 1 : null) != null) {
                        if ((this.c == friend.c ? 1 : null) != null) {
                            if (!((this.d == friend.d ? 1 : null) != null && Double.compare(this.e, friend.e) == 0 && Double.compare(this.f, friend.f) == 0 && akcr.a(this.g, friend.g))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<Friendmoji> getFriendmojis() {
        return this.g;
    }

    public final double getLastInteractionTimestamp() {
        return this.e;
    }

    public final double getSnapStreakCount() {
        return this.f;
    }

    public final User getUser() {
        return this.a;
    }

    public final int hashCode() {
        User user = this.a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.f);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        List list = this.g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isBestFriend() {
        return this.b;
    }

    public final boolean isBirthday() {
        return this.d;
    }

    public final boolean isMutual() {
        return this.c;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Friend(user=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isBestFriend=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isMutual=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isBirthday=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.e);
        stringBuilder.append(", snapStreakCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
