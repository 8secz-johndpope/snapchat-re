package com.snap.cognac.network;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.aldj;
import defpackage.aldk;
import defpackage.aldm;
import defpackage.aldn;
import defpackage.aldo;
import defpackage.aldp;
import defpackage.aldq;
import defpackage.aldr;
import defpackage.alds;
import defpackage.aldt;

public interface TokenShopHttpInterface {
    public static final String ACCEPT_APPLICATION_PROTOBUF_HEADER = "Accept: application/protobuf";
    public static final String CATALOG_BASE_URL = "https://cobra.snap-dev.net";
    public static final String CONSUME_PURCHASE_OPERATION_HEADER = "x-operation: TokenPurchaseService:ConsumePurchase";
    public static final String CONTENT_TYPE_HEADER = "Content-Type: application/protobuf";
    public static final String GET_ALL_ITEMS_OPERATION_HEADER = "x-operation: CatalogService:GetAllItems";
    public static final String GET_ITEMS_OPERATION_HEADER = "x-operation: CatalogService:GetItems";
    public static final String GET_TOKEN_BALANCE_OPERATION_HEADER = "x-operation: TokenPurchaseService:GetTokenBalance";
    public static final String GET_TOKEN_SHOP_OPERATION_HEADER = "x-operation: TokenPurchaseService:GetTokenShop";
    public static final String GET_UNCONSUMED_PURCHASES_OPERATION_HEADER = "x-operation: TokenPurchaseService:GetUnconsumedPurchases";
    public static final String GRANT_PAID_TOKENS_OPERATION_HEADER = "x-operation: TokenPurchaseService:GrantPaidTokens";
    public static final String GRANT_PROMOTIONAL_TOKENS_OPERATION_HEADER = "x-operation: TokenPurchaseService:GrantPromotionalTokens";
    public static final String GRANT_TEST_TOKENS_OPERATION_HEADER = "x-operation: TokenPurchaseService:GrantTestTokens";
    public static final String PURCHASE_ITEM_OPERATION_HEADER = "x-operation: TokenPurchaseService:PurchaseItem";
    public static final String SNAP_TOKEN_HEADER_KEY = "X-Snap-Access-Token";
    public static final String TPS_BASE_URL = "https://tiger.snap-dev.net";

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:ConsumePurchase", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> consumePurchase(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldm aldm);

    @akxu(a = {"Accept: application/protobuf", "x-operation: CatalogService:GetAllItems", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> getAllItems(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldj aldj);

    @akxu(a = {"Accept: application/protobuf", "x-operation: CatalogService:GetItems", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> getItems(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldk aldk);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GetTokenBalance", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> getTokenBalance(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldn aldn);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GetTokenShop", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> getTokenShop(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldo aldo);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GetUnconsumedPurchases", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> getUnconsumedPurchases(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldp aldp);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GrantPaidTokens", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> grantPaidTokens(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldq aldq);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GrantPromotionalTokens", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> grantPromotionalTokens(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldr aldr);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:GrantTestTokens", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> grantTestToken(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk alds alds);

    @akxu(a = {"Accept: application/protobuf", "x-operation: TokenPurchaseService:PurchaseItem", "Content-Type: application/protobuf"})
    @akxy
    ajdx<Object> purchaseItem(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aldt aldt);
}
