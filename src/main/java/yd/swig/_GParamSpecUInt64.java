/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GParamSpecUInt64 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GParamSpecUInt64(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GParamSpecUInt64 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fridacoreJNI.delete__GParamSpecUInt64(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GParamSpec value) {
    fridacoreJNI._GParamSpecUInt64_parent_instance_set(swigCPtr, this, _GParamSpec.getCPtr(value), value);
  }

  public _GParamSpec getParent_instance() {
    long cPtr = fridacoreJNI._GParamSpecUInt64_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GParamSpec(cPtr, false);
  }

  public void setMinimum(long value) {
    fridacoreJNI._GParamSpecUInt64_minimum_set(swigCPtr, this, value);
  }

  public long getMinimum() {
    return fridacoreJNI._GParamSpecUInt64_minimum_get(swigCPtr, this);
  }

  public void setMaximum(long value) {
    fridacoreJNI._GParamSpecUInt64_maximum_set(swigCPtr, this, value);
  }

  public long getMaximum() {
    return fridacoreJNI._GParamSpecUInt64_maximum_get(swigCPtr, this);
  }

  public void setDefault_value(long value) {
    fridacoreJNI._GParamSpecUInt64_default_value_set(swigCPtr, this, value);
  }

  public long getDefault_value() {
    return fridacoreJNI._GParamSpecUInt64_default_value_get(swigCPtr, this);
  }

  public _GParamSpecUInt64() {
    this(fridacoreJNI.new__GParamSpecUInt64(), true);
  }

}