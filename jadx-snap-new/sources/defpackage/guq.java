package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: guq */
public final class guq implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "DDML_TRAINING_MUSHROOM";
            builder.put(gup.ENABLE_DDML_TRAINING, new hxh(str, "enable_training", true));
            builder.put(gup.ENABLE_DDML_DATA_GENERATION, new hxh("DDML_SAMPLE1_MUSHROOM", "enable_generate", true));
            builder.put(gup.DDML_DATA_RENTENTION, new hxh(str, "data_retention", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
