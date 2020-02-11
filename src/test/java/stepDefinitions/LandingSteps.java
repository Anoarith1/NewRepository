package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreen;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps {
    private LandingScreen landingScreen = new LandingScreen();

    @Given("I check landing screen")
    public void iOpenTheApplication() {
        landingScreen.checkLandingScreen();
    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {

        landingScreen.clickAddShoppingList();
    }

    @And("I type {string}")
    public void iType(String arg0) {
        landingScreen.typeInShoppingName(arg0);
    }

    @And("I click on add list")
    public void iClickOnAddList() {

        landingScreen.clickOnAddList();
    }

    @Then("I see new list {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
        landingScreen.checkNewList(arg0);
        sleep(3000);
    }


    @Then("I click on {string}")
    public void iClickOn(String arg0) {
        landingScreen.clickOnList();
    }

    @Then("I click on list settings")
    public void iClickOnListSettings() {
        landingScreen.clickOnOptions();
    }

    @And("I chose to delete the list")
    public void iChoseToDeleteTheList() {
        landingScreen.deleteList();
    }

    @And("I make sure to delete the list")
    public void iMakeSureToDeleteTheList() {
        landingScreen.makeSure();
    }

    @Then("I check there is no {string}")
    public void iCheckThereIsNo(String arg0) {
        landingScreen.isNotVisisble();
    }
}

