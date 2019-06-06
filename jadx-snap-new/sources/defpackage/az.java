package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import defpackage.bd.a;
import defpackage.bd.b;
import java.util.Arrays;

/* renamed from: az */
public abstract class az extends View {
    private Context a;
    protected int[] b;
    protected int c;
    protected br d;
    protected boolean e;
    private String f;

    public az(Context context) {
        super(context);
        this.b = new int[32];
        this.c = 0;
        this.d = null;
        this.e = false;
        this.a = context;
        a(null);
    }

    public az(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.c = 0;
        this.d = null;
        this.e = false;
        this.a = context;
        a(attributeSet);
    }

    private void a(String str) {
        if (str != null && this.a != null) {
            str = str.trim();
            int i = 0;
            try {
                i = a.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
            if (i == 0) {
                i = this.a.getResources().getIdentifier(str, "id", this.a.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
                if (str instanceof String) {
                    String str2 = str;
                    if (constraintLayout.c != null && constraintLayout.c.containsKey(str2)) {
                        obj = constraintLayout.c.get(str2);
                        if (obj != null && (obj instanceof Integer)) {
                            i = ((Integer) obj).intValue();
                        }
                    }
                }
                obj = null;
                i = ((Integer) obj).intValue();
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Could not find id of \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            Log.w("ConstraintHelper", stringBuilder.toString());
        }
    }

    private void b(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            b(this.f);
        }
        br brVar = this.d;
        if (brVar != null) {
            brVar.B();
            for (int i = 0; i < this.c; i++) {
                View findViewById = constraintLayout.findViewById(this.b[i]);
                if (findViewById != null) {
                    this.d.a(constraintLayout.a(findViewById));
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f = obtainStyledAttributes.getString(index);
                    b(this.f);
                }
            }
        }
    }

    public final void a(int[] iArr) {
        int i = 0;
        this.c = 0;
        while (i < iArr.length) {
            setTag(iArr[i], null);
            i++;
        }
    }

    public final int[] a() {
        return Arrays.copyOf(this.b, this.c);
    }

    public final void b() {
        if (this.d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).aj = this.d;
            }
        }
    }

    public void c() {
    }

    public void onDraw(Canvas canvas) {
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setTag(int i, Object obj) {
        int i2 = this.c + 1;
        int[] iArr = this.b;
        if (i2 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }
}
