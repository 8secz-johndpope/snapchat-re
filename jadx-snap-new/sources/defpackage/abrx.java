package defpackage;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;

/* renamed from: abrx */
public final class abrx extends Factory {
    private final float a;

    public abrx(float f) {
        this.a = f * 4.0f;
    }

    public final Spannable newSpannable(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() < 2) {
            return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        } else {
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            for (int length = charSequence.length() - 1; length > 0; length--) {
                int i = length + 1;
                if (!charSequence.subSequence(length - 1, i).toString().matches("([\\u20a0-\\u32ff\\ud83c\\udc00-\\ud83d\\udeff\\udbb9\\udce5-\\udbb9\\udcee])")) {
                    spannableStringBuilder.insert(length, " ");
                    spannableStringBuilder.setSpan(new ScaleXSpan(this.a), length, i, 33);
                }
            }
            return spannableStringBuilder;
        }
    }
}
