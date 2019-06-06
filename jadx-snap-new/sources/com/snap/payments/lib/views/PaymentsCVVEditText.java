package com.snap.payments.lib.views;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontEditText;
import defpackage.abuk;
import defpackage.akly;

public class PaymentsCVVEditText extends SnapFontEditText {
    String a;
    public String b;
    boolean c;
    boolean d;
    int e;
    int f;
    private a g = new a();

    public class a extends abuk {
        public final void afterTextChanged(Editable editable) {
            if (!PaymentsCVVEditText.this.c) {
                CharSequence stringBuilder;
                PaymentsCVVEditText paymentsCVVEditText = PaymentsCVVEditText.this;
                paymentsCVVEditText.c = true;
                if (paymentsCVVEditText.d) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    paymentsCVVEditText.b = paymentsCVVEditText.a;
                    for (int i = 0; i < paymentsCVVEditText.a.length(); i++) {
                        stringBuilder2.append("•");
                    }
                    stringBuilder = stringBuilder2.toString();
                } else {
                    stringBuilder = paymentsCVVEditText.a;
                }
                editable.replace(0, editable.length(), stringBuilder);
                PaymentsCVVEditText.this.c = false;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!PaymentsCVVEditText.this.c) {
                PaymentsCVVEditText paymentsCVVEditText = PaymentsCVVEditText.this;
                String charSequence2 = charSequence.toString();
                CharSequence charSequence3 = " ";
                i -= akly.b(charSequence2.substring(0, i), charSequence3);
                i2 -= akly.b(charSequence2.substring(i, i + i2), charSequence3);
                paymentsCVVEditText.e = i;
                paymentsCVVEditText.f = i + i2;
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!PaymentsCVVEditText.this.c) {
                PaymentsCVVEditText paymentsCVVEditText = PaymentsCVVEditText.this;
                String substring = charSequence.toString().substring(i, i3 + i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(paymentsCVVEditText.a.substring(0, paymentsCVVEditText.e));
                stringBuilder.append(substring);
                stringBuilder.append(paymentsCVVEditText.a.substring(paymentsCVVEditText.f, paymentsCVVEditText.a.length()));
                paymentsCVVEditText.a = stringBuilder.toString();
                paymentsCVVEditText.a = paymentsCVVEditText.a.substring(0, Math.min(paymentsCVVEditText.a.length(), 4));
            }
        }
    }

    public PaymentsCVVEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setInputType(3);
        setKeyListener(DigitsKeyListener.getInstance("0123456789•"));
        addTextChangedListener(this.g);
        this.c = false;
        this.a = "";
        this.d = true;
    }
}
