/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GMenuAttributeIterClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GMenuAttributeIterClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GMenuAttributeIterClass obj) {
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
        fridacoreJNI.delete__GMenuAttributeIterClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_class(_GObjectClass value) {
    fridacoreJNI._GMenuAttributeIterClass_parent_class_set(swigCPtr, this, _GObjectClass.getCPtr(value), value);
  }

  public _GObjectClass getParent_class() {
    long cPtr = fridacoreJNI._GMenuAttributeIterClass_parent_class_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObjectClass(cPtr, false);
  }

  public void setGet_next(SWIGTYPE_p_f_p__GMenuAttributeIter_p_p_q_const__char_p_p__GVariant__int value) {
    fridacoreJNI._GMenuAttributeIterClass_get_next_set(swigCPtr, this, SWIGTYPE_p_f_p__GMenuAttributeIter_p_p_q_const__char_p_p__GVariant__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMenuAttributeIter_p_p_q_const__char_p_p__GVariant__int getGet_next() {
    long cPtr = fridacoreJNI._GMenuAttributeIterClass_get_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMenuAttributeIter_p_p_q_const__char_p_p__GVariant__int(cPtr, false);
  }

  public _GMenuAttributeIterClass() {
    this(fridacoreJNI.new__GMenuAttributeIterClass(), true);
  }

}