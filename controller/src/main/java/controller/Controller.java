package controller;

import model.IModel;
import view.IView;

import java.io.IOException;

public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel m, IView v)
    {
        this.model = m;
        this.view = v;
    }

    public void run() throws IOException {
        this.view.display(this.model.getMessage());
    }
}
