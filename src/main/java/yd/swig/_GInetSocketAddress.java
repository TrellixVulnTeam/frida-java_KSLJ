/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GInetSocketAddress {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GInetSocketAddress(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GInetSocketAddress obj) {
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
        fridacoreJNI.delete__GInetSocketAddress(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GSocketAddress value) {
    fridacoreJNI._GInetSocketAddress_parent_instance_set(swigCPtr, this, _GSocketAddress.getCPtr(value), value);
  }

  public _GSocketAddress getParent_instance() {
    long cPtr = fridacoreJNI._GInetSocketAddress_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GSocketAddress(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GInetSocketAddressPrivate value) {
    fridacoreJNI._GInetSocketAddress_priv_set(swigCPtr, this, SWIGTYPE_p__GInetSocketAddressPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GInetSocketAddressPrivate getPriv() {
    long cPtr = fridacoreJNI._GInetSocketAddress_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GInetSocketAddressPrivate(cPtr, false);
  }

  public _GInetSocketAddress() {
    this(fridacoreJNI.new__GInetSocketAddress(), true);
  }

}