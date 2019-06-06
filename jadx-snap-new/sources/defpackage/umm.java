package defpackage;

import android.content.Context;
import com.snapchat.android.R;

/* renamed from: umm */
public final class umm {
    public static tvt a(umd umd) {
        akcr.b(umd, "imageTimerEditProvider");
        return umd;
    }

    public static tvt a(umi umi) {
        akcr.b(umi, "videoTimerEditsProvider");
        return umi;
    }

    public static tza a(umh umh) {
        akcr.b(umh, "imageTimerToolInjector");
        return umh;
    }

    public static tza a(uml uml) {
        akcr.b(uml, "videoTimerToolInjector");
        return uml;
    }

    public static tzm a(umg umg) {
        akcr.b(umg, "imageTimerToolActivator");
        return umg;
    }

    public static tzm a(umk umk) {
        akcr.b(umk, "videoTimerToolActivator");
        return umk;
    }

    public static ugi a() {
        return new ugi("image_timer_tool", R.drawable.timer_tool, R.drawable.timer_tool_selected, true, true, 0, 0, null, false, null, 960);
    }

    public static ugi a(Context context) {
        akcr.b(context, "context");
        return new ugi("video_timer_tool", R.drawable.timer_tool_video_one, R.drawable.timer_tool_video_infinite, true, false, context.getResources().getDimensionPixelSize(R.dimen.snap_preview_button_timer_text_padding), context.getResources().getDimensionPixelSize(R.dimen.snap_preview_button_timer_text_padding), null, false, null, 896);
    }

    public static ume a(toc toc, zgb zgb, aipn<ugi> aipn, ajwy<und> ajwy, aipn<ftl> aipn2, aipn<tnj> aipn3) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "timerIcon");
        akcr.b(ajwy, "timerSelectorViewPresenterProvider");
        akcr.b(aipn2, "configProvider");
        akcr.b(aipn3, "preferences");
        return new ume(toc, zgb, ajwy, aipn, aipn2, aipn3);
    }

    public static umj a(toc toc, zgb zgb, aipn<ugi> aipn, ftl ftl, tnj tnj, ajwy<twd> ajwy) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "videoIcon");
        akcr.b(ftl, "configProvider");
        akcr.b(tnj, "preferences");
        akcr.b(ajwy, "previewMetricsPlugin");
        return new umj(toc, zgb, aipn, ftl, tnj, ajwy);
    }
}
