package defpackage;

import com.brightcove.player.event.Event;
import defpackage.twf.b;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: twd */
public final class twd {
    public final ilv a;
    public final ablu b;
    public final twf c;

    /* renamed from: twd$c */
    static final class c extends akcs implements akbl<ily, ilz> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "it");
            return ily.b();
        }
    }

    /* renamed from: twd$d */
    static final class d extends akcs implements akbl<ily, ilz> {
        private /* synthetic */ String a;

        d(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "it");
            return ily.a("action", this.a);
        }
    }

    /* renamed from: twd$b */
    public static final class b extends akcs implements akbl<zfm, String> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zfm zfm = (zfm) obj;
            akcr.b(zfm, "it");
            return zfm.b;
        }
    }

    /* renamed from: twd$a */
    public static final class a extends akcs implements akbl<ily, ilz> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "it");
            return ily.b();
        }
    }

    public twd(ilv ilv, ablu ablu, twf twf) {
        akcr.b(ilv, "graphene");
        akcr.b(ablu, "snapCreationTracker");
        akcr.b(twf, "snapPreviewTracker");
        this.a = ilv;
        this.b = ablu;
        this.c = twf;
    }

    public static /* synthetic */ void a(twd twd, twb twb, akbl akbl, int i) {
        if ((i & 4) != 0) {
            akbl = c.a;
        }
        twd.a(twb, false, akbl);
    }

    public final abll a(twe twe, akbl<? super ily, ilz> akbl) {
        akcr.b(twe, "previewSection");
        akcr.b(akbl, "setDimensions");
        return this.c.a(twe, akbl);
    }

    public final <R> R a(String str, akbk<? extends R> akbk) {
        akcr.b(str, "action");
        akcr.b(akbk, "section");
        twd.a(this, twb.PLAYER_STATE_TRANSIT_START, new d(str), 2);
        try {
            R invoke = akbk.invoke();
            return invoke;
        } finally {
            twd.a(this, twb.PLAYER_STATE_TRANSIT_END, null, 6);
        }
    }

    public final void a() {
        this.a.c((ily) ipc.PINCH_RESIZE, 1);
    }

    public final void a(String str) {
        akcr.b(str, "playbackState");
        this.b.a(str);
    }

    public final void a(twb twb) {
        String str = "event";
        akcr.b(twb, str);
        twf twf = this.c;
        akcr.b(twb, str);
        for (twe twe : twf.a.keySet()) {
            if (twb == twe.startEvent) {
                twf.a.remove(twe);
            }
        }
    }

    public final void a(twb twb, akbl<? super ily, ilz> akbl) {
        String str = "event";
        akcr.b(twb, str);
        String str2 = "setDimensions";
        akcr.b(akbl, str2);
        twf twf = this.c;
        akcr.b(twb, str);
        akcr.b(akbl, str2);
        for (Entry entry : twf.a.entrySet()) {
            if (twb == ((twe) entry.getKey()).startEvent && (entry.getValue() instanceof b)) {
                Map map = twf.a;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    b bVar = (b) value;
                    akcr.b(akbl, str2);
                    map.put(key, new b(bVar, bVar.a, (ilz) akbl.invoke(bVar.b.a)));
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.preview.metrics.SnapPreviewTracker.SectionTimerWithGraphene");
                }
            }
        }
    }

    public final void a(twb twb, boolean z, akbl<? super ily, ilz> akbl) {
        akcr.b(twb, "event");
        akcr.b(akbl, "setDimensions");
        this.c.a(twb, z, (akbl) akbl);
    }

    public final List<abll> b(twb twb) {
        akcr.b(twb, "event");
        return this.c.a(twb);
    }

    public final void b(String str) {
        akcr.b(str, "groupName");
        this.a.c(iod.GEOFILTER_SWIPE.a("carousel_group", str), 1);
    }

    public final void c(String str) {
        String str2 = Event.ERROR_MESSAGE;
        akcr.b(str, str2);
        this.a.c(ipc.MULTI_SNAP_THUMBNAIL_ERROR.a(str2, str), 1);
    }

    public final void d(String str) {
        String str2 = "tool";
        akcr.b(str, str2);
        this.a.c(ipc.ACTION_BUTTON_TAP.a(str2, str), 1);
    }

    public final void e(String str) {
        String str2 = "tool";
        akcr.b(str, str2);
        this.a.c(ipc.ACTION_BUTTON_LONG_PRESS.a(str2, str), 1);
    }
}
