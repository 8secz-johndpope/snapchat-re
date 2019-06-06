package defpackage;

import com.snap.core.db.column.FeatureType;
import java.util.List;
import java.util.Map;

/* renamed from: gwb */
public interface gwb {
    ajcx a(FeatureType featureType);

    ajcx a(gyt gyt, FeatureType featureType);

    ajdp<List<gwg>> a(long j, FeatureType featureType, gxc gxc);

    ajdp<List<gwk>> a(long j, FeatureType featureType, gxc gxc, int i);

    ajdx<gww> a(long j, FeatureType featureType);

    ajdx<Long> a(String str, FeatureType featureType);

    ajdx<List<gwu>> a(List<String> list, FeatureType featureType);

    ajdx<List<gwu>> a(Map<String, ? extends List<gwe>> map, FeatureType featureType);

    long b(long j, FeatureType featureType);

    long b(String str, FeatureType featureType);

    String c(long j, FeatureType featureType);
}
