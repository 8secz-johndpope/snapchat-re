package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.ajwo;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.vjm;
import defpackage.xjl.a;
import defpackage.xlk;

public final class SpectaclesSaveToExportFormatView extends ConstraintLayout {
    final ajwo<vjm> d;
    vjm e = vjm.SPECTACLES_CIRCLE_WHITE;
    private final SnapFontTextView f;
    private final SpectaclesSaveToExportFormatIconView g;
    private final CheckBox h;

    /* renamed from: com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView$1 */
    static final class AnonymousClass1 implements OnClickListener {
        private /* synthetic */ SpectaclesSaveToExportFormatView a;

        AnonymousClass1(SpectaclesSaveToExportFormatView spectaclesSaveToExportFormatView) {
            this.a = spectaclesSaveToExportFormatView;
        }

        public final void onClick(View view) {
            this.a.a(true);
            this.a.d.a(this.a.e);
        }
    }

    public SpectaclesSaveToExportFormatView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<MediaExportType>()");
        this.d = ajwo;
        ajwo = context.getSystemService("layout_inflater");
        if (ajwo != null) {
            ((LayoutInflater) ajwo).inflate(R.layout.spectacles_save_to_export_format_view, this);
            ajwo = findViewById(R.id.save_to_export_format_title);
            akcr.a(ajwo, "findViewById(R.id.save_to_export_format_title)");
            this.f = (SnapFontTextView) ajwo;
            ajwo = findViewById(R.id.save_to_export_format_icon);
            akcr.a(ajwo, "findViewById(R.id.save_to_export_format_icon)");
            this.g = (SpectaclesSaveToExportFormatIconView) ajwo;
            ajwo = findViewById(R.id.save_to_export_format_checkbox);
            akcr.a(ajwo, "findViewById(R.id.save_to_export_format_checkbox)");
            this.h = (CheckBox) ajwo;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.a, 0, 0);
            int i = obtainStyledAttributes.getInt(0, vjm.SPECTACLES_CIRCLE_WHITE.ordinal());
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            if (i >= 0 && i < vjm.values().length) {
                this.e = vjm.values()[i];
            }
            i = xlk.a[this.e.ordinal()];
            ajxm ajxm = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_white_background), Integer.valueOf(R.dimen.spectacles_save_to_square_icon_size)) : new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_9_16), Integer.valueOf(R.dimen.spectacles_save_to_horizontal_icon_size)) : new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_16_9), Integer.valueOf(R.dimen.spectacles_save_to_horizontal_icon_size)) : new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_4_3), Integer.valueOf(R.dimen.spectacles_save_to_horizontal_icon_size)) : new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_square), Integer.valueOf(R.dimen.spectacles_save_to_square_icon_size)) : new ajxm(Integer.valueOf(R.string.spectacles_save_to_export_format_black_background), Integer.valueOf(R.dimen.spectacles_save_to_square_icon_size));
            int intValue = ((Number) ajxm.a).intValue();
            i = ((Number) ajxm.b).intValue();
            this.f.setText(intValue);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            this.g.getLayoutParams().width = dimensionPixelSize;
            this.g.getLayoutParams().height = dimensionPixelSize;
            SpectaclesSaveToExportFormatIconView spectaclesSaveToExportFormatIconView = this.g;
            vjm vjm = this.e;
            akcr.b(vjm, "exportFormatType");
            spectaclesSaveToExportFormatIconView.d = vjm;
            spectaclesSaveToExportFormatIconView.invalidate();
            this.h.setChecked(z);
            setClickable(true);
            setOnClickListener(new AnonymousClass1(this));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void a(boolean z) {
        setClickable(z ^ 1);
        this.h.setChecked(z);
    }
}
