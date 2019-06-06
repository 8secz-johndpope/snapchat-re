package com.mapbox.services.commons.utils;

import com.mapbox.services.commons.models.Position;
import java.util.ArrayList;
import java.util.List;

public class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    public static List<Position> decode(String str, int i) {
        int length = str.length();
        double pow = Math.pow(10.0d, (double) i);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5;
            int i6 = 1;
            int i7 = 0;
            while (true) {
                i5 = i2 + 1;
                i2 = (str.charAt(i2) - 63) - 1;
                i6 += i2 << i7;
                i7 += 5;
                if (i2 < 31) {
                    break;
                }
                i2 = i5;
            }
            i2 = ((i6 & 1) != 0 ? (i6 >> 1) ^ -1 : i6 >> 1) + i3;
            i3 = 1;
            i6 = 0;
            while (true) {
                i7 = i5 + 1;
                i5 = (str.charAt(i5) - 63) - 1;
                i3 += i5 << i6;
                i6 += 5;
                if (i5 < 31) {
                    break;
                }
                i5 = i7;
            }
            i4 += (i3 & 1) != 0 ? (i3 >> 1) ^ -1 : i3 >> 1;
            double d = (double) i4;
            Double.isNaN(d);
            d /= pow;
            double d2 = (double) i2;
            Double.isNaN(d2);
            arrayList.add(Position.fromCoordinates(d, d2 / pow));
            i3 = i2;
            i2 = i7;
        }
        return arrayList;
    }

    public static String encode(List<Position> list, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        double pow = Math.pow(10.0d, (double) i);
        long j = 0;
        long j2 = 0;
        for (Position position : list) {
            long round = Math.round(position.getLatitude() * pow);
            long round2 = Math.round(position.getLongitude() * pow);
            j2 = round2 - j2;
            encode(round - j, stringBuffer);
            encode(j2, stringBuffer);
            j = round;
            j2 = round2;
        }
        return stringBuffer.toString();
    }

    private static void encode(long j, StringBuffer stringBuffer) {
        j = j < 0 ? (j << 1) ^ -1 : j << 1;
        while (j >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j)) + 63)));
            j >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j + 63)));
    }

    private static double getSqDist(Position position, Position position2) {
        double longitude = position.getLongitude() - position2.getLongitude();
        double latitude = position.getLatitude() - position2.getLatitude();
        return (longitude * longitude) + (latitude * latitude);
    }

    private static double getSqSegDist(Position position, Position position2, Position position3) {
        double longitude = position2.getLongitude();
        double latitude = position2.getLatitude();
        double longitude2 = position3.getLongitude() - longitude;
        double latitude2 = position3.getLatitude() - latitude;
        if (!(longitude2 == 0.0d && latitude2 == 0.0d)) {
            double longitude3 = (((position.getLongitude() - longitude) * longitude2) + ((position.getLatitude() - latitude) * latitude2)) / ((longitude2 * longitude2) + (latitude2 * latitude2));
            if (longitude3 > SIMPLIFY_DEFAULT_TOLERANCE) {
                longitude = position3.getLongitude();
                latitude = position3.getLatitude();
            } else if (longitude3 > 0.0d) {
                longitude += longitude2 * longitude3;
                latitude += latitude2 * longitude3;
            }
        }
        longitude2 = position.getLongitude() - longitude;
        longitude = position.getLatitude() - latitude;
        return (longitude2 * longitude2) + (longitude * longitude);
    }

    public static Position[] simplify(Position[] positionArr) {
        return simplify(positionArr, SIMPLIFY_DEFAULT_TOLERANCE, false);
    }

    public static Position[] simplify(Position[] positionArr, double d) {
        return simplify(positionArr, d, false);
    }

    public static Position[] simplify(Position[] positionArr, double d, boolean z) {
        if (positionArr.length <= 2) {
            return positionArr;
        }
        d *= d;
        if (!z) {
            positionArr = simplifyRadialDist(positionArr, d);
        }
        return simplifyDouglasPeucker(positionArr, d);
    }

    public static Position[] simplify(Position[] positionArr, boolean z) {
        return simplify(positionArr, SIMPLIFY_DEFAULT_TOLERANCE, z);
    }

    private static Position[] simplifyDouglasPeucker(Position[] positionArr, double d) {
        int length = positionArr.length - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(positionArr[0]);
        arrayList.addAll(simplifyDpStep(positionArr, 0, length, d, arrayList));
        arrayList.add(positionArr[length]);
        return (Position[]) arrayList.toArray(new Position[arrayList.size()]);
    }

    private static List<Position> simplifyDpStep(Position[] positionArr, int i, int i2, double d, List<Position> list) {
        ArrayList arrayList = new ArrayList();
        double d2 = d;
        int i3 = 0;
        for (int i4 = i + 1; i4 < i2; i4++) {
            double sqSegDist = getSqSegDist(positionArr[i4], positionArr[i], positionArr[i2]);
            if (sqSegDist > d2) {
                i3 = i4;
                d2 = sqSegDist;
            }
        }
        if (d2 > d) {
            if (i3 - i > 1) {
                arrayList.addAll(simplifyDpStep(positionArr, i, i3, d, list));
            }
            arrayList.add(positionArr[i3]);
            if (i2 - i3 > 1) {
                arrayList.addAll(simplifyDpStep(positionArr, i3, i2, d, list));
            }
        }
        return arrayList;
    }

    private static Position[] simplifyRadialDist(Position[] positionArr, double d) {
        Position position = positionArr[0];
        ArrayList arrayList = new ArrayList();
        arrayList.add(position);
        int length = positionArr.length;
        Position position2 = null;
        for (int i = 1; i < length; i++) {
            position2 = positionArr[i];
            if (getSqDist(position2, position) > d) {
                arrayList.add(position2);
                position = position2;
            }
        }
        if (position != position2) {
            arrayList.add(position2);
        }
        return (Position[]) arrayList.toArray(new Position[arrayList.size()]);
    }
}
