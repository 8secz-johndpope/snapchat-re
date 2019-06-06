package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import java.util.Map;

/* renamed from: oir */
public final class oir implements aiqc<oiq> {
    private final ajwy<Map<acae, Supplier<adiv>>> a;
    private final ajwy<adhk> b;
    private final ajwy<Optional<adjm>> c;

    public static oiq a(Map<acae, Supplier<adiv>> map, adhk adhk, Optional<adjm> optional) {
        return new oiq(map, adhk, optional);
    }

    public final /* synthetic */ Object get() {
        return new oiq((Map) this.a.get(), (adhk) this.b.get(), (Optional) this.c.get());
    }
}
