package com.braintreepayments.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.Wallet.WalletOptions;

@Deprecated
public class AndroidPayActivity extends Activity implements ConnectionCallbacks, OnConnectionFailedListener {
    private GoogleApiClient a;

    private Cart a() {
        return (Cart) getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_CART");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && (i == 1 || i == 2)) {
            Wallet.Payments.loadFullWallet(this.a, FullWalletRequest.newBuilder().setCart(a()).setGoogleTransactionId(((MaskedWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")).getGoogleTransactionId()).build(), 3);
            return;
        }
        if (i2 == -1 && i == 3) {
            intent.putExtra("com.braintreepayments.api.EXTRA_CART", a());
        }
        setResult(i2, intent);
        finish();
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder("Connection failed. ");
        stringBuilder.append(connectionResult.getErrorMessage());
        stringBuilder.append(". Code: ");
        stringBuilder.append(connectionResult.getErrorCode());
        setResult(2, intent.putExtra("com.braintreepayments.api.EXTRA_ERROR", stringBuilder.toString()));
        finish();
    }

    public void onConnectionSuspended(int i) {
        setResult(2, new Intent().putExtra("com.braintreepayments.api.EXTRA_ERROR", "Connection suspended: ".concat(String.valueOf(i))));
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new Builder(this).addApi(Wallet.API, new WalletOptions.Builder().setEnvironment(getIntent().getIntExtra("com.braintreepayments.api.EXTRA_ENVIRONMENT", 3)).setTheme(1).build()).build();
        this.a.registerConnectionCallbacks(this);
        this.a.registerConnectionFailedListener(this);
        this.a.connect();
        if (bundle == null || !bundle.getBoolean("com.braintreepayments.api.EXTRA_RECREATING")) {
            int intExtra = getIntent().getIntExtra("com.braintreepayments.api.EXTRA_REQUEST_TYPE", -1);
            if (intExtra == 1) {
                Wallet.Payments.loadMaskedWallet(this.a, MaskedWalletRequest.newBuilder().setMerchantName(getIntent().getStringExtra("com.braintreepayments.api.EXTRA_MERCHANT_NAME")).setCurrencyCode(a().getCurrencyCode()).setCart(a()).setEstimatedTotalPrice(a().getTotalPrice()).setShippingAddressRequired(getIntent().getBooleanExtra("com.braintreepayments.api.EXTRA_SHIPPING_ADDRESS_REQUIRED", false)).setPhoneNumberRequired(getIntent().getBooleanExtra("com.braintreepayments.api.EXTRA_PHONE_NUMBER_REQUIRED", false)).setPaymentMethodTokenizationParameters((PaymentMethodTokenizationParameters) getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_TOKENIZATION_PARAMETERS")).addAllowedCardNetworks(getIntent().getIntegerArrayListExtra("com.braintreepayments.api.EXTRA_ALLOWED_CARD_NETWORKS")).addAllowedCountrySpecificationsForShipping(getIntent().getParcelableArrayListExtra("com.braintreepayments.api.EXTRA_ALLOWED_COUNTRIES")).build(), 1);
            } else if (intExtra != 2) {
                setResult(2, new Intent().putExtra("com.braintreepayments.api.EXTRA_ERROR", "EXTRA_REQUEST_TYPE contained an unexpected type: ".concat(String.valueOf(intExtra))));
                finish();
            } else {
                Wallet.Payments.changeMaskedWallet(this.a, getIntent().getStringExtra("com.braintreepayments.api.EXTRA_GOOGLE_TRANSACTION_ID"), null, 2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        this.a.disconnect();
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.braintreepayments.api.EXTRA_RECREATING", true);
    }
}
