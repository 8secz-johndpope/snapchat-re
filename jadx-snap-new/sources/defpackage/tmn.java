package defpackage;

import android.content.Context;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.UnmodifiableIterator;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import com.snapchat.android.R;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: tmn */
public final class tmn extends wqj implements zjq {
    private static final zjm e = new zjm(wnr.d, "permissions_settings", false, false, false, false, null, false, false, false, false, null, 4076);
    private zmf a;
    private final ajxe b = ajxh.a(c.a);
    private final ajxe c = ajxh.a(b.a);
    private final ifs d;

    /* renamed from: tmn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tmn$b */
    static final class b extends akcs implements akbk<ImmutableList<tmi>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ImmutableList.of(new tmi("android.permission.CAMERA", R.string.picture_and_video_header, R.string.picture_and_video_text), new tmi("android.permission.READ_CONTACTS", R.string.contact_header, R.string.contact_text), new tmi(PermissionsManager.FINE_LOCATION_PERMISSION, R.string.location_header, R.string.location_text), new tmi("android.permission.RECORD_AUDIO", R.string.audio_header, R.string.audio_text), new tmi("android.permission.READ_PHONE_STATE", R.string.read_phone_header, R.string.read_phone_text), new tmi("android.permission.WRITE_EXTERNAL_STORAGE", R.string.modify_storage_header, R.string.modify_storage_text_v2));
        }
    }

    /* renamed from: tmn$c */
    static final class c extends akcs implements akbk<zkf> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zkf();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tmn.class), "rxBus", "getRxBus()Lcom/snap/ui/event/RxBus;"), new akdc(akde.a(tmn.class), "permissionDescriptions", "getPermissionDescriptions()Lcom/google/common/collect/ImmutableList;")};
        a aVar = new a();
    }

    public tmn(Context context, achb<zjm, zjk> achb, zkq zkq, ifs ifs) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(zkq, "insetsDetector");
        akcr.b(ifs, "permissionHelper");
        super(context, e, R.string.permissions_settings_title, R.layout.permissions_settings, achb, zkq);
        this.d = ifs;
    }

    private final zkf a() {
        return (zkf) this.b.b();
    }

    public final long S_() {
        return -1;
    }

    public final void onPageAdded() {
        super.onPageAdded();
        getDisposable().a(a().a(this));
        View findViewById = getContentView().findViewById(R.id.permissions_list);
        if (findViewById != null) {
            RecyclerView recyclerView = (RecyclerView) findViewById;
            zms zms = new zms(tmm.class);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.m, 1, false));
            recyclerView.addItemDecoration(new DividerItemDecoration(this.m, 1));
            this.a = new zmf(zms, a().a());
            zmf zmf = this.a;
            if (zmf == null) {
                akcr.a("adapter");
            }
            recyclerView.setAdapter(zmf);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }

    public final void onPageVisible(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.onPageVisible(achi);
        Builder builder = ImmutableList.builder();
        UnmodifiableIterator it = ((ImmutableList) this.c.b()).iterator();
        while (it.hasNext()) {
            Object obj = (tmi) it.next();
            akcr.a(obj, "description");
            builder.add(new tml(obj, this.d.a(obj.a)));
        }
        zmf zmf = this.a;
        if (zmf == null) {
            akcr.a("adapter");
        }
        Object build = builder.build();
        akcr.a(build, "viewModelBuilder.build()");
        zmf.a(znk.a((List) build));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPermissionToggleEvent(tmj tmj) {
        akcr.b(tmj, "event");
        this.d.r();
    }
}
