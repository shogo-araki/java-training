public class Main {

  public static void main(String[] args) {
    CellPhone cp = new CellPhone("hoge@email.com", "090-1234-5678");
    cp.call("123-123-123");
    cp.sendMail("hoge@hoge.hoge");

    IPhone phone = (IPhone) cp;
    phone.call("011-987-6543");
    //  phone.sendMail("foo@email.com");

    IEmail mail = (IEmail) cp;
    //mail.call("011-222-3333");
    mail.sendMail("bar@email.com");
  }
}
