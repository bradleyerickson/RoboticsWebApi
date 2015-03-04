/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2014 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArMapObjects extends ArMapObjectsInterface {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArMapObjects(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArMapObjectsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapObjects obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArMapObjects(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static void setDEFAULT_KEYWORD(String value) {
    AriaJavaJNI.ArMapObjects_DEFAULT_KEYWORD_set(value);
  }

  public static String getDEFAULT_KEYWORD() {
    return AriaJavaJNI.ArMapObjects_DEFAULT_KEYWORD_get();
  }

  public ArMapObjects(String keyword) {
    this(AriaJavaJNI.new_ArMapObjects__SWIG_0(keyword), true);
  }

  public ArMapObjects() {
    this(AriaJavaJNI.new_ArMapObjects__SWIG_1(), true);
  }

  public ArMapObjects(ArMapObjects other) {
    this(AriaJavaJNI.new_ArMapObjects__SWIG_2(ArMapObjects.getCPtr(other), other), true);
  }

  public ArMapObject findFirstMapObject(String name, String type, boolean isIncludeWithHeading) {
    long cPtr = AriaJavaJNI.ArMapObjects_findFirstMapObject__SWIG_0(swigCPtr, this, name, type, isIncludeWithHeading);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findFirstMapObject(String name, String type) {
    long cPtr = AriaJavaJNI.ArMapObjects_findFirstMapObject__SWIG_1(swigCPtr, this, name, type);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name, String type, boolean isIncludeWithHeading) {
    long cPtr = AriaJavaJNI.ArMapObjects_findMapObject__SWIG_0(swigCPtr, this, name, type, isIncludeWithHeading);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name, String type) {
    long cPtr = AriaJavaJNI.ArMapObjects_findMapObject__SWIG_1(swigCPtr, this, name, type);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name) {
    long cPtr = AriaJavaJNI.ArMapObjects_findMapObject__SWIG_2(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObjectPtrList findMapObjectsOfType(String type, boolean isIncludeWithHeading) {
    return new ArMapObjectPtrList(AriaJavaJNI.ArMapObjects_findMapObjectsOfType__SWIG_0(swigCPtr, this, type, isIncludeWithHeading), true);
  }

  public ArMapObjectPtrList findMapObjectsOfType(String type) {
    return new ArMapObjectPtrList(AriaJavaJNI.ArMapObjects_findMapObjectsOfType__SWIG_1(swigCPtr, this, type), true);
  }

  public ArMapObjectPtrList getMapObjects() {
    long cPtr = AriaJavaJNI.ArMapObjects_getMapObjects(swigCPtr, this);
    return (cPtr == 0) ? null : new ArMapObjectPtrList(cPtr, false);
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects, boolean isSortedObjects, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapObjects_setMapObjects__SWIG_0(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects, isSortedObjects, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects, boolean isSortedObjects) {
    AriaJavaJNI.ArMapObjects_setMapObjects__SWIG_1(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects, isSortedObjects);
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects) {
    AriaJavaJNI.ArMapObjects_setMapObjects__SWIG_2(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects);
  }

  public void writeObjectListToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapObjects_writeObjectListToFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void clear() {
    AriaJavaJNI.ArMapObjects_clear(swigCPtr, this);
  }

  public boolean addToFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapObjects_addToFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean remFromFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapObjects_remFromFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public ArTime getTimeChanged() {
    return new ArTime(AriaJavaJNI.ArMapObjects_getTimeChanged(swigCPtr, this), true);
  }

}
