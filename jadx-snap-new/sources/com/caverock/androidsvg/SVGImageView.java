package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import defpackage.apy;
import defpackage.aqb;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {
    private static Method a;

    class a extends AsyncTask<String, Integer, Picture> {
        private a() {
        }

        /* synthetic */ a(SVGImageView sVGImageView, byte b) {
            this();
        }

        private Picture a(String... strArr) {
            String stringBuilder;
            String str = "SVGImageView";
            Object strArr2;
            try {
                strArr2 = apy.a(SVGImageView.this.getContext().getAssets(), strArr2[0]).a();
                return strArr2;
            } catch (aqb e) {
                StringBuilder stringBuilder2 = new StringBuilder("Error loading file ");
                stringBuilder2.append(strArr2);
                stringBuilder2.append(": ");
                stringBuilder2.append(e.getMessage());
                stringBuilder = stringBuilder2.toString();
                Log.e(str, stringBuilder);
                return null;
            } catch (FileNotFoundException unused) {
                stringBuilder = "File not found: ".concat(String.valueOf(strArr2));
                Log.e(str, stringBuilder);
                return null;
            } catch (IOException e2) {
                Log.e(str, "Unable to load asset file: ".concat(String.valueOf(strArr2)), e2);
                return null;
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((String[]) objArr);
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Picture picture = (Picture) obj;
            if (picture != null) {
                SVGImageView.this.a();
                SVGImageView.this.setImageDrawable(new PictureDrawable(picture));
            }
        }
    }

    class b extends AsyncTask<Integer, Integer, Picture> {
        private b() {
        }

        /* synthetic */ b(SVGImageView sVGImageView, byte b) {
            this();
        }

        private Picture a(Integer... numArr) {
            try {
                Context context = SVGImageView.this.getContext();
                numArr = apy.a(context.getResources(), numArr[0].intValue()).a();
                return numArr;
            } catch (aqb e) {
                String str = "SVGImageView";
                Log.e(str, String.format("Error loading resource 0x%x: %s", new Object[]{numArr, e.getMessage()}));
                return null;
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Integer[]) objArr);
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Picture picture = (Picture) obj;
            if (picture != null) {
                SVGImageView.this.a();
                SVGImageView.this.setImageDrawable(new PictureDrawable(picture));
            }
        }
    }

    class c extends AsyncTask<InputStream, Integer, Picture> {
        private c() {
        }

        /* synthetic */ c(SVGImageView sVGImageView, byte b) {
            this();
        }

        private static Picture a(InputStream... inputStreamArr) {
            try {
                Picture a = apy.a(inputStreamArr[0]).a();
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused) {
                }
                return a;
            } catch (aqb e) {
                StringBuilder stringBuilder = new StringBuilder("Parse error loading URI: ");
                stringBuilder.append(e.getMessage());
                Log.e("SVGImageView", stringBuilder.toString());
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th) {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((InputStream[]) objArr);
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Picture picture = (Picture) obj;
            if (picture != null) {
                SVGImageView.this.a();
                SVGImageView.this.setImageDrawable(new PictureDrawable(picture));
            }
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        try {
            a = View.class.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, defpackage.apx.a.a, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                if (resourceId != -1) {
                    setImageResource(resourceId);
                    return;
                }
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    if (a(Uri.parse(string), false)) {
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    new a(this, (byte) 0).execute(new String[]{string});
                }
                obtainStyledAttributes.recycle();
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private boolean a(Uri uri, boolean z) {
        Object uri2;
        try {
            uri2 = getContext().getContentResolver().openInputStream(uri2);
            new c(this, (byte) 0).execute(new InputStream[]{uri2});
            return true;
        } catch (FileNotFoundException unused) {
            if (z) {
                Log.e("SVGImageView", "File not found: ".concat(String.valueOf(uri2)));
            }
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (a != null) {
            try {
                int i = View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()));
                a.invoke(this, new Object[]{Integer.valueOf(i), null});
            } catch (Exception e) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
            }
        }
    }

    public final void a(apy apy) {
        if (apy != null) {
            a();
            setImageDrawable(new PictureDrawable(apy.a()));
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public void setImageResource(int i) {
        new b(this, (byte) 0).execute(new Integer[]{Integer.valueOf(i)});
    }

    public void setImageURI(Uri uri) {
        a(uri, true);
    }
}
