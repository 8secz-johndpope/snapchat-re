package com.snap.lenses.camera.carousel.imagepicker;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.lvj;
import defpackage.lvo;

public final class ImagePickerListView extends RecyclerView {
    int a;
    int b;
    final LinearLayoutManager c = new LinearLayoutManager(getContext(), 0, false);

    static final class a implements Runnable {
        private /* synthetic */ ImagePickerListView a;
        private /* synthetic */ int b;

        a(ImagePickerListView imagePickerListView, int i) {
            this.a = imagePickerListView;
            this.b = i;
        }

        public final void run() {
            this.a.c.scrollToPositionWithOffset(this.b, ((int) ((((float) (this.a.getWidth() - this.a.b)) / 2.0f) + 0.5f)) - (this.a.a << 1));
        }
    }

    public ImagePickerListView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setLayoutManager(this.c);
        setItemAnimator(null);
        this.a = getResources().getDimensionPixelSize(R.dimen.lenses_carousel_imagepicker_list_item_offset);
        this.b = getResources().getDimensionPixelSize(R.dimen.lenses_carousel_imagepicker_item_size);
        addItemDecoration(new lvj(this.a));
        Context context = getContext();
        akcr.a((Object) context, "context");
        addItemDecoration(new lvo(context));
    }
}
