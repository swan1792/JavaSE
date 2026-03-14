abstract class AbstractButtonClass {
    String caption;

    public void SetCaption(String caption){
        this.caption = caption;
    }

    public String getCaption(){
        return this.caption;
    }
}

interface ButtonPress{
    void buttonPress();

    void onButtonHover();
}

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress(){
        System.out.println("Sending " + this.message
        + " to " + this.sendTo);
    }

    public void onButtonHover(){
        System.out.println("Hover " + this.message + " to " +
               this.sendTo );
    }

    public void setSendTo(String sendTo){
        this.sendTo = sendTo;
    }

    public void setMessage(String message){
        this.message = message;
    }
}

class ForwardButtonClass extends AbstractButtonClass implements ButtonPress {
    String forwardTo;
    String message;

    @Override
    public void buttonPress(){
        System.out.println("Forwarding" + this.message + " to " + this.forwardTo);
    }

    public void onButtonHover(){
        System.out.println("Hover " + this.message + " to " +
                this.forwardTo );
    }

    public void setForwardTo(String forwardTo){
        this.forwardTo = forwardTo;
    }

    public void setMessage(String message){
     this.message = message;
    }
}

public class Main {
    static void main() {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.SetCaption("Testing Java");
        String intro = sendButton.getCaption();
        System.out.println(intro);
        sendButton.setMessage("Hello World");
        sendButton.setSendTo("b@gmail.com");
        sendButton.buttonPress();
        sendButton.onButtonHover();

        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.SetCaption("Forward");
        forwardButton.setForwardTo("x@ygmail.com");
        forwardButton.setMessage("forward message");
        forwardButton.buttonPress();
        forwardButton.onButtonHover();
    }
}