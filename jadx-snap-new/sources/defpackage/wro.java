package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Display;
import android.view.Surface;
import com.brightcove.player.event.Event;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: wro */
public final class wro implements wqz {
    MediaProjectionManager a;
    jwa b;
    Handler c;
    MediaProjection d;
    ImageReader e;
    VirtualDisplay f;
    int g;
    int h;
    WeakReference<Activity> i;
    ajdy<kaz<jwj>> j;
    ajei k;
    private int l;

    /* renamed from: wro$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: wro$b */
    final class b implements OnImageAvailableListener {
        private boolean a;

        public final void onImageAvailable(ImageReader imageReader) {
            String str = "planes[0]";
            akcr.b(imageReader, "reader");
            Image image = null;
            try {
                image = imageReader.acquireLatestImage();
                if (image != null) {
                    if (this.a) {
                        image.close();
                        return;
                    }
                    this.a = true;
                    Plane[] planes = image.getPlanes();
                    Object obj = planes[0];
                    akcr.a(obj, str);
                    ByteBuffer buffer = obj.getBuffer();
                    Object obj2 = planes[0];
                    akcr.a(obj2, str);
                    int pixelStride = obj2.getPixelStride();
                    Object obj3 = planes[0];
                    akcr.a(obj3, str);
                    obj3 = wro.a(wro.this).a(wro.this.g + ((obj3.getRowStride() - (wro.this.g * pixelStride)) / pixelStride), wro.this.h, Config.ARGB_8888, "SystemScreenshotTakerImpl");
                    akcr.a(obj3, "mBitmapFactory.createBit…                     TAG)");
                    Object a = obj3.a();
                    akcr.a(a, "bitmap.get()");
                    Object a2 = ((jwj) a).a();
                    akcr.a(a2, "bitmap.get().underlyingBitmap");
                    a2.copyPixelsFromBuffer(buffer);
                    ajei ajei = wro.this.k;
                    if (ajei == null) {
                        akcr.a("mCompositeDisposable");
                    }
                    ajei.a((ajej) obj3);
                    a = wro.a(wro.this).a(a2, 0, 0, wro.this.g, wro.this.h, "SystemScreenshotTakerImpl");
                    akcr.a(a, "mBitmapFactory.createBit…*/, mWidth, mHeight, TAG)");
                    obj3.dispose();
                    if (wro.b(wro.this).isDisposed()) {
                        a.dispose();
                    } else {
                        wro.b(wro.this).a(a);
                    }
                    wro.this.a();
                }
                if (image != null) {
                    image.close();
                }
            } catch (Exception unused) {
                if (image != null) {
                    image.close();
                }
            } catch (Throwable th) {
                if (image != null) {
                    image.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: wro$c */
    final class c extends Callback {

        /* renamed from: wro$c$a */
        static final class a implements Runnable {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                if (wro.this.f != null) {
                    VirtualDisplay virtualDisplay = wro.this.f;
                    if (virtualDisplay == null) {
                        akcr.a();
                    }
                    virtualDisplay.release();
                }
                if (wro.this.e != null) {
                    ImageReader imageReader = wro.this.e;
                    if (imageReader == null) {
                        akcr.a();
                    }
                    imageReader.setOnImageAvailableListener(null, null);
                }
                MediaProjection mediaProjection = wro.this.d;
                if (mediaProjection == null) {
                    akcr.a();
                }
                mediaProjection.unregisterCallback(this.a);
            }
        }

        public final void onStop() {
            Handler handler = wro.this.c;
            if (handler == null) {
                akcr.a("mHandler");
            }
            handler.post(new a(this));
        }
    }

    /* renamed from: wro$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ WeakReference a;

        d(WeakReference weakReference) {
            this.a = weakReference;
        }

        public final /* synthetic */ Object call() {
            Activity activity = (Activity) this.a.get();
            if (activity != null) {
                if (!(activity instanceof wqy)) {
                    activity = null;
                }
                wqy wqy = (wqy) activity;
                if (wqy != null) {
                    return wqy;
                }
                throw new IllegalArgumentException("Activity must be a SystemScreenShotSupportedActivity");
            }
            throw new IllegalStateException("Activity has been recycled");
        }
    }

    /* renamed from: wro$g */
    static final class g implements Runnable {
        private /* synthetic */ wro a;

        g(wro wro) {
            this.a = wro;
        }

        public final void run() {
            MediaProjection mediaProjection = this.a.d;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
        }
    }

    /* renamed from: wro$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ wro a;
        final /* synthetic */ WeakReference b;
        final /* synthetic */ jwa c;
        final /* synthetic */ ajei d;

        e(wro wro, WeakReference weakReference, jwa jwa, ajei ajei) {
            this.a = wro;
            this.b = weakReference;
            this.c = jwa;
            this.d = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final wqy wqy = (wqy) obj;
            akcr.b(wqy, "systemScreenShotSupportedActivity");
            return ajdx.a((ajea) new ajea<T>(this) {
                private /* synthetic */ e a;

                /* JADX WARNING: Removed duplicated region for block: B:23:? A:{SYNTHETIC, RETURN} */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
                public final void subscribe(defpackage.ajdy<defpackage.kaz<defpackage.jwj>> r6) {
                    /*
                    r5 = this;
                    r0 = "emitter";
                    defpackage.akcr.b(r6, r0);
                    r0 = r5.a;
                    r0 = r0.b;
                    r0 = r0.get();
                    r0 = (android.app.Activity) r0;
                    if (r0 == 0) goto L_0x0069;
                L_0x0011:
                    r1 = "activityRef.get() ?: thr…ivity has been recycled\")";
                    defpackage.akcr.a(r0, r1);
                    r1 = r5.a;
                    r1 = r1.a;
                    r2 = r5.a;
                    r2 = r2.c;
                    r3 = r5.a;
                    r3 = r3.d;
                    r4 = new android.os.Handler;
                    r4.<init>();
                    r1.c = r4;
                    r1.j = r6;
                    r1.b = r2;
                    r1.k = r3;
                    r6 = r1.a;
                    if (r6 != 0) goto L_0x0048;
                L_0x0033:
                    r6 = "media_projection";
                    r6 = r0.getSystemService(r6);
                    if (r6 == 0) goto L_0x0040;
                L_0x003b:
                    r6 = (android.media.projection.MediaProjectionManager) r6;
                    r1.a = r6;
                    goto L_0x0048;
                L_0x0040:
                    r6 = new ajxt;
                    r0 = "null cannot be cast to non-null type android.media.projection.MediaProjectionManager";
                    r6.<init>(r0);
                    throw r6;
                L_0x0048:
                    r6 = r1.i;
                    if (r6 != 0) goto L_0x0053;
                L_0x004c:
                    r6 = new java.lang.ref.WeakReference;
                    r6.<init>(r0);
                    r1.i = r6;
                L_0x0053:
                    r6 = r1.a;
                    if (r6 == 0) goto L_0x0060;
                L_0x0057:
                    r6 = r1.a;
                    if (r6 == 0) goto L_0x0060;
                L_0x005b:
                    r6 = r6.createScreenCaptureIntent();
                    goto L_0x0061;
                L_0x0060:
                    r6 = 0;
                L_0x0061:
                    if (r6 == 0) goto L_0x0068;
                L_0x0063:
                    r0 = r2;
                    r0.a(r6);
                L_0x0068:
                    return;
                L_0x0069:
                    r6 = new java.lang.IllegalStateException;
                    r0 = "Activity has been recycled";
                    r6.<init>(r0);
                    r6 = (java.lang.Throwable) r6;
                    throw r6;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wro$e$1.subscribe(ajdy):void");
                }
            });
        }
    }

    /* renamed from: wro$f */
    static final class f implements ajev {
        private /* synthetic */ wro a;

        f(wro wro) {
            this.a = wro;
        }

        public final void run() {
            this.a.a();
        }
    }

    static {
        a aVar = new a();
    }

    public static final /* synthetic */ jwa a(wro wro) {
        jwa jwa = wro.b;
        if (jwa == null) {
            akcr.a("mBitmapFactory");
        }
        return jwa;
    }

    public static final /* synthetic */ ajdy b(wro wro) {
        ajdy ajdy = wro.j;
        if (ajdy == null) {
            akcr.a("mEmitter");
        }
        return ajdy;
    }

    public final ajdx<kaz<jwj>> a(WeakReference<Activity> weakReference, jwa jwa, ajei ajei) {
        akcr.b(weakReference, "activityRef");
        akcr.b(jwa, "bitmapFactory");
        akcr.b(ajei, "compositeDisposable");
        Object c = ajdx.c((Callable) new d(weakReference)).a((ajfc) new e(this, weakReference, jwa, ajei)).c((ajev) new f(this));
        akcr.a(c, "Single.fromCallable<Syst…         stop()\n        }");
        return c;
    }

    public final void a() {
        Handler handler = this.c;
        if (handler == null) {
            akcr.a("mHandler");
        }
        handler.post(new g(this));
    }

    public final void a(Activity activity, int i, Intent intent) {
        akcr.b(activity, Event.ACTIVITY);
        if (intent != null) {
            MediaProjectionManager mediaProjectionManager = this.a;
            VirtualDisplay virtualDisplay = null;
            this.d = mediaProjectionManager != null ? mediaProjectionManager.getMediaProjection(i, intent) : null;
            Object resources = activity.getResources();
            String str = "activity.resources";
            akcr.a(resources, str);
            this.l = resources.getDisplayMetrics().densityDpi;
            resources = activity.getWindowManager();
            akcr.a(resources, "activity.windowManager");
            Display defaultDisplay = resources.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.g = point.x;
            this.h = point.y;
            if (this.d != null) {
                ImageReader imageReader;
                this.e = ImageReader.newInstance(this.g, this.h, 1, 2);
                MediaProjection mediaProjection = this.d;
                String str2 = "mHandler";
                if (mediaProjection != null) {
                    int i2 = this.g;
                    int i3 = this.h;
                    int i4 = this.l;
                    imageReader = this.e;
                    if (imageReader == null) {
                        akcr.a();
                    }
                    Surface surface = imageReader.getSurface();
                    Handler handler = this.c;
                    if (handler == null) {
                        akcr.a(str2);
                    }
                    virtualDisplay = mediaProjection.createVirtualDisplay("screencap", i2, i3, i4, 9, surface, null, handler);
                }
                this.f = virtualDisplay;
                imageReader = this.e;
                if (imageReader == null) {
                    akcr.a();
                }
                OnImageAvailableListener bVar = new b();
                Handler handler2 = this.c;
                if (handler2 == null) {
                    akcr.a(str2);
                }
                imageReader.setOnImageAvailableListener(bVar, handler2);
                MediaProjection mediaProjection2 = this.d;
                if (mediaProjection2 != null) {
                    Callback cVar = new c();
                    handler2 = this.c;
                    if (handler2 == null) {
                        akcr.a(str2);
                    }
                    mediaProjection2.registerCallback(cVar, handler2);
                }
                return;
            }
            ajdy ajdy = this.j;
            String str3 = "mEmitter";
            if (ajdy == null) {
                akcr.a(str3);
            }
            if (!ajdy.isDisposed()) {
                String str4 = "USER OPTED OUT";
                jwa jwa = this.b;
                if (jwa == null) {
                    akcr.a("mBitmapFactory");
                }
                Object a = jwa.a(this.g, this.h, "SystemScreenshotTakerImpl");
                akcr.a(a, "mBitmapFactory.createBitmap(mWidth, mHeight, TAG)");
                Object a2 = a.a();
                akcr.a(a2, "ref.get()");
                a2 = ((jwj) a2).a();
                akcr.a(a2, "ref.get().underlyingBitmap");
                Canvas canvas = new Canvas(a2);
                canvas.drawColor(-16777216);
                Paint paint = new Paint(1);
                Object resources2 = activity.getResources();
                akcr.a(resources2, str);
                float f = resources2.getDisplayMetrics().density;
                Rect rect = new Rect();
                paint.setColor(-1);
                paint.setTextSize((float) ((int) (f * 14.0f)));
                paint.getTextBounds(str4, 0, 14, rect);
                canvas.drawText(str4, (float) ((this.g - rect.width()) / 2), (float) ((this.h - rect.height()) / 2), paint);
                ajei ajei = this.k;
                if (ajei == null) {
                    akcr.a("mCompositeDisposable");
                }
                ajei.a((ajej) a);
                ajdy ajdy2 = this.j;
                if (ajdy2 == null) {
                    akcr.a(str3);
                }
                ajdy2.a(a);
            }
        }
    }
}
