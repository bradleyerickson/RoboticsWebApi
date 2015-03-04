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

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerClientData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerClientData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerClientData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerClientData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerClientData(ArServerData serverData, int mSecInterval, ArNetPacket packet) {
    this(ArNetworkingJavaJNI.new_ArServerClientData(ArServerData.getCPtr(serverData), serverData, mSecInterval, ArNetPacket.getCPtr(packet), packet), true);
  }

  public ArServerData getServerData() {
    long cPtr = ArNetworkingJavaJNI.ArServerClientData_getServerData(swigCPtr, this);
    return (cPtr == 0) ? null : new ArServerData(cPtr, false);
  }

  public int getMSec() {
    return ArNetworkingJavaJNI.ArServerClientData_getMSec(swigCPtr, this);
  }

  public ArNetPacket getPacket() {
    long cPtr = ArNetworkingJavaJNI.ArServerClientData_getPacket(swigCPtr, this);
    return (cPtr == 0) ? null : new ArNetPacket(cPtr, false);
  }

  public ArTime getLastSent() {
    return new ArTime(ArNetworkingJavaJNI.ArServerClientData_getLastSent(swigCPtr, this), true);
  }

  public void setLastSentToNow() {
    ArNetworkingJavaJNI.ArServerClientData_setLastSentToNow(swigCPtr, this);
  }

  public void setMSec(int mSec) {
    ArNetworkingJavaJNI.ArServerClientData_setMSec(swigCPtr, this, mSec);
  }

  public void setPacket(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerClientData_setPacket(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

}
