package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: hi */
public final class hi {
    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !hi.a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !hi.a(xmlPullParser, str) ? 0 : typedArray.getResourceId(i, 0);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !hi.a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static TypedArray a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        return !hi.a(xmlPullParser, str) ? null : typedArray.peekValue(0);
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !hi.a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !hi.a(xmlPullParser, str) ? null : typedArray.getString(i);
    }
}
