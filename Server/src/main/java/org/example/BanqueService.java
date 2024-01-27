package org.example;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.glassfish.gmbal.ParameterNames;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion (@WebParam(name="Montant") double mt)
    {
        return mt*10.54;
    }
    @WebMethod
    public Compte getComte (@WebParam(name="code") int code)
    {
        return new Compte (code,1000,new Date());
    }
    @WebMethod
    public List<Compte> ListComptes(){
        return List.of(
                new Compte(1,1000,new Date()),
                new Compte(2,2000,new Date()),
                new Compte(3,   3000,new Date())
                );

    }
}
