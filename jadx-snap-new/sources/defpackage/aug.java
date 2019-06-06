package defpackage;

/* renamed from: aug */
public final class aug {

    /* renamed from: aug$a */
    public static final class a {
        private final String a;
        private a b;
        private a c;
        private boolean d;

        /* renamed from: aug$a$a */
        static final class a {
            String a;
            Object b;
            a c;

            private a() {
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        private a(String str) {
            this.b = new a();
            this.c = this.b;
            this.d = false;
            this.a = (String) auh.a((Object) str);
        }

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        private a a() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public final a a(String str, int i) {
            return a(str, String.valueOf(i));
        }

        public final a a(String str, Object obj) {
            a a = a();
            a.b = obj;
            a.a = (String) auh.a((Object) str);
            return this;
        }

        public final a a(String str, boolean z) {
            return a(str, String.valueOf(z));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.a);
            stringBuilder.append('{');
            a aVar = this.b.c;
            String str = "";
            while (aVar != null) {
                stringBuilder.append(str);
                if (aVar.a != null) {
                    stringBuilder.append(aVar.a);
                    stringBuilder.append('=');
                }
                stringBuilder.append(aVar.b);
                aVar = aVar.c;
                str = ppy.d;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static a a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new a(replaceAll.substring(lastIndexOf + 1), (byte) 0);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
