package behavioral.observer;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}
