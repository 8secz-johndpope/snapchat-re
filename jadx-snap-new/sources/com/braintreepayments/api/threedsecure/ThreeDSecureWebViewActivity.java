package com.braintreepayments.api.threedsecure;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import defpackage.xf;
import defpackage.xh;
import defpackage.xt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Stack;

public class ThreeDSecureWebViewActivity extends Activity {
    private ActionBar a;
    private FrameLayout b;
    private Stack<xt> c;

    public final void a() {
        this.c.pop();
        a((xt) this.c.pop());
    }

    public final void a(String str) {
        ActionBar actionBar = this.a;
        if (actionBar != null) {
            actionBar.setTitle(str);
        }
    }

    public final void a(xf xfVar) {
        setResult(-1, new Intent().putExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT", xfVar));
        finish();
    }

    public final void a(xt xtVar) {
        this.c.push(xtVar);
        this.b.removeAllViews();
        this.b.addView(xtVar);
    }

    public void onBackPressed() {
        if (((xt) this.c.peek()).canGoBack()) {
            ((xt) this.c.peek()).goBack();
        } else if (this.c.size() > 1) {
            a();
        } else {
            super.onBackPressed();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        String str = "UTF-8";
        super.onCreate(bundle);
        requestWindowFeature(2);
        xh xhVar = (xh) getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_LOOKUP");
        if (xhVar != null) {
            this.a = getActionBar();
            if (this.a != null) {
                a("");
                this.a.setDisplayHomeAsUpEnabled(true);
            }
            this.c = new Stack();
            this.b = (FrameLayout) findViewById(16908290);
            StringBuilder stringBuilder = new StringBuilder();
            try {
                stringBuilder.append("PaReq=");
                stringBuilder.append(URLEncoder.encode(xhVar.d, str));
                stringBuilder.append("&MD=");
                stringBuilder.append(URLEncoder.encode(xhVar.b, str));
                stringBuilder.append("&TermUrl=");
                stringBuilder.append(URLEncoder.encode(xhVar.c, str));
            } catch (UnsupportedEncodingException unused) {
                finish();
            }
            xt xtVar = new xt(this);
            xtVar.a(this);
            xtVar.postUrl(xhVar.a, stringBuilder.toString().getBytes());
            a(xtVar);
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder("A ThreeDSecureLookup must be specified with ");
        stringBuilder2.append(xh.class.getSimpleName());
        stringBuilder2.append(".EXTRA_THREE_D_SECURE_LOOKUP extra");
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }
}
