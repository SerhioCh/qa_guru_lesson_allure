package qa.guru;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelsTest {

    @Test
    @Feature("Issue в репозиторий")
    @Story("Создание Issue")
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://testing.github.com")
    @DisplayName("Проверка Issue для авторизованного пользователя")
    public void testStaticLabels() {


    }

    @Test
    public void testDynamicLabels() {
        Allure.getLifecycle().updateTestCase(
                t -> t.setName("Проверка Issue для авторизованного пользователя")
        );
        Allure.feature("Issue в репозиторий");
        Allure.story("Создание Issue");
        Allure.label("owner", "eroshenkoam");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.link("Testing", "https://testing.github.com");
    }
}
