package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.snapchat.android.R;

/* renamed from: ipm */
public final class ipm extends zpb {
    private final zom A;
    private final zom B;
    private final zor C;
    final zox a = new zox();
    final zox b;
    final zox c;
    final zpc d;
    final zor e;
    final zom f;
    final zol g;
    final zom h;
    final zor i;
    final zou j;
    private final zoy u;
    private final zon v;
    private final zoz w;
    private final zok x;
    private final zov y;
    private final zov z;

    /* renamed from: ipm$a */
    static final class a extends akcs implements akbl<achg, Boolean> {
        private /* synthetic */ achg a;
        private /* synthetic */ achg b;

        a(achg achg, achg achg2) {
            this.a = achg;
            this.b = achg2;
            super(1);
        }

        public final boolean a(achg achg) {
            akcr.b(achg, "pageType");
            return akcr.a(this.a, (Object) achg) || akcr.a(this.b, (Object) achg);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((achg) obj));
        }
    }

    public ipm() {
        zox zox = new zox();
        zox.a(0.1f);
        this.b = zox;
        zox = new zox();
        zox.a(0.5f);
        this.c = zox;
        zpc zpc = new zpc();
        zpc.a((int) R.id.feed_icon_container);
        zpc.a((int) R.id.discoverfeed_icon_container);
        zpc.a((int) R.id.memories_icon_container);
        zpc.a((int) R.id.camera_capture_button);
        zpc.a((int) R.id.neon_add_friend_button_container);
        this.d = zpc;
        zoy zoy = new zoy();
        zoy.a((int) R.id.neon_header_title);
        this.u = zoy;
        zor zor = new zor();
        zor.a((int) R.id.camera_capture_button);
        zor.a((int) R.id.hova_nav_feed_icon_and_badge);
        zor.a((int) R.id.hova_nav_discoverfeed_icon_and_badge);
        this.e = zor;
        zon zon = new zon();
        zon.a((int) R.id.camera_capture_button);
        this.v = zon;
        zoz zoz = new zoz();
        zoz.a((int) R.id.hova_nav_feed_icon);
        zoz.a((int) R.id.hova_nav_discoverfeed_icon);
        zoz.a((int) R.id.hova_header_search_icon);
        zoz.a((int) R.id.hova_header_add_friend_icon);
        this.w = zoz;
        zok zok = new zok();
        zok.a((int) R.id.hova_nav_feed_icon);
        zok.a((int) R.id.hova_nav_discoverfeed_icon);
        zok.a((int) R.id.camera_capture_button);
        this.x = zok;
        zov zov = new zov(true);
        zov.a((int) R.id.camera_capture_button);
        this.y = zov;
        zov = new zov(false);
        zov.a((int) R.id.hova_nav_feed_icon_and_badge);
        zov.a((int) R.id.hova_nav_discoverfeed_icon_and_badge);
        this.z = zov;
        zom zom = new zom(this.a, new zos());
        zom.a((int) R.id.camera_flip_button);
        zom.a((int) R.id.camera_flash_button);
        zom.a((int) R.id.camera_night_mode_button);
        zom.a((int) R.id.camera_mode_divider_one);
        zom.a((int) R.id.camera_mode_timer);
        zom.a((int) R.id.camera_mode_batch_capture_icon);
        zom.a((int) R.id.camera_mode_portrait_icon);
        zom.a((int) R.id.camera_mode_grid_level_button);
        zom.a((int) R.id.camera_mode_dropdown);
        zom.a((int) R.id.neon_add_friend_button_container);
        this.f = zom;
        zom = new zom(new zos(), new zow(), this.c);
        zom.a((int) R.id.hova_underline);
        this.A = zom;
        zom = new zom(this.b, new zos());
        zom.a((int) R.id.memories_icon_container);
        this.B = zom;
        zor = new zor();
        zor.a((int) R.id.start_button);
        this.C = zor;
        zol zol = new zol();
        zol.a((int) R.id.hova_header_search_icon);
        this.g = zol;
        zom = new zom(new zot(), new zpa());
        zom.a((int) R.id.neon_header_layout);
        zom.a((int) R.id.vertical_container);
        this.h = zom;
        zor = new zor();
        zor.a((TimeInterpolator) new DecelerateInterpolator(0.5f));
        zor.a((int) R.id.neon_header_layout);
        this.i = zor;
        zou zou = new zou();
        zou.a((int) R.id.neon_header_layout);
        this.j = zou;
        a((zob) this.d);
        a((zob) this.u);
        a((zob) this.e);
        a((zob) this.v);
        a((zob) this.w);
        a((zob) this.x);
        a((zob) this.y);
        a((zob) this.z);
        a((zob) this.f);
        a((zob) this.A);
        a((zob) this.B);
        a((zob) this.C);
        c(0);
    }
}
