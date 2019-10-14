/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GCClosure {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GCClosure(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GCClosure obj) {
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
        fridacoreJNI.delete__GCClosure(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setClosure(_GClosure value) {
    fridacoreJNI._GCClosure_closure_set(swigCPtr, this, _GClosure.getCPtr(value), value);
  }

  public _GClosure getClosure() {
    long cPtr = fridacoreJNI._GCClosure_closure_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GClosure(cPtr, false);
  }

  public void setCallback(SWIGTYPE_p_void value) {
    fridacoreJNI._GCClosure_callback_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getCallback() {
    long cPtr = fridacoreJNI._GCClosure_callback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public _GCClosure() {
    this(fridacoreJNI.new__GCClosure(), true);
  }

}