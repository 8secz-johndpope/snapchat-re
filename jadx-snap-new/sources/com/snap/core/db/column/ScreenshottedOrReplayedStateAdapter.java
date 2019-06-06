package com.snap.core.db.column;

import com.snap.core.db.column.ScreenshottedOrReplayedState.Companion;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import defpackage.ainu;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akgc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ScreenshottedOrReplayedStateAdapter implements ainu<ScreenshottedOrReplayedState, String> {
    public final ScreenshottedOrReplayedState decode(String str) {
        List list = null;
        if (str != null) {
            if ((((CharSequence) str).length() > 0 ? 1 : null) == null) {
                str = null;
            }
            if (str != null) {
                List a = akgc.a((CharSequence) str, new String[]{"\t"}, 0, 6);
                if (a != null) {
                    Iterable<String> iterable = a;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (String fromString : iterable) {
                        arrayList.add(Record.Companion.fromString(fromString));
                    }
                    list = ajyu.k((List) arrayList);
                }
            }
        }
        Companion companion = ScreenshottedOrReplayedState.Companion;
        if (list == null) {
            list = ajyw.a;
        }
        return companion.create(list);
    }

    public final String encode(ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        akcr.b(screenshottedOrReplayedState, "value");
        return ajyu.a((Iterable) screenshottedOrReplayedState.getSortedInteractions(), (CharSequence) "\t", null, null, 0, null, (akbl) ScreenshottedOrReplayedStateAdapter$encode$1.INSTANCE, 30);
    }
}
