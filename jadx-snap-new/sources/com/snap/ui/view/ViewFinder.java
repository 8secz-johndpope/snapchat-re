package com.snap.ui.view;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewFinder {
    private final List<View> views;

    public ViewFinder(View... viewArr) {
        this.views = new ArrayList(Arrays.asList(viewArr));
    }

    public void addLookupView(View view) {
        this.views.add(view);
    }

    public <T extends View> T findViewById(int i) {
        for (View findViewById : this.views) {
            View findViewById2 = findViewById2.findViewById(i);
            if (findViewById2 != null) {
                return findViewById2;
            }
        }
        return null;
    }
}
