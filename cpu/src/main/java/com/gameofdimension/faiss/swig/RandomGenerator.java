/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class RandomGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RandomGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RandomGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_RandomGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMt(SWIGTYPE_p_std__mt19937 value) {
    swigfaissJNI.RandomGenerator_mt_set(swigCPtr, this, SWIGTYPE_p_std__mt19937.getCPtr(value));
  }

  public SWIGTYPE_p_std__mt19937 getMt() {
    return new SWIGTYPE_p_std__mt19937(swigfaissJNI.RandomGenerator_mt_get(swigCPtr, this), true);
  }

  public int rand_int() {
    return swigfaissJNI.RandomGenerator_rand_int__SWIG_0(swigCPtr, this);
  }

  public int rand_int64() {
    return swigfaissJNI.RandomGenerator_rand_int64(swigCPtr, this);
  }

  public int rand_int(int max) {
    return swigfaissJNI.RandomGenerator_rand_int__SWIG_1(swigCPtr, this, max);
  }

  public float rand_float() {
    return swigfaissJNI.RandomGenerator_rand_float(swigCPtr, this);
  }

  public double rand_double() {
    return swigfaissJNI.RandomGenerator_rand_double(swigCPtr, this);
  }

  public RandomGenerator(int seed) {
    this(swigfaissJNI.new_RandomGenerator__SWIG_0(seed), true);
  }

  public RandomGenerator() {
    this(swigfaissJNI.new_RandomGenerator__SWIG_1(), true);
  }

}