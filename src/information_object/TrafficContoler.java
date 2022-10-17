package information_object;

public class TrafficContoler implements InformationObject {

    private String name;
    private String surname;
    private String typeOfTrafficControler; //np policjant, straznik miejski etc

    TrafficContoler(String n, String s, String t){
        setName(n);
        setSurname(s);
        setTypeOfTrafficControler(t);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setTypeOfTrafficControler(String typeOfTrafficControler){
        this.typeOfTrafficControler = typeOfTrafficControler;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getTypeOfTrafficControler(){
        return getTypeOfTrafficControler();
    }
    public void snarl(){ //wstrzymuje ruch uliczny

    }

    public void resume(){  //wznawia ruch uliczny

    }

    public void warn(){ //ostrzega przed zmianą pierwszeństwa

    }

    public void moveSigh(){

    }

    public void removeSign(){

    }
}
