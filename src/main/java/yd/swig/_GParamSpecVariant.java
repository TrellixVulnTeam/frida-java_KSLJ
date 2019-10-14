/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GParamSpecVariant {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GParamSpecVariant(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GParamSpecVariant obj) {
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
        fridacoreJNI.delete__GParamSpecVariant(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GParamSpec value) {
    fridacoreJNI._GParamSpecVariant_parent_instance_set(swigCPtr, this, _GParamSpec.getCPtr(value), value);
  }

  public _GParamSpec getParent_instance() {
    long cPtr = fridacoreJNI._GParamSpecVariant_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GParamSpec(cPtr, false);
  }

  public void setType(SWIGTYPE_p__GVariantType value) {
    fridacoreJNI._GParamSpecVariant_type_set(swigCPtr, this, SWIGTYPE_p__GVariantType.getCPtr(value));
  }

  public SWIGTYPE_p__GVariantType getType() {
    long cPtr = fridacoreJNI._GParamSpecVariant_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GVariantType(cPtr, false);
  }

  public void setDefault_value(SWIGTYPE_p__GVariant value) {
    fridacoreJNI._GParamSpecVariant_default_value_set(swigCPtr, this, SWIGTYPE_p__GVariant.getCPtr(value));
  }

  public SWIGTYPE_p__GVariant getDefault_value() {
    long cPtr = fridacoreJNI._GParamSpecVariant_default_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GVariant(cPtr, false);
  }

  public void setPadding(SWIGTYPE_p_p_void value) {
    fridacoreJNI._GParamSpecVariant_padding_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getPadding() {
    long cPtr = fridacoreJNI._GParamSpecVariant_padding_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public _GParamSpecVariant() {
    this(fridacoreJNI.new__GParamSpecVariant(), true);
  }

}