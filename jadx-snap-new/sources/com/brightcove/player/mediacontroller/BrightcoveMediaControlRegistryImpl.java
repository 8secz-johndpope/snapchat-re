package com.brightcove.player.mediacontroller;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import com.brightcove.player.mediacontroller.buttons.ButtonState;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BrightcoveMediaControlRegistryImpl implements BrightcoveMediaControlRegistry {
    private static final String a = "BrightcoveMediaControlRegistryImpl";
    private final SparseArray<View> b = new SparseArray();
    private final SparseArray<ButtonController> c = new SparseArray();

    public void clear() {
        this.b.clear();
        this.c.clear();
    }

    public ButtonController getButtonController(int i) {
        return (ButtonController) this.c.get(i);
    }

    public List<ButtonController> getButtonControllers() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.c.size(); i++) {
            arrayList.add(this.c.valueAt(i));
        }
        return arrayList;
    }

    public int getId(View view) {
        for (int i = 0; i < this.b.size(); i++) {
            if (view == this.b.valueAt(i)) {
                return this.b.keyAt(i);
            }
        }
        return -1;
    }

    public int getManagedState(int i) {
        return this.c.get(i) != null ? ((ButtonController) this.c.get(i)).getManagedState() : -1;
    }

    public List<ButtonState> getStateList(int i) {
        return this.c.get(i) != null ? ((ButtonController) this.c.get(i)).getStateList() : null;
    }

    public View getView(int i) {
        return (View) this.b.get(i);
    }

    public View getView(String str) {
        if (str != null) {
            for (int i = 0; i < this.b.size(); i++) {
                View view = (View) this.b.valueAt(i);
                if (view.getContext().getResources().getResourceEntryName(view.getId()).equals(str.toLowerCase(Locale.US))) {
                    return view;
                }
            }
        } else {
            Log.e(a, "Unexpected null resource tag!");
        }
        return null;
    }

    public void register(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    register(viewGroup.getChildAt(i));
                }
                return;
            }
            this.b.put(view.getId(), view);
        }
    }

    public void register(ButtonController buttonController) {
        int id = buttonController.getId();
        this.c.append(id, buttonController);
        this.b.put(id, buttonController.getButton());
    }
}
