package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.tpl.b.f;

/* renamed from: tqy */
abstract class tqy {
    private static a a = new a();

    /* renamed from: tqy$a */
    public static final class a {

        /* renamed from: tqy$a$a */
        public static final class a implements tpw {
            private final String a = "EnterPreviewAnimation";
            private /* synthetic */ a b;
            private /* synthetic */ boolean c;
            private /* synthetic */ tpl d;
            private /* synthetic */ ViewStub e;

            /* renamed from: tqy$a$a$a */
            static final class a implements ajev {
                private /* synthetic */ View a;

                /* renamed from: tqy$a$a$a$a */
                static final class a implements Runnable {
                    private /* synthetic */ View a;

                    a(View view) {
                        this.a = view;
                    }

                    public final void run() {
                        this.a.setVisibility(8);
                    }
                }

                a(View view) {
                    this.a = view;
                }

                public final void run() {
                    View view = this.a;
                    view.animate().cancel();
                    view.setAlpha(1.0f);
                    view.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(200).withEndAction(new a(view));
                }
            }

            a(a aVar, boolean z, tpl tpl, ViewStub viewStub) {
                this.b = aVar;
                this.c = z;
                this.d = tpl;
                this.e = viewStub;
            }

            public final String a() {
                return this.a;
            }

            public final ajej start() {
                Object a;
                if (this.c && tpt.c(this.d) && (this.d.b instanceof f)) {
                    View inflate = this.e.inflate();
                    inflate.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                    inflate.setVisibility(0);
                    inflate.setBackgroundColor(-16777216);
                    inflate.animate().alpha(1.0f).setDuration(30);
                    a = ajek.a((ajev) new a(inflate));
                } else {
                    a = ajfq.INSTANCE;
                }
                akcr.a(a, "if (enabled && isImage(p…d()\n                    }");
                return a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final tpw a(ViewStub viewStub, tpl tpl, boolean z) {
        a aVar = a;
        akcr.b(viewStub, "viewStub");
        akcr.b(tpl, "previewStartUpConfig");
        return new a(aVar, z, tpl, viewStub);
    }
}
