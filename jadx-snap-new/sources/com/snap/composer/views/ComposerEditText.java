package com.snap.composer.views;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Selection;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView.BufferType;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.extensions.ViewUtils;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajyi;
import defpackage.ajzl;
import defpackage.akcr;
import defpackage.akgb;
import java.util.Arrays;
import java.util.Set;

public final class ComposerEditText extends AppCompatEditText implements ComposerRecyclableView, ComposerTouchTarget {
    private ComposerAction a;
    private String b;
    private boolean c;
    private InputFilter d;
    private int e;

    public ComposerEditText(Context context) {
        akcr.b(context, "context");
        super(context);
        setMaxLines(1);
        setEllipsize(TruncateAt.END);
        setIncludeFontPadding(false);
        setInputType(16385);
        setFocusableInTouchMode(true);
        setGravity(16);
        setTextDirection(5);
        setHintTextColor(-7829368);
        setTextColor(-16777216);
    }

    public final boolean canHandleTouchEvents() {
        return isFocusable() && isFocusableInTouchMode();
    }

    public final InputFilter getCharacterLimitFilter() {
        return this.d;
    }

    public final boolean getIgnoreNewlines() {
        return this.c;
    }

    public final ComposerAction getOnChangeAction() {
        return this.a;
    }

    public final String getPrefix() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        CharSequence text = getText();
        Object obj = 1;
        Object obj2 = (text == null || text.length() == 0) ? 1 : null;
        if (obj2 != null) {
            text = getHint();
            if (!(text == null || text.length() == 0)) {
                obj = null;
            }
            if (obj != null) {
                i2 = MeasureSpec.makeMeasureSpec(0, AudioPlayer.INFINITY_LOOP_COUNT);
            }
        }
        super.onMeasure(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        akcr.b(charSequence, "text");
        super.onTextChanged(charSequence, i, i2, i3);
        Object obj = charSequence.toString();
        if (this.c) {
            obj = akgb.a(obj, "\n", "", false);
            if (!obj.equals(charSequence.toString())) {
                setText((CharSequence) obj);
            }
        }
        String str = this.b;
        if (str == null || akgb.b(charSequence.toString(), str, false)) {
            setSelection(obj.length());
        } else {
            if (charSequence.length() != str.length() - 1 || i3 >= i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(charSequence);
                String stringBuilder2 = stringBuilder.toString();
                setText(stringBuilder2);
                obj = stringBuilder2;
            } else {
                setText(str);
                obj = str;
            }
            Selection.setSelection(getText(), getText().length());
        }
        if (this.e == 0) {
            View view = this;
            ViewUtils.INSTANCE.notifyAttributeChanged(view, "value", obj);
            ComposerAction composerAction = this.a;
            if (composerAction != null) {
                composerAction.perform(new Object[]{ajzl.a(ajxs.a(r0, obj))});
            }
            ViewUtils.INSTANCE.invalidateLayout(view);
        }
    }

    public final boolean prepareForRecycling() {
        setText("");
        return true;
    }

    public final boolean requiresInterceptBeforeHandlingTouchEvents() {
        return false;
    }

    public final void resetCharacterLimit() {
        InputFilter inputFilter = this.d;
        if (inputFilter != null) {
            Object filters = getFilters();
            akcr.a(filters, "filters");
            Set l = ajyi.l(filters);
            l.remove(inputFilter);
            Object[] toArray = l.toArray(new InputFilter[0]);
            if (toArray != null) {
                setFilters((InputFilter[]) toArray);
                this.d = null;
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final void setCharacterLimit(int i) {
        if (this.d != null) {
            resetCharacterLimit();
        }
        LengthFilter lengthFilter = new LengthFilter(i);
        Object filters = getFilters();
        akcr.a(filters, "filters");
        akcr.b(filters, "receiver$0");
        int length = filters.length;
        filters = Arrays.copyOf(filters, length + 1);
        filters[length] = lengthFilter;
        akcr.a(filters, "result");
        setFilters((InputFilter[]) filters);
        this.d = lengthFilter;
    }

    public final void setCharacterLimitFilter(InputFilter inputFilter) {
        this.d = inputFilter;
    }

    public final void setIgnoreNewlines(boolean z) {
        this.c = z;
    }

    public final void setOnChangeAction(ComposerAction composerAction) {
        this.a = composerAction;
    }

    public final void setPrefix(String str) {
        this.b = str;
    }

    public final void setText(CharSequence charSequence, BufferType bufferType) {
        this.e++;
        try {
            super.setText(charSequence, bufferType);
        } finally {
            this.e--;
        }
    }
}
