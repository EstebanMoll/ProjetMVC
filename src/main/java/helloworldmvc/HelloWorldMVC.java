package helloworldmvc;

import helloworld.controller.Controller;
import helloworldmvc.model.Model;
import helloworld.view.View;

import java.io.IOException;

public class HelloWorldMVC {
    public static void main(String args[]) throws IOException {
        Controller c=new Controller(new Model(), new View());
        c.run();
    }
}
