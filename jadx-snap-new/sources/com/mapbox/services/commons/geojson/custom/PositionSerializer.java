package com.mapbox.services.commons.geojson.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.services.commons.models.Position;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PositionSerializer implements JsonSerializer<Position> {
    public JsonElement serialize(Position position, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        Number stripTrailingZeros = new BigDecimal(position.getLatitude()).setScale(7, RoundingMode.HALF_UP).stripTrailingZeros();
        jsonArray.add(new JsonPrimitive(new BigDecimal(position.getLongitude()).setScale(7, RoundingMode.HALF_UP).stripTrailingZeros()));
        jsonArray.add(new JsonPrimitive(stripTrailingZeros));
        if (position.hasAltitude()) {
            jsonArray.add(new JsonPrimitive(Double.valueOf(position.getAltitude())));
        }
        return jsonArray;
    }
}
