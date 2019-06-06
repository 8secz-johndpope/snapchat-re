package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.Window;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.jcodec.containers.mp4.boxes.Box;
import org.opencv.imgproc.Imgproc;

/* renamed from: iii */
public final class iii {
    public a a;
    final Activity b;
    private final ajxe c = ajxh.a(new f(this));

    /* renamed from: iii$a */
    public static final class a {

        /* renamed from: iii$a$a */
        public static final class a {
            final c a;
            public final d b;
            final b c;

            public /* synthetic */ a() {
                this(c.TRANSLUCENT, d.TRANSLUCENT, b.BEHIND_SYSTEM_UI);
            }

            public a(c cVar, d dVar, b bVar) {
                akcr.b(cVar, "navigationBarMode");
                akcr.b(dVar, "statusBarMode");
                akcr.b(bVar, "layoutMode");
                this.a = cVar;
                this.b = dVar;
                this.c = bVar;
            }

            /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0029;
            L_0x0002:
                r0 = r3 instanceof defpackage.iii.a.a;
                if (r0 == 0) goto L_0x0027;
            L_0x0006:
                r3 = (defpackage.iii.a.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x001c:
                r0 = r2.c;
                r3 = r3.c;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x0027;
            L_0x0026:
                goto L_0x0029;
            L_0x0027:
                r3 = 0;
                return r3;
            L_0x0029:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iii$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                c cVar = this.a;
                int i = 0;
                int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
                d dVar = this.b;
                hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
                b bVar = this.c;
                if (bVar != null) {
                    i = bVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Spec(navigationBarMode=");
                stringBuilder.append(this.a);
                stringBuilder.append(", statusBarMode=");
                stringBuilder.append(this.b);
                stringBuilder.append(", layoutMode=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iii$f */
    static final class f extends akcs implements akbk<e> {
        private /* synthetic */ iii a;

        f(iii iii) {
            this.a = iii;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new e(this.a.b);
        }
    }

    /* renamed from: iii$b */
    public enum b {
        BELOW_SYSTEM_UI,
        BEHIND_SYSTEM_UI,
        FULLSCREEN
    }

    /* renamed from: iii$c */
    public enum c {
        TRANSLUCENT,
        SOLID,
        GONE
    }

    /* renamed from: iii$d */
    public enum d {
        TRANSLUCENT,
        SOLID,
        GONE
    }

    /* renamed from: iii$e */
    static final class e {
        final Activity a;
        private final ajxe b = ajxh.a(new b(this));
        private final ajxe c = ajxh.a(new a(this));

        /* renamed from: iii$e$a */
        static final class a extends akcs implements akbk<View> {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object window = this.a.a.getWindow();
                akcr.a(window, "activity.window");
                return window.getDecorView();
            }
        }

        /* renamed from: iii$e$b */
        static final class b extends akcs implements akbk<Window> {
            private /* synthetic */ e a;

            b(e eVar) {
                this.a = eVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return this.a.a.getWindow();
            }
        }

        static {
            aken[] akenArr = new aken[]{new akdc(akde.a(e.class), "window", "getWindow()Landroid/view/Window;"), new akdc(akde.a(e.class), "decorView", "getDecorView()Landroid/view/View;")};
        }

        public e(Activity activity) {
            akcr.b(activity, Event.ACTIVITY);
            this.a = activity;
        }

        /* Access modifiers changed, original: final */
        public final Window a() {
            return (Window) this.b.b();
        }

        /* Access modifiers changed, original: final */
        public final View b() {
            return (View) this.c.b();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(iii.class), "windowConfigurationUpdaterImpl", "getWindowConfigurationUpdaterImpl()Lcom/snap/framework/util/WindowConfiguration$WindowConfigurationImpl;");
        a aVar = new a();
    }

    public iii(Activity activity) {
        akcr.b(activity, Event.ACTIVITY);
        this.b = activity;
    }

    public final void a(a aVar, boolean z) {
        akcr.b(aVar, "spec");
        if (!akcr.a(this.a, (Object) aVar) || z) {
            Object b;
            Object b2;
            this.a = aVar;
            e eVar = (e) this.c.b();
            akcr.b(aVar, "newSpec");
            d dVar = aVar.b;
            int i = iij.a[dVar.ordinal()];
            String str = "decorView";
            Object b3;
            if (i == 1) {
                b = eVar.b();
                akcr.a(b, str);
                b3 = eVar.b();
                akcr.a(b3, str);
                b.setSystemUiVisibility(b3.getSystemUiVisibility() | 4);
                eVar.a().clearFlags(ItemAnimator.FLAG_MOVED);
            } else if (i == 2 || i == 3) {
                eVar.a().clearFlags(Imgproc.INTER_TAB_SIZE2);
                b3 = eVar.b();
                akcr.a(b3, str);
                b3.setSystemUiVisibility(eVar.b().getSystemUiVisibility() & -5);
                b3 = eVar.b();
                akcr.a(b3, str);
                i = (b3.getSystemUiVisibility() & -513) & -3;
                b2 = eVar.b();
                akcr.a(b2, str);
                b2.setSystemUiVisibility(i);
                if (dVar == d.TRANSLUCENT) {
                    eVar.a().addFlags(67108864);
                } else {
                    eVar.a().clearFlags(67108864);
                }
            }
            c cVar = aVar.a;
            if (cVar != null) {
                int i2 = iij.b[cVar.ordinal()];
                if (i2 == 1) {
                    b = eVar.b();
                    akcr.a(b, str);
                    b.setSystemUiVisibility(6);
                } else if (i2 == 2) {
                    b = eVar.b();
                    akcr.a(b, str);
                    b2 = eVar.b();
                    akcr.a(b2, str);
                    b.setSystemUiVisibility(b2.getSystemUiVisibility() & -3);
                    eVar.a().clearFlags(Box.MAX_BOX_SIZE);
                } else if (i2 == 3) {
                    b = eVar.b();
                    akcr.a(b, str);
                    b2 = eVar.b();
                    akcr.a(b2, str);
                    b.setSystemUiVisibility(b2.getSystemUiVisibility() & -3);
                    eVar.a().addFlags(Box.MAX_BOX_SIZE);
                }
            }
            int i3 = iij.c[aVar.c.ordinal()];
            Object b4;
            Object b5;
            if (i3 == 1) {
                b4 = eVar.b();
                akcr.a(b4, str);
                i3 = b4.getSystemUiVisibility() & -1025;
                eVar.a().clearFlags(RasterSource.DEFAULT_TILE_SIZE);
                i3 &= -4097;
                b5 = eVar.b();
                akcr.a(b5, str);
                b5.setSystemUiVisibility(i3);
            } else if (i3 == 2) {
                b4 = eVar.b();
                akcr.a(b4, str);
                i3 = b4.getSystemUiVisibility() | 4096;
                b5 = eVar.b();
                akcr.a(b5, str);
                b5.setSystemUiVisibility(i3);
            } else if (i3 == 3) {
                b4 = eVar.b();
                akcr.a(b4, str);
                i3 = ((b4.getSystemUiVisibility() & -1025) & -513) & -3;
                eVar.a().clearFlags(67108864);
                eVar.a().clearFlags(Box.MAX_BOX_SIZE);
                b = eVar.b();
                akcr.a(b, str);
                b.setSystemUiVisibility(i3);
                eVar.a().clearFlags(1536);
                eVar.a().addFlags(ItemAnimator.FLAG_MOVED);
            } else {
                throw new ajxk();
            }
        }
    }
}
