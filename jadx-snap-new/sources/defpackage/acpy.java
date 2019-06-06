package defpackage;

import com.brightcove.player.event.Event;
import java.util.List;

/* renamed from: acpy */
public final class acpy {
    final ajwl<Boolean> a;
    public final ajdp<Boolean> b = this.a.j(ajfu.a).f();
    public final ajdp<List<acqf>> c;
    public final ajdp<List<acqf>> d;
    final ajwl<String> e;
    public final ajdp<String> f;
    public final ajwo<ajxw> g;
    public final ajdp<ajxw> h;
    private final ajwl<List<acqf>> i;
    private final ajwl<List<acqf>> j;

    public acpy() {
        Object i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault<Boolean>(false)");
        this.a = i;
        i = new ajwl();
        String str = "BehaviorSubject.create<L…ExplorerStatusWrapper>>()";
        akcr.a(i, str);
        this.i = i;
        this.c = this.i.f();
        i = new ajwl();
        akcr.a(i, str);
        this.j = i;
        this.d = this.j.f();
        i = new ajwl();
        akcr.a(i, "BehaviorSubject.create<String>()");
        this.e = i;
        this.f = this.e.f();
        i = new ajwo();
        akcr.a(i, "PublishSubject.create<Unit>()");
        this.g = i;
        this.h = this.g.f();
    }

    public final void a(List<? extends acqf> list) {
        akcr.b(list, Event.LIST);
        this.i.a((Object) list);
    }

    public final void b(List<? extends acqf> list) {
        akcr.b(list, Event.LIST);
        this.j.a((Object) list);
    }
}
