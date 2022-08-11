package company.company;

import company.materialresource.Source;
import company.project.Project;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyUtils {

    public static List<Project> selectProjects(BigDecimal budget, ConstructionCompany company) {
        List<Project> result = new ArrayList<>();
        for (int i = 0; i < company.getProjects().size(); i++) {
            Project currentProject = company.getProjects().get(i);
            if (budget.compareTo(currentProject.getPrice()) > 0) {
                result.add(currentProject);
            }
        }
        return result;
    }

    public static void showInformation(List<Source> sources) {
        for (Source source : sources) {
            source.show();
        }
    }
}
