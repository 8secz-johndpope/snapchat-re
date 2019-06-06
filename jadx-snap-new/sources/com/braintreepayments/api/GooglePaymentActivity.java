package com.braintreepayments.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.Wallet.WalletOptions.Builder;

public class GooglePaymentActivity extends Activity {
    public void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("com.braintreepayments.api.EXTRA_RECREATING")) {
            AutoResolveHelper.resolveTask(Wallet.getPaymentsClient(this, new Builder().setEnvironment(getIntent().getIntExtra("com.braintreepayments.api.EXTRA_ENVIRONMENT", 3)).build()).loadPaymentData((PaymentDataRequest) getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_PAYMENT_DATA_REQUEST")), this, 1);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.braintreepayments.api.EXTRA_RECREATING", true);
    }
}
