package com.snap.core.db.column;

import android.text.TextUtils;
import com.google.common.base.Joiner;
import defpackage.ainu;
import defpackage.ainv;
import defpackage.ajyn;
import defpackage.akcr;
import defpackage.akgc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class FriendmojisColumnAdapter implements ainu<Friendmojis, String> {
    private final String SEPARATOR = "\t";
    private final ainv<FriendmojiCategory> itemConverter = ainv.a(FriendmojiCategory.class);

    public final Friendmojis decode(String str) {
        akcr.b(str, "databaseValue");
        Iterable a = akgc.a((CharSequence) str, new String[]{this.SEPARATOR}, 0, 6);
        Collection arrayList = new ArrayList();
        for (Object next : a) {
            if ((TextUtils.isEmpty((String) next) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (String a2 : iterable) {
            arrayList2.add((FriendmojiCategory) this.itemConverter.decode(a2));
        }
        return Friendmojis.Companion.create((List) arrayList2);
    }

    public final String encode(Friendmojis friendmojis) {
        akcr.b(friendmojis, "value");
        Joiner skipNulls = Joiner.on(this.SEPARATOR).skipNulls();
        Iterable<FriendmojiCategory> categories = friendmojis.getCategories();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) categories, 10));
        for (FriendmojiCategory a : categories) {
            arrayList.add(ainv.a((Enum) a));
        }
        Object join = skipNulls.join((Iterable) (List) arrayList);
        akcr.a(join, "Joiner.on(SEPARATOR).ski…onverter.encode(value) })");
        return join;
    }
}
