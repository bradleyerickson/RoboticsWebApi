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

public class ArActionColorFollow extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionColorFollow(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionColorFollowUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionColorFollow obj) {
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
        AriaJavaJNI.delete_ArActionColorFollow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionColorFollow(String name, ArACTS_1_2 acts, ArPTZ camera, double speed, int width, int height) {
    this(AriaJavaJNI.new_ArActionColorFollow__SWIG_0(name, ArACTS_1_2.getCPtr(acts), acts, ArPTZ.getCPtr(camera), camera, speed, width, height), true);
  }

  public ArActionColorFollow(String name, ArACTS_1_2 acts, ArPTZ camera, double speed, int width) {
    this(AriaJavaJNI.new_ArActionColorFollow__SWIG_1(name, ArACTS_1_2.getCPtr(acts), acts, ArPTZ.getCPtr(camera), camera, speed, width), true);
  }

  public ArActionColorFollow(String name, ArACTS_1_2 acts, ArPTZ camera, double speed) {
    this(AriaJavaJNI.new_ArActionColorFollow__SWIG_2(name, ArACTS_1_2.getCPtr(acts), acts, ArPTZ.getCPtr(camera), camera, speed), true);
  }

  public ArActionColorFollow(String name, ArACTS_1_2 acts, ArPTZ camera) {
    this(AriaJavaJNI.new_ArActionColorFollow__SWIG_3(name, ArACTS_1_2.getCPtr(acts), acts, ArPTZ.getCPtr(camera), camera), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionColorFollow_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public boolean setChannel(int channel) {
    return AriaJavaJNI.ArActionColorFollow_setChannel(swigCPtr, this, channel);
  }

  public void setCamera(ArPTZ camera) {
    AriaJavaJNI.ArActionColorFollow_setCamera(swigCPtr, this, ArPTZ.getCPtr(camera), camera);
  }

  public void setAcquire(boolean acquire) {
    AriaJavaJNI.ArActionColorFollow_setAcquire(swigCPtr, this, acquire);
  }

  public void stopMovement() {
    AriaJavaJNI.ArActionColorFollow_stopMovement(swigCPtr, this);
  }

  public void startMovement() {
    AriaJavaJNI.ArActionColorFollow_startMovement(swigCPtr, this);
  }

  public int getChannel() {
    return AriaJavaJNI.ArActionColorFollow_getChannel(swigCPtr, this);
  }

  public boolean getAcquire() {
    return AriaJavaJNI.ArActionColorFollow_getAcquire(swigCPtr, this);
  }

  public boolean getMovement() {
    return AriaJavaJNI.ArActionColorFollow_getMovement(swigCPtr, this);
  }

  public boolean getBlob() {
    return AriaJavaJNI.ArActionColorFollow_getBlob(swigCPtr, this);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionColorFollow_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public final static class TargetState {
    public final static TargetState NO_TARGET = new TargetState("NO_TARGET");
    public final static TargetState TARGET = new TargetState("TARGET");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static TargetState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + TargetState.class + " with value " + swigValue);
    }

    private TargetState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private TargetState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private TargetState(String swigName, TargetState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static TargetState[] swigValues = { NO_TARGET, TARGET };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class MoveState {
    public final static MoveState FOLLOWING = new MoveState("FOLLOWING");
    public final static MoveState ACQUIRING = new MoveState("ACQUIRING");
    public final static MoveState STOPPED = new MoveState("STOPPED");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static MoveState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + MoveState.class + " with value " + swigValue);
    }

    private MoveState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private MoveState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private MoveState(String swigName, MoveState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static MoveState[] swigValues = { FOLLOWING, ACQUIRING, STOPPED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class LocationState {
    public final static LocationState LEFT = new LocationState("LEFT");
    public final static LocationState RIGHT = new LocationState("RIGHT");
    public final static LocationState CENTER = new LocationState("CENTER");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static LocationState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + LocationState.class + " with value " + swigValue);
    }

    private LocationState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private LocationState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private LocationState(String swigName, LocationState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static LocationState[] swigValues = { LEFT, RIGHT, CENTER };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
