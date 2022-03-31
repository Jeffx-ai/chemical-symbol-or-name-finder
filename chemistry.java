 
import java.util.*;
public class ElementsAndTheirSymbols{
    public static void main(String[]args){
        HashMap<String,String>ymtm=new HashMap <>();
        //adding keys and values
        ymtm.put("Actinum","Ac");
        ymtm.put("Aluminum","Al");
        ymtm.put("Americium","Am");
        ymtm.put("Antimony","Sb");
        ymtm.put("Argon","Ar");
        ymtm.put("Arsenic","As");
        ymtm.put("Astatine","At");
        ymtm.put("Barium","Ba");
        ymtm.put("Berkelium","Bk");
        ymtm.put("Beryllium","Be");
        ymtm.put("Bismuth","Bi");
        ymtm.put("Bohrium","Bh");
        ymtm.put("Boron","B");
        ymtm.put("Bromine","Br");
        ymtm.put("Cadmium","Cd");
        ymtm.put("Calcium","Ca");
        ymtm.put("Californium","Cf");
        ymtm.put("Carbon","C");
        ymtm.put("Cerium","Ce");
        ymtm.put("Cesium","Cs");
        ymtm.put("Clorine","Cl");
        ymtm.put("Chromium","Cr");
        ymtm.put("Cobalt","Co");
        ymtm.put("Copper","Cu");
        ymtm.put("Curium","Cm");
        ymtm.put("Darmstadtium","Ds");
        ymtm.put("Dubnium","Db");
        ymtm.put("Dysprosium","Dy");
        ymtm.put("Einsteinium","Es");
        ymtm.put("Erbium","Er");
        ymtm.put("Europium","Eu");
        ymtm.put("Fermium","Fm");
        ymtm.put("Fluorine","F");
        ymtm.put("Fracium","Fr");
        ymtm.put("Gadolinium","Gd");
        ymtm.put("Gallium","Ga");
        ymtm.put("Germanium","Ge");
        ymtm.put("Gold","Au");
        ymtm.put("Hafnium","Hf");
        ymtm.put("Hassium","Hs");
        ymtm.put("Helium","He");
        ymtm.put("Holmium","Ho");
        ymtm.put("Hydrogen","H");
        ymtm.put("Indium","In");
        ymtm.put("Iodine","I");
        ymtm.put("Iridium","Ir");
        ymtm.put("Iron","Fe");
        ymtm.put("Krypton","Kr");
        ymtm.put("Lanthanum","La");
        ymtm.put("Lawrencium","Lr");
        ymtm.put("Lead","Pb");
        ymtm.put("Lithium","Li");
        ymtm.put("Lutetium","Lu");
        ymtm.put("Magnesium","Mg");
        ymtm.put("Manganese","Mn");
        ymtm.put("Meitnerium","Mt");
        ymtm.put("Mendelevium","Md");
        ymtm.put("Mercury","Hg");
        ymtm.put("Molybdenum","Mo");
        ymtm.put("Neodymium","Nd");
        ymtm.put("Neon","Ne");
        ymtm.put("Neptunium","Np");
        ymtm.put("Nickel","Ni");
        ymtm.put("Niobium","Nb");
        ymtm.put("Nitrogen","N");
        ymtm.put("Nobelium","No");
        ymtm.put("Osmium","Os");
        ymtm.put("Oxygen","O");
        ymtm.put("Palladium","Pd");
        ymtm.put("Phosphorus","P");
        ymtm.put("Platinum","Pt");
        ymtm.put("Plutonium","Pu");
        ymtm.put("Polonium","Po");
        ymtm.put("Potassium","K");
        ymtm.put("Praseodymium","Pr");
        ymtm.put("Promethium","Pm");
        ymtm.put("Protactinium","Pa");
        ymtm.put("Radium","Ra");
        ymtm.put("Radon","Rn");
        ymtm.put("Rhenium","Re");
        ymtm.put("Rhodium","Rh");
        ymtm.put("Roentgenium","Rg");
        ymtm.put("Rubidium","Rb");
        ymtm.put("Ruthenium","Ru");
        ymtm.put("Rutherfordium","Rf");
        ymtm.put("Samarium","Sm");
        ymtm.put("Scandium","Sc");
        ymtm.put("Seaborgium","Sg");
        ymtm.put("Selenium","Se");
        ymtm.put("Silicon","Si");
        ymtm.put("Silver","Ag");
        ymtm.put("Sodium","Na");
        ymtm.put("Strontium","Sr");
        ymtm.put("Sulfur","S");
        ymtm.put("Tantalum","Ta");
        ymtm.put("Technetium","Tc");
        ymtm.put("Tellurium","Te");
        ymtm.put("Turbium","Tb");
        ymtm.put("Thallium","Tl");
        ymtm.put("Thorium","Th");
        ymtm.put("Tin","Sn");
        ymtm.put("Titanium","Ti");
        ymtm.put("Tungsten","W");
        ymtm.put("Ununbium","Uub");
        ymtm.put("Ununhexium","Uuh");
        ymtm.put("Ununoctium","Uuo");
        ymtm.put("Ununpentium","Uup");
        ymtm.put("Ununquadium","Uuq");
        ymtm.put("Ununseptium","Uus");
        ymtm.put("Ununtrium","Uut");
        ymtm.put("Ununium","Uuu");
        ymtm.put("Uranium","U");
        ymtm.put("Vanadium","V");
        ymtm.put("Xenon","Xe");
        ymtm.put("Ytterbium","Yb");
        ymtm.put("Yttrium","Y");
        ymtm.put("Zinc","Zn");
        ymtm.put("Zirconium","Zr");
        System.out.print("Enter element or symbol: ");
        Scanner input=new Scanner(System.in);
        try{
        String name=input.nextLine();
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();//make first letter to UpperCase and the rest to lowercase
        System.out.print("__________________________________________________\n");
        //if user entered key(element name)
            if(ymtm.containsKey(name)){
            System.out.println("Element : "+name+"\nSymbol  : "+ymtm.get(name));
            }
        //else if user entered value(symbol)
        else if(ymtm.containsValue(name)){
            for(String key:ymtm.keySet())
            {
                if(ymtm.get(key).equals(name))
                {
                    System.out.println("Element : "+key+"\nSymbol  : "+name);
                }
            }
        }
        else{
            System.out.println(name+" isn't a chemical element :)");
        }
        System.out.println("___________________________________________________________________\n");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("\nPlease enter something :)");
        }
        
        
    }
}