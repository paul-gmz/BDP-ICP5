// ORM class for table 'employee1'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Feb 28 10:20:21 PST 2020
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

public class employee1 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("emp_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        emp_id = (Integer)value;
      }
    });
    setters.put("emp_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        emp_name = (String)value;
      }
    });
    setters.put("emp_sal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        emp_sal = (Integer)value;
      }
    });
  }
  public employee1() {
    init0();
  }
  private Integer emp_id;
  public Integer get_emp_id() {
    return emp_id;
  }
  public void set_emp_id(Integer emp_id) {
    this.emp_id = emp_id;
  }
  public employee1 with_emp_id(Integer emp_id) {
    this.emp_id = emp_id;
    return this;
  }
  private String emp_name;
  public String get_emp_name() {
    return emp_name;
  }
  public void set_emp_name(String emp_name) {
    this.emp_name = emp_name;
  }
  public employee1 with_emp_name(String emp_name) {
    this.emp_name = emp_name;
    return this;
  }
  private Integer emp_sal;
  public Integer get_emp_sal() {
    return emp_sal;
  }
  public void set_emp_sal(Integer emp_sal) {
    this.emp_sal = emp_sal;
  }
  public employee1 with_emp_sal(Integer emp_sal) {
    this.emp_sal = emp_sal;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof employee1)) {
      return false;
    }
    employee1 that = (employee1) o;
    boolean equal = true;
    equal = equal && (this.emp_id == null ? that.emp_id == null : this.emp_id.equals(that.emp_id));
    equal = equal && (this.emp_name == null ? that.emp_name == null : this.emp_name.equals(that.emp_name));
    equal = equal && (this.emp_sal == null ? that.emp_sal == null : this.emp_sal.equals(that.emp_sal));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof employee1)) {
      return false;
    }
    employee1 that = (employee1) o;
    boolean equal = true;
    equal = equal && (this.emp_id == null ? that.emp_id == null : this.emp_id.equals(that.emp_id));
    equal = equal && (this.emp_name == null ? that.emp_name == null : this.emp_name.equals(that.emp_name));
    equal = equal && (this.emp_sal == null ? that.emp_sal == null : this.emp_sal.equals(that.emp_sal));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.emp_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.emp_name = JdbcWritableBridge.readString(2, __dbResults);
    this.emp_sal = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.emp_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.emp_name = JdbcWritableBridge.readString(2, __dbResults);
    this.emp_sal = JdbcWritableBridge.readInteger(3, __dbResults);
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
    JdbcWritableBridge.writeInteger(emp_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(emp_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(emp_sal, 3 + __off, 4, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(emp_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(emp_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(emp_sal, 3 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.emp_id = null;
    } else {
    this.emp_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.emp_name = null;
    } else {
    this.emp_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.emp_sal = null;
    } else {
    this.emp_sal = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.emp_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emp_id);
    }
    if (null == this.emp_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emp_name);
    }
    if (null == this.emp_sal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emp_sal);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.emp_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emp_id);
    }
    if (null == this.emp_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emp_name);
    }
    if (null == this.emp_sal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emp_sal);
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
    __sb.append(FieldFormatter.escapeAndEnclose(emp_id==null?"null":"" + emp_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emp_name==null?"null":emp_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emp_sal==null?"null":"" + emp_sal, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(emp_id==null?"null":"" + emp_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emp_name==null?"null":emp_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emp_sal==null?"null":"" + emp_sal, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emp_id = null; } else {
      this.emp_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emp_name = null; } else {
      this.emp_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emp_sal = null; } else {
      this.emp_sal = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emp_id = null; } else {
      this.emp_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emp_name = null; } else {
      this.emp_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emp_sal = null; } else {
      this.emp_sal = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    employee1 o = (employee1) super.clone();
    return o;
  }

  public void clone0(employee1 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("emp_id", this.emp_id);
    __sqoop$field_map.put("emp_name", this.emp_name);
    __sqoop$field_map.put("emp_sal", this.emp_sal);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("emp_id", this.emp_id);
    __sqoop$field_map.put("emp_name", this.emp_name);
    __sqoop$field_map.put("emp_sal", this.emp_sal);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
