/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GMountIface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GMountIface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GMountIface obj) {
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
        fridacoreJNI.delete__GMountIface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GMountIface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GMountIface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setChanged(SWIGTYPE_p_f_p__GMount__void value) {
    fridacoreJNI._GMountIface_changed_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__void getChanged() {
    long cPtr = fridacoreJNI._GMountIface_changed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__void(cPtr, false);
  }

  public void setUnmounted(SWIGTYPE_p_f_p__GMount__void value) {
    fridacoreJNI._GMountIface_unmounted_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__void getUnmounted() {
    long cPtr = fridacoreJNI._GMountIface_unmounted_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__void(cPtr, false);
  }

  public void setGet_root(SWIGTYPE_p_f_p__GMount__p__GFile value) {
    fridacoreJNI._GMountIface_get_root_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GFile.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GFile getGet_root() {
    long cPtr = fridacoreJNI._GMountIface_get_root_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GFile(cPtr, false);
  }

  public void setGet_name(SWIGTYPE_p_f_p__GMount__p_char value) {
    fridacoreJNI._GMountIface_get_name_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p_char getGet_name() {
    long cPtr = fridacoreJNI._GMountIface_get_name_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p_char(cPtr, false);
  }

  public void setGet_icon(SWIGTYPE_p_f_p__GMount__p__GIcon value) {
    fridacoreJNI._GMountIface_get_icon_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GIcon.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GIcon getGet_icon() {
    long cPtr = fridacoreJNI._GMountIface_get_icon_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GIcon(cPtr, false);
  }

  public void setGet_uuid(SWIGTYPE_p_f_p__GMount__p_char value) {
    fridacoreJNI._GMountIface_get_uuid_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p_char getGet_uuid() {
    long cPtr = fridacoreJNI._GMountIface_get_uuid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p_char(cPtr, false);
  }

  public void setGet_volume(SWIGTYPE_p_f_p__GMount__p__GVolume value) {
    fridacoreJNI._GMountIface_get_volume_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GVolume.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GVolume getGet_volume() {
    long cPtr = fridacoreJNI._GMountIface_get_volume_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GVolume(cPtr, false);
  }

  public void setGet_drive(SWIGTYPE_p_f_p__GMount__p__GDrive value) {
    fridacoreJNI._GMountIface_get_drive_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GDrive.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GDrive getGet_drive() {
    long cPtr = fridacoreJNI._GMountIface_get_drive_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GDrive(cPtr, false);
  }

  public void setCan_unmount(SWIGTYPE_p_f_p__GMount__int value) {
    fridacoreJNI._GMountIface_can_unmount_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__int getCan_unmount() {
    long cPtr = fridacoreJNI._GMountIface_can_unmount_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__int(cPtr, false);
  }

  public void setCan_eject(SWIGTYPE_p_f_p__GMount__int value) {
    fridacoreJNI._GMountIface_can_eject_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__int getCan_eject() {
    long cPtr = fridacoreJNI._GMountIface_can_eject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__int(cPtr, false);
  }

  public void setUnmount(SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_unmount_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getUnmount() {
    long cPtr = fridacoreJNI._GMountIface_unmount_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setUnmount_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GMountIface_unmount_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int getUnmount_finish() {
    long cPtr = fridacoreJNI._GMountIface_unmount_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setEject(SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_eject_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getEject() {
    long cPtr = fridacoreJNI._GMountIface_eject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setEject_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GMountIface_eject_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int getEject_finish() {
    long cPtr = fridacoreJNI._GMountIface_eject_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setRemount(SWIGTYPE_p_f_p__GMount_enum_GMountMountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_remount_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_enum_GMountMountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_enum_GMountMountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getRemount() {
    long cPtr = fridacoreJNI._GMountIface_remount_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_enum_GMountMountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setRemount_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GMountIface_remount_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int getRemount_finish() {
    long cPtr = fridacoreJNI._GMountIface_remount_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setGuess_content_type(SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_guess_content_type_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getGuess_content_type() {
    long cPtr = fridacoreJNI._GMountIface_guess_content_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setGuess_content_type_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__p_p_char value) {
    fridacoreJNI._GMountIface_guess_content_type_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__p_p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__p_p_char getGuess_content_type_finish() {
    long cPtr = fridacoreJNI._GMountIface_guess_content_type_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__p_p_char(cPtr, false);
  }

  public void setGuess_content_type_sync(SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_p__GError__p_p_char value) {
    fridacoreJNI._GMountIface_guess_content_type_sync_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_p__GError__p_p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_p__GError__p_p_char getGuess_content_type_sync() {
    long cPtr = fridacoreJNI._GMountIface_guess_content_type_sync_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_int_p__GCancellable_p_p__GError__p_p_char(cPtr, false);
  }

  public void setPre_unmount(SWIGTYPE_p_f_p__GMount__void value) {
    fridacoreJNI._GMountIface_pre_unmount_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__void getPre_unmount() {
    long cPtr = fridacoreJNI._GMountIface_pre_unmount_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__void(cPtr, false);
  }

  public void setUnmount_with_operation(SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_unmount_with_operation_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getUnmount_with_operation() {
    long cPtr = fridacoreJNI._GMountIface_unmount_with_operation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setUnmount_with_operation_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GMountIface_unmount_with_operation_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int getUnmount_with_operation_finish() {
    long cPtr = fridacoreJNI._GMountIface_unmount_with_operation_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setEject_with_operation(SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GMountIface_eject_with_operation_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getEject_with_operation() {
    long cPtr = fridacoreJNI._GMountIface_eject_with_operation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setEject_with_operation_finish(SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GMountIface_eject_with_operation_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int getEject_with_operation_finish() {
    long cPtr = fridacoreJNI._GMountIface_eject_with_operation_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setGet_default_location(SWIGTYPE_p_f_p__GMount__p__GFile value) {
    fridacoreJNI._GMountIface_get_default_location_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GFile.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GFile getGet_default_location() {
    long cPtr = fridacoreJNI._GMountIface_get_default_location_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GFile(cPtr, false);
  }

  public void setGet_sort_key(SWIGTYPE_p_f_p__GMount__p_char value) {
    fridacoreJNI._GMountIface_get_sort_key_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p_char getGet_sort_key() {
    long cPtr = fridacoreJNI._GMountIface_get_sort_key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p_char(cPtr, false);
  }

  public void setGet_symbolic_icon(SWIGTYPE_p_f_p__GMount__p__GIcon value) {
    fridacoreJNI._GMountIface_get_symbolic_icon_set(swigCPtr, this, SWIGTYPE_p_f_p__GMount__p__GIcon.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMount__p__GIcon getGet_symbolic_icon() {
    long cPtr = fridacoreJNI._GMountIface_get_symbolic_icon_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMount__p__GIcon(cPtr, false);
  }

  public _GMountIface() {
    this(fridacoreJNI.new__GMountIface(), true);
  }

}