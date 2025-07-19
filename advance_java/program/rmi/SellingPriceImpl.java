import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class SellingPriceImpl extends UnicastRemoteObject implements SellingPrice {

    protected SellingPriceImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateSellingPrice(double costPrice, double discount) throws RemoteException {
        return costPrice - discount;
    }
}

