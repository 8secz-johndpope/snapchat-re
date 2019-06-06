package com.snap.messaging.createchat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snap.ui.view.LoadingSpinnerView;
import com.snap.ui.view.StackingLayout;
import com.snapchat.android.R;

public class CreateChatBottomPanelView extends StackingLayout {
    private ImageView a;
    private View b;
    private HorizontalScrollView c;
    private LinearLayout d;
    private TextView e;
    private TextView f;
    private LoadingSpinnerView g;
    private final boolean h;

    public CreateChatBottomPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CreateChatBottomPanelView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        inflate(context, R.layout.mushroom_create_chat_bottom_panel_view, this);
        this.a = (ImageView) findViewById(R.id.create_chat_bottom_panel_send_button);
        this.b = findViewById(R.id.sent_to_button_label_mode_view);
        this.c = (HorizontalScrollView) findViewById(R.id.create_chat_bottom_panel_scroller);
        this.d = (LinearLayout) findViewById(R.id.create_chat_bottom_panel_text_container);
        this.e = (TextView) findViewById(R.id.create_chat_bottom_panel_text);
        this.f = (TextView) findViewById(R.id.create_chat_bottom_panel_help_text);
        this.g = (LoadingSpinnerView) findViewById(R.id.create_chat_bottom_panel_loading_spinner);
        this.h = false;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
    }
}
