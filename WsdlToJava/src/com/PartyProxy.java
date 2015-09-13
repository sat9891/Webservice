package com;

public class PartyProxy implements com.Party {
  private String _endpoint = null;
  private com.Party party = null;
  
  public PartyProxy() {
    _initPartyProxy();
  }
  
  public PartyProxy(String endpoint) {
    _endpoint = endpoint;
    _initPartyProxy();
  }
  
  private void _initPartyProxy() {
    try {
      party = (new com.PartyImplementerServiceLocator()).getPartyImplementerPort();
      if (party != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)party)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)party)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (party != null)
      ((javax.xml.rpc.Stub)party)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Party getParty() {
    if (party == null)
      _initPartyProxy();
    return party;
  }
  
  public java.lang.String display(java.lang.String arg0) throws java.rmi.RemoteException{
    if (party == null)
      _initPartyProxy();
    return party.display(arg0);
  }
  
  
}