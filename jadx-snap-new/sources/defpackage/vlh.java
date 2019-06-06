package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: vlh */
public final class vlh implements ofm {
    final ajxe a;
    final ajxe b;
    final ajxe c;

    /* renamed from: vlh$a */
    static final class a extends akcs implements akbk<vmr> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vmr) this.a.get();
        }
    }

    /* renamed from: vlh$f */
    static final class f extends akcs implements akbk<vmu> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vmu) this.a.get();
        }
    }

    /* renamed from: vlh$b */
    static final class b extends akcs implements akbk<vms> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vms) this.a.get();
        }
    }

    /* renamed from: vlh$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ vlh a;
        private /* synthetic */ ofl b;

        c(vlh vlh, ofl ofl) {
            this.a = vlh;
            this.b = ofl;
        }

        public final /* synthetic */ Object call() {
            this.a.c.b();
            akcr.b(this.b, "request");
            return ofk.VIDEO;
        }
    }

    /* renamed from: vlh$d */
    static final class d<T> implements ajfb<ajej> {
        private /* synthetic */ ofl a;

        d(ofl ofl) {
            this.a = ofl;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: vlh$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vlh a;
        private /* synthetic */ ofl b;

        e(vlh vlh, ofl ofl) {
            this.a = vlh;
            this.b = ofl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ofk ofk = (ofk) obj;
            akcr.b(ofk, "transcodingMediaType");
            return ofk == ofk.VIDEO ? ((vmu) this.a.b.b()).b(this.b) : ((vmr) this.a.a.b()).b(this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(vlh.class), "imageProcessPipeline", "getImageProcessPipeline()Lcom/snap/rendering/transcoding/internal/pipeline/ImageProcessPipeline;"), new akdc(akde.a(vlh.class), "videoProcessPipeline", "getVideoProcessPipeline()Lcom/snap/rendering/transcoding/internal/pipeline/VideoProcessPipeline;"), new akdc(akde.a(vlh.class), "mediaPipelineSelector", "getMediaPipelineSelector()Lcom/snap/rendering/transcoding/internal/pipeline/MediaPipelineSelector;")};
    }

    public vlh(ajwy<vmr> ajwy, ajwy<vmu> ajwy2, ajwy<vms> ajwy3) {
        akcr.b(ajwy, "imageProcessPipelineProvider");
        akcr.b(ajwy2, "videoProcessPipelineProvider");
        akcr.b(ajwy3, "mediaPipelineSelectorProvider");
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new f(ajwy2));
        this.c = ajxh.a(new b(ajwy3));
    }

    public final ajdx<List<abyi>> a(ofl ofl) {
        akcr.b(ofl, "request");
        Object a = ajdx.c((Callable) new c(this, ofl)).b((ajfb) new d(ofl)).a((ajfc) new e(this, ofl));
        akcr.a(a, "Single.fromCallable { me…      }\n                }");
        return a;
    }
}
