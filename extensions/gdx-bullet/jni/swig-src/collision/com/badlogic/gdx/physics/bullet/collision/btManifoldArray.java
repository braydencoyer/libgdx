/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btManifoldArray extends BulletBase {
	private long swigCPtr;
	
	protected btManifoldArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btManifoldArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btManifoldArray(long cPtr, boolean cMemoryOwn) {
		this("btManifoldArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btManifoldArray obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btManifoldArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btManifoldArray() {
    this(CollisionJNI.new_btManifoldArray__SWIG_0(), true);
  }

  public btManifoldArray(btManifoldArray otherArray) {
    this(CollisionJNI.new_btManifoldArray__SWIG_1(btManifoldArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btManifoldArray_size(swigCPtr, this);
  }

  public btPersistentManifold at(int n) {
    long cPtr = CollisionJNI.btManifoldArray_at__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public void clear() {
    CollisionJNI.btManifoldArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btManifoldArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btManifoldArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, btPersistentManifold fillData) {
    CollisionJNI.btManifoldArray_resize__SWIG_0(swigCPtr, this, newsize, btPersistentManifold.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btManifoldArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public SWIGTYPE_p_p_btPersistentManifold expandNonInitializing() {
    return new SWIGTYPE_p_p_btPersistentManifold(CollisionJNI.btManifoldArray_expandNonInitializing(swigCPtr, this), false);
  }

  public SWIGTYPE_p_p_btPersistentManifold expand(btPersistentManifold fillValue) {
    return new SWIGTYPE_p_p_btPersistentManifold(CollisionJNI.btManifoldArray_expand__SWIG_0(swigCPtr, this, btPersistentManifold.getCPtr(fillValue), fillValue), false);
  }

  public SWIGTYPE_p_p_btPersistentManifold expand() {
    return new SWIGTYPE_p_p_btPersistentManifold(CollisionJNI.btManifoldArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(btPersistentManifold _Val) {
    CollisionJNI.btManifoldArray_push_back(swigCPtr, this, btPersistentManifold.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btManifoldArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btManifoldArray_reserve(swigCPtr, this, _Count);
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btManifoldArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(btPersistentManifold key) {
    return CollisionJNI.btManifoldArray_findBinarySearch(swigCPtr, this, btPersistentManifold.getCPtr(key), key);
  }

  public int findLinearSearch(btPersistentManifold key) {
    return CollisionJNI.btManifoldArray_findLinearSearch(swigCPtr, this, btPersistentManifold.getCPtr(key), key);
  }

  public void remove(btPersistentManifold key) {
    CollisionJNI.btManifoldArray_remove(swigCPtr, this, btPersistentManifold.getCPtr(key), key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btManifoldArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btManifoldArray otherArray) {
    CollisionJNI.btManifoldArray_copyFromArray(swigCPtr, this, btManifoldArray.getCPtr(otherArray), otherArray);
  }

}
