package tests;

import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    @BeforeClass
    public void preCondition(){

        if (!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().withEmail("mara@gmail.com").withPassword("Mmar123456$"));
        }
    }


    @Test
    public void removeFirstContact(){
        //Assert size of ContactList less by one

    }

    @Test
    public void removeAllContacts(){
        //"No contacts Here

    }
}
