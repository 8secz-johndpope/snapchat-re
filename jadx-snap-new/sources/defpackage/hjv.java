package defpackage;

/* renamed from: hjv */
public abstract class hjv {

    /* renamed from: hjv$c */
    public static final class c extends hjv {
        public final int a;

        public c(int i) {
            super();
            this.a = i;
        }
    }

    /* renamed from: hjv$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hjv$b */
    public static final class b extends hjv {
        public final String a;

        public b(String str) {
            akcr.b(str, "str");
            super();
            this.a = str;
        }
    }

    static {
        a aVar = new a();
    }

    private hjv() {
    }

    public /* synthetic */ hjv(byte b) {
        this();
    }

    public String toString() {
        StringBuilder stringBuilder;
        String valueOf;
        if (this instanceof c) {
            stringBuilder = new StringBuilder("StringResId~");
            valueOf = String.valueOf(((c) this).a);
        } else if (!(this instanceof b)) {
            return "";
        } else {
            stringBuilder = new StringBuilder("StringName~");
            valueOf = ((b) this).a;
        }
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
