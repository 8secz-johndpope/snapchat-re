package com.mapbox.services.commons.models;

import com.mapbox.services.commons.utils.TextUtils;
import defpackage.cgp;
import java.util.logging.Logger;

public class Position {
    private static final Logger logger = Logger.getLogger(Position.class.getSimpleName());
    private final double altitude;
    private final double latitude;
    private final double longitude;

    private Position(double d, double d2, double d3) {
        this.longitude = d;
        this.latitude = d2;
        this.altitude = d3;
        if (d2 != Double.POSITIVE_INFINITY && (d2 < -90.0d || d2 > 90.0d)) {
            logger.warning(String.format(cgp.a, "Latitude value seems to be out of range (found: %s, expected: [-90, 90]). Did you accidentally reverse the longitude/latitude order?", new Object[]{TextUtils.formatCoordinate(d2)}));
        }
        if (d == Double.POSITIVE_INFINITY) {
            return;
        }
        if (d < -180.0d || d > 180.0d) {
            logger.warning(String.format(cgp.a, "Longitude value seems to be out of range (found: %s, expected: [-180, 180]). Did you accidentally reverse the longitude/latitude order?", new Object[]{TextUtils.formatCoordinate(d)}));
        }
    }

    public static Position fromCoordinates(double d, double d2) {
        return new Position(d, d2, Double.NaN);
    }

    public static Position fromCoordinates(double d, double d2, double d3) {
        return new Position(d, d2, d3);
    }

    public static Position fromCoordinates(double[] dArr) {
        return dArr.length == 3 ? fromCoordinates(dArr[0], dArr[1], dArr[2]) : fromCoordinates(dArr[0], dArr[1]);
    }

    public static Position fromLngLat(double d, double d2) {
        return fromCoordinates(d, d2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Position position = (Position) obj;
        return (position.getLatitude() == this.latitude && position.getLongitude() == this.longitude && Double.isNaN(position.getAltitude()) == Double.isNaN(this.altitude)) ? Double.isNaN(this.altitude) || position.getAltitude() == this.altitude : false;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double[] getCoordinates() {
        if (hasAltitude()) {
            return new double[]{getLongitude(), getLatitude(), getAltitude()};
        }
        return new double[]{getLongitude(), getLatitude()};
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean hasAltitude() {
        return !Double.isNaN(this.altitude);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Position [longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", altitude=");
        stringBuilder.append(this.altitude);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
