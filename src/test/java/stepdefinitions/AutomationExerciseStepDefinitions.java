package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationExercisePage;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage aEPage = new AutomationExercisePage();


    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {

    }
    @Then("Anasayfaya ulastigini dogrular")
    public void anasayfaya_ulastigini_dogrular() {

    }
    @Then("{string} sayfasina gider")
    public void sayfasina_gider(String string) {

    }
    @Then("Tum urunlerin goruntulendigini dogrular")
    public void tum_urunlerin_goruntulendigini_dogrular() {

    }
    @Then("Arama kismina {string} yazip search butonuna tiklar")
    public void arama_kismina_yazip_search_butonuna_tiklar(String string) {

    }
    @Then("Urun ayrintisini goruntuler")
    public void urun_ayrintisini_goruntuler() {

    }
    @Then("Urun adini dogrular")
    public void urun_adini_dogrular() {

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }
}
