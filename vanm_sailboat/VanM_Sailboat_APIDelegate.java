package vanm_sailboat;

import javax.jws.WebService;


@WebService (targetNamespace="http://vanm_sailboat/", serviceName="VanM_Sailboat_APIService", portName="VanM_Sailboat_APIPort")
public class VanM_Sailboat_APIDelegate{

    vanm_sailboat.VanM_Sailboat_API _vanM_Sailboat_API = null;

    public String createSailboatDB_Object () {
        return _vanM_Sailboat_API.createSailboatDB_Object();
    }

    public String getSailboat (String boatName) {
        return _vanM_Sailboat_API.getSailboat(boatName);
    }

    public VanM_Sailboat_APIDelegate() {
        _vanM_Sailboat_API = new vanm_sailboat.VanM_Sailboat_API(); }

}