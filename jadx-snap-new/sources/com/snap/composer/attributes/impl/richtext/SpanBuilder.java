package com.snap.composer.attributes.impl.richtext;

import android.text.SpannableString;
import android.text.SpannedString;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class SpanBuilder {
    private final StringBuilder a = new StringBuilder();
    private final List<Spans> b = new ArrayList();

    public static final class Spans {
        private final int a;
        private final int b;
        private final List<Object> c;

        public Spans(int i, int i2, List<? extends Object> list) {
            akcr.b(list, "spans");
            this.a = i;
            this.b = i2;
            this.c = list;
        }

        public final int getEndIndex() {
            return this.b;
        }

        public final List<Object> getSpans() {
            return this.c;
        }

        public final int getStartIndex() {
            return this.a;
        }
    }

    public final void addSpans(Spans spans) {
        akcr.b(spans, "spans");
        this.b.add(spans);
    }

    public final void append(String str) {
        akcr.b(str, "string");
        this.a.append(str);
    }

    public final SpannedString build() {
        SpannableString spannableString = new SpannableString(this.a);
        CharSequence charSequence = spannableString;
        if ((charSequence.length() == 0 ? 1 : null) != null) {
            return new SpannedString(charSequence);
        }
        for (Spans spans : this.b) {
            for (Object span : spans.getSpans()) {
                spannableString.setSpan(span, spans.getStartIndex(), spans.getEndIndex(), 33);
            }
        }
        return new SpannedString(charSequence);
    }

    public final int getLength() {
        return this.a.length();
    }
}
