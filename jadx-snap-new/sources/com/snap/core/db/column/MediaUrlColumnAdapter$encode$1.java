package com.snap.core.db.column;

import defpackage.akbl;
import defpackage.akcs;

final class MediaUrlColumnAdapter$encode$1 extends akcs implements akbl<Object, CharSequence> {
    public static final MediaUrlColumnAdapter$encode$1 INSTANCE = new MediaUrlColumnAdapter$encode$1();

    MediaUrlColumnAdapter$encode$1() {
        super(1);
    }

    public final CharSequence invoke(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
