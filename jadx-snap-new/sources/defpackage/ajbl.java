package defpackage;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: ajbl */
final class ajbl {

    /* renamed from: ajbl$e */
    static final class e extends ajbr {
        static final ajbr a = new e();

        private e() {
        }

        public final ajbn a() {
            return a.a;
        }

        public final ajbo a(ajbn ajbn) {
            Preconditions.checkNotNull(ajbn, "tags");
            return c.a;
        }

        public final ajbn b() {
            return a.a;
        }
    }

    /* renamed from: ajbl$b */
    static final class b extends ajbu {
        static final ajbu a = new b();
        private static byte[] b = new byte[0];

        private b() {
        }

        public final ajbn a(byte[] bArr) {
            Preconditions.checkNotNull(bArr, "bytes");
            return a.a;
        }

        public final byte[] a(ajbn ajbn) {
            Preconditions.checkNotNull(ajbn, "tags");
            return b;
        }
    }

    /* renamed from: ajbl$c */
    static final class c extends ajbo {
        static final ajbo a = new c();

        private c() {
        }

        public final ajbn a() {
            return a.a;
        }

        public final ajbo a(ajbp ajbp, ajbq ajbq) {
            Preconditions.checkNotNull(ajbp, "key");
            Preconditions.checkNotNull(ajbq, "value");
            return this;
        }
    }

    /* renamed from: ajbl$f */
    static final class f extends ajbt {
        private f() {
        }

        /* synthetic */ f(byte b) {
            this();
        }

        public final ajbr a() {
            return e.a;
        }

        public final ajbx b() {
            return d.a;
        }
    }

    /* renamed from: ajbl$d */
    static final class d extends ajbx {
        static final ajbx a = new d();

        private d() {
        }

        public final ajbu a() {
            return b.a;
        }
    }

    /* renamed from: ajbl$a */
    static final class a extends ajbn {
        static final ajbn a = new a();

        private a() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Iterator<ajbm> a() {
            return Collections.emptySet().iterator();
        }
    }
}
