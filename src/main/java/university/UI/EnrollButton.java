package university.UI;
import university.UI.BaseButton;

import java.awt.*;

public class EnrollButton extends BaseButton{
    public EnrollButton(){
        super("Enroll Now");
    }

    @Override
    public void render(){
        System.out.println("Rendering a blue enroll button");
    }

    @Override
    public void onClick(){
        System.out.println("Student enrolled successfully");
    }

    @Override
    public void onHover(){
        System.out.println("Please Hover the button");
    }
}
