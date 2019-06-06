package defpackage;

import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acks */
public final class acks {

    /* renamed from: acks$a */
    public static final class a {

        /* renamed from: acks$a$a */
        static final class a implements Runnable {
            private /* synthetic */ int a;
            private /* synthetic */ long b;
            private /* synthetic */ acki c;

            a(int i, long j, acki acki) {
                this.a = i;
                this.b = j;
                this.c = acki;
            }

            public final void run() {
                acki acki = this.c;
                if (acki != null) {
                    acki.b();
                }
            }
        }

        /* renamed from: acks$a$b */
        static final class b implements Runnable {
            private /* synthetic */ int a;
            private /* synthetic */ long b;
            private /* synthetic */ acki c;

            b(int i, long j, acki acki) {
                this.a = i;
                this.b = j;
                this.c = acki;
            }

            public final void run() {
                acki acki = this.c;
                if (acki != null) {
                    acki.c();
                }
            }
        }

        /* renamed from: acks$a$c */
        static final class c implements Runnable {
            private /* synthetic */ View a;
            private /* synthetic */ int b;
            private /* synthetic */ long c;
            private /* synthetic */ acki d;

            c(View view, int i, long j, acki acki) {
                this.a = view;
                this.b = i;
                this.c = j;
                this.d = acki;
            }

            public final void run() {
                this.a.setVisibility(this.b);
                acki acki = this.d;
                if (acki != null) {
                    acki.a();
                }
                acki = this.d;
                if (acki != null) {
                    acki.c();
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static void a(View view, int i, long j, acki acki) {
            if (view != null) {
                int visibility = view.getVisibility();
                if (visibility != i) {
                    if ((visibility == 4 || visibility == 8) && i == 0) {
                        view.setVisibility(0);
                        view.animate().alpha(1.0f).setDuration(250).withLayer().withStartAction(new a(i, 250, acki)).withEndAction(new b(i, 250, acki));
                        return;
                    }
                    if (visibility == 0 && (i == 4 || i == 8)) {
                        view.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(250).withLayer().withEndAction(new c(view, i, 250, acki));
                    }
                } else if (acki != null) {
                    acki.c();
                }
            }
        }
    }

    static {
        a aVar = new a();
    }
}
