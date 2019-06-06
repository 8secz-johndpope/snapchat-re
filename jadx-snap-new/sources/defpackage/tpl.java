package defpackage;

import android.os.Bundle;

/* renamed from: tpl */
public final class tpl {
    public final ebp a;
    public final b b;

    /* renamed from: tpl$b */
    public static abstract class b {

        /* renamed from: tpl$b$f */
        public static final class f extends b {
            public f() {
                super();
            }

            public final tod a() {
                return tod.MAIN;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.MAIN.name());
            }
        }

        /* renamed from: tpl$b$e */
        public static final class e extends b {
            public e() {
                super();
            }

            public final tod a() {
                return tod.GALLERY;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.GALLERY.name());
            }
        }

        /* renamed from: tpl$b$a */
        public static final class a extends b {
            public a() {
                super();
            }

            public final tod a() {
                return tod.CHAT_GALLERY;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.CHAT_GALLERY.name());
            }
        }

        /* renamed from: tpl$b$c */
        public static final class c extends b {
            public c() {
                super();
            }

            public final tod a() {
                return tod.EXT_SHARE;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.EXT_SHARE.name());
            }
        }

        /* renamed from: tpl$b$b */
        public static final class b extends b {
            public b() {
                super();
            }

            public final tod a() {
                return tod.DISCOVER;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.DISCOVER.name());
            }
        }

        /* renamed from: tpl$b$d */
        public static final class d extends b {
            public d() {
                super();
            }

            public final tod a() {
                return tod.FEED;
            }

            public final void a(Bundle bundle) {
                akcr.b(bundle, "bundle");
                bundle.putString("PREVIEW_FLAVOR", tod.FEED.name());
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public abstract tod a();

        public abstract void a(Bundle bundle);
    }

    /* renamed from: tpl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static tpl a(ebp ebp, tod tod) {
            c fVar;
            akcr.b(ebp, "mediaTypeConfig");
            akcr.b(tod, "previewFlavor");
            switch (tpm.a[tod.ordinal()]) {
                case 1:
                    fVar = new f();
                    break;
                case 2:
                    fVar = new d();
                    break;
                case 3:
                    fVar = new e();
                    break;
                case 4:
                    fVar = new b();
                    break;
                case 5:
                    fVar = new a();
                    break;
                case 6:
                    fVar = new c();
                    break;
                default:
                    throw new IllegalArgumentException("unexpected preview flavor ".concat(String.valueOf(tod)));
            }
            return new tpl(ebp, fVar);
        }
    }

    static {
        a aVar = new a();
    }

    public tpl(ebp ebp, b bVar) {
        akcr.b(ebp, "mediaTypeConfig");
        akcr.b(bVar, "previewFlavorConfig");
        this.a = ebp;
        this.b = bVar;
    }
}
