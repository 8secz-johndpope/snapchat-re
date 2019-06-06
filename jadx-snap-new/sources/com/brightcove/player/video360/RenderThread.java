package com.brightcove.player.video360;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import com.brightcove.player.video360.RotationMonitor.Listener;
import com.brightcove.player.view.RenderView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;

@TargetApi(17)
public class RenderThread extends HandlerThread {
    public static final float FOVY = 70.0f;
    public static final int MSG_FRAME_AVAILABLE = 4;
    public static final int MSG_ON_SCROLL = 6;
    public static final int MSG_SET_POSITION = 7;
    public static final int MSG_SURFACE_AVAILABLE = 1;
    public static final int MSG_SURFACE_CHANGED = 2;
    public static final int MSG_SURFACE_DESTROYED = 3;
    public static final int MSG_VSYNC = 5;
    public static final float Z_FAR = 1000.0f;
    public static final float Z_NEAR = 1.0f;
    static final String a = "RenderThread";
    final FrameCallback b = new a(this, (byte) 0);
    final GlRenderTarget c;
    final float[] d = new float[16];
    final float[] e = new float[16];
    final float[] f = new float[16];
    final float[] g = new float[16];
    final float[] h = new float[3];
    Handler i;
    SurfaceTexture j;
    int k = -1;
    float l;
    float m = 90.0f;
    boolean n;
    boolean o;
    SphericalSceneRenderer p;
    final GestureDetector q;
    OnFrameAvailableListener r;
    private final WeakReference<RenderView> s;
    private final RotationMonitor t;
    private final SimpleOnGestureListener u = new SimpleOnGestureListener() {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int round = Math.round(f);
            int round2 = Math.round(f2);
            Log.v(RenderThread.a, String.format("Scroll Detected: distanceX[%d] distanceY[%d]", new Object[]{Integer.valueOf(round), Integer.valueOf(round2)}));
            RenderThread renderThread = RenderThread.this;
            float f3 = (float) round;
            float f4 = (float) round2;
            Message obtain = Message.obtain();
            obtain.what = 6;
            obtain.obj = new PointF((-f3) * 0.1f, (-f4) * 0.1f);
            renderThread.i.sendMessage(obtain);
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            RenderView a = RenderThread.this.a();
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent instanceof View) {
                    ((View) parent).onTouchEvent(motionEvent);
                }
            }
            return super.onSingleTapUp(motionEvent);
        }
    };
    private final OnTouchListener v = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return RenderThread.this.q.onTouchEvent(motionEvent);
        }
    };
    private final OnAttachStateChangeListener w = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
            RenderThread.this.a(view);
        }

        public final void onViewDetachedFromWindow(View view) {
            RenderThread.this.b(view);
        }
    };

    class a implements FrameCallback {
        private a() {
        }

        /* synthetic */ a(RenderThread renderThread, byte b) {
            this();
        }

        public final void doFrame(long j) {
            RenderThread.this.i.sendEmptyMessage(5);
        }
    }

    public RenderThread(RenderView renderView) {
        super("360RenderThread");
        this.s = new WeakReference(renderView);
        this.c = new GlRenderTarget();
        Context context = renderView.getContext();
        this.q = new GestureDetector(context, this.u);
        this.t = new RotationMonitor(context);
        this.t.setListener(new Listener() {
            public final void onChanged(int i, float f, float f2, float f3, float f4, float f5, float f6) {
                if (Math.sqrt((double) (f5 * f5)) < 1.0d) {
                    RenderThread renderThread = RenderThread.this;
                    Message obtain = Message.obtain();
                    obtain.what = 6;
                    obtain.obj = new PointF(-f4, f6);
                    renderThread.i.sendMessage(obtain);
                }
            }

            public final void onDetected(int i, float f, float f2, float f3) {
                String str = RenderThread.a;
                r1 = new Object[4];
                int i2 = 1;
                r1[1] = Float.valueOf(f);
                r1[2] = Float.valueOf(f2);
                r1[3] = Float.valueOf(f3);
                Log.v(str, String.format("Initial position: orientation[%d], azimuth[%f] pitch[%f] roll[%f]", r1));
                f3 = f3 < MapboxConstants.MINIMUM_ZOOM ? f3 + 90.0f : 90.0f - f3;
                if (!(i == 1 || i == 3)) {
                    i2 = 0;
                }
                RenderThread renderThread = RenderThread.this;
                if (i2 != 0) {
                    f3 = -f3;
                }
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = new PointF(90.0f, f3);
                renderThread.i.sendMessage(obtain);
            }
        });
        if (renderView instanceof View) {
            ((View) renderView).addOnAttachStateChangeListener(this.w);
        }
    }

    private View b() {
        RenderView a = a();
        return a instanceof View ? (View) a : null;
    }

    /* Access modifiers changed, original: final */
    public final RenderView a() {
        return (RenderView) this.s.get();
    }

    /* Access modifiers changed, original: final */
    public final void a(View view) {
        this.t.startTracking();
        if (view == null) {
            view = b();
        }
        if (view instanceof View) {
            view.setOnTouchListener(this.v);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(View view) {
        this.t.stopTracking();
        if (view == null) {
            view = b();
        }
        if (view instanceof View) {
            view.setOnTouchListener(null);
        }
    }

    public Surface getVideoDecodeSurface() {
        if (this.c.hasValidContext()) {
            this.k = GlUtil.generateExternalTexture();
            this.j = new SurfaceTexture(this.k);
            this.j.setOnFrameAvailableListener(new OnFrameAvailableListener() {
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    RenderThread.this.i.sendEmptyMessage(4);
                }
            });
            return new Surface(this.j);
        }
        throw new IllegalStateException("Cannot get video decode surface without GL context");
    }

    public boolean isVrMode() {
        return this.p.isVrMode();
    }

    public void notifySurfaceAvailable(Object obj, int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i;
        obtain.arg2 = i2;
        this.i.sendMessage(obtain);
    }

    public void notifySurfaceChanged(Surface surface, int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = surface;
        obtain.arg1 = i;
        obtain.arg2 = i2;
        this.i.sendMessage(obtain);
    }

    public void notifySurfaceDestroyed() {
        this.i.sendEmptyMessage(3);
    }

    public void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener) {
        this.r = onFrameAvailableListener;
    }

    public void setVrMode(boolean z) {
        this.p.setVrMode(z);
    }

    public synchronized void start() {
        super.start();
        a(null);
        this.i = new Handler(getLooper()) {
            public final void handleMessage(Message message) {
                Message message2 = message;
                String str = "glViewport";
                String str2 = " h: ";
                String str3 = "360RenderThread";
                RenderThread renderThread;
                Object obj;
                int i;
                RenderThread renderThread2;
                PointF pointF;
                switch (message2.what) {
                    case 1:
                        renderThread = RenderThread.this;
                        obj = message2.obj;
                        int i2 = message2.arg1;
                        i = message2.arg2;
                        StringBuilder stringBuilder = new StringBuilder("onSurfaceAvailable w: ");
                        stringBuilder.append(i2);
                        stringBuilder.append(str2);
                        stringBuilder.append(i);
                        Log.d(str3, stringBuilder.toString());
                        RenderView a = renderThread.a();
                        if (!(a == null || renderThread.c.hasValidSurface())) {
                            renderThread.c.createRenderSurface(obj);
                            Choreographer.getInstance().postFrameCallback(renderThread.b);
                            GLES20.glViewport(0, 0, i2, i);
                            GlUtil.checkGlError(str);
                            Matrix.perspectiveM(renderThread.g, 0, 70.0f, ((float) i2) / ((float) i), 1.0f, 1000.0f);
                            Matrix.setIdentityM(renderThread.f, 0);
                            Matrix.setRotateM(renderThread.e, 0, 90.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
                            GLES20.glClearColor(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
                            renderThread.p = new SphericalSceneRenderer(a.getContext());
                            a.setSurface(renderThread.getVideoDecodeSurface());
                            if (!(renderThread.r == null || renderThread.j == null)) {
                                renderThread.r.onFrameAvailable(renderThread.j);
                                break;
                            }
                        }
                    case 2:
                        renderThread = RenderThread.this;
                        obj = message2.obj;
                        int i3 = message2.arg1;
                        i = message2.arg2;
                        StringBuilder stringBuilder2 = new StringBuilder("onSurfaceChanged w: ");
                        stringBuilder2.append(i3);
                        stringBuilder2.append(str2);
                        stringBuilder2.append(i);
                        Log.d(str3, stringBuilder2.toString());
                        GLES20.glViewport(0, 0, i3, i);
                        GlUtil.checkGlError(str);
                        Matrix.perspectiveM(renderThread.g, 0, 70.0f, ((float) i3) / ((float) i), 1.0f, 1000.0f);
                        return;
                    case 3:
                        renderThread2 = RenderThread.this;
                        renderThread2.b(null);
                        RenderView a2 = renderThread2.a();
                        if (a2 != null) {
                            a2.release();
                        }
                        if (renderThread2.k != -1) {
                            GLES20.glDeleteTextures(1, new int[]{renderThread2.k}, 0);
                            renderThread2.k = -1;
                        }
                        if (renderThread2.j != null) {
                            renderThread2.j.release();
                            renderThread2.j = null;
                            renderThread2.n = false;
                        }
                        renderThread2.o = false;
                        renderThread2.c.release();
                        renderThread2.p.release();
                        return;
                    case 4:
                        RenderThread.this.n = true;
                        return;
                    case 5:
                        renderThread2 = RenderThread.this;
                        if (renderThread2.c.hasValidContext()) {
                            Choreographer.getInstance().postFrameCallback(renderThread2.b);
                            if (renderThread2.c.hasValidContext() && (renderThread2.n || renderThread2.o)) {
                                renderThread2.c.makeCurrent();
                                renderThread2.j.updateTexImage();
                                renderThread2.j.getTransformMatrix(renderThread2.d);
                                renderThread2.l = Math.max(-89.0f, Math.min(89.0f, renderThread2.l));
                                double toRadians = (double) ((float) Math.toRadians((double) (90.0f - renderThread2.l)));
                                double toRadians2 = (double) ((float) Math.toRadians((double) renderThread2.m));
                                renderThread2.h[0] = (float) ((Math.sin(toRadians) * 100.0d) * Math.cos(toRadians2));
                                renderThread2.h[1] = (float) (Math.cos(toRadians) * 100.0d);
                                renderThread2.h[2] = (float) ((Math.sin(toRadians) * 100.0d) * Math.sin(toRadians2));
                                Matrix.setLookAtM(renderThread2.f, 0, renderThread2.h[0], renderThread2.h[1], renderThread2.h[2], MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM);
                                renderThread2.p.onDrawFrame(renderThread2.k, renderThread2.d, renderThread2.e, renderThread2.f, renderThread2.g);
                                renderThread2.c.swapBuffers();
                                if (renderThread2.n) {
                                    renderThread2.n = false;
                                }
                                if (renderThread2.o) {
                                    renderThread2.o = false;
                                }
                            }
                        }
                        return;
                    case 6:
                        renderThread = RenderThread.this;
                        pointF = (PointF) message2.obj;
                        renderThread.m += pointF.x;
                        renderThread.l += pointF.y;
                        renderThread.o = true;
                        return;
                    case 7:
                        renderThread = RenderThread.this;
                        pointF = (PointF) message2.obj;
                        Log.v(RenderThread.a, String.format("Setting camera position:azimuth[%f] roll[%f]", new Object[]{Float.valueOf(pointF.x), Float.valueOf(pointF.y)}));
                        renderThread.m = pointF.x;
                        renderThread.l = pointF.y;
                        renderThread.o = true;
                        break;
                }
            }
        };
    }
}
