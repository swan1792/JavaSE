package university.UI;

import university.action.Clickable;
import university.action.Hoverable;

abstract class BaseButton implements Clickable, Hoverable {
    String label;

    public BaseButton(String label){
        this.label = label;
    }

    public abstract void render();
}