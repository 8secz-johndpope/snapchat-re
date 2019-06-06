package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pn */
public final class pn {
    public final Set<a> a = new HashSet();

    /* renamed from: pn$a */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.a.equals(aVar.a);
            }
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((pn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
