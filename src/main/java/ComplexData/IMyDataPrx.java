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

public interface IMyDataPrx extends Ice.ObjectPrx
{
    public DataInfo[] getDataList();

    public DataInfo[] getDataList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getDataList();

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getDataList(Ice.Callback __cb);

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getDataList(Callback_IMyData_getDataList __cb);

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, Callback_IMyData_getDataList __cb);

    public Ice.AsyncResult begin_getDataList(IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getDataList(IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getDataList(java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<DataInfo[]> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public DataInfo[] end_getDataList(Ice.AsyncResult __result);
}