// ORM class for table 'newPetrol'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Feb 28 10:34:00 PST 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class newPetrol extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("distributor_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        distributor_id = (String)value;
      }
    });
    setters.put("distributor_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        distributor_name = (String)value;
      }
    });
    setters.put("amt_int", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        amt_int = (String)value;
      }
    });
    setters.put("amy_out", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        amy_out = (String)value;
      }
    });
    setters.put("vol_in", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        vol_in = (Integer)value;
      }
    });
    setters.put("vol_out", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        vol_out = (Integer)value;
      }
    });
    setters.put("year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        year = (Integer)value;
      }
    });
  }
  public newPetrol() {
    init0();
  }
  private String distributor_id;
  public String get_distributor_id() {
    return distributor_id;
  }
  public void set_distributor_id(String distributor_id) {
    this.distributor_id = distributor_id;
  }
  public newPetrol with_distributor_id(String distributor_id) {
    this.distributor_id = distributor_id;
    return this;
  }
  private String distributor_name;
  public String get_distributor_name() {
    return distributor_name;
  }
  public void set_distributor_name(String distributor_name) {
    this.distributor_name = distributor_name;
  }
  public newPetrol with_distributor_name(String distributor_name) {
    this.distributor_name = distributor_name;
    return this;
  }
  private String amt_int;
  public String get_amt_int() {
    return amt_int;
  }
  public void set_amt_int(String amt_int) {
    this.amt_int = amt_int;
  }
  public newPetrol with_amt_int(String amt_int) {
    this.amt_int = amt_int;
    return this;
  }
  private String amy_out;
  public String get_amy_out() {
    return amy_out;
  }
  public void set_amy_out(String amy_out) {
    this.amy_out = amy_out;
  }
  public newPetrol with_amy_out(String amy_out) {
    this.amy_out = amy_out;
    return this;
  }
  private Integer vol_in;
  public Integer get_vol_in() {
    return vol_in;
  }
  public void set_vol_in(Integer vol_in) {
    this.vol_in = vol_in;
  }
  public newPetrol with_vol_in(Integer vol_in) {
    this.vol_in = vol_in;
    return this;
  }
  private Integer vol_out;
  public Integer get_vol_out() {
    return vol_out;
  }
  public void set_vol_out(Integer vol_out) {
    this.vol_out = vol_out;
  }
  public newPetrol with_vol_out(Integer vol_out) {
    this.vol_out = vol_out;
    return this;
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public newPetrol with_year(Integer year) {
    this.year = year;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof newPetrol)) {
      return false;
    }
    newPetrol that = (newPetrol) o;
    boolean equal = true;
    equal = equal && (this.distributor_id == null ? that.distributor_id == null : this.distributor_id.equals(that.distributor_id));
    equal = equal && (this.distributor_name == null ? that.distributor_name == null : this.distributor_name.equals(that.distributor_name));
    equal = equal && (this.amt_int == null ? that.amt_int == null : this.amt_int.equals(that.amt_int));
    equal = equal && (this.amy_out == null ? that.amy_out == null : this.amy_out.equals(that.amy_out));
    equal = equal && (this.vol_in == null ? that.vol_in == null : this.vol_in.equals(that.vol_in));
    equal = equal && (this.vol_out == null ? that.vol_out == null : this.vol_out.equals(that.vol_out));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof newPetrol)) {
      return false;
    }
    newPetrol that = (newPetrol) o;
    boolean equal = true;
    equal = equal && (this.distributor_id == null ? that.distributor_id == null : this.distributor_id.equals(that.distributor_id));
    equal = equal && (this.distributor_name == null ? that.distributor_name == null : this.distributor_name.equals(that.distributor_name));
    equal = equal && (this.amt_int == null ? that.amt_int == null : this.amt_int.equals(that.amt_int));
    equal = equal && (this.amy_out == null ? that.amy_out == null : this.amy_out.equals(that.amy_out));
    equal = equal && (this.vol_in == null ? that.vol_in == null : this.vol_in.equals(that.vol_in));
    equal = equal && (this.vol_out == null ? that.vol_out == null : this.vol_out.equals(that.vol_out));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.distributor_id = JdbcWritableBridge.readString(1, __dbResults);
    this.distributor_name = JdbcWritableBridge.readString(2, __dbResults);
    this.amt_int = JdbcWritableBridge.readString(3, __dbResults);
    this.amy_out = JdbcWritableBridge.readString(4, __dbResults);
    this.vol_in = JdbcWritableBridge.readInteger(5, __dbResults);
    this.vol_out = JdbcWritableBridge.readInteger(6, __dbResults);
    this.year = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.distributor_id = JdbcWritableBridge.readString(1, __dbResults);
    this.distributor_name = JdbcWritableBridge.readString(2, __dbResults);
    this.amt_int = JdbcWritableBridge.readString(3, __dbResults);
    this.amy_out = JdbcWritableBridge.readString(4, __dbResults);
    this.vol_in = JdbcWritableBridge.readInteger(5, __dbResults);
    this.vol_out = JdbcWritableBridge.readInteger(6, __dbResults);
    this.year = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(distributor_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(distributor_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amt_int, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amy_out, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(vol_in, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vol_out, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(distributor_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(distributor_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amt_int, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amy_out, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(vol_in, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(vol_out, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.distributor_id = null;
    } else {
    this.distributor_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.distributor_name = null;
    } else {
    this.distributor_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amt_int = null;
    } else {
    this.amt_int = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amy_out = null;
    } else {
    this.amy_out = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vol_in = null;
    } else {
    this.vol_in = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.vol_out = null;
    } else {
    this.vol_out = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.distributor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, distributor_id);
    }
    if (null == this.distributor_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, distributor_name);
    }
    if (null == this.amt_int) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amt_int);
    }
    if (null == this.amy_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amy_out);
    }
    if (null == this.vol_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vol_in);
    }
    if (null == this.vol_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vol_out);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.distributor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, distributor_id);
    }
    if (null == this.distributor_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, distributor_name);
    }
    if (null == this.amt_int) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amt_int);
    }
    if (null == this.amy_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amy_out);
    }
    if (null == this.vol_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vol_in);
    }
    if (null == this.vol_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vol_out);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(distributor_id==null?"null":distributor_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distributor_name==null?"null":distributor_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_int==null?"null":amt_int, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amy_out==null?"null":amy_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vol_in==null?"null":"" + vol_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vol_out==null?"null":"" + vol_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(distributor_id==null?"null":distributor_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distributor_name==null?"null":distributor_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_int==null?"null":amt_int, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amy_out==null?"null":amy_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vol_in==null?"null":"" + vol_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vol_out==null?"null":"" + vol_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.distributor_id = null; } else {
      this.distributor_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.distributor_name = null; } else {
      this.distributor_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.amt_int = null; } else {
      this.amt_int = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.amy_out = null; } else {
      this.amy_out = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vol_in = null; } else {
      this.vol_in = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vol_out = null; } else {
      this.vol_out = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.distributor_id = null; } else {
      this.distributor_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.distributor_name = null; } else {
      this.distributor_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.amt_int = null; } else {
      this.amt_int = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.amy_out = null; } else {
      this.amy_out = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vol_in = null; } else {
      this.vol_in = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vol_out = null; } else {
      this.vol_out = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    newPetrol o = (newPetrol) super.clone();
    return o;
  }

  public void clone0(newPetrol o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("distributor_id", this.distributor_id);
    __sqoop$field_map.put("distributor_name", this.distributor_name);
    __sqoop$field_map.put("amt_int", this.amt_int);
    __sqoop$field_map.put("amy_out", this.amy_out);
    __sqoop$field_map.put("vol_in", this.vol_in);
    __sqoop$field_map.put("vol_out", this.vol_out);
    __sqoop$field_map.put("year", this.year);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("distributor_id", this.distributor_id);
    __sqoop$field_map.put("distributor_name", this.distributor_name);
    __sqoop$field_map.put("amt_int", this.amt_int);
    __sqoop$field_map.put("amy_out", this.amy_out);
    __sqoop$field_map.put("vol_in", this.vol_in);
    __sqoop$field_map.put("vol_out", this.vol_out);
    __sqoop$field_map.put("year", this.year);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
