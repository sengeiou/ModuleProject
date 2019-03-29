package com.feisu.greendao.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.feisu.greendao.radio.FMBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FMBEAN".
*/
public class FMBeanDao extends AbstractDao<FMBean, String> {

    public static final String TABLENAME = "FMBEAN";

    /**
     * Properties of entity FMBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property RadioId = new Property(0, int.class, "radioId", false, "RADIO_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property ParentId = new Property(2, int.class, "parentId", false, "PARENT_ID");
        public final static Property RadioFm = new Property(3, String.class, "radioFm", true, "RADIO_FM");
        public final static Property RadioUrl = new Property(4, String.class, "radioUrl", false, "RADIO_URL");
        public final static Property BackUrl = new Property(5, String.class, "backUrl", false, "BACK_URL");
        public final static Property State = new Property(6, int.class, "state", false, "STATE");
        public final static Property Sort = new Property(7, int.class, "sort", false, "SORT");
        public final static Property Level = new Property(8, int.class, "level", false, "LEVEL");
        public final static Property IsExisUrl = new Property(9, int.class, "isExisUrl", false, "IS_EXIS_URL");
        public final static Property AddTime = new Property(10, String.class, "addTime", false, "ADD_TIME");
        public final static Property UpdateTime = new Property(11, long.class, "updateTime", false, "UPDATE_TIME");
    }


    public FMBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FMBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FMBEAN\" (" + //
                "\"RADIO_ID\" INTEGER NOT NULL ," + // 0: radioId
                "\"NAME\" TEXT," + // 1: name
                "\"PARENT_ID\" INTEGER NOT NULL ," + // 2: parentId
                "\"RADIO_FM\" TEXT PRIMARY KEY NOT NULL ," + // 3: radioFm
                "\"RADIO_URL\" TEXT," + // 4: radioUrl
                "\"BACK_URL\" TEXT," + // 5: backUrl
                "\"STATE\" INTEGER NOT NULL ," + // 6: state
                "\"SORT\" INTEGER NOT NULL ," + // 7: sort
                "\"LEVEL\" INTEGER NOT NULL ," + // 8: level
                "\"IS_EXIS_URL\" INTEGER NOT NULL ," + // 9: isExisUrl
                "\"ADD_TIME\" TEXT," + // 10: addTime
                "\"UPDATE_TIME\" INTEGER NOT NULL );"); // 11: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FMBEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FMBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getRadioId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getParentId());
 
        String radioFm = entity.getRadioFm();
        if (radioFm != null) {
            stmt.bindString(4, radioFm);
        }
 
        String radioUrl = entity.getRadioUrl();
        if (radioUrl != null) {
            stmt.bindString(5, radioUrl);
        }
 
        String backUrl = entity.getBackUrl();
        if (backUrl != null) {
            stmt.bindString(6, backUrl);
        }
        stmt.bindLong(7, entity.getState());
        stmt.bindLong(8, entity.getSort());
        stmt.bindLong(9, entity.getLevel());
        stmt.bindLong(10, entity.getIsExisUrl());
 
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(11, addTime);
        }
        stmt.bindLong(12, entity.getUpdateTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FMBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getRadioId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getParentId());
 
        String radioFm = entity.getRadioFm();
        if (radioFm != null) {
            stmt.bindString(4, radioFm);
        }
 
        String radioUrl = entity.getRadioUrl();
        if (radioUrl != null) {
            stmt.bindString(5, radioUrl);
        }
 
        String backUrl = entity.getBackUrl();
        if (backUrl != null) {
            stmt.bindString(6, backUrl);
        }
        stmt.bindLong(7, entity.getState());
        stmt.bindLong(8, entity.getSort());
        stmt.bindLong(9, entity.getLevel());
        stmt.bindLong(10, entity.getIsExisUrl());
 
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(11, addTime);
        }
        stmt.bindLong(12, entity.getUpdateTime());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3);
    }    

    @Override
    public FMBean readEntity(Cursor cursor, int offset) {
        FMBean entity = new FMBean( //
            cursor.getInt(offset + 0), // radioId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // parentId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // radioFm
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // radioUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // backUrl
            cursor.getInt(offset + 6), // state
            cursor.getInt(offset + 7), // sort
            cursor.getInt(offset + 8), // level
            cursor.getInt(offset + 9), // isExisUrl
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // addTime
            cursor.getLong(offset + 11) // updateTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FMBean entity, int offset) {
        entity.setRadioId(cursor.getInt(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setParentId(cursor.getInt(offset + 2));
        entity.setRadioFm(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRadioUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBackUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setState(cursor.getInt(offset + 6));
        entity.setSort(cursor.getInt(offset + 7));
        entity.setLevel(cursor.getInt(offset + 8));
        entity.setIsExisUrl(cursor.getInt(offset + 9));
        entity.setAddTime(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setUpdateTime(cursor.getLong(offset + 11));
     }
    
    @Override
    protected final String updateKeyAfterInsert(FMBean entity, long rowId) {
        return entity.getRadioFm();
    }
    
    @Override
    public String getKey(FMBean entity) {
        if(entity != null) {
            return entity.getRadioFm();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FMBean entity) {
        return entity.getRadioFm() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}