package com.snap.core.db.column;

import defpackage.aemr;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class Friendmojis {
    public static final Companion Companion = new Companion();
    private final String baseFriendmojis;
    private final List<FriendmojiCategory> categories;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Friendmojis create(List<? extends FriendmojiCategory> list) {
            List list2;
            if (list2 == null) {
                list2 = ajyw.a;
            }
            return new Friendmojis(list2, null);
        }

        public final Friendmojis from(List<? extends aemr> list) {
            if (list == null) {
                return null;
            }
            Iterable<aemr> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (aemr from : iterable) {
                arrayList.add(FriendmojiCategory.Companion.from(from));
            }
            return new Friendmojis((List) arrayList, null);
        }

        public final String getBaseFriendmojis(Friendmojis friendmojis) {
            if (friendmojis != null) {
                String access$getBaseFriendmojis$p = friendmojis.baseFriendmojis;
                if (access$getBaseFriendmojis$p != null) {
                    return access$getBaseFriendmojis$p;
                }
            }
            return "";
        }
    }

    private Friendmojis(List<? extends FriendmojiCategory> list) {
        this.categories = list;
        this.baseFriendmojis = ajyu.a((Iterable) this.categories, (CharSequence) "", null, null, 0, null, (akbl) Friendmojis$baseFriendmojis$1.INSTANCE, 30);
    }

    public /* synthetic */ Friendmojis(List list, akco akco) {
        this(list);
    }

    public static /* synthetic */ Friendmojis copy$default(Friendmojis friendmojis, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = friendmojis.categories;
        }
        return friendmojis.copy(list);
    }

    public static final Friendmojis create(List<? extends FriendmojiCategory> list) {
        return Companion.create(list);
    }

    public static final Friendmojis from(List<? extends aemr> list) {
        return Companion.from(list);
    }

    public static final String getBaseFriendmojis(Friendmojis friendmojis) {
        return Companion.getBaseFriendmojis(friendmojis);
    }

    public final List<FriendmojiCategory> component1() {
        return this.categories;
    }

    public final Friendmojis copy(List<? extends FriendmojiCategory> list) {
        akcr.b(list, "categories");
        return new Friendmojis(list);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.categories, ((com.snap.core.db.column.Friendmojis) r2).categories) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.core.db.column.Friendmojis;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.core.db.column.Friendmojis) r2;
        r0 = r1.categories;
        r2 = r2.categories;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.Friendmojis.equals(java.lang.Object):boolean");
    }

    public final List<FriendmojiCategory> getCategories() {
        return this.categories;
    }

    public final int hashCode() {
        List list = this.categories;
        return list != null ? list.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Friendmojis(categories=");
        stringBuilder.append(this.categories);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
