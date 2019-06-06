package defpackage;

import java.io.Serializable;

/* renamed from: ajuu */
public enum ajuu {
    ;

    /* renamed from: ajuu$b */
    public static final class b implements Serializable {
        public final Throwable a;

        b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return ajfv.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotificationLite.Error[");
            stringBuilder.append(this.a);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ajuu$a */
    public static final class a implements Serializable {
        final ajej a;

        public a(ajej ajej) {
            this.a = ajej;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotificationLite.Disposable[");
            stringBuilder.append(this.a);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ajuu$c */
    public static final class c implements Serializable {
        final akuy a;

        public c(akuy akuy) {
            this.a = akuy;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotificationLite.Subscription[");
            stringBuilder.append(this.a);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    private ajuu(String str) {
    }

    public static Object a(Throwable th) {
        return new b(th);
    }

    public static boolean a(Object obj) {
        return obj == COMPLETE;
    }

    public static <T> boolean a(Object obj, ajdv<? super T> ajdv) {
        if (obj == COMPLETE) {
            ajdv.a();
            return true;
        } else if (obj instanceof b) {
            ajdv.a(((b) obj).a);
            return true;
        } else {
            ajdv.a(obj);
            return false;
        }
    }

    public static <T> boolean a(Object obj, akux<? super T> akux) {
        if (obj == COMPLETE) {
            akux.a();
            return true;
        } else if (obj instanceof b) {
            akux.a(((b) obj).a);
            return true;
        } else {
            akux.a(obj);
            return false;
        }
    }

    public static <T> boolean b(Object obj, ajdv<? super T> ajdv) {
        if (obj == COMPLETE) {
            ajdv.a();
            return true;
        } else if (obj instanceof b) {
            ajdv.a(((b) obj).a);
            return true;
        } else if (obj instanceof a) {
            ajdv.a(((a) obj).a);
            return false;
        } else {
            ajdv.a(obj);
            return false;
        }
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }
}
