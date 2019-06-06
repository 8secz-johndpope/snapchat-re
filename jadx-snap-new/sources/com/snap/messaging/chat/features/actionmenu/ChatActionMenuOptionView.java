package com.snap.messaging.chat.features.actionmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.abtt;
import defpackage.abtu;
import defpackage.akcr;
import defpackage.pxx;

public final class ChatActionMenuOptionView extends abtu {
    private TextView a;
    private ImageView b;
    private TextView c;

    static final class a implements OnClickListener {
        private /* synthetic */ abtt a;

        a(abtt abtt) {
            this.a = abtt;
        }

        public final void onClick(View view) {
        }
    }

    public ChatActionMenuOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ChatActionMenuOptionView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final void a(abtt abtt) {
        akcr.b(abtt, "viewModel");
        TextView textView = this.a;
        String str = "textView";
        if (textView == null) {
            akcr.a(str);
        }
        pxx pxx = (pxx) abtt;
        textView.setText(getResources().getString(pxx.d()));
        String str2 = "iconView";
        ImageView imageView;
        if (pxx.b()) {
            imageView = this.b;
            if (imageView == null) {
                akcr.a(str2);
            }
            imageView.setImageDrawable(getResources().getDrawable(pxx.c()));
        } else {
            imageView = this.b;
            if (imageView == null) {
                akcr.a(str2);
            }
            imageView.setVisibility(8);
        }
        textView = this.a;
        if (textView == null) {
            akcr.a(str);
        }
        Object resources = getResources();
        akcr.a(resources, "resources");
        CharSequence a = pxx.a(textView, resources);
        String str3 = "subtextView";
        if ((a.length() == 0 ? 1 : null) != null) {
            textView = this.c;
            if (textView == null) {
                akcr.a(str3);
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.c;
            if (textView2 == null) {
                akcr.a(str3);
            }
            textView2.setVisibility(0);
            textView2 = this.c;
            if (textView2 == null) {
                akcr.a(str3);
            }
            textView2.setText(a);
        }
        setOnClickListener(new a(abtt));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.action_menu_option_text);
        akcr.a(findViewById, "findViewById(R.id.action_menu_option_text)");
        this.a = (TextView) findViewById;
        findViewById = findViewById(R.id.action_menu_option_icon);
        akcr.a(findViewById, "findViewById(R.id.action_menu_option_icon)");
        this.b = (ImageView) findViewById;
        findViewById = findViewById(R.id.action_menu_option_subtext);
        akcr.a(findViewById, "findViewById(R.id.action_menu_option_subtext)");
        this.c = (TextView) findViewById;
    }
}
