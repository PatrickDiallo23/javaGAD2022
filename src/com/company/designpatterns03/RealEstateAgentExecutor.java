package com.company.designpatterns03;

public class RealEstateAgentExecutor implements RealEstateAgentProxy{
    private final RealEstateAgentProxy realEstateAgentProxy;

    public RealEstateAgentExecutor(RealEstateAgentProxy realEstateAgentProxy){

        this.realEstateAgentProxy = realEstateAgentProxy;
    }


    @Override
    public void represent(Apartment apartment) {
        System.out.println(apartment.toString());

    }

    @Override
    public Apartment rent(Student student) {
        if(student.getName().trim().startsWith("P")){
//            throw new RuntimeException("Student name cannot start with P");
            return null;
        }
        else{
            return realEstateAgentProxy.rent(student);
        }
    }


    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);
        Apartment app06 = new Apartment("Crangasi01", 100);

        RealEstateAgentExecutor realEstateAgentExecutor = new RealEstateAgentExecutor(new RealEstateAgentProxy() {
            public RealEstateAgentExecutor realEstateAgentProxy;

            @Override
            public void represent(Apartment apartment) {
                System.out.println(apartment.toString());
            }

            @Override
            public Apartment rent(Student student) {
                if(student.getName().trim().startsWith("P")){
//                    throw new RuntimeException("Student name cannot start with P");
                    return null;
                }
                else{
                    return realEstateAgentProxy.rent(student);
                }
            }
        });

        realEstateAgentExecutor.represent(app01);
        realEstateAgentExecutor.represent(app02);
        realEstateAgentExecutor.represent(app03);
        realEstateAgentExecutor.represent(app04);
        realEstateAgentExecutor.represent(app05);
        realEstateAgentExecutor.represent(app06);

        Student student01 = new Student("Pesho", 200);
        Student student02 = new Student("Gosho", 300);


        Apartment apartmentForStudent02 = realEstateAgentExecutor.rent(student02);
        System.out.println(student02 + " has rented " + apartmentForStudent02);
        Apartment apartmentForStudent01 = realEstateAgentExecutor.rent(student01);
        System.out.println(student01 + " has rented " + apartmentForStudent01);


    }
}

