package com.brightcove.player.model;

import com.brightcove.player.util.ErrorUtil;
import java.util.Map;

public class CuePoint extends MetadataObject implements Comparable<CuePoint> {
    private PositionType b;
    private int c;
    private String d;

    public enum PositionType {
        BEFORE,
        POINT_IN_TIME,
        AFTER
    }

    public CuePoint(int i, String str, Map<String, Object> map) {
        super(map);
        this.b = PositionType.POINT_IN_TIME;
        this.c = i;
        this.d = str;
    }

    public CuePoint(PositionType positionType, String str, Map<String, Object> map) {
        super(map);
        if (positionType != PositionType.POINT_IN_TIME) {
            this.b = positionType;
            this.d = str;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.OTHER_CONSTRUCTOR));
    }

    public int compareTo(CuePoint cuePoint) {
        if (this.b != PositionType.BEFORE || cuePoint.b == PositionType.BEFORE) {
            if (this.b == PositionType.AFTER && cuePoint.b != PositionType.AFTER) {
                return 1;
            }
            if (this.b == PositionType.POINT_IN_TIME) {
                if (cuePoint.b == PositionType.BEFORE) {
                    return 1;
                }
                if (cuePoint.b != PositionType.AFTER) {
                    int i = this.c;
                    int i2 = cuePoint.c;
                    if (i >= i2) {
                        if (i > i2) {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CuePoint) && compareTo((CuePoint) obj) == 0;
    }

    public int getPosition() {
        if (this.b == PositionType.POINT_IN_TIME) {
            return this.c;
        }
        throw new IllegalStateException(String.format(ErrorUtil.getMessage(ErrorUtil.INVALID_POINT_IN_TIME), new Object[]{this.b.toString()}));
    }

    public PositionType getPositionType() {
        return this.b;
    }

    public String getType() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CuePoint {");
        stringBuilder.append("position:");
        stringBuilder.append(this.c);
        stringBuilder.append(" positionType:");
        Object obj = this.b;
        String str = "null";
        if (obj == null) {
            obj = str;
        }
        stringBuilder.append(obj);
        stringBuilder.append(" type:");
        String str2 = this.d;
        if (str2 == null) {
            str2 = str;
        }
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
