package com.brightcove.player.captioning.preferences;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.brightcove.player.R;

public class ColorPreference extends ListDialogPreference {
    private ColorDrawable c;
    private boolean d;

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDialogLayoutResource(R.layout.grid_picker_dialog);
        setListItemLayoutResource(R.layout.color_picker_item);
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence a(int i) {
        CharSequence a = super.a(i);
        if (a != null) {
            return a;
        }
        i = this.a[i];
        int red = Color.red(i);
        int green = Color.green(i);
        i = Color.blue(i);
        return getContext().getString(R.string.color_custom, new Object[]{Integer.valueOf(red), Integer.valueOf(green), Integer.valueOf(i)});
    }

    /* Access modifiers changed, original: protected|final */
    @TargetApi(16)
    public final void a(View view, int i) {
        int i2 = this.a[i];
        ImageView imageView = (ImageView) view.findViewById(R.id.color_swatch);
        if (Color.alpha(i2) < 255) {
            imageView.setBackgroundResource(R.drawable.transparency_tileable);
        } else {
            imageView.setBackground(null);
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i2);
        } else {
            imageView.setImageDrawable(new ColorDrawable(i2));
        }
        CharSequence a = a(i);
        if (a != null) {
            ((TextView) view.findViewById(R.id.summary)).setText(a);
        }
    }

    /* Access modifiers changed, original: protected */
    @TargetApi(16)
    public void onBindView(View view) {
        super.onBindView(view);
        if (this.d) {
            ImageView imageView = (ImageView) view.findViewById(R.id.color_preview);
            int value = getValue();
            if (Color.alpha(value) < 255) {
                imageView.setBackgroundResource(R.drawable.transparency_tileable);
            } else {
                imageView.setBackground(null);
            }
            ColorDrawable colorDrawable = this.c;
            if (colorDrawable == null) {
                this.c = new ColorDrawable(value);
                imageView.setImageDrawable(this.c);
            } else {
                colorDrawable.setColor(value);
            }
            CharSequence summary = getSummary();
            if (TextUtils.isEmpty(summary)) {
                imageView.setContentDescription(null);
            } else {
                imageView.setContentDescription(summary);
            }
            imageView.setAlpha(isEnabled() ? 1.0f : 0.2f);
        }
    }

    public void setPreviewEnabled(boolean z) {
        if (this.d != z) {
            this.d = z;
            if (z) {
                setWidgetLayoutResource(R.layout.preference_color);
                return;
            }
            setWidgetLayoutResource(0);
        }
    }

    public boolean shouldDisableDependents() {
        return Color.alpha(getValue()) == 0 || super.shouldDisableDependents();
    }
}
