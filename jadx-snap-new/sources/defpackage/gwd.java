package defpackage;

import com.snap.core.db.column.FeatureType;
import java.util.List;
import java.util.Map;

/* renamed from: gwd */
public interface gwd {
    long a(long j, FeatureType featureType, boolean z);

    ajcx a(gyt gyt, FeatureType featureType);

    ajdp<List<gwi>> a(long j, FeatureType featureType);

    ajdp<List<gwl>> a(long j, FeatureType featureType, int i);

    ajdx<Long> a(String str, FeatureType featureType);

    ajdx<List<gwu>> a(List<String> list, FeatureType featureType);

    ajdx<List<gwu>> a(Map<String, ? extends List<gwo>> map, FeatureType featureType);

    long b(String str, FeatureType featureType);

    String b(long j, FeatureType featureType, boolean z);

    List<gwt> b(long j, FeatureType featureType);

    ajdx<gwq> c(long j, FeatureType featureType);

    ajdx<gwv> d(long j, FeatureType featureType);
}
