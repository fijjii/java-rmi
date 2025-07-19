import java.rmi.*;

public interface SellingPrice extends Remote {
    double calculateSellingPrice(double costPrice, double discount) throws RemoteException;
}
