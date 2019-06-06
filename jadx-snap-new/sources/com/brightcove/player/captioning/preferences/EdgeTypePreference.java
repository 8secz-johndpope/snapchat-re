package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.R;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;

public class EdgeTypePreference extends ListDialogPreference {
    public EdgeTypePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        setValues(resources.getIntArray(R.array.captioning_edge_type_selector_values));
        setTitles(resources.getStringArray(R.array.captioning_edge_type_selector_titles));
        setDialogLayoutResource(R.layout.grid_picker_dialog);
        setListItemLayoutResource(R.layout.preset_picker_item);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, int i) {
        BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView = (BrightcoveClosedCaptioningTextView) view.findViewById(R.id.preview);
        brightcoveClosedCaptioningTextView.setStyle(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.createCaptionStyleFromPreset("1.0", 0), CaptionConstants.PREF_BACKGROUND_COLOR, Integer.valueOf(0)), CaptionConstants.PREF_EDGE_COLOR, Integer.valueOf(-16777216)), CaptionConstants.PREF_EDGE_TYPE, Integer.valueOf(this.a[i])));
        brightcoveClosedCaptioningTextView.setTextSize(getContext().getResources().getDisplayMetrics().density * 32.0f);
        CharSequence a = a(i);
        if (a != null) {
            ((TextView) view.findViewById(R.id.summary)).setText(a);
        }
    }

    public boolean shouldDisableDependents() {
        return getValue() == 0 || super.shouldDisableDependents();
    }
}
