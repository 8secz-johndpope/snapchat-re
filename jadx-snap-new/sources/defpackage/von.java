package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: von */
public final class von implements vjr {
    private static ajxe b = ajxh.a(b.a);
    private final HashSet<abtl> a = new HashSet();

    /* renamed from: von$b */
    static final class b extends akcs implements akbk<ImmutableMap<String, List<? extends abtl>>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object builder = ImmutableMap.builder();
            akcr.a(builder, "ImmutableMap.builder()");
            String[] strArr = new String[]{"XT1080", "XT1056", "XT1058", "XT1052", "XT1053", "XT1055", "XT1050", "XT1060"};
            for (int i = 0; i < 8; i++) {
                builder.put(strArr[i], ImmutableList.of(new abtl(640, 360), new abtl(1280, 720)));
            }
            builder.put("Nexus 4", ImmutableList.of(new abtl(1280, 720), new abtl(480, 320), new abtl(1920, 1080)));
            return builder.build();
        }
    }

    /* renamed from: von$a */
    public static final class a {
        static {
            new aken[1][0] = new akdc(akde.a(a.class), "disableResolutionMap", "getDisableResolutionMap()Ljava/util/Map;");
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final Set<abtl> a() {
        return this.a;
    }

    public final void a(List<? extends abtl> list, List<? extends abtl> list2) {
        akcr.b(list, "previewResolutions");
        akcr.b(list2, "recordResolutions");
        if (this.a.isEmpty()) {
            this.a.addAll(list);
        } else {
            this.a.addAll(list2);
        }
        Set set = this.a;
        akcr.b(set, "resolutions");
        List list3 = (List) ((Map) b.b()).get(Build.MODEL);
        if (list3 != null) {
            set.removeAll(list3);
        }
    }
}
