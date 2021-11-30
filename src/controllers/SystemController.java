package controllers;

//import ui.ChairmanMenu;

public class SystemController {






    private String loginInfo(int loginPerson){
        String person = "";
        switch (loginPerson) {
            case 1:
                person = "chairman";
                break;
            case 2:
                person = "cashier";
                break;
            case 3:
                person = "coach";
                break;
            default: break;
        }
        return person;
    }

}



