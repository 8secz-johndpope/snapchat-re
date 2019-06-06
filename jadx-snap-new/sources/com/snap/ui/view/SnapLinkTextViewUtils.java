package com.snap.ui.view;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import java.util.List;

public class SnapLinkTextViewUtils {

    static class CustomURLSpan extends URLSpan {
        private final LinkOnClickListener mLinkOnClickListener;

        public CustomURLSpan(String str, LinkOnClickListener linkOnClickListener) {
            super(str);
            this.mLinkOnClickListener = linkOnClickListener;
        }

        public void onClick(View view) {
            LinkOnClickListener linkOnClickListener = this.mLinkOnClickListener;
            if (linkOnClickListener != null) {
                linkOnClickListener.onClick(view, getURL());
            } else {
                super.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public interface LinkOnClickListener {
        void onClick(View view, String str);
    }

    private static void checkViewContextCompatibility(View view) {
        Context context = view.getContext();
        Preconditions.checkArgument(context != context.getApplicationContext(), "The TextView must be initialized with an activity context");
    }

    public static void setCustomLinkTextView(TextView textView, int i, LinkOnClickListener linkOnClickListener) {
        checkViewContextCompatibility(textView);
        textView.setLinkTextColor(i);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spannable = (Spannable) Preconditions.checkNotNull(textView.getText());
        for (Object obj : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            spannable.removeSpan(obj);
            spannable.setSpan(new CustomURLSpan(obj.getURL(), linkOnClickListener), spanStart, spanEnd, 0);
        }
        textView.setText(spannable);
    }

    public static void setCustomURLInLinkTextView(TextView textView, int i, List<String> list, LinkOnClickListener linkOnClickListener) {
        checkViewContextCompatibility(textView);
        textView.setLinkTextColor(i);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spannable = (Spannable) Preconditions.checkNotNull(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (uRLSpanArr.length == list.size()) {
            int i2 = 0;
            for (Object obj : uRLSpanArr) {
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                spannable.removeSpan(obj);
                spannable.setSpan(new CustomURLSpan((String) list.get(i2), linkOnClickListener), spanStart, spanEnd, 0);
                i2++;
            }
            textView.setText(spannable);
        }
    }
}
