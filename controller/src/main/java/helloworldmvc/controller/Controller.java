package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

import java.io.IOException;

public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel m, IView v)
    {
        if(m == null)
            throw new NullPointerException();
        if(v == null)
            throw new NullPointerException();
        this.model = m;
        this.view = v;
    }

    public void run() throws IOException {
        this.view.display(this.model.getMessage());
    }
}
