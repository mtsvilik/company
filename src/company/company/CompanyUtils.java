package company.company;

import company.materialresource.Source;
import company.project.Project;

import java.math.BigDecimal;
import java.util.Arrays;

public class CompanyUtils {

    public static Project[] selectProjects(BigDecimal budget, ConstructionCompany company) {
        Project[] result = new Project[0];
        for (int i = 0; i < company.getProjects().length; i++) {
            Project currentProject = company.getProjects()[i];
            if (budget.compareTo(currentProject.getPrice()) > 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = currentProject;
            }
        }
        return result;
    }

    public static void selectProjects(ConstructionCompany company) {
        for (int i = 0; i <= company.getProjects().length; i++) {
            Project allProject = company.getProjects()[i];
        }
    }

    public static void showInformation(Source[] sources) {
        for (Source source : sources) {
            source.show();
        }
    }

}
