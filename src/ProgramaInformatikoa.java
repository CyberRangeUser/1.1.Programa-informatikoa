public class ProgramaInformatikoa{
    public static void main (String[] args){
        String ald1= "lehengo belaunaldiaaaaaaaa";
        String ald2= "bigarren belaunaldia";
        System.out.println("1.Programa informatikoan 6 puntu desberdin daude: ");
        System.out.print("1.puntua");
        System.out.print("\n");
        System.out.print("2.puntua");
        System.out.print("\n");
        System.out.println(ald1+" makina kodea erabiltzen zuen, alegia 0 eta 1ak.");
        System.out.println(ald2+" assembly deritzogu eta agindu ulergarriagoak erabiltzen ditu aurreko belaunaldia baino, hal ere konplexuak");
        

        String ald= "kodea";
        System.out.println("Kode motak zerrendatuta: ");
        for (int i=1; i<4; i++){
        System.out.println(i+ ald);
        }
        System.out.println("1.kodea iturburu kodea deritzogu eta .java da kasu honetan");
        System.out.println("2.kodea kode objektua deritzogu eta .class fitxategia da");
        System.out.println("3.kodea kode bitarra da exekutagarria bihutzen duena da .jar bat izan daiteke edo zuenzen JVM exekutatu dezkaeen kodea da");

                
    }
    public String says(){
        return "Hello";
    }

    }
