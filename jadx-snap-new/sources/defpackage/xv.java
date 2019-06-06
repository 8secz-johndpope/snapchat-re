package defpackage;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braintreepayments.browserswitch.BrowserSwitchActivity;

/* renamed from: xv */
public abstract class xv extends Fragment {
    private int a;
    public Context j;

    /* renamed from: xv$a */
    public enum a {
        OK,
        CANCELED,
        ERROR;
        
        private String mErrorMessage;

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name());
            stringBuilder.append(" ");
            stringBuilder.append(this.mErrorMessage);
            return stringBuilder.toString();
        }
    }

    public abstract void a(int i, a aVar, Uri uri);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.j == null) {
            this.j = getActivity().getApplicationContext();
        }
        this.a = bundle != null ? bundle.getInt("com.braintreepayments.browserswitch.EXTRA_REQUEST_CODE") : Integer.MIN_VALUE;
    }

    public void onResume() {
        super.onResume();
        if ((this.a != Integer.MIN_VALUE ? 1 : null) != null) {
            Uri uri = BrowserSwitchActivity.a;
            int i = this.a;
            this.a = Integer.MIN_VALUE;
            BrowserSwitchActivity.a = null;
            if (uri != null) {
                a(i, a.OK, uri);
                return;
            }
            a(i, a.CANCELED, null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.braintreepayments.browserswitch.EXTRA_REQUEST_CODE", this.a);
    }
}
