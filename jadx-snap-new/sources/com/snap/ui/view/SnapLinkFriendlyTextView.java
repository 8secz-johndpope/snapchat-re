package com.snap.ui.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import com.snap.ui.view.SnapLinkTextViewUtils.LinkOnClickListener;
import com.snapchat.android.R;
import defpackage.zhg.a;
import net.sqlcipher.database.SQLiteDatabase;

public class SnapLinkFriendlyTextView extends SnapFontTextView {
    private static final int NOT_SET = -1;

    public SnapLinkFriendlyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = ContextCompat.getColor(context, R.color.dark_blue);
        SnapLinkTextViewUtils.setCustomLinkTextView(this, color, new LinkOnClickListener() {
            public void onClick(View view, String str) {
                Uri parse = Uri.parse(str);
                Context context = view.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
        });
        setTextColorLink(context, attributeSet, color);
        setTextColorHighlight(context, attributeSet);
    }

    private void setTextColorHighlight(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842905});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        if (color != -1) {
            setHighlightColor(color);
        }
    }

    private void setTextColorLink(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n);
        int color = obtainStyledAttributes.getColor(0, i);
        obtainStyledAttributes.recycle();
        setLinkTextColor(color);
    }
}
