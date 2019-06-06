package defpackage;

import com.snap.core.db.column.FeatureType;
import com.snap.discover.playback.db.durableJob.PlaybackSnapsCleanupJob;
import defpackage.hwm.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: gyw */
public final class gyw implements hwm<PlaybackSnapsCleanupJob, Boolean> {
    final Map<PlaybackSnapsCleanupJob, ajej> a = new LinkedHashMap();
    private final gwb b;
    private final gwd c;
    private final gwc d;
    private final tmu e;
    private final ihh f;
    private final Map<FeatureType, gyv> g;

    /* renamed from: gyw$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ gyw a;
        private /* synthetic */ PlaybackSnapsCleanupJob b;

        a(gyw gyw, PlaybackSnapsCleanupJob playbackSnapsCleanupJob) {
            this.a = gyw;
            this.b = playbackSnapsCleanupJob;
        }

        public final /* synthetic */ Object call() {
            ajej ajej = (ajej) this.a.a.get(this.b);
            if (ajej == null) {
                return null;
            }
            ajej.dispose();
            return ajxw.a;
        }
    }

    public gyw(gwb gwb, gwd gwd, gwc gwc, tmu tmu, ihh ihh, Map<FeatureType, gyv> map) {
        akcr.b(gwb, "storySnapRepo");
        akcr.b(gwd, "publisherSnapRepo");
        akcr.b(gwc, "promotedStorySnapRepository");
        akcr.b(tmu, "playStateRepo");
        akcr.b(ihh, "clock");
        akcr.b(map, "jobMap");
        this.b = gwb;
        this.c = gwd;
        this.d = gwc;
        this.e = tmu;
        this.f = ihh;
        this.g = map;
    }

    public final void a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final void a(String str, Integer num) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final boolean a(Throwable th) {
        String str = "throwable";
        akcr.b(th, str);
        akcr.b(th, str);
        return false;
    }

    public final /* synthetic */ void b(hwg hwg) {
        PlaybackSnapsCleanupJob playbackSnapsCleanupJob = (PlaybackSnapsCleanupJob) hwg;
        akcr.b(playbackSnapsCleanupJob, "durableJob");
        ajej ajej = (ajej) this.a.get(playbackSnapsCleanupJob);
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        PlaybackSnapsCleanupJob playbackSnapsCleanupJob = (PlaybackSnapsCleanupJob) hwg;
        akcr.b(playbackSnapsCleanupJob, "durableJob");
        Object b = ajcx.b((Callable) new a(this, playbackSnapsCleanupJob));
        akcr.a(b, "Completable.fromCallable…ableJob]?.dispose()\n    }");
        return b;
    }

    public final ide c() {
        return gvz.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        PlaybackSnapsCleanupJob playbackSnapsCleanupJob = (PlaybackSnapsCleanupJob) hwg;
        String str = "durableJob";
        akcr.b(playbackSnapsCleanupJob, str);
        akcr.b(playbackSnapsCleanupJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        PlaybackSnapsCleanupJob playbackSnapsCleanupJob = (PlaybackSnapsCleanupJob) hwg;
        akcr.b(playbackSnapsCleanupJob, "durableJob");
        return a.b(playbackSnapsCleanupJob);
    }
}
