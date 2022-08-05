package company;

import company.company.Company;
import company.company.CompanyUtils;
import company.company.ConstructionCompany;
import company.company.InvestConstructionCompany;
import company.exception.InvalidTypeException;
import company.human.Customer;
import company.human.Employee;
import company.human.Human;
import company.human.IMove;
import company.info.*;
import company.investment.IExtend;
import company.investment.Investment;
import company.materialresource.*;
import company.project.IRun;
import company.project.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainClass {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    public static void main(String[] args) {
        Passport passport1 = new Passport();
        passport1.setPassportNumber(555444);
        LocalDate dateOfIssuePassport1 = LocalDate.of(2012, 10, 10);

        Passport passport2 = new Passport();
        passport2.setPassportNumber(345621);
        LocalDate dateOfIssuePassport2 = LocalDate.of(2020, 2, 13);

        Passport passport3 = new Passport();
        passport3.setPassportNumber(567987);
        LocalDate dateOfIssuePassport3 = LocalDate.of(2011, 4, 9);

        Passport passport4 = new Passport();
        passport4.setPassportNumber(677566);
        LocalDate dateOfIssuePassport4 = LocalDate.of(2019, 11, 10);

        Passport passport5 = new Passport();
        passport5.setPassportNumber(678345);
        LocalDate dateOfIssuePassport5 = LocalDate.of(2020, 1, 10);

        Passport passport6 = new Passport();
        passport6.setPassportNumber(456098);
        LocalDate dateOfIssuePassport6 = LocalDate.of(2016, 11, 10);

        Address address1 = new Address();
        address1.setCity("Minsk");
        address1.setStreet("Kosmonavtov");
        address1.setHouseNumber(12);

        Address address2 = new Address();
        address2.setCity("Minsk");
        address2.setStreet("Esenina");
        address2.setHouseNumber(1);

        Address address3 = new Address();
        address3.setCity("Minsk");
        address3.setStreet("Nemiga");
        address3.setHouseNumber(5);

        Address address4 = new Address();
        address3.setCity("Minsk");
        address3.setStreet("Kolasa");
        address3.setHouseNumber(76);

        Address address5 = new Address();
        address3.setCity("Minsk");
        address3.setStreet("Novaya");
        address3.setHouseNumber(23);

        Address address6 = new Address();
        address6.setCity("Minsk");
        address6.setStreet("Komsomolskaya");
        address6.setHouseNumber(112);

        Address address7 = new Address();
        address7.setCity("Minsk");
        address7.setStreet("Esenina");
        address7.setHouseNumber(110);

        Address address8 = new Address();
        address8.setCity("Minsk");
        address8.setStreet("Slobodskaya");
        address8.setHouseNumber(11);

        Customer customer1 = new Customer("Ivan", "Petrov", LocalDate.of(1987, 6, 20));
        customer1.setAddress(address4);
        customer1.setPassport(passport1);
        customer1.setBudget(BigDecimal.valueOf(170000));
        customer1.showBudget();

        Customer customer2 = new Customer("Olga", "Ivanova", LocalDate.of(1977, 5, 8));
        customer2.setAddress(address5);
        customer2.setPassport(passport2);
        customer2.setBudget(BigDecimal.valueOf(51000));
        customer2.showBudget();

        Customer customer3 = new Customer("Irina", "Maksimova", LocalDate.of(1960, 3, 24));
        customer3.setAddress(address7);
        customer3.setPassport(passport5);
        customer3.setBudget(BigDecimal.valueOf(100000));
        customer3.showBudget();
        LOGGER.info("---------------------------------");

        Employee sergeyJukov = new Employee("Sergey", "Jukov", LocalDate.of(1988, 12, 1));
        sergeyJukov.setAddress(address2);
        sergeyJukov.setPassport(passport3);
        sergeyJukov.setPosition("Manager");
        sergeyJukov.setSalary(BigDecimal.valueOf(2000));

        Employee tatianaBelay = new Employee("Tatiana", "Belay", LocalDate.of(1970, 10, 3));
        tatianaBelay.setAddress(address3);
        tatianaBelay.setPassport(passport4);
        tatianaBelay.setPosition("Economist");
        tatianaBelay.setSalary(BigDecimal.valueOf(1000));

        Employee olegPetrov = new Employee("Oleg", "Petrov", LocalDate.of(1990, 5, 7));
        olegPetrov.setAddress(address8);
        olegPetrov.setPassport(passport6);
        olegPetrov.setPosition("Manager");
        olegPetrov.setSalary(BigDecimal.valueOf(1500));

        Project economApartment = new Project("Econom Apartment", LocalDate.of(2022, 6, 1));
        economApartment.setPrice(BigDecimal.valueOf(45000));
        economApartment.setSquare(40);
        economApartment.setNumberOfRooms(1);
        economApartment.showProject();

        Project standardApartment = new Project("Standard Apartment", LocalDate.of(2022, 6, 1));
        standardApartment.setPrice(BigDecimal.valueOf(95000));
        standardApartment.setSquare(85);
        standardApartment.setNumberOfRooms(3);
        standardApartment.showProject();

        Project premiumApartment = new Project("Premium Apartment", LocalDate.of(2021, 12, 3));
        premiumApartment.setPrice(BigDecimal.valueOf(150000));
        premiumApartment.setSquare(120);
        premiumApartment.setNumberOfRooms(4);
        premiumApartment.showProject();
        LOGGER.info("---------------------------------");

        Project penthouse = new Project("Penthouse", LocalDate.of(2021, 12, 3));
        penthouse.setPrice(BigDecimal.valueOf(250000));
        penthouse.setSquare(200);
        penthouse.setNumberOfRooms(6);

        Project sunnyHouse = new Project("Sunny House", LocalDate.of(2020, 12, 13));
        sunnyHouse.setPrice(BigDecimal.valueOf(350000));
        sunnyHouse.setSquare(280);
        sunnyHouse.setNumberOfRooms(8);

        Project whiteHouse = new Project("White House", LocalDate.of(2021, 10, 13));
        whiteHouse.setPrice(BigDecimal.valueOf(270000));
        whiteHouse.setSquare(220);
        whiteHouse.setNumberOfRooms(7);

        BuildingMaterial concrete = new BuildingMaterial("Concrete");
        concrete.setQuantity(200);

        BuildingMaterial wood = new BuildingMaterial("Wood");
        wood.setQuantity(1000);

        Source parquet = new BuildingMaterial("Parquet");

        Equipment craneTower = new Equipment("Crane tower", LocalDate.of(2021, 10, 11));

        Equipment mixerConcrete = new Equipment("Mixer concrete", LocalDate.of(2010, 6, 12));

        Source generator = new Equipment("Generator", LocalDate.of(2015, 6, 12));

        Source mercedesBenz = new Vehicle("Mercedes Benz", "V8", LocalDate.of(2022, 1, 31));

        Source volkswagen = new Vehicle("Volkswagen Transporter", "V3", LocalDate.of(2016, 10, 15));

        Source bmw = new Vehicle("BMW 7", "V8", LocalDate.of(2022, 10, 15));

        Source[] source1 = {bmw, mixerConcrete, concrete};
        CompanyUtils.showInformation(source1);

        Account companyAccount1 = new BankAccount(123474353789023L, LocalDate.of(2022, 7, 24), "Alfa Bank");

        Account companyAccount2 = new BankAccount(555445457478746L, LocalDate.of(2015, 7, 24), "MTBank");

        CardAccount companyCardAccount = new CardAccount(123454568475678L, LocalDate.of(2022, 5, 24), "MTBank");
        companyCardAccount.setNameOfCard("Payment Card ");
        companyCardAccount.setTypeOfCard("Debit Card");

        CardAccount investCompanyCardAccount = new CardAccount(555453216473457L, LocalDate.of(2022, 3, 1), "Alfa Bank");
        investCompanyCardAccount.setNameOfCard("Invest Card");
        investCompanyCardAccount.setTypeOfCard("Debit Card");

        ConstructionCompany company1 = new InvestConstructionCompany("KMK Company", LocalDate.of(2010, 01, 12));
        company1.setAddress(address1);
        company1.setAccount(companyAccount1);
        Customer[] companyCustomers = {customer1, customer2};
        company1.setCustomers(companyCustomers);
        Employee[] companyEmployees = {sergeyJukov, tatianaBelay};
        company1.setEmployees(companyEmployees);
        Project[] companyProjects = {economApartment, standardApartment, premiumApartment, penthouse};
        company1.setProjects(companyProjects);
        Source[] companyBuildingMaterials = {concrete, wood};
        company1.setSources(companyBuildingMaterials);
        Source[] companyEquipments = {craneTower, mixerConcrete};
        company1.setSources(companyEquipments);
        Source[] companyVehicles = {mercedesBenz, volkswagen};
        company1.setSources(companyVehicles);
        company1.showCompanyName();
        company1.showCompanyName(company1);
        LOGGER.info("---------------------------------");

        Investment stocks = new Investment("Stocks", LocalDate.of(2025, 12, 31));
        Investment deposits = new Investment("Deposits", LocalDate.of(2023, 12, 31));
        deposits.showInvestment();

        Resource information = new Resource("Information resources");
        Resource human = new Resource("Human resources");
        Resource technical = new Resource("Technical resources");


        InvestConstructionCompany company2 = new InvestConstructionCompany("Invest Company", LocalDate.of(2011, 10, 10));
        company2.setAddress(address6);
        company2.setAccount(investCompanyCardAccount);
        Customer[] investCompanyCustomers = {customer1, customer3};
        company2.setCustomers(investCompanyCustomers);
        Employee[] investCompanyEmployees = {olegPetrov};
        company2.setEmployees(investCompanyEmployees);
        Project[] investCompanyProjects = {sunnyHouse, whiteHouse};
        company2.setProjects(investCompanyProjects);
        Source[] investCompanyBuildingMaterials = {parquet};
        company2.setSources(investCompanyBuildingMaterials);
        Source[] investCompanyEquipments = {generator};
        company2.setSources(investCompanyEquipments);
        Source[] investCompanyVehicles = {bmw};
        company2.setSources(investCompanyVehicles);
        Investment[] investments = {stocks, deposits};
        company2.setInvestments(investments);
        LOGGER.info("Tne number of investments: " + company2.countInvestments(investments));
        LOGGER.info(company2.countAllBudgets(investCompanyCustomers));
        company2.setSources(investCompanyVehicles);
        company2.showCompanyName();
        company2.showCompanyName(company2);
        LOGGER.info("---------------------------------");

        Company company3 = new InvestConstructionCompany("InvestTwo Company", LocalDate.of(2011, 10, 10));
        company3.showCompanyName(company3);
        LOGGER.info("---------------------------------");

        LOGGER.info("Total projects in InvestCompany: " + Project.getCounter());

        LOGGER.info("---------------------------------");

        IMove iMove = new Employee("Nikita", "Volkov", LocalDate.of(1976, 12, 23));
        iMove.moveForward();
        iMove.moveRight();
        iMove.moveStop();

        IMove iMove2 = new Human();
        iMove2.moveForward();
        iMove2.moveRight();
        iMove2.moveStop();

        IMove iMove1 = new Vehicle("Mercedes Benz", "V8", LocalDate.of(2022, 1, 31));
        iMove1.moveForward();
        iMove1.moveRight();
        iMove1.moveStop();

        IExtend iExtend = new Investment();
        iExtend.extendTerm();

        IUse use = new BuildingMaterial("Concrete");
        use.useSource();

        IOpen open = new CardAccount(555453216473457L, LocalDate.of(2022, 3, 1), "Alfa Bank");
        open.openCardAccount();

        IRun run = new Project();
        run.startProject();
        run.finishProject();

        LOGGER.info("---------------------------------");

        Resource firstResource = null;
        try {
            firstResource = new Resource();
            stocks.setTypeOfInvestment("Credit");
        } catch (InvalidTypeException e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            if(firstResource != null){
                firstResource.close();
            }
        }

        try (Resource resource = new Resource()) {
            resource.load(human);
        } finally {
            LOGGER.info("Resource closed");
        }

        try {
            CompanyUtils.selectProjects(company2);
        } catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.error(e.getMessage(), e);
        }

        LOGGER.info("---------------------------------");

        LOGGER.info("Customer 1 options: ");
        Project[] result = CompanyUtils.selectProjects(customer1.getBudget(), company1);
        for (Project project : result) {
            LOGGER.info(project.getProjectTitle());
        }

        LOGGER.info("Customer 2 options: ");
        Project[] result2 = CompanyUtils.selectProjects(customer2.getBudget(), company1);
        for (Project project : result2) {
            LOGGER.info(project.getProjectTitle());
        }
    }
}