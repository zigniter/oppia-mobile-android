package org.digitalcampus.oppia.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.digitalcampus.oppia.model.db_model.UserCustomField;

@SuppressWarnings("unchecked")
public final class UserCustomFieldDao_Impl implements UserCustomFieldDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserCustomField;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserCustomField;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserCustomField;

  public UserCustomFieldDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserCustomField = new EntityInsertionAdapter<UserCustomField>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_custom_field`(`_id`,`username`,`field_key`,`value_str`,`value_int`,`value_bool`,`value_float`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCustomField value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getFieldKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFieldKey());
        }
        if (value.getValueStr() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValueStr());
        }
        if (value.getValueInt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getValueInt());
        }
        final Integer _tmp;
        _tmp = value.getValueBool() == null ? null : (value.getValueBool() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        if (value.getValueFloat() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getValueFloat());
        }
      }
    };
    this.__deletionAdapterOfUserCustomField = new EntityDeletionOrUpdateAdapter<UserCustomField>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_custom_field` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCustomField value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUserCustomField = new EntityDeletionOrUpdateAdapter<UserCustomField>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user_custom_field` SET `_id` = ?,`username` = ?,`field_key` = ?,`value_str` = ?,`value_int` = ?,`value_bool` = ?,`value_float` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCustomField value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getFieldKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFieldKey());
        }
        if (value.getValueStr() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValueStr());
        }
        if (value.getValueInt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getValueInt());
        }
        final Integer _tmp;
        _tmp = value.getValueBool() == null ? null : (value.getValueBool() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        if (value.getValueFloat() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getValueFloat());
        }
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insertAll(List<UserCustomField> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserCustomField.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(UserCustomField item) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserCustomField.insertAndReturnId(item);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(UserCustomField... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUserCustomField.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll(List<UserCustomField> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUserCustomField.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(UserCustomField... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfUserCustomField.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateAll(List<UserCustomField> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfUserCustomField.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<UserCustomField> getAll() {
    final String _sql = "SELECT * FROM user_custom_field";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfFieldKey = _cursor.getColumnIndexOrThrow("field_key");
      final int _cursorIndexOfValueStr = _cursor.getColumnIndexOrThrow("value_str");
      final int _cursorIndexOfValueInt = _cursor.getColumnIndexOrThrow("value_int");
      final int _cursorIndexOfValueBool = _cursor.getColumnIndexOrThrow("value_bool");
      final int _cursorIndexOfValueFloat = _cursor.getColumnIndexOrThrow("value_float");
      final List<UserCustomField> _result = new ArrayList<UserCustomField>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserCustomField _item;
        _item = new UserCustomField();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _item.setUsername(_tmpUsername);
        final String _tmpFieldKey;
        _tmpFieldKey = _cursor.getString(_cursorIndexOfFieldKey);
        _item.setFieldKey(_tmpFieldKey);
        final String _tmpValueStr;
        _tmpValueStr = _cursor.getString(_cursorIndexOfValueStr);
        _item.setValueStr(_tmpValueStr);
        final Integer _tmpValueInt;
        if (_cursor.isNull(_cursorIndexOfValueInt)) {
          _tmpValueInt = null;
        } else {
          _tmpValueInt = _cursor.getInt(_cursorIndexOfValueInt);
        }
        _item.setValueInt(_tmpValueInt);
        final Boolean _tmpValueBool;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfValueBool)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfValueBool);
        }
        _tmpValueBool = _tmp == null ? null : _tmp != 0;
        _item.setValueBool(_tmpValueBool);
        final Float _tmpValueFloat;
        if (_cursor.isNull(_cursorIndexOfValueFloat)) {
          _tmpValueFloat = null;
        } else {
          _tmpValueFloat = _cursor.getFloat(_cursorIndexOfValueFloat);
        }
        _item.setValueFloat(_tmpValueFloat);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
