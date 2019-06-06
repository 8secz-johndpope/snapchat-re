package com.snap.payments.lib.views;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.ui.view.SnapFontEditText;
import defpackage.abuk;

public class PaymentsCardExpiryEditText extends SnapFontEditText {
    boolean a;
    boolean b = false;
    String c;

    public PaymentsCardExpiryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setInputType(3);
        setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        addTextChangedListener(new abuk() {
            public final void afterTextChanged(Editable editable) {
                if (!PaymentsCardExpiryEditText.this.b) {
                    String str;
                    String obj = PaymentsCardExpiryEditText.this.getText().toString();
                    PaymentsCardExpiryEditText paymentsCardExpiryEditText = PaymentsCardExpiryEditText.this;
                    String str2 = null;
                    if (obj.length() > 5) {
                        str2 = paymentsCardExpiryEditText.c;
                    }
                    Object obj2 = ((obj.length() <= 0 || obj.matches("(^[0-9])|((^0[1-9])|(^1[0-2])).*")) && (obj.length() <= 2 || obj.matches("(^../.*|^...)"))) ? 1 : null;
                    String str3 = SCamera.CAMERA_ID_FRONT;
                    if (obj2 == null) {
                        str = obj;
                    } else {
                        Object[] objArr;
                        if (obj.length() != 1 || obj.equals("0") || obj.equals(str3)) {
                            if (obj.length() == 2 && paymentsCardExpiryEditText.a) {
                                if (obj.charAt(0) == '1') {
                                    if (obj.charAt(1) - 48 > 2) {
                                        str = str3;
                                    } else {
                                        objArr = new Object[]{obj};
                                        str2 = "%s/";
                                    }
                                }
                            } else if (obj.length() == 3 && paymentsCardExpiryEditText.a) {
                                str = obj.substring(0, 2);
                                str2 = obj.substring(2, 3);
                                str = String.format("%s/%s", new Object[]{str, str2});
                            } else if (obj.length() == 3 && !paymentsCardExpiryEditText.a) {
                                str = obj.substring(0, 2);
                            }
                            str = str2;
                        } else {
                            objArr = new Object[]{obj};
                            str2 = "0%s/";
                        }
                        str = String.format(str2, objArr);
                    }
                    PaymentsCardExpiryEditText paymentsCardExpiryEditText2 = PaymentsCardExpiryEditText.this;
                    paymentsCardExpiryEditText2.b = true;
                    if (str != null) {
                        paymentsCardExpiryEditText2.c = str;
                        editable.replace(0, editable.length(), str);
                    } else {
                        paymentsCardExpiryEditText2.c = obj;
                    }
                    PaymentsCardExpiryEditText.this.b = false;
                }
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!PaymentsCardExpiryEditText.this.b) {
                    PaymentsCardExpiryEditText.this.a = i3 > i2;
                }
            }
        });
    }

    public final int a() {
        if (length() >= 2) {
            try {
                return Integer.parseInt(getText().subSequence(0, 2).toString());
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final int b() {
        if (length() >= 5) {
            try {
                return Integer.parseInt(getText().subSequence(3, 5).toString());
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
