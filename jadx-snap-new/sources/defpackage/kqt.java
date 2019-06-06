package defpackage;

import defpackage.kqe.ak;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kqt */
public final class kqt implements kqf {
    private final kql a;
    private final Map<String, List<akbw<kql, kqe, ajxw>>> b;

    /* renamed from: kqt$a */
    public static final class a {
        public final Map<String, List<akbw<kql, kqe, ajxw>>> a = new LinkedHashMap();
        public final kql b;

        public a(kql kql) {
            akcr.b(kql, "asyncTracer");
            this.b = kql;
        }

        public final void a(String str, akbw<? super kql, ? super kqe, ajxw> akbw) {
            akcr.b(str, "key");
            akcr.b(akbw, "traceFunction");
            if (!this.a.containsKey(str)) {
                this.a.put(str, new ArrayList());
            }
            List list = (List) this.a.get(str);
            if (list != null) {
                list.add(akbw);
            }
        }
    }

    /* renamed from: kqt$b */
    public static final class b {

        /* renamed from: kqt$b$a */
        public static final class a extends akcs implements akbw<kql, kqe, ajxw> {
            public a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_camera_tap_activation_to_real_carousel_items_visible");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$g */
        public static final class g extends akcs implements akbw<kql, kqe, ajxw> {
            public g() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                if ((((ak) kqe).b.isEmpty() ^ 1) != 0) {
                    kql.b("lens_camera_tap_activation_to_real_carousel_items_visible");
                }
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$b */
        public static final class b extends akcs implements akbw<kql, kqe, ajxw> {
            public b() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_camera_button_tap_activation_to_real_carousel_items_visible");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$h */
        public static final class h extends akcs implements akbw<kql, kqe, ajxw> {
            public h() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                if ((((ak) kqe).b.isEmpty() ^ 1) != 0) {
                    kql.b("lens_camera_button_tap_activation_to_real_carousel_items_visible");
                }
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$c */
        public static final class c extends akcs implements akbw<kql, kqe, ajxw> {
            public c() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_camera_carousel_close_button_tap_to_carousel_hidden");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$i */
        public static final class i extends akcs implements akbw<kql, kqe, ajxw> {
            public i() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.b("lens_camera_carousel_close_button_tap_to_carousel_hidden");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$d */
        public static final class d extends akcs implements akbw<kql, kqe, ajxw> {
            public d() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_camera_carousel_item_selected_to_lens_content_loaded");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$j */
        public static final class j extends akcs implements akbw<kql, kqe, ajxw> {
            public j() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.b("lens_camera_carousel_item_selected_to_lens_content_loaded");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$e */
        public static final class e extends akcs implements akbw<kql, kqe, ajxw> {
            public e() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_camera_content_loaded_to_lens_loaded");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$k */
        public static final class k extends akcs implements akbw<kql, kqe, ajxw> {
            public k() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.b("lens_camera_content_loaded_to_lens_loaded");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$f */
        public static final class f extends akcs implements akbw<kql, kqe, ajxw> {
            public f() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.a("lens_activation_to_selected");
                return ajxw.a;
            }
        }

        /* renamed from: kqt$b$l */
        public static final class l extends akcs implements akbw<kql, kqe, ajxw> {
            public l() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                kql kql = (kql) obj;
                kqe kqe = (kqe) obj2;
                akcr.b(kql, "tracer");
                akcr.b(kqe, "event");
                kql.b("lens_activation_to_selected");
                return ajxw.a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    private kqt(kql kql, Map<String, ? extends List<? extends akbw<? super kql, ? super kqe, ajxw>>> map) {
        this.a = kql;
        this.b = map;
    }

    public /* synthetic */ kqt(kql kql, Map map, byte b) {
        this(kql, map);
    }

    public final void a(kqe kqe) {
        akcr.b(kqe, "event");
        List<akbw> list = (List) this.b.get(kqe.getClass().getSimpleName());
        if (list != null) {
            for (akbw invoke : list) {
                invoke.invoke(this.a, kqe);
            }
        }
    }
}
