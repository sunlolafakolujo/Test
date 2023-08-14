package innerclass.classinsideinterface;

public class EmailImpl implements EmailService{
    @Override
    public void sendEmail(EmailDetail e) {
        System.out.println(e);
    }

    public static void main(String[] args) {

        new EmailImpl().sendEmail(new EmailService.EmailDetail("adebukola@gmail.com",
                "sunlola@gmail.com","","","Greetings","Hello"));
    }
}
