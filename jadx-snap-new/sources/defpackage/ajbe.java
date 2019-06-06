package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: ajbe */
final class ajbe {

    /* renamed from: ajbe$a */
    static final class a extends ajbd {
        static final ajbd a = new a();

        private a() {
        }

        public final ajbd a() {
            return this;
        }

        public final void a(ajbn ajbn) {
            Preconditions.checkNotNull(ajbn, "tags");
        }

        public final ajbd b() {
            return this;
        }
    }

    /* renamed from: ajbe$b */
    static final class b extends ajbg {
        private final ajbi a;

        private b() {
            this.a = new d();
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final ajbh a() {
            return c.a;
        }
    }

    /* renamed from: ajbe$d */
    static final class d extends ajbi {
        private final Map<Object, Object> a;

        static {
            ajav ajav = new ajav();
        }

        private d() {
            this.a = Maps.newHashMap();
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    /* renamed from: ajbe$c */
    static final class c extends ajbh {
        static final ajbh a = new c();

        private c() {
        }

        public final ajbd a() {
            return a.a;
        }
    }
}
