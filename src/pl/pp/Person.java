package pl.pp;

public class Person {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek
    public String address; // pole przechowujące cechę adres
    public int yearOfBirth; //pole przechowujące cechę rok urodzenia
    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {

    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge, String initAddress, int  initYearOfBirth) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address=initAddress;
        yearOfBirth=initYearOfBirth;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat."+"Mieszkam tutaj - "+address+". "+" Mój rok urodzenia - "+yearOfBirth+". ");
    }

    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o jeden za każdym jej wywołaniem
    public void growOld(int wiek){
        age = age + wiek;
    }
    //zmniejszającąwiek o 1
    public void beYounger(){
        age -=1;
    }

    // przykładowa metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }

    // przykładowa metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }
}