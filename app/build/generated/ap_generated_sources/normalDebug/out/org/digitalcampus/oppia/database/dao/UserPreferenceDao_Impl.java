package org.digitalcampus.oppia.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.digitalcampus.oppia.model.db_model.UserPreference;

@SuppressWarnings("unchecked")
public final class UserPreferenceDao_Impl implements UserPreferenceDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserPreference;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserPreference;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserPreference;

  public UserPreferenceDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserPreference = new EntityInsertionAdapter<UserPreference>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_preference`(`_id`,`username`,`preference`,`value`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPreference value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getPreference() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPreference());
        }
        if (value.getValue() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValue());
        }
      }
    };
    this.__deletionAdapterOfUserPreference = new EntityDeletionOrUpdateAdapter<UserPreference>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_preference` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPreference value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUserPreference = new EntityDeletionOrUpdateAdapter<UserPreference>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user_preference` SET `_id` = ?,`username` = ?,`preference` = ?,`value` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserPreference value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getPreference() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPreference());
        }
        if (value.getValue() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValue());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void insertAll(List<UserPreference> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserPreference.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(UserPreference item) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserPreference.insertAndReturnId(item);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(UserPreference... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUserPreference.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll(List<UserPreference> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUserPreference.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(UserPreference... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfUserPreference.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateAll(List<UserPreference> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfUserPreference.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<UserPreference> getAll() {
    final String _sql = "SELECT * FROM user_preference";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfPreference = _cursor.getColumnIndexOrThrow("preference");
      final int _cursorIndexOfValue = _cursor.getColumnIndexOrThrow("value");
      final List<UserPreference> _result = new ArrayList<UserPreference>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserPreference _item;
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        final String _tmpPreference;
        _tmpPreference = _cursor.getString(_cursorIndexOfPreference);
        final String _tmpValue;
        _tmpValue = _cursor.getString(_cursorIndexOfValue);
        _item = new UserPreference(_tmpUsername,_tmpPreference,_tmpValue);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserPreference> getAllForUser(String username) {
    final String _sql = "SELECT * FROM user_preference WHERE username = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfPreference = _cursor.getColumnIndexOrThrow("preference");
      final int _cursorIndexOfValue = _cursor.getColumnIndexOrThrow("value");
      final List<UserPreference> _result = new ArrayList<UserPreference>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserPreference _item;
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        final String _tmpPreference;
        _tmpPreference = _cursor.getString(_cursorIndexOfPreference);
        final String _tmpValue;
        _tmpValue = _cursor.getString(_cursorIndexOfValue);
        _item = new UserPreference(_tmpUsername,_tmpPreference,_tmpValue);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public UserPreference getUserPreference(String username, String preferenceKey) {
    final String _sql = "SELECT * FROM user_preference WHERE username = ? AND preference = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    _argIndex = 2;
    if (preferenceKey == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, preferenceKey);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfPreference = _cursor.getColumnIndexOrThrow("preference");
      final int _cursorIndexOfValue = _cursor.getColumnIndexOrThrow("value");
      final UserPreference _result;
      if(_cursor.moveToFirst()) {
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        final String _tmpPreference;
        _tmpPreference = _cursor.getString(_cursorIndexOfPreference);
        final String _tmpValue;
        _tmpValue = _cursor.getString(_cursorIndexOfValue);
        _result = new UserPreference(_tmpUsername,_tmpPreference,_tmpValue);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
