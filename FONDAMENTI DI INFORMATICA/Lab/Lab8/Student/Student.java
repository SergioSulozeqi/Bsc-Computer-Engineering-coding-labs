public class Student{
    String nome;
    String cognome;
    int scritto;
    int orale;
    public Student(String aNome, String aCognome, int aScritto, int aOrale){
        nome = aNome;
        cognome = aCognome;
        scritto = aScritto;
        orale = aOrale;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public double media(){
        double media = (scritto+orale)/2;
        return media;
    }
}
