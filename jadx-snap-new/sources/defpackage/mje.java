package defpackage;

import java.util.EnumSet;

/* renamed from: mje */
public interface mje extends fth {

    /* renamed from: mje$a */
    public enum a {
        READ,
        WRITE;
        
        public static final a Companion = null;
        public static final EnumSet<a> READ_ONLY = null;
        public static final EnumSet<a> READ_WRITE = null;
        public static final EnumSet<a> WRITE_ONLY = null;

        /* renamed from: mje$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            Companion = new a();
            Object of = EnumSet.of(READ);
            akcr.a(of, "of(READ)");
            READ_ONLY = of;
            of = EnumSet.of(WRITE);
            akcr.a(of, "of(WRITE)");
            WRITE_ONLY = of;
            of = EnumSet.of(READ, WRITE);
            akcr.a(of, "of(READ, WRITE)");
            READ_WRITE = of;
        }
    }

    EnumSet<a> c();

    fth d();
}
