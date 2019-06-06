package defpackage;

import android.content.res.Resources;
import com.snapchat.android.R;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* renamed from: acsw */
public final class acsw {
    final ajxe a = ajxh.a(b.a);
    private final aipn<sdu> b;
    private final Resources c;

    /* renamed from: acsw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acsw$b */
    static final class b extends akcs implements akbk<gxa> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new gxa(new gxc(gxb.SNAP_CREATION_TIME, gxe.DESC));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acsw.class), "descStoryOrderingConfig", "getDescStoryOrderingConfig()Lcom/snap/discover/playback/api/opera/PlaybackItemProviderConfig;");
        a aVar = new a();
    }

    public acsw(aipn<sdu> aipn, Resources resources) {
        akcr.b(aipn, "notificationEmitter");
        akcr.b(resources, "resources");
        this.b = aipn;
        this.c = resources;
    }

    public static aajv a(srb srb) {
        akcr.b(srb, "viewExitMethod");
        switch (acsx.a[srb.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return aajv.TAP;
            case 5:
                return aajv.SWIPE_RIGHT;
            case 6:
                return aajv.SWIPE_LEFT;
            case 7:
                return aajv.TAP_LEFT;
            case 8:
                return aajv.AUTO_ADVANCE;
            case 9:
                return aajv.SWIPE_DOWN;
            case 10:
                return aajv.SWIPE_UP;
            case 11:
                return aajv.BACK_PRESSED;
            case 12:
                return aajv.LONG_PRESS_END;
            case 13:
                return aajv.ENTER_BACKGROUND;
            default:
                return null;
        }
    }

    public static void a(Map<String, String> map, alee alee) {
        akcr.b(map, "map");
        akcr.b(alee, "manifest");
        Object obj = alee.b;
        akcr.a(obj, "manifest.elements");
        for (Object obj2 : obj) {
            akcr.a(obj2, "it");
            Object b = obj2.b();
            akcr.a(b, "it.id");
            Object obj22 = obj22.f();
            akcr.a(obj22, "it.sssId");
            map.put(b, obj22);
        }
    }

    public final void a() {
        String string = this.c.getString(R.string.nyc_map_tap_to_play_no_snaps);
        akcr.a((Object) string, "resources.getString(R.st…map_tap_to_play_no_snaps)");
        ((sdu) this.b.get()).b(sdt.a(new seg(string, Integer.valueOf(R.color.map_info_window_light_grey), 12)).a(sec.SAVE_CAMERA_ROLL).a());
    }

    public final void a(Throwable th) {
        akcr.b(th, "error");
        if (!(th instanceof TimeoutException)) {
            th.getMessage();
        }
        a();
    }
}
