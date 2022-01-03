package ss22_StructuralDesignPattern.thuc_hanh.facade;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("hôm nay trời đẹp quá" +
                "là là là la");
    }

    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
