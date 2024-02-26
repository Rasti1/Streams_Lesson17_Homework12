package project.outputer;

import project.provider.DataProvider;
import project.view.AppView;

public class Outputer {
    public void getOutput(){

        DataProvider provider = new DataProvider();
        AppView view = new AppView();

        view.getListOfUsers(provider.getUsers());

        view.filterUsers(provider.getUsers());

    }
}
