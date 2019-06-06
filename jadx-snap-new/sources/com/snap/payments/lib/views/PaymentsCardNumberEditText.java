package com.snap.payments.lib.views;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontEditText;
import defpackage.abuk;
import defpackage.akly;
import defpackage.thm;
import defpackage.thn;
import defpackage.tii;

public class PaymentsCardNumberEditText extends SnapFontEditText {
    public String a;
    boolean b;
    public boolean c;
    int d;
    int e;
    int f;
    public thn g = thn.UNKNOWN;

    public class a extends abuk {
        public final void afterTextChanged(Editable editable) {
            if (!PaymentsCardNumberEditText.this.b) {
                CharSequence a;
                PaymentsCardNumberEditText paymentsCardNumberEditText = PaymentsCardNumberEditText.this;
                paymentsCardNumberEditText.b = true;
                if (paymentsCardNumberEditText.c) {
                    String str = PaymentsCardNumberEditText.this.a;
                    int i = PaymentsCardNumberEditText.this.d;
                    int i2 = PaymentsCardNumberEditText.this.e;
                    thn thn = PaymentsCardNumberEditText.this.g;
                    if (str == null) {
                        str = "";
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(30);
                        int i3 = 0;
                        while (i3 < str.length()) {
                            if (i3 < i || i3 >= i2) {
                                stringBuilder.append("•");
                            } else {
                                stringBuilder.append(str.charAt(i3));
                            }
                            i3++;
                        }
                        str = stringBuilder.toString();
                    }
                    a = tii.a(str, thn);
                } else {
                    a = tii.a(PaymentsCardNumberEditText.this.a);
                }
                editable.replace(0, editable.length(), a);
                PaymentsCardNumberEditText.this.b = false;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!PaymentsCardNumberEditText.this.b) {
                PaymentsCardNumberEditText paymentsCardNumberEditText = PaymentsCardNumberEditText.this;
                String charSequence2 = charSequence.toString();
                CharSequence charSequence3 = " ";
                i -= akly.b(charSequence2.substring(0, i), charSequence3);
                i2 -= akly.b(charSequence2.substring(i, i + i2), charSequence3);
                paymentsCardNumberEditText.d = i;
                paymentsCardNumberEditText.f = i + i2;
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!PaymentsCardNumberEditText.this.b) {
                PaymentsCardNumberEditText paymentsCardNumberEditText = PaymentsCardNumberEditText.this;
                String substring = charSequence.toString().substring(i, i + i3);
                paymentsCardNumberEditText.e = paymentsCardNumberEditText.d + i3;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(paymentsCardNumberEditText.a.substring(0, paymentsCardNumberEditText.d));
                stringBuilder.append(substring);
                stringBuilder.append(paymentsCardNumberEditText.a.substring(paymentsCardNumberEditText.f, paymentsCardNumberEditText.a.length()));
                paymentsCardNumberEditText.a = stringBuilder.toString();
                paymentsCardNumberEditText.a = paymentsCardNumberEditText.a.substring(0, Math.min(paymentsCardNumberEditText.a.length(), thm.a(paymentsCardNumberEditText.g)));
            }
        }
    }

    public PaymentsCardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setInputType(3);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 •"));
        addTextChangedListener(new a());
        this.b = false;
        this.a = "";
        this.c = true;
    }
}
