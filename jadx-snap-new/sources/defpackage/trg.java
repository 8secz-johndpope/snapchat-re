package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.common.base.Optional;
import com.snap.preview.discard.DiscardBackButtonPresenter;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: trg */
abstract class trg {

    /* renamed from: trg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public static final DiscardBackButtonPresenter a(toc toc, aipn<achb<zjm, zjk>> aipn, aipn<txt> aipn2, zgb zgb, tvd tvd, ajwy<gqr> ajwy) {
        akcr.b(toc, "previewFeature");
        akcr.b(aipn, "navigationHostLazy");
        akcr.b(aipn2, "savingAndExportingControllerLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "exceptionTracker");
        return new DiscardBackButtonPresenter(toc, aipn, aipn2, zgb, tvd, ajwy);
    }

    public static final tof a(toi toi, tvd tvd, ajwy<tyb> ajwy, zgb zgb, ajwy<abss> ajwy2, ajwy<gqr> ajwy3) {
        akcr.b(toi, "analyticsProviderStorage");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "segmentManagerProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "releaseManagerProvider");
        akcr.b(ajwy3, "exceptionTrackerProvider");
        return new tof(toi, tvd, ajwy, zgb, ajwy2, ajwy3);
    }

    public static final tvp a(aipn<DisplayMetrics> aipn, tpv tpv, aipn<tvs> aipn2, odu odu, twz twz, zgb zgb, jwb jwb, tot tot, iko iko, List<String> list, tvd tvd, gqr gqr, toc toc, tvq tvq, aipn<tyb> aipn3, aipn<abss> aipn4, igb igb, ajwy<twd> ajwy, tpl tpl) {
        aipn<DisplayMetrics> aipn5 = aipn;
        akcr.b(aipn5, "displayMetricsLazy");
        akcr.b(tpv, "toolsProvider");
        aipn<tvs> aipn6 = aipn2;
        akcr.b(aipn6, "editsProviderStorageLazy");
        odu odu2 = odu;
        akcr.b(odu2, "mediaPackageManager");
        akcr.b(twz, "previewMediaReaderManager");
        akcr.b(zgb, "schedulersProvider");
        jwb jwb2 = jwb;
        akcr.b(jwb2, "bitmapFactoryProvider");
        tot tot2 = tot;
        akcr.b(tot2, "bitmojiDataProvider");
        iko iko2 = iko;
        akcr.b(iko2, "friendFilterDataSource");
        List<String> list2 = list;
        akcr.b(list2, "editsLayerOrder");
        akcr.b(tvd, "previewDataSource");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(toc, "previewFeature");
        akcr.b(tvq, "editsContainerConfigProvider");
        akcr.b(aipn3, "segmentManagerLazy");
        aipn<abss> aipn7 = aipn4;
        akcr.b(aipn7, "releaseManagerLazy");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        akcr.b(ajwy, "previewMetricsPluginProvider");
        akcr.b(tpl, "previewStartUpConfig");
        tvo tvo = new tvo(aipn5, tpv, aipn6, odu2, twz, zgb, jwb2, tot2, iko2, list2, tvq, aipn7, igb2, ajwy);
        return tpn.a(tpl) ? new tvu(tpv, twz, tvd, gqr, toc, ajwy, tvo, zgb, aipn3) : tvo;
    }

    public static final txt a(Context context, toc toc, zgb zgb, tvp tvp, vji vji, ajwy<vjl> ajwy, Optional<oey> optional, Optional<oey> optional2, ajwy<xah> ajwy2, odu odu, ajei ajei) {
        Context context2 = context;
        akcr.b(context, "context");
        toc toc2 = toc;
        akcr.b(toc, "previewFeature");
        zgb zgb2 = zgb;
        akcr.b(zgb, "schedulersProvider");
        tvp tvp2 = tvp;
        akcr.b(tvp2, "editsComposer");
        vji vji2 = vji;
        akcr.b(vji2, "mediaExportController");
        ajwy<vjl> ajwy3 = ajwy;
        akcr.b(ajwy3, "mediaExportServiceController");
        Optional<oey> optional3 = optional;
        akcr.b(optional3, "mediaSavingController");
        Optional<oey> optional4 = optional2;
        akcr.b(optional4, "mediaSelectOptionSavingController");
        ajwy<xah> ajwy4 = ajwy2;
        akcr.b(ajwy4, "spectaclesExportUIController");
        odu odu2 = odu;
        akcr.b(odu2, "mediaPackageManager");
        ajei ajei2 = ajei;
        akcr.b(ajei2, "sessionDisposable");
        return new txu(context2, toc2, zgb2, tvp2, vji2, ajwy3, optional3, optional4, ajwy4, odu2, ajei2);
    }

    public static final tye a(toc toc, zgb zgb, tvp tvp) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tvp, "editsComposer");
        return new tyf(toc, zgb, tvp);
    }

    public static final tzq a(tpv tpv) {
        akcr.b(tpv, "previewToolsProvider");
        return new tzq((tzt) tpv, tpv);
    }

    public static final tzt a(aipn<Map<String, tza>> aipn, aipn<Set<tvr>> aipn2, List<String> list) {
        akcr.b(aipn, "allToolInjectors");
        akcr.b(aipn2, "alwaysInjectedEditsProvidersLazy");
        akcr.b(list, "editsLayerOrder");
        return new tzt(aipn, aipn2, list);
    }
}
