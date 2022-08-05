package company.company;

import company.human.Customer;
import company.human.Employee;
import company.materialresource.Source;
import company.project.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public abstract class ConstructionCompany extends Company {

    private static final Logger LOGGER = LogManager.getLogger(ConstructionCompany.class);

    private Customer[] customers;
    private Employee[] employees;
    private Project[] projects;
    private Source[] sources;

    public ConstructionCompany(String name, LocalDate foundationDate) {
        super(name, foundationDate);
    }

    @Override
    public void showCompanyName(Company company) {
        LOGGER.info("Company name: " + company.getName());
    }

    public void showCompanyName() {
        LOGGER.info("Some company name");
    }

    public abstract BigDecimal countAllBudgets(Customer[] customers);

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConstructionCompany that = (ConstructionCompany) o;
        return Arrays.equals(customers, that.customers) && Arrays.equals(employees, that.employees) && Arrays.equals(projects, that.projects) && Arrays.equals(sources, that.sources);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(customers);
        result = 31 * result + Arrays.hashCode(employees);
        result = 31 * result + Arrays.hashCode(projects);
        result = 31 * result + Arrays.hashCode(sources);
        return result;
    }

    @Override
    public String toString() {
        return "ConstructionCompany{" +
                "customers=" + Arrays.toString(customers) +
                ", employees=" + Arrays.toString(employees) +
                ", projects=" + Arrays.toString(projects) +
                ", sources=" + Arrays.toString(sources) +
                '}';
    }
}
