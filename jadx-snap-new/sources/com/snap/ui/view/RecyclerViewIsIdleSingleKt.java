package com.snap.ui.view;

import android.support.v7.widget.RecyclerView;
import defpackage.ajcx;
import defpackage.ajda;
import defpackage.akcr;
import defpackage.akdd.e;

public final class RecyclerViewIsIdleSingleKt {
    public static final ajcx recyclerViewIsIdleCompletable(RecyclerView recyclerView) {
        akcr.b(recyclerView, "recyclerView");
        e eVar = new e();
        eVar.a = null;
        Object f = ajcx.a((ajda) new RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$1(recyclerView, eVar)).f(new RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2(eVar, recyclerView));
        akcr.a(f, "Completable.create {\n   …          }\n            }");
        return f;
    }
}
