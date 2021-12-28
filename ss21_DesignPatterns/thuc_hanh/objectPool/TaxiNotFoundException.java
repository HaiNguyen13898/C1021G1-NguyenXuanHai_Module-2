package ss21_DesignPatterns.thuc_hanh.objectPool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}