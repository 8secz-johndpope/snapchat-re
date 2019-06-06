package org.jcodec.containers.mp4.boxes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class MetaBox extends NodeBox {
    private static final String FOURCC = "meta";

    public MetaBox() {
        this(Header.createHeader(fourcc(), 0));
    }

    public MetaBox(Header header) {
        super(header);
    }

    private void dropChildBox(List<Box> list, String str) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (str.equals(((Box) listIterator.next()).getFourcc())) {
                listIterator.remove();
            }
        }
    }

    public static String fourcc() {
        return "meta";
    }

    private DataBox getDataBox(List<Box> list) {
        for (Box box : list) {
            if (box instanceof DataBox) {
                return (DataBox) box;
            }
        }
        return null;
    }

    public Map<Integer, MetaValue> getItunesMeta() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IListBox iListBox = (IListBox) NodeBox.findFirst(this, IListBox.class, IListBox.fourcc());
        if (iListBox == null) {
            return linkedHashMap;
        }
        for (Entry entry : iListBox.getValues().entrySet()) {
            Integer num = (Integer) entry.getKey();
            if (num != null) {
                DataBox dataBox = getDataBox((List) entry.getValue());
                if (dataBox != null) {
                    linkedHashMap.put(num, MetaValue.createOtherWithLocale(dataBox.getType(), dataBox.getLocale(), dataBox.getData()));
                }
            }
        }
        return linkedHashMap;
    }

    public Map<String, MetaValue> getKeyedMeta() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IListBox iListBox = (IListBox) NodeBox.findFirst(this, IListBox.class, IListBox.fourcc());
        MdtaBox[] mdtaBoxArr = (MdtaBox[]) NodeBox.findAllPath(this, MdtaBox.class, new String[]{KeysBox.fourcc(), MdtaBox.fourcc()});
        if (!(iListBox == null || mdtaBoxArr.length == 0)) {
            for (Entry entry : iListBox.getValues().entrySet()) {
                Integer num = (Integer) entry.getKey();
                if (num != null) {
                    DataBox dataBox = getDataBox((List) entry.getValue());
                    if (dataBox != null) {
                        MetaValue createOtherWithLocale = MetaValue.createOtherWithLocale(dataBox.getType(), dataBox.getLocale(), dataBox.getData());
                        if (num.intValue() > 0 && num.intValue() <= mdtaBoxArr.length) {
                            linkedHashMap.put(mdtaBoxArr[num.intValue() - 1].getKey(), createOtherWithLocale);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public void setItunesMeta(Map<Integer, MetaValue> map) {
        if (!map.isEmpty()) {
            Map linkedHashMap;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(map);
            IListBox iListBox = (IListBox) NodeBox.findFirst(this, IListBox.class, IListBox.fourcc());
            if (iListBox == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = iListBox.getValues();
                for (Entry entry : linkedHashMap.entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    MetaValue metaValue = (MetaValue) linkedHashMap2.get(Integer.valueOf(intValue));
                    if (metaValue != null) {
                        DataBox dataBox = new DataBox(metaValue.getType(), metaValue.getLocale(), metaValue.getData());
                        dropChildBox((List) entry.getValue(), DataBox.fourcc());
                        ((List) entry.getValue()).add(dataBox);
                        linkedHashMap2.remove(Integer.valueOf(intValue));
                    }
                }
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                int intValue2 = ((Integer) entry2.getKey()).intValue();
                MetaValue metaValue2 = (MetaValue) entry2.getValue();
                DataBox dataBox2 = new DataBox(metaValue2.getType(), metaValue2.getLocale(), metaValue2.getData());
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(Integer.valueOf(intValue2), arrayList);
                arrayList.add(dataBox2);
            }
            HashSet<Integer> hashSet = new HashSet(linkedHashMap.keySet());
            hashSet.removeAll(map.keySet());
            for (Integer remove : hashSet) {
                linkedHashMap.remove(remove);
            }
            replaceBox(new IListBox(linkedHashMap));
        }
    }

    public void setKeyedMeta(Map<String, MetaValue> map) {
        if (!map.isEmpty()) {
            KeysBox keysBox = new KeysBox();
            Map linkedHashMap = new LinkedHashMap();
            int i = 1;
            for (Entry entry : map.entrySet()) {
                keysBox.add(new MdtaBox((String) entry.getKey()));
                MetaValue metaValue = (MetaValue) entry.getValue();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new DataBox(metaValue.getType(), metaValue.getLocale(), metaValue.getData()));
                linkedHashMap.put(Integer.valueOf(i), arrayList);
                i++;
            }
            IListBox iListBox = new IListBox(linkedHashMap);
            replaceBox(keysBox);
            replaceBox(iListBox);
        }
    }
}
