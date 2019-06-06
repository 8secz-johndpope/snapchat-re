package defpackage;

import defpackage.fth.a;

/* renamed from: rqu */
public enum rqu implements fth {
    SEND_TYPING_PRESENCE_TWEAK(a.a(b.SERVER)),
    PRESENCE_TRANSPORT_TWEAK(a.a(a.CHAT)),
    IS_LOCK_SCREEN_EXPERIENCE_ENABLED(a.a(false)),
    SEND_TYPING_PRESENCE(a.a("all"));
    
    private final a<?> delegate;

    /* renamed from: rqu$b */
    public enum b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b ALL = null;
        public static final b OFF = null;
        public static final b ONE_ON_ONE = null;
        public static final b SERVER = null;

        static {
            SERVER = new b("SERVER", 0);
            ALL = new b("ALL", 1);
            ONE_ON_ONE = new b("ONE_ON_ONE", 2);
            OFF = new b("OFF", 3);
            $VALUES = new b[]{SERVER, ALL, ONE_ON_ONE, OFF};
        }

        private b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: rqu$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a ARROYO = null;
        public static final a CHAT = null;

        static {
            CHAT = new a("CHAT", 0);
            ARROYO = new a("ARROYO", 1);
            $VALUES = new a[]{CHAT, ARROYO};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private rqu(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.TALK;
    }
}
