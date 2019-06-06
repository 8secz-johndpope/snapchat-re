package defpackage;

/* renamed from: ajjz */
public final class ajjz {

    /* renamed from: ajjz$a */
    public enum a implements ajfb<akuy> {
        ;

        private a(String str) {
        }
    }

    /* renamed from: ajjz$d */
    public static final class d<T> implements ajfb<T> {
        private akux<T> a;

        public d(akux<T> akux) {
            this.a = akux;
        }

        public final void accept(T t) {
            this.a.a((Object) t);
        }
    }

    /* renamed from: ajjz$c */
    public static final class c<T> implements ajfb<Throwable> {
        private akux<T> a;

        public c(akux<T> akux) {
            this.a = akux;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((Throwable) obj);
        }
    }

    /* renamed from: ajjz$b */
    public static final class b<T> implements ajev {
        private akux<T> a;

        public b(akux<T> akux) {
            this.a = akux;
        }

        public final void run() {
            this.a.a();
        }
    }
}
