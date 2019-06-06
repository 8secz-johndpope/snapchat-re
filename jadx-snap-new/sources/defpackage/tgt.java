package defpackage;

import defpackage.fth.a;

/* renamed from: tgt */
public enum tgt implements fth {
    COMMERCE_SESSION_ID(a.a(r1)),
    PRODUCT_INFO_CARD_BOUNCE(a.a(false)),
    STORE_BITMOJI_MERCH_TOAST_SHOWN(a.a(false)),
    ENABLE_PAYMENTS_CUSTOM_ENDPOINT(a.a(false)),
    OUT_OF_US(a.a(false)),
    ENABLE_SNAP_STORE_V2_SETTINGS_TWEAK(a.a(tgv.SERVER)),
    DEV_SNAP_STORE_SETTINGS(a.a(false)),
    MARCO_POLO_FORCE_PAYMENT_SETTINGS(a.a(false)),
    ENABLE_DISCOUNT_CODES_SETTINGS_TWEAK(a.a(tgv.SERVER)),
    ENABLE_PIXEL_EVENTS_TWEAK(a.a(tgv.SERVER)),
    PAYMENTS_SETTINGS_ENABLED(a.a(false)),
    SNAP_STORE_V2_ENABLED(a.a(false)),
    SNAP_STORE_TEST_STORE_ID(a.a(r1)),
    SNAP_STORE_PROD_STORE_ID(a.a(r1)),
    BITMOJI_MERCH_IOS_ENABLED(a.a(false)),
    DISCOUNT_CODES_ENABLED(a.a(false)),
    COMMERCE_PIXEL_ENABLED(a.a(false));
    
    private final a<?> delegate;

    private tgt(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.PAYMENTS;
    }
}
