package org.digitalcampus.oppia.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.digitalcampus.oppia.database.converters.TimestampConverter;
import org.digitalcampus.oppia.model.db_model.Leaderboard;
import org.joda.time.DateTime;

@SuppressWarnings("unchecked")
public final class LeaderboardDao_Impl implements LeaderboardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLeaderboard;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfLeaderboard;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfLeaderboard;

  public LeaderboardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLeaderboard = new EntityInsertionAdapter<Leaderboard>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `leaderboard`(`_id`,`username`,`fullname`,`points`,`position`,`lastupdate`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Leaderboard value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getFullname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullname());
        }
        if (value.getPoints() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getPoints());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPosition());
        }
        final String _tmp;
        _tmp = TimestampConverter.toTimestamp(value.getLastupdate());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
      }
    };
    this.__deletionAdapterOfLeaderboard = new EntityDeletionOrUpdateAdapter<Leaderboard>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `leaderboard` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Leaderboard value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLeaderboard = new EntityDeletionOrUpdateAdapter<Leaderboard>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `leaderboard` SET `_id` = ?,`username` = ?,`fullname` = ?,`points` = ?,`position` = ?,`lastupdate` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Leaderboard value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getFullname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullname());
        }
        if (value.getPoints() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getPoints());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPosition());
        }
        final String _tmp;
        _tmp = TimestampConverter.toTimestamp(value.getLastupdate());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public void insertAll(List<Leaderboard> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLeaderboard.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(Leaderboard item) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfLeaderboard.insertAndReturnId(item);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(Leaderboard... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfLeaderboard.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll(List<Leaderboard> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfLeaderboard.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(Leaderboard... item) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfLeaderboard.handleMultiple(item);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateAll(List<Leaderboard> list) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfLeaderboard.handleMultiple(list);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Leaderboard> getAll() {
    final String _sql = "SELECT * FROM leaderboard";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final int _cursorIndexOfFullname = _cursor.getColumnIndexOrThrow("fullname");
      final int _cursorIndexOfPoints = _cursor.getColumnIndexOrThrow("points");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfLastupdate = _cursor.getColumnIndexOrThrow("lastupdate");
      final List<Leaderboard> _result = new ArrayList<Leaderboard>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Leaderboard _item;
        _item = new Leaderboard();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _item.setUsername(_tmpUsername);
        final String _tmpFullname;
        _tmpFullname = _cursor.getString(_cursorIndexOfFullname);
        _item.setFullname(_tmpFullname);
        final Integer _tmpPoints;
        if (_cursor.isNull(_cursorIndexOfPoints)) {
          _tmpPoints = null;
        } else {
          _tmpPoints = _cursor.getInt(_cursorIndexOfPoints);
        }
        _item.setPoints(_tmpPoints);
        final Integer _tmpPosition;
        if (_cursor.isNull(_cursorIndexOfPosition)) {
          _tmpPosition = null;
        } else {
          _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        }
        _item.setPosition(_tmpPosition);
        final DateTime _tmpLastupdate;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLastupdate);
        _tmpLastupdate = TimestampConverter.fromTimestamp(_tmp);
        _item.setLastupdate(_tmpLastupdate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Leaderboard getLeaderboard(String username) {
    final String _sql = "SELECT * FROM leaderboard WHERE username = ?";
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
      final int _cursorIndexOfFullname = _cursor.getColumnIndexOrThrow("fullname");
      final int _cursorIndexOfPoints = _cursor.getColumnIndexOrThrow("points");
      final int _cursorIndexOfPosition = _cursor.getColumnIndexOrThrow("position");
      final int _cursorIndexOfLastupdate = _cursor.getColumnIndexOrThrow("lastupdate");
      final Leaderboard _result;
      if(_cursor.moveToFirst()) {
        _result = new Leaderboard();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _result.setUsername(_tmpUsername);
        final String _tmpFullname;
        _tmpFullname = _cursor.getString(_cursorIndexOfFullname);
        _result.setFullname(_tmpFullname);
        final Integer _tmpPoints;
        if (_cursor.isNull(_cursorIndexOfPoints)) {
          _tmpPoints = null;
        } else {
          _tmpPoints = _cursor.getInt(_cursorIndexOfPoints);
        }
        _result.setPoints(_tmpPoints);
        final Integer _tmpPosition;
        if (_cursor.isNull(_cursorIndexOfPosition)) {
          _tmpPosition = null;
        } else {
          _tmpPosition = _cursor.getInt(_cursorIndexOfPosition);
        }
        _result.setPosition(_tmpPosition);
        final DateTime _tmpLastupdate;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLastupdate);
        _tmpLastupdate = TimestampConverter.fromTimestamp(_tmp);
        _result.setLastupdate(_tmpLastupdate);
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
