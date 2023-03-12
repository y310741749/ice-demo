// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `ComplexData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package ComplexData;

import java.nio.ByteBuffer;

/**
 * Provides type-specific helper functions.
 **/
public final class IMyDataPrxHelper extends Ice.ObjectPrxHelperBase implements IMyDataPrx {
    private static final String __getDataList_name = "getDataList";

    public DataInfo[] getDataList() {
        return getDataList(null, false);
    }

    public DataInfo[] getDataList(java.util.Map<String, String> __ctx) {
        return getDataList(__ctx, true);
    }

    private DataInfo[] getDataList(java.util.Map<String, String> __ctx, boolean __explicitCtx) {
        __checkTwowayOnly(__getDataList_name);
        return end_getDataList(begin_getDataList(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getDataList() {
        return begin_getDataList(null, false, false, null);
    }

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx) {
        return begin_getDataList(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getDataList(Ice.Callback __cb) {
        return begin_getDataList(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, Ice.Callback __cb) {
        return begin_getDataList(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getDataList(Callback_IMyData_getDataList __cb) {
        return begin_getDataList(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, Callback_IMyData_getDataList __cb) {
        return begin_getDataList(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getDataList(IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb,
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb) {
        return begin_getDataList(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getDataList(IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb,
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                             IceInternal.Functional_BoolCallback __sentCb) {
        return begin_getDataList(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx,
                                             IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb,
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb) {
        return begin_getDataList(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx,
                                             IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb,
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                             IceInternal.Functional_BoolCallback __sentCb) {
        return begin_getDataList(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx,
                                              boolean __explicitCtx,
                                              boolean __synchronous,
                                              IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb,
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                              IceInternal.Functional_BoolCallback __sentCb) {
        return begin_getDataList(__ctx, __explicitCtx, __synchronous,
                new IceInternal.Functional_TwowayCallbackArg1<ComplexData.DataInfo[]>(__responseCb, __exceptionCb, __sentCb) {
                    public final void __completed(Ice.AsyncResult __result) {
                        IMyDataPrxHelper.__getDataList_completed(this, __result);
                    }
                });
    }

    private Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx,
                                              boolean __explicitCtx,
                                              boolean __synchronous,
                                              IceInternal.CallbackBase __cb) {
        __checkAsyncTwowayOnly(__getDataList_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getDataList_name, __cb);
        try {
            __result.prepare(__getDataList_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        } catch (Ice.Exception __ex) {
            __result.abort(__ex);
        }
        return __result;
    }

    public DataInfo[] end_getDataList(Ice.AsyncResult __iresult) {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getDataList_name);
        try {
            if (!__result.__wait()) {
                try {
                    __result.throwUserException();
                } catch (Ice.UserException __ex) {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
//            ByteBuffer b = __is.getBuffer().b;
//            int len = b.limit() - b.position();
//            byte[] bytes = new byte[len];
//            for (int i = 0; i < bytes.length; i++) {
//                bytes[i] = b.get();
//            }
//            System.out.println(bytes);
            DataInfo[] __ret;
            __ret = MyDataListHelper.read(__is);
            __result.endReadParams();
            return __ret;
        } finally {
            if (__result != null) {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getDataList_completed(Ice.TwowayCallbackArg1<DataInfo[]> __cb, Ice.AsyncResult __result) {
        ComplexData.IMyDataPrx __proxy = (ComplexData.IMyDataPrx) __result.getProxy();
        DataInfo[] __ret = null;
        try {
            __ret = __proxy.end_getDataList(__result);
        } catch (Ice.LocalException __ex) {
            __cb.exception(__ex);
            return;
        } catch (Ice.SystemException __ex) {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     *
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IMyDataPrx checkedCast(Ice.ObjectPrx __obj) {
        return checkedCastImpl(__obj, ice_staticId(), IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     *
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IMyDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx) {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     *
     * @param __obj   The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IMyDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet) {
        return checkedCastImpl(__obj, __facet, ice_staticId(), IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     *
     * @param __obj   The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx   The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static IMyDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx) {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     *
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static IMyDataPrx uncheckedCast(Ice.ObjectPrx __obj) {
        return uncheckedCastImpl(__obj, IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     *
     * @param __obj   The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static IMyDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet) {
        return uncheckedCastImpl(__obj, __facet, IMyDataPrx.class, IMyDataPrxHelper.class);
    }

    public static final String[] __ids =
            {
                    "::ComplexData::IMyData",
                    "::Ice::Object"
            };

    /**
     * Provides the Slice type ID of this type.
     *
     * @return The Slice type ID.
     **/
    public static String ice_staticId() {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, IMyDataPrx v) {
        __os.writeProxy(v);
    }

    public static IMyDataPrx __read(IceInternal.BasicStream __is) {
        Ice.ObjectPrx proxy = __is.readProxy();
        if (proxy != null) {
            IMyDataPrxHelper result = new IMyDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
