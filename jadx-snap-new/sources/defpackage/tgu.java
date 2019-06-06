package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tgu */
public final class tgu implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(tgt.PAYMENTS_SETTINGS_ENABLED, new hxo("payments_settings_enabled", hxr.FEATURE_SETTING));
            builder.put(tgt.SNAP_STORE_V2_ENABLED, new hxo("snap_store_v2_android_enabled", hxr.FEATURE_SETTING));
            builder.put(tgt.SNAP_STORE_TEST_STORE_ID, new hxo("snap_store_v2_test_store_id_2", hxr.FEATURE_SETTING));
            builder.put(tgt.SNAP_STORE_PROD_STORE_ID, new hxo("snap_store_v2_prod_store_id", hxr.FEATURE_SETTING));
            builder.put(tgt.BITMOJI_MERCH_IOS_ENABLED, new hxo("bitmoji_merch_ios_enabled", hxr.FEATURE_SETTING));
            builder.put(tgt.DISCOUNT_CODES_ENABLED, new hxo("discount_codes_enabled", hxr.FEATURE_SETTING));
            builder.put(tgt.COMMERCE_PIXEL_ENABLED, new hxo("native_commerce_pixel_enabled", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
