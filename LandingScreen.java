package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class LandingScreen {
    // Elements
    private final UIElement shoppingListInput =
            E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShoppingList = E(byId("editText"));
    private final UIElement addListButton = E(byId("android:id/button1"));
    private final UIElement header = E(byText("OurGroceries"));
    private final UIElement shoppingListHeader = E(byText("SHOPPING LISTS"));
    private final UIElement recipeHeader = E(byText("RECIPES"));
    private final UIElement addRecipe = E(byText("Add a recipe..."));



    // Methods

    public void checkLandingScreen(){
        header.waitFor(5).untilIsEnabled();
        shoppingListHeader.waitFor(5).untilIsVisible();
        recipeHeader.waitFor(5).untilIsVisible();
        addRecipe.waitFor(5).untilIsVisible();


    }
    public void clickAddShoppingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingName(String var) {
        inputShoppingList.sendKeys(var);
    }

    public void clickOnAddList() {
        addListButton.shouldHave().attribute("text").equalTo("ADD LIST");
        addListButton.click();
    }

    public void checkNewList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }
}
