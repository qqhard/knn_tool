/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class MatrixStats {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MatrixStats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatrixStats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_MatrixStats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MatrixStats(long n, long d, SWIGTYPE_p_float x) {
    this(swigfaissJNI.new_MatrixStats(n, d, SWIGTYPE_p_float.getCPtr(x)), true);
  }

  public void setComments(String value) {
    swigfaissJNI.MatrixStats_comments_set(swigCPtr, this, value);
  }

  public String getComments() {
    return swigfaissJNI.MatrixStats_comments_get(swigCPtr, this);
  }

  public void setN(long value) {
    swigfaissJNI.MatrixStats_n_set(swigCPtr, this, value);
  }

  public long getN() {
    return swigfaissJNI.MatrixStats_n_get(swigCPtr, this);
  }

  public void setD(long value) {
    swigfaissJNI.MatrixStats_d_set(swigCPtr, this, value);
  }

  public long getD() {
    return swigfaissJNI.MatrixStats_d_get(swigCPtr, this);
  }

  public void setN_collision(long value) {
    swigfaissJNI.MatrixStats_n_collision_set(swigCPtr, this, value);
  }

  public long getN_collision() {
    return swigfaissJNI.MatrixStats_n_collision_get(swigCPtr, this);
  }

  public void setN_valid(long value) {
    swigfaissJNI.MatrixStats_n_valid_set(swigCPtr, this, value);
  }

  public long getN_valid() {
    return swigfaissJNI.MatrixStats_n_valid_get(swigCPtr, this);
  }

  public void setN0(long value) {
    swigfaissJNI.MatrixStats_n0_set(swigCPtr, this, value);
  }

  public long getN0() {
    return swigfaissJNI.MatrixStats_n0_get(swigCPtr, this);
  }

  public void setMin_norm2(double value) {
    swigfaissJNI.MatrixStats_min_norm2_set(swigCPtr, this, value);
  }

  public double getMin_norm2() {
    return swigfaissJNI.MatrixStats_min_norm2_get(swigCPtr, this);
  }

  public void setMax_norm2(double value) {
    swigfaissJNI.MatrixStats_max_norm2_set(swigCPtr, this, value);
  }

  public double getMax_norm2() {
    return swigfaissJNI.MatrixStats_max_norm2_get(swigCPtr, this);
  }

  static public class PerDimStats {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PerDimStats(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PerDimStats obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          swigfaissJNI.delete_MatrixStats_PerDimStats(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setN(long value) {
      swigfaissJNI.MatrixStats_PerDimStats_n_set(swigCPtr, this, value);
    }
  
    public long getN() {
      return swigfaissJNI.MatrixStats_PerDimStats_n_get(swigCPtr, this);
    }
  
    public void setN_nan(long value) {
      swigfaissJNI.MatrixStats_PerDimStats_n_nan_set(swigCPtr, this, value);
    }
  
    public long getN_nan() {
      return swigfaissJNI.MatrixStats_PerDimStats_n_nan_get(swigCPtr, this);
    }
  
    public void setN_inf(long value) {
      swigfaissJNI.MatrixStats_PerDimStats_n_inf_set(swigCPtr, this, value);
    }
  
    public long getN_inf() {
      return swigfaissJNI.MatrixStats_PerDimStats_n_inf_get(swigCPtr, this);
    }
  
    public void setN0(long value) {
      swigfaissJNI.MatrixStats_PerDimStats_n0_set(swigCPtr, this, value);
    }
  
    public long getN0() {
      return swigfaissJNI.MatrixStats_PerDimStats_n0_get(swigCPtr, this);
    }
  
    public void setMin(float value) {
      swigfaissJNI.MatrixStats_PerDimStats_min_set(swigCPtr, this, value);
    }
  
    public float getMin() {
      return swigfaissJNI.MatrixStats_PerDimStats_min_get(swigCPtr, this);
    }
  
    public void setMax(float value) {
      swigfaissJNI.MatrixStats_PerDimStats_max_set(swigCPtr, this, value);
    }
  
    public float getMax() {
      return swigfaissJNI.MatrixStats_PerDimStats_max_get(swigCPtr, this);
    }
  
    public void setSum(double value) {
      swigfaissJNI.MatrixStats_PerDimStats_sum_set(swigCPtr, this, value);
    }
  
    public double getSum() {
      return swigfaissJNI.MatrixStats_PerDimStats_sum_get(swigCPtr, this);
    }
  
    public void setSum2(double value) {
      swigfaissJNI.MatrixStats_PerDimStats_sum2_set(swigCPtr, this, value);
    }
  
    public double getSum2() {
      return swigfaissJNI.MatrixStats_PerDimStats_sum2_get(swigCPtr, this);
    }
  
    public void setN_valid(long value) {
      swigfaissJNI.MatrixStats_PerDimStats_n_valid_set(swigCPtr, this, value);
    }
  
    public long getN_valid() {
      return swigfaissJNI.MatrixStats_PerDimStats_n_valid_get(swigCPtr, this);
    }
  
    public void setMean(double value) {
      swigfaissJNI.MatrixStats_PerDimStats_mean_set(swigCPtr, this, value);
    }
  
    public double getMean() {
      return swigfaissJNI.MatrixStats_PerDimStats_mean_get(swigCPtr, this);
    }
  
    public void setStddev(double value) {
      swigfaissJNI.MatrixStats_PerDimStats_stddev_set(swigCPtr, this, value);
    }
  
    public double getStddev() {
      return swigfaissJNI.MatrixStats_PerDimStats_stddev_get(swigCPtr, this);
    }
  
    public PerDimStats() {
      this(swigfaissJNI.new_MatrixStats_PerDimStats(), true);
    }
  
    public void add(float x) {
      swigfaissJNI.MatrixStats_PerDimStats_add(swigCPtr, this, x);
    }
  
    public void compute_mean_std() {
      swigfaissJNI.MatrixStats_PerDimStats_compute_mean_std(swigCPtr, this);
    }
  
  }

  public void setPer_dim_stats(SWIGTYPE_p_std__vectorT_faiss__MatrixStats__PerDimStats_t value) {
    swigfaissJNI.MatrixStats_per_dim_stats_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_faiss__MatrixStats__PerDimStats_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_faiss__MatrixStats__PerDimStats_t getPer_dim_stats() {
    long cPtr = swigfaissJNI.MatrixStats_per_dim_stats_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_faiss__MatrixStats__PerDimStats_t(cPtr, false);
  }

  static public class Occurrence {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Occurrence(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Occurrence obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          swigfaissJNI.delete_MatrixStats_Occurrence(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setFirst(long value) {
      swigfaissJNI.MatrixStats_Occurrence_first_set(swigCPtr, this, value);
    }
  
    public long getFirst() {
      return swigfaissJNI.MatrixStats_Occurrence_first_get(swigCPtr, this);
    }
  
    public void setCount(long value) {
      swigfaissJNI.MatrixStats_Occurrence_count_set(swigCPtr, this, value);
    }
  
    public long getCount() {
      return swigfaissJNI.MatrixStats_Occurrence_count_get(swigCPtr, this);
    }
  
    public Occurrence() {
      this(swigfaissJNI.new_MatrixStats_Occurrence(), true);
    }
  
  }

  public void setOccurrences(SWIGTYPE_p_std__unordered_mapT_unsigned_long_faiss__MatrixStats__Occurrence_t value) {
    swigfaissJNI.MatrixStats_occurrences_set(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_unsigned_long_faiss__MatrixStats__Occurrence_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_unsigned_long_faiss__MatrixStats__Occurrence_t getOccurrences() {
    long cPtr = swigfaissJNI.MatrixStats_occurrences_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__unordered_mapT_unsigned_long_faiss__MatrixStats__Occurrence_t(cPtr, false);
  }

  public void setBuf(String value) {
    swigfaissJNI.MatrixStats_buf_set(swigCPtr, this, value);
  }

  public String getBuf() {
    return swigfaissJNI.MatrixStats_buf_get(swigCPtr, this);
  }

  public void setNbuf(long value) {
    swigfaissJNI.MatrixStats_nbuf_set(swigCPtr, this, value);
  }

  public long getNbuf() {
    return swigfaissJNI.MatrixStats_nbuf_get(swigCPtr, this);
  }

  public void do_comment(String fmt) {
    swigfaissJNI.MatrixStats_do_comment(swigCPtr, this, fmt);
  }

}