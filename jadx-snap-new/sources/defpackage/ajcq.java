package defpackage;

import defpackage.ajck.a;
import defpackage.ajcs.b;
import java.util.Map;

/* renamed from: ajcq */
final class ajcq extends b {
    private final Map<Object, Integer> a;
    private final Map<a, Integer> b;

    ajcq(Map<Object, Integer> map, Map<a, Integer> map2) {
        if (map != null) {
            this.a = map;
            if (map2 != null) {
                this.b = map2;
                return;
            }
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }

    public final Map<Object, Integer> a() {
        return this.a;
    }

    public final Map<a, Integer> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PerSpanNameSummary{numbersOfLatencySampledSpans=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numbersOfErrorSampledSpans=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
