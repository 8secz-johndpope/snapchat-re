package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.fth.a;

/* renamed from: ima */
public enum ima implements fth {
    GRAPHENE_HOST(a.a("https://us-central1-gcp.api.snapchat.com/")),
    COMPACT_INTERVAL_SECONDS(a.a(5)),
    COMPACT_DEBOUNCE_INTERVAL(a.a(1)),
    FLUSH_DEBOUNCE_INTERVAL(a.a(5)),
    BUFFER_SIZE_BYTES(a.a(3000000)),
    RESEVOIR_SIZE(a.a(64)),
    LOG_METRICS_FRAME(a.a(false)),
    FLUSH_INTERVAL_SECONDS(a.a(60)),
    MAX_RETRY_QUEUE_SIZE(a.a((int) MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)),
    GRAPHENE_CUSTOM_FLUSHING_ENABLED(a.a(false)),
    GRAPHENE_CUSTOM_FLUSHING_CONTINUE_BACKGROUND_ENABLED(a.a(false)),
    BACKGROUND_FLUSH_INTERVAL_SECONDS(a.a(300));
    
    private final a<?> delegate;

    private ima(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.GRAPHENE;
    }
}
