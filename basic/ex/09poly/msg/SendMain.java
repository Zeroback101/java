package basic.ex.09poly.msg;

public class SendMain {

  public static void main(String[] args) {
    Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
    for(Seder sender : senders) {
      sender.sendMessage("환영합니다."); 
    }
  }
}
