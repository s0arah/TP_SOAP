import Proxy.BanqueService;
import Proxy.BanqueWS;
import Proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(200));
        Compte cp=stub.getComte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
