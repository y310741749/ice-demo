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

public final class IMyDataHolder extends Ice.ObjectHolderBase<IMyData>
{
    public
    IMyDataHolder()
    {
    }

    public
    IMyDataHolder(IMyData value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof IMyData)
        {
            value = (IMyData)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _IMyDataDisp.ice_staticId();
    }
}
