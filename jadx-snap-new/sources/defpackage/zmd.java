package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: zmd */
public abstract class zmd<TData extends zmy> {
    private zke _eventDispatcher;
    private View _itemView;
    private TData _model;
    private final ajei disposables = new ajei();
    private final boolean isBound;

    public zmd() {
        this.isBound = this._model != null;
    }

    public final void bind(TData tData, TData tData2, zke zke) {
        akcr.b(tData, MapboxEvent.KEY_MODEL);
        akcr.b(zke, "eventDispatcher");
        this._eventDispatcher = zke;
        this._model = tData;
        onBind(tData, tData2);
    }

    public final void bindUntilRecycle(ajej ajej) {
        akcr.b(ajej, "disposable");
        this.disposables.a(ajej);
    }

    public void create(View view) {
        akcr.b(view, "itemView");
        this._itemView = view;
        onCreate(view);
    }

    public final zke getEventDispatcher() {
        zke zke = this._eventDispatcher;
        if (zke == null) {
            akcr.a("_eventDispatcher");
        }
        return zke;
    }

    public final View getItemView() {
        View view = this._itemView;
        if (view == null) {
            akcr.a("_itemView");
        }
        return view;
    }

    public final TData getModel() {
        return this._model;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean isBound() {
        return this.isBound;
    }

    public abstract void onBind(TData tData, TData tData2);

    public abstract void onCreate(View view);

    public boolean onFailedToRecycleView() {
        return false;
    }

    public void onRecycle() {
        this.disposables.a();
    }
}
