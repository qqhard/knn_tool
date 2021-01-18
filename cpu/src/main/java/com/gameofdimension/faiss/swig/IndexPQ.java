/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gameofdimension.faiss.swig;

public class IndexPQ extends Index {
  private transient long swigCPtr;

  protected IndexPQ(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexPQ_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexPQ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexPQ(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setPq(ProductQuantizer value) {
    swigfaissJNI.IndexPQ_pq_set(swigCPtr, this, ProductQuantizer.getCPtr(value), value);
  }

  public ProductQuantizer getPq() {
    long cPtr = swigfaissJNI.IndexPQ_pq_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ProductQuantizer(cPtr, false);
  }

  public void setCodes(ByteVector value) {
    swigfaissJNI.IndexPQ_codes_set(swigCPtr, this, ByteVector.getCPtr(value), value);
  }

  public ByteVector getCodes() {
    long cPtr = swigfaissJNI.IndexPQ_codes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ByteVector(cPtr, false);
  }

  public IndexPQ(int d, long M, long nbits, MetricType metric) {
    this(swigfaissJNI.new_IndexPQ__SWIG_0(d, M, nbits, metric.swigValue()), true);
  }

  public IndexPQ(int d, long M, long nbits) {
    this(swigfaissJNI.new_IndexPQ__SWIG_1(d, M, nbits), true);
  }

  public IndexPQ() {
    this(swigfaissJNI.new_IndexPQ__SWIG_2(), true);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexPQ_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexPQ_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexPQ_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void reset() {
    swigfaissJNI.IndexPQ_reset(swigCPtr, this);
  }

  public void reconstruct_n(int i0, int ni, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexPQ_reconstruct_n(swigCPtr, this, i0, ni, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void reconstruct(int key, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexPQ_reconstruct(swigCPtr, this, key, SWIGTYPE_p_float.getCPtr(recons));
  }

  public long remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexPQ_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public long sa_code_size() {
    return swigfaissJNI.IndexPQ_sa_code_size(swigCPtr, this);
  }

  public void sa_encode(int n, SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char bytes) {
    swigfaissJNI.IndexPQ_sa_encode(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(bytes));
  }

  public void sa_decode(int n, SWIGTYPE_p_unsigned_char bytes, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexPQ_sa_decode(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(bytes), SWIGTYPE_p_float.getCPtr(x));
  }

  public DistanceComputer get_distance_computer() {
    long cPtr = swigfaissJNI.IndexPQ_get_distance_computer(swigCPtr, this);
    return (cPtr == 0) ? null : new DistanceComputer(cPtr, false);
  }

  public void setDo_polysemous_training(boolean value) {
    swigfaissJNI.IndexPQ_do_polysemous_training_set(swigCPtr, this, value);
  }

  public boolean getDo_polysemous_training() {
    return swigfaissJNI.IndexPQ_do_polysemous_training_get(swigCPtr, this);
  }

  public void setPolysemous_training(PolysemousTraining value) {
    swigfaissJNI.IndexPQ_polysemous_training_set(swigCPtr, this, PolysemousTraining.getCPtr(value), value);
  }

  public PolysemousTraining getPolysemous_training() {
    long cPtr = swigfaissJNI.IndexPQ_polysemous_training_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PolysemousTraining(cPtr, false);
  }

  public void setSearch_type(IndexPQ.Search_type_t value) {
    swigfaissJNI.IndexPQ_search_type_set(swigCPtr, this, value.swigValue());
  }

  public IndexPQ.Search_type_t getSearch_type() {
    return IndexPQ.Search_type_t.swigToEnum(swigfaissJNI.IndexPQ_search_type_get(swigCPtr, this));
  }

  public void setEncode_signs(boolean value) {
    swigfaissJNI.IndexPQ_encode_signs_set(swigCPtr, this, value);
  }

  public boolean getEncode_signs() {
    return swigfaissJNI.IndexPQ_encode_signs_get(swigCPtr, this);
  }

  public void setPolysemous_ht(int value) {
    swigfaissJNI.IndexPQ_polysemous_ht_set(swigCPtr, this, value);
  }

  public int getPolysemous_ht() {
    return swigfaissJNI.IndexPQ_polysemous_ht_get(swigCPtr, this);
  }

  public void search_core_polysemous(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexPQ_search_core_polysemous(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void hamming_distance_histogram(int n, SWIGTYPE_p_float x, int nb, SWIGTYPE_p_float xb, SWIGTYPE_p_long dist_histogram) {
    swigfaissJNI.IndexPQ_hamming_distance_histogram(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), nb, SWIGTYPE_p_float.getCPtr(xb), SWIGTYPE_p_long.getCPtr(dist_histogram));
  }

  public void hamming_distance_table(int n, SWIGTYPE_p_float x, SWIGTYPE_p_int dis) {
    swigfaissJNI.IndexPQ_hamming_distance_table(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_int.getCPtr(dis));
  }

  public final static class Search_type_t {
    public final static IndexPQ.Search_type_t ST_PQ = new IndexPQ.Search_type_t("ST_PQ");
    public final static IndexPQ.Search_type_t ST_HE = new IndexPQ.Search_type_t("ST_HE");
    public final static IndexPQ.Search_type_t ST_generalized_HE = new IndexPQ.Search_type_t("ST_generalized_HE");
    public final static IndexPQ.Search_type_t ST_SDC = new IndexPQ.Search_type_t("ST_SDC");
    public final static IndexPQ.Search_type_t ST_polysemous = new IndexPQ.Search_type_t("ST_polysemous");
    public final static IndexPQ.Search_type_t ST_polysemous_generalize = new IndexPQ.Search_type_t("ST_polysemous_generalize");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Search_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Search_type_t.class + " with value " + swigValue);
    }

    private Search_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Search_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Search_type_t(String swigName, Search_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Search_type_t[] swigValues = { ST_PQ, ST_HE, ST_generalized_HE, ST_SDC, ST_polysemous, ST_polysemous_generalize };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}