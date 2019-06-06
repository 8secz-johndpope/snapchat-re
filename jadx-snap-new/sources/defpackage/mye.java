package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.looksery.sdk.InstrumentationDelegatesFactory;
import com.looksery.sdk.Logger;
import com.looksery.sdk.exception.LookserySdkException;
import com.looksery.sdk.listener.LookseryNativeExceptionListener;
import com.looksery.sdk.listener.ProfilerEventListener;
import defpackage.myq.a;

/* renamed from: mye */
public final class mye {

    /* renamed from: mye$a */
    static final class a<T> implements Supplier<adiv> {
        private /* synthetic */ Context a;
        private /* synthetic */ aipn b;
        private /* synthetic */ gqr c;

        /* renamed from: mye$a$1 */
        static final class 1<T> implements Supplier<adiv> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object get() {
                return new adii();
            }
        }

        a(Context context, aipn aipn, gqr gqr) {
            this.a = context;
            this.b = aipn;
            this.c = gqr;
        }

        public final /* synthetic */ Object get() {
            return new myp(new myq(this.a, (defpackage.myq.a) this.b.get(), this.c), 1.a);
        }
    }

    /* renamed from: mye$b */
    public static final class b implements a {

        /* renamed from: mye$b$a */
        static final class a implements LookseryNativeExceptionListener {
            public static final a a = new a();

            a() {
            }

            public final void onExceptionInNativeCode(LookserySdkException lookserySdkException) {
            }
        }

        /* renamed from: mye$b$b */
        public static final class b implements InstrumentationDelegatesFactory {

            /* renamed from: mye$b$b$a */
            static final class a implements Logger {
                public static final a a = new a();

                a() {
                }

                public final void printMessage(int i, String str) {
                }
            }

            /* renamed from: mye$b$b$b */
            public static final class b implements ProfilerEventListener {
                b() {
                }

                public final void onBeginSection(String str) {
                    zgp.a(str);
                }

                public final void onEndSection() {
                    zgp.a();
                }
            }

            b() {
            }

            public final Logger newLogger() {
                return a.a;
            }

            public final /* synthetic */ ProfilerEventListener newProfilerEventListener() {
                return new b();
            }
        }

        b() {
        }

        public final LookseryNativeExceptionListener a() {
            return a.a;
        }

        public final /* synthetic */ InstrumentationDelegatesFactory b() {
            return new b();
        }
    }
}
