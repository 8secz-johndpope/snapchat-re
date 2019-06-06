package com.snap.messaging.sendto.internal.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abur;
import defpackage.rll;

public class MushroomSendToActionBarView extends rll {
    public final abur<ImageView> a;
    public final abur<SnapFontTextView> b;

    public MushroomSendToActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MushroomSendToActionBarView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.layout.mushroom_send_to_action_bar_view);
        this.a = new abur((View) this, (int) R.id.send_to_new_group_button_stub, (int) R.id.send_to_action_bar_create_group_button);
        this.b = new abur((View) this, (int) R.id.send_to_action_bar_group_label_stub, (int) R.id.send_to_action_bar_create_group_label);
        this.d.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View view;
                if (charSequence == null || charSequence.toString().isEmpty()) {
                    view = MushroomSendToActionBarView.this.g;
                    i = 0;
                } else {
                    view = MushroomSendToActionBarView.this.g;
                    i = 4;
                }
                view.setVisibility(i);
            }
        });
    }

    public final void a(boolean z) {
        View view;
        int i;
        super.a(z);
        if (this.d.getText().toString().isEmpty()) {
            view = this.g;
            i = 0;
        } else {
            view = this.g;
            i = 4;
        }
        view.setVisibility(i);
    }
}
