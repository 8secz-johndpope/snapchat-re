package com.brightcove.player.captioning.preferences;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.preference.DialogPreference;
import android.preference.Preference.BaseSavedState;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

public abstract class ListDialogPreference extends DialogPreference {
    int[] a;
    int b;
    private CharSequence[] c;
    private OnValueChangedListener d;
    private int e;
    private int f;
    private boolean g;

    public interface OnValueChangedListener {
        void onValueChanged(ListDialogPreference listDialogPreference, int i);
    }

    class a extends BaseAdapter {
        private LayoutInflater a;

        private a() {
        }

        /* synthetic */ a(ListDialogPreference listDialogPreference, byte b) {
            this();
        }

        public final int getCount() {
            return ListDialogPreference.this.a.length;
        }

        public final /* synthetic */ Object getItem(int i) {
            return Integer.valueOf(ListDialogPreference.this.a[i]);
        }

        public final long getItemId(int i) {
            return (long) ListDialogPreference.this.a[i];
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                if (this.a == null) {
                    this.a = LayoutInflater.from(viewGroup.getContext());
                }
                view = this.a.inflate(ListDialogPreference.this.b, viewGroup, false);
            }
            ListDialogPreference.this.a(view, i);
            return view;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    static class b extends BaseSavedState {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }
        };
        public int a;

        public b(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public ListDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int b(int i) {
        int[] iArr = this.a;
        if (iArr != null) {
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (iArr[i2] == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: protected */
    public CharSequence a(int i) {
        CharSequence[] charSequenceArr = this.c;
        return (charSequenceArr == null || charSequenceArr.length <= i) ? null : charSequenceArr[i];
    }

    public abstract void a(View view, int i);

    public CharSequence getSummary() {
        int i = this.f;
        return i >= 0 ? a(i) : null;
    }

    public int getValue() {
        return this.e;
    }

    /* Access modifiers changed, original: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* Access modifiers changed, original: protected */
    @TargetApi(16)
    public void onPrepareDialogBuilder(Builder builder) {
        super.onPrepareDialogBuilder(builder);
        Context context = getContext();
        View inflate = LayoutInflater.from(context).inflate(getDialogLayoutResource(), null);
        AbsListView absListView = (AbsListView) inflate.findViewById(16908298);
        absListView.setAdapter(new a(this, (byte) 0));
        absListView.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                int i2 = (int) j;
                if (ListDialogPreference.this.callChangeListener(Integer.valueOf(i2))) {
                    ListDialogPreference.this.setValue(i2);
                }
                Dialog dialog = ListDialogPreference.this.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        int b = b(this.e);
        if (b != -1) {
            absListView.setSelection(b);
        }
        builder.setView(inflate);
        builder.setPositiveButton(null, null);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setValue(bVar.a);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        b bVar = new b(onSaveInstanceState);
        bVar.a = getValue();
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        setValue(z ? getPersistedInt(this.e) : ((Integer) obj).intValue());
    }

    public void setListItemLayoutResource(int i) {
        this.b = i;
    }

    public void setOnValueChangedListener(OnValueChangedListener onValueChangedListener) {
        this.d = onValueChangedListener;
    }

    public void setTitles(CharSequence[] charSequenceArr) {
        this.c = charSequenceArr;
    }

    public void setValue(int i) {
        Object obj = this.e != i ? 1 : null;
        if (obj != null || !this.g) {
            this.e = i;
            this.f = b(i);
            this.g = true;
            persistInt(i);
            if (obj != null) {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
            OnValueChangedListener onValueChangedListener = this.d;
            if (onValueChangedListener != null) {
                onValueChangedListener.onValueChanged(this, i);
            }
        }
    }

    public void setValues(int[] iArr) {
        this.a = iArr;
        if (this.g && this.f == -1) {
            this.f = b(this.e);
        }
    }
}
