package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: mjh */
public interface mjh {

    /* renamed from: mjh$a */
    public static abstract class a {
        final float a;
        final boolean b;

        /* renamed from: mjh$a$b */
        public static abstract class b extends a {

            /* renamed from: mjh$a$b$a */
            public static final class a extends b {
                public static final a c = new a();

                private a() {
                    super(false, (byte) 0);
                }
            }

            /* renamed from: mjh$a$b$b */
            public static final class b extends b {
                public static final b c = new b();

                private b() {
                    super(true, (byte) 0);
                }
            }

            private b(boolean z) {
                super(1.0f, z, (byte) 0);
            }

            public /* synthetic */ b(boolean z, byte b) {
                this(z);
            }
        }

        /* renamed from: mjh$a$a */
        public static abstract class a extends a {

            /* renamed from: mjh$a$a$a */
            public static final class a extends a {
                public static final a c = new a();

                private a() {
                    super(false, (byte) 0);
                }
            }

            /* renamed from: mjh$a$a$b */
            public static final class b extends a {
                public static final b c = new b();

                private b() {
                    super(true, (byte) 0);
                }
            }

            private a(boolean z) {
                super(MapboxConstants.MINIMUM_ZOOM, z, (byte) 0);
            }

            public /* synthetic */ a(boolean z, byte b) {
                this(z);
            }
        }

        private a(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        public /* synthetic */ a(float f, boolean z, byte b) {
            this(f, z);
        }
    }

    mid<Object, ajxw> a();

    mid<a, ajxw> b();
}
