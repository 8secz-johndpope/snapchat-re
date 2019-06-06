package com.brightcove.player.model;

import android.util.Log;
import com.brightcove.player.model.StyledElement.Unit;
import com.brightcove.player.util.StringUtil;
import java.io.Serializable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Length implements Serializable {
    public static final Pattern PATTERN = Pattern.compile("^([0-9.-]+)(%|px|ems|pt)$");
    public static final String TAG = "Length";
    private Double a;
    private Unit b;

    public Length(double d, Unit unit) {
        if (unit != null) {
            this.a = Double.valueOf(d);
            this.b = unit;
            return;
        }
        throw new IllegalArgumentException("must provide a Unit");
    }

    public Length(String str) {
        if (StringUtil.isEmpty(str)) {
            throw new IllegalArgumentException("must provide a non-empty expression String");
        }
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.find() || matcher.groupCount() < 2) {
            Log.w(TAG, "unmatched: ".concat(String.valueOf(str)));
            return;
        }
        str = matcher.group(1);
        String group = matcher.group(2);
        if (StringUtil.isEmpty(str)) {
            throw new IllegalArgumentException("invalid number format: ".concat(String.valueOf(str)));
        } else if (StringUtil.isEmpty(group)) {
            throw new IllegalArgumentException("invalid unit format: ".concat(String.valueOf(group)));
        } else {
            this.a = Double.valueOf(Double.parseDouble(str));
            this.b = Unit.fromString(group.toUpperCase(Locale.US));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Length length = (Length) obj;
        return Double.compare(length.a.doubleValue(), this.a.doubleValue()) == 0 && this.b == length.b;
    }

    public Unit getUnit() {
        return this.b;
    }

    public double getValue() {
        return this.a.doubleValue();
    }

    public int hashCode() {
        long doubleToLongBits = this.a.doubleValue() != 0.0d ? Double.doubleToLongBits(this.a.doubleValue()) : 0;
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + this.b.hashCode();
    }
}
