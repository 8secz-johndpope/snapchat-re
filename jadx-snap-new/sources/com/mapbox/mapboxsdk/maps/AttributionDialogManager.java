package com.mapbox.mapboxsdk.maps;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.TelemetryAccessor;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.sources.Source;
import defpackage.lk.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

class AttributionDialogManager implements OnClickListener, View.OnClickListener {
    private static final String MAP_FEEDBACK_LOCATION_FORMAT = "https://www.mapbox.com/map-feedback/#/%f/%f/%d";
    private static final String MAP_FEEDBACK_URL = "https://www.mapbox.com/map-feedback";
    private String[] attributionKeys;
    private HashMap<String, String> attributionMap;
    private final Context context;
    private final MapboxMap mapboxMap;

    static class AttributionBuilder {
        private final Context context;
        private final HashMap<String, String> map = new LinkedHashMap();
        private final MapboxMap mapboxMap;

        AttributionBuilder(Context context, MapboxMap mapboxMap) {
            this.context = context.getApplicationContext();
            this.mapboxMap = mapboxMap;
        }

        private void addTelemetryEntryToAttributionMap() {
            this.map.put(this.context.getString(R.string.mapbox_telemetrySettings), this.context.getString(R.string.mapbox_telemetryLink));
        }

        private HashMap<String, String> build() {
            for (Source attribution : this.mapboxMap.getSources()) {
                parseAttribution(attribution.getAttribution());
            }
            addTelemetryEntryToAttributionMap();
            return this.map;
        }

        private void parseAttribution(String str) {
            if (!TextUtils.isEmpty(str)) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) Html.fromHtml(str);
                int i = 0;
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                int length = uRLSpanArr.length;
                while (i < length) {
                    URLSpan uRLSpan = uRLSpanArr[i];
                    this.map.put(resolveAnchorValue(spannableStringBuilder, uRLSpan), uRLSpan.getURL());
                    i++;
                }
            }
        }

        private String resolveAnchorValue(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            char[] cArr = new char[(spanEnd - spanStart)];
            spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
            return String.valueOf(cArr);
        }
    }

    AttributionDialogManager(Context context, MapboxMap mapboxMap) {
        this.context = context;
        this.mapboxMap = mapboxMap;
    }

    private String buildMapFeedbackMapUrl(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return MAP_FEEDBACK_URL;
        }
        return String.format(Locale.getDefault(), MAP_FEEDBACK_LOCATION_FORMAT, new Object[]{Double.valueOf(cameraPosition.target.getLongitude()), Double.valueOf(cameraPosition.target.getLatitude()), Integer.valueOf((int) cameraPosition.zoom)});
    }

    private boolean isLatestEntry(int i) {
        return i == this.attributionKeys.length - 1;
    }

    private void showAttributionDialog() {
        this.attributionKeys = (String[]) this.attributionMap.keySet().toArray(new String[this.attributionMap.size()]);
        a aVar = new a(this.context, R.style.mapbox_AlertDialogStyle);
        aVar.a(R.string.mapbox_attributionsDialogTitle);
        aVar.a(new ArrayAdapter(this.context, R.layout.mapbox_attribution_list_item, this.attributionKeys), this);
        aVar.b();
    }

    private void showMapFeedbackWebPage(int i) {
        String str = (String) this.attributionMap.get(this.attributionKeys[i]);
        if (str.contains(MAP_FEEDBACK_URL)) {
            str = buildMapFeedbackMapUrl(this.mapboxMap.getCameraPosition());
        }
        showWebPage(str);
    }

    private void showTelemetryDialog() {
        a aVar = new a(this.context, R.style.mapbox_AlertDialogStyle);
        aVar.a(R.string.mapbox_attributionTelemetryTitle);
        int i = R.string.mapbox_attributionTelemetryMessage;
        aVar.a.f = aVar.a.a.getText(i);
        i = R.string.mapbox_attributionTelemetryPositive;
        AnonymousClass1 anonymousClass1 = new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                TelemetryAccessor.setTelemetryEnabled(true);
                dialogInterface.cancel();
            }
        };
        aVar.a.g = aVar.a.a.getText(i);
        aVar.a.h = anonymousClass1;
        i = R.string.mapbox_attributionTelemetryNeutral;
        AnonymousClass2 anonymousClass2 = new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AttributionDialogManager attributionDialogManager = AttributionDialogManager.this;
                attributionDialogManager.showWebPage(attributionDialogManager.context.getResources().getString(R.string.mapbox_telemetryLink));
                dialogInterface.cancel();
            }
        };
        aVar.a.k = aVar.a.a.getText(i);
        aVar.a.l = anonymousClass2;
        i = R.string.mapbox_attributionTelemetryNegative;
        AnonymousClass3 anonymousClass3 = new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                TelemetryAccessor.setTelemetryEnabled(false);
                dialogInterface.cancel();
            }
        };
        aVar.a.i = aVar.a.a.getText(i);
        aVar.a.j = anonymousClass3;
        aVar.b();
    }

    private void showWebPage(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.context, R.string.mapbox_attributionErrorNoBrowser, 1).show();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (isLatestEntry(i)) {
            showTelemetryDialog();
        } else {
            showMapFeedbackWebPage(i);
        }
    }

    public void onClick(View view) {
        this.attributionMap = new AttributionBuilder(this.context, this.mapboxMap).build();
        showAttributionDialog();
    }
}
