package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: ajbc */
public abstract class ajbc {

    /* renamed from: ajbc$b */
    public static abstract class b extends ajbc {
        b() {
            super();
        }

        public static b a(String str, String str2, String str3) {
            boolean z = ajaz.a(str) && str.length() <= 255;
            Preconditions.checkArgument(z, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new ajbb(str, str2, str3);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();
    }

    /* renamed from: ajbc$a */
    public static abstract class a extends ajbc {
        a() {
            super();
        }

        public static a a(String str, String str2, String str3) {
            boolean z = ajaz.a(str) && str.length() <= 255;
            Preconditions.checkArgument(z, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new ajba(str, str2, str3);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();
    }

    private ajbc() {
    }

    /* synthetic */ ajbc(byte b) {
        this();
    }
}
