package com.google.enterprise.connector.dctm.dctmdfcwrap;

import com.documentum.fc.client.IDfTypedObject;
import com.google.enterprise.connector.dctm.dfcwrap.ITypedObject;

public class IDctmTypedObject implements ITypedObject{
	IDfTypedObject idfTypedObject;
	
	
	public IDctmTypedObject(IDfTypedObject idfTypedObject){
		this.idfTypedObject=idfTypedObject;
	}
	
	
//	public IId getObjectId() throws RepositoryException{
//		IDfId idfId=null;
//		try{
//			idfId=idfTypedObject.getObjectId();
//		}catch(DfException e){
//			RepositoryException re = new RepositoryException(e.getMessage(),e.getCause());
//			re.setStackTrace(e.getStackTrace());
//			throw re;
//		}
//		return new IDctmId(idfId);
//	}
	
	
}
