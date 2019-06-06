package com.mapbox.mapboxsdk.style.sources;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.snap.core.db.record.UnlockablesModel;
import java.util.HashMap;
import java.util.Map;

public class TileSet {
    private String attribution;
    private Float[] bounds;
    private Float[] center;
    private String[] data;
    private String description;
    private String[] grids;
    private String legend;
    private Float maxZoom;
    private Float minZoom;
    private String name;
    private String scheme;
    private String template;
    private final String tilejson;
    private final String[] tiles;
    private String version;

    public TileSet(String str, String... strArr) {
        this.tilejson = str;
        this.tiles = strArr;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Float[] getBounds() {
        return this.bounds;
    }

    public Float[] getCenter() {
        return this.center;
    }

    public String[] getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String[] getGrids() {
        return this.grids;
    }

    public String getLegend() {
        return this.legend;
    }

    public float getMaxZoom() {
        return this.maxZoom.floatValue();
    }

    public float getMinZoom() {
        return this.minZoom.floatValue();
    }

    public String getName() {
        return this.name;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getTemplate() {
        return this.template;
    }

    public String getTilejson() {
        return this.tilejson;
    }

    public String[] getTiles() {
        return this.tiles;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAttribution(String str) {
        this.attribution = str;
    }

    public void setBounds(Float... fArr) {
        this.bounds = fArr;
    }

    public void setCenter(LatLng latLng) {
        this.center = new Float[]{Float.valueOf((float) latLng.getLongitude()), Float.valueOf((float) latLng.getLatitude())};
    }

    public void setCenter(Float... fArr) {
        this.center = fArr;
    }

    public void setData(String... strArr) {
        this.data = strArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGrids(String... strArr) {
        this.grids = strArr;
    }

    public void setLegend(String str) {
        this.legend = str;
    }

    public void setMaxZoom(float f) {
        this.maxZoom = Float.valueOf(f);
    }

    public void setMinZoom(float f) {
        this.minZoom = Float.valueOf(f);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    /* Access modifiers changed, original: 0000 */
    public Map<String, Object> toValueObject() {
        HashMap hashMap = new HashMap();
        hashMap.put("tilejson", this.tilejson);
        hashMap.put("tiles", this.tiles);
        String str = this.name;
        if (str != null) {
            hashMap.put("name", str);
        }
        str = this.description;
        if (str != null) {
            hashMap.put("description", str);
        }
        str = this.version;
        if (str != null) {
            hashMap.put("version", str);
        }
        str = this.attribution;
        if (str != null) {
            hashMap.put("attribution", str);
        }
        str = this.template;
        if (str != null) {
            hashMap.put("template", str);
        }
        str = this.legend;
        if (str != null) {
            hashMap.put("legend", str);
        }
        str = this.scheme;
        if (str != null) {
            hashMap.put("scheme", str);
        }
        String[] strArr = this.grids;
        if (strArr != null) {
            hashMap.put("grids", strArr);
        }
        strArr = this.data;
        if (strArr != null) {
            hashMap.put(UnlockablesModel.DATA, strArr);
        }
        Float f = this.minZoom;
        if (f != null) {
            hashMap.put("minzoom", f);
        }
        f = this.maxZoom;
        if (f != null) {
            hashMap.put("maxzoom", f);
        }
        Float[] fArr = this.bounds;
        if (fArr != null) {
            hashMap.put("bounds", fArr);
        }
        fArr = this.center;
        if (fArr != null) {
            hashMap.put("center", fArr);
        }
        return hashMap;
    }
}
