package com.snap.component.header;

import android.content.Context;
import defpackage.akcr;
import defpackage.zmy;

public final class SnapSubscreenHeaderView$headerBehavior$1 extends SnapSubscreenHeaderBehavior {
    private /* synthetic */ SnapSubscreenHeaderView d;

    SnapSubscreenHeaderView$headerBehavior$1(SnapSubscreenHeaderView snapSubscreenHeaderView, Context context, SnapSubscreenHeaderView snapSubscreenHeaderView2) {
        this.d = snapSubscreenHeaderView;
        super(context, snapSubscreenHeaderView2);
    }

    public final String a(zmy zmy) {
        akcr.b(zmy, "viewModel");
        Object obj = (String) this.d.j.b();
        akcr.a(obj, "sectionHeaderDefaultText");
        return obj;
    }
}
