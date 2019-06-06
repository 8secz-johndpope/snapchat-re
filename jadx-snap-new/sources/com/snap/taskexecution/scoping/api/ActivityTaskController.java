package com.snap.taskexecution.scoping.api;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajws;
import defpackage.k;
import defpackage.s;
import defpackage.zgj;
import defpackage.zgk;
import java.util.Collection;
import java.util.LinkedList;

public class ActivityTaskController implements k {
    private final a a;
    private final zgk<b> b;
    private final LinkedList<zgj> c;
    private final LinkedList<zgj> d;
    private final ajws<b> e;

    public interface a {
        ajdw a();
    }

    private void a(b bVar, b bVar2, Collection<zgj> collection) {
        ajei ajei = new ajei();
        this.b.a(ajei, bVar2, "ActivityTaskController");
        this.a.a().a(new -$$Lambda$ActivityTaskController$VGRcFGelZ_6lBoTq4SlN6rChBr0(this, collection, ajei, bVar));
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public void onCreate() {
        a(b.ON_CREATE, b.ON_DESTROY, this.c);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public void onResume() {
        a(b.ON_RESUME, b.ON_PAUSE, this.d);
    }
}
