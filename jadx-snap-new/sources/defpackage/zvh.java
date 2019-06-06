package defpackage;

import android.app.Activity;
import android.content.Context;
import com.brightcove.player.event.Event;
import com.snap.composer.IComposerViewLoader;
import com.snap.composer.api.UserScopedViewLoader;
import com.snap.composer.api.ui.page.ComposerPage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: zvh */
public final class zvh implements zve {
    final ajwy<zvr> a;
    final ajwy<UserScopedViewLoader> b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new c(this));
    private final Activity e;
    private final zgb f;
    private final achb<zjm, zjk> g;

    /* renamed from: zvh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zvh$b */
    static final class b extends akcs implements akbk<zvr> {
        private /* synthetic */ zvh a;

        b(zvh zvh) {
            this.a = zvh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zvr) this.a.a.get();
        }
    }

    /* renamed from: zvh$c */
    static final class c extends akcs implements akbk<UserScopedViewLoader> {
        private /* synthetic */ zvh a;

        c(zvh zvh) {
            this.a = zvh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (UserScopedViewLoader) this.a.b.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zvh.class), "venuesApi", "getVenuesApi()Lcom/snap/venues/api/VenuesApi;"), new akdc(akde.a(zvh.class), "viewLoader", "getViewLoader()Lcom/snap/composer/api/UserScopedViewLoader;")};
        a aVar = new a();
    }

    public zvh(Activity activity, zgb zgb, achb<zjm, zjk> achb, ajwy<zvr> ajwy, ajwy<UserScopedViewLoader> ajwy2) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "venuesApiProvider");
        akcr.b(ajwy2, "viewLoaderProvider");
        this.e = activity;
        this.f = zgb;
        this.g = achb;
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final void a(zvd zvd, List<zvd> list, float f, float f2, float f3) {
        zvd zvd2 = zvd;
        List<zvd> list2 = list;
        akcr.b(zvd2, "currentVenueData");
        akcr.b(list2, "otherVenuesData");
        zjm zjm = new zjm(zvi.a, "VenueFeedbackPageLauncherImpl", false, false, false, false, null, false, false, false, false, null, 4092);
        acgu a = acgu.a(acis.d, (achg) zjm, true);
        Object a2 = acgv.a().a(a.j()).a();
        Iterable<zvd> iterable = list2;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (zvd zvd3 : iterable) {
            arrayList.add(new zvc(zvd3.a, zvd3.b));
        }
        List list3 = (List) arrayList;
        String str = zvd2.a;
        String str2 = zvd2.b;
        Double valueOf = Double.valueOf((double) f);
        Double valueOf2 = Double.valueOf((double) f2);
        Double valueOf3 = Double.valueOf((double) f3);
        Boolean bool = Boolean.FALSE;
        zvb zvb = new zvb(str, str2, list3, valueOf, valueOf2, valueOf3, bool, bool);
        achb achb = this.g;
        Object obj = (zvr) this.c.b();
        akcr.a(obj, "venuesApi");
        zvg zvg = new zvg(achb, obj, this.f);
        Context context = this.e;
        IComposerViewLoader viewLoader = ((UserScopedViewLoader) this.d.b()).getViewLoader();
        achb achb2 = this.g;
        akcr.a(a2, "navigationActionSpec");
        acgu acgu = a;
        ComposerPage composerPage = new ComposerPage(context, viewLoader, zjm, zjm, achb2, a2, zvb, zvg, 0, 256, null);
        achb achb3 = this.g;
        achd achd = composerPage;
        akcr.a((Object) acgu, "navigationAction");
        achb3.a(achd, acgu, null);
    }
}
