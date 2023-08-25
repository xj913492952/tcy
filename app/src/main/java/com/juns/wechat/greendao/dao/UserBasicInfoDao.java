package com.juns.wechat.greendao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.tongchengyuan.bean.UserBasicInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_BASIC_INFO".
*/
public class UserBasicInfoDao extends AbstractDao<UserBasicInfo, String> {

    public static final String TABLENAME = "USER_BASIC_INFO";

    /**
     * Properties of entity UserBasicInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UserBasicId = new Property(0, String.class, "userBasicId", true, "USER_BASIC_ID");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property Education = new Property(2, String.class, "education", false, "EDUCATION");
        public final static Property Emotion = new Property(3, String.class, "emotion", false, "EMOTION");
        public final static Property Industry = new Property(4, String.class, "industry", false, "INDUSTRY");
        public final static Property WorkArea = new Property(5, String.class, "workArea", false, "WORK_AREA");
        public final static Property CompanyInfo = new Property(6, String.class, "companyInfo", false, "COMPANY_INFO");
        public final static Property HometownInfo = new Property(7, String.class, "hometownInfo", false, "HOMETOWN_INFO");
        public final static Property MyHeart = new Property(8, String.class, "myHeart", false, "MY_HEART");
    }


    public UserBasicInfoDao(DaoConfig config) {
        super(config);
    }
    
    public UserBasicInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_BASIC_INFO\" (" + //
                "\"USER_BASIC_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: userBasicId
                "\"USER_ID\" TEXT," + // 1: userId
                "\"EDUCATION\" TEXT," + // 2: education
                "\"EMOTION\" TEXT," + // 3: emotion
                "\"INDUSTRY\" TEXT," + // 4: industry
                "\"WORK_AREA\" TEXT," + // 5: workArea
                "\"COMPANY_INFO\" TEXT," + // 6: companyInfo
                "\"HOMETOWN_INFO\" TEXT," + // 7: hometownInfo
                "\"MY_HEART\" TEXT);"); // 8: myHeart
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_BASIC_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserBasicInfo entity) {
        stmt.clearBindings();
 
        String userBasicId = entity.getUserBasicId();
        if (userBasicId != null) {
            stmt.bindString(1, userBasicId);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String education = entity.getEducation();
        if (education != null) {
            stmt.bindString(3, education);
        }
 
        String emotion = entity.getEmotion();
        if (emotion != null) {
            stmt.bindString(4, emotion);
        }
 
        String industry = entity.getIndustry();
        if (industry != null) {
            stmt.bindString(5, industry);
        }
 
        String workArea = entity.getWorkArea();
        if (workArea != null) {
            stmt.bindString(6, workArea);
        }
 
        String companyInfo = entity.getCompanyInfo();
        if (companyInfo != null) {
            stmt.bindString(7, companyInfo);
        }
 
        String hometownInfo = entity.getHometownInfo();
        if (hometownInfo != null) {
            stmt.bindString(8, hometownInfo);
        }
 
        String myHeart = entity.getMyHeart();
        if (myHeart != null) {
            stmt.bindString(9, myHeart);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserBasicInfo entity) {
        stmt.clearBindings();
 
        String userBasicId = entity.getUserBasicId();
        if (userBasicId != null) {
            stmt.bindString(1, userBasicId);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String education = entity.getEducation();
        if (education != null) {
            stmt.bindString(3, education);
        }
 
        String emotion = entity.getEmotion();
        if (emotion != null) {
            stmt.bindString(4, emotion);
        }
 
        String industry = entity.getIndustry();
        if (industry != null) {
            stmt.bindString(5, industry);
        }
 
        String workArea = entity.getWorkArea();
        if (workArea != null) {
            stmt.bindString(6, workArea);
        }
 
        String companyInfo = entity.getCompanyInfo();
        if (companyInfo != null) {
            stmt.bindString(7, companyInfo);
        }
 
        String hometownInfo = entity.getHometownInfo();
        if (hometownInfo != null) {
            stmt.bindString(8, hometownInfo);
        }
 
        String myHeart = entity.getMyHeart();
        if (myHeart != null) {
            stmt.bindString(9, myHeart);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public UserBasicInfo readEntity(Cursor cursor, int offset) {
        UserBasicInfo entity = new UserBasicInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // userBasicId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // education
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // emotion
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // industry
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // workArea
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // companyInfo
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // hometownInfo
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // myHeart
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserBasicInfo entity, int offset) {
        entity.setUserBasicId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEducation(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEmotion(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIndustry(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setWorkArea(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCompanyInfo(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHometownInfo(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMyHeart(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(UserBasicInfo entity, long rowId) {
        return entity.getUserBasicId();
    }
    
    @Override
    public String getKey(UserBasicInfo entity) {
        if(entity != null) {
            return entity.getUserBasicId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UserBasicInfo entity) {
        return entity.getUserBasicId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
