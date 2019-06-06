package com.snap.shake2report.ui.screenshotpage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.wwq;

public final class ScreenshotPageFragment extends MainPageFragment implements wwq {
    public ScreenshotPagePresenter a;
    private SnapImageView b;
    private ScreenshotDrawingView c;
    private ImageButton d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private DisplayMetrics h;

    public final SnapImageView b() {
        SnapImageView snapImageView = this.b;
        if (snapImageView == null) {
            akcr.a("backgroundImageView");
        }
        return snapImageView;
    }

    public final ScreenshotDrawingView c() {
        ScreenshotDrawingView screenshotDrawingView = this.c;
        if (screenshotDrawingView == null) {
            akcr.a("screenshotDrawingView");
        }
        return screenshotDrawingView;
    }

    public final ImageButton h() {
        ImageButton imageButton = this.d;
        if (imageButton == null) {
            akcr.a("discardChangeButton");
        }
        return imageButton;
    }

    public final ImageButton i() {
        ImageButton imageButton = this.e;
        if (imageButton == null) {
            akcr.a("saveChangeButton");
        }
        return imageButton;
    }

    public final ImageButton j() {
        ImageButton imageButton = this.f;
        if (imageButton == null) {
            akcr.a("trashButton");
        }
        return imageButton;
    }

    public final ImageButton k() {
        ImageButton imageButton = this.g;
        if (imageButton == null) {
            akcr.a("editButton");
        }
        return imageButton;
    }

    public final DisplayMetrics l() {
        DisplayMetrics displayMetrics = this.h;
        if (displayMetrics == null) {
            akcr.a("displayMetrics");
        }
        return displayMetrics;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        ScreenshotPagePresenter screenshotPagePresenter = this.a;
        if (screenshotPagePresenter == null) {
            akcr.a("presenter");
        }
        screenshotPagePresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setFlags(8192, 8192);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.s2r_screenshot_page_fragment, viewGroup, false);
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.s2r_screenshot_fragment_background_image_view);
            if (findViewById != null) {
                SnapImageView snapImageView = (SnapImageView) findViewById;
                String str = "<set-?>";
                akcr.b(snapImageView, str);
                this.b = snapImageView;
                Object findViewById2 = inflate.findViewById(R.id.s2r_screenshot_fragment_drawing_view);
                akcr.a(findViewById2, "fragmentView.findViewByI…ot_fragment_drawing_view)");
                ScreenshotDrawingView screenshotDrawingView = (ScreenshotDrawingView) findViewById2;
                akcr.b(screenshotDrawingView, str);
                this.c = screenshotDrawingView;
                findViewById2 = inflate.findViewById(R.id.s2r_screenshot_page_back_discard_image_button);
                akcr.a(findViewById2, "fragmentView.findViewByI…ack_discard_image_button)");
                ImageButton imageButton = (ImageButton) findViewById2;
                akcr.b(imageButton, str);
                this.d = imageButton;
                findViewById2 = inflate.findViewById(R.id.s2r_screenshot_page_save_image_button);
                akcr.a(findViewById2, "fragmentView.findViewByI…t_page_save_image_button)");
                imageButton = (ImageButton) findViewById2;
                akcr.b(imageButton, str);
                this.e = imageButton;
                findViewById2 = inflate.findViewById(R.id.s2r_screenshot_page_trash_image_button);
                akcr.a(findViewById2, "fragmentView.findViewByI…_page_trash_image_button)");
                imageButton = (ImageButton) findViewById2;
                akcr.b(imageButton, str);
                this.f = imageButton;
                findViewById2 = inflate.findViewById(R.id.s2r_screenshot_page_edit_image_button);
                akcr.a(findViewById2, "fragmentView.findViewByI…t_page_edit_image_button)");
                imageButton = (ImageButton) findViewById2;
                akcr.b(imageButton, str);
                this.g = imageButton;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                akcr.b(displayMetrics, str);
                this.h = displayMetrics;
                findViewById2 = getActivity();
                if (findViewById2 == null) {
                    akcr.a();
                }
                akcr.a(findViewById2, "activity!!");
                WindowManager windowManager = findViewById2.getWindowManager();
                if (windowManager == null) {
                    akcr.a();
                }
                windowManager.getDefaultDisplay().getMetrics(l());
                return inflate;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.imageloading.view.SnapImageView");
        }
        throw new ajxt("null cannot be cast to non-null type android.view.View");
    }

    public final void onDetach() {
        super.onDetach();
        ScreenshotPagePresenter screenshotPagePresenter = this.a;
        if (screenshotPagePresenter == null) {
            akcr.a("presenter");
        }
        screenshotPagePresenter.dropTarget();
    }
}
