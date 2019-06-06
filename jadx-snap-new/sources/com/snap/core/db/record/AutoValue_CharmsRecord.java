package com.snap.core.db.record;

import com.snap.core.db.column.CharmDataSourceType;
import com.snap.core.db.column.CharmOwnerType;

final class AutoValue_CharmsRecord extends CharmsRecord {
    private final long _id;
    private final String bitmojiTemplateUser1Id;
    private final String bitmojiTemplateUser2Id;
    private final long charmId;
    private final String descriptionTemplate;
    private final String descriptionVariables;
    private final String descriptionVariablesMetadata;
    private final String dialogButtonText;
    private final Long displayCount;
    private final String displayName;
    private final long displayOrder;
    private final String friendmojiTemplateId;
    private final long hidden;
    private final long hideable;
    private final String locale;
    private final String ownerId;
    private final CharmOwnerType ownerType;
    private final String solomojiTemplateId;
    private final CharmDataSourceType source;
    private final String staticImageStickerId;
    private final long unviewed;

    AutoValue_CharmsRecord(long j, String str, long j2, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, String str6, long j3, long j4, long j5, String str7, String str8, String str9, String str10, String str11, String str12, CharmDataSourceType charmDataSourceType, long j6, Long l) {
        String str13 = str;
        CharmOwnerType charmOwnerType2 = charmOwnerType;
        String str14 = str2;
        String str15 = str3;
        String str16 = str7;
        String str17 = str12;
        CharmDataSourceType charmDataSourceType2 = charmDataSourceType;
        this._id = j;
        if (str13 != null) {
            this.ownerId = str13;
            this.charmId = j2;
            if (charmOwnerType2 != null) {
                this.ownerType = charmOwnerType2;
                if (str14 != null) {
                    this.displayName = str14;
                    if (str15 != null) {
                        this.descriptionTemplate = str15;
                        this.descriptionVariables = str4;
                        this.descriptionVariablesMetadata = str5;
                        this.dialogButtonText = str6;
                        this.hideable = j3;
                        this.displayOrder = j4;
                        this.unviewed = j5;
                        if (str16 != null) {
                            this.staticImageStickerId = str16;
                            this.solomojiTemplateId = str8;
                            this.friendmojiTemplateId = str9;
                            this.bitmojiTemplateUser1Id = str10;
                            this.bitmojiTemplateUser2Id = str11;
                            if (str17 != null) {
                                this.locale = str17;
                                if (charmDataSourceType2 != null) {
                                    this.source = charmDataSourceType2;
                                    this.hidden = j6;
                                    this.displayCount = l;
                                    return;
                                }
                                throw new NullPointerException("Null source");
                            }
                            throw new NullPointerException("Null locale");
                        }
                        throw new NullPointerException("Null staticImageStickerId");
                    }
                    throw new NullPointerException("Null descriptionTemplate");
                }
                throw new NullPointerException("Null displayName");
            }
            throw new NullPointerException("Null ownerType");
        }
        throw new NullPointerException("Null ownerId");
    }

    public final long _id() {
        return this._id;
    }

    public final String bitmojiTemplateUser1Id() {
        return this.bitmojiTemplateUser1Id;
    }

    public final String bitmojiTemplateUser2Id() {
        return this.bitmojiTemplateUser2Id;
    }

    public final long charmId() {
        return this.charmId;
    }

    public final String descriptionTemplate() {
        return this.descriptionTemplate;
    }

    public final String descriptionVariables() {
        return this.descriptionVariables;
    }

    public final String descriptionVariablesMetadata() {
        return this.descriptionVariablesMetadata;
    }

    public final String dialogButtonText() {
        return this.dialogButtonText;
    }

    public final Long displayCount() {
        return this.displayCount;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final long displayOrder() {
        return this.displayOrder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CharmsRecord) {
            CharmsRecord charmsRecord = (CharmsRecord) obj;
            if (this._id == charmsRecord._id() && this.ownerId.equals(charmsRecord.ownerId()) && this.charmId == charmsRecord.charmId() && this.ownerType.equals(charmsRecord.ownerType()) && this.displayName.equals(charmsRecord.displayName()) && this.descriptionTemplate.equals(charmsRecord.descriptionTemplate())) {
                String str = this.descriptionVariables;
                if (str != null ? !str.equals(charmsRecord.descriptionVariables()) : charmsRecord.descriptionVariables() != null) {
                    str = this.descriptionVariablesMetadata;
                    if (str != null ? !str.equals(charmsRecord.descriptionVariablesMetadata()) : charmsRecord.descriptionVariablesMetadata() != null) {
                        str = this.dialogButtonText;
                        if (str != null ? !str.equals(charmsRecord.dialogButtonText()) : charmsRecord.dialogButtonText() != null) {
                            if (this.hideable == charmsRecord.hideable() && this.displayOrder == charmsRecord.displayOrder() && this.unviewed == charmsRecord.unviewed() && this.staticImageStickerId.equals(charmsRecord.staticImageStickerId())) {
                                str = this.solomojiTemplateId;
                                if (str != null ? !str.equals(charmsRecord.solomojiTemplateId()) : charmsRecord.solomojiTemplateId() != null) {
                                    str = this.friendmojiTemplateId;
                                    if (str != null ? !str.equals(charmsRecord.friendmojiTemplateId()) : charmsRecord.friendmojiTemplateId() != null) {
                                        str = this.bitmojiTemplateUser1Id;
                                        if (str != null ? !str.equals(charmsRecord.bitmojiTemplateUser1Id()) : charmsRecord.bitmojiTemplateUser1Id() != null) {
                                            str = this.bitmojiTemplateUser2Id;
                                            if (str != null ? !str.equals(charmsRecord.bitmojiTemplateUser2Id()) : charmsRecord.bitmojiTemplateUser2Id() != null) {
                                                if (this.locale.equals(charmsRecord.locale()) && this.source.equals(charmsRecord.source()) && this.hidden == charmsRecord.hidden()) {
                                                    Long l = this.displayCount;
                                                    return l != null ? !l.equals(charmsRecord.displayCount()) : charmsRecord.displayCount() != null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String friendmojiTemplateId() {
        return this.friendmojiTemplateId;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
        long j2 = this.charmId;
        hashCode = (((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.ownerType.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003) ^ this.descriptionTemplate.hashCode()) * 1000003;
        String str = this.descriptionVariables;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.descriptionVariablesMetadata;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.dialogButtonText;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.hideable;
        hashCode = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j3 = this.displayOrder;
        hashCode = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j3 = this.unviewed;
        hashCode = (((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.staticImageStickerId.hashCode()) * 1000003;
        str = this.solomojiTemplateId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendmojiTemplateId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiTemplateUser1Id;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiTemplateUser2Id;
        hashCode = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.locale.hashCode()) * 1000003) ^ this.source.hashCode()) * 1000003;
        j3 = this.hidden;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        Long l = this.displayCount;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final long hidden() {
        return this.hidden;
    }

    public final long hideable() {
        return this.hideable;
    }

    public final String locale() {
        return this.locale;
    }

    public final String ownerId() {
        return this.ownerId;
    }

    public final CharmOwnerType ownerType() {
        return this.ownerType;
    }

    public final String solomojiTemplateId() {
        return this.solomojiTemplateId;
    }

    public final CharmDataSourceType source() {
        return this.source;
    }

    public final String staticImageStickerId() {
        return this.staticImageStickerId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharmsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", ownerId=");
        stringBuilder.append(this.ownerId);
        stringBuilder.append(", charmId=");
        stringBuilder.append(this.charmId);
        stringBuilder.append(", ownerType=");
        stringBuilder.append(this.ownerType);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", descriptionTemplate=");
        stringBuilder.append(this.descriptionTemplate);
        stringBuilder.append(", descriptionVariables=");
        stringBuilder.append(this.descriptionVariables);
        stringBuilder.append(", descriptionVariablesMetadata=");
        stringBuilder.append(this.descriptionVariablesMetadata);
        stringBuilder.append(", dialogButtonText=");
        stringBuilder.append(this.dialogButtonText);
        stringBuilder.append(", hideable=");
        stringBuilder.append(this.hideable);
        stringBuilder.append(", displayOrder=");
        stringBuilder.append(this.displayOrder);
        stringBuilder.append(", unviewed=");
        stringBuilder.append(this.unviewed);
        stringBuilder.append(", staticImageStickerId=");
        stringBuilder.append(this.staticImageStickerId);
        stringBuilder.append(", solomojiTemplateId=");
        stringBuilder.append(this.solomojiTemplateId);
        stringBuilder.append(", friendmojiTemplateId=");
        stringBuilder.append(this.friendmojiTemplateId);
        stringBuilder.append(", bitmojiTemplateUser1Id=");
        stringBuilder.append(this.bitmojiTemplateUser1Id);
        stringBuilder.append(", bitmojiTemplateUser2Id=");
        stringBuilder.append(this.bitmojiTemplateUser2Id);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.locale);
        stringBuilder.append(", source=");
        stringBuilder.append(this.source);
        stringBuilder.append(", hidden=");
        stringBuilder.append(this.hidden);
        stringBuilder.append(", displayCount=");
        stringBuilder.append(this.displayCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long unviewed() {
        return this.unviewed;
    }
}
