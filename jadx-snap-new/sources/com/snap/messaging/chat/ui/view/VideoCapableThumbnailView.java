package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.snap.imageloading.view.SnapImageView;
import com.snap.opera.shared.view.TextureVideoViewExtended;
import com.snapchat.android.R;
import defpackage.abur;
import defpackage.abyh;
import defpackage.acaz;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.gcp;
import defpackage.gdy;
import defpackage.gey;
import defpackage.gfu;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.pql;
import defpackage.pvt;
import defpackage.qfd;
import defpackage.qhn;
import defpackage.qhq;
import defpackage.qhy;
import defpackage.zfw;

public final class VideoCapableThumbnailView extends qhn {
    final ajei a;
    public final View b;
    final abur<FrameLayout> c;
    final abur<FrameLayout> d;
    public boolean e;
    public boolean f;
    Uri g;
    b h;
    a i;
    gcp j;
    Boolean k;
    public ScaleType l;
    public boolean m;
    private final abur<ImageView> n;

    static final class a {
        final SnapImageView a;
        final SnapImageView b;

        public a(SnapImageView snapImageView, SnapImageView snapImageView2) {
            akcr.b(snapImageView, "imageView");
            this.a = snapImageView;
            this.b = snapImageView2;
        }
    }

    static final class b {
        final TextureVideoViewExtended a;
        final SnapImageView b;

        public b(TextureVideoViewExtended textureVideoViewExtended, SnapImageView snapImageView) {
            akcr.b(textureVideoViewExtended, "videoView");
            this.a = textureVideoViewExtended;
            this.b = snapImageView;
        }
    }

    static final class c implements OnLayoutChangeListener {
        private /* synthetic */ VideoCapableThumbnailView a;

        c(VideoCapableThumbnailView videoCapableThumbnailView) {
            this.a = videoCapableThumbnailView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            VideoCapableThumbnailView videoCapableThumbnailView = this.a;
            akcr.a((Object) view, "v");
            videoCapableThumbnailView.a(view);
        }
    }

    static final class d implements OnLayoutChangeListener {
        private /* synthetic */ VideoCapableThumbnailView a;

        d(VideoCapableThumbnailView videoCapableThumbnailView) {
            this.a = videoCapableThumbnailView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            VideoCapableThumbnailView videoCapableThumbnailView = this.a;
            akcr.a((Object) view, "v");
            videoCapableThumbnailView.a(view);
        }
    }

    static final class j implements OnLayoutChangeListener {
        private /* synthetic */ VideoCapableThumbnailView a;

        j(VideoCapableThumbnailView videoCapableThumbnailView) {
            this.a = videoCapableThumbnailView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            VideoCapableThumbnailView videoCapableThumbnailView = this.a;
            akcr.a((Object) view, "v");
            videoCapableThumbnailView.a(view);
        }
    }

    public static final class e implements defpackage.jxj.a {
        private /* synthetic */ VideoCapableThumbnailView a;
        private /* synthetic */ pvt b;
        private /* synthetic */ boolean c;
        private /* synthetic */ qhy d;

        e(VideoCapableThumbnailView videoCapableThumbnailView, pvt pvt, boolean z, qhy qhy) {
            this.a = videoCapableThumbnailView;
            this.b = pvt;
            this.c = z;
            this.d = qhy;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
            this.d.a(new gey(0, jwl.b));
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            this.d.a(this.b);
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ VideoCapableThumbnailView a;

        f(VideoCapableThumbnailView videoCapableThumbnailView) {
            this.a = videoCapableThumbnailView;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00ce in {9, 12, 15, 18, 21, 23, 25, 27} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r10) {
            /*
            r9 = this;
            r10 = (defpackage.gej) r10;
            r0 = "contentResult";
            defpackage.akcr.b(r10, r0);
            r0 = new iei;
            r1 = r10;
            r1 = (java.io.Closeable) r1;
            r0.<init>(r1);
            r0 = (defpackage.ajej) r0;
            r1 = r9.a;
            r1 = r1.a;
            defpackage.ajvv.a(r0, r1);
            r0 = r10.a();
            if (r0 == 0) goto L_0x00b4;
            r0 = r10.c();
            r0 = r0.size();
            if (r0 == 0) goto L_0x00aa;
            r10 = r10.c();
            r0 = "contentResult.assets";
            defpackage.akcr.a(r10, r0);
            r10 = (java.lang.Iterable) r10;
            r10 = r10.iterator();
            r0 = 0;
            r1 = r0;
            r2 = r1;
            r3 = r2;
            r4 = r10.hasNext();
            if (r4 == 0) goto L_0x009f;
            r4 = r10.next();
            r4 = (defpackage.gdt) r4;
            r5 = "descriptor";
            defpackage.akcr.a(r4, r5);
            r5 = r4.a();
            r6 = "descriptor.name";
            defpackage.akcr.a(r5, r6);
            r7 = 0;
            r8 = "media";
            r5 = defpackage.akgb.b(r5, r8, r7);
            if (r5 == 0) goto L_0x0063;
            r0 = r4.d();
            goto L_0x003b;
            r5 = r4.a();
            defpackage.akcr.a(r5, r6);
            r8 = "overlay";
            r5 = defpackage.akgb.b(r5, r8, r7);
            if (r5 == 0) goto L_0x0077;
            r1 = r4.d();
            goto L_0x003b;
            r5 = r4.a();
            defpackage.akcr.a(r5, r6);
            r8 = "video_first_frame";
            r5 = defpackage.akgb.b(r5, r8, r7);
            if (r5 == 0) goto L_0x008b;
            r2 = r4.d();
            goto L_0x003b;
            r5 = r4.a();
            defpackage.akcr.a(r5, r6);
            r6 = "metadata";
            r5 = defpackage.akgb.b(r5, r6, r7);
            if (r5 == 0) goto L_0x003b;
            r3 = r4.d();
            goto L_0x003b;
            r10 = new pvt;
            if (r0 != 0) goto L_0x00a6;
            defpackage.akcr.a();
            r10.<init>(r0, r1, r2, r3);
            return r10;
            r10 = new java.lang.IllegalStateException;
            r0 = "ContentResult must have at least one asset";
            r10.<init>(r0);
            r10 = (java.lang.Throwable) r10;
            throw r10;
            r0 = new java.lang.Exception;
            r1 = new java.lang.StringBuilder;
            r2 = "Failed to download media ";
            r1.<init>(r2);
            r10 = r10.e();
            r1.append(r10);
            r10 = r1.toString();
            r0.<init>(r10);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.ui.view.VideoCapableThumbnailView$f.apply(java.lang.Object):java.lang.Object");
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ VideoCapableThumbnailView a;

        g(VideoCapableThumbnailView videoCapableThumbnailView) {
            this.a = videoCapableThumbnailView;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a();
        }
    }

    static final class h<T> implements ajfb<pvt> {
        private /* synthetic */ VideoCapableThumbnailView a;
        private /* synthetic */ Uri b;
        private /* synthetic */ gcp c;
        private /* synthetic */ qhy d;

        h(VideoCapableThumbnailView videoCapableThumbnailView, Uri uri, gcp gcp, qhy qhy) {
            this.a = videoCapableThumbnailView;
            this.b = uri;
            this.c = gcp;
            this.d = qhy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (pvt) obj;
            if (akcr.a(this.a.g, this.b)) {
                boolean z = true;
                String str = "it";
                VideoCapableThumbnailView videoCapableThumbnailView;
                qhy qhy;
                FrameLayout frameLayout;
                SnapImageView snapImageView;
                Object a;
                Uri uri;
                if (!this.c.a() || VERSION.SDK_INT <= 19) {
                    videoCapableThumbnailView = this.a;
                    akcr.a(obj, str);
                    if (this.c != gcp.GIF) {
                        z = false;
                    }
                    qhy = this.d;
                    videoCapableThumbnailView.c();
                    if (videoCapableThumbnailView.i == null) {
                        frameLayout = (FrameLayout) videoCapableThumbnailView.d.a();
                        snapImageView = (SnapImageView) frameLayout.findViewById(R.id.chat_image_overlay);
                        SnapImageView snapImageView2 = (SnapImageView) frameLayout.findViewById(R.id.chat_image_media);
                        if (snapImageView2 == null) {
                            akcr.a();
                        }
                        videoCapableThumbnailView.i = new a(snapImageView2, snapImageView);
                        snapImageView2.addOnLayoutChangeListener(new c(videoCapableThumbnailView));
                        snapImageView.addOnLayoutChangeListener(new d(videoCapableThumbnailView));
                    }
                    a aVar = videoCapableThumbnailView.i;
                    if (aVar != null) {
                        ScaleType scaleType;
                        a = videoCapableThumbnailView.d.a();
                        akcr.a(a, "imagePlayerContainerLazy.get()");
                        ((FrameLayout) a).setVisibility(0);
                        uri = obj.b;
                        if (uri != null) {
                            videoCapableThumbnailView.a(uri, aVar.b);
                        }
                        aVar.a.setVisibility(0);
                        Object d = new defpackage.jxj.b.a().a((int) R.color.regular_grey).e(z).d(videoCapableThumbnailView.m);
                        akcr.a(d, "ViewBitmapLoader.Request…lar(requestCircularImage)");
                        if (videoCapableThumbnailView.getLayoutParams().height <= 0 || videoCapableThumbnailView.getLayoutParams().width <= 0) {
                            scaleType = ScaleType.CENTER_CROP;
                        } else {
                            scaleType = ScaleType.FIT_CENTER;
                            akcr.a(d.a(videoCapableThumbnailView.getLayoutParams().width, videoCapableThumbnailView.getLayoutParams().height), "request.setSizeHint(layo…dth, layoutParams.height)");
                        }
                        SnapImageView snapImageView3 = aVar.a;
                        ScaleType scaleType2 = videoCapableThumbnailView.l;
                        if (scaleType2 != null) {
                            scaleType = scaleType2;
                        }
                        snapImageView3.setScaleType(scaleType);
                        snapImageView = aVar.a;
                        d = d.b();
                        akcr.a(d, "request.build()");
                        snapImageView.setRequestOptions(d);
                        aVar.a.setRequestListener(new e(videoCapableThumbnailView, obj, z, qhy));
                        aVar.a.setImageUri(obj.a, pql.b);
                        videoCapableThumbnailView.a((View) aVar.a);
                    }
                } else {
                    videoCapableThumbnailView = this.a;
                    akcr.a(obj, str);
                    qhy = this.d;
                    videoCapableThumbnailView.b();
                    if (videoCapableThumbnailView.h == null) {
                        frameLayout = (FrameLayout) videoCapableThumbnailView.c.a();
                        snapImageView = (SnapImageView) frameLayout.findViewById(R.id.chat_video_overlay);
                        CroppingTextureVideoView croppingTextureVideoView = (CroppingTextureVideoView) frameLayout.findViewById(R.id.chat_video_media);
                        if (croppingTextureVideoView == null) {
                            akcr.a();
                        }
                        videoCapableThumbnailView.h = new b(croppingTextureVideoView, snapImageView);
                        snapImageView.addOnLayoutChangeListener(new j(videoCapableThumbnailView));
                    }
                    b bVar = videoCapableThumbnailView.h;
                    if (bVar != null) {
                        a = videoCapableThumbnailView.c.a();
                        akcr.a(a, "videoPlayerContainerLazy.get()");
                        ((FrameLayout) a).setVisibility(0);
                        uri = obj.b;
                        if (uri != null) {
                            videoCapableThumbnailView.a(uri, bVar.b);
                        }
                        TextureVideoViewExtended textureVideoViewExtended = bVar.a;
                        textureVideoViewExtended.setVisibility(0);
                        textureVideoViewExtended.a(true);
                        textureVideoViewExtended.a((defpackage.acaz.f) new k(textureVideoViewExtended, videoCapableThumbnailView, obj, qhy));
                        textureVideoViewExtended.a((defpackage.acaz.c) new l(videoCapableThumbnailView, obj, qhy));
                        textureVideoViewExtended.a(obj.a);
                        videoCapableThumbnailView.a((View) textureVideoViewExtended);
                    }
                }
            }
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k implements defpackage.acaz.f {
        private /* synthetic */ TextureVideoViewExtended a;
        private /* synthetic */ VideoCapableThumbnailView b;
        private /* synthetic */ pvt c;
        private /* synthetic */ qhy d;

        k(TextureVideoViewExtended textureVideoViewExtended, VideoCapableThumbnailView videoCapableThumbnailView, pvt pvt, qhy qhy) {
            this.a = textureVideoViewExtended;
            this.b = videoCapableThumbnailView;
            this.c = pvt;
            this.d = qhy;
        }

        public final void onPrepared(acaz acaz) {
            akcr.a((Object) acaz, "mediaPlayer");
            if (!acaz.i()) {
                acaz.a();
            }
            this.a.d(true);
            this.a.a(true);
            this.a.seekTo(0);
            this.d.a(this.c);
        }
    }

    static final class l implements defpackage.acaz.c {
        private /* synthetic */ VideoCapableThumbnailView a;
        private /* synthetic */ pvt b;
        private /* synthetic */ qhy c;

        l(VideoCapableThumbnailView videoCapableThumbnailView, pvt pvt, qhy qhy) {
            this.a = videoCapableThumbnailView;
            this.b = pvt;
            this.c = qhy;
        }

        public final boolean a(acaz acaz, abyh abyh) {
            this.c.a(null);
            return true;
        }
    }

    static final class m extends akcq implements akbl<ImageView, ajxw> {
        m(VideoCapableThumbnailView videoCapableThumbnailView) {
            super(1, videoCapableThumbnailView);
        }

        public final String getName() {
            return "setSpectaclesMask";
        }

        public final akej getOwner() {
            return akde.a(VideoCapableThumbnailView.class);
        }

        public final String getSignature() {
            return "setSpectaclesMask(Landroid/widget/ImageView;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            ImageView imageView = (ImageView) obj;
            akcr.b(imageView, "p1");
            VideoCapableThumbnailView videoCapableThumbnailView = (VideoCapableThumbnailView) this.receiver;
            if (videoCapableThumbnailView.k != null) {
                gcp gcp = videoCapableThumbnailView.j;
                if (gcp != null && gcp.isSpectacles && videoCapableThumbnailView.e) {
                    i = (akcr.a(videoCapableThumbnailView.k, Boolean.TRUE) && videoCapableThumbnailView.f) ? R.drawable.chat_laguna_video_mask_saved : R.drawable.chat_laguna_video_mask_default;
                    imageView.setBackgroundResource(i);
                    i = 0;
                    imageView.setVisibility(i);
                    return ajxw.a;
                }
            }
            i = 4;
            imageView.setVisibility(i);
            return ajxw.a;
        }
    }

    public VideoCapableThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private VideoCapableThumbnailView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = new ajei();
        this.e = true;
        this.f = true;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            systemService = ((LayoutInflater) systemService).inflate(R.layout.chat_media_video_capable_thumbnail, this, false);
            akcr.a(systemService, "inflater.inflate(R.layou…false /* attachToRoot */)");
            this.b = systemService;
            addView(this.b);
            this.c = new abur(this.b, (int) R.id.chat_video_media_stub, (int) R.id.chat_video_container);
            this.n = new abur(this.b, (int) R.id.chat_spectacles_mask_stub, (int) R.id.chat_spectacles_mask);
            this.d = new abur(this.b, (int) R.id.chat_image_media_stub, (int) R.id.chat_image_container);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    private final void a(float f) {
        SnapImageView snapImageView;
        TextureVideoViewExtended textureVideoViewExtended;
        a aVar = this.i;
        if (aVar != null) {
            snapImageView = aVar.a;
            if (snapImageView != null) {
                snapImageView.setScaleX(f);
            }
        }
        aVar = this.i;
        if (aVar != null) {
            snapImageView = aVar.a;
            if (snapImageView != null) {
                snapImageView.setScaleY(f);
            }
        }
        aVar = this.i;
        if (aVar != null) {
            snapImageView = aVar.b;
            if (snapImageView != null) {
                snapImageView.setScaleX(f);
            }
        }
        aVar = this.i;
        if (aVar != null) {
            snapImageView = aVar.b;
            if (snapImageView != null) {
                snapImageView.setScaleY(f);
            }
        }
        b bVar = this.h;
        if (bVar != null) {
            textureVideoViewExtended = bVar.a;
            if (textureVideoViewExtended != null) {
                textureVideoViewExtended.setScaleX(f);
            }
        }
        bVar = this.h;
        if (bVar != null) {
            textureVideoViewExtended = bVar.a;
            if (textureVideoViewExtended != null) {
                textureVideoViewExtended.setScaleY(f);
            }
        }
        bVar = this.h;
        if (bVar != null) {
            snapImageView = bVar.b;
            if (snapImageView != null) {
                snapImageView.setScaleX(f);
            }
        }
        bVar = this.h;
        if (bVar != null) {
            snapImageView = bVar.b;
            if (snapImageView != null) {
                snapImageView.setScaleY(f);
            }
        }
    }

    public final void a() {
        this.g = null;
        this.j = null;
        this.k = null;
        a(1.0f);
        this.n.a(4);
        b();
        c();
        this.a.a();
    }

    /* Access modifiers changed, original: final */
    public final void a(Uri uri, SnapImageView snapImageView) {
        ScaleType scaleType;
        if (snapImageView != null) {
            snapImageView.setVisibility(0);
        }
        defpackage.jxj.b.a aVar = new defpackage.jxj.b.a();
        if (getLayoutParams().height <= 0 || getLayoutParams().width <= 0) {
            scaleType = ScaleType.CENTER_CROP;
        } else {
            scaleType = ScaleType.FIT_CENTER;
            akcr.a(aVar.a(getLayoutParams().width, getLayoutParams().height), "request.setSizeHint(layo…dth, layoutParams.height)");
        }
        if (snapImageView != null) {
            snapImageView.setScaleType(scaleType);
        }
        if (snapImageView != null) {
            Object f = aVar.b();
            akcr.a(f, "request.build()");
            snapImageView.setRequestOptions(f);
        }
        if (snapImageView != null) {
            snapImageView.setImageUri(uri, pql.b);
        }
    }

    public final void a(Uri uri, gcp gcp, boolean z, qfd qfd, qhy qhy) {
        akcr.b(uri, "chatMediaUri");
        akcr.b(gcp, "snapType");
        akcr.b(qfd, "bindingContext");
        akcr.b(qhy, "mediaLoadingListener");
        this.g = uri;
        this.j = gcp;
        this.k = Boolean.valueOf(z);
        gfu gfu = qfd.f;
        zfw zfw = qfd.e;
        if (!gcp.isSpectacles) {
            a(1.0f);
            this.n.a(4);
        } else if (this.e) {
            this.n.a((defpackage.abur.a) new qhq(new m(this)));
            this.n.a();
        } else {
            a aVar = this.i;
            if (aVar != null) {
                a((View) aVar.a);
            }
        }
        ajej a = gfu.a(uri, pql.a.d.b, false, new gdy[0]).b((ajdw) zfw.g()).a((ajdw) zfw.f()).f(new f(this)).a((ajdw) zfw.l()).d((ajfb) new g(this)).a((ajfb) new h(this, uri, gcp, qhy), (ajfb) i.a);
        akcr.a((Object) a, "contentResolver.resolve(… $it\")\n                })");
        ajvv.a(a, this.a);
    }

    /* Access modifiers changed, original: final */
    public final void a(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (!(width == 0 || height == 0)) {
            gcp gcp = this.j;
            if (gcp != null) {
                if (this.e || gcp == null || !gcp.isSpectacles) {
                    a(1.0f);
                } else {
                    double d = (double) width;
                    Double.isNaN(d);
                    double d2 = d / 2.0d;
                    double d3 = (double) height;
                    Double.isNaN(d3);
                    double d4 = d3 * 0.25d;
                    Double.isNaN(d3);
                    d4 *= d3;
                    Double.isNaN(d);
                    double d5 = 0.25d * d;
                    Double.isNaN(d);
                    a((float) (Math.sqrt(d4 + (d5 * d)) / d2));
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        a aVar = this.i;
        if (aVar != null) {
            Object a = this.d.a();
            akcr.a(a, "imagePlayerContainerLazy.get()");
            ((FrameLayout) a).setVisibility(8);
            aVar.a.clear();
            aVar.a.setVisibility(8);
            SnapImageView snapImageView = aVar.b;
            if (snapImageView != null) {
                snapImageView.clear();
            }
            SnapImageView snapImageView2 = aVar.b;
            if (snapImageView2 != null) {
                snapImageView2.setVisibility(8);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        b bVar = this.h;
        if (bVar != null) {
            Object a = this.c.a();
            akcr.a(a, "videoPlayerContainerLazy.get()");
            ((FrameLayout) a).setVisibility(8);
            bVar.a.a(null);
            bVar.a.a(null);
            bVar.a.H_();
            SnapImageView snapImageView = bVar.b;
            if (snapImageView != null) {
                snapImageView.clear();
            }
            SnapImageView snapImageView2 = bVar.b;
            if (snapImageView2 != null) {
                snapImageView2.setVisibility(8);
            }
        }
    }
}
